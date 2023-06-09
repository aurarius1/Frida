package p010b.p086w;

/* renamed from: b.w.l0 */
/* loaded from: classes.dex */
public class C1055l0 extends AbstractC1037f0 {

    /* renamed from: a */
    public C1058m0 f3998a;

    public C1055l0(C1058m0 c1058m0) {
        this.f3998a = c1058m0;
    }

    @Override // p010b.p086w.AbstractC1037f0, p010b.p086w.InterfaceC1031d0
    /* renamed from: c */
    public void mo1326c(AbstractC1034e0 abstractC1034e0) {
        C1058m0 c1058m0 = this.f3998a;
        if (c1058m0.f4002B) {
            return;
        }
        c1058m0.m1381F();
        this.f3998a.f4002B = true;
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: e */
    public void mo1325e(AbstractC1034e0 abstractC1034e0) {
        C1058m0 c1058m0 = this.f3998a;
        int i = c1058m0.f4001A - 1;
        c1058m0.f4001A = i;
        if (i == 0) {
            c1058m0.f4002B = false;
            c1058m0.m1376m();
        }
        abstractC1034e0.mo1340v(this);
    }
}