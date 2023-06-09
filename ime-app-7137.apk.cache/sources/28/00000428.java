package p010b.p083u.p084e;

import android.view.ViewGroup;

/* renamed from: b.u.e.e1 */
/* loaded from: classes.dex */
public abstract class AbstractC0932e1 {

    /* renamed from: a */
    public final C0936f1 f3589a = new C0936f1();

    /* renamed from: b */
    public boolean f3590b = false;

    /* renamed from: c */
    public int f3591c = 1;

    /* renamed from: a */
    public abstract int mo543a();

    /* renamed from: b */
    public long mo558b(int i) {
        return -1L;
    }

    /* renamed from: c */
    public int mo1106c(int i) {
        return 0;
    }

    /* renamed from: d */
    public final void m1683d(int i) {
        this.f3589a.m1678d(i, 1, null);
    }

    /* renamed from: e */
    public abstract void mo542e(AbstractC0941g2 abstractC0941g2, int i);

    /* renamed from: f */
    public abstract AbstractC0941g2 mo541f(ViewGroup viewGroup, int i);

    /* renamed from: g */
    public void m1682g(boolean z) {
        if (this.f3589a.m1681a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3590b = z;
    }
}