package androidx.activity;

import p010b.p011a.C0058h;
import p010b.p011a.C0059i;
import p010b.p011a.InterfaceC0051a;
import p010b.p067m.p068d.C0745t0;
import p010b.p072o.AbstractC0779h;
import p010b.p072o.C0784m;
import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;

/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0780i, InterfaceC0051a {

    /* renamed from: a */
    public final AbstractC0779h f125a;

    /* renamed from: b */
    public final C0745t0 f126b;

    /* renamed from: c */
    public InterfaceC0051a f127c;

    /* renamed from: d */
    public final /* synthetic */ C0059i f128d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0059i c0059i, AbstractC0779h abstractC0779h, C0745t0 c0745t0) {
        this.f128d = c0059i;
        this.f125a = abstractC0779h;
        this.f126b = c0745t0;
        abstractC0779h.mo1824a(this);
    }

    @Override // p010b.p011a.InterfaceC0051a
    public void cancel() {
        C0784m c0784m = (C0784m) this.f125a;
        c0784m.m1822c("removeObserver");
        c0784m.f3282a.mo2686e(this);
        this.f126b.f3134b.remove(this);
        InterfaceC0051a interfaceC0051a = this.f127c;
        if (interfaceC0051a != null) {
            interfaceC0051a.cancel();
            this.f127c = null;
        }
    }

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        if (enumC0777f == EnumC0777f.ON_START) {
            C0059i c0059i = this.f128d;
            C0745t0 c0745t0 = this.f126b;
            c0059i.f856b.add(c0745t0);
            C0058h c0058h = new C0058h(c0059i, c0745t0);
            c0745t0.f3134b.add(c0058h);
            this.f127c = c0058h;
        } else if (enumC0777f != EnumC0777f.ON_STOP) {
            if (enumC0777f == EnumC0777f.ON_DESTROY) {
                cancel();
            }
        } else {
            InterfaceC0051a interfaceC0051a = this.f127c;
            if (interfaceC0051a != null) {
                interfaceC0051a.cancel();
            }
        }
    }
}