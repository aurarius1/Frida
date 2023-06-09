package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p044i.p045d.AbstractC0452b;
import p010b.p044i.p045d.C0455e;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.InterfaceC0610m;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p064l.p066b.AbstractC0663h;
import p010b.p064l.p066b.C0664i;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p167s.AbstractC1983f;
import p093c.p145g.p146a.p147a.p167s.C1979b;
import p093c.p145g.p146a.p147a.p167s.C1980c;
import p093c.p145g.p146a.p147a.p167s.C1981d;
import p093c.p145g.p146a.p147a.p167s.C1982e;
import p093c.p145g.p146a.p147a.p167s.C1984g;
import p093c.p145g.p146a.p147a.p167s.RunnableC1978a;
import p093c.p145g.p146a.p147a.p167s.RunnableC1985h;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* loaded from: classes.dex */
public class BottomSheetBehavior extends AbstractC0452b {

    /* renamed from: a */
    public static final int f6689a = AbstractC1926k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public C0664i f6690A;

    /* renamed from: B */
    public boolean f6691B;

    /* renamed from: C */
    public int f6692C;

    /* renamed from: D */
    public boolean f6693D;

    /* renamed from: E */
    public int f6694E;

    /* renamed from: F */
    public int f6695F;

    /* renamed from: G */
    public int f6696G;

    /* renamed from: H */
    public WeakReference f6697H;

    /* renamed from: I */
    public WeakReference f6698I;

    /* renamed from: J */
    public final ArrayList f6699J;

    /* renamed from: K */
    public VelocityTracker f6700K;

    /* renamed from: L */
    public int f6701L;

    /* renamed from: M */
    public int f6702M;

    /* renamed from: N */
    public boolean f6703N;

    /* renamed from: O */
    public Map f6704O;

    /* renamed from: P */
    public int f6705P;

    /* renamed from: Q */
    public final AbstractC0663h f6706Q;

    /* renamed from: b */
    public int f6707b;

    /* renamed from: c */
    public boolean f6708c;

    /* renamed from: d */
    public float f6709d;

    /* renamed from: e */
    public int f6710e;

    /* renamed from: f */
    public boolean f6711f;

    /* renamed from: g */
    public int f6712g;

    /* renamed from: h */
    public int f6713h;

    /* renamed from: i */
    public boolean f6714i;

    /* renamed from: j */
    public C1851i f6715j;

    /* renamed from: k */
    public int f6716k;

    /* renamed from: l */
    public boolean f6717l;

    /* renamed from: m */
    public C1856n f6718m;

    /* renamed from: n */
    public boolean f6719n;

    /* renamed from: o */
    public RunnableC1985h f6720o;

    /* renamed from: p */
    public ValueAnimator f6721p;

    /* renamed from: q */
    public int f6722q;

    /* renamed from: r */
    public int f6723r;

    /* renamed from: s */
    public int f6724s;

    /* renamed from: t */
    public float f6725t;

    /* renamed from: u */
    public int f6726u;

    /* renamed from: v */
    public float f6727v;

    /* renamed from: w */
    public boolean f6728w;

    /* renamed from: x */
    public boolean f6729x;

    /* renamed from: y */
    public boolean f6730y;

    /* renamed from: z */
    public int f6731z;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1984g();

        /* renamed from: d */
        public final int f6732d;

        /* renamed from: e */
        public int f6733e;

        /* renamed from: f */
        public boolean f6734f;

        /* renamed from: g */
        public boolean f6735g;

