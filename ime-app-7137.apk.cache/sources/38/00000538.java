package p093c.p097b.p102d0.p103k;

import android.text.TextUtils;
import p093c.p097b.p102d0.C1185b;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.InterfaceC1748t0;

/* renamed from: c.b.d0.k.k */
/* loaded from: classes.dex */
public class C1204k implements InterfaceC1748t0 {

    /* renamed from: b */
    public final C1185b f4369b;

    /* renamed from: c */
    public final InterfaceC1748t0 f4370c;

    public C1204k(C1185b c1185b, InterfaceC1748t0 interfaceC1748t0) {
        this.f4369b = c1185b;
        this.f4370c = interfaceC1748t0;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: a */
    public void mo493a() {
        this.f4370c.mo493a();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: b */
    public void mo473b(Key key) {
        this.f4370c.mo473b(key);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: c */
    public void mo450c(Key key, CharSequence charSequence) {
        this.f4370c.mo450c(key, charSequence);
        if (TextUtils.isEmpty(key.f5219b) || TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f4369b.f4316p.m1156c(String.valueOf(key.f5219b), String.valueOf(charSequence));
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: f */
    public void mo502f() {
        this.f4370c.mo502f();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: g */
    public void mo445g(int i) {
        this.f4370c.mo445g(i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: h */
    public boolean mo429h(int i, int i2, Key key, long j) {
        return false;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: i */
    public void mo447i(int i) {
        this.f4370c.mo447i(i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: j */
    public void mo444j() {
        this.f4370c.mo444j();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: k */
    public void mo446k() {
        this.f4370c.mo446k();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: l */
    public void mo442l() {
        this.f4370c.mo442l();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: m */
    public void mo441m() {
        this.f4370c.mo441m();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: n */
    public void mo472n(int i) {
        this.f4370c.mo472n(i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: o */
    public void mo440o(boolean z) {
        this.f4370c.mo440o(z);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: p */
    public void mo428p(int i, int i2, long j) {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: q */
    public void mo439q() {
        this.f4370c.mo439q();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: r */
    public void mo438r(boolean z) {
        this.f4370c.mo438r(z);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        this.f4370c.mo379s(i, key, i2, iArr, z);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: t */
    public void mo427t() {
    }
}