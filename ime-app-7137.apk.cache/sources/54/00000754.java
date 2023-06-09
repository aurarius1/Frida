package p093c.p097b.p130z.p132r0;

import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.r0 */
/* loaded from: classes.dex */
public final class C1744r0 implements InterfaceC1748t0 {

    /* renamed from: b */
    public final C1747t f5364b;

    /* renamed from: c */
    public final Runnable f5365c;

    /* renamed from: d */
    public boolean f5366d;

    public C1744r0(C1747t c1747t, Runnable runnable) {
        this.f5364b = c1747t;
        this.f5365c = runnable;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: a */
    public void mo493a() {
        this.f5365c.run();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: b */
    public void mo473b(Key key) {
        this.f5364b.f5370a.f6523u.mo473b(key);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: c */
    public void mo450c(Key key, CharSequence charSequence) {
        this.f5364b.f5370a.f6523u.mo450c(key, charSequence);
        if (this.f5366d) {
            this.f5365c.run();
        }
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: f */
    public void mo502f() {
        this.f5364b.f5370a.f6523u.mo502f();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: g */
    public void mo445g(int i) {
        this.f5364b.f5370a.f6523u.mo445g(i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: h */
    public boolean mo429h(int i, int i2, Key key, long j) {
        return false;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: i */
    public void mo447i(int i) {
        this.f5364b.f5370a.f6523u.mo447i(i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: j */
    public void mo444j() {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: k */
    public void mo446k() {
        this.f5364b.f5370a.f6523u.mo446k();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: l */
    public void mo442l() {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: m */
    public void mo441m() {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: n */
    public void mo472n(int i) {
        this.f5364b.f5370a.f6523u.mo472n(i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: o */
    public void mo440o(boolean z) {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: p */
    public void mo428p(int i, int i2, long j) {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: q */
    public void mo439q() {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: r */
    public void mo438r(boolean z) {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        this.f5364b.f5370a.f6523u.mo379s(i, key, i2, iArr, z);
        if ((!this.f5366d || i == -5) && i != 10) {
            return;
        }
        this.f5365c.run();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: t */
    public void mo427t() {
    }
}