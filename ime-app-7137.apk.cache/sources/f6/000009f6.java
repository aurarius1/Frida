package p210g.p211a.p212a.p213l;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import p010b.p046j.p047d.AbstractC0472e;
import p210g.p211a.p212a.DialogFragmentC2311j;

/* renamed from: g.a.a.l.a */
/* loaded from: classes.dex */
public class C2313a extends AbstractC2317e {
    public C2313a(Activity activity) {
        super(activity);
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: a */
    public void mo10a(int i, String... strArr) {
        AbstractC0472e.m2429d((Activity) this.f7470a, strArr, i);
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: b */
    public Context mo9b() {
        return (Context) this.f7470a;
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: d */
    public boolean mo8d(String str) {
        return AbstractC0472e.m2428e((Activity) this.f7470a, str);
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: e */
    public void mo11e(String str, String str2, String str3, int i, int i2, String... strArr) {
        FragmentManager fragmentManager = ((Activity) this.f7470a).getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof DialogFragmentC2311j) {
            return;
        }
        DialogFragmentC2311j dialogFragmentC2311j = new DialogFragmentC2311j();
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", str2);
        bundle.putString("negativeButton", str3);
        bundle.putString("rationaleMsg", str);
        bundle.putInt("theme", i);
        bundle.putInt("requestCode", i2);
        bundle.putStringArray("permissions", strArr);
        dialogFragmentC2311j.setArguments(bundle);
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !dialogFragmentC2311j.f7469b) {
            dialogFragmentC2311j.show(fragmentManager, "RationaleDialogFragment");
        }
    }
}