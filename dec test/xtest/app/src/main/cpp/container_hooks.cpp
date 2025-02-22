#include <jni.h>
#include <string>
#include <dlfcn.h>
#include <dobby.h>
#include <android/log.h>
#include <fcntl.h>
#include <unistd.h>

#define LOG_TAG "ContainerNative"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)

// Original function pointers
static void* (*orig_dlopen)(const char*, int);
static int (*orig_open)(const char*, int, ...);
static FILE* (*orig_fopen)(const char*, const char*);
static pid_t (*orig_fork)(void);

// Current package name cache
static char current_package[128] = {0};

extern "C" JNIEXPORT void JNICALL
Java_com_container_system_core_NativeHookManager_installHooks(
    JNIEnv* env,
    jobject thiz,
    jobject context
) {
    // Get package name from context
    jclass context_class = env->GetObjectClass(context);
    jmethodID get_pkg = env->GetMethodID(context_class, "getPackageName", "()Ljava/lang/String;");
    jstring jstr = (jstring)env->CallObjectMethod(context, get_pkg);
    const char* pkg = env->GetStringUTFChars(jstr, 0);
    strncpy(current_package, pkg, sizeof(current_package)-1);
    env->ReleaseStringUTFChars(jstr, pkg);

    // Install hooks
    DobbyHook((void*)dlopen, (void*)custom_dlopen, (void**)&orig_dlopen);
    DobbyHook((void*)open, (void*)custom_open, (void**)&orig_open);
    DobbyHook((void*)fopen, (void*)custom_fopen, (void**)&orig_fopen);
    DobbyHook((void*)fork, (void*)custom_fork, (void**)&orig_fork);
    
    LOGD("Native hooks installed for package: %s", current_package);
}

void* custom_dlopen(const char* filename, int flags) {
    if(strstr(filename, ".so")) {
        char new_path[PATH_MAX];
        snprintf(new_path, sizeof(new_path),
            "/data/data/%s/virtual/%s/lib/%s",
            current_package,
            get_process_name(),
            basename(filename));
        
        LOGD("Redirected dlopen: %s -> %s", filename, new_path);
        return orig_dlopen(new_path, flags);
    }
    return orig_dlopen(filename, flags);
}

int custom_open(const char* pathname, int flags, ...) {
    char new_path[PATH_MAX];
    va_list args;
    va_start(args, flags);
    mode_t mode = va_arg(args, mode_t);
    
    if(should_redirect(pathname)) {
        snprintf(new_path, sizeof(new_path),
            "/data/data/%s/virtual/%s%s",
            current_package,
            get_process_name(),
            pathname);
        
        LOGD("Redirected open: %s -> %s", pathname, new_path);
        return orig_open(new_path, flags, mode);
    }
    return orig_open(pathname, flags, mode);
}

// Helper functions
const char* get_process_name() {
    static char name[128];
    FILE* cmdline = fopen("/proc/self/cmdline", "r");
    fgets(name, sizeof(name), cmdline);
    fclose(cmdline);
    return name;
}

int should_redirect(const char* path) {
    return strstr(path, "/data/data/") || 
           strstr(path, "/sdcard/Android/data/");
}