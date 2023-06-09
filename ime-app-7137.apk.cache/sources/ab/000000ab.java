package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0980q1;
import p010b.p083u.p084e.AbstractC0999v0;
import p010b.p083u.p084e.C0929d2;
import p010b.p083u.p084e.C0961l2;
import p010b.p083u.p084e.C0963m0;
import p010b.p083u.p084e.C0965m2;
import p010b.p083u.p084e.C0973o2;
import p010b.p083u.p084e.C0976p1;
import p010b.p083u.p084e.C0977p2;
import p010b.p083u.p084e.C0981q2;
import p010b.p083u.p084e.C0983r0;
import p010b.p083u.p084e.C0984r1;
import p010b.p083u.p084e.C0998v;
import p010b.p083u.p084e.C1007x1;
import p010b.p083u.p084e.InterfaceC0925c2;
import p010b.p083u.p084e.RunnableC0957k2;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0980q1 implements InterfaceC0925c2 {

    /* renamed from: A */
    public BitSet f786A;

    /* renamed from: F */
    public boolean f791F;

    /* renamed from: G */
    public boolean f792G;

    /* renamed from: H */
    public SavedState f793H;

    /* renamed from: I */
    public int f794I;

    /* renamed from: M */
    public int[] f798M;

    /* renamed from: r */
    public int f800r;

    /* renamed from: s */
    public C0981q2[] f801s;

    /* renamed from: t */
    public AbstractC0999v0 f802t;

    /* renamed from: u */
    public AbstractC0999v0 f803u;

    /* renamed from: v */
    public int f804v;

    /* renamed from: w */
    public int f805w;

    /* renamed from: x */
    public final C0963m0 f806x;

    /* renamed from: y */
    public boolean f807y;

    /* renamed from: z */
    public boolean f808z = false;

    /* renamed from: B */
    public int f787B = -1;

    /* renamed from: C */
    public int f788C = Integer.MIN_VALUE;

    /* renamed from: D */
    public C0973o2 f789D = new C0973o2();

    /* renamed from: E */
    public int f790E = 2;

    /* renamed from: J */
    public final Rect f795J = new Rect();

    /* renamed from: K */
    public final C0961l2 f796K = new C0961l2(this);

    /* renamed from: L */
    public boolean f797L = true;

    /* renamed from: N */
    public final Runnable f799N = new RunnableC0957k2(this);

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0977p2();

        /* renamed from: b */
        public int f809b;

        /* renamed from: c */
        public int f810c;

        /* renamed from: d */
        public int f811d;

        /* renamed from: e */
        public int[] f812e;

        /* renamed from: f */
        public int f813f;

        /* renamed from: g */
        public int[] f814g;

        /* renamed from: h */
        public List f815h;

        /* renamed from: i */
        public boolean f816i;

        /* renamed from: j */
        public boolean f817j;

        /* renamed from: k */
        public boolean f818k;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f809b = parcel.readInt();
            this.f810c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f811d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f812e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f813f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f814g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f816i = parcel.readInt() == 1;
            this.f817j = parcel.readInt() == 1;
            this.f818k = parcel.readInt() == 1;
            this.f815h = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f811d = savedState.f811d;
            this.f809b = savedState.f809b;
            this.f810c = savedState.f810c;
            this.f812e = savedState.f812e;
            this.f813f = savedState.f813f;
            this.f814g = savedState.f814g;
            this.f816i = savedState.f816i;
            this.f817j = savedState.f817j;
            this.f818k = savedState.f818k;
            this.f815h = savedState.f815h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f809b);
            parcel.writeInt(this.f810c);
            parcel.writeInt(this.f811d);
            if (this.f811d > 0) {
                parcel.writeIntArray(this.f812e);
            }
            parcel.writeInt(this.f813f);
            if (this.f813f > 0) {
                parcel.writeIntArray(this.f814g);
            }
            parcel.writeInt(this.f816i ? 1 : 0);
            parcel.writeInt(this.f817j ? 1 : 0);
            parcel.writeInt(this.f818k ? 1 : 0);
            parcel.writeList(this.f815h);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f800r = -1;
        this.f807y = false;
        C0976p1 m1554T = AbstractC0980q1.m1554T(context, attributeSet, i, i2);
        int i3 = m1554T.f3767a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1536d(null);
        if (i3 != this.f804v) {
            this.f804v = i3;
            AbstractC0999v0 abstractC0999v0 = this.f802t;
            this.f802t = this.f803u;
            this.f803u = abstractC0999v0;
            m1569L0();
        }
        int i4 = m1554T.f3768b;
        mo1536d(null);
        if (i4 != this.f800r) {
            this.f789D.m1601a();
            m1569L0();
            this.f800r = i4;
            this.f786A = new BitSet(this.f800r);
            this.f801s = new C0981q2[this.f800r];
            for (int i5 = 0; i5 < this.f800r; i5++) {
                this.f801s[i5] = new C0981q2(this, i5);
            }
            m1569L0();
        }
        boolean z = m1554T.f3769c;
        mo1536d(null);
        SavedState savedState = this.f793H;
        if (savedState != null && savedState.f816i != z) {
            savedState.f816i = z;
        }
        this.f807y = z;
        m1569L0();
        this.f806x = new C0963m0();
        this.f802t = AbstractC0999v0.m1446a(this, this.f804v);
        this.f803u = AbstractC0999v0.m1446a(this, 1 - this.f804v);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: A0 */
    public void mo1591A0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f793H = savedState;
            if (this.f787B != -1) {
                savedState.f812e = null;
                savedState.f811d = 0;
                savedState.f809b = -1;
                savedState.f810c = -1;
                savedState.f812e = null;
                savedState.f811d = 0;
                savedState.f813f = 0;
                savedState.f814g = null;
                savedState.f815h = null;
            }
            m1569L0();
        }
    }

    /* renamed from: A1 */
    public final void m3130A1(int i) {
        C0963m0 c0963m0 = this.f806x;
        c0963m0.f3717e = i;
        c0963m0.f3716d = this.f808z != (i == -1) ? -1 : 1;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: B0 */
    public Parcelable mo1589B0() {
        int m1480k;
        int mo1436k;
        int[] iArr;
        SavedState savedState = this.f793H;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f816i = this.f807y;
        savedState2.f817j = this.f791F;
        savedState2.f818k = this.f792G;
        C0973o2 c0973o2 = this.f789D;
        if (c0973o2 == null || (iArr = c0973o2.f3752a) == null) {
            savedState2.f813f = 0;
        } else {
            savedState2.f814g = iArr;
            savedState2.f813f = iArr.length;
            savedState2.f815h = c0973o2.f3753b;
        }
        if (m1492z() > 0) {
            savedState2.f809b = this.f791F ? m3114l1() : m3115k1();
            View m3119g1 = this.f808z ? m3119g1(true) : m3118h1(true);
            savedState2.f810c = m3119g1 != null ? m1556S(m3119g1) : -1;
            int i = this.f800r;
            savedState2.f811d = i;
            savedState2.f812e = new int[i];
            for (int i2 = 0; i2 < this.f800r; i2++) {
                if (this.f791F) {
                    m1480k = this.f801s[i2].m1483h(Integer.MIN_VALUE);
                    if (m1480k != Integer.MIN_VALUE) {
                        mo1436k = this.f802t.mo1440g();
                        m1480k -= mo1436k;
                        savedState2.f812e[i2] = m1480k;
                    } else {
                        savedState2.f812e[i2] = m1480k;
                    }
                } else {
                    m1480k = this.f801s[i2].m1480k(Integer.MIN_VALUE);
                    if (m1480k != Integer.MIN_VALUE) {
                        mo1436k = this.f802t.mo1436k();
                        m1480k -= mo1436k;
                        savedState2.f812e[i2] = m1480k;
                    } else {
                        savedState2.f812e[i2] = m1480k;
                    }
                }
            }
        } else {
            savedState2.f809b = -1;
            savedState2.f810c = -1;
            savedState2.f811d = 0;
        }
        return savedState2;
    }

    /* renamed from: B1 */
    public final void m3129B1(int i, int i2) {
        for (int i3 = 0; i3 < this.f800r; i3++) {
            if (!this.f801s[i3].f3789a.isEmpty()) {
                m3127D1(this.f801s[i3], i, i2);
            }
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: C0 */
    public void mo1587C0(int i) {
        if (i == 0) {
            m3124b1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* renamed from: C1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3128C1(int i, C0929d2 c0929d2) {
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        C0963m0 c0963m0 = this.f806x;
        boolean z = false;
        c0963m0.f3714b = 0;
        c0963m0.f3715c = i;
        C0983r0 c0983r0 = this.f3778g;
        if (!(c0983r0 != null && c0983r0.f3801e) || (i4 = c0929d2.f3570a) == -1) {
            i2 = 0;
        } else {
            if (this.f808z != (i4 < i)) {
                i3 = this.f802t.mo1435l();
                i2 = 0;
                recyclerView = this.f3773b;
                if (recyclerView == null && recyclerView.f765q) {
                    this.f806x.f3719g = this.f802t.mo1441f() + i2;
                    this.f806x.f3718f = -i3;
                } else {
                    this.f806x.f3718f = this.f802t.mo1436k() - i3;
                    this.f806x.f3719g = this.f802t.mo1440g() + i2;
                }
                C0963m0 c0963m02 = this.f806x;
                c0963m02.f3720h = false;
                c0963m02.f3713a = true;
                if (this.f802t.mo1438i() == 0 && this.f802t.mo1441f() == 0) {
                    z = true;
                }
                c0963m02.f3721i = z;
            }
            i2 = this.f802t.mo1435l();
        }
        i3 = 0;
        recyclerView = this.f3773b;
        if (recyclerView == null && recyclerView.f765q) {
        }
        C0963m0 c0963m022 = this.f806x;
        c0963m022.f3720h = false;
        c0963m022.f3713a = true;
        if (this.f802t.mo1438i() == 0) {
            z = true;
        }
        c0963m022.f3721i = z;
    }

    /* renamed from: D1 */
    public final void m3127D1(C0981q2 c0981q2, int i, int i2) {
        int i3 = c0981q2.f3792d;
        if (i == -1) {
            int i4 = c0981q2.f3790b;
            if (i4 == Integer.MIN_VALUE) {
                c0981q2.m1488c();
                i4 = c0981q2.f3790b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = c0981q2.f3791c;
            if (i5 == Integer.MIN_VALUE) {
                c0981q2.m1489b();
                i5 = c0981q2.f3791c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f786A.set(c0981q2.f3793e, false);
    }

    /* renamed from: E1 */
    public final int m3126E1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: M0 */
    public int mo1567M0(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        return m3100z1(i, c1007x1, c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: N0 */
    public void mo1565N0(int i) {
        SavedState savedState = this.f793H;
        if (savedState != null && savedState.f809b != i) {
            savedState.f812e = null;
            savedState.f811d = 0;
            savedState.f809b = -1;
            savedState.f810c = -1;
        }
        this.f787B = i;
        this.f788C = Integer.MIN_VALUE;
        m1569L0();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: O0 */
    public int mo1563O0(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        return m3100z1(i, c1007x1, c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: R0 */
    public void mo1557R0(Rect rect, int i, int i2) {
        int m1526i;
        int m1526i2;
        int m1560Q = m1560Q() + m1562P();
        int m1564O = m1564O() + m1558R();
        if (this.f804v == 1) {
            m1526i2 = AbstractC0980q1.m1526i(i2, rect.height() + m1564O, m1568M());
            m1526i = AbstractC0980q1.m1526i(i, (this.f805w * this.f800r) + m1560Q, m1566N());
        } else {
            m1526i = AbstractC0980q1.m1526i(i, rect.width() + m1560Q, m1566N());
            m1526i2 = AbstractC0980q1.m1526i(i2, (this.f805w * this.f800r) + m1564O, m1568M());
        }
        this.f3773b.setMeasuredDimension(m1526i, m1526i2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: X */
    public boolean mo1546X() {
        return this.f790E != 0;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: X0 */
    public void mo554X0(RecyclerView recyclerView, C0929d2 c0929d2, int i) {
        C0983r0 c0983r0 = new C0983r0(recyclerView.getContext());
        c0983r0.f3797a = i;
        m1544Y0(c0983r0);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: Z0 */
    public boolean mo1542Z0() {
        return this.f793H == null;
    }

    @Override // p010b.p083u.p084e.InterfaceC0925c2
    /* renamed from: a */
    public PointF mo1703a(int i) {
        int m3125a1 = m3125a1(i);
        PointF pointF = new PointF();
        if (m3125a1 == 0) {
            return null;
        }
        if (this.f804v == 0) {
            pointF.x = m3125a1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m3125a1;
        }
        return pointF;
    }

    /* renamed from: a1 */
    public final int m3125a1(int i) {
        if (m1492z() == 0) {
            return this.f808z ? 1 : -1;
        }
        return (i < m3115k1()) != this.f808z ? -1 : 1;
    }

    /* renamed from: b1 */
    public boolean m3124b1() {
        int m3115k1;
        if (m1492z() != 0 && this.f790E != 0 && this.f3780i) {
            if (this.f808z) {
                m3115k1 = m3114l1();
                m3115k1();
            } else {
                m3115k1 = m3115k1();
                m3114l1();
            }
            if (m3115k1 == 0 && m3110p1() != null) {
                this.f789D.m1601a();
                this.f3779h = true;
                m1569L0();
                return true;
            }
        }
        return false;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: c0 */
    public void mo1537c0(int i) {
        super.mo1537c0(i);
        for (int i2 = 0; i2 < this.f800r; i2++) {
            C0981q2 c0981q2 = this.f801s[i2];
            int i3 = c0981q2.f3790b;
            if (i3 != Integer.MIN_VALUE) {
                c0981q2.f3790b = i3 + i;
            }
            int i4 = c0981q2.f3791c;
            if (i4 != Integer.MIN_VALUE) {
                c0981q2.f3791c = i4 + i;
            }
        }
    }

    /* renamed from: c1 */
    public final int m3123c1(C0929d2 c0929d2) {
        if (m1492z() == 0) {
            return 0;
        }
        return AbstractC0022t.m3485l(c0929d2, this.f802t, m3118h1(!this.f797L), m3119g1(!this.f797L), this, this.f797L);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: d */
    public void mo1536d(String str) {
        RecyclerView recyclerView;
        if (this.f793H != null || (recyclerView = this.f3773b) == null) {
            return;
        }
        recyclerView.m3158i(str);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: d0 */
    public void mo1535d0(int i) {
        super.mo1535d0(i);
        for (int i2 = 0; i2 < this.f800r; i2++) {
            C0981q2 c0981q2 = this.f801s[i2];
            int i3 = c0981q2.f3790b;
            if (i3 != Integer.MIN_VALUE) {
                c0981q2.f3790b = i3 + i;
            }
            int i4 = c0981q2.f3791c;
            if (i4 != Integer.MIN_VALUE) {
                c0981q2.f3791c = i4 + i;
            }
        }
    }

    /* renamed from: d1 */
    public final int m3122d1(C0929d2 c0929d2) {
        if (m1492z() == 0) {
            return 0;
        }
        return AbstractC0022t.m3483m(c0929d2, this.f802t, m3118h1(!this.f797L), m3119g1(!this.f797L), this, this.f797L, this.f808z);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: e0 */
    public void mo1533e0(AbstractC0932e1 abstractC0932e1, AbstractC0932e1 abstractC0932e12) {
        this.f789D.m1601a();
        for (int i = 0; i < this.f800r; i++) {
            this.f801s[i].m1487d();
        }
    }

    /* renamed from: e1 */
    public final int m3121e1(C0929d2 c0929d2) {
        if (m1492z() == 0) {
            return 0;
        }
        return AbstractC0022t.m3481n(c0929d2, this.f802t, m3118h1(!this.f797L), m3119g1(!this.f797L), this, this.f797L);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: f */
    public boolean mo1532f() {
        return this.f804v == 0;
    }

    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* renamed from: f1 */
    public final int m3120f1(C1007x1 c1007x1, C0963m0 c0963m0, C0929d2 c0929d2) {
        int i;
        C0981q2 c0981q2;
        ?? r2;
        int m1592A;
        boolean z;
        int m1592A2;
        int m1480k;
        int mo1444c;
        int mo1436k;
        int mo1444c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2 = false;
        this.f786A.set(0, this.f800r, true);
        if (this.f806x.f3721i) {
            i = c0963m0.f3717e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = c0963m0.f3717e == 1 ? c0963m0.f3719g + c0963m0.f3714b : c0963m0.f3718f - c0963m0.f3714b;
        }
        m3129B1(c0963m0.f3717e, i);
        int mo1440g = this.f808z ? this.f802t.mo1440g() : this.f802t.mo1436k();
        boolean z3 = false;
        while (true) {
            int i8 = c0963m0.f3715c;
            if (!(i8 >= 0 && i8 < c0929d2.m1684b()) || (!this.f806x.f3721i && this.f786A.isEmpty())) {
                break;
            }
            View view = c1007x1.m1397k(c0963m0.f3715c, z2, Long.MAX_VALUE).f3605c;
            c0963m0.f3715c += c0963m0.f3716d;
            C0965m2 c0965m2 = (C0965m2) view.getLayoutParams();
            int m1473a = c0965m2.m1473a();
            int[] iArr = this.f789D.f3752a;
            int i9 = (iArr == null || m1473a >= iArr.length) ? -1 : iArr[m1473a];
            if (i9 == -1) {
                if (m3106t1(c0963m0.f3717e)) {
                    i6 = this.f800r - 1;
                    i5 = -1;
                    i7 = -1;
                } else {
                    i5 = this.f800r;
                    i6 = 0;
                    i7 = 1;
                }
                C0981q2 c0981q22 = null;
                if (c0963m0.f3717e == 1) {
                    int mo1436k2 = this.f802t.mo1436k();
                    int i10 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        C0981q2 c0981q23 = this.f801s[i6];
                        int m1483h = c0981q23.m1483h(mo1436k2);
                        if (m1483h < i10) {
                            c0981q22 = c0981q23;
                            i10 = m1483h;
                        }
                        i6 += i7;
                    }
                } else {
                    int mo1440g2 = this.f802t.mo1440g();
                    int i11 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        C0981q2 c0981q24 = this.f801s[i6];
                        int m1480k2 = c0981q24.m1480k(mo1440g2);
                        if (m1480k2 > i11) {
                            c0981q22 = c0981q24;
                            i11 = m1480k2;
                        }
                        i6 += i7;
                    }
                }
                c0981q2 = c0981q22;
                C0973o2 c0973o2 = this.f789D;
                c0973o2.m1600b(m1473a);
                c0973o2.f3752a[m1473a] = c0981q2.f3793e;
            } else {
                c0981q2 = this.f801s[i9];
            }
            C0981q2 c0981q25 = c0981q2;
            c0965m2.f3722e = c0981q25;
            if (c0963m0.f3717e == 1) {
                r2 = 0;
                m1538c(view, -1, false);
            } else {
                r2 = 0;
                m1538c(view, 0, false);
            }
            if (this.f804v == 1) {
                m1592A = AbstractC0980q1.m1592A(this.f805w, this.f3785n, r2, ((ViewGroup.MarginLayoutParams) c0965m2).width, r2);
                m1592A2 = AbstractC0980q1.m1592A(this.f3788q, this.f3786o, m1564O() + m1558R(), ((ViewGroup.MarginLayoutParams) c0965m2).height, true);
                z = false;
            } else {
                m1592A = AbstractC0980q1.m1592A(this.f3787p, this.f3785n, m1560Q() + m1562P(), ((ViewGroup.MarginLayoutParams) c0965m2).width, true);
                z = false;
                m1592A2 = AbstractC0980q1.m1592A(this.f805w, this.f3786o, 0, ((ViewGroup.MarginLayoutParams) c0965m2).height, false);
            }
            m3108r1(view, m1592A, m1592A2, z);
            if (c0963m0.f3717e == 1) {
                mo1444c = c0981q25.m1483h(mo1440g);
                m1480k = this.f802t.mo1444c(view) + mo1444c;
            } else {
                m1480k = c0981q25.m1480k(mo1440g);
                mo1444c = m1480k - this.f802t.mo1444c(view);
            }
            int i12 = c0963m0.f3717e;
            C0981q2 c0981q26 = c0965m2.f3722e;
            if (i12 == 1) {
                c0981q26.m1490a(view);
            } else {
                c0981q26.m1477n(view);
            }
            if (m3109q1() && this.f804v == 1) {
                mo1444c2 = this.f803u.mo1440g() - (((this.f800r - 1) - c0981q25.f3793e) * this.f805w);
                mo1436k = mo1444c2 - this.f803u.mo1444c(view);
            } else {
                mo1436k = this.f803u.mo1436k() + (c0981q25.f3793e * this.f805w);
                mo1444c2 = this.f803u.mo1444c(view) + mo1436k;
            }
            if (this.f804v == 1) {
                i3 = mo1444c2;
                i2 = m1480k;
                i4 = mo1436k;
                mo1436k = mo1444c;
            } else {
                i2 = mo1444c2;
                i3 = m1480k;
                i4 = mo1444c;
            }
            m1539b0(view, i4, mo1436k, i3, i2);
            m3127D1(c0981q25, this.f806x.f3717e, i);
            m3104v1(c1007x1, this.f806x);
            if (this.f806x.f3720h && view.hasFocusable()) {
                this.f786A.set(c0981q25.f3793e, false);
            }
            z3 = true;
            z2 = false;
        }
        if (!z3) {
            m3104v1(c1007x1, this.f806x);
        }
        int mo1436k3 = this.f806x.f3717e == -1 ? this.f802t.mo1436k() - m3112n1(this.f802t.mo1436k()) : m3113m1(this.f802t.mo1440g()) - this.f802t.mo1440g();
        if (mo1436k3 > 0) {
            return Math.min(c0963m0.f3714b, mo1436k3);
        }
        return 0;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: g */
    public boolean mo1530g() {
        return this.f804v == 1;
    }

    /* renamed from: g1 */
    public View m3119g1(boolean z) {
        int mo1436k = this.f802t.mo1436k();
        int mo1440g = this.f802t.mo1440g();
        View view = null;
        for (int m1492z = m1492z() - 1; m1492z >= 0; m1492z--) {
            View m1494y = m1494y(m1492z);
            int mo1442e = this.f802t.mo1442e(m1494y);
            int mo1445b = this.f802t.mo1445b(m1494y);
            if (mo1445b > mo1436k && mo1442e < mo1440g) {
                if (mo1445b <= mo1440g || !z) {
                    return m1494y;
                }
                if (view == null) {
                    view = m1494y;
                }
            }
        }
        return view;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: h */
    public boolean mo1528h(C0984r1 c0984r1) {
        return c0984r1 instanceof C0965m2;
    }

    /* renamed from: h1 */
    public View m3118h1(boolean z) {
        int mo1436k = this.f802t.mo1436k();
        int mo1440g = this.f802t.mo1440g();
        int m1492z = m1492z();
        View view = null;
        for (int i = 0; i < m1492z; i++) {
            View m1494y = m1494y(i);
            int mo1442e = this.f802t.mo1442e(m1494y);
            if (this.f802t.mo1445b(m1494y) > mo1436k && mo1442e < mo1440g) {
                if (mo1442e >= mo1436k || !z) {
                    return m1494y;
                }
                if (view == null) {
                    view = m1494y;
                }
            }
        }
        return view;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: i0 */
    public void mo1525i0(RecyclerView recyclerView, C1007x1 c1007x1) {
        m1527h0();
        Runnable runnable = this.f799N;
        RecyclerView recyclerView2 = this.f3773b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f800r; i++) {
            this.f801s[i].m1487d();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: i1 */
    public final void m3117i1(C1007x1 c1007x1, C0929d2 c0929d2, boolean z) {
        int mo1440g;
        int m3113m1 = m3113m1(Integer.MIN_VALUE);
        if (m3113m1 != Integer.MIN_VALUE && (mo1440g = this.f802t.mo1440g() - m3113m1) > 0) {
            int i = mo1440g - (-m3100z1(-mo1440g, c1007x1, c0929d2));
            if (!z || i <= 0) {
                return;
            }
            this.f802t.mo1431p(i);
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: j */
    public void mo1524j(int i, int i2, C0929d2 c0929d2, C0998v c0998v) {
        int m1483h;
        int i3;
        if (this.f804v != 0) {
            i = i2;
        }
        if (m1492z() == 0 || i == 0) {
            return;
        }
        m3105u1(i, c0929d2);
        int[] iArr = this.f798M;
        if (iArr == null || iArr.length < this.f800r) {
            this.f798M = new int[this.f800r];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f800r; i5++) {
            C0963m0 c0963m0 = this.f806x;
            if (c0963m0.f3716d == -1) {
                m1483h = c0963m0.f3718f;
                i3 = this.f801s[i5].m1480k(m1483h);
            } else {
                m1483h = this.f801s[i5].m1483h(c0963m0.f3719g);
                i3 = this.f806x.f3719g;
            }
            int i6 = m1483h - i3;
            if (i6 >= 0) {
                this.f798M[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f798M, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.f806x.f3715c;
            if (!(i8 >= 0 && i8 < c0929d2.m1684b())) {
                return;
            }
            c0998v.m1449a(this.f806x.f3715c, this.f798M[i7]);
            C0963m0 c0963m02 = this.f806x;
            c0963m02.f3715c += c0963m02.f3716d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r8.f804v == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
        if (r8.f804v == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
        if (m3109q1() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0058, code lost:
        if (m3109q1() == false) goto L113;
     */
    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo1523j0(View view, int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        View m1504t;
        int i2;
        if (m1492z() == 0 || (m1504t = m1504t(view)) == null) {
            return null;
        }
        m3101y1();
        if (i == 1) {
            if (this.f804v != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f804v != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0965m2 c0965m2 = (C0965m2) m1504t.getLayoutParams();
        c0965m2.getClass();
        C0981q2 c0981q2 = c0965m2.f3722e;
        int m3114l1 = i2 == 1 ? m3114l1() : m3115k1();
        m3128C1(m3114l1, c0929d2);
        m3130A1(i2);
        C0963m0 c0963m0 = this.f806x;
        c0963m0.f3715c = c0963m0.f3716d + m3114l1;
        c0963m0.f3714b = (int) (this.f802t.mo1435l() * 0.33333334f);
        C0963m0 c0963m02 = this.f806x;
        c0963m02.f3720h = true;
        c0963m02.f3713a = false;
        m3120f1(c1007x1, c0963m02, c0929d2);
        this.f791F = this.f808z;
        View m1482i = c0981q2.m1482i(m3114l1, i2);
        if (m1482i == null || m1482i == m1504t) {
            if (m3106t1(i2)) {
                for (int i3 = this.f800r - 1; i3 >= 0; i3--) {
                    View m1482i2 = this.f801s[i3].m1482i(m3114l1, i2);
                    if (m1482i2 != null && m1482i2 != m1504t) {
                        return m1482i2;
                    }
                }
            } else {
                for (int i4 = 0; i4 < this.f800r; i4++) {
                    View m1482i3 = this.f801s[i4].m1482i(m3114l1, i2);
                    if (m1482i3 != null && m1482i3 != m1504t) {
                        return m1482i3;
                    }
                }
            }
            boolean z = (this.f807y ^ true) == (i2 == -1);
            View mo1502u = mo1502u(z ? c0981q2.m1486e() : c0981q2.m1485f());
            if (mo1502u == null || mo1502u == m1504t) {
                if (m3106t1(i2)) {
                    for (int i5 = this.f800r - 1; i5 >= 0; i5--) {
                        if (i5 != c0981q2.f3793e) {
                            C0981q2[] c0981q2Arr = this.f801s;
                            View mo1502u2 = mo1502u(z ? c0981q2Arr[i5].m1486e() : c0981q2Arr[i5].m1485f());
                            if (mo1502u2 != null && mo1502u2 != m1504t) {
                                return mo1502u2;
                            }
                        }
                    }
                } else {
                    for (int i6 = 0; i6 < this.f800r; i6++) {
                        C0981q2[] c0981q2Arr2 = this.f801s;
                        View mo1502u3 = mo1502u(z ? c0981q2Arr2[i6].m1486e() : c0981q2Arr2[i6].m1485f());
                        if (mo1502u3 != null && mo1502u3 != m1504t) {
                            return mo1502u3;
                        }
                    }
                }
                return null;
            }
            return mo1502u;
        }
        return m1482i;
    }

    /* renamed from: j1 */
    public final void m3116j1(C1007x1 c1007x1, C0929d2 c0929d2, boolean z) {
        int mo1436k;
        int m3112n1 = m3112n1(Integer.MAX_VALUE);
        if (m3112n1 != Integer.MAX_VALUE && (mo1436k = m3112n1 - this.f802t.mo1436k()) > 0) {
            int m3100z1 = mo1436k - m3100z1(mo1436k, c1007x1, c0929d2);
            if (!z || m3100z1 <= 0) {
                return;
            }
            this.f802t.mo1431p(-m3100z1);
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: k0 */
    public void mo1521k0(AccessibilityEvent accessibilityEvent) {
        C1007x1 c1007x1 = this.f3773b.f755l;
        m1519l0(accessibilityEvent);
        if (m1492z() > 0) {
            View m3118h1 = m3118h1(false);
            View m3119g1 = m3119g1(false);
            if (m3118h1 == null || m3119g1 == null) {
                return;
            }
            int m1556S = m1556S(m3118h1);
            int m1556S2 = m1556S(m3119g1);
            if (m1556S < m1556S2) {
                accessibilityEvent.setFromIndex(m1556S);
                accessibilityEvent.setToIndex(m1556S2);
                return;
            }
            accessibilityEvent.setFromIndex(m1556S2);
            accessibilityEvent.setToIndex(m1556S);
        }
    }

    /* renamed from: k1 */
    public int m3115k1() {
        if (m1492z() == 0) {
            return 0;
        }
        return m1556S(m1494y(0));
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: l */
    public int mo1520l(C0929d2 c0929d2) {
        return m3123c1(c0929d2);
    }

    /* renamed from: l1 */
    public int m3114l1() {
        int m1492z = m1492z();
        if (m1492z == 0) {
            return 0;
        }
        return m1556S(m1494y(m1492z - 1));
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: m */
    public int mo1518m(C0929d2 c0929d2) {
        return m3122d1(c0929d2);
    }

    /* renamed from: m1 */
    public final int m3113m1(int i) {
        int m1483h = this.f801s[0].m1483h(i);
        for (int i2 = 1; i2 < this.f800r; i2++) {
            int m1483h2 = this.f801s[i2].m1483h(i);
            if (m1483h2 > m1483h) {
                m1483h = m1483h2;
            }
        }
        return m1483h;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: n */
    public int mo1516n(C0929d2 c0929d2) {
        return m3121e1(c0929d2);
    }

    /* renamed from: n1 */
    public final int m3112n1(int i) {
        int m1480k = this.f801s[0].m1480k(i);
        for (int i2 = 1; i2 < this.f800r; i2++) {
            int m1480k2 = this.f801s[i2].m1480k(i);
            if (m1480k2 < m1480k) {
                m1480k = m1480k2;
            }
        }
        return m1480k;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: o */
    public int mo1514o(C0929d2 c0929d2) {
        return m3123c1(c0929d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3111o1(int i, int i2, int i3) {
        int i4;
        int i5;
        int m3114l1 = this.f808z ? m3114l1() : m3115k1();
        if (i3 != 8) {
            i4 = i + i2;
        } else if (i >= i2) {
            i4 = i + 1;
            i5 = i2;
            this.f789D.m1598d(i5);
            if (i3 != 1) {
                this.f789D.m1597e(i, i2);
            } else if (i3 == 2) {
                this.f789D.m1596f(i, i2);
            } else if (i3 == 8) {
                this.f789D.m1596f(i, 1);
                this.f789D.m1597e(i2, 1);
            }
            if (i4 > m3114l1) {
                return;
            }
            if (i5 <= (this.f808z ? m3115k1() : m3114l1())) {
                m1569L0();
                return;
            }
            return;
        } else {
            i4 = i2 + 1;
        }
        i5 = i;
        this.f789D.m1598d(i5);
        if (i3 != 1) {
        }
        if (i4 > m3114l1) {
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: p */
    public int mo1512p(C0929d2 c0929d2) {
        return m3122d1(c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: p0 */
    public void mo1511p0(RecyclerView recyclerView, int i, int i2) {
        m3111o1(i, i2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
        r10 = false;
     */
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m3110p1() {
        int i;
        boolean z;
        Object obj;
        boolean z2;
        int m1492z = m1492z() - 1;
        BitSet bitSet = new BitSet(this.f800r);
        bitSet.set(0, this.f800r, true);
        char c = (this.f804v == 1 && m3109q1()) ? (char) 1 : (char) 65535;
        if (this.f808z) {
            i = -1;
        } else {
            i = m1492z + 1;
            m1492z = 0;
        }
        int i2 = m1492z < i ? 1 : -1;
        while (m1492z != i) {
            View m1494y = m1494y(m1492z);
            C0965m2 c0965m2 = (C0965m2) m1494y.getLayoutParams();
            if (bitSet.get(c0965m2.f3722e.f3793e)) {
                C0981q2 c0981q2 = c0965m2.f3722e;
                if (this.f808z) {
                    int i3 = c0981q2.f3791c;
                    if (i3 == Integer.MIN_VALUE) {
                        c0981q2.m1489b();
                        i3 = c0981q2.f3791c;
                    }
                    if (i3 < this.f802t.mo1440g()) {
                        ArrayList arrayList = c0981q2.f3789a;
                        obj = arrayList.get(arrayList.size() - 1);
                        c0981q2.m1481j((View) obj).getClass();
                        z2 = true;
                    }
                    z2 = false;
                } else {
                    int i4 = c0981q2.f3790b;
                    if (i4 == Integer.MIN_VALUE) {
                        c0981q2.m1488c();
                        i4 = c0981q2.f3790b;
                    }
                    if (i4 > this.f802t.mo1436k()) {
                        obj = c0981q2.f3789a.get(0);
                        c0981q2.m1481j((View) obj).getClass();
                        z2 = true;
                    }
                    z2 = false;
                }
                if (z2) {
                    return m1494y;
                }
                bitSet.clear(c0965m2.f3722e.f3793e);
            }
            int i5 = m1492z + i2;
            if (i5 != i) {
                View m1494y2 = m1494y(i5);
                if (this.f808z) {
                    int mo1445b = this.f802t.mo1445b(m1494y);
                    int mo1445b2 = this.f802t.mo1445b(m1494y2);
                    if (mo1445b < mo1445b2) {
                        return m1494y;
                    }
                } else {
                    int mo1442e = this.f802t.mo1442e(m1494y);
                    int mo1442e2 = this.f802t.mo1442e(m1494y2);
                    if (mo1442e > mo1442e2) {
                        return m1494y;
                    }
                }
                if (z) {
                    if ((c0965m2.f3722e.f3793e - ((C0965m2) m1494y2.getLayoutParams()).f3722e.f3793e < 0) != (c < 0)) {
                        return m1494y;
                    }
                } else {
                    continue;
                }
            }
            m1492z += i2;
        }
        return null;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: q */
    public int mo1510q(C0929d2 c0929d2) {
        return m3121e1(c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: q0 */
    public void mo1509q0(RecyclerView recyclerView) {
        this.f789D.m1601a();
        m1569L0();
    }

    /* renamed from: q1 */
    public boolean m3109q1() {
        return m1570L() == 1;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: r0 */
    public void mo1507r0(RecyclerView recyclerView, int i, int i2, int i3) {
        m3111o1(i, i2, 8);
    }

    /* renamed from: r1 */
    public final void m3108r1(View view, int i, int i2, boolean z) {
        m1534e(view, this.f795J);
        C0965m2 c0965m2 = (C0965m2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0965m2).leftMargin;
        Rect rect = this.f795J;
        int m3126E1 = m3126E1(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c0965m2).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0965m2).topMargin;
        Rect rect2 = this.f795J;
        int m3126E12 = m3126E1(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c0965m2).bottomMargin + rect2.bottom);
        if (z ? m1547W0(view, m3126E1, m3126E12, c0965m2) : m1551U0(view, m3126E1, m3126E12, c0965m2)) {
            view.measure(m3126E1, m3126E12);
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: s0 */
    public void mo1505s0(RecyclerView recyclerView, int i, int i2) {
        m3111o1(i, i2, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x03f9, code lost:
        if (m3124b1() != false) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac  */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3107s1(C1007x1 c1007x1, C0929d2 c0929d2, boolean z) {
        SavedState savedState;
        boolean z2;
        int i;
        int i2;
        int mo1440g;
        int i3;
        int mo1436k;
        int mo1442e;
        boolean z3;
        C0961l2 c0961l2 = this.f796K;
        if (!(this.f793H == null && this.f787B == -1) && c0929d2.m1684b() == 0) {
            m1581F0(c1007x1);
            c0961l2.m1616b();
            return;
        }
        boolean z4 = true;
        boolean z5 = (c0961l2.f3704e && this.f787B == -1 && this.f793H == null) ? false : true;
        if (z5) {
            c0961l2.m1616b();
            SavedState savedState2 = this.f793H;
            if (savedState2 != null) {
                int i4 = savedState2.f811d;
                if (i4 > 0) {
                    if (i4 == this.f800r) {
                        for (int i5 = 0; i5 < this.f800r; i5++) {
                            this.f801s[i5].m1487d();
                            SavedState savedState3 = this.f793H;
                            int i6 = savedState3.f812e[i5];
                            if (i6 != Integer.MIN_VALUE) {
                                i6 += savedState3.f817j ? this.f802t.mo1440g() : this.f802t.mo1436k();
                            }
                            C0981q2 c0981q2 = this.f801s[i5];
                            c0981q2.f3790b = i6;
                            c0981q2.f3791c = i6;
                        }
                    } else {
                        savedState2.f812e = null;
                        savedState2.f811d = 0;
                        savedState2.f813f = 0;
                        savedState2.f814g = null;
                        savedState2.f815h = null;
                        savedState2.f809b = savedState2.f810c;
                    }
                }
                SavedState savedState4 = this.f793H;
                this.f792G = savedState4.f818k;
                boolean z6 = savedState4.f816i;
                mo1536d(null);
                SavedState savedState5 = this.f793H;
                if (savedState5 != null && savedState5.f816i != z6) {
                    savedState5.f816i = z6;
                }
                this.f807y = z6;
                m1569L0();
                m3101y1();
                SavedState savedState6 = this.f793H;
                int i7 = savedState6.f809b;
                if (i7 != -1) {
                    this.f787B = i7;
                    z3 = savedState6.f817j;
                } else {
                    z3 = this.f808z;
                }
                c0961l2.f3702c = z3;
                if (savedState6.f813f > 1) {
                    C0973o2 c0973o2 = this.f789D;
                    c0973o2.f3752a = savedState6.f814g;
                    c0973o2.f3753b = savedState6.f815h;
                }
            } else {
                m3101y1();
                c0961l2.f3702c = this.f808z;
            }
            if (!c0929d2.f3576g && (i2 = this.f787B) != -1) {
                if (i2 < 0 || i2 >= c0929d2.m1684b()) {
                    this.f787B = -1;
                    this.f788C = Integer.MIN_VALUE;
                } else {
                    SavedState savedState7 = this.f793H;
                    if (savedState7 == null || savedState7.f809b == -1 || savedState7.f811d < 1) {
                        View mo1502u = mo1502u(this.f787B);
                        if (mo1502u != null) {
                            c0961l2.f3700a = this.f808z ? m3114l1() : m3115k1();
                            if (this.f788C != Integer.MIN_VALUE) {
                                if (c0961l2.f3702c) {
                                    mo1436k = this.f802t.mo1440g() - this.f788C;
                                    mo1442e = this.f802t.mo1445b(mo1502u);
                                } else {
                                    mo1436k = this.f802t.mo1436k() + this.f788C;
                                    mo1442e = this.f802t.mo1442e(mo1502u);
                                }
                                mo1440g = mo1436k - mo1442e;
                            } else {
                                if (this.f802t.mo1444c(mo1502u) > this.f802t.mo1435l()) {
                                    i3 = c0961l2.f3702c ? this.f802t.mo1440g() : this.f802t.mo1436k();
                                } else {
                                    int mo1442e2 = this.f802t.mo1442e(mo1502u) - this.f802t.mo1436k();
                                    if (mo1442e2 < 0) {
                                        i3 = -mo1442e2;
                                    } else {
                                        mo1440g = this.f802t.mo1440g() - this.f802t.mo1445b(mo1502u);
                                        if (mo1440g >= 0) {
                                            c0961l2.f3701b = Integer.MIN_VALUE;
                                        }
                                    }
                                }
                                c0961l2.f3701b = i3;
                            }
                            c0961l2.f3701b = mo1440g;
                        } else {
                            int i8 = this.f787B;
                            c0961l2.f3700a = i8;
                            int i9 = this.f788C;
                            if (i9 == Integer.MIN_VALUE) {
                                c0961l2.f3702c = m3125a1(i8) == 1;
                                c0961l2.m1617a();
                            } else {
                                c0961l2.f3701b = c0961l2.f3702c ? c0961l2.f3706g.f802t.mo1440g() - i9 : c0961l2.f3706g.f802t.mo1436k() + i9;
                            }
                            c0961l2.f3703d = true;
                        }
                    } else {
                        c0961l2.f3701b = Integer.MIN_VALUE;
                        c0961l2.f3700a = this.f787B;
                    }
                    z2 = true;
                    if (!z2) {
                        boolean z7 = this.f791F;
                        int m1684b = c0929d2.m1684b();
                        if (z7) {
                            int m1492z = m1492z();
                            while (true) {
                                m1492z--;
                                if (m1492z < 0) {
                                    break;
                                }
                                i = m1556S(m1494y(m1492z));
                                if (i >= 0 && i < m1684b) {
                                    break;
                                }
                            }
                            i = 0;
                            c0961l2.f3700a = i;
                            c0961l2.f3701b = Integer.MIN_VALUE;
                        } else {
                            int m1492z2 = m1492z();
                            for (int i10 = 0; i10 < m1492z2; i10++) {
                                int m1556S = m1556S(m1494y(i10));
                                if (m1556S >= 0 && m1556S < m1684b) {
                                    i = m1556S;
                                    break;
                                }
                            }
                            i = 0;
                            c0961l2.f3700a = i;
                            c0961l2.f3701b = Integer.MIN_VALUE;
                        }
                    }
                    c0961l2.f3704e = true;
                }
            }
            z2 = false;
            if (!z2) {
            }
            c0961l2.f3704e = true;
        }
        if (this.f793H == null && this.f787B == -1 && (c0961l2.f3702c != this.f791F || m3109q1() != this.f792G)) {
            this.f789D.m1601a();
            c0961l2.f3703d = true;
        }
        if (m1492z() > 0 && ((savedState = this.f793H) == null || savedState.f811d < 1)) {
            if (c0961l2.f3703d) {
                for (int i11 = 0; i11 < this.f800r; i11++) {
                    this.f801s[i11].m1487d();
                    int i12 = c0961l2.f3701b;
                    if (i12 != Integer.MIN_VALUE) {
                        C0981q2 c0981q22 = this.f801s[i11];
                        c0981q22.f3790b = i12;
                        c0981q22.f3791c = i12;
                    }
                }
            } else if (z5 || this.f796K.f3705f == null) {
                for (int i13 = 0; i13 < this.f800r; i13++) {
                    C0981q2 c0981q23 = this.f801s[i13];
                    boolean z8 = this.f808z;
                    int i14 = c0961l2.f3701b;
                    int m1483h = z8 ? c0981q23.m1483h(Integer.MIN_VALUE) : c0981q23.m1480k(Integer.MIN_VALUE);
                    c0981q23.m1487d();
                    if (m1483h != Integer.MIN_VALUE && ((!z8 || m1483h >= c0981q23.f3794f.f802t.mo1440g()) && (z8 || m1483h <= c0981q23.f3794f.f802t.mo1436k()))) {
                        if (i14 != Integer.MIN_VALUE) {
                            m1483h += i14;
                        }
                        c0981q23.f3791c = m1483h;
                        c0981q23.f3790b = m1483h;
                    }
                }
                C0961l2 c0961l22 = this.f796K;
                C0981q2[] c0981q2Arr = this.f801s;
                c0961l22.getClass();
                int length = c0981q2Arr.length;
                int[] iArr = c0961l22.f3705f;
                if (iArr == null || iArr.length < length) {
                    c0961l22.f3705f = new int[c0961l22.f3706g.f801s.length];
                }
                for (int i15 = 0; i15 < length; i15++) {
                    c0961l22.f3705f[i15] = c0981q2Arr[i15].m1480k(Integer.MIN_VALUE);
                }
            } else {
                for (int i16 = 0; i16 < this.f800r; i16++) {
                    C0981q2 c0981q24 = this.f801s[i16];
                    c0981q24.m1487d();
                    int i17 = this.f796K.f3705f[i16];
                    c0981q24.f3790b = i17;
                    c0981q24.f3791c = i17;
                }
            }
        }
        m1508r(c1007x1);
        this.f806x.f3713a = false;
        int mo1435l = this.f803u.mo1435l();
        this.f805w = mo1435l / this.f800r;
        this.f794I = View.MeasureSpec.makeMeasureSpec(mo1435l, this.f803u.mo1438i());
        m3128C1(c0961l2.f3700a, c0929d2);
        if (c0961l2.f3702c) {
            m3130A1(-1);
            m3120f1(c1007x1, this.f806x, c0929d2);
            m3130A1(1);
        } else {
            m3130A1(1);
            m3120f1(c1007x1, this.f806x, c0929d2);
            m3130A1(-1);
        }
        C0963m0 c0963m0 = this.f806x;
        c0963m0.f3715c = c0961l2.f3700a + c0963m0.f3716d;
        m3120f1(c1007x1, c0963m0, c0929d2);
        if (this.f803u.mo1438i() != 1073741824) {
            float f = 0.0f;
            int m1492z3 = m1492z();
            for (int i18 = 0; i18 < m1492z3; i18++) {
                View m1494y = m1494y(i18);
                float mo1444c = this.f803u.mo1444c(m1494y);
                if (mo1444c >= f) {
                    ((C0965m2) m1494y.getLayoutParams()).getClass();
                    f = Math.max(f, mo1444c);
                }
            }
            int i19 = this.f805w;
            int round = Math.round(f * this.f800r);
            if (this.f803u.mo1438i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f803u.mo1435l());
            }
            this.f805w = round / this.f800r;
            this.f794I = View.MeasureSpec.makeMeasureSpec(round, this.f803u.mo1438i());
            if (this.f805w != i19) {
                for (int i20 = 0; i20 < m1492z3; i20++) {
                    View m1494y2 = m1494y(i20);
                    C0965m2 c0965m2 = (C0965m2) m1494y2.getLayoutParams();
                    c0965m2.getClass();
                    if (m3109q1() && this.f804v == 1) {
                        int i21 = this.f800r;
                        int i22 = c0965m2.f3722e.f3793e;
                        m1494y2.offsetLeftAndRight(((-((i21 - 1) - i22)) * this.f805w) - ((-((i21 - 1) - i22)) * i19));
                    } else {
                        int i23 = c0965m2.f3722e.f3793e;
                        int i24 = this.f804v;
                        int i25 = (this.f805w * i23) - (i23 * i19);
                        if (i24 == 1) {
                            m1494y2.offsetLeftAndRight(i25);
                        } else {
                            m1494y2.offsetTopAndBottom(i25);
                        }
                    }
                }
            }
        }
        if (m1492z() > 0) {
            if (this.f808z) {
                m3117i1(c1007x1, c0929d2, true);
                m3116j1(c1007x1, c0929d2, false);
            } else {
                m3116j1(c1007x1, c0929d2, true);
                m3117i1(c1007x1, c0929d2, false);
            }
        }
        if (z && !c0929d2.f3576g) {
            if ((this.f790E == 0 || m1492z() <= 0 || m3110p1() == null) ? false : true) {
                Runnable runnable = this.f799N;
                RecyclerView recyclerView = this.f3773b;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(runnable);
                }
            }
        }
        z4 = false;
        if (c0929d2.f3576g) {
            this.f796K.m1616b();
        }
        this.f791F = c0961l2.f3702c;
        this.f792G = m3109q1();
        if (z4) {
            this.f796K.m1616b();
            m3107s1(c1007x1, c0929d2, false);
        }
    }

    /* renamed from: t1 */
    public final boolean m3106t1(int i) {
        if (this.f804v == 0) {
            return (i == -1) != this.f808z;
        }
        return ((i == -1) == this.f808z) == m3109q1();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: u0 */
    public void mo1501u0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3111o1(i, i2, 4);
    }

    /* renamed from: u1 */
    public void m3105u1(int i, C0929d2 c0929d2) {
        int m3115k1;
        int i2;
        if (i > 0) {
            m3115k1 = m3114l1();
            i2 = 1;
        } else {
            m3115k1 = m3115k1();
            i2 = -1;
        }
        this.f806x.f3713a = true;
        m3128C1(m3115k1, c0929d2);
        m3130A1(i2);
        C0963m0 c0963m0 = this.f806x;
        c0963m0.f3715c = m3115k1 + c0963m0.f3716d;
        c0963m0.f3714b = Math.abs(i);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: v */
    public C0984r1 mo1500v() {
        return this.f804v == 0 ? new C0965m2(-2, -1) : new C0965m2(-1, -2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: v0 */
    public void mo1499v0(C1007x1 c1007x1, C0929d2 c0929d2) {
        m3107s1(c1007x1, c0929d2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r6.f3717e == (-1)) goto L9;
     */
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3104v1(C1007x1 c1007x1, C0963m0 c0963m0) {
        int min;
        int min2;
        if (!c0963m0.f3713a || c0963m0.f3721i) {
            return;
        }
        if (c0963m0.f3714b != 0) {
            int i = 1;
            if (c0963m0.f3717e == -1) {
                int i2 = c0963m0.f3718f;
                int m1480k = this.f801s[0].m1480k(i2);
                while (i < this.f800r) {
                    int m1480k2 = this.f801s[i].m1480k(i2);
                    if (m1480k2 > m1480k) {
                        m1480k = m1480k2;
                    }
                    i++;
                }
                int i3 = i2 - m1480k;
                if (i3 >= 0) {
                    min2 = c0963m0.f3719g - Math.min(i3, c0963m0.f3714b);
                    m3103w1(c1007x1, min2);
                    return;
                }
                min2 = c0963m0.f3719g;
                m3103w1(c1007x1, min2);
                return;
            }
            int i4 = c0963m0.f3719g;
            int m1483h = this.f801s[0].m1483h(i4);
            while (i < this.f800r) {
                int m1483h2 = this.f801s[i].m1483h(i4);
                if (m1483h2 < m1483h) {
                    m1483h = m1483h2;
                }
                i++;
            }
            int i5 = m1483h - c0963m0.f3719g;
            if (i5 >= 0) {
                min = Math.min(i5, c0963m0.f3714b) + c0963m0.f3718f;
                m3102x1(c1007x1, min);
            }
            min = c0963m0.f3718f;
            m3102x1(c1007x1, min);
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: w */
    public C0984r1 mo1498w(Context context, AttributeSet attributeSet) {
        return new C0965m2(context, attributeSet);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: w0 */
    public void mo1497w0(C0929d2 c0929d2) {
        this.f787B = -1;
        this.f788C = Integer.MIN_VALUE;
        this.f793H = null;
        this.f796K.m1616b();
    }

    /* renamed from: w1 */
    public final void m3103w1(C1007x1 c1007x1, int i) {
        for (int m1492z = m1492z() - 1; m1492z >= 0; m1492z--) {
            View m1494y = m1494y(m1492z);
            if (this.f802t.mo1442e(m1494y) < i || this.f802t.mo1432o(m1494y) < i) {
                return;
            }
            C0965m2 c0965m2 = (C0965m2) m1494y.getLayoutParams();
            c0965m2.getClass();
            if (c0965m2.f3722e.f3789a.size() == 1) {
                return;
            }
            c0965m2.f3722e.m1479l();
            m1577H0(m1494y, c1007x1);
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: x */
    public C0984r1 mo1496x(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0965m2((ViewGroup.MarginLayoutParams) layoutParams) : new C0965m2(layoutParams);
    }

    /* renamed from: x1 */
    public final void m3102x1(C1007x1 c1007x1, int i) {
        while (m1492z() > 0) {
            View m1494y = m1494y(0);
            if (this.f802t.mo1445b(m1494y) > i || this.f802t.mo1433n(m1494y) > i) {
                return;
            }
            C0965m2 c0965m2 = (C0965m2) m1494y.getLayoutParams();
            c0965m2.getClass();
            if (c0965m2.f3722e.f3789a.size() == 1) {
                return;
            }
            c0965m2.f3722e.m1478m();
            m1577H0(m1494y, c1007x1);
        }
    }

    /* renamed from: y1 */
    public final void m3101y1() {
        this.f808z = (this.f804v == 1 || !m3109q1()) ? this.f807y : !this.f807y;
    }

    /* renamed from: z1 */
    public int m3100z1(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        if (m1492z() == 0 || i == 0) {
            return 0;
        }
        m3105u1(i, c0929d2);
        int m3120f1 = m3120f1(c1007x1, this.f806x, c0929d2);
        if (this.f806x.f3714b >= m3120f1) {
            i = i < 0 ? -m3120f1 : m3120f1;
        }
        this.f802t.mo1431p(-i);
        this.f791F = this.f808z;
        C0963m0 c0963m0 = this.f806x;
        c0963m0.f3714b = 0;
        m3104v1(c1007x1, c0963m0);
        return i;
    }
}