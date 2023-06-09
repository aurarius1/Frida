package p010b.p086w;

import android.view.ViewGroup;

/* renamed from: b.w.j */
/* loaded from: classes.dex */
public class C1048j extends AbstractC1037f0 {

    /* renamed from: a */
    public boolean f3972a = false;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f3973b;

    public C1048j(C1054l c1054l, ViewGroup viewGroup) {
        this.f3973b = viewGroup;
    }

    @Override // p010b.p086w.AbstractC1037f0, p010b.p086w.InterfaceC1031d0
    /* renamed from: a */
    public void mo1329a(AbstractC1034e0 abstractC1034e0) {
        AbstractC1073t0.m1304b(this.f3973b, false);
    }

    @Override // p010b.p086w.AbstractC1037f0, p010b.p086w.InterfaceC1031d0
    /* renamed from: b */
    public void mo1328b(AbstractC1034e0 abstractC1034e0) {
        AbstractC1073t0.m1304b(this.f3973b, true);
    }

    @Override // p010b.p086w.AbstractC1037f0, p010b.p086w.InterfaceC1031d0
    /* renamed from: d */
    public void mo1327d(AbstractC1034e0 abstractC1034e0) {
        AbstractC1073t0.m1304b(this.f3973b, false);
        this.f3972a = true;
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: e */
    public void mo1325e(AbstractC1034e0 abstractC1034e0) {
        if (!this.f3972a) {
            AbstractC1073t0.m1304b(this.f3973b, false);
        }
        abstractC1034e0.mo1340v(this);
    }
}