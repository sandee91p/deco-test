package lu.die.foza.SleepyFox;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@RequiresApi(26)
@SourceDebugExtension({"SMAP\nFozaDatabaseUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDatabaseUtils.kt\nlu/die/foza/HookEntity/SampleHookEntity/AppHooker/FozaDatabaseUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,520:1\n1#2:521\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࢫ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢫ.class */
public final class C0291 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0291 f697 = new C0291();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m1763(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String str, @Nullable Object[] objArr) throws SQLException {
        ?? r0 = sQLiteDatabase;
        Trace.beginSection("executeUpdateDelete");
        SQLiteStatement compileStatement = r0.compileStatement(str);
        f697.m1773(compileStatement, objArr);
        r0 = compileStatement.executeUpdateDelete();
        CloseableKt.closeFinally(compileStatement, (Throwable) null);
        Trace.endSection();
        return r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
        r7.bindLong(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L18;
     */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1773(android.database.sqlite.SQLiteStatement r7, java.lang.Object[] r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0291.m1773(android.database.sqlite.SQLiteStatement, java.lang.Object[]):void");
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String m1755(@Nullable String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        char c = 0;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\'' || charAt == '\"') {
                if (c == 0) {
                    c = charAt;
                } else if (c == charAt) {
                    c = 0;
                }
            }
            if (c == 0) {
                if (charAt == '(') {
                    i++;
                } else if (charAt == ')') {
                    i--;
                }
            }
        }
        while (i > 0) {
            str = str + ')';
            i--;
        }
        while (i < 0) {
            str = "(" + str;
            i++;
        }
        return str;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m1764(@NotNull Object... objArr) {
        StringBuilder sb = new StringBuilder("(");
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i;
            sb.append('?');
            if (i2 < objArr.length - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        String m1752 = m1752(sb.toString(), Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNull(m1752);
        return m1752;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
        if ((r1 instanceof java.lang.Boolean) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
        r0.append('\'');
        r0.append(kotlin.text.StringsKt.replace$default(java.lang.String.valueOf(r1), "'", "''", false, 4, (java.lang.Object) null));
        r0.append('\'');
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0115, code lost:
        r0.append(((java.lang.Boolean) r1).booleanValue() ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
        if ((r1 instanceof java.lang.Boolean) != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103 A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m1752(@org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.Object... r11) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0291.m1752(java.lang.String, java.lang.Object[]):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @androidx.annotation.RequiresApi(30)
    /* renamed from: Ԩ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1759(@org.jetbrains.annotations.NotNull android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = r8
            java.lang.String r1 = "android:query-arg-sql-sort-order"
            java.lang.String r0 = r0.getString(r1)
            r1 = r0
            r7 = r1
            r1 = r8
            java.lang.String r2 = "android:query-arg-sql-limit"
            java.lang.String r1 = r1.getString(r2)
            r9 = r1
            if (r0 == 0) goto L33
            r0 = r7
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r1 = r0
            r2 = r1
            r10 = r2
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            if (r0 == 0) goto L33
            r0 = r10
            java.lang.String r1 = " LIMIT "
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3, r4, r5)
            r10 = r0
            goto L35
        L33:
            r0 = -1
            r10 = r0
        L35:
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L9e
            r0 = r9
            r1 = r7
            r2 = r10
            r3 = r7
            r4 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r4 = 0
            r5 = r10
            java.lang.String r3 = r3.substring(r4, r5)
            r4 = r3
            r7 = r4
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r3 = 7
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)
            r2 = r1
            r10 = r2
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L72
            r0 = r8
            r1 = r0
            java.lang.String r2 = "android:query-arg-sql-sort-order"
            r3 = r7
            r1.putString(r2, r3)
            java.lang.String r1 = "android:query-arg-sql-limit"
            r2 = r10
            r0.putString(r1, r2)
            goto L9e
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r10
            r3 = r1; r1 = r2; r2 = r3; 
            java.lang.String r3 = "Abusive '"
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "' conflicts with requested '"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0291.m1759(android.os.Bundle):void");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1754(@NotNull String str, @NotNull Cursor cursor, @NotNull ContentValues contentValues) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            if (cursor.isNull(columnIndex)) {
                contentValues.putNull(str);
            } else {
                contentValues.put(str, cursor.getString(columnIndex));
            }
        }
    }

    @RequiresApi(api = 30)
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1772(Bundle bundle, Consumer<String> consumer) {
        int i = bundle.getInt("android:query-arg-limit", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE) {
            consumer.accept("android:query-arg-sql-limit");
            return;
        }
        String valueOf = String.valueOf(i);
        consumer.accept("android:query-arg-limit");
        int i2 = bundle.getInt("android:query-arg-offset", Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE) {
            valueOf = valueOf + " OFFSET " + i2;
            consumer.accept("android:query-arg-offset");
        }
        bundle.putString("android:query-arg-sql-limit", valueOf);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Bundle m1760(@Nullable String str, @Nullable String[] strArr, @Nullable String str2) {
        if (str == null && strArr == null && str2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("android:query-arg-sql-selection", str);
        }
        if (strArr != null) {
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
        }
        if (str2 != null) {
            bundle.putString("android:query-arg-sql-sort-order", str2);
        }
        return bundle;
    }

    @RequiresApi(api = 30)
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1771(Bundle bundle, Consumer<String> consumer, Function<String, String> function) {
        String[] stringArray = bundle.getStringArray("android:query-arg-sort-columns");
        if (stringArray == null || stringArray.length == 0) {
            consumer.accept("android:query-arg-sql-sort-order");
            return;
        }
        String join = TextUtils.join(", ", stringArray);
        consumer.accept("android:query-arg-sort-columns");
        if (bundle.containsKey("android:query-arg-sort-locale")) {
            join = join + " COLLATE " + function.apply(bundle.getString("android:query-arg-sort-locale"));
            consumer.accept("android:query-arg-sort-locale");
        } else {
            int i = bundle.getInt("android:query-arg-sort-collation", 3);
            if (i == 0 || i == 1) {
                join = join + " COLLATE NOCASE";
                consumer.accept("android:query-arg-sort-collation");
            } else if (i == 3) {
                consumer.accept("android:query-arg-sort-collation");
            }
        }
        int i2 = bundle.getInt("android:query-arg-sort-direction", Integer.MIN_VALUE);
        if (i2 == 0) {
            join = join + " ASC";
            consumer.accept("android:query-arg-sort-direction");
        } else if (i2 == 1) {
            join = join + " DESC";
            consumer.accept("android:query-arg-sort-direction");
        }
        bundle.putString("android:query-arg-sql-sort-order", join);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m1765(@NotNull String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '%' || charAt == '_') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final long m1762(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String str, @Nullable Object[] objArr) throws SQLException {
        ?? r0 = sQLiteDatabase;
        Trace.beginSection("executeInsert");
        SQLiteStatement compileStatement = r0.compileStatement(str);
        f697.m1773(compileStatement, objArr);
        r0 = compileStatement.executeInsert();
        CloseableKt.closeFinally(compileStatement, (Throwable) null);
        Trace.endSection();
        return r0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1768(@NotNull ContentValues contentValues, @NotNull String str, boolean z) {
        return m1766(contentValues.get(str), z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1767(@NotNull Bundle bundle, @NotNull String str, boolean z) {
        return m1766(bundle.get(str), z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final long m1769(@NotNull ContentValues contentValues, @NotNull String str, long j) {
        Long asLong = contentValues.getAsLong(str);
        if (asLong != null) {
            j = asLong.longValue();
        }
        return j;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m1753(@Nullable Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return obj instanceof Number ? 1 : 3;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0154<String, Object> m1761(@NotNull ContentValues contentValues) {
        C0154<String, Object> c0154 = new C0154<>();
        for (String str : contentValues.keySet()) {
            c0154.put(str, contentValues.get(str));
        }
        return c0154;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (((java.lang.Number) r4).intValue() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("0", r0) == false) goto L11;
     */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1766(@org.jetbrains.annotations.Nullable java.lang.Object r4, boolean r5) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L12
            r0 = r4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = r0
            goto L5d
        L12:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L2d
            r0 = r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L28
        L23:
            r0 = 1
            r5 = r0
            goto L5d
        L28:
            r0 = 0
            r5 = r0
            goto L5d
        L2d:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L5d
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r1 = r0
            r3 = r1
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = "false"
            r1 = r3
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L28
            java.lang.String r0 = "0"
            r1 = r3
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L28
            goto L23
        L5d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0291.m1766(java.lang.Object, boolean):boolean");
    }

    @RequiresApi(30)
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1757(@NotNull Uri uri, @NotNull Bundle bundle) {
        String string = bundle.getString("android:query-arg-sql-limit");
        String queryParameter = uri.getQueryParameter("limit");
        if (!TextUtils.isEmpty(queryParameter)) {
            if (!TextUtils.isEmpty(string)) {
                throw new IllegalArgumentException(("Abusive '" + queryParameter + "' conflicts with requested '" + string + '\'').toString());
            }
            bundle.putString("android:query-arg-sql-limit", queryParameter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    @androidx.annotation.RequiresApi(30)
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1758(@org.jetbrains.annotations.NotNull android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = r10
            java.lang.String r1 = "android:query-arg-sql-selection"
            java.lang.String r0 = r0.getString(r1)
            r1 = r0
            r11 = r1
            r1 = r10
            java.lang.String r2 = "android:query-arg-sql-group-by"
            java.lang.String r1 = r1.getString(r2)
            r12 = r1
            if (r0 == 0) goto L36
            r0 = r11
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r1 = r0
            r2 = r1
            r13 = r2
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            if (r0 == 0) goto L36
            r0 = r13
            java.lang.String r1 = " GROUP BY "
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3, r4, r5)
            r13 = r0
            goto L39
        L36:
            r0 = -1
            r13 = r0
        L39:
            r0 = r13
            r1 = -1
            if (r0 == r1) goto Lb1
            r0 = r12
            r1 = r9
            r2 = r1
            r3 = r11
            r4 = r13
            r5 = r11
            r6 = r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r6 = 0
            r7 = r13
            java.lang.String r5 = r5.substring(r6, r7)
            r6 = r5
            r9 = r6
            java.lang.String r6 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r5 = 10
            int r4 = r4 + r5
            java.lang.String r3 = r3.substring(r4)
            r11 = r3
            r3 = r9
            r4 = r11
            java.lang.String r5 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r2 = r2.m1755(r3)
            r9 = r2
            r2 = r11
            java.lang.String r1 = r1.m1755(r2)
            r11 = r1
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L85
            r0 = r10
            r1 = r0
            java.lang.String r2 = "android:query-arg-sql-selection"
            r3 = r9
            r1.putString(r2, r3)
            java.lang.String r1 = "android:query-arg-sql-group-by"
            r2 = r11
            r0.putString(r1, r2)
            goto Lb1
        L85:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r11
            r3 = r1; r1 = r2; r2 = r3; 
            java.lang.String r3 = "Abusive '"
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "' conflicts with requested '"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r9
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0291.m1758(android.os.Bundle):void");
    }

    @RequiresApi(30)
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1770(Bundle bundle, Consumer<String> consumer) {
        String[] stringArray = bundle.getStringArray("android:query-arg-group-columns");
        if (stringArray != null) {
            if (!(stringArray.length == 0)) {
                String join = TextUtils.join(", ", stringArray);
                consumer.accept("android:query-arg-group-columns");
                bundle.putString("android:query-arg-sql-group-by", join);
                return;
            }
        }
        consumer.accept("android:query-arg-sql-group-by");
    }

    @RequiresApi(30)
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1756(@NotNull Bundle bundle, @NotNull Consumer<String> consumer, @NotNull Function<String, String> function) {
        consumer.accept("android:query-arg-sql-selection");
        consumer.accept("android:query-arg-sql-selection-args");
        m1770(bundle, consumer);
        m1771(bundle, consumer, function);
        m1772(bundle, consumer);
    }
}
