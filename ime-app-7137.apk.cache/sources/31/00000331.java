package p010b.p067m.p068d;

import android.view.View;
import p010b.p046j.p054h.InterfaceC0528a;

/* renamed from: b.m.d.e0 */
/* loaded from: classes.dex */
public class C0685e0 implements InterfaceC0528a {

    /* renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f2948a;

    public C0685e0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        this.f2948a = abstractComponentCallbacksC0763z;
    }

    @Override // p010b.p046j.p054h.InterfaceC0528a
    /* renamed from: a */
    public void mo1968a() {
        if (this.f2948a.m1870i() != null) {
            View m1870i = this.f2948a.m1870i();
            this.f2948a.m1907D0(null);
            m1870i.clearAnimation();
        }
        this.f2948a.m1903F0(null);
    }
}