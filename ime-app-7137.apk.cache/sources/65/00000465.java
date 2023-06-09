package p010b.p083u.p084e;

import android.view.View;

/* renamed from: b.u.e.t2 */
/* loaded from: classes.dex */
public class C0993t2 {

    /* renamed from: a */
    public final InterfaceC0989s2 f3855a;

    /* renamed from: b */
    public C0985r2 f3856b = new C0985r2();

    public C0993t2(InterfaceC0989s2 interfaceC0989s2) {
        this.f3855a = interfaceC0989s2;
    }

    /* renamed from: a */
    public View m1453a(int i, int i2, int i3, int i4) {
        int mo1466c = this.f3855a.mo1466c();
        int mo1467b = this.f3855a.mo1467b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo1468a = this.f3855a.mo1468a(i);
            int mo1464e = this.f3855a.mo1464e(mo1468a);
            int mo1465d = this.f3855a.mo1465d(mo1468a);
            C0985r2 c0985r2 = this.f3856b;
            c0985r2.f3818b = mo1466c;
            c0985r2.f3819c = mo1467b;
            c0985r2.f3820d = mo1464e;
            c0985r2.f3821e = mo1465d;
            if (i3 != 0) {
                c0985r2.f3817a = 0;
                c0985r2.f3817a = i3 | 0;
                if (c0985r2.m1470a()) {
                    return mo1468a;
                }
            }
            if (i4 != 0) {
                C0985r2 c0985r22 = this.f3856b;
                c0985r22.f3817a = 0;
                c0985r22.f3817a = i4 | 0;
                if (c0985r22.m1470a()) {
                    view = mo1468a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m1452b(View view, int i) {
        C0985r2 c0985r2 = this.f3856b;
        int mo1466c = this.f3855a.mo1466c();
        int mo1467b = this.f3855a.mo1467b();
        int mo1464e = this.f3855a.mo1464e(view);
        int mo1465d = this.f3855a.mo1465d(view);
        c0985r2.f3818b = mo1466c;
        c0985r2.f3819c = mo1467b;
        c0985r2.f3820d = mo1464e;
        c0985r2.f3821e = mo1465d;
        if (i != 0) {
            C0985r2 c0985r22 = this.f3856b;
            c0985r22.f3817a = 0;
            c0985r22.f3817a = 0 | i;
            return c0985r22.m1470a();
        }
        return false;
    }
}