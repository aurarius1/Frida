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
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p083u.p084e.AbstractC0941g2;
import p010b.p083u.p084e.AbstractC0980q1;
import p010b.p083u.p084e.AbstractC0999v0;
import p010b.p083u.p084e.C0929d2;
import p010b.p083u.p084e.C0967n0;
import p010b.p083u.p084e.C0971o0;
import p010b.p083u.p084e.C0975p0;
import p010b.p083u.p084e.C0976p1;
import p010b.p083u.p084e.C0979q0;
import p010b.p083u.p084e.C0983r0;
import p010b.p083u.p084e.C0984r1;
import p010b.p083u.p084e.C0998v;
import p010b.p083u.p084e.C1007x1;
import p010b.p083u.p084e.InterfaceC0925c2;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0980q1 implements InterfaceC0925c2 {

    /* renamed from: A */
    public int f681A;

    /* renamed from: B */
    public SavedState f682B;

    /* renamed from: C */
    public final C0967n0 f683C;

    /* renamed from: D */
    public final C0971o0 f684D;

    /* renamed from: E */
    public int f685E;

    /* renamed from: F */
    public int[] f686F;

    /* renamed from: r */
    public int f687r;

    /* renamed from: s */
    public C0975p0 f688s;

    /* renamed from: t */
    public AbstractC0999v0 f689t;

    /* renamed from: u */
    public boolean f690u;

    /* renamed from: v */
    public boolean f691v;

    /* renamed from: w */
    public boolean f692w;

    /* renamed from: x */
    public boolean f693x;

    /* renamed from: y */
    public boolean f694y;

    /* renamed from: z */
    public int f695z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0979q0();

        /* renamed from: b */
        public int f696b;

        /* renamed from: c */
        public int f697c;

        /* renamed from: d */
        public boolean f698d;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f696b = parcel.readInt();
            this.f697c = parcel.readInt();
            this.f698d = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f696b = savedState.f696b;
            this.f697c = savedState.f697c;
            this.f698d = savedState.f698d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: k */
        public boolean m3200k() {
            return this.f696b >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f696b);
            parcel.writeInt(this.f697c);
            parcel.writeInt(this.f698d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.f687r = 1;
        this.f691v = false;
        this.f692w = false;
        this.f693x = false;
        this.f694y = true;
        this.f695z = -1;
        this.f681A = Integer.MIN_VALUE;
        this.f682B = null;
        this.f683C = new C0967n0();
        this.f684D = new C0971o0();
        this.f685E = 2;
        this.f686F = new int[2];
        m3230D1(i);
        mo1536d(null);
        if (z == this.f691v) {
            return;
        }
        this.f691v = z;
        m1569L0();
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: A0 */
    public void mo1591A0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f682B = savedState;
            if (this.f695z != -1) {
                savedState.f696b = -1;
            }
            m1569L0();
        }
    }

    /* renamed from: A1 */
    public final void m3233A1() {
        this.f692w = (this.f687r == 1 || !m3207t1()) ? this.f691v : !this.f691v;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: B0 */
    public Parcelable mo1589B0() {
        SavedState savedState = this.f682B;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (m1492z() > 0) {
            m3220g1();
            boolean z = this.f690u ^ this.f692w;
            savedState2.f698d = z;
            if (z) {
                View m3209r1 = m3209r1();
                savedState2.f697c = this.f689t.mo1440g() - this.f689t.mo1445b(m3209r1);
                savedState2.f696b = m1556S(m3209r1);
            } else {
                View m3208s1 = m3208s1();
                savedState2.f696b = m1556S(m3208s1);
                savedState2.f697c = this.f689t.mo1442e(m3208s1) - this.f689t.mo1436k();
            }
        } else {
            savedState2.f696b = -1;
        }
        return savedState2;
    }

    /* renamed from: B1 */
    public int m3232B1(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        if (m1492z() == 0 || i == 0) {
            return 0;
        }
        m3220g1();
        this.f688s.f3755a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m3228F1(i2, abs, true, c0929d2);
        C0975p0 c0975p0 = this.f688s;
        int m3219h1 = m3219h1(c1007x1, c0975p0, c0929d2, false) + c0975p0.f3761g;
        if (m3219h1 < 0) {
            return 0;
        }
        if (abs > m3219h1) {
            i = i2 * m3219h1;
        }
        this.f689t.mo1431p(-i);
        this.f688s.f3764j = i;
        return i;
    }

    /* renamed from: C1 */
    public void m3231C1(int i, int i2) {
        this.f695z = i;
        this.f681A = i2;
        SavedState savedState = this.f682B;
        if (savedState != null) {
            savedState.f696b = -1;
        }
        m1569L0();
    }

    /* renamed from: D1 */
    public void m3230D1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1124a.m1193c("invalid orientation:", i));
        }
        mo1536d(null);
        if (i != this.f687r || this.f689t == null) {
            AbstractC0999v0 m1446a = AbstractC0999v0.m1446a(this, i);
            this.f689t = m1446a;
            this.f683C.f3728a = m1446a;
            this.f687r = i;
            m1569L0();
        }
    }

    /* renamed from: E1 */
    public void mo3229E1(boolean z) {
        mo1536d(null);
        if (this.f693x == z) {
            return;
        }
        this.f693x = z;
        m1569L0();
    }

    /* renamed from: F1 */
    public final void m3228F1(int i, int i2, boolean z, C0929d2 c0929d2) {
        int mo1436k;
        this.f688s.f3766l = m3201z1();
        this.f688s.f3760f = i;
        int[] iArr = this.f686F;
        iArr[0] = 0;
        iArr[1] = 0;
        mo553a1(c0929d2, iArr);
        int max = Math.max(0, this.f686F[0]);
        int max2 = Math.max(0, this.f686F[1]);
        boolean z2 = i == 1;
        C0975p0 c0975p0 = this.f688s;
        int i3 = z2 ? max2 : max;
        c0975p0.f3762h = i3;
        if (!z2) {
            max = max2;
        }
        c0975p0.f3763i = max;
        if (z2) {
            c0975p0.f3762h = this.f689t.mo1439h() + i3;
            View m3209r1 = m3209r1();
            C0975p0 c0975p02 = this.f688s;
            c0975p02.f3759e = this.f692w ? -1 : 1;
            int m1556S = m1556S(m3209r1);
            C0975p0 c0975p03 = this.f688s;
            c0975p02.f3758d = m1556S + c0975p03.f3759e;
            c0975p03.f3756b = this.f689t.mo1445b(m3209r1);
            mo1436k = this.f689t.mo1445b(m3209r1) - this.f689t.mo1440g();
        } else {
            View m3208s1 = m3208s1();
            C0975p0 c0975p04 = this.f688s;
            c0975p04.f3762h = this.f689t.mo1436k() + c0975p04.f3762h;
            C0975p0 c0975p05 = this.f688s;
            c0975p05.f3759e = this.f692w ? 1 : -1;
            int m1556S2 = m1556S(m3208s1);
            C0975p0 c0975p06 = this.f688s;
            c0975p05.f3758d = m1556S2 + c0975p06.f3759e;
            c0975p06.f3756b = this.f689t.mo1442e(m3208s1);
            mo1436k = (-this.f689t.mo1442e(m3208s1)) + this.f689t.mo1436k();
        }
        C0975p0 c0975p07 = this.f688s;
        c0975p07.f3757c = i2;
        if (z) {
            c0975p07.f3757c = i2 - mo1436k;
        }
        c0975p07.f3761g = mo1436k;
    }

    /* renamed from: G1 */
    public final void m3227G1(int i, int i2) {
        this.f688s.f3757c = this.f689t.mo1440g() - i2;
        C0975p0 c0975p0 = this.f688s;
        c0975p0.f3759e = this.f692w ? -1 : 1;
        c0975p0.f3758d = i;
        c0975p0.f3760f = 1;
        c0975p0.f3756b = i2;
        c0975p0.f3761g = Integer.MIN_VALUE;
    }

    /* renamed from: H1 */
    public final void m3226H1(int i, int i2) {
        this.f688s.f3757c = i2 - this.f689t.mo1436k();
        C0975p0 c0975p0 = this.f688s;
        c0975p0.f3758d = i;
        c0975p0.f3759e = this.f692w ? 1 : -1;
        c0975p0.f3760f = -1;
        c0975p0.f3756b = i2;
        c0975p0.f3761g = Integer.MIN_VALUE;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: M0 */
    public int mo1567M0(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        if (this.f687r == 1) {
            return 0;
        }
        return m3232B1(i, c1007x1, c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: N0 */
    public void mo1565N0(int i) {
        this.f695z = i;
        this.f681A = Integer.MIN_VALUE;
        SavedState savedState = this.f682B;
        if (savedState != null) {
            savedState.f696b = -1;
        }
        m1569L0();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: O0 */
    public int mo1563O0(int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        if (this.f687r == 0) {
            return 0;
        }
        return m3232B1(i, c1007x1, c0929d2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: V0 */
    public boolean mo1549V0() {
        boolean z;
        if (this.f3786o != 1073741824 && this.f3785n != 1073741824) {
            int m1492z = m1492z();
            int i = 0;
            while (true) {
                if (i >= m1492z) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = m1494y(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: X */
    public boolean mo1546X() {
        return true;
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
        return this.f682B == null && this.f690u == this.f693x;
    }

    @Override // p010b.p083u.p084e.InterfaceC0925c2
    /* renamed from: a */
    public PointF mo1703a(int i) {
        if (m1492z() == 0) {
            return null;
        }
        int i2 = (i < m1556S(m1494y(0))) != this.f692w ? -1 : 1;
        return this.f687r == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: a1 */
    public void mo553a1(C0929d2 c0929d2, int[] iArr) {
        int i;
        int mo1435l = c0929d2.f3570a != -1 ? this.f689t.mo1435l() : 0;
        if (this.f688s.f3760f == -1) {
            i = 0;
        } else {
            i = mo1435l;
            mo1435l = 0;
        }
        iArr[0] = mo1435l;
        iArr[1] = i;
    }

    /* renamed from: b1 */
    public void mo3225b1(C0929d2 c0929d2, C0975p0 c0975p0, C0998v c0998v) {
        int i = c0975p0.f3758d;
        if (i < 0 || i >= c0929d2.m1684b()) {
            return;
        }
        c0998v.m1449a(i, Math.max(0, c0975p0.f3761g));
    }

    /* renamed from: c1 */
    public final int m3224c1(C0929d2 c0929d2) {
        if (m1492z() == 0) {
            return 0;
        }
        m3220g1();
        return AbstractC0022t.m3485l(c0929d2, this.f689t, m3217j1(!this.f694y, true), m3218i1(!this.f694y, true), this, this.f694y);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: d */
    public void mo1536d(String str) {
        RecyclerView recyclerView;
        if (this.f682B != null || (recyclerView = this.f3773b) == null) {
            return;
        }
        recyclerView.m3158i(str);
    }

    /* renamed from: d1 */
    public final int m3223d1(C0929d2 c0929d2) {
        if (m1492z() == 0) {
            return 0;
        }
        m3220g1();
        return AbstractC0022t.m3483m(c0929d2, this.f689t, m3217j1(!this.f694y, true), m3218i1(!this.f694y, true), this, this.f694y, this.f692w);
    }

    /* renamed from: e1 */
    public final int m3222e1(C0929d2 c0929d2) {
        if (m1492z() == 0) {
            return 0;
        }
        m3220g1();
        return AbstractC0022t.m3481n(c0929d2, this.f689t, m3217j1(!this.f694y, true), m3218i1(!this.f694y, true), this, this.f694y);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: f */
    public boolean mo1532f() {
        return this.f687r == 0;
    }

    /* renamed from: f1 */
    public int m3221f1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f687r == 1) ? 1 : Integer.MIN_VALUE : this.f687r == 0 ? 1 : Integer.MIN_VALUE : this.f687r == 1 ? -1 : Integer.MIN_VALUE : this.f687r == 0 ? -1 : Integer.MIN_VALUE : (this.f687r != 1 && m3207t1()) ? -1 : 1 : (this.f687r != 1 && m3207t1()) ? 1 : -1;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: g */
    public boolean mo1530g() {
        return this.f687r == 1;
    }

    /* renamed from: g1 */
    public void m3220g1() {
        if (this.f688s == null) {
            this.f688s = new C0975p0();
        }
    }

    /* renamed from: h1 */
    public int m3219h1(C1007x1 c1007x1, C0975p0 c0975p0, C0929d2 c0929d2, boolean z) {
        int i = c0975p0.f3757c;
        int i2 = c0975p0.f3761g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0975p0.f3761g = i2 + i;
            }
            m3203x1(c1007x1, c0975p0);
        }
        int i3 = c0975p0.f3757c + c0975p0.f3762h;
        C0971o0 c0971o0 = this.f684D;
        while (true) {
            if ((!c0975p0.f3766l && i3 <= 0) || !c0975p0.m1594b(c0929d2)) {
                break;
            }
            c0971o0.f3747a = 0;
            c0971o0.f3748b = false;
            c0971o0.f3749c = false;
            c0971o0.f3750d = false;
            mo3206u1(c1007x1, c0929d2, c0975p0, c0971o0);
            if (!c0971o0.f3748b) {
                int i4 = c0975p0.f3756b;
                int i5 = c0971o0.f3747a;
                c0975p0.f3756b = (c0975p0.f3760f * i5) + i4;
                if (!c0971o0.f3749c || c0975p0.f3765k != null || !c0929d2.f3576g) {
                    c0975p0.f3757c -= i5;
                    i3 -= i5;
                }
                int i6 = c0975p0.f3761g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    c0975p0.f3761g = i7;
                    int i8 = c0975p0.f3757c;
                    if (i8 < 0) {
                        c0975p0.f3761g = i7 + i8;
                    }
                    m3203x1(c1007x1, c0975p0);
                }
                if (z && c0971o0.f3750d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0975p0.f3757c;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: i0 */
    public void mo1525i0(RecyclerView recyclerView, C1007x1 c1007x1) {
        m1527h0();
    }

    /* renamed from: i1 */
    public View m3218i1(boolean z, boolean z2) {
        int m1492z;
        int i;
        if (this.f692w) {
            m1492z = 0;
            i = m1492z();
        } else {
            m1492z = m1492z() - 1;
            i = -1;
        }
        return m3213n1(m1492z, i, z, z2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: j */
    public void mo1524j(int i, int i2, C0929d2 c0929d2, C0998v c0998v) {
        if (this.f687r != 0) {
            i = i2;
        }
        if (m1492z() == 0 || i == 0) {
            return;
        }
        m3220g1();
        m3228F1(i > 0 ? 1 : -1, Math.abs(i), true, c0929d2);
        mo3225b1(c0929d2, this.f688s, c0998v);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: j0 */
    public View mo1523j0(View view, int i, C1007x1 c1007x1, C0929d2 c0929d2) {
        int m3221f1;
        View m3214m1;
        m3233A1();
        if (m1492z() == 0 || (m3221f1 = m3221f1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m3220g1();
        m3228F1(m3221f1, (int) (this.f689t.mo1435l() * 0.33333334f), false, c0929d2);
        C0975p0 c0975p0 = this.f688s;
        c0975p0.f3761g = Integer.MIN_VALUE;
        c0975p0.f3755a = false;
        m3219h1(c1007x1, c0975p0, c0929d2, true);
        if (m3221f1 == -1) {
            if (this.f692w) {
                m3214m1 = m3214m1(m1492z() - 1, -1);
            } else {
                m3214m1 = m3214m1(0, m1492z());
            }
        } else if (this.f692w) {
            m3214m1 = m3214m1(0, m1492z());
        } else {
            m3214m1 = m3214m1(m1492z() - 1, -1);
        }
        View m3208s1 = m3221f1 == -1 ? m3208s1() : m3209r1();
        if (m3208s1.hasFocusable()) {
            if (m3214m1 == null) {
                return null;
            }
            return m3208s1;
        }
        return m3214m1;
    }

    /* renamed from: j1 */
    public View m3217j1(boolean z, boolean z2) {
        int i;
        int m1492z;
        if (this.f692w) {
            i = m1492z() - 1;
            m1492z = -1;
        } else {
            i = 0;
            m1492z = m1492z();
        }
        return m3213n1(i, m1492z, z, z2);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: k */
    public void mo1522k(int i, C0998v c0998v) {
        boolean z;
        int i2;
        SavedState savedState = this.f682B;
        if (savedState == null || !savedState.m3200k()) {
            m3233A1();
            z = this.f692w;
            i2 = this.f695z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f682B;
            z = savedState2.f698d;
            i2 = savedState2.f696b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f685E && i2 >= 0 && i2 < i; i4++) {
            c0998v.m1449a(i2, 0);
            i2 += i3;
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: k0 */
    public void mo1521k0(AccessibilityEvent accessibilityEvent) {
        C1007x1 c1007x1 = this.f3773b.f755l;
        m1519l0(accessibilityEvent);
        if (m1492z() > 0) {
            accessibilityEvent.setFromIndex(m3216k1());
            accessibilityEvent.setToIndex(m3215l1());
        }
    }

    /* renamed from: k1 */
    public int m3216k1() {
        View m3213n1 = m3213n1(0, m1492z(), false, true);
        if (m3213n1 == null) {
            return -1;
        }
        return m1556S(m3213n1);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: l */
    public int mo1520l(C0929d2 c0929d2) {
        return m3224c1(c0929d2);
    }

    /* renamed from: l1 */
    public int m3215l1() {
        View m3213n1 = m3213n1(m1492z() - 1, -1, false, true);
        if (m3213n1 == null) {
            return -1;
        }
        return m1556S(m3213n1);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: m */
    public int mo1518m(C0929d2 c0929d2) {
        return m3223d1(c0929d2);
    }

    /* renamed from: m1 */
    public View m3214m1(int i, int i2) {
        int i3;
        int i4;
        m3220g1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m1494y(i);
        }
        if (this.f689t.mo1442e(m1494y(i)) < this.f689t.mo1436k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f687r == 0 ? this.f3776e : this.f3777f).m1453a(i, i2, i3, i4);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: n */
    public int mo1516n(C0929d2 c0929d2) {
        return m3222e1(c0929d2);
    }

    /* renamed from: n1 */
    public View m3213n1(int i, int i2, boolean z, boolean z2) {
        m3220g1();
        return (this.f687r == 0 ? this.f3776e : this.f3777f).m1453a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: o */
    public int mo1514o(C0929d2 c0929d2) {
        return m3224c1(c0929d2);
    }

    /* renamed from: o1 */
    public View mo3212o1(C1007x1 c1007x1, C0929d2 c0929d2, boolean z, boolean z2) {
        int i;
        int i2;
        m3220g1();
        int m1492z = m1492z();
        int i3 = -1;
        if (z2) {
            i = m1492z() - 1;
            i2 = -1;
        } else {
            i3 = m1492z;
            i = 0;
            i2 = 1;
        }
        int m1684b = c0929d2.m1684b();
        int mo1436k = this.f689t.mo1436k();
        int mo1440g = this.f689t.mo1440g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View m1494y = m1494y(i);
            int m1556S = m1556S(m1494y);
            int mo1442e = this.f689t.mo1442e(m1494y);
            int mo1445b = this.f689t.mo1445b(m1494y);
            if (m1556S >= 0 && m1556S < m1684b) {
                if (!((C0984r1) m1494y.getLayoutParams()).m1471c()) {
                    boolean z3 = mo1445b <= mo1436k && mo1442e < mo1436k;
                    boolean z4 = mo1442e >= mo1440g && mo1445b > mo1440g;
                    if (!z3 && !z4) {
                        return m1494y;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = m1494y;
                        }
                        view2 = m1494y;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = m1494y;
                        }
                        view2 = m1494y;
                    }
                } else if (view3 == null) {
                    view3 = m1494y;
                }
            }
            i += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: p */
    public int mo1512p(C0929d2 c0929d2) {
        return m3223d1(c0929d2);
    }

    /* renamed from: p1 */
    public final int m3211p1(int i, C1007x1 c1007x1, C0929d2 c0929d2, boolean z) {
        int mo1440g;
        int mo1440g2 = this.f689t.mo1440g() - i;
        if (mo1440g2 > 0) {
            int i2 = -m3232B1(-mo1440g2, c1007x1, c0929d2);
            int i3 = i + i2;
            if (!z || (mo1440g = this.f689t.mo1440g() - i3) <= 0) {
                return i2;
            }
            this.f689t.mo1431p(mo1440g);
            return mo1440g + i2;
        }
        return 0;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: q */
    public int mo1510q(C0929d2 c0929d2) {
        return m3222e1(c0929d2);
    }

    /* renamed from: q1 */
    public final int m3210q1(int i, C1007x1 c1007x1, C0929d2 c0929d2, boolean z) {
        int mo1436k;
        int mo1436k2 = i - this.f689t.mo1436k();
        if (mo1436k2 > 0) {
            int i2 = -m3232B1(mo1436k2, c1007x1, c0929d2);
            int i3 = i + i2;
            if (!z || (mo1436k = i3 - this.f689t.mo1436k()) <= 0) {
                return i2;
            }
            this.f689t.mo1431p(-mo1436k);
            return i2 - mo1436k;
        }
        return 0;
    }

    /* renamed from: r1 */
    public final View m3209r1() {
        return m1494y(this.f692w ? 0 : m1492z() - 1);
    }

    /* renamed from: s1 */
    public final View m3208s1() {
        return m1494y(this.f692w ? m1492z() - 1 : 0);
    }

    /* renamed from: t1 */
    public boolean m3207t1() {
        return m1570L() == 1;
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: u */
    public View mo1502u(int i) {
        int m1492z = m1492z();
        if (m1492z == 0) {
            return null;
        }
        int m1556S = i - m1556S(m1494y(0));
        if (m1556S >= 0 && m1556S < m1492z) {
            View m1494y = m1494y(m1556S);
            if (m1556S(m1494y) == i) {
                return m1494y;
            }
        }
        return super.mo1502u(i);
    }

    /* renamed from: u1 */
    public void mo3206u1(C1007x1 c1007x1, C0929d2 c0929d2, C0975p0 c0975p0, C0971o0 c0971o0) {
        int i;
        int i2;
        int i3;
        int i4;
        int mo1443d;
        View m1593c = c0975p0.m1593c(c1007x1);
        if (m1593c == null) {
            c0971o0.f3748b = true;
            return;
        }
        C0984r1 c0984r1 = (C0984r1) m1593c.getLayoutParams();
        if (c0975p0.f3765k == null) {
            if (this.f692w == (c0975p0.f3760f == -1)) {
                m1538c(m1593c, -1, false);
            } else {
                m1538c(m1593c, 0, false);
            }
        } else {
            if (this.f692w == (c0975p0.f3760f == -1)) {
                m1538c(m1593c, -1, true);
            } else {
                m1538c(m1593c, 0, true);
            }
        }
        C0984r1 c0984r12 = (C0984r1) m1593c.getLayoutParams();
        Rect m3188L = this.f3773b.m3188L(m1593c);
        int m1592A = AbstractC0980q1.m1592A(this.f3787p, this.f3785n, m1560Q() + m1562P() + ((ViewGroup.MarginLayoutParams) c0984r12).leftMargin + ((ViewGroup.MarginLayoutParams) c0984r12).rightMargin + m3188L.left + m3188L.right + 0, ((ViewGroup.MarginLayoutParams) c0984r12).width, mo1532f());
        int m1592A2 = AbstractC0980q1.m1592A(this.f3788q, this.f3786o, m1564O() + m1558R() + ((ViewGroup.MarginLayoutParams) c0984r12).topMargin + ((ViewGroup.MarginLayoutParams) c0984r12).bottomMargin + m3188L.top + m3188L.bottom + 0, ((ViewGroup.MarginLayoutParams) c0984r12).height, mo1530g());
        if (m1551U0(m1593c, m1592A, m1592A2, c0984r12)) {
            m1593c.measure(m1592A, m1592A2);
        }
        c0971o0.f3747a = this.f689t.mo1444c(m1593c);
        if (this.f687r == 1) {
            if (m3207t1()) {
                mo1443d = this.f3787p - m1560Q();
                i4 = mo1443d - this.f689t.mo1443d(m1593c);
            } else {
                i4 = m1562P();
                mo1443d = this.f689t.mo1443d(m1593c) + i4;
            }
            int i5 = c0975p0.f3760f;
            int i6 = c0975p0.f3756b;
            if (i5 == -1) {
                i3 = i6;
                i2 = mo1443d;
                i = i6 - c0971o0.f3747a;
            } else {
                i = i6;
                i2 = mo1443d;
                i3 = c0971o0.f3747a + i6;
            }
        } else {
            int m1558R = m1558R();
            int mo1443d2 = this.f689t.mo1443d(m1593c) + m1558R;
            int i7 = c0975p0.f3760f;
            int i8 = c0975p0.f3756b;
            if (i7 == -1) {
                i2 = i8;
                i = m1558R;
                i3 = mo1443d2;
                i4 = i8 - c0971o0.f3747a;
            } else {
                i = m1558R;
                i2 = c0971o0.f3747a + i8;
                i3 = mo1443d2;
                i4 = i8;
            }
        }
        m1539b0(m1593c, i4, i, i2, i3);
        if (c0984r1.m1471c() || c0984r1.m1472b()) {
            c0971o0.f3749c = true;
        }
        c0971o0.f3750d = m1593c.hasFocusable();
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: v */
    public C0984r1 mo1500v() {
        return new C0984r1(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0175  */
    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1499v0(C1007x1 c1007x1, C0929d2 c0929d2) {
        boolean z;
        boolean z2;
        View mo3212o1;
        int i;
        int mo1436k;
        int i2;
        int mo1440g;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int m3211p1;
        int i9;
        View mo1502u;
        int mo1442e;
        int i10;
        if (!(this.f682B == null && this.f695z == -1) && c0929d2.m1684b() == 0) {
            m1581F0(c1007x1);
            return;
        }
        SavedState savedState = this.f682B;
        if (savedState != null && savedState.m3200k()) {
            this.f695z = this.f682B.f696b;
        }
        m3220g1();
        this.f688s.f3755a = false;
        m3233A1();
        View m1574J = m1574J();
        C0967n0 c0967n0 = this.f683C;
        if (!c0967n0.f3732e || this.f695z != -1 || this.f682B != null) {
            c0967n0.m1612d();
            C0967n0 c0967n02 = this.f683C;
            c0967n02.f3731d = this.f692w ^ this.f693x;
            if (!c0929d2.f3576g && (i = this.f695z) != -1) {
                if (i < 0 || i >= c0929d2.m1684b()) {
                    this.f695z = -1;
                    this.f681A = Integer.MIN_VALUE;
                } else {
                    c0967n02.f3729b = this.f695z;
                    SavedState savedState2 = this.f682B;
                    if (savedState2 != null && savedState2.m3200k()) {
                        boolean z3 = this.f682B.f698d;
                        c0967n02.f3731d = z3;
                        if (z3) {
                            mo1440g = this.f689t.mo1440g();
                            i3 = this.f682B.f697c;
                            i4 = mo1440g - i3;
                        } else {
                            mo1436k = this.f689t.mo1436k();
                            i2 = this.f682B.f697c;
                            i4 = mo1436k + i2;
                        }
                    } else if (this.f681A == Integer.MIN_VALUE) {
                        View mo1502u2 = mo1502u(this.f695z);
                        if (mo1502u2 != null) {
                            if (this.f689t.mo1444c(mo1502u2) <= this.f689t.mo1435l()) {
                                if (this.f689t.mo1442e(mo1502u2) - this.f689t.mo1436k() < 0) {
                                    c0967n02.f3730c = this.f689t.mo1436k();
                                    c0967n02.f3731d = false;
                                } else if (this.f689t.mo1440g() - this.f689t.mo1445b(mo1502u2) < 0) {
                                    c0967n02.f3730c = this.f689t.mo1440g();
                                    c0967n02.f3731d = true;
                                } else {
                                    c0967n02.f3730c = c0967n02.f3731d ? this.f689t.m1434m() + this.f689t.mo1445b(mo1502u2) : this.f689t.mo1442e(mo1502u2);
                                }
                                z = true;
                                if (!z) {
                                    if (m1492z() != 0) {
                                        View m1574J2 = m1574J();
                                        if (m1574J2 != null) {
                                            C0984r1 c0984r1 = (C0984r1) m1574J2.getLayoutParams();
                                            if (!c0984r1.m1471c() && c0984r1.m1473a() >= 0 && c0984r1.m1473a() < c0929d2.m1684b()) {
                                                c0967n02.m1613c(m1574J2, m1556S(m1574J2));
                                                z2 = true;
                                                if (!z2) {
                                                    c0967n02.m1615a();
                                                    c0967n02.f3729b = this.f693x ? c0929d2.m1684b() - 1 : 0;
                                                }
                                            }
                                        }
                                        boolean z4 = this.f690u;
                                        boolean z5 = this.f693x;
                                        if (z4 == z5 && (mo3212o1 = mo3212o1(c1007x1, c0929d2, c0967n02.f3731d, z5)) != null) {
                                            c0967n02.m1614b(mo3212o1, m1556S(mo3212o1));
                                            if (!c0929d2.f3576g && mo1542Z0()) {
                                                int mo1442e2 = this.f689t.mo1442e(mo3212o1);
                                                int mo1445b = this.f689t.mo1445b(mo3212o1);
                                                int mo1436k2 = this.f689t.mo1436k();
                                                int mo1440g2 = this.f689t.mo1440g();
                                                boolean z6 = mo1445b <= mo1436k2 && mo1442e2 < mo1436k2;
                                                boolean z7 = mo1442e2 >= mo1440g2 && mo1445b > mo1440g2;
                                                if (z6 || z7) {
                                                    if (c0967n02.f3731d) {
                                                        mo1436k2 = mo1440g2;
                                                    }
                                                    c0967n02.f3730c = mo1436k2;
                                                }
                                            }
                                            z2 = true;
                                            if (!z2) {
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                }
                                this.f683C.f3732e = true;
                            }
                        } else if (m1492z() > 0) {
                            c0967n02.f3731d = (this.f695z < m1556S(m1494y(0))) == this.f692w;
                        }
                        c0967n02.m1615a();
                        z = true;
                        if (!z) {
                        }
                        this.f683C.f3732e = true;
                    } else {
                        boolean z8 = this.f692w;
                        c0967n02.f3731d = z8;
                        if (z8) {
                            mo1440g = this.f689t.mo1440g();
                            i3 = this.f681A;
                            i4 = mo1440g - i3;
                        } else {
                            mo1436k = this.f689t.mo1436k();
                            i2 = this.f681A;
                            i4 = mo1436k + i2;
                        }
                    }
                    c0967n02.f3730c = i4;
                    z = true;
                    if (!z) {
                    }
                    this.f683C.f3732e = true;
                }
            }
            z = false;
            if (!z) {
            }
            this.f683C.f3732e = true;
        } else if (m1574J != null && (this.f689t.mo1442e(m1574J) >= this.f689t.mo1440g() || this.f689t.mo1445b(m1574J) <= this.f689t.mo1436k())) {
            this.f683C.m1613c(m1574J, m1556S(m1574J));
        }
        C0975p0 c0975p0 = this.f688s;
        c0975p0.f3760f = c0975p0.f3764j >= 0 ? 1 : -1;
        int[] iArr = this.f686F;
        iArr[0] = 0;
        iArr[1] = 0;
        mo553a1(c0929d2, iArr);
        int mo1436k3 = this.f689t.mo1436k() + Math.max(0, this.f686F[0]);
        int mo1439h = this.f689t.mo1439h() + Math.max(0, this.f686F[1]);
        if (c0929d2.f3576g && (i9 = this.f695z) != -1 && this.f681A != Integer.MIN_VALUE && (mo1502u = mo1502u(i9)) != null) {
            if (this.f692w) {
                i10 = this.f689t.mo1440g() - this.f689t.mo1445b(mo1502u);
                mo1442e = this.f681A;
            } else {
                mo1442e = this.f689t.mo1442e(mo1502u) - this.f689t.mo1436k();
                i10 = this.f681A;
            }
            int i11 = i10 - mo1442e;
            if (i11 > 0) {
                mo1436k3 += i11;
            } else {
                mo1439h -= i11;
            }
        }
        C0967n0 c0967n03 = this.f683C;
        mo3205v1(c1007x1, c0929d2, c0967n03, (!c0967n03.f3731d ? this.f692w : !this.f692w) ? 1 : -1);
        m1508r(c1007x1);
        this.f688s.f3766l = m3201z1();
        this.f688s.getClass();
        this.f688s.f3763i = 0;
        C0967n0 c0967n04 = this.f683C;
        if (c0967n04.f3731d) {
            m3226H1(c0967n04.f3729b, c0967n04.f3730c);
            C0975p0 c0975p02 = this.f688s;
            c0975p02.f3762h = mo1436k3;
            m3219h1(c1007x1, c0975p02, c0929d2, false);
            C0975p0 c0975p03 = this.f688s;
            i6 = c0975p03.f3756b;
            int i12 = c0975p03.f3758d;
            int i13 = c0975p03.f3757c;
            if (i13 > 0) {
                mo1439h += i13;
            }
            C0967n0 c0967n05 = this.f683C;
            m3227G1(c0967n05.f3729b, c0967n05.f3730c);
            C0975p0 c0975p04 = this.f688s;
            c0975p04.f3762h = mo1439h;
            c0975p04.f3758d += c0975p04.f3759e;
            m3219h1(c1007x1, c0975p04, c0929d2, false);
            C0975p0 c0975p05 = this.f688s;
            i5 = c0975p05.f3756b;
            int i14 = c0975p05.f3757c;
            if (i14 > 0) {
                m3226H1(i12, i6);
                C0975p0 c0975p06 = this.f688s;
                c0975p06.f3762h = i14;
                m3219h1(c1007x1, c0975p06, c0929d2, false);
                i6 = this.f688s.f3756b;
            }
        } else {
            m3227G1(c0967n04.f3729b, c0967n04.f3730c);
            C0975p0 c0975p07 = this.f688s;
            c0975p07.f3762h = mo1439h;
            m3219h1(c1007x1, c0975p07, c0929d2, false);
            C0975p0 c0975p08 = this.f688s;
            i5 = c0975p08.f3756b;
            int i15 = c0975p08.f3758d;
            int i16 = c0975p08.f3757c;
            if (i16 > 0) {
                mo1436k3 += i16;
            }
            C0967n0 c0967n06 = this.f683C;
            m3226H1(c0967n06.f3729b, c0967n06.f3730c);
            C0975p0 c0975p09 = this.f688s;
            c0975p09.f3762h = mo1436k3;
            c0975p09.f3758d += c0975p09.f3759e;
            m3219h1(c1007x1, c0975p09, c0929d2, false);
            C0975p0 c0975p010 = this.f688s;
            i6 = c0975p010.f3756b;
            int i17 = c0975p010.f3757c;
            if (i17 > 0) {
                m3227G1(i15, i5);
                C0975p0 c0975p011 = this.f688s;
                c0975p011.f3762h = i17;
                m3219h1(c1007x1, c0975p011, c0929d2, false);
                i5 = this.f688s.f3756b;
            }
        }
        if (m1492z() > 0) {
            if (this.f692w ^ this.f693x) {
                int m3211p12 = m3211p1(i5, c1007x1, c0929d2, true);
                i7 = i6 + m3211p12;
                i8 = i5 + m3211p12;
                m3211p1 = m3210q1(i7, c1007x1, c0929d2, false);
            } else {
                int m3210q1 = m3210q1(i6, c1007x1, c0929d2, true);
                i7 = i6 + m3210q1;
                i8 = i5 + m3210q1;
                m3211p1 = m3211p1(i8, c1007x1, c0929d2, false);
            }
            i6 = i7 + m3211p1;
            i5 = i8 + m3211p1;
        }
        if (c0929d2.f3580k && m1492z() != 0 && !c0929d2.f3576g && mo1542Z0()) {
            List list = c1007x1.f3895d;
            int size = list.size();
            int m1556S = m1556S(m1494y(0));
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) list.get(i20);
                if (!abstractC0941g2.m1659n()) {
                    char c = (abstractC0941g2.m1666g() < m1556S) != this.f692w ? (char) 65535 : (char) 1;
                    int mo1444c = this.f689t.mo1444c(abstractC0941g2.f3605c);
                    if (c == 65535) {
                        i18 += mo1444c;
                    } else {
                        i19 += mo1444c;
                    }
                }
            }
            this.f688s.f3765k = list;
            if (i18 > 0) {
                m3226H1(m1556S(m3208s1()), i6);
                C0975p0 c0975p012 = this.f688s;
                c0975p012.f3762h = i18;
                c0975p012.f3757c = 0;
                c0975p012.m1595a(null);
                m3219h1(c1007x1, this.f688s, c0929d2, false);
            }
            if (i19 > 0) {
                m3227G1(m1556S(m3209r1()), i5);
                C0975p0 c0975p013 = this.f688s;
                c0975p013.f3762h = i19;
                c0975p013.f3757c = 0;
                c0975p013.m1595a(null);
                m3219h1(c1007x1, this.f688s, c0929d2, false);
            }
            this.f688s.f3765k = null;
        }
        if (!c0929d2.f3576g) {
            AbstractC0999v0 abstractC0999v0 = this.f689t;
            abstractC0999v0.f3866b = abstractC0999v0.mo1435l();
        } else {
            this.f683C.m1612d();
        }
        this.f690u = this.f693x;
    }

    /* renamed from: v1 */
    public void mo3205v1(C1007x1 c1007x1, C0929d2 c0929d2, C0967n0 c0967n0, int i) {
    }

    @Override // p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: w0 */
    public void mo1497w0(C0929d2 c0929d2) {
        this.f682B = null;
        this.f695z = -1;
        this.f681A = Integer.MIN_VALUE;
        this.f683C.m1612d();
    }

    /* renamed from: w1 */
    public void m3204w1(View view, View view2) {
        int mo1442e;
        RecyclerView recyclerView;
        if (this.f682B == null && (recyclerView = this.f3773b) != null) {
            recyclerView.m3158i("Cannot drop a view during a scroll or layout calculation");
        }
        m3220g1();
        m3233A1();
        int m1556S = m1556S(view);
        int m1556S2 = m1556S(view2);
        char c = m1556S < m1556S2 ? (char) 1 : (char) 65535;
        if (this.f692w) {
            if (c == 1) {
                m3231C1(m1556S2, this.f689t.mo1440g() - (this.f689t.mo1444c(view) + this.f689t.mo1442e(view2)));
                return;
            }
            mo1442e = this.f689t.mo1440g() - this.f689t.mo1445b(view2);
        } else if (c != 65535) {
            m3231C1(m1556S2, this.f689t.mo1445b(view2) - this.f689t.mo1444c(view));
            return;
        } else {
            mo1442e = this.f689t.mo1442e(view2);
        }
        m3231C1(m1556S2, mo1442e);
    }

    /* renamed from: x1 */
    public final void m3203x1(C1007x1 c1007x1, C0975p0 c0975p0) {
        if (!c0975p0.f3755a || c0975p0.f3766l) {
            return;
        }
        int i = c0975p0.f3761g;
        int i2 = c0975p0.f3763i;
        if (c0975p0.f3760f == -1) {
            int m1492z = m1492z();
            if (i < 0) {
                return;
            }
            int mo1441f = (this.f689t.mo1441f() - i) + i2;
            if (this.f692w) {
                for (int i3 = 0; i3 < m1492z; i3++) {
                    View m1494y = m1494y(i3);
                    if (this.f689t.mo1442e(m1494y) < mo1441f || this.f689t.mo1432o(m1494y) < mo1441f) {
                        m3202y1(c1007x1, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = m1492z - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View m1494y2 = m1494y(i5);
                if (this.f689t.mo1442e(m1494y2) < mo1441f || this.f689t.mo1432o(m1494y2) < mo1441f) {
                    m3202y1(c1007x1, i4, i5);
                    return;
                }
            }
        } else if (i >= 0) {
            int i6 = i - i2;
            int m1492z2 = m1492z();
            if (!this.f692w) {
                for (int i7 = 0; i7 < m1492z2; i7++) {
                    View m1494y3 = m1494y(i7);
                    if (this.f689t.mo1445b(m1494y3) > i6 || this.f689t.mo1433n(m1494y3) > i6) {
                        m3202y1(c1007x1, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = m1492z2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View m1494y4 = m1494y(i9);
                if (this.f689t.mo1445b(m1494y4) > i6 || this.f689t.mo1433n(m1494y4) > i6) {
                    m3202y1(c1007x1, i8, i9);
                    return;
                }
            }
        }
    }

    /* renamed from: y1 */
    public final void m3202y1(C1007x1 c1007x1, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m1575I0(i, c1007x1);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            m1575I0(i3, c1007x1);
        }
    }

    /* renamed from: z1 */
    public boolean m3201z1() {
        return this.f689t.mo1438i() == 0 && this.f689t.mo1441f() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f687r = 1;
        this.f691v = false;
        this.f692w = false;
        this.f693x = false;
        this.f694y = true;
        this.f695z = -1;
        this.f681A = Integer.MIN_VALUE;
        this.f682B = null;
        this.f683C = new C0967n0();
        this.f684D = new C0971o0();
        this.f685E = 2;
        this.f686F = new int[2];
        C0976p1 m1554T = AbstractC0980q1.m1554T(context, attributeSet, i, i2);
        m3230D1(m1554T.f3767a);
        boolean z = m1554T.f3769c;
        mo1536d(null);
        if (z != this.f691v) {
            this.f691v = z;
            m1569L0();
        }
        mo3229E1(m1554T.f3770d);
    }
}