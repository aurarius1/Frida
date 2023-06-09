package p010b.p083u.p084e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p083u.AbstractC0913d;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.u.e.q1 */
/* loaded from: classes.dex */
public abstract class AbstractC0980q1 {

    /* renamed from: a */
    public C0926d f3772a;

    /* renamed from: b */
    public RecyclerView f3773b;

    /* renamed from: c */
    public final InterfaceC0989s2 f3774c;

    /* renamed from: d */
    public final InterfaceC0989s2 f3775d;

    /* renamed from: e */
    public C0993t2 f3776e;

    /* renamed from: f */
    public C0993t2 f3777f;

    /* renamed from: g */
    public C0983r0 f3778g;

    /* renamed from: h */
    public boolean f3779h;

    /* renamed from: i */
    public boolean f3780i;

    /* renamed from: j */
    public boolean f3781j;

    /* renamed from: k */
    public boolean f3782k;

    /* renamed from: l */
    public int f3783l;

    /* renamed from: m */
    public boolean f3784m;

    /* renamed from: n */
    public int f3785n;

    /* renamed from: o */
    public int f3786o;

    /* renamed from: p */
    public int f3787p;

    /* renamed from: q */
    public int f3788q;

    public AbstractC0980q1() {
        C0968n1 c0968n1 = new C0968n1(this);
        this.f3774c = c0968n1;
        C0972o1 c0972o1 = new C0972o1(this);
        this.f3775d = c0972o1;
        this.f3776e = new C0993t2(c0968n1);
        this.f3777f = new C0993t2(c0972o1);
        this.f3779h = false;
        this.f3780i = false;
        this.f3781j = true;
        this.f3782k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r5 == 1073741824) goto L8;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1592A(int i, int i2, int i3, int i4, boolean z) {
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* renamed from: T */
    public static C0976p1 m1554T(Context context, AttributeSet attributeSet, int i, int i2) {
        C0976p1 c0976p1 = new C0976p1();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0913d.RecyclerView, i, i2);
        c0976p1.f3767a = obtainStyledAttributes.getInt(AbstractC0913d.RecyclerView_android_orientation, 1);
        c0976p1.f3768b = obtainStyledAttributes.getInt(AbstractC0913d.RecyclerView_spanCount, 1);
        c0976p1.f3769c = obtainStyledAttributes.getBoolean(AbstractC0913d.RecyclerView_reverseLayout, false);
        c0976p1.f3770d = obtainStyledAttributes.getBoolean(AbstractC0913d.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return c0976p1;
    }

    /* renamed from: Z */
    public static boolean m1543Z(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static int m1526i(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* renamed from: A0 */
    public abstract void mo1591A0(Parcelable parcelable);

    /* renamed from: B */
    public int mo1590B(C1007x1 c1007x1, C0929d2 c0929d2) {
        return -1;
    }

    /* renamed from: B0 */
    public abstract Parcelable mo1589B0();

    /* renamed from: C */
    public int m1588C(View view) {
        return view.getBottom() + ((C0984r1) view.getLayoutParams()).f3814b.bottom;
    }

    /* renamed from: C0 */
    public void mo1587C0(int i) {
    }

    /* renamed from: D */
    public void m1586D(View view, Rect rect) {
        int[] iArr = RecyclerView.f699b;
        C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
        Rect rect2 = c0984r1.f3814b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0984r1).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0984r1).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0984r1).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0984r1).bottomMargin);
    }

    /* renamed from: D0 */
    public boolean m1585D0(int i) {
        int m1558R;
        int m1562P;
        int i2;
        int i3;
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView == null) {
            return false;
        }
        if (i == 4096) {
            m1558R = recyclerView.canScrollVertically(1) ? (this.f3788q - m1558R()) - m1564O() : 0;
            if (this.f3773b.canScrollHorizontally(1)) {
                m1562P = (this.f3787p - m1562P()) - m1560Q();
                i3 = m1562P;
                i2 = m1558R;
            }
            i2 = m1558R;
            i3 = 0;
        } else if (i != 8192) {
            i3 = 0;
            i2 = 0;
        } else {
            m1558R = recyclerView.canScrollVertically(-1) ? -((this.f3788q - m1558R()) - m1564O()) : 0;
            if (this.f3773b.canScrollHorizontally(-1)) {
                m1562P = -((this.f3787p - m1562P()) - m1560Q());
                i3 = m1562P;
                i2 = m1558R;
            }
            i2 = m1558R;
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        this.f3773b.m3149m0(i3, i2, null, Integer.MIN_VALUE, true);
        return true;
    }

    /* renamed from: E */
    public int m1584E(View view) {
        return view.getLeft() - ((C0984r1) view.getLayoutParams()).f3814b.left;
    }

    /* renamed from: E0 */
    public boolean m1583E0() {
        return false;
    }

    /* renamed from: F */
    public int m1582F(View view) {
        Rect rect = ((C0984r1) view.getLayoutParams()).f3814b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: F0 */
    public void m1581F0(C1007x1 c1007x1) {
        for (int m1492z = m1492z() - 1; m1492z >= 0; m1492z--) {
            if (!RecyclerView.m3189K(m1494y(m1492z)).m1651v()) {
                m1575I0(m1492z, c1007x1);
            }
        }
    }

    /* renamed from: G */
    public int m1580G(View view) {
        Rect rect = ((C0984r1) view.getLayoutParams()).f3814b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: G0 */
    public void m1579G0(C1007x1 c1007x1) {
        int size = c1007x1.f3892a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC0941g2) c1007x1.f3892a.get(i)).f3605c;
            AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
            if (!m3189K.m1651v()) {
                m3189K.m1652u(false);
                if (m3189K.m1657p()) {
                    this.f3773b.removeDetachedView(view, false);
                }
                AbstractC0956k1 abstractC0956k1 = this.f3773b.f743a0;
                if (abstractC0956k1 != null) {
                    abstractC0956k1.mo1610e(m3189K);
                }
                m3189K.m1652u(true);
                AbstractC0941g2 m3189K2 = RecyclerView.m3189K(view);
                m3189K2.f3618p = null;
                m3189K2.f3619q = false;
                m3189K2.m1669d();
                c1007x1.m1399i(m3189K2);
            }
        }
        c1007x1.f3892a.clear();
        ArrayList arrayList = c1007x1.f3893b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f3773b.invalidate();
        }
    }

    /* renamed from: H */
    public int m1578H(View view) {
        return view.getRight() + ((C0984r1) view.getLayoutParams()).f3814b.right;
    }

    /* renamed from: H0 */
    public void m1577H0(View view, C1007x1 c1007x1) {
        C0926d c0926d = this.f3772a;
        int indexOfChild = c0926d.f3550a.f3549a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (c0926d.f3551b.m1709f(indexOfChild)) {
                c0926d.m1691l(view);
            }
            c0926d.f3550a.m1704c(indexOfChild);
        }
        c1007x1.m1400h(view);
    }

    /* renamed from: I */
    public int m1576I(View view) {
        return view.getTop() - ((C0984r1) view.getLayoutParams()).f3814b.top;
    }

    /* renamed from: I0 */
    public void m1575I0(int i, C1007x1 c1007x1) {
        View m1494y = m1494y(i);
        m1573J0(i);
        c1007x1.m1400h(m1494y);
    }

    /* renamed from: J */
    public View m1574J() {
        View focusedChild;
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3772a.f3552c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    /* renamed from: J0 */
    public void m1573J0(int i) {
        C0926d c0926d;
        int m1697f;
        View m1706a;
        if (m1494y(i) == null || (m1706a = c0926d.f3550a.m1706a((m1697f = (c0926d = this.f3772a).m1697f(i)))) == null) {
            return;
        }
        if (c0926d.f3551b.m1709f(m1697f)) {
            c0926d.m1691l(m1706a);
        }
        c0926d.f3550a.m1704c(m1697f);
    }

    /* renamed from: K */
    public int m1572K() {
        RecyclerView recyclerView = this.f3773b;
        AbstractC0932e1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo543a();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r1 == false) goto L21;
     */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1571K0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int[] iArr = new int[2];
        int m1562P = m1562P();
        int m1558R = m1558R();
        int m1560Q = this.f3787p - m1560Q();
        int m1564O = this.f3788q - m1564O();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - m1562P;
        int min = Math.min(0, i);
        int i2 = top - m1558R;
        int min2 = Math.min(0, i2);
        int i3 = width - m1560Q;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - m1564O);
        if (m1570L() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i3);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        iArr[0] = max;
        iArr[1] = min2;
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int m1562P2 = m1562P();
                int m1558R2 = m1558R();
                int m1560Q2 = this.f3787p - m1560Q();
                int m1564O2 = this.f3788q - m1564O();
                Rect rect2 = this.f3773b.f769s;
                m1586D(focusedChild, rect2);
                boolean z3 = rect2.left - i4 < m1560Q2 && rect2.right - i4 > m1562P2 && rect2.top - i5 < m1564O2 && rect2.bottom - i5 > m1558R2;
            }
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.m3149m0(i4, i5, null, Integer.MIN_VALUE, false);
            }
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public int m1570L() {
        return AbstractC0605j0.m2241q(this.f3773b);
    }

    /* renamed from: L0 */
    public void m1569L0() {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: M */
    public int m1568M() {
        return AbstractC0605j0.m2240r(this.f3773b);
    }

    /* renamed from: M0 */
    public abstract int mo1567M0(int i, C1007x1 c1007x1, C0929d2 c0929d2);

    /* renamed from: N */
    public int m1566N() {
        return AbstractC0605j0.m2239s(this.f3773b);
    }

    /* renamed from: N0 */
    public abstract void mo1565N0(int i);

    /* renamed from: O */
    public int m1564O() {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: O0 */
    public abstract int mo1563O0(int i, C1007x1 c1007x1, C0929d2 c0929d2);

    /* renamed from: P */
    public int m1562P() {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: P0 */
    public void m1561P0(RecyclerView recyclerView) {
        m1559Q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: Q */
    public int m1560Q() {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: Q0 */
    public void m1559Q0(int i, int i2) {
        this.f3787p = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3785n = mode;
        if (mode == 0 && !RecyclerView.f701d) {
            this.f3787p = 0;
        }
        this.f3788q = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3786o = mode2;
        if (mode2 != 0 || RecyclerView.f701d) {
            return;
        }
        this.f3788q = 0;
    }

    /* renamed from: R */
    public int m1558R() {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: R0 */
    public void mo1557R0(Rect rect, int i, int i2) {
        int m1560Q = m1560Q() + m1562P() + rect.width();
        int m1564O = m1564O() + m1558R() + rect.height();
        this.f3773b.setMeasuredDimension(m1526i(i, m1560Q, m1566N()), m1526i(i2, m1564O, m1568M()));
    }

    /* renamed from: S */
    public int m1556S(View view) {
        return ((C0984r1) view.getLayoutParams()).m1473a();
    }

    /* renamed from: S0 */
    public void m1555S0(int i, int i2) {
        int m1492z = m1492z();
        if (m1492z == 0) {
            this.f3773b.m3146o(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < m1492z; i7++) {
            View m1494y = m1494y(i7);
            Rect rect = this.f3773b.f769s;
            m1586D(m1494y, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.f3773b.f769s.set(i5, i6, i3, i4);
        mo1557R0(this.f3773b.f769s, i, i2);
    }

    /* renamed from: T0 */
    public void m1553T0(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.f3773b = null;
            this.f3772a = null;
            height = 0;
            this.f3787p = 0;
        } else {
            this.f3773b = recyclerView;
            this.f3772a = recyclerView.f761o;
            this.f3787p = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.f3788q = height;
        this.f3785n = 1073741824;
        this.f3786o = 1073741824;
    }

    /* renamed from: U */
    public int mo1552U(C1007x1 c1007x1, C0929d2 c0929d2) {
        return -1;
    }

    /* renamed from: U0 */
    public boolean m1551U0(View view, int i, int i2, C0984r1 c0984r1) {
        return (!view.isLayoutRequested() && this.f3781j && m1543Z(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0984r1).width) && m1543Z(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0984r1).height)) ? false : true;
    }

    /* renamed from: V */
    public int m1550V() {
        return 0;
    }

    /* renamed from: V0 */
    public boolean mo1549V0() {
        return false;
    }

    /* renamed from: W */
    public void m1548W(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C0984r1) view.getLayoutParams()).f3814b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.f3773b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3773b.f773u;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: W0 */
    public boolean m1547W0(View view, int i, int i2, C0984r1 c0984r1) {
        return (this.f3781j && m1543Z(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0984r1).width) && m1543Z(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0984r1).height)) ? false : true;
    }

    /* renamed from: X */
    public abstract boolean mo1546X();

    /* renamed from: X0 */
    public abstract void mo554X0(RecyclerView recyclerView, C0929d2 c0929d2, int i);

    /* renamed from: Y */
    public boolean m1545Y() {
        return false;
    }

    /* renamed from: Y0 */
    public void m1544Y0(C0983r0 c0983r0) {
        C0983r0 c0983r02 = this.f3778g;
        if (c0983r02 != null && c0983r0 != c0983r02 && c0983r02.f3801e) {
            c0983r02.m1474f();
        }
        this.f3778g = c0983r0;
        RecyclerView recyclerView = this.f3773b;
        recyclerView.f764p0.m1673c();
        if (c0983r0.f3804h) {
            c0983r0.getClass().getSimpleName();
            c0983r0.getClass().getSimpleName();
        }
        c0983r0.f3798b = recyclerView;
        c0983r0.f3799c = this;
        int i = c0983r0.f3797a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f770s0.f3570a = i;
        c0983r0.f3801e = true;
        c0983r0.f3800d = true;
        c0983r0.f3802f = recyclerView.f777w.mo1502u(i);
        c0983r0.f3798b.f764p0.m1675a();
        c0983r0.f3804h = true;
    }

    /* renamed from: Z0 */
    public abstract boolean mo1542Z0();

    /* renamed from: a0 */
    public boolean m1541a0(View view, boolean z) {
        boolean z2 = this.f3776e.m1452b(view, 24579) && this.f3777f.m1452b(view, 24579);
        return z ? z2 : !z2;
    }

    /* renamed from: b */
    public void m1540b(View view) {
        m1538c(view, -1, false);
    }

    /* renamed from: b0 */
    public void m1539b0(View view, int i, int i2, int i3, int i4) {
        C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
        Rect rect = c0984r1.f3814b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0984r1).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0984r1).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0984r1).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0984r1).bottomMargin);
    }

    /* renamed from: c */
    public final void m1538c(View view, int i, boolean z) {
        AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
        if (z || m3189K.m1659n()) {
            this.f3773b.f763p.m1430a(m3189K);
        } else {
            this.f3773b.f763p.m1425f(m3189K);
        }
        C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
        if (m3189K.m1650w() || m3189K.m1658o()) {
            if (m3189K.m1658o()) {
                m3189K.f3618p.m1396l(m3189K);
            } else {
                m3189K.m1669d();
            }
            this.f3772a.m1701b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f3773b) {
                int m1693j = this.f3772a.m1693j(view);
                if (i == -1) {
                    i = this.f3772a.m1698e();
                }
                if (m1693j == -1) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    m1187i.append(this.f3773b.indexOfChild(view));
                    throw new IllegalStateException(AbstractC1124a.m1194b(this.f3773b, m1187i));
                } else if (m1693j != i) {
                    AbstractC0980q1 abstractC0980q1 = this.f3773b.f777w;
                    View m1494y = abstractC0980q1.m1494y(m1693j);
                    if (m1494y != null) {
                        abstractC0980q1.m1494y(m1693j);
                        abstractC0980q1.m1506s(m1693j);
                        C0984r1 c0984r12 = (C0984r1) m1494y.getLayoutParams();
                        AbstractC0941g2 m3189K2 = RecyclerView.m3189K(m1494y);
                        if (m3189K2.m1659n()) {
                            abstractC0980q1.f3773b.f763p.m1430a(m3189K2);
                        } else {
                            abstractC0980q1.f3773b.f763p.m1425f(m3189K2);
                        }
                        abstractC0980q1.f3772a.m1701b(m1494y, i, c0984r12, m3189K2.m1659n());
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + m1693j + abstractC0980q1.f3773b.toString());
                    }
                }
            } else {
                this.f3772a.m1702a(view, i, false);
                c0984r1.f3815c = true;
                C0983r0 c0983r0 = this.f3778g;
                if (c0983r0 != null && c0983r0.f3801e) {
                    c0983r0.f3798b.getClass();
                    AbstractC0941g2 m3189K3 = RecyclerView.m3189K(view);
                    if ((m3189K3 != null ? m3189K3.m1666g() : -1) == c0983r0.f3797a) {
                        c0983r0.f3802f = view;
                    }
                }
            }
        }
        if (c0984r1.f3816d) {
            m3189K.f3605c.invalidate();
            c0984r1.f3816d = false;
        }
    }

    /* renamed from: c0 */
    public void mo1537c0(int i) {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView != null) {
            int m1698e = recyclerView.f761o.m1698e();
            for (int i2 = 0; i2 < m1698e; i2++) {
                recyclerView.f761o.m1699d(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: d */
    public abstract void mo1536d(String str);

    /* renamed from: d0 */
    public void mo1535d0(int i) {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView != null) {
            int m1698e = recyclerView.f761o.m1698e();
            for (int i2 = 0; i2 < m1698e; i2++) {
                recyclerView.f761o.m1699d(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: e */
    public void m1534e(View view, Rect rect) {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m3188L(view));
        }
    }

    /* renamed from: e0 */
    public void mo1533e0(AbstractC0932e1 abstractC0932e1, AbstractC0932e1 abstractC0932e12) {
    }

    /* renamed from: f */
    public abstract boolean mo1532f();

    /* renamed from: f0 */
    public boolean m1531f0() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo1530g();

    /* renamed from: g0 */
    public void m1529g0() {
    }

    /* renamed from: h */
    public boolean mo1528h(C0984r1 c0984r1) {
        return c0984r1 != null;
    }

    @Deprecated
    /* renamed from: h0 */
    public void m1527h0() {
    }

    /* renamed from: i0 */
    public abstract void mo1525i0(RecyclerView recyclerView, C1007x1 c1007x1);

    /* renamed from: j */
    public abstract void mo1524j(int i, int i2, C0929d2 c0929d2, C0998v c0998v);

    /* renamed from: j0 */
    public abstract View mo1523j0(View view, int i, C1007x1 c1007x1, C0929d2 c0929d2);

    /* renamed from: k */
    public void mo1522k(int i, C0998v c0998v) {
    }

    /* renamed from: k0 */
    public abstract void mo1521k0(AccessibilityEvent accessibilityEvent);

    /* renamed from: l */
    public abstract int mo1520l(C0929d2 c0929d2);

    /* renamed from: l0 */
    public void m1519l0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3773b.canScrollVertically(-1) && !this.f3773b.canScrollHorizontally(-1) && !this.f3773b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC0932e1 abstractC0932e1 = this.f3773b.f775v;
        if (abstractC0932e1 != null) {
            accessibilityEvent.setItemCount(abstractC0932e1.mo543a());
        }
    }

    /* renamed from: m */
    public abstract int mo1518m(C0929d2 c0929d2);

    /* renamed from: m0 */
    public void m1517m0(View view, C0580e c0580e) {
        AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
        if (m3189K == null || m3189K.m1659n() || this.f3772a.m1692k(m3189K.f3605c)) {
            return;
        }
        RecyclerView recyclerView = this.f3773b;
        mo1515n0(recyclerView.f755l, recyclerView.f770s0, view, c0580e);
    }

    /* renamed from: n */
    public abstract int mo1516n(C0929d2 c0929d2);

    /* renamed from: n0 */
    public void mo1515n0(C1007x1 c1007x1, C0929d2 c0929d2, View view, C0580e c0580e) {
    }

    /* renamed from: o */
    public abstract int mo1514o(C0929d2 c0929d2);

    /* renamed from: o0 */
    public View m1513o0() {
        return null;
    }

    /* renamed from: p */
    public abstract int mo1512p(C0929d2 c0929d2);

    /* renamed from: p0 */
    public void mo1511p0(RecyclerView recyclerView, int i, int i2) {
    }

    /* renamed from: q */
    public abstract int mo1510q(C0929d2 c0929d2);

    /* renamed from: q0 */
    public void mo1509q0(RecyclerView recyclerView) {
    }

    /* renamed from: r */
    public void m1508r(C1007x1 c1007x1) {
        int m1492z = m1492z();
        while (true) {
            m1492z--;
            if (m1492z < 0) {
                return;
            }
            View m1494y = m1494y(m1492z);
            AbstractC0941g2 m3189K = RecyclerView.m3189K(m1494y);
            if (!m3189K.m1651v()) {
                if (m3189K.m1661l() && !m3189K.m1659n() && !this.f3773b.f775v.f3590b) {
                    m1573J0(m1492z);
                    c1007x1.m1399i(m3189K);
                } else {
                    m1494y(m1492z);
                    m1506s(m1492z);
                    c1007x1.m1398j(m1494y);
                    this.f3773b.f763p.m1425f(m3189K);
                }
            }
        }
    }

    /* renamed from: r0 */
    public void mo1507r0(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    /* renamed from: s */
    public final void m1506s(int i) {
        this.f3772a.m1700c(i);
    }

    /* renamed from: s0 */
    public void mo1505s0(RecyclerView recyclerView, int i, int i2) {
    }

    /* renamed from: t */
    public View m1504t(View view) {
        View m3197C;
        RecyclerView recyclerView = this.f3773b;
        if (recyclerView == null || (m3197C = recyclerView.m3197C(view)) == null || this.f3772a.f3552c.contains(m3197C)) {
            return null;
        }
        return m3197C;
    }

    /* renamed from: t0 */
    public void m1503t0() {
    }

    /* renamed from: u */
    public View mo1502u(int i) {
        int m1492z = m1492z();
        for (int i2 = 0; i2 < m1492z; i2++) {
            View m1494y = m1494y(i2);
            AbstractC0941g2 m3189K = RecyclerView.m3189K(m1494y);
            if (m3189K != null && m3189K.m1666g() == i && !m3189K.m1651v() && (this.f3773b.f770s0.f3576g || !m3189K.m1659n())) {
                return m1494y;
            }
        }
        return null;
    }

    /* renamed from: u0 */
    public void mo1501u0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m1503t0();
    }

    /* renamed from: v */
    public abstract C0984r1 mo1500v();

    /* renamed from: v0 */
    public abstract void mo1499v0(C1007x1 c1007x1, C0929d2 c0929d2);

    /* renamed from: w */
    public C0984r1 mo1498w(Context context, AttributeSet attributeSet) {
        return new C0984r1(context, attributeSet);
    }

    /* renamed from: w0 */
    public abstract void mo1497w0(C0929d2 c0929d2);

    /* renamed from: x */
    public C0984r1 mo1496x(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0984r1 ? new C0984r1((C0984r1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0984r1((ViewGroup.MarginLayoutParams) layoutParams) : new C0984r1(layoutParams);
    }

    /* renamed from: x0 */
    public void m1495x0(int i, int i2) {
        this.f3773b.m3146o(i, i2);
    }

    /* renamed from: y */
    public View m1494y(int i) {
        C0926d c0926d = this.f3772a;
        if (c0926d != null) {
            return c0926d.f3550a.m1706a(c0926d.m1697f(i));
        }
        return null;
    }

    @Deprecated
    /* renamed from: y0 */
    public boolean m1493y0(RecyclerView recyclerView) {
        C0983r0 c0983r0 = this.f3778g;
        return (c0983r0 != null && c0983r0.f3801e) || recyclerView.m3184P();
    }

    /* renamed from: z */
    public int m1492z() {
        C0926d c0926d = this.f3772a;
        if (c0926d != null) {
            return c0926d.m1698e();
        }
        return 0;
    }

    /* renamed from: z0 */
    public boolean m1491z0(RecyclerView recyclerView, View view, View view2) {
        return m1493y0(recyclerView);
    }
}