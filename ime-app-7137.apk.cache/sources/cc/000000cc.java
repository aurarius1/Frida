package p010b.p011a.p013l.p014h;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import p010b.p036g.C0378b;
import p010b.p046j.p047d.AbstractC0472e;

/* renamed from: b.a.l.h.c */
/* loaded from: classes.dex */
public final class C0072c extends AbstractC0071b {
    @Override // p010b.p011a.p013l.p014h.AbstractC0071b
    /* renamed from: a */
    public Intent mo2109a(Context context, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    @Override // p010b.p011a.p013l.p014h.AbstractC0071b
    /* renamed from: b */
    public C0070a mo3086b(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return new C0070a(Collections.emptyMap());
        }
        C0378b c0378b = new C0378b();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = AbstractC0472e.m2432a(context, str) == 0;
            c0378b.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new C0070a(c0378b);
        }
        return null;
    }

    @Override // p010b.p011a.p013l.p014h.AbstractC0071b
    /* renamed from: c */
    public Object mo2108c(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                HashMap hashMap = new HashMap();
                int length = stringArrayExtra.length;
                for (int i2 = 0; i2 < length; i2++) {
                    hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
                }
                return hashMap;
            }
        }
        return Collections.emptyMap();
    }
}