        /* renamed from: h */
        public boolean f6736h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6732d = parcel.readInt();
            this.f6733e = parcel.readInt();
            this.f6734f = parcel.readInt() == 1;
            this.f6735g = parcel.readInt() == 1;
            this.f6736h = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f6732d = bottomSheetBehavior.f6731z;
            this.f6733e = bottomSheetBehavior.f6710e;
            this.f6734f = bottomSheetBehavior.f6708c;
            this.f6735g = bottomSheetBehavior.f6728w;
            this.f6736h = bottomSheetBehavior.f6729x;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeInt(this.f6732d);
            parcel.writeInt(this.f6733e);
            parcel.writeInt(this.f6734f ? 1 : 0);
            parcel.writeInt(this.f6735g ? 1 : 0);
            parcel.writeInt(this.f6736h ? 1 : 0);
        }
    }

    public BottomSheetBehavior() {
        this.f6707b = 0;
        this.f6708c = true;
        this.f6720o = null;
        this.f6725t = 0.5f;
        this.f6727v = -1.0f;
        this.f6730y = true;
        this.f6731z = 4;
        this.f6699J = new ArrayList();
        this.f6705P = -1;
        this.f6706Q = new C1981d(this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i;
        this.f6707b = 0;
        this.f6708c = true;
        this.f6720o = null;
        this.f6725t = 0.5f;
        this.f6727v = -1.0f;
        this.f6730y = true;
        this.f6731z = 4;
        this.f6699J = new ArrayList();
        this.f6705P = -1;
        this.f6706Q = new C1981d(this);
        this.f6713h = context.getResources().getDimensionPixelSize(AbstractC1829d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.BottomSheetBehavior_Layout);
        this.f6714i = obtainStyledAttributes.hasValue(AbstractC1940l.BottomSheetBehavior_Layout_shapeAppearance);
        int i2 = AbstractC1940l.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m346D(context, attributeSet, hasValue, AbstractC1077v0.m1262q(context, obtainStyledAttributes, i2));
        } else {
            m346D(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6721p = ofFloat;
        ofFloat.setDuration(500L);
        this.f6721p.addUpdateListener(new C1979b(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6727v = obtainStyledAttributes.getDimension(AbstractC1940l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        int i3 = AbstractC1940l.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            m341I(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            m341I(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(AbstractC1940l.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.f6728w != z) {
            this.f6728w = z;
            if (!z && this.f6731z == 5) {
                m340J(4);
            }
            m334P();
        }
        this.f6717l = obtainStyledAttributes.getBoolean(AbstractC1940l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z2 = obtainStyledAttributes.getBoolean(AbstractC1940l.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f6708c != z2) {
            this.f6708c = z2;
            if (this.f6697H != null) {
                m348B();
            }
            m339K((this.f6708c && this.f6731z == 6) ? 3 : this.f6731z);
            m334P();
        }
        this.f6729x = obtainStyledAttributes.getBoolean(AbstractC1940l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f6730y = obtainStyledAttributes.getBoolean(AbstractC1940l.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f6707b = obtainStyledAttributes.getInt(AbstractC1940l.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = obtainStyledAttributes.getFloat(AbstractC1940l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f6725t = f;
            if (this.f6697H != null) {
                this.f6724s = (int) ((1.0f - f) * this.f6696G);
            }
            int i4 = AbstractC1940l.BottomSheetBehavior_Layout_behavior_expandedOffset;
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(i4);
            if (peekValue2 == null || peekValue2.type != 16) {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i4, 0);
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                dimensionPixelOffset = peekValue2.data;
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f6722q = dimensionPixelOffset;
            obtainStyledAttributes.recycle();
            this.f6709d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: A */
    public boolean mo208A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f6731z == 1 && actionMasked == 0) {
                return true;
            }
            C0664i c0664i = this.f6690A;
            if (c0664i != null) {
                c0664i.m2131n(motionEvent);
            }
            if (actionMasked == 0) {
                this.f6701L = -1;
                VelocityTracker velocityTracker = this.f6700K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f6700K = null;
                }
            }
            if (this.f6700K == null) {
                this.f6700K = VelocityTracker.obtain();
            }
            this.f6700K.addMovement(motionEvent);
            if (this.f6690A != null && actionMasked == 2 && !this.f6691B) {
                float abs = Math.abs(this.f6702M - motionEvent.getY());
                C0664i c0664i2 = this.f6690A;
                if (abs > c0664i2.f2877c) {
                    c0664i2.m2143b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            return !this.f6691B;
        }
        return false;
    }

    /* renamed from: B */
    public final void m348B() {
        int m347C = m347C();
        if (this.f6708c) {
            this.f6726u = Math.max(this.f6696G - m347C, this.f6723r);
        } else {
            this.f6726u = this.f6696G - m347C;
        }
    }

    /* renamed from: C */
    public final int m347C() {
        int i;
        return this.f6711f ? Math.min(Math.max(this.f6712g, this.f6696G - ((this.f6695F * 9) / 16)), this.f6694E) : (this.f6717l || (i = this.f6716k) <= 0) ? this.f6710e : Math.max(this.f6710e, i + this.f6713h);
    }

    /* renamed from: D */
    public final void m346D(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f6714i) {
            this.f6718m = C1856n.m719b(context, attributeSet, AbstractC1804b.bottomSheetStyle, f6689a).m727a();
            C1851i c1851i = new C1851i(this.f6718m);
            this.f6715j = c1851i;
            c1851i.f5657d.f5634b = new C2045a(context);
            c1851i.m730w();
            if (z && colorStateList != null) {
                this.f6715j.m737p(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f6715j.setTint(typedValue.data);
        }
    }

    /* renamed from: E */
    public void m345E(int i) {
        if (((View) this.f6697H.get()) == null || this.f6699J.isEmpty()) {
            return;
        }
        if (i <= this.f6726u) {
            m343G();
        }
        if (this.f6699J.size() <= 0) {
            return;
        }
        AbstractC1983f abstractC1983f = (AbstractC1983f) this.f6699J.get(0);
        throw null;
    }

    /* renamed from: F */
    public View m344F(View view) {
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 21 ? view.isNestedScrollingEnabled() : view instanceof InterfaceC0610m ? ((InterfaceC0610m) view).isNestedScrollingEnabled() : false) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m344F = m344F(viewGroup.getChildAt(i));
                if (m344F != null) {
                    return m344F;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: G */
    public int m343G() {
        return this.f6708c ? this.f6723r : this.f6722q;
    }

    /* renamed from: H */
    public final void m342H(View view, C0577b c0577b, int i) {
        AbstractC0605j0.m2272K(view, c0577b, null, new C1982e(this, i));
    }

    /* renamed from: I */
    public void m341I(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.f6711f) {
                this.f6711f = true;
            }
            z = false;
        } else {
            if (this.f6711f || this.f6710e != i) {
                this.f6711f = false;
                this.f6710e = Math.max(0, i);
            }
            z = false;
        }
        if (z) {
            m331S(false);
        }
    }

    /* renamed from: J */
    public void m340J(int i) {
        if (i == this.f6731z) {
            return;
        }
        if (this.f6697H != null) {
            m337M(i);
        } else if (i == 4 || i == 3 || i == 6 || (this.f6728w && i == 5)) {
            this.f6731z = i;
        }
    }

    /* renamed from: K */
    public void m339K(int i) {
        if (this.f6731z == i) {
            return;
        }
        this.f6731z = i;
        WeakReference weakReference = this.f6697H;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m332R(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m332R(false);
        }
        m333Q(i);
        if (this.f6699J.size() <= 0) {
            m334P();
        } else {
            AbstractC1983f abstractC1983f = (AbstractC1983f) this.f6699J.get(0);
            throw null;
        }
    }

    /* renamed from: L */
    public void m338L(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f6726u;
        } else if (i == 6) {
            i2 = this.f6724s;
            if (this.f6708c && i2 <= (i3 = this.f6723r)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = m343G();
        } else if (!this.f6728w || i != 5) {
            throw new IllegalArgumentException(AbstractC1124a.m1193c("Illegal state argument: ", i));
        } else {
            i2 = this.f6696G;
        }
        m335O(view, i, i2, false);
    }

    /* renamed from: M */
    public final void m337M(int i) {
        View view = (View) this.f6697H.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && AbstractC0605j0.m2233y(view)) {
            view.post(new RunnableC1978a(this, view, i));
        } else {
            m338L(view, i);
        }
    }

    /* renamed from: N */
    public boolean m336N(View view, float f) {
        if (this.f6729x) {
            return true;
        }
        if (view.getTop() < this.f6726u) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f6726u)) / ((float) m347C()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r7 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r0.m2125t(r5.getLeft(), r7) != false) goto L6;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m335O(View view, int i, int i2, boolean z) {
        C0664i c0664i = this.f6690A;
        boolean z2 = false;
        if (c0664i != null) {
            if (!z) {
                int left = view.getLeft();
                c0664i.f2893s = view;
                c0664i.f2878d = -1;
                boolean m2133l = c0664i.m2133l(left, i2, 0, 0);
                if (!m2133l && c0664i.f2876b == 0 && c0664i.f2893s != null) {
                    c0664i.f2893s = null;
                }
            }
        }
        if (z2) {
            m339K(2);
            m333Q(i);
            if (this.f6720o == null) {
                this.f6720o = new RunnableC1985h(this, view, i);
            }
            RunnableC1985h runnableC1985h = this.f6720o;
            boolean z3 = runnableC1985h.f6011c;
            runnableC1985h.f6012d = i;
            if (z3) {
                return;
            }
            AbstractC0605j0.m2276G(view, runnableC1985h);
            this.f6720o.f6011c = true;
            return;
        }
        m339K(i);
    }

    /* renamed from: P */
    public final void m334P() {
        View view;
        int i;
        C0577b c0577b;
        WeakReference weakReference = this.f6697H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0605j0.m2274I(view, 524288);
        AbstractC0605j0.m2274I(view, 262144);
        AbstractC0605j0.m2274I(view, 1048576);
        int i2 = this.f6705P;
        if (i2 != -1) {
            AbstractC0605j0.m2274I(view, i2);
        }
        if (this.f6731z != 6) {
            String string = view.getResources().getString(AbstractC1924j.bottomsheet_action_expand_halfway);
            C1982e c1982e = new C1982e(this, 6);
            List m2247k = AbstractC0605j0.m2247k(view);
            int i3 = 0;
            int i4 = -1;
            while (true) {
                int[] iArr = AbstractC0605j0.f2758k;
                if (i3 >= iArr.length || i4 != -1) {
                    break;
                }
                int i5 = iArr[i3];
                boolean z = true;
                for (int i6 = 0; i6 < m2247k.size(); i6++) {
                    z &= ((C0577b) m2247k.get(i6)).m2316a() != i5;
                }
                if (z) {
                    i4 = i5;
                }
                i3++;
            }
            if (i4 != -1) {
                AbstractC0605j0.m2257a(view, new C0577b(null, i4, string, c1982e, null));
            }
            this.f6705P = i4;
        }
        if (this.f6728w && this.f6731z != 5) {
            m342H(view, C0577b.f2693f, 5);
        }
        int i7 = this.f6731z;
        if (i7 == 3) {
            i = this.f6708c ? 4 : 6;
            c0577b = C0577b.f2692e;
        } else if (i7 != 4) {
            if (i7 != 6) {
                return;
            }
            m342H(view, C0577b.f2692e, 4);
            m342H(view, C0577b.f2691d, 3);
            return;
        } else {
            i = this.f6708c ? 3 : 6;
            c0577b = C0577b.f2691d;
        }
        m342H(view, c0577b, i);
    }

    /* renamed from: Q */
    public final void m333Q(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f6719n != z) {
            this.f6719n = z;
            if (this.f6715j == null || (valueAnimator = this.f6721p) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f6721p.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f6721p.setFloatValues(1.0f - f, f);
            this.f6721p.start();
        }
    }

    /* renamed from: R */
    public final void m332R(boolean z) {
        WeakReference weakReference = this.f6697H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f6704O != null) {
                    return;
                }
                this.f6704O = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f6697H.get() && z && Build.VERSION.SDK_INT >= 16) {
                    this.f6704O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f6704O = null;
        }
    }

    /* renamed from: S */
    public final void m331S(boolean z) {
        View view;
        if (this.f6697H != null) {
            m348B();
            if (this.f6731z != 4 || (view = (View) this.f6697H.get()) == null) {
                return;
            }
            if (z) {
                m337M(this.f6731z);
            } else {
                view.requestLayout();
            }
        }
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: f */
    public void mo209f(C0455e c0455e) {
        this.f6697H = null;
        this.f6690A = null;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: i */
    public void mo330i() {
        this.f6697H = null;
        this.f6690A = null;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: j */
    public boolean mo272j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0664i c0664i;
        if (view.isShown() && this.f6730y) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f6701L = -1;
                VelocityTracker velocityTracker = this.f6700K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f6700K = null;
                }
            }
            if (this.f6700K == null) {
                this.f6700K = VelocityTracker.obtain();
            }
            this.f6700K.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.f6702M = (int) motionEvent.getY();
                if (this.f6731z != 2) {
                    WeakReference weakReference = this.f6698I;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && coordinatorLayout.m3354o(view2, x, this.f6702M)) {
                        this.f6701L = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f6703N = true;
                    }
                }
                this.f6691B = this.f6701L == -1 && !coordinatorLayout.m3354o(view, x, this.f6702M);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f6703N = false;
                this.f6701L = -1;
                if (this.f6691B) {
                    this.f6691B = false;
                    return false;
                }
            }
            if (this.f6691B || (c0664i = this.f6690A) == null || !c0664i.m2124u(motionEvent)) {
                WeakReference weakReference2 = this.f6698I;
                View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
                return (actionMasked != 2 || view3 == null || this.f6691B || this.f6731z == 1 || coordinatorLayout.m3354o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f6690A == null || Math.abs(((float) this.f6702M) - motionEvent.getY()) <= ((float) this.f6690A.f2877c)) ? false : true;
            }
            return true;
        }
        this.f6691B = true;
        return false;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        C1851i c1851i;
        if (AbstractC0605j0.m2243o(coordinatorLayout) && !AbstractC0605j0.m2243o(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f6697H == null) {
            this.f6712g = coordinatorLayout.getResources().getDimensionPixelSize(AbstractC1829d.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && !this.f6717l && !this.f6711f) {
                AbstractC1077v0.m1267l(view, new C1980c(this));
            }
            this.f6697H = new WeakReference(view);
            if (this.f6714i && (c1851i = this.f6715j) != null) {
                if (i3 >= 16) {
                    view.setBackground(c1851i);
                } else {
                    view.setBackgroundDrawable(c1851i);
                }
            }
            C1851i c1851i2 = this.f6715j;
            if (c1851i2 != null) {
                float f = this.f6727v;
                if (f == -1.0f) {
                    f = AbstractC0605j0.m2245m(view);
                }
                c1851i2.m738o(f);
                boolean z = this.f6731z == 3;
                this.f6719n = z;
                this.f6715j.m736q(z ? 0.0f : 1.0f);
            }
            m334P();
            if (AbstractC0605j0.m2242p(view) == 0) {
                AbstractC0605j0.m2263T(view, 1);
            }
        }
        if (this.f6690A == null) {
            this.f6690A = new C0664i(coordinatorLayout.getContext(), coordinatorLayout, this.f6706Q);
        }
        int top = view.getTop();
        coordinatorLayout.m3352q(view, i);
        this.f6695F = coordinatorLayout.getWidth();
        this.f6696G = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f6694E = height;
        this.f6723r = Math.max(0, this.f6696G - height);
        this.f6724s = (int) ((1.0f - this.f6725t) * this.f6696G);
        m348B();
        int i4 = this.f6731z;
        if (i4 == 3) {
            i2 = m343G();
        } else if (i4 == 6) {
            i2 = this.f6724s;
        } else if (this.f6728w && i4 == 5) {
            i2 = this.f6696G;
        } else if (i4 != 4) {
            if (i4 == 1 || i4 == 2) {
                AbstractC0605j0.m2280C(view, top - view.getTop());
            }
            this.f6698I = new WeakReference(m344F(view));
            return true;
        } else {
            i2 = this.f6726u;
        }
        AbstractC0605j0.m2280C(view, i2);
        this.f6698I = new WeakReference(m344F(view));
        return true;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: n */
    public boolean mo329n(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.f6698I;
        return (weakReference == null || view2 != weakReference.get() || this.f6731z == 3) ? false : true;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: p */
    public void mo328p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f6698I;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m343G()) {
                iArr[1] = top - m343G();
                AbstractC0605j0.m2280C(view, -iArr[1]);
                i4 = 3;
                m339K(i4);
            } else if (!this.f6730y) {
                return;
            } else {
                iArr[1] = i2;
                AbstractC0605j0.m2280C(view, -i2);
                m339K(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f6726u;
            if (i5 > i6 && !this.f6728w) {
                iArr[1] = top - i6;
                AbstractC0605j0.m2280C(view, -iArr[1]);
                i4 = 4;
                m339K(i4);
            } else if (!this.f6730y) {
                return;
            } else {
                iArr[1] = i2;
                AbstractC0605j0.m2280C(view, -i2);
                m339K(1);
            }
        }
        m345E(view.getTop());
        this.f6692C = i2;
        this.f6693D = true;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: r */
    public void mo327r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: u */
    public void mo326u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f6707b;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f6710e = savedState.f6733e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f6708c = savedState.f6734f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f6728w = savedState.f6735g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f6729x = savedState.f6736h;
            }
        }
        int i2 = savedState.f6732d;
        if (i2 == 1 || i2 == 2) {
            this.f6731z = 4;
        } else {
            this.f6731z = i2;
        }
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: v */
    public Parcelable mo325v(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: x */
    public boolean mo324x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f6692C = 0;
        this.f6693D = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 > r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        if (java.lang.Math.abs(r2 - r1.f6723r) < java.lang.Math.abs(r2 - r1.f6726u)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.f6726u)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
        r2 = r1.f6722q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.f6726u)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
        if (java.lang.Math.abs(r2 - r1.f6724s) < java.lang.Math.abs(r2 - r1.f6726u)) goto L43;
     */
    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo323z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int i2;
        int i3;
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == m343G()) {
            m339K(3);
            return;
        }
        WeakReference weakReference = this.f6698I;
        if (weakReference != null && view2 == weakReference.get() && this.f6693D) {
            if (this.f6692C > 0) {
                if (!this.f6708c) {
                    int top = view.getTop();
                    i2 = this.f6724s;
                }
                i3 = this.f6723r;
            } else {
                if (this.f6728w) {
                    VelocityTracker velocityTracker = this.f6700K;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f6709d);
                        yVelocity = this.f6700K.getYVelocity(this.f6701L);
                    }
                    if (m336N(view, yVelocity)) {
                        i3 = this.f6696G;
                        i4 = 5;
                    }
                }
                if (this.f6692C == 0) {
                    int top2 = view.getTop();
                    if (!this.f6708c) {
                        int i5 = this.f6724s;
                        if (top2 < i5) {
                        }
                        i2 = this.f6724s;
                        i4 = 6;
                        i3 = i2;
                    }
                    i3 = this.f6726u;
                    i4 = 4;
                } else {
                    if (!this.f6708c) {
                        int top3 = view.getTop();
                    }
                    i3 = this.f6726u;
                    i4 = 4;
                }
            }
            m335O(view, i4, i3, false);
            this.f6693D = false;
        }
    }
}