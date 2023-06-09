package p010b.p011a;

import p010b.p067m.p068d.C0745t0;

/* renamed from: b.a.h */
/* loaded from: classes.dex */
public class C0058h implements InterfaceC0051a {

    /* renamed from: a */
    public final C0745t0 f853a;

    /* renamed from: b */
    public final /* synthetic */ C0059i f854b;

    public C0058h(C0059i c0059i, C0745t0 c0745t0) {
        this.f854b = c0059i;
        this.f853a = c0745t0;
    }

    @Override // p010b.p011a.InterfaceC0051a
    public void cancel() {
        this.f854b.f856b.remove(this.f853a);
        this.f853a.f3134b.remove(this);
    }
}