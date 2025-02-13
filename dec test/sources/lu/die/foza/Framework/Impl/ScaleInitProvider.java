package lu.die.foza.Framework.Impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import lu.die.foza.SleepyFox.C0019;
import lu.die.foza.SleepyFox.C0229;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016JO\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0019H\u0016J1\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"Llu/die/foza/Framework/Impl/ScaleInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "onCreate", C0019.f56, "call", "Landroid/os/Bundle;", "method", C0019.f56, "arg", "extras", "authority", "query", "Landroid/database/Cursor;", "p0", "Landroid/net/Uri;", "p1", C0019.f56, "p2", "p3", "p4", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", "Landroid/content/ContentValues;", "delete", C0019.f56, "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/Framework/Impl/ScaleInitProvider.class */
public final class ScaleInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return C0229.f441.m1299();
    }

    @Override // android.content.ContentProvider
    @NotNull
    public Bundle call(@NotNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        C0229.f441.getClass();
        return C0229.f442;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    @NotNull
    public String getType(@NotNull Uri uri) {
        return C0019.f56;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @NotNull
    public Bundle call(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        C0229.f441.getClass();
        return C0229.f442;
    }
}
