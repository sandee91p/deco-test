# Keep source file and line number information for better crash reports
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Keep specific app classes
#-keep class com.redx.control.MainActivity { *; }
-keep class com.redx.control.DebugActivity { *; }
#-keep class org.loader { *; }
#-keep class org.App { *; }
#-keep class org.pubgm.Service.MainService { *; }
-keep class org.pubgm.unative.RedXNative { *; }
#-keep class com.redx.utils.** { *; }

# Keep AsyncTask classes
-keep class * extends android.os.AsyncTask { *; }

# Keep Android framework classes (optimized)
-keep class android.app.** { *; }
-keep class android.content.** { *; }
-keep class android.graphics.** { *; }
-keep class android.os.** { *; }
-keep class android.view.** { *; }
-keep class android.widget.** { *; }
-dontwarn android.**

# Keep minimum androidx classes
-keep class androidx.core.app.ActivityCompat { *; }
-keep class androidx.core.content.ContextCompat { *; }
-keep class androidx.annotation.Keep { *; }
-dontwarn androidx.**

# Keep Context related classes
-keep class **.R
-keep class **.R$* {
    <fields>;
}

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep custom View constructors
-keepclasseswithmembers class * {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# Keep Serializable/Parcelable classes
-keepnames class * implements java.io.Serializable
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# Keep Enum classes
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Keep Activity methods
-keepclassmembers class * extends android.app.Activity {
    public protected *;
}

# Keep View implementations
-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
    public void set*(...);
}

# Keep JavaScript interface methods
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

# Keep annotations
-keep class androidx.annotation.Keep
-keep @androidx.annotation.Keep class * {*;}
-keepclasseswithmembers class * {
    @androidx.annotation.Keep <methods>;
}
-keepclasseswithmembers class * {
    @androidx.annotation.Keep <fields>;
}
-keepclasseswithmembers class * {
    @androidx.annotation.Keep <init>(...);
}

# Keep MetaCore components
-keep class net_62v.external.** { *; }

# Keep specific error classes
-keep class s1.** { *; }
-keep class u1.** { *; }
-keep class o0.** { *; }

# Ensure Context access
-keepclassmembers class * {
    android.content.Context *;
}

# Optimization settings
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*
-optimizationpasses 5
-allowaccessmodification

# Remove debug logs
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
}

# Keep required interfaces
-keep interface * {
    <methods>;
}
