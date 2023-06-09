package p210g.p211a.p212a.p213l;

import android.os.Bundle;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.C0690f1;
import p210g.p211a.p212a.C2312k;

/* renamed from: g.a.a.l.c */
/* loaded from: classes.dex */
public abstract class AbstractC2315c extends AbstractC2317e {
    public AbstractC2315c(Object obj) {
        super(obj);
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: e */
    public void mo11e(String str, String str2, String str3, int i, int i2, String... strArr) {
        C0690f1 mo7f = mo7f();
        if (mo7f.m2086K("RationaleDialogFragmentCompat") instanceof C2312k) {
            return;
        }
        C2312k c2312k = new C2312k();
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", str2);
        bundle.putString("negativeButton", str3);
        bundle.putString("rationaleMsg", str);
        bundle.putInt("theme", i);
        bundle.putInt("requestCode", i2);
        bundle.putStringArray("permissions", strArr);
        c2312k.m1901G0(bundle);
        if (mo7f.m2074W()) {
            return;
        }
        c2312k.f3171j0 = false;
        c2312k.f3172k0 = true;
        C0668a c0668a = new C0668a(mo7f);
        c0668a.m2116h(0, c2312k, "RationaleDialogFragmentCompat", 1);
        c0668a.m2119e();
    }

    /* renamed from: f */
    public abstract C0690f1 mo7f();
}