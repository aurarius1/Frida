package p010b.p083u.p084e;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: b.u.e.x0 */
/* loaded from: classes.dex */
public class C1006x0 extends AbstractC0988s1 {

    /* renamed from: a */
    public RecyclerView f3888a;

    /* renamed from: b */
    public final AbstractC0996u1 f3889b = new C0953j2(this);

    /* renamed from: c */
    public AbstractC0999v0 f3890c;

    /* renamed from: d */
    public AbstractC0999v0 f3891d;

    /* renamed from: a */
    public int[] m1416a(AbstractC0980q1 abstractC0980q1, View view) {
        int[] iArr = new int[2];
        if (abstractC0980q1.mo1532f()) {
            iArr[0] = m1414c(view, m1412e(abstractC0980q1));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0980q1.mo1530g()) {
            iArr[1] = m1414c(view, m1411f(abstractC0980q1));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: b */
    public final void m1415b() {
        RecyclerView recyclerView = this.f3888a;
        AbstractC0996u1 abstractC0996u1 = this.f3889b;
        List list = recyclerView.f774u0;
        if (list != null) {
            list.remove(abstractC0996u1);
        }
        this.f3888a.setOnFlingListener(null);
    }

    /* renamed from: c */
    public final int m1414c(View view, AbstractC0999v0 abstractC0999v0) {
        return ((abstractC0999v0.mo1444c(view) / 2) + abstractC0999v0.mo1442e(view)) - ((abstractC0999v0.mo1435l() / 2) + abstractC0999v0.mo1436k());
    }

    /* renamed from: d */
    public final View m1413d(AbstractC0980q1 abstractC0980q1, AbstractC0999v0 abstractC0999v0) {
        int m1492z = abstractC0980q1.m1492z();
        View view = null;
        if (m1492z == 0) {
            return null;
        }
        int mo1435l = (abstractC0999v0.mo1435l() / 2) + abstractC0999v0.mo1436k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m1492z; i2++) {
            View m1494y = abstractC0980q1.m1494y(i2);
            int abs = Math.abs(((abstractC0999v0.mo1444c(m1494y) / 2) + abstractC0999v0.mo1442e(m1494y)) - mo1435l);
            if (abs < i) {
                view = m1494y;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: e */
    public final AbstractC0999v0 m1412e(AbstractC0980q1 abstractC0980q1) {
        AbstractC0999v0 abstractC0999v0 = this.f3891d;
        if (abstractC0999v0 == null || abstractC0999v0.f3865a != abstractC0980q1) {
            this.f3891d = new C0991t0(abstractC0980q1);
        }
        return this.f3891d;
    }

    /* renamed from: f */
    public final AbstractC0999v0 m1411f(AbstractC0980q1 abstractC0980q1) {
        AbstractC0999v0 abstractC0999v0 = this.f3890c;
        if (abstractC0999v0 == null || abstractC0999v0.f3865a != abstractC0980q1) {
            this.f3890c = new C0995u0(abstractC0980q1);
        }
        return this.f3890c;
    }

    /* renamed from: g */
    public final void m1410g() {
        if (this.f3888a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3888a.m3160h(this.f3889b);
        this.f3888a.setOnFlingListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c1, code lost:
        if (r2 < r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1409h(AbstractC0980q1 abstractC0980q1, int i, int i2) {
        int i3;
        PointF mo1703a;
        boolean z = abstractC0980q1 instanceof InterfaceC0925c2;
        if (z) {
            View view = null;
            C1003w0 c1003w0 = !z ? null : new C1003w0(this, this.f3888a.getContext());
            if (c1003w0 != null) {
                int m1572K = abstractC0980q1.m1572K();
                if (m1572K != 0) {
                    AbstractC0999v0 m1411f = abstractC0980q1.mo1530g() ? m1411f(abstractC0980q1) : abstractC0980q1.mo1532f() ? m1412e(abstractC0980q1) : null;
                    if (m1411f != null) {
                        int m1492z = abstractC0980q1.m1492z();
                        View view2 = null;
                        int i4 = Integer.MIN_VALUE;
                        int i5 = Integer.MAX_VALUE;
                        for (int i6 = 0; i6 < m1492z; i6++) {
                            View m1494y = abstractC0980q1.m1494y(i6);
                            if (m1494y != null) {
                                int m1414c = m1414c(m1494y, m1411f);
                                if (m1414c <= 0 && m1414c > i4) {
                                    i4 = m1414c;
                                    view2 = m1494y;
                                }
                                if (m1414c >= 0 && m1414c < i5) {
                                    i5 = m1414c;
                                    view = m1494y;
                                }
                            }
                        }
                        boolean z2 = !abstractC0980q1.mo1532f() ? i2 <= 0 : i <= 0;
                        if (z2 && view != null) {
                            i3 = abstractC0980q1.m1556S(view);
                        } else if (z2 || view2 == null) {
                            if (z2) {
                                view = view2;
                            }
                            if (view != null) {
                                i3 = ((z && (mo1703a = ((InterfaceC0925c2) abstractC0980q1).mo1703a(abstractC0980q1.m1572K() - 1)) != null && ((mo1703a.x > 0.0f ? 1 : (mo1703a.x == 0.0f ? 0 : -1)) < 0 || (mo1703a.y > 0.0f ? 1 : (mo1703a.y == 0.0f ? 0 : -1)) < 0)) == z2 ? -1 : 1) + abstractC0980q1.m1556S(view);
                                if (i3 >= 0) {
                                }
                            }
                        } else {
                            i3 = abstractC0980q1.m1556S(view2);
                        }
                        if (i3 != -1) {
                            c1003w0.f3797a = i3;
                            abstractC0980q1.m1544Y0(c1003w0);
                            return true;
                        }
                    }
                }
                i3 = -1;
                if (i3 != -1) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1408i() {
        AbstractC0980q1 layoutManager;
        View view;
        AbstractC0999v0 m1412e;
        RecyclerView recyclerView = this.f3888a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.mo1530g()) {
            m1412e = m1411f(layoutManager);
        } else if (!layoutManager.mo1532f()) {
            view = null;
            if (view != null) {
                return;
            }
            int[] m1416a = m1416a(layoutManager, view);
            if (m1416a[0] == 0 && m1416a[1] == 0) {
                return;
            }
            this.f3888a.m3149m0(m1416a[0], m1416a[1], null, Integer.MIN_VALUE, false);
            return;
        } else {
            m1412e = m1412e(layoutManager);
        }
        view = m1413d(layoutManager, m1412e);
        if (view != null) {
        }
    }
}