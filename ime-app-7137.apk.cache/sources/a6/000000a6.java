package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p010b.p046j.p058l.p059d1.C0579d;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p083u.p084e.AbstractC0915a0;
import p010b.p083u.p084e.AbstractC0980q1;
import p010b.p083u.p084e.C0929d2;
import p010b.p083u.p084e.C0967n0;
import p010b.p083u.p084e.C0971o0;
import p010b.p083u.p084e.C0975p0;
import p010b.p083u.p084e.C0984r1;
import p010b.p083u.p084e.C0998v;
import p010b.p083u.p084e.C1007x1;
import p010b.p083u.p084e.C1008y;
import p010b.p083u.p084e.C1011z;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: G */
    public boolean f673G;

    /* renamed from: H */
    public int f674H;

    /* renamed from: I */
    public int[] f675I;

    /* renamed from: J */
    public View[] f676J;

    /* renamed from: K */
    public final SparseIntArray f677K;

    /* renamed from: L */
    public final SparseIntArray f678L;

    /* renamed from: M */
    public AbstractC0915a0 f679M;

    /* renamed from: N */
    public final Rect f680N;

    public GridLayoutManager(Context context, int i) {
        super(1, false);
        this.f673G = false;
        this.f674H = -1;
        this.f677K = new SparseIntArray();
        this.f678L = new SparseIntArray();
        this.f679M = new C1008y();
        this.f680N = new Rect();
        m3235Q1(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        this.f673G = false;
        this.f674H = -1;
        this.f677K = new SparseIntArray();
        this.f678L = new SparseIntArray();
        this.f679M = new C1008y();
        this.f680N = new Rect();
        m3235Q1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f673G = false;
        this.f674H = -1;
        this.f677K = new SparseIntArray();
        this.f678L = new SparseIntArray();
        this.f679M = new C1008y();
        this.f680N = new Rect();
        m3235Q1(AbstractC0980q1.m1554T(context, attributeSet, i, i2).f3768b);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: B */
    public int mo1590B(C1007x1 c1007x1, C0929d2 c0929d2) {
        if (this.f687r == 1) {
            return this.f674H;
        }
        if (c0929d2.m1684b() < 1) {
            return 0;
        }
        return m3240L1(c1007x1, c0929d2, c0929d2.m1684b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: E1 */
    public void mo3229E1(boolean z) {
        if (!z) {
            mo1536d(null);
            if (this.f693x) {
                this.f693x = false;
                m1569L0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: I1 */
    public final void m3243I1(int i) {
        int i2;
        int[] iArr = this.f675I;
        int i3 = this.f674H;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f675I = iArr;
    }

    /* renamed from: J1 */
    public final void m3242J1() {
        View[] viewArr = this.f676J;
        if (viewArr == null || viewArr.length != this.f674H) {
            this.f676J = new View[this.f674H];
        }
    }

    /* renamed from: K1 */
    public int m3241K1(int i, int i2) {
        if (this.f687r != 1 || !m3207t1()) {
            int[] iArr = this.f675I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f675I;
        int i3 = this.f674H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: L1 */
    public final int m3240L1(C1007x1 c1007x1, C0929d2 c0929d2, int i) {
        if (!c0929d2.f3576g) {
            return this.f679M.m1732a(i, this.f674H);
        }
        int m1405c = c1007x1.m1405c(i);
        if (m1405c == -1) {
            return 0;
        }
        return this.f679M.m1732a(m1405c, this.f674H);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: M0 */
    public int mo1567M0(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        m3234R1();
        m3242J1();
        if (this.f687r == 1) {
            return 0;
        }
        return m3232B1(i, c1007x1, c0929d2);
    }

    /* renamed from: M1 */
    public final int m3239M1(C1007x1 c1007x1, C0929d2 c0929d2, int i) {
        if (!c0929d2.f3576g) {
            return this.f679M.mo1394b(i, this.f674H);
        }
        int i2 = this.f678L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m1405c = c1007x1.m1405c(i);
        if (m1405c == -1) {
            return 0;
        }
        return this.f679M.mo1394b(m1405c, this.f674H);
    }

    /* renamed from: N1 */
    public final int m3238N1(C1007x1 c1007x1, C0929d2 c0929d2, int i) {
        if (c0929d2.f3576g) {
            int i2 = this.f677K.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int m1405c = c1007x1.m1405c(i);
            if (m1405c == -1) {
                return 1;
            }
            return this.f679M.mo1108c(m1405c);
        }
        return this.f679M.mo1108c(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: O0 */
    public int mo1563O0(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        m3234R1();
        m3242J1();
        if (this.f687r == 0) {
            return 0;
        }
        return m3232B1(i, c1007x1, c0929d2);
    }

    /* renamed from: O1 */
    public final void m3237O1(View view, int i, boolean z) {
        int i2;
        int i3;
        C1011z c1011z = (C1011z) view.getLayoutParams();
        Rect rect = c1011z.f3814b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1011z).topMargin + ((ViewGroup.MarginLayoutParams) c1011z).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1011z).leftMargin + ((ViewGroup.MarginLayoutParams) c1011z).rightMargin;
        int m3241K1 = m3241K1(c1011z.f3901e, c1011z.f3902f);
        if (this.f687r == 1) {
            i3 = AbstractC0980q1.m1592A(m3241K1, i, i5, ((ViewGroup.MarginLayoutParams) c1011z).width, false);
            i2 = AbstractC0980q1.m1592A(this.f689t.mo1435l(), this.f3786o, i4, ((ViewGroup.MarginLayoutParams) c1011z).height, true);
        } else {
            int m1592A = AbstractC0980q1.m1592A(m3241K1, i, i4, ((ViewGroup.MarginLayoutParams) c1011z).height, false);
            int m1592A2 = AbstractC0980q1.m1592A(this.f689t.mo1435l(), this.f3785n, i5, ((ViewGroup.MarginLayoutParams) c1011z).width, true);
            i2 = m1592A;
            i3 = m1592A2;
        }
        m3236P1(view, i3, i2, z);
    }

    /* renamed from: P1 */
    public final void m3236P1(View view, int i, int i2, boolean z) {
        C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
        if (z ? m1547W0(view, i, i2, c0984r1) : m1551U0(view, i, i2, c0984r1)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: Q1 */
    public void m3235Q1(int i) {
        if (i == this.f674H) {
            return;
        }
        this.f673G = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1124a.m1193c("Span count should be at least 1. Provided ", i));
        }
        this.f674H = i;
        this.f679M.f3529a.clear();
        m1569L0();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: R0 */
    public void mo1557R0(Rect rect, int i, int i2) {
        int m1526i;
        int m1526i2;
        if (this.f675I == null) {
            super.mo1557R0(rect, i, i2);
        }
        int m1560Q = m1560Q() + m1562P();
        int m1564O = m1564O() + m1558R();
        if (this.f687r == 1) {
            m1526i2 = AbstractC0980q1.m1526i(i2, rect.height() + m1564O, m1568M());
            int[] iArr = this.f675I;
            m1526i = AbstractC0980q1.m1526i(i, iArr[iArr.length - 1] + m1560Q, m1566N());
        } else {
            m1526i = AbstractC0980q1.m1526i(i, rect.width() + m1560Q, m1566N());
            int[] iArr2 = this.f675I;
            m1526i2 = AbstractC0980q1.m1526i(i2, iArr2[iArr2.length - 1] + m1564O, m1568M());
        }
        this.f3773b.setMeasuredDimension(m1526i, m1526i2);
    }

    /* renamed from: R1 */
    public final void m3234R1() {
        int m1564O;
        int m1558R;
        if (this.f687r == 1) {
            m1564O = this.f3787p - m1560Q();
            m1558R = m1562P();
        } else {
            m1564O = this.f3788q - m1564O();
            m1558R = m1558R();
        }
        m3243I1(m1564O - m1558R);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: U */
    public int mo1552U(C1007x1 c1007x1, C0929d2 c0929d2) {
        if (this.f687r == 0) {
            return this.f674H;
        }
        if (c0929d2.m1684b() < 1) {
            return 0;
        }
        return m3240L1(c1007x1, c0929d2, c0929d2.m1684b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: Z0 */
    public boolean mo1542Z0() {
        return this.f682B == null && !this.f673G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: b1 */
    public void mo3225b1(C0929d2 c0929d2, C0975p0 c0975p0, C0998v c0998v) {
        int i = this.f674H;
        for (int i2 = 0; i2 < this.f674H && c0975p0.m1594b(c0929d2) && i > 0; i2++) {
            int i3 = c0975p0.f3758d;
            c0998v.m1449a(i3, Math.max(0, c0975p0.f3761g));
            i -= this.f679M.mo1108c(i3);
            c0975p0.f3758d += c0975p0.f3759e;
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: h */
    public boolean mo1528h(C0984r1 c0984r1) {
        return c0984r1 instanceof C1011z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo1523j0(View view, int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        int m1492z;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        boolean z;
        C1007x1 c1007x12 = c1007x1;
        C0929d2 c0929d22 = c0929d2;
        View m1504t = m1504t(view);
        View view4 = null;
        if (m1504t == null) {
            return null;
        }
        C1011z c1011z = (C1011z) m1504t.getLayoutParams();
        int i5 = c1011z.f3901e;
        int i6 = c1011z.f3902f + i5;
        if (super.mo1523j0(view, i, c1007x1, c0929d2) == null) {
            return null;
        }
        if ((m3221f1(i) == 1) != this.f692w) {
            i2 = m1492z() - 1;
            m1492z = -1;
            i3 = -1;
        } else {
            m1492z = m1492z();
            i2 = 0;
            i3 = 1;
        }
        boolean z2 = this.f687r == 1 && m3207t1();
        int m3240L1 = m3240L1(c1007x12, c0929d22, i2);
        int i7 = i2;
        int i8 = i3;
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        View view5 = null;
        while (i7 != m1492z) {
            int i13 = m1492z;
            int m3240L12 = m3240L1(c1007x12, c0929d22, i7);
            View m1494y = m1494y(i7);
            if (m1494y == m1504t) {
                break;
            }
            if (!m1494y.hasFocusable() || m3240L12 == m3240L1) {
                C1011z c1011z2 = (C1011z) m1494y.getLayoutParams();
                int i14 = c1011z2.f3901e;
                view2 = m1504t;
                int i15 = c1011z2.f3902f + i14;
                if (m1494y.hasFocusable() && i14 == i5 && i15 == i6) {
                    return m1494y;
                }
                if (!(m1494y.hasFocusable() && view4 == null) && (m1494y.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (m1494y.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (m1541a0(m1494y, false)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            z = true;
                            if (z) {
                                if (m1494y.hasFocusable()) {
                                    int i16 = c1011z2.f3901e;
                                    i4 = Math.min(i15, i6) - Math.max(i14, i5);
                                    i12 = i16;
                                    view5 = view3;
                                    view4 = m1494y;
                                } else {
                                    int i17 = c1011z2.f3901e;
                                    i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                    i9 = i17;
                                    view5 = m1494y;
                                }
                                i7 += i8;
                                c1007x12 = c1007x1;
                                c0929d22 = c0929d2;
                                m1492z = i13;
                                m1504t = view2;
                                i10 = i4;
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    i4 = i10;
                    z = false;
                    if (z) {
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                z = true;
                if (z) {
                }
            } else if (view4 != null) {
                break;
            } else {
                view2 = m1504t;
                view3 = view5;
                i4 = i10;
            }
            view5 = view3;
            i7 += i8;
            c1007x12 = c1007x1;
            c0929d22 = c0929d2;
            m1492z = i13;
            m1504t = view2;
            i10 = i4;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: m */
    public int mo1518m(C0929d2 c0929d2) {
        return m3223d1(c0929d2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: n */
    public int mo1516n(C0929d2 c0929d2) {
        return m3222e1(c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: n0 */
    public void mo1515n0(C1007x1 c1007x1, C0929d2 c0929d2, View view, C0580e c0580e) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1011z)) {
            m1517m0(view, c0580e);
            return;
        }
        C1011z c1011z = (C1011z) layoutParams;
        int m3240L1 = m3240L1(c1007x1, c0929d2, c1011z.m1473a());
        if (this.f687r == 0) {
            i4 = c1011z.f3901e;
            i = c1011z.f3902f;
            i3 = 1;
            z = false;
            z2 = false;
            i2 = m3240L1;
        } else {
            i = 1;
            i2 = c1011z.f3901e;
            i3 = c1011z.f3902f;
            z = false;
            z2 = false;
            i4 = m3240L1;
        }
        c0580e.m2304j(C0579d.m2314a(i4, i, i2, i3, z, z2));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: o1 */
    public View mo3212o1(C1007x1 c1007x1, C0929d2 c0929d2, boolean z, boolean z2) {
        int i;
        int m1492z = m1492z();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = m1492z() - 1;
            i3 = -1;
        } else {
            i2 = m1492z;
            i = 0;
        }
        int m1684b = c0929d2.m1684b();
        m3220g1();
        int mo1436k = this.f689t.mo1436k();
        int mo1440g = this.f689t.mo1440g();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m1494y = m1494y(i);
            int m1556S = m1556S(m1494y);
            if (m1556S >= 0 && m1556S < m1684b && m3239M1(c1007x1, c0929d2, m1556S) == 0) {
                if (((C0984r1) m1494y.getLayoutParams()).m1471c()) {
                    if (view2 == null) {
                        view2 = m1494y;
                    }
                } else if (this.f689t.mo1442e(m1494y) < mo1440g && this.f689t.mo1445b(m1494y) >= mo1436k) {
                    return m1494y;
                } else {
                    if (view == null) {
                        view = m1494y;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: p */
    public int mo1512p(C0929d2 c0929d2) {
        return m3223d1(c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: p0 */
    public void mo1511p0(RecyclerView recyclerView, int i, int i2) {
        this.f679M.f3529a.clear();
        this.f679M.f3530b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: q */
    public int mo1510q(C0929d2 c0929d2) {
        return m3222e1(c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: q0 */
    public void mo1509q0(RecyclerView recyclerView) {
        this.f679M.f3529a.clear();
        this.f679M.f3530b.clear();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: r0 */
    public void mo1507r0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f679M.f3529a.clear();
        this.f679M.f3530b.clear();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: s0 */
    public void mo1505s0(RecyclerView recyclerView, int i, int i2) {
        this.f679M.f3529a.clear();
        this.f679M.f3530b.clear();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: u0 */
    public void mo1501u0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f679M.f3529a.clear();
        this.f679M.f3530b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r22.f3748b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3206u1(C1007x1 c1007x1, C0929d2 c0929d2, C0975p0 c0975p0, C0971o0 c0971o0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int mo1443d;
        int m1562P;
        int mo1443d2;
        int i14;
        int m1592A;
        int i15;
        View m1593c;
        int mo1437j = this.f689t.mo1437j();
        boolean z = mo1437j != 1073741824;
        int i16 = m1492z() > 0 ? this.f675I[this.f674H] : 0;
        if (z) {
            m3234R1();
        }
        boolean z2 = c0975p0.f3759e == 1;
        int i17 = this.f674H;
        if (!z2) {
            i17 = m3239M1(c1007x1, c0929d2, c0975p0.f3758d) + m3238N1(c1007x1, c0929d2, c0975p0.f3758d);
        }
        int i18 = 0;
        while (i18 < this.f674H && c0975p0.m1594b(c0929d2) && i17 > 0) {
            int i19 = c0975p0.f3758d;
            int m3238N1 = m3238N1(c1007x1, c0929d2, i19);
            if (m3238N1 > this.f674H) {
                throw new IllegalArgumentException("Item at position " + i19 + " requires " + m3238N1 + " spans but GridLayoutManager has only " + this.f674H + " spans.");
            }
            i17 -= m3238N1;
            if (i17 < 0 || (m1593c = c0975p0.m1593c(c1007x1)) == null) {
                break;
            }
            this.f676J[i18] = m1593c;
            i18++;
        }
        if (z2) {
            i2 = i18;
            i = 0;
            i3 = 0;
            i4 = 1;
        } else {
            i = i18 - 1;
            i2 = -1;
            i3 = 0;
            i4 = -1;
        }
        while (i != i2) {
            View view = this.f676J[i];
            C1011z c1011z = (C1011z) view.getLayoutParams();
            int m3238N12 = m3238N1(c1007x1, c0929d2, m1556S(view));
            c1011z.f3902f = m3238N12;
            c1011z.f3901e = i3;
            i3 += m3238N12;
            i += i4;
        }
        float f = 0.0f;
        int i20 = 0;
        for (int i21 = 0; i21 < i18; i21++) {
            View view2 = this.f676J[i21];
            if (c0975p0.f3765k == null) {
                if (z2) {
                    m1540b(view2);
                } else {
                    m1538c(view2, 0, false);
                }
            } else if (z2) {
                m1538c(view2, -1, true);
            } else {
                m1538c(view2, 0, true);
            }
            m1534e(view2, this.f680N);
            m3237O1(view2, mo1437j, false);
            int mo1444c = this.f689t.mo1444c(view2);
            if (mo1444c > i20) {
                i20 = mo1444c;
            }
            float mo1443d3 = (this.f689t.mo1443d(view2) * 1.0f) / ((C1011z) view2.getLayoutParams()).f3902f;
            if (mo1443d3 > f) {
                f = mo1443d3;
            }
        }
        if (z) {
            m3243I1(Math.max(Math.round(f * this.f674H), i16));
            i20 = 0;
            for (int i22 = 0; i22 < i18; i22++) {
                View view3 = this.f676J[i22];
                m3237O1(view3, 1073741824, true);
                int mo1444c2 = this.f689t.mo1444c(view3);
                if (mo1444c2 > i20) {
                    i20 = mo1444c2;
                }
            }
        }
        for (int i23 = 0; i23 < i18; i23++) {
            View view4 = this.f676J[i23];
            if (this.f689t.mo1444c(view4) != i20) {
                C1011z c1011z2 = (C1011z) view4.getLayoutParams();
                Rect rect = c1011z2.f3814b;
                int i24 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1011z2).topMargin + ((ViewGroup.MarginLayoutParams) c1011z2).bottomMargin;
                int i25 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1011z2).leftMargin + ((ViewGroup.MarginLayoutParams) c1011z2).rightMargin;
                int m3241K1 = m3241K1(c1011z2.f3901e, c1011z2.f3902f);
                if (this.f687r == 1) {
                    i15 = AbstractC0980q1.m1592A(m3241K1, 1073741824, i25, ((ViewGroup.MarginLayoutParams) c1011z2).width, false);
                    m1592A = View.MeasureSpec.makeMeasureSpec(i20 - i24, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20 - i25, 1073741824);
                    m1592A = AbstractC0980q1.m1592A(m3241K1, 1073741824, i24, ((ViewGroup.MarginLayoutParams) c1011z2).height, false);
                    i15 = makeMeasureSpec;
                }
                m3236P1(view4, i15, m1592A, true);
            }
        }
        c0971o0.f3747a = i20;
        if (this.f687r == 1) {
            if (c0975p0.f3760f == -1) {
                i10 = c0975p0.f3756b;
                i14 = i10 - i20;
            } else {
                i14 = c0975p0.f3756b;
                i10 = i20 + i14;
            }
            i8 = i14;
            i9 = 0;
            i7 = 0;
        } else {
            if (c0975p0.f3760f == -1) {
                i6 = c0975p0.f3756b;
                i5 = i6 - i20;
            } else {
                i5 = c0975p0.f3756b;
                i6 = i20 + i5;
            }
            i7 = i5;
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        int i26 = 0;
        while (i26 < i18) {
            View view5 = this.f676J[i26];
            C1011z c1011z3 = (C1011z) view5.getLayoutParams();
            if (this.f687r == 1) {
                if (m3207t1()) {
                    mo1443d2 = m1562P() + this.f675I[this.f674H - c1011z3.f3901e];
                    m1562P = mo1443d2 - this.f689t.mo1443d(view5);
                } else {
                    m1562P = this.f675I[c1011z3.f3901e] + m1562P();
                    mo1443d2 = this.f689t.mo1443d(view5) + m1562P;
                }
                mo1443d = i10;
                i12 = mo1443d2;
                i13 = m1562P;
                i11 = i8;
            } else {
                int m1558R = m1558R() + this.f675I[c1011z3.f3901e];
                i11 = m1558R;
                i12 = i9;
                i13 = i7;
                mo1443d = this.f689t.mo1443d(view5) + m1558R;
            }
            m1539b0(view5, i13, i11, i12, mo1443d);
            if (c1011z3.m1471c() || c1011z3.m1472b()) {
                c0971o0.f3749c = true;
            }
            c0971o0.f3750d |= view5.hasFocusable();
            i26++;
            i10 = mo1443d;
            i9 = i12;
            i7 = i13;
            i8 = i11;
        }
        Arrays.fill(this.f676J, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: v */
    public C0984r1 mo1500v() {
        return this.f687r == 0 ? new C1011z(-2, -1) : new C1011z(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: v0 */
    public void mo1499v0(C1007x1 c1007x1, C0929d2 c0929d2) {
        if (c0929d2.f3576g) {
            int m1492z = m1492z();
            for (int i = 0; i < m1492z; i++) {
                C1011z c1011z = (C1011z) m1494y(i).getLayoutParams();
                int m1473a = c1011z.m1473a();
                this.f677K.put(m1473a, c1011z.f3902f);
                this.f678L.put(m1473a, c1011z.f3901e);
            }
        }
        super.mo1499v0(c1007x1, c0929d2);
        this.f677K.clear();
        this.f678L.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: v1 */
    public void mo3205v1(C1007x1 c1007x1, C0929d2 c0929d2, C0967n0 c0967n0, int i) {
        m3234R1();
        if (c0929d2.m1684b() > 0 && !c0929d2.f3576g) {
            boolean z = i == 1;
            int m3239M1 = m3239M1(c1007x1, c0929d2, c0967n0.f3729b);
            if (z) {
                while (m3239M1 > 0) {
                    int i2 = c0967n0.f3729b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0967n0.f3729b = i3;
                    m3239M1 = m3239M1(c1007x1, c0929d2, i3);
                }
            } else {
                int m1684b = c0929d2.m1684b() - 1;
                int i4 = c0967n0.f3729b;
                while (i4 < m1684b) {
                    int i5 = i4 + 1;
                    int m3239M12 = m3239M1(c1007x1, c0929d2, i5);
                    if (m3239M12 <= m3239M1) {
                        break;
                    }
                    i4 = i5;
                    m3239M1 = m3239M12;
                }
                c0967n0.f3729b = i4;
            }
        }
        m3242J1();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: w */
    public C0984r1 mo1498w(Context context, AttributeSet attributeSet) {
        return new C1011z(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: w0 */
    public void mo1497w0(C0929d2 c0929d2) {
        this.f682B = null;
        this.f695z = -1;
        this.f681A = Integer.MIN_VALUE;
        this.f683C.m1612d();
        this.f673G = false;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: x */
    public C0984r1 mo1496x(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1011z((ViewGroup.MarginLayoutParams) layoutParams) : new C1011z(layoutParams);
    }
}