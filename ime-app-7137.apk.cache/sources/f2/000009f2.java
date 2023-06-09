package p210g.p211a.p212a;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import java.util.Arrays;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p210g.p211a.p212a.p213l.AbstractC2317e;
import p210g.p211a.p212a.p213l.C2316d;
import p210g.p211a.p212a.p213l.C2318f;

/* renamed from: g.a.a.h */
/* loaded from: classes.dex */
public class DialogInterface$OnClickListenerC2309h implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public Object f7459b;

    /* renamed from: c */
    public C2310i f7460c;

    /* renamed from: d */
    public InterfaceC2304c f7461d;

    /* renamed from: e */
    public InterfaceC2305d f7462e;

    public DialogInterface$OnClickListenerC2309h(DialogFragmentC2311j dialogFragmentC2311j, C2310i c2310i, InterfaceC2304c interfaceC2304c, InterfaceC2305d interfaceC2305d) {
        this.f7459b = dialogFragmentC2311j.getActivity();
        this.f7460c = c2310i;
        this.f7461d = null;
        this.f7462e = null;
    }

    public DialogInterface$OnClickListenerC2309h(C2312k c2312k, C2310i c2310i, InterfaceC2304c interfaceC2304c, InterfaceC2305d interfaceC2305d) {
        Object obj = c2312k.f3251x;
        this.f7459b = obj == null ? c2312k.m1872h() : obj;
        this.f7460c = c2310i;
        this.f7461d = null;
        this.f7462e = null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        C2310i c2310i = this.f7460c;
        int i2 = c2310i.f7466d;
        if (i != -1) {
            InterfaceC2305d interfaceC2305d = this.f7462e;
            if (interfaceC2305d != null) {
                interfaceC2305d.m17b(i2);
            }
            InterfaceC2304c interfaceC2304c = this.f7461d;
            if (interfaceC2304c != null) {
                C2310i c2310i2 = this.f7460c;
                interfaceC2304c.m19c(c2310i2.f7466d, Arrays.asList(c2310i2.f7468f));
                return;
            }
            return;
        }
        String[] strArr = c2310i.f7468f;
        InterfaceC2305d interfaceC2305d2 = this.f7462e;
        if (interfaceC2305d2 != null) {
            interfaceC2305d2.m18a(i2);
        }
        Object obj = this.f7459b;
        if (obj instanceof AbstractComponentCallbacksC0763z) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) obj;
            (Build.VERSION.SDK_INT < 23 ? new C2316d(abstractComponentCallbacksC0763z) : new C2318f(abstractComponentCallbacksC0763z)).mo10a(i2, strArr);
        } else if (!(obj instanceof Activity)) {
            throw new RuntimeException("Host must be an Activity or Fragment!");
        } else {
            AbstractC2317e.m12c((Activity) obj).mo10a(i2, strArr);
        }
    }
}