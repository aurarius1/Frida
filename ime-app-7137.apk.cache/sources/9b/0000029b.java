package p010b.p046j.p055i;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.i.e */
/* loaded from: classes.dex */
public abstract class AbstractC0535e {

    /* renamed from: a */
    public static final Comparator f2590a = new C0534d();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[LOOP:1: B:15:0x004b->B:30:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0094 A[EDGE_INSN: B:84:0x0094->B:32:0x0094 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0543m m2345a(Context context, C0536f c0536f, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Cursor query;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c0536f.f2591a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c0536f.f2592b)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, f2590a);
                List list = c0536f.f2594d;
                if (list == null) {
                    list = AbstractC0022t.m3510X(resources, 0);
                }
                int i = 0;
                while (true) {
                    cursor = null;
                    if (i >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, f2590a);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            }
                        }
                        z = true;
                        if (!z) {
                            break;
                        }
                        i++;
                    }
                    z = false;
                    if (!z) {
                    }
                }
                if (resolveContentProvider == null) {
                    return new C0543m(1, null);
                }
                String str2 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str2).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
                try {
                    String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                    if (Build.VERSION.SDK_INT > 16) {
                        query = context.getContentResolver().query(build, strArr, "query = ?", new String[]{c0536f.f2593c}, null, null);
                    } else {
                        query = context.getContentResolver().query(build, strArr, "query = ?", new String[]{c0536f.f2593c}, null);
                    }
                    cursor = query;
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            arrayList3.add(new C0544n(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                        }
                    }
                    return new C0543m(0, (C0544n[]) arrayList3.toArray(new C0544n[0]));
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + c0536f.f2592b);
        }
        throw new PackageManager.NameNotFoundException(AbstractC1124a.m1190f("No package found for authority: ", str));
    }
}