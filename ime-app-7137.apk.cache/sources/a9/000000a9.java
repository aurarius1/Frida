package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p037h.p040b.AbstractC0403k;
import p010b.p046j.p054h.AbstractC0530c;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.AbstractC0607k0;
import p010b.p046j.p058l.C0612n;
import p010b.p046j.p058l.InterfaceC0610m;
import p010b.p083u.AbstractC0910a;
import p010b.p083u.AbstractC0911b;
import p010b.p083u.AbstractC0913d;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0933e2;
import p010b.p083u.p084e.AbstractC0941g2;
import p010b.p083u.p084e.AbstractC0956k1;
import p010b.p083u.p084e.AbstractC0964m1;
import p010b.p083u.p084e.AbstractC0980q1;
import p010b.p083u.p084e.AbstractC0988s1;
import p010b.p083u.p084e.AbstractC0996u1;
import p010b.p083u.p084e.C0914a;
import p010b.p083u.p084e.C0917a2;
import p010b.p083u.p084e.C0918b;
import p010b.p083u.p084e.C0920b1;
import p010b.p083u.p084e.C0922c;
import p010b.p083u.p084e.C0924c1;
import p010b.p083u.p084e.C0926d;
import p010b.p083u.p084e.C0928d1;
import p010b.p083u.p084e.C0929d2;
import p010b.p083u.p084e.C0935f0;
import p010b.p083u.p084e.C0944h1;
import p010b.p083u.p084e.C0949i2;
import p010b.p083u.p084e.C0952j1;
import p010b.p083u.p084e.C0959l0;
import p010b.p083u.p084e.C0960l1;
import p010b.p083u.p084e.C0970o;
import p010b.p083u.p084e.C0983r0;
import p010b.p083u.p084e.C0984r1;
import p010b.p083u.p084e.C0990t;
import p010b.p083u.p084e.C0997u2;
import p010b.p083u.p084e.C0998v;
import p010b.p083u.p084e.C1000v1;
import p010b.p083u.p084e.C1001v2;
import p010b.p083u.p084e.C1004w1;
import p010b.p083u.p084e.C1006x0;
import p010b.p083u.p084e.C1007x1;
import p010b.p083u.p084e.C1013z1;
import p010b.p083u.p084e.InterfaceC0940g1;
import p010b.p083u.p084e.InterfaceC0992t1;
import p010b.p083u.p084e.InterfaceC1010y1;
import p010b.p083u.p084e.RunnableC0937f2;
import p010b.p083u.p084e.RunnableC1005x;
import p010b.p083u.p084e.RunnableC1009y0;
import p010b.p083u.p084e.RunnableC1012z0;
import p010b.p083u.p084e.animationInterpolatorC0916a1;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0610m {

    /* renamed from: b */
    public static final int[] f699b = {16843830};

    /* renamed from: c */
    public static final boolean f700c;

    /* renamed from: d */
    public static final boolean f701d;

    /* renamed from: e */
    public static final boolean f702e;

    /* renamed from: f */
    public static final boolean f703f;

    /* renamed from: g */
    public static final boolean f704g;

    /* renamed from: h */
    public static final boolean f705h;

    /* renamed from: i */
    public static final Class[] f706i;

    /* renamed from: j */
    public static final Interpolator f707j;

    /* renamed from: A */
    public final ArrayList f708A;

    /* renamed from: A0 */
    public InterfaceC0940g1 f709A0;

    /* renamed from: B */
    public InterfaceC0992t1 f710B;

    /* renamed from: B0 */
    public final int[] f711B0;

    /* renamed from: C */
    public boolean f712C;

    /* renamed from: C0 */
    public C0612n f713C0;

    /* renamed from: D */
    public boolean f714D;

    /* renamed from: D0 */
    public final int[] f715D0;

    /* renamed from: E */
    public boolean f716E;

    /* renamed from: E0 */
    public final int[] f717E0;

    /* renamed from: F */
    public boolean f718F;

    /* renamed from: F0 */
    public final int[] f719F0;

    /* renamed from: G */
    public int f720G;

    /* renamed from: G0 */
    public final List f721G0;

    /* renamed from: H */
    public boolean f722H;

    /* renamed from: H0 */
    public Runnable f723H0;

    /* renamed from: I */
    public boolean f724I;

    /* renamed from: I0 */
    public boolean f725I0;

    /* renamed from: J */
    public boolean f726J;

    /* renamed from: J0 */
    public int f727J0;

    /* renamed from: K */
    public int f728K;

    /* renamed from: K0 */
    public int f729K0;

    /* renamed from: L */
    public boolean f730L;

    /* renamed from: L0 */
    public final C0920b1 f731L0;

    /* renamed from: M */
    public final AccessibilityManager f732M;

    /* renamed from: N */
    public List f733N;

    /* renamed from: O */
    public boolean f734O;

    /* renamed from: P */
    public boolean f735P;

    /* renamed from: Q */
    public int f736Q;

    /* renamed from: R */
    public int f737R;

    /* renamed from: S */
    public C0944h1 f738S;

    /* renamed from: T */
    public EdgeEffect f739T;

    /* renamed from: U */
    public EdgeEffect f740U;

    /* renamed from: V */
    public EdgeEffect f741V;

    /* renamed from: W */
    public EdgeEffect f742W;

    /* renamed from: a0 */
    public AbstractC0956k1 f743a0;

    /* renamed from: b0 */
    public int f744b0;

    /* renamed from: c0 */
    public int f745c0;

    /* renamed from: d0 */
    public VelocityTracker f746d0;

    /* renamed from: e0 */
    public int f747e0;

    /* renamed from: f0 */
    public int f748f0;

    /* renamed from: g0 */
    public int f749g0;

    /* renamed from: h0 */
    public int f750h0;

    /* renamed from: i0 */
    public int f751i0;

    /* renamed from: j0 */
    public AbstractC0988s1 f752j0;

    /* renamed from: k */
    public final C1013z1 f753k;

    /* renamed from: k0 */
    public final int f754k0;

    /* renamed from: l */
    public final C1007x1 f755l;

    /* renamed from: l0 */
    public final int f756l0;

    /* renamed from: m */
    public SavedState f757m;

    /* renamed from: m0 */
    public float f758m0;

    /* renamed from: n */
    public C0918b f759n;

    /* renamed from: n0 */
    public float f760n0;

    /* renamed from: o */
    public C0926d f761o;

    /* renamed from: o0 */
    public boolean f762o0;

    /* renamed from: p */
    public final C1001v2 f763p;

    /* renamed from: p0 */
    public final RunnableC0937f2 f764p0;

    /* renamed from: q */
    public boolean f765q;

    /* renamed from: q0 */
    public RunnableC1005x f766q0;

    /* renamed from: r */
    public final Runnable f767r;

    /* renamed from: r0 */
    public C0998v f768r0;

    /* renamed from: s */
    public final Rect f769s;

    /* renamed from: s0 */
    public final C0929d2 f770s0;

    /* renamed from: t */
    public final Rect f771t;

    /* renamed from: t0 */
    public AbstractC0996u1 f772t0;

    /* renamed from: u */
    public final RectF f773u;

    /* renamed from: u0 */
    public List f774u0;

    /* renamed from: v */
    public AbstractC0932e1 f775v;

    /* renamed from: v0 */
    public boolean f776v0;

    /* renamed from: w */
    public AbstractC0980q1 f777w;

    /* renamed from: w0 */
    public boolean f778w0;

    /* renamed from: x */
    public InterfaceC1010y1 f779x;

    /* renamed from: x0 */
    public C0960l1 f780x0;

    /* renamed from: y */
    public final List f781y;

    /* renamed from: y0 */
    public boolean f782y0;

    /* renamed from: z */
    public final ArrayList f783z;

    /* renamed from: z0 */
    public C0949i2 f784z0;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0917a2();

        /* renamed from: d */
        public Parcelable f785d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f785d = parcel.readParcelable(classLoader == null ? AbstractC0980q1.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeParcelable(this.f785d, 0);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f700c = i == 18 || i == 19 || i == 20;
        f701d = i >= 23;
        f702e = i >= 16;
        f703f = i >= 21;
        f704g = i <= 15;
        f705h = i <= 15;
        Class cls = Integer.TYPE;
        f706i = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f707j = new animationInterpolatorC0916a1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0910a.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:38|(1:40)(10:78|(1:80)|42|43|44|(1:46)(1:62)|47|48|49|50)|41|42|43|44|(0)(0)|47|48|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0282, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0284, code lost:
        r0 = r3.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x028a, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x029b, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02bb, code lost:
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0250 A[Catch: ClassCastException -> 0x02bc, IllegalAccessException -> 0x02db, InstantiationException -> 0x02fa, InvocationTargetException -> 0x0317, ClassNotFoundException -> 0x0334, TryCatch #4 {ClassCastException -> 0x02bc, ClassNotFoundException -> 0x0334, IllegalAccessException -> 0x02db, InstantiationException -> 0x02fa, InvocationTargetException -> 0x0317, blocks: (B:55:0x024a, B:57:0x0250, B:59:0x025d, B:60:0x0267, B:66:0x028c, B:64:0x0284, B:68:0x029b, B:69:0x02bb, B:58:0x0259), top: B:94:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0259 A[Catch: ClassCastException -> 0x02bc, IllegalAccessException -> 0x02db, InstantiationException -> 0x02fa, InvocationTargetException -> 0x0317, ClassNotFoundException -> 0x0334, TryCatch #4 {ClassCastException -> 0x02bc, ClassNotFoundException -> 0x0334, IllegalAccessException -> 0x02db, InstantiationException -> 0x02fa, InvocationTargetException -> 0x0317, blocks: (B:55:0x024a, B:57:0x0250, B:59:0x025d, B:60:0x0267, B:66:0x028c, B:64:0x0284, B:68:0x029b, B:69:0x02bb, B:58:0x0259), top: B:94:0x024a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        char c;
        StringBuilder sb;
        String str;
        this.f753k = new C1013z1(this);
        this.f755l = new C1007x1(this);
        this.f763p = new C1001v2();
        this.f767r = new RunnableC1009y0(this);
        this.f769s = new Rect();
        this.f771t = new Rect();
        this.f773u = new RectF();
        this.f781y = new ArrayList();
        this.f783z = new ArrayList();
        this.f708A = new ArrayList();
        this.f720G = 0;
        this.f734O = false;
        this.f735P = false;
        this.f736Q = 0;
        this.f737R = 0;
        this.f738S = new C0944h1();
        this.f743a0 = new C0970o();
        this.f744b0 = 0;
        this.f745c0 = -1;
        this.f758m0 = Float.MIN_VALUE;
        this.f760n0 = Float.MIN_VALUE;
        boolean z = true;
        this.f762o0 = true;
        this.f764p0 = new RunnableC0937f2(this);
        this.f768r0 = f703f ? new C0998v() : null;
        this.f770s0 = new C0929d2();
        this.f776v0 = false;
        this.f778w0 = false;
        this.f780x0 = new C0960l1(this);
        this.f782y0 = false;
        this.f711B0 = new int[2];
        this.f715D0 = new int[2];
        this.f717E0 = new int[2];
        this.f719F0 = new int[2];
        this.f721G0 = new ArrayList();
        this.f723H0 = new RunnableC1012z0(this);
        this.f727J0 = 0;
        this.f729K0 = 0;
        this.f731L0 = new C0920b1(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f751i0 = viewConfiguration.getScaledTouchSlop();
        Method method = AbstractC0607k0.f2760a;
        int i2 = Build.VERSION.SDK_INT;
        this.f758m0 = i2 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : AbstractC0607k0.m2230a(viewConfiguration, context);
        this.f760n0 = i2 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : AbstractC0607k0.m2230a(viewConfiguration, context);
        this.f754k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f756l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f743a0.f3658a = this.f780x0;
        this.f759n = new C0918b(new C0928d1(this));
        this.f761o = new C0926d(new C0924c1(this));
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if ((i2 >= 26 ? getImportantForAutofill() : 0) == 0 && i2 >= 26) {
            setImportantForAutofill(8);
        }
        if (AbstractC0605j0.m2242p(this) == 0) {
            AbstractC0605j0.m2263T(this, 1);
        }
        this.f732M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0949i2(this));
        int[] iArr = AbstractC0913d.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC0605j0.m2270M(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(AbstractC0913d.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(AbstractC0913d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f765q = obtainStyledAttributes.getBoolean(AbstractC0913d.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(AbstractC0913d.RecyclerView_fastScrollEnabled, false);
        this.f716E = z2;
        if (z2) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC0913d.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC0913d.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC0913d.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(AbstractC0913d.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC1124a.m1194b(this, AbstractC1124a.m1187i("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c = 2;
            typedArray = obtainStyledAttributes;
            new C0990t(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC0911b.fastscroll_default_thickness), resources.getDimensionPixelSize(AbstractC0911b.fastscroll_minimum_range), resources.getDimensionPixelOffset(AbstractC0911b.fastscroll_margin));
        } else {
            typedArray = obtainStyledAttributes;
            c = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                try {
                    if (trim.charAt(0) == '.') {
                        sb = new StringBuilder();
                        sb.append(context.getPackageName());
                    } else {
                        if (!trim.contains(".")) {
                            sb = new StringBuilder();
                            sb.append(RecyclerView.class.getPackage().getName());
                            sb.append('.');
                        }
                        str = trim;
                        Class<? extends U> asSubclass = Class.forName(str, false, !isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0980q1.class);
                        Constructor constructor = asSubclass.getConstructor(f706i);
                        Object[] objArr = new Object[4];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                        constructor.setAccessible(true);
                        setLayoutManager((AbstractC0980q1) constructor.newInstance(objArr));
                    }
                    Class<? extends U> asSubclass2 = Class.forName(str, false, !isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0980q1.class);
                    Constructor constructor2 = asSubclass2.getConstructor(f706i);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = context;
                    objArr2[1] = attributeSet;
                    objArr2[c] = Integer.valueOf(i);
                    objArr2[3] = 0;
                    constructor2.setAccessible(true);
                    setLayoutManager((AbstractC0980q1) constructor2.newInstance(objArr2));
                } catch (ClassCastException e) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e);
                } catch (ClassNotFoundException e2) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e3);
                } catch (InstantiationException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                }
                sb.append(trim);
                trim = sb.toString();
                str = trim;
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = f699b;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            AbstractC0605j0.m2270M(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: F */
    public static RecyclerView m3194F(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView m3194F = m3194F(viewGroup.getChildAt(i));
                if (m3194F != null) {
                    return m3194F;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: K */
    public static AbstractC0941g2 m3189K(View view) {
        if (view == null) {
            return null;
        }
        return ((C0984r1) view.getLayoutParams()).f3813a;
    }

    private C0612n getScrollingChildHelper() {
        if (this.f713C0 == null) {
            this.f713C0 = new C0612n(this);
        }
        return this.f713C0;
    }

    /* renamed from: k */
    public static void m3154k(AbstractC0941g2 abstractC0941g2) {
        WeakReference weakReference = abstractC0941g2.f3606d;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == abstractC0941g2.f3605c) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                abstractC0941g2.f3606d = null;
                return;
            }
        }
    }

    /* renamed from: A */
    public String m3199A() {
        StringBuilder m1187i = AbstractC1124a.m1187i(" ");
        m1187i.append(super.toString());
        m1187i.append(", adapter:");
        m1187i.append(this.f775v);
        m1187i.append(", layout:");
        m1187i.append(this.f777w);
        m1187i.append(", context:");
        m1187i.append(getContext());
        return m1187i.toString();
    }

    /* renamed from: B */
    public final void m3198B(C0929d2 c0929d2) {
        if (getScrollState() != 2) {
            c0929d2.getClass();
            return;
        }
        OverScroller overScroller = this.f764p0.f3597d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0929d2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m3197C(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: D */
    public final boolean m3196D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f708A.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0992t1 interfaceC0992t1 = (InterfaceC0992t1) this.f708A.get(i);
            if (interfaceC0992t1.mo1456a(this, motionEvent) && action != 3) {
                this.f710B = interfaceC0992t1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m3195E(int[] iArr) {
        int m1698e = this.f761o.m1698e();
        if (m1698e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m1698e; i3++) {
            AbstractC0941g2 m3189K = m3189K(this.f761o.m1699d(i3));
            if (!m3189K.m1651v()) {
                int m1666g = m3189K.m1666g();
                if (m1666g < i) {
                    i = m1666g;
                }
                if (m1666g > i2) {
                    i2 = m1666g;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: G */
    public AbstractC0941g2 m3193G(int i) {
        AbstractC0941g2 abstractC0941g2 = null;
        if (this.f734O) {
            return null;
        }
        int m1695h = this.f761o.m1695h();
        for (int i2 = 0; i2 < m1695h; i2++) {
            AbstractC0941g2 m3189K = m3189K(this.f761o.m1696g(i2));
            if (m3189K != null && !m3189K.m1659n() && m3192H(m3189K) == i) {
                if (!this.f761o.m1692k(m3189K.f3605c)) {
                    return m3189K;
                }
                abstractC0941g2 = m3189K;
            }
        }
        return abstractC0941g2;
    }

    /* renamed from: H */
    public int m3192H(AbstractC0941g2 abstractC0941g2) {
        if (!abstractC0941g2.m1664i(524) && abstractC0941g2.m1662k()) {
            C0918b c0918b = this.f759n;
            int i = abstractC0941g2.f3607e;
            int size = c0918b.f3532b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0914a c0914a = (C0914a) c0918b.f3532b.get(i2);
                int i3 = c0914a.f3525a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c0914a.f3526b;
                        if (i4 <= i) {
                            int i5 = c0914a.f3528d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c0914a.f3526b;
                        if (i6 == i) {
                            i = c0914a.f3528d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c0914a.f3528d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c0914a.f3526b <= i) {
                    i += c0914a.f3528d;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: I */
    public long m3191I(AbstractC0941g2 abstractC0941g2) {
        if (this.f775v.f3590b) {
            return abstractC0941g2.f3609g;
        }
        return abstractC0941g2.f3607e;
    }

    /* renamed from: J */
    public AbstractC0941g2 m3190J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m3189K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: L */
    public Rect m3188L(View view) {
        C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
        if (c0984r1.f3815c) {
            if (this.f770s0.f3576g && (c0984r1.m1472b() || c0984r1.f3813a.m1661l())) {
                return c0984r1.f3814b;
            }
            Rect rect = c0984r1.f3814b;
            rect.set(0, 0, 0, 0);
            int size = this.f783z.size();
            for (int i = 0; i < size; i++) {
                this.f769s.set(0, 0, 0, 0);
                ((AbstractC0964m1) this.f783z.get(i)).mo1129d(this.f769s, view, this, this.f770s0);
                int i2 = rect.left;
                Rect rect2 = this.f769s;
                rect.left = i2 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            c0984r1.f3815c = false;
            return rect;
        }
        return c0984r1.f3814b;
    }

    /* renamed from: M */
    public boolean m3187M() {
        return !this.f718F || this.f734O || this.f759n.m1725g();
    }

    /* renamed from: N */
    public void m3186N() {
        this.f742W = null;
        this.f740U = null;
        this.f741V = null;
        this.f739T = null;
    }

    /* renamed from: O */
    public void m3185O() {
        if (this.f783z.size() == 0) {
            return;
        }
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            abstractC0980q1.mo1536d("Cannot invalidate item decorations during a scroll or layout");
        }
        m3182R();
        requestLayout();
    }

    /* renamed from: P */
    public boolean m3184P() {
        return this.f736Q > 0;
    }

    /* renamed from: Q */
    public void m3183Q(int i) {
        if (this.f777w == null) {
            return;
        }
        setScrollState(2);
        this.f777w.mo1565N0(i);
        awakenScrollBars();
    }

    /* renamed from: R */
    public void m3182R() {
        int m1695h = this.f761o.m1695h();
        for (int i = 0; i < m1695h; i++) {
            ((C0984r1) this.f761o.m1696g(i).getLayoutParams()).f3815c = true;
        }
        C1007x1 c1007x1 = this.f755l;
        int size = c1007x1.f3894c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0984r1 c0984r1 = (C0984r1) ((AbstractC0941g2) c1007x1.f3894c.get(i2)).f3605c.getLayoutParams();
            if (c0984r1 != null) {
                c0984r1.f3815c = true;
            }
        }
    }

    /* renamed from: S */
    public void m3181S(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m1695h = this.f761o.m1695h();
        for (int i4 = 0; i4 < m1695h; i4++) {
            AbstractC0941g2 m3189K = m3189K(this.f761o.m1696g(i4));
            if (m3189K != null && !m3189K.m1651v()) {
                int i5 = m3189K.f3607e;
                if (i5 >= i3) {
                    m3189K.m1655r(-i2, z);
                } else if (i5 >= i) {
                    m3189K.m1671b(8);
                    m3189K.m1655r(-i2, z);
                    m3189K.f3607e = i - 1;
                }
                this.f770s0.f3575f = true;
            }
        }
        C1007x1 c1007x1 = this.f755l;
        int size = c1007x1.f3894c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) c1007x1.f3894c.get(size);
            if (abstractC0941g2 != null) {
                int i6 = abstractC0941g2.f3607e;
                if (i6 >= i3) {
                    abstractC0941g2.m1655r(-i2, z);
                } else if (i6 >= i) {
                    abstractC0941g2.m1671b(8);
                    c1007x1.m1401g(size);
                }
            }
        }
    }

    /* renamed from: T */
    public void m3180T() {
    }

    /* renamed from: U */
    public void m3179U() {
    }

    /* renamed from: V */
    public void m3178V() {
        this.f736Q++;
    }

    /* renamed from: W */
    public void m3177W(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f736Q - 1;
        this.f736Q = i2;
        if (i2 < 1) {
            this.f736Q = 0;
            if (z) {
                int i3 = this.f728K;
                this.f728K = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f732M;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        if (Build.VERSION.SDK_INT >= 19) {
                            obtain.setContentChangeTypes(i3);
                        }
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f721G0.size() - 1; size >= 0; size--) {
                    AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) this.f721G0.get(size);
                    if (abstractC0941g2.f3605c.getParent() == this && !abstractC0941g2.m1651v() && (i = abstractC0941g2.f3621s) != -1) {
                        AbstractC0605j0.m2263T(abstractC0941g2.f3605c, i);
                        abstractC0941g2.f3621s = -1;
                    }
                }
                this.f721G0.clear();
            }
        }
    }

    /* renamed from: X */
    public final void m3176X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f745c0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f745c0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f749g0 = x;
            this.f747e0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f750h0 = y;
            this.f748f0 = y;
        }
    }

    /* renamed from: Y */
    public void m3175Y() {
    }

    /* renamed from: Z */
    public void m3174Z() {
    }

    /* renamed from: a0 */
    public void m3172a0() {
        if (this.f782y0 || !this.f712C) {
            return;
        }
        AbstractC0605j0.m2276G(this, this.f723H0);
        this.f782y0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null || !abstractC0980q1.m1531f0()) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public final void m3171b0() {
        boolean z;
        boolean z2 = false;
        if (this.f734O) {
            C0918b c0918b = this.f759n;
            c0918b.m1720l(c0918b.f3532b);
            c0918b.m1720l(c0918b.f3533c);
            c0918b.f3536f = 0;
            if (this.f735P) {
                this.f777w.mo1509q0(this);
            }
        }
        if (this.f743a0 != null && this.f777w.mo1542Z0()) {
            this.f759n.m1722j();
        } else {
            this.f759n.m1729c();
        }
        boolean z3 = this.f776v0 || this.f778w0;
        C0929d2 c0929d2 = this.f770s0;
        boolean z4 = this.f718F && this.f743a0 != null && ((z = this.f734O) || z3 || this.f777w.f3779h) && (!z || this.f775v.f3590b);
        c0929d2.f3579j = z4;
        if (z4 && z3 && !this.f734O) {
            if (this.f743a0 != null && this.f777w.mo1542Z0()) {
                z2 = true;
            }
        }
        c0929d2.f3580k = z2;
    }

    /* renamed from: c0 */
    public void m3169c0(boolean z) {
        this.f735P = z | this.f735P;
        this.f734O = true;
        int m1695h = this.f761o.m1695h();
        for (int i = 0; i < m1695h; i++) {
            AbstractC0941g2 m3189K = m3189K(this.f761o.m1696g(i));
            if (m3189K != null && !m3189K.m1651v()) {
                m3189K.m1671b(6);
            }
        }
        m3182R();
        C1007x1 c1007x1 = this.f755l;
        int size = c1007x1.f3894c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) c1007x1.f3894c.get(i2);
            if (abstractC0941g2 != null) {
                abstractC0941g2.m1671b(6);
                abstractC0941g2.m1672a(null);
            }
        }
        AbstractC0932e1 abstractC0932e1 = c1007x1.f3899h.f775v;
        if (abstractC0932e1 == null || !abstractC0932e1.f3590b) {
            c1007x1.m1402f();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0984r1) && this.f777w.mo1528h((C0984r1) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null && abstractC0980q1.mo1532f()) {
            return this.f777w.mo1520l(this.f770s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null && abstractC0980q1.mo1532f()) {
            return this.f777w.mo1518m(this.f770s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null && abstractC0980q1.mo1532f()) {
            return this.f777w.mo1516n(this.f770s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null && abstractC0980q1.mo1530g()) {
            return this.f777w.mo1514o(this.f770s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null && abstractC0980q1.mo1530g()) {
            return this.f777w.mo1512p(this.f770s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null && abstractC0980q1.mo1530g()) {
            return this.f777w.mo1510q(this.f770s0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public void m3167d0(AbstractC0941g2 abstractC0941g2, C0952j1 c0952j1) {
        abstractC0941g2.m1653t(0, 8192);
        if (this.f770s0.f3577h && abstractC0941g2.m1656q() && !abstractC0941g2.m1659n() && !abstractC0941g2.m1651v()) {
            this.f763p.f3873b.m2642g(m3191I(abstractC0941g2), abstractC0941g2);
        }
        this.f763p.m1428c(abstractC0941g2, c0952j1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m2227a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m2226b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2225c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m2223e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.f783z.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0964m1) this.f783z.get(i)).mo1463f(canvas, this, this.f770s0);
        }
        EdgeEffect edgeEffect = this.f739T;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f765q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f739T;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f740U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f765q) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f740U;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f741V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f765q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f741V;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f742W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f765q) {
                f = getPaddingRight() + (-getWidth());
                f2 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f2 = -getHeight();
            }
            canvas.translate(f, f2);
            EdgeEffect edgeEffect8 = this.f742W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f743a0 == null || this.f783z.size() <= 0 || !this.f743a0.mo1608g()) {
            z3 = z;
        }
        if (z3) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public void m3165e0() {
        AbstractC0956k1 abstractC0956k1 = this.f743a0;
        if (abstractC0956k1 != null) {
            abstractC0956k1.mo1609f();
        }
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            abstractC0980q1.m1581F0(this.f755l);
            this.f777w.m1579G0(this.f755l);
        }
        this.f755l.m1406b();
    }

    /* renamed from: f */
    public final void m3164f(AbstractC0941g2 abstractC0941g2) {
        View view = abstractC0941g2.f3605c;
        boolean z = view.getParent() == this;
        this.f755l.m1396l(m3190J(view));
        if (abstractC0941g2.m1657p()) {
            this.f761o.m1701b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0926d c0926d = this.f761o;
        if (!z) {
            c0926d.m1702a(view, -1, true);
            return;
        }
        int indexOfChild = c0926d.f3550a.f3549a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0926d.f3551b.m1707h(indexOfChild);
            c0926d.m1694i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: f0 */
    public void m3163f0(AbstractC0964m1 abstractC0964m1) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            abstractC0980q1.mo1536d("Cannot remove item decoration during a scroll  or layout");
        }
        this.f783z.remove(abstractC0964m1);
        if (this.f783z.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m3182R();
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0177, code lost:
        if (r3 > 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0191, code lost:
        if (r6 > 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0194, code lost:
        if (r3 < 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0197, code lost:
        if (r6 < 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a0, code lost:
        if ((r6 * r1) <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
        if ((r6 * r1) >= 0) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c;
        boolean z;
        View m1513o0 = this.f777w.m1513o0();
        if (m1513o0 != null) {
            return m1513o0;
        }
        boolean z2 = false;
        boolean z3 = (this.f775v == null || this.f777w == null || m3184P() || this.f724I) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i == 2 || i == 1)) {
            if (this.f777w.mo1530g()) {
                int i3 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i3) == null;
                if (f704g) {
                    i = i3;
                }
            } else {
                z = false;
            }
            if (!z && this.f777w.mo1532f()) {
                int i4 = (this.f777w.m1570L() == 1) ^ (i == 2) ? 66 : 17;
                z = focusFinder.findNextFocus(this, view, i4) == null;
                if (f704g) {
                    i = i4;
                }
            }
            if (z) {
                m3148n();
                if (m3197C(view) == null) {
                    return null;
                }
                m3147n0();
                this.f777w.mo1523j0(view, i, this.f755l, this.f770s0);
                m3143p0(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                m3148n();
                if (m3197C(view) == null) {
                    return null;
                }
                m3147n0();
                view2 = this.f777w.mo1523j0(view, i, this.f755l, this.f770s0);
                m3143p0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m3161g0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (m3197C(view2) != null) {
                if (view != null && m3197C(view) != null) {
                    this.f769s.set(0, 0, view.getWidth(), view.getHeight());
                    this.f771t.set(0, 0, view2.getWidth(), view2.getHeight());
                    offsetDescendantRectToMyCoords(view, this.f769s);
                    offsetDescendantRectToMyCoords(view2, this.f771t);
                    int i5 = this.f777w.m1570L() == 1 ? -1 : 1;
                    Rect rect = this.f769s;
                    int i6 = rect.left;
                    Rect rect2 = this.f771t;
                    int i7 = rect2.left;
                    if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                        i2 = 1;
                    } else {
                        int i8 = rect.right;
                        int i9 = rect2.right;
                        i2 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
                    }
                    int i10 = rect.top;
                    int i11 = rect2.top;
                    if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                        c = 1;
                    } else {
                        int i12 = rect.bottom;
                        int i13 = rect2.bottom;
                        c = ((i12 > i13 || i10 >= i13) && i10 > i11) ? (char) 65535 : (char) 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Invalid direction: ");
                                            sb.append(i);
                                            throw new IllegalArgumentException(AbstractC1124a.m1194b(this, sb));
                                        }
                                    }
                                }
                            }
                        } else if (c <= 0) {
                            if (c == 0) {
                            }
                        }
                    } else if (c >= 0) {
                        if (c == 0) {
                        }
                    }
                }
                z2 = true;
            }
            return !z2 ? view2 : super.focusSearch(view, i);
        }
        z2 = false;
        if (!z2) {
        }
    }

    /* renamed from: g */
    public void m3162g(AbstractC0964m1 abstractC0964m1) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            abstractC0980q1.mo1536d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f783z.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f783z.add(abstractC0964m1);
        m3182R();
        requestLayout();
    }

    /* renamed from: g0 */
    public final void m3161g0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f769s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0984r1) {
            C0984r1 c0984r1 = (C0984r1) layoutParams;
            if (!c0984r1.f3815c) {
                Rect rect = c0984r1.f3814b;
                Rect rect2 = this.f769s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f769s);
            offsetRectIntoDescendantCoords(view, this.f769s);
        }
        this.f777w.m1571K0(this, view, this.f769s, !this.f718F, view2 == null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            return abstractC0980q1.mo1500v();
        }
        throw new IllegalStateException(AbstractC1124a.m1194b(this, AbstractC1124a.m1187i("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            return abstractC0980q1.mo1498w(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC1124a.m1194b(this, AbstractC1124a.m1187i("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            return abstractC0980q1.mo1496x(layoutParams);
        }
        throw new IllegalStateException(AbstractC1124a.m1194b(this, AbstractC1124a.m1187i("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0932e1 getAdapter() {
        return this.f775v;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            abstractC0980q1.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC0940g1 interfaceC0940g1 = this.f709A0;
        if (interfaceC0940g1 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        C0935f0 c0935f0 = (C0935f0) interfaceC0940g1;
        C0959l0 c0959l0 = c0935f0.f3594a;
        View view = c0959l0.f3696x;
        if (view == null) {
            return i2;
        }
        int i3 = c0959l0.f3697y;
        if (i3 == -1) {
            i3 = c0959l0.f3690r.indexOfChild(view);
            c0935f0.f3594a.f3697y = i3;
        }
        return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f765q;
    }

    public C0949i2 getCompatAccessibilityDelegate() {
        return this.f784z0;
    }

    public C0944h1 getEdgeEffectFactory() {
        return this.f738S;
    }

    public AbstractC0956k1 getItemAnimator() {
        return this.f743a0;
    }

    public int getItemDecorationCount() {
        return this.f783z.size();
    }

    public AbstractC0980q1 getLayoutManager() {
        return this.f777w;
    }

    public int getMaxFlingVelocity() {
        return this.f756l0;
    }

    public int getMinFlingVelocity() {
        return this.f754k0;
    }

    public long getNanoTime() {
        if (f703f) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0988s1 getOnFlingListener() {
        return this.f752j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f762o0;
    }

    public C1004w1 getRecycledViewPool() {
        return this.f755l.m1404d();
    }

    public int getScrollState() {
        return this.f744b0;
    }

    /* renamed from: h */
    public void m3160h(AbstractC0996u1 abstractC0996u1) {
        if (this.f774u0 == null) {
            this.f774u0 = new ArrayList();
        }
        this.f774u0.add(abstractC0996u1);
    }

    /* renamed from: h0 */
    public final void m3159h0() {
        VelocityTracker velocityTracker = this.f746d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        m3141q0(0);
        EdgeEffect edgeEffect = this.f739T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f739T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f740U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f740U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f741V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f741V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f742W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f742W.isFinished();
        }
        if (z) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2220h(0);
    }

    /* renamed from: i */
    public void m3158i(String str) {
        if (m3184P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC1124a.m1194b(this, AbstractC1124a.m1187i("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else if (this.f737R > 0) {
            new IllegalStateException(AbstractC1124a.m1194b(this, AbstractC1124a.m1187i("")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m3157i0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        EdgeEffect edgeEffect;
        float width;
        float height;
        m3148n();
        if (this.f775v != null) {
            int[] iArr = this.f719F0;
            iArr[0] = 0;
            iArr[1] = 0;
            m3155j0(i, i2, iArr);
            int[] iArr2 = this.f719F0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f783z.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f719F0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m3136u(i5, i4, i6, i7, this.f715D0, i3, iArr3);
        int[] iArr4 = this.f719F0;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.f749g0;
        int[] iArr5 = this.f715D0;
        this.f749g0 = i12 - iArr5[0];
        this.f750h0 -= iArr5[1];
        int[] iArr6 = this.f717E0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    float x = motionEvent.getX();
                    float f = i10;
                    float y = motionEvent.getY();
                    float f2 = i11;
                    if (f < 0.0f) {
                        m3133x();
                        edgeEffect = this.f739T;
                        width = (-f) / getWidth();
                        height = 1.0f - (y / getHeight());
                    } else if (f > 0.0f) {
                        m3132y();
                        edgeEffect = this.f741V;
                        width = f / getWidth();
                        height = y / getHeight();
                    } else {
                        z = false;
                        if (f2 >= 0.0f) {
                            m3131z();
                            AbstractC0022t.m3512V(this.f740U, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                m3134w();
                                AbstractC0022t.m3512V(this.f742W, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z || f != 0.0f || f2 != 0.0f) {
                                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                                if (Build.VERSION.SDK_INT >= 16) {
                                    postInvalidateOnAnimation();
                                } else {
                                    postInvalidate();
                                }
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                        AtomicInteger atomicInteger2 = AbstractC0605j0.f2748a;
                        if (Build.VERSION.SDK_INT >= 16) {
                        }
                    }
                    AbstractC0022t.m3512V(edgeEffect, width, height);
                    z = true;
                    if (f2 >= 0.0f) {
                    }
                    z = true;
                    if (!z) {
                    }
                    AtomicInteger atomicInteger22 = AbstractC0605j0.f2748a;
                    if (Build.VERSION.SDK_INT >= 16) {
                    }
                }
            }
            m3150m(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            m3135v(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f712C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f724I;
    }

    @Override // android.view.View, p010b.p046j.p058l.InterfaceC0610m
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2772d;
    }

    /* renamed from: j */
    public final void m3156j() {
        m3159h0();
        setScrollState(0);
    }

    /* renamed from: j0 */
    public void m3155j0(int i, int i2, int[] iArr) {
        AbstractC0941g2 abstractC0941g2;
        m3147n0();
        m3178V();
        AbstractC0530c.m2348a("RV Scroll");
        m3198B(this.f770s0);
        int mo1567M0 = i != 0 ? this.f777w.mo1567M0(i, this.f755l, this.f770s0) : 0;
        int mo1563O0 = i2 != 0 ? this.f777w.mo1563O0(i2, this.f755l, this.f770s0) : 0;
        AbstractC0530c.m2347b();
        int m1698e = this.f761o.m1698e();
        for (int i3 = 0; i3 < m1698e; i3++) {
            View m1699d = this.f761o.m1699d(i3);
            AbstractC0941g2 m3190J = m3190J(m1699d);
            if (m3190J != null && (abstractC0941g2 = m3190J.f3613k) != null) {
                View view = abstractC0941g2.f3605c;
                int left = m1699d.getLeft();
                int top = m1699d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m3177W(true);
        m3143p0(false);
        if (iArr != null) {
            iArr[0] = mo1567M0;
            iArr[1] = mo1563O0;
        }
    }

    /* renamed from: k0 */
    public void m3153k0(int i) {
        if (this.f724I) {
            return;
        }
        m3139r0();
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null) {
            return;
        }
        abstractC0980q1.mo1565N0(i);
        awakenScrollBars();
    }

    /* renamed from: l */
    public void m3152l() {
        int m1695h = this.f761o.m1695h();
        for (int i = 0; i < m1695h; i++) {
            AbstractC0941g2 m3189K = m3189K(this.f761o.m1696g(i));
            if (!m3189K.m1651v()) {
                m3189K.m1670c();
            }
        }
        C1007x1 c1007x1 = this.f755l;
        int size = c1007x1.f3894c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0941g2) c1007x1.f3894c.get(i2)).m1670c();
        }
        int size2 = c1007x1.f3892a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC0941g2) c1007x1.f3892a.get(i3)).m1670c();
        }
        ArrayList arrayList = c1007x1.f3893b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC0941g2) c1007x1.f3893b.get(i4)).m1670c();
            }
        }
    }

    /* renamed from: l0 */
    public boolean m3151l0(AbstractC0941g2 abstractC0941g2, int i) {
        if (!m3184P()) {
            AbstractC0605j0.m2263T(abstractC0941g2.f3605c, i);
            return true;
        }
        abstractC0941g2.f3621s = i;
        this.f721G0.add(abstractC0941g2);
        return false;
    }

    /* renamed from: m */
    public void m3150m(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f739T;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f739T.onRelease();
            z = this.f739T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f741V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f741V.onRelease();
            z |= this.f741V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f740U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f740U.onRelease();
            z |= this.f740U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f742W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f742W.onRelease();
            z |= this.f742W.isFinished();
        }
        if (z) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    /* renamed from: m0 */
    public void m3149m0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null || this.f724I) {
            return;
        }
        if (!abstractC0980q1.mo1532f()) {
            i = 0;
        }
        if (!this.f777w.mo1530g()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            m3145o0(i4, 1);
        }
        this.f764p0.m1674b(i, i2, i3, interpolator);
    }

    /* renamed from: n */
    public void m3148n() {
        if (!this.f718F || this.f734O) {
            AbstractC0530c.m2348a("RV FullInvalidate");
            m3142q();
            AbstractC0530c.m2347b();
        } else if (this.f759n.m1725g()) {
            C0918b c0918b = this.f759n;
            int i = c0918b.f3536f;
            boolean z = false;
            if ((i & 4) != 0) {
                if (!((i & 11) != 0)) {
                    AbstractC0530c.m2348a("RV PartialInvalidate");
                    m3147n0();
                    m3178V();
                    this.f759n.m1722j();
                    if (!this.f722H) {
                        int m1698e = this.f761o.m1698e();
                        int i2 = 0;
                        while (true) {
                            if (i2 < m1698e) {
                                AbstractC0941g2 m3189K = m3189K(this.f761o.m1699d(i2));
                                if (m3189K != null && !m3189K.m1651v() && m3189K.m1656q()) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            m3142q();
                        } else {
                            this.f759n.m1730b();
                        }
                    }
                    m3143p0(true);
                    m3177W(true);
                    AbstractC0530c.m2347b();
                }
            }
            if (c0918b.m1725g()) {
                AbstractC0530c.m2348a("RV FullInvalidate");
                m3142q();
                AbstractC0530c.m2347b();
            }
        }
    }

    /* renamed from: n0 */
    public void m3147n0() {
        int i = this.f720G + 1;
        this.f720G = i;
        if (i != 1 || this.f724I) {
            return;
        }
        this.f722H = false;
    }

    /* renamed from: o */
    public void m3146o(int i, int i2) {
        setMeasuredDimension(AbstractC0980q1.m1526i(i, getPaddingRight() + getPaddingLeft(), AbstractC0605j0.m2239s(this)), AbstractC0980q1.m1526i(i2, getPaddingBottom() + getPaddingTop(), AbstractC0605j0.m2240r(this)));
    }

    /* renamed from: o0 */
    public boolean m3145o0(int i, int i2) {
        return getScrollingChildHelper().m2218j(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f736Q = 0;
        this.f712C = true;
        this.f718F = this.f718F && !isLayoutRequested();
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            abstractC0980q1.f3780i = true;
            abstractC0980q1.m1529g0();
        }
        this.f782y0 = false;
        if (f703f) {
            ThreadLocal threadLocal = RunnableC1005x.f3882b;
            RunnableC1005x runnableC1005x = (RunnableC1005x) threadLocal.get();
            this.f766q0 = runnableC1005x;
            if (runnableC1005x == null) {
                this.f766q0 = new RunnableC1005x();
                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                Display display = Build.VERSION.SDK_INT >= 17 ? getDisplay() : AbstractC0605j0.m2233y(this) ? ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay() : null;
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC1005x runnableC1005x2 = this.f766q0;
                runnableC1005x2.f3886f = 1.0E9f / f;
                threadLocal.set(runnableC1005x2);
            }
            this.f766q0.f3884d.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC1005x runnableC1005x;
        super.onDetachedFromWindow();
        AbstractC0956k1 abstractC0956k1 = this.f743a0;
        if (abstractC0956k1 != null) {
            abstractC0956k1.mo1609f();
        }
        m3139r0();
        this.f712C = false;
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            C1007x1 c1007x1 = this.f755l;
            abstractC0980q1.f3780i = false;
            abstractC0980q1.mo1525i0(this, c1007x1);
        }
        this.f721G0.clear();
        removeCallbacks(this.f723H0);
        this.f763p.getClass();
        do {
        } while (C0997u2.f3857a.mo2331a() != null);
        if (!f703f || (runnableC1005x = this.f766q0) == null) {
            return;
        }
        runnableC1005x.f3884d.remove(this);
        this.f766q0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f783z.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0964m1) this.f783z.get(i)).mo546e(canvas, this, this.f770s0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        int i;
        int i2;
        AbstractC0980q1 abstractC0980q1;
        boolean mo1532f;
        boolean mo1530g;
        RunnableC1005x runnableC1005x;
        if (this.f777w != null && !this.f724I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f777w.mo1530g() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f777w.mo1532f()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        i = (int) (f2 * this.f758m0);
                        i2 = (int) (f * this.f760n0);
                        abstractC0980q1 = this.f777w;
                        if (abstractC0980q1 != null && !this.f724I) {
                            int[] iArr = this.f719F0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            mo1532f = abstractC0980q1.mo1532f();
                            mo1530g = this.f777w.mo1530g();
                            m3145o0(!mo1530g ? mo1532f | 2 : mo1532f, 1);
                            if (m3137t(mo1532f == 0 ? i : 0, !mo1530g ? i2 : 0, this.f719F0, this.f715D0, 1)) {
                                int[] iArr2 = this.f719F0;
                                i -= iArr2[0];
                                i2 -= iArr2[1];
                            }
                            m3157i0(mo1532f == 0 ? i : 0, !mo1530g ? i2 : 0, motionEvent, 1);
                            runnableC1005x = this.f766q0;
                            if (runnableC1005x != null && (i != 0 || i2 != 0)) {
                                runnableC1005x.m1419a(this, i, i2);
                            }
                            getScrollingChildHelper().m2217k(1);
                        }
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                i = (int) (f2 * this.f758m0);
                i2 = (int) (f * this.f760n0);
                abstractC0980q1 = this.f777w;
                if (abstractC0980q1 != null) {
                    int[] iArr3 = this.f719F0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    mo1532f = abstractC0980q1.mo1532f();
                    mo1530g = this.f777w.mo1530g();
                    m3145o0(!mo1530g ? mo1532f | 2 : mo1532f, 1);
                    if (m3137t(mo1532f == 0 ? i : 0, !mo1530g ? i2 : 0, this.f719F0, this.f715D0, 1)) {
                    }
                    m3157i0(mo1532f == 0 ? i : 0, !mo1530g ? i2 : 0, motionEvent, 1);
                    runnableC1005x = this.f766q0;
                    if (runnableC1005x != null) {
                        runnableC1005x.m1419a(this, i, i2);
                    }
                    getScrollingChildHelper().m2217k(1);
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f777w.mo1530g()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        i = (int) (f2 * this.f758m0);
                        i2 = (int) (f * this.f760n0);
                        abstractC0980q1 = this.f777w;
                        if (abstractC0980q1 != null) {
                        }
                    } else if (this.f777w.mo1532f()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        i = (int) (f2 * this.f758m0);
                        i2 = (int) (f * this.f760n0);
                        abstractC0980q1 = this.f777w;
                        if (abstractC0980q1 != null) {
                        }
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                i = (int) (f2 * this.f758m0);
                i2 = (int) (f * this.f760n0);
                abstractC0980q1 = this.f777w;
                if (abstractC0980q1 != null) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f724I) {
            return false;
        }
        this.f710B = null;
        if (m3196D(motionEvent)) {
            m3156j();
            return true;
        }
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null) {
            return false;
        }
        boolean mo1532f = abstractC0980q1.mo1532f();
        boolean mo1530g = this.f777w.mo1530g();
        if (this.f746d0 == null) {
            this.f746d0 = VelocityTracker.obtain();
        }
        this.f746d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f726J) {
                this.f726J = false;
            }
            this.f745c0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f749g0 = x;
            this.f747e0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f750h0 = y;
            this.f748f0 = y;
            if (this.f744b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m3141q0(1);
            }
            int[] iArr = this.f717E0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo1532f;
            if (mo1530g) {
                i = (mo1532f ? 1 : 0) | 2;
            }
            m3145o0(i, 0);
        } else if (actionMasked == 1) {
            this.f746d0.clear();
            m3141q0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f745c0);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f744b0 != 1) {
                int i2 = x2 - this.f747e0;
                int i3 = y2 - this.f748f0;
                if (!mo1532f || Math.abs(i2) <= this.f751i0) {
                    z = false;
                } else {
                    this.f749g0 = x2;
                    z = true;
                }
                if (mo1530g && Math.abs(i3) > this.f751i0) {
                    this.f750h0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m3156j();
        } else if (actionMasked == 5) {
            this.f745c0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f749g0 = x3;
            this.f747e0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f750h0 = y3;
            this.f748f0 = y3;
        } else if (actionMasked == 6) {
            m3176X(motionEvent);
        }
        return this.f744b0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0530c.m2348a("RV OnLayout");
        m3142q();
        AbstractC0530c.m2347b();
        this.f718F = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null) {
            m3146o(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0980q1.mo1546X()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f777w.m1495x0(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f725I0 = z;
            if (z || this.f775v == null) {
                return;
            }
            if (this.f770s0.f3573d == 1) {
                m3140r();
            }
            this.f777w.m1559Q0(i, i2);
            this.f770s0.f3578i = true;
            m3138s();
            this.f777w.m1555S0(i, i2);
            if (this.f777w.mo1549V0()) {
                this.f777w.m1559Q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f770s0.f3578i = true;
                m3138s();
                this.f777w.m1555S0(i, i2);
            }
            this.f727J0 = getMeasuredWidth();
            this.f729K0 = getMeasuredHeight();
        } else if (this.f714D) {
            this.f777w.m1495x0(i, i2);
        } else {
            if (this.f730L) {
                m3147n0();
                m3178V();
                m3171b0();
                m3177W(true);
                C0929d2 c0929d2 = this.f770s0;
                if (c0929d2.f3580k) {
                    c0929d2.f3576g = true;
                } else {
                    this.f759n.m1729c();
                    this.f770s0.f3576g = false;
                }
                this.f730L = false;
                m3143p0(false);
            } else if (this.f770s0.f3580k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0932e1 abstractC0932e1 = this.f775v;
            if (abstractC0932e1 != null) {
                this.f770s0.f3574e = abstractC0932e1.mo543a();
            } else {
                this.f770s0.f3574e = 0;
            }
            m3147n0();
            this.f777w.m1495x0(i, i2);
            m3143p0(false);
            this.f770s0.f3576g = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m3184P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f757m = savedState;
        super.onRestoreInstanceState(savedState.f511c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f757m;
        if (savedState2 != null) {
            savedState.f785d = savedState2.f785d;
        } else {
            AbstractC0980q1 abstractC0980q1 = this.f777w;
            savedState.f785d = abstractC0980q1 != null ? abstractC0980q1.mo1589B0() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m3186N();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:148:0x021e */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: int */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0218, code lost:
        if (((r7 == null || r5.f3888a.getAdapter() == null || ((java.lang.Math.abs(r1) <= (r11 = r5.f3888a.getMinFlingVelocity()) && java.lang.Math.abs(r0) <= r11) || !r5.m1409h(r7, r0, r1))) ? false : true) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0270, code lost:
        if (r0 != false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f724I || this.f726J) {
            return false;
        }
        InterfaceC0992t1 interfaceC0992t1 = this.f710B;
        if (interfaceC0992t1 == null) {
            z = motionEvent.getAction() == 0 ? false : m3196D(motionEvent);
        } else {
            interfaceC0992t1.mo1455b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f710B = null;
            }
            z = true;
        }
        if (z) {
            m3156j();
            return true;
        }
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null) {
            return false;
        }
        boolean mo1532f = abstractC0980q1.mo1532f();
        boolean mo1530g = this.f777w.mo1530g();
        if (this.f746d0 == null) {
            this.f746d0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f717E0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f717E0;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.f745c0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f749g0 = x;
            this.f747e0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f750h0 = y;
            this.f748f0 = y;
            int i = mo1532f;
            if (mo1530g) {
                i = (mo1532f ? 1 : 0) | true;
            }
            m3145o0(i, 0);
        } else if (actionMasked == 1) {
            this.f746d0.addMovement(obtain);
            this.f746d0.computeCurrentVelocity(1000, this.f756l0);
            float f = mo1532f ? -this.f746d0.getXVelocity(this.f745c0) : 0.0f;
            float f2 = mo1530g ? -this.f746d0.getYVelocity(this.f745c0) : 0.0f;
            if (f != 0.0f || f2 != 0.0f) {
                int i2 = (int) f;
                int i3 = (int) f2;
                AbstractC0980q1 abstractC0980q12 = this.f777w;
                if (abstractC0980q12 != null && !this.f724I) {
                    int mo1532f2 = abstractC0980q12.mo1532f();
                    boolean mo1530g2 = this.f777w.mo1530g();
                    i2 = (mo1532f2 == 0 || Math.abs(i2) < this.f754k0) ? 0 : 0;
                    i3 = (!mo1530g2 || Math.abs(i3) < this.f754k0) ? 0 : 0;
                    if (i2 != 0 || i3 != 0) {
                        float f3 = i2;
                        float f4 = i3;
                        if (!dispatchNestedPreFling(f3, f4)) {
                            boolean z5 = mo1532f2 != 0 || mo1530g2;
                            dispatchNestedFling(f3, f4, z5);
                            AbstractC0988s1 abstractC0988s1 = this.f752j0;
                            if (abstractC0988s1 != null) {
                                C1006x0 c1006x0 = (C1006x0) abstractC0988s1;
                                AbstractC0980q1 layoutManager = c1006x0.f3888a.getLayoutManager();
                            }
                            if (z5) {
                                if (mo1530g2) {
                                    mo1532f2 = (mo1532f2 == true ? 1 : 0) | 2;
                                }
                                m3145o0(mo1532f2, 1);
                                int i4 = this.f756l0;
                                int max = Math.max(-i4, Math.min(i2, i4));
                                int i5 = this.f756l0;
                                int max2 = Math.max(-i5, Math.min(i3, i5));
                                RunnableC0937f2 runnableC0937f2 = this.f764p0;
                                runnableC0937f2.f3601h.setScrollState(2);
                                runnableC0937f2.f3596c = 0;
                                runnableC0937f2.f3595b = 0;
                                Interpolator interpolator = runnableC0937f2.f3598e;
                                Interpolator interpolator2 = f707j;
                                if (interpolator != interpolator2) {
                                    runnableC0937f2.f3598e = interpolator2;
                                    runnableC0937f2.f3597d = new OverScroller(runnableC0937f2.f3601h.getContext(), interpolator2);
                                }
                                runnableC0937f2.f3597d.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                runnableC0937f2.m1675a();
                                z2 = true;
                            }
                        }
                    }
                }
                z2 = false;
            }
            setScrollState(0);
            m3159h0();
            z4 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f745c0);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i6 = this.f749g0 - x2;
            int i7 = this.f750h0 - y2;
            if (this.f744b0 != 1) {
                if (mo1532f) {
                    int i8 = this.f751i0;
                    i6 = i6 > 0 ? Math.max(0, i6 - i8) : Math.min(0, i6 + i8);
                    if (i6 != 0) {
                        z3 = true;
                        if (mo1530g) {
                            int i9 = this.f751i0;
                            i7 = i7 > 0 ? Math.max(0, i7 - i9) : Math.min(0, i7 + i9);
                            if (i7 != 0) {
                                z3 = true;
                            }
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                }
                z3 = false;
                if (mo1530g) {
                }
                if (z3) {
                }
            }
            int i10 = i6;
            int i11 = i7;
            if (this.f744b0 == 1) {
                int[] iArr3 = this.f719F0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (m3137t(mo1532f ? i10 : 0, mo1530g ? i11 : 0, iArr3, this.f715D0, 0)) {
                    int[] iArr4 = this.f719F0;
                    i10 -= iArr4[0];
                    i11 -= iArr4[1];
                    int[] iArr5 = this.f717E0;
                    int i12 = iArr5[0];
                    int[] iArr6 = this.f715D0;
                    iArr5[0] = i12 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i13 = i11;
                int[] iArr7 = this.f715D0;
                this.f749g0 = x2 - iArr7[0];
                this.f750h0 = y2 - iArr7[1];
                if (m3157i0(mo1532f ? i10 : 0, mo1530g ? i13 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                RunnableC1005x runnableC1005x = this.f766q0;
                if (runnableC1005x != null && (i10 != 0 || i13 != 0)) {
                    runnableC1005x.m1419a(this, i10, i13);
                }
            }
        } else if (actionMasked == 3) {
            m3156j();
        } else if (actionMasked == 5) {
            this.f745c0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f749g0 = x3;
            this.f747e0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f750h0 = y3;
            this.f748f0 = y3;
        } else if (actionMasked == 6) {
            m3176X(motionEvent);
        }
        if (!z4) {
            this.f746d0.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public void m3144p(View view) {
        AbstractC0941g2 m3189K = m3189K(view);
        m3179U();
        AbstractC0932e1 abstractC0932e1 = this.f775v;
        if (abstractC0932e1 != null && m3189K != null) {
            abstractC0932e1.getClass();
        }
        List list = this.f733N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0959l0 c0959l0 = (C0959l0) this.f733N.get(size);
                c0959l0.m1620o(view);
                AbstractC0941g2 m3190J = c0959l0.f3690r.m3190J(view);
                if (m3190J != null) {
                    AbstractC0941g2 abstractC0941g2 = c0959l0.f3675c;
                    if (abstractC0941g2 == null || m3190J != abstractC0941g2) {
                        c0959l0.m1625j(m3190J, false);
                        if (c0959l0.f3673a.remove(m3190J.f3605c)) {
                            c0959l0.f3685m.m1640a(c0959l0.f3690r, m3190J);
                        }
                    } else {
                        c0959l0.m1619p(null, 0);
                    }
                }
            }
        }
    }

    /* renamed from: p0 */
    public void m3143p0(boolean z) {
        if (this.f720G < 1) {
            this.f720G = 1;
        }
        if (!z && !this.f724I) {
            this.f722H = false;
        }
        if (this.f720G == 1) {
            if (z && this.f722H && !this.f724I && this.f777w != null && this.f775v != null) {
                m3142q();
            }
            if (!this.f724I) {
                this.f722H = false;
            }
        }
        this.f720G--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x031d, code lost:
        if (r17.f761o.m1692k(r1) == false) goto L222;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m3142q() {
        C0929d2 c0929d2;
        ArrayList arrayList;
        AbstractC0980q1 abstractC0980q1;
        int i;
        int[] iArr;
        long j;
        AbstractC0941g2 abstractC0941g2;
        View view;
        View findViewById;
        boolean z;
        AbstractC0941g2 abstractC0941g22;
        C0952j1 c0952j1;
        boolean m1607i;
        C0952j1 c0952j12;
        if (this.f775v == null || this.f777w == null) {
            return;
        }
        this.f770s0.f3578i = false;
        boolean z2 = true;
        boolean z3 = this.f725I0 && !(this.f727J0 == getWidth() && this.f729K0 == getHeight());
        this.f727J0 = 0;
        this.f729K0 = 0;
        this.f725I0 = false;
        if (this.f770s0.f3573d == 1) {
            m3140r();
        } else {
            C0918b c0918b = this.f759n;
            if (!((c0918b.f3533c.isEmpty() || c0918b.f3532b.isEmpty()) ? false : true) && !z3 && this.f777w.f3787p == getWidth() && this.f777w.f3788q == getHeight()) {
                this.f777w.m1561P0(this);
                this.f770s0.m1685a(4);
                m3147n0();
                m3178V();
                c0929d2 = this.f770s0;
                c0929d2.f3573d = 1;
                if (c0929d2.f3579j) {
                    for (int m1698e = this.f761o.m1698e() - 1; m1698e >= 0; m1698e--) {
                        AbstractC0941g2 m3189K = m3189K(this.f761o.m1699d(m1698e));
                        if (!m3189K.m1651v()) {
                            long m3191I = m3191I(m3189K);
                            this.f743a0.getClass();
                            C0952j1 c0952j13 = new C0952j1();
                            View view2 = m3189K.f3605c;
                            c0952j13.f3645a = view2.getLeft();
                            c0952j13.f3646b = view2.getTop();
                            view2.getRight();
                            view2.getBottom();
                            AbstractC0941g2 abstractC0941g23 = (AbstractC0941g2) this.f763p.f3873b.m2643f(m3191I, null);
                            if (abstractC0941g23 != null && !abstractC0941g23.m1651v()) {
                                boolean m1427d = this.f763p.m1427d(abstractC0941g23);
                                boolean m1427d2 = this.f763p.m1427d(m3189K);
                                if (!m1427d || abstractC0941g23 != m3189K) {
                                    C0952j1 m1426e = this.f763p.m1426e(abstractC0941g23, 4);
                                    this.f763p.m1429b(m3189K, c0952j13);
                                    C0952j1 m1426e2 = this.f763p.m1426e(m3189K, 8);
                                    if (m1426e == null) {
                                        int m1698e2 = this.f761o.m1698e();
                                        for (int i2 = 0; i2 < m1698e2; i2++) {
                                            AbstractC0941g2 m3189K2 = m3189K(this.f761o.m1699d(i2));
                                            if (m3189K2 != m3189K && m3191I(m3189K2) == m3191I) {
                                                AbstractC0932e1 abstractC0932e1 = this.f775v;
                                                if (abstractC0932e1 == null || !abstractC0932e1.f3590b) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                                    sb.append(m3189K2);
                                                    sb.append(" \n View Holder 2:");
                                                    sb.append(m3189K);
                                                    throw new IllegalStateException(AbstractC1124a.m1194b(this, sb));
                                                }
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                sb2.append(m3189K2);
                                                sb2.append(" \n View Holder 2:");
                                                sb2.append(m3189K);
                                                throw new IllegalStateException(AbstractC1124a.m1194b(this, sb2));
                                            }
                                        }
                                        String str = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0941g23 + " cannot be found but it is necessary for " + m3189K + m3199A();
                                    } else {
                                        abstractC0941g23.m1652u(false);
                                        if (m1427d) {
                                            m3164f(abstractC0941g23);
                                        }
                                        if (abstractC0941g23 != m3189K) {
                                            if (m1427d2) {
                                                m3164f(m3189K);
                                            }
                                            abstractC0941g23.f3612j = m3189K;
                                            m3164f(abstractC0941g23);
                                            this.f755l.m1396l(abstractC0941g23);
                                            m3189K.m1652u(false);
                                            m3189K.f3613k = abstractC0941g23;
                                        }
                                        if (this.f743a0.mo1611a(abstractC0941g23, m3189K, m1426e, m1426e2)) {
                                            m3172a0();
                                        }
                                    }
                                }
                            }
                            this.f763p.m1429b(m3189K, c0952j13);
                        }
                    }
                    C1001v2 c1001v2 = this.f763p;
                    C0920b1 c0920b1 = this.f731L0;
                    for (int i3 = c1001v2.f3872a.f1943h - 1; i3 >= 0; i3--) {
                        AbstractC0941g2 abstractC0941g24 = (AbstractC0941g2) c1001v2.f3872a.m2616h(i3);
                        C0997u2 c0997u2 = (C0997u2) c1001v2.f3872a.m2615i(i3);
                        int i4 = c0997u2.f3858b;
                        if ((i4 & 3) != 3) {
                            if ((i4 & 1) != 0) {
                                c0952j1 = c0997u2.f3859c;
                                c0952j12 = c0952j1 != null ? c0997u2.f3860d : null;
                            } else {
                                if ((i4 & 14) != 14) {
                                    if ((i4 & 12) == 12) {
                                        C0952j1 c0952j14 = c0997u2.f3859c;
                                        C0952j1 c0952j15 = c0997u2.f3860d;
                                        c0920b1.getClass();
                                        abstractC0941g24.m1652u(false);
                                        RecyclerView recyclerView = c0920b1.f3538a;
                                        boolean z4 = recyclerView.f734O;
                                        AbstractC0956k1 abstractC0956k1 = recyclerView.f743a0;
                                        if (!z4) {
                                            C0970o c0970o = (C0970o) abstractC0956k1;
                                            c0970o.getClass();
                                            int i5 = c0952j14.f3645a;
                                            int i6 = c0952j15.f3645a;
                                            if (i5 == i6 && c0952j14.f3646b == c0952j15.f3646b) {
                                                c0970o.m1631c(abstractC0941g24);
                                                m1607i = false;
                                            } else {
                                                m1607i = c0970o.m1607i(abstractC0941g24, i5, c0952j14.f3646b, i6, c0952j15.f3646b);
                                            }
                                            if (!m1607i) {
                                            }
                                            c0920b1.f3538a.m3172a0();
                                        } else {
                                            if (!abstractC0956k1.mo1611a(abstractC0941g24, abstractC0941g24, c0952j14, c0952j15)) {
                                            }
                                            c0920b1.f3538a.m3172a0();
                                        }
                                    } else if ((i4 & 4) != 0) {
                                        c0952j1 = c0997u2.f3859c;
                                    } else if ((i4 & 8) == 0) {
                                    }
                                    C0997u2.m1450b(c0997u2);
                                }
                                c0920b1.m1718a(abstractC0941g24, c0997u2.f3859c, c0997u2.f3860d);
                                C0997u2.m1450b(c0997u2);
                            }
                            c0920b1.m1717b(abstractC0941g24, c0952j1, c0952j12);
                            C0997u2.m1450b(c0997u2);
                        }
                        RecyclerView recyclerView2 = c0920b1.f3538a;
                        recyclerView2.f777w.m1577H0(abstractC0941g24.f3605c, recyclerView2.f755l);
                        C0997u2.m1450b(c0997u2);
                    }
                }
                this.f777w.m1579G0(this.f755l);
                C0929d2 c0929d22 = this.f770s0;
                c0929d22.f3571b = c0929d22.f3574e;
                this.f734O = false;
                this.f735P = false;
                c0929d22.f3579j = false;
                c0929d22.f3580k = false;
                this.f777w.f3779h = false;
                arrayList = this.f755l.f3893b;
                if (arrayList != null) {
                    arrayList.clear();
                }
                abstractC0980q1 = this.f777w;
                if (abstractC0980q1.f3784m) {
                    abstractC0980q1.f3783l = 0;
                    abstractC0980q1.f3784m = false;
                    this.f755l.m1395m();
                }
                this.f777w.mo1497w0(this.f770s0);
                m3177W(true);
                m3143p0(false);
                C1001v2 c1001v22 = this.f763p;
                c1001v22.f3872a.clear();
                c1001v22.f3873b.m2647b();
                int[] iArr2 = this.f711B0;
                i = iArr2[0];
                int i7 = iArr2[1];
                m3195E(iArr2);
                iArr = this.f711B0;
                if (iArr[0] == i && iArr[1] == i7) {
                    z2 = false;
                }
                if (z2) {
                    m3135v(0, 0);
                }
                if (this.f762o0 && this.f775v != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                    if (!isFocused()) {
                        View focusedChild = getFocusedChild();
                        if (f705h && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                            if (this.f761o.m1698e() == 0) {
                                requestFocus();
                            }
                        }
                    }
                    j = this.f770s0.f3582m;
                    if (j == -1 && (z = this.f775v.f3590b)) {
                        if (z) {
                            int m1695h = this.f761o.m1695h();
                            AbstractC0941g2 abstractC0941g25 = null;
                            for (int i8 = 0; i8 < m1695h; i8++) {
                                abstractC0941g2 = m3189K(this.f761o.m1696g(i8));
                                if (abstractC0941g2 != null && !abstractC0941g2.m1659n() && abstractC0941g2.f3609g == j) {
                                    if (!this.f761o.m1692k(abstractC0941g2.f3605c)) {
                                        break;
                                    }
                                    abstractC0941g25 = abstractC0941g2;
                                }
                            }
                            abstractC0941g22 = abstractC0941g25;
                        } else {
                            abstractC0941g22 = null;
                        }
                        abstractC0941g2 = abstractC0941g22;
                    } else {
                        abstractC0941g2 = null;
                    }
                    if (abstractC0941g2 == null && !this.f761o.m1692k(abstractC0941g2.f3605c) && abstractC0941g2.f3605c.hasFocusable()) {
                        view = abstractC0941g2.f3605c;
                    } else {
                        if (this.f761o.m1698e() > 0) {
                            C0929d2 c0929d23 = this.f770s0;
                            int i9 = c0929d23.f3581l;
                            int i10 = i9 != -1 ? i9 : 0;
                            int m1684b = c0929d23.m1684b();
                            for (int i11 = i10; i11 < m1684b; i11++) {
                                AbstractC0941g2 m3193G = m3193G(i11);
                                if (m3193G == null) {
                                    break;
                                } else if (m3193G.f3605c.hasFocusable()) {
                                    view = m3193G.f3605c;
                                    break;
                                }
                            }
                            for (int min = Math.min(m1684b, i10) - 1; min >= 0; min--) {
                                AbstractC0941g2 m3193G2 = m3193G(min);
                                if (m3193G2 == null) {
                                    break;
                                } else if (m3193G2.f3605c.hasFocusable()) {
                                    view = m3193G2.f3605c;
                                    break;
                                }
                            }
                        }
                        view = null;
                    }
                    if (view != null) {
                        int i12 = this.f770s0.f3583n;
                        if (i12 != -1 && (findViewById = view.findViewById(i12)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
                C0929d2 c0929d24 = this.f770s0;
                c0929d24.f3582m = -1L;
                c0929d24.f3581l = -1;
                c0929d24.f3583n = -1;
            }
        }
        this.f777w.m1561P0(this);
        m3138s();
        this.f770s0.m1685a(4);
        m3147n0();
        m3178V();
        c0929d2 = this.f770s0;
        c0929d2.f3573d = 1;
        if (c0929d2.f3579j) {
        }
        this.f777w.m1579G0(this.f755l);
        C0929d2 c0929d222 = this.f770s0;
        c0929d222.f3571b = c0929d222.f3574e;
        this.f734O = false;
        this.f735P = false;
        c0929d222.f3579j = false;
        c0929d222.f3580k = false;
        this.f777w.f3779h = false;
        arrayList = this.f755l.f3893b;
        if (arrayList != null) {
        }
        abstractC0980q1 = this.f777w;
        if (abstractC0980q1.f3784m) {
        }
        this.f777w.mo1497w0(this.f770s0);
        m3177W(true);
        m3143p0(false);
        C1001v2 c1001v222 = this.f763p;
        c1001v222.f3872a.clear();
        c1001v222.f3873b.m2647b();
        int[] iArr22 = this.f711B0;
        i = iArr22[0];
        int i72 = iArr22[1];
        m3195E(iArr22);
        iArr = this.f711B0;
        if (iArr[0] == i) {
            z2 = false;
        }
        if (z2) {
        }
        if (this.f762o0) {
            if (!isFocused()) {
            }
            j = this.f770s0.f3582m;
            if (j == -1) {
            }
            abstractC0941g2 = null;
            if (abstractC0941g2 == null) {
            }
            if (this.f761o.m1698e() > 0) {
            }
            view = null;
            if (view != null) {
            }
        }
        C0929d2 c0929d242 = this.f770s0;
        c0929d242.f3582m = -1L;
        c0929d242.f3581l = -1;
        c0929d242.f3583n = -1;
    }

    /* renamed from: q0 */
    public void m3141q0(int i) {
        getScrollingChildHelper().m2217k(i);
    }

    /* renamed from: r */
    public final void m3140r() {
        int id;
        View m3197C;
        this.f770s0.m1685a(1);
        m3198B(this.f770s0);
        this.f770s0.f3578i = false;
        m3147n0();
        C1001v2 c1001v2 = this.f763p;
        c1001v2.f3872a.clear();
        c1001v2.f3873b.m2647b();
        m3178V();
        m3171b0();
        View focusedChild = (this.f762o0 && hasFocus() && this.f775v != null) ? getFocusedChild() : null;
        AbstractC0941g2 m3190J = (focusedChild == null || (m3197C = m3197C(focusedChild)) == null) ? null : m3190J(m3197C);
        if (m3190J == null) {
            C0929d2 c0929d2 = this.f770s0;
            c0929d2.f3582m = -1L;
            c0929d2.f3581l = -1;
            c0929d2.f3583n = -1;
        } else {
            C0929d2 c0929d22 = this.f770s0;
            c0929d22.f3582m = this.f775v.f3590b ? m3190J.f3609g : -1L;
            c0929d22.f3581l = this.f734O ? -1 : m3190J.m1659n() ? m3190J.f3608f : m3190J.m1668e();
            C0929d2 c0929d23 = this.f770s0;
            View view = m3190J.f3605c;
            loop3: while (true) {
                id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        break;
                    }
                }
            }
            c0929d23.f3583n = id;
        }
        C0929d2 c0929d24 = this.f770s0;
        c0929d24.f3577h = c0929d24.f3579j && this.f778w0;
        this.f778w0 = false;
        this.f776v0 = false;
        c0929d24.f3576g = c0929d24.f3580k;
        c0929d24.f3574e = this.f775v.mo543a();
        m3195E(this.f711B0);
        if (this.f770s0.f3579j) {
            int m1698e = this.f761o.m1698e();
            for (int i = 0; i < m1698e; i++) {
                AbstractC0941g2 m3189K = m3189K(this.f761o.m1699d(i));
                if (!m3189K.m1651v() && (!m3189K.m1661l() || this.f775v.f3590b)) {
                    AbstractC0956k1 abstractC0956k1 = this.f743a0;
                    AbstractC0956k1.m1632b(m3189K);
                    m3189K.m1665h();
                    this.f763p.m1428c(m3189K, abstractC0956k1.m1629h(m3189K));
                    if (this.f770s0.f3577h && m3189K.m1656q() && !m3189K.m1659n() && !m3189K.m1651v() && !m3189K.m1661l()) {
                        this.f763p.f3873b.m2642g(m3191I(m3189K), m3189K);
                    }
                }
            }
        }
        if (this.f770s0.f3580k) {
            int m1695h = this.f761o.m1695h();
            for (int i2 = 0; i2 < m1695h; i2++) {
                AbstractC0941g2 m3189K2 = m3189K(this.f761o.m1696g(i2));
                if (!m3189K2.m1651v() && m3189K2.f3608f == -1) {
                    m3189K2.f3608f = m3189K2.f3607e;
                }
            }
            C0929d2 c0929d25 = this.f770s0;
            boolean z = c0929d25.f3575f;
            c0929d25.f3575f = false;
            this.f777w.mo1499v0(this.f755l, c0929d25);
            this.f770s0.f3575f = z;
            for (int i3 = 0; i3 < this.f761o.m1698e(); i3++) {
                AbstractC0941g2 m3189K3 = m3189K(this.f761o.m1699d(i3));
                if (!m3189K3.m1651v()) {
                    C0997u2 c0997u2 = (C0997u2) this.f763p.f3872a.getOrDefault(m3189K3, null);
                    if (!((c0997u2 == null || (c0997u2.f3858b & 4) == 0) ? false : true)) {
                        AbstractC0956k1.m1632b(m3189K3);
                        boolean m1664i = m3189K3.m1664i(8192);
                        AbstractC0956k1 abstractC0956k12 = this.f743a0;
                        m3189K3.m1665h();
                        C0952j1 m1629h = abstractC0956k12.m1629h(m3189K3);
                        if (m1664i) {
                            m3167d0(m3189K3, m1629h);
                        } else {
                            C1001v2 c1001v22 = this.f763p;
                            C0997u2 c0997u22 = (C0997u2) c1001v22.f3872a.getOrDefault(m3189K3, null);
                            if (c0997u22 == null) {
                                c0997u22 = C0997u2.m1451a();
                                c1001v22.f3872a.put(m3189K3, c0997u22);
                            }
                            c0997u22.f3858b |= 2;
                            c0997u22.f3859c = m1629h;
                        }
                    }
                }
            }
        }
        m3152l();
        m3177W(true);
        m3143p0(false);
        this.f770s0.f3573d = 2;
    }

    /* renamed from: r0 */
    public void m3139r0() {
        C0983r0 c0983r0;
        setScrollState(0);
        this.f764p0.m1673c();
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null || (c0983r0 = abstractC0980q1.f3778g) == null) {
            return;
        }
        c0983r0.m1474f();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0941g2 m3189K = m3189K(view);
        if (m3189K != null) {
            if (m3189K.m1657p()) {
                m3189K.f3614l &= -257;
            } else if (!m3189K.m1651v()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(m3189K);
                throw new IllegalArgumentException(AbstractC1124a.m1194b(this, sb));
            }
        }
        view.clearAnimation();
        m3144p(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f777w.m1491z0(this, view, view2) && view2 != null) {
            m3161g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f777w.m1571K0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f708A.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0992t1) this.f708A.get(i)).mo1454c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f720G != 0 || this.f724I) {
            this.f722H = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m3138s() {
        m3147n0();
        m3178V();
        this.f770s0.m1685a(6);
        this.f759n.m1729c();
        this.f770s0.f3574e = this.f775v.mo543a();
        this.f770s0.f3572c = 0;
        if (this.f757m != null) {
            AbstractC0932e1 abstractC0932e1 = this.f775v;
            int m2567a = AbstractC0403k.m2567a(abstractC0932e1.f3591c);
            if (m2567a == 1 ? abstractC0932e1.mo543a() > 0 : m2567a != 2) {
                Parcelable parcelable = this.f757m.f785d;
                if (parcelable != null) {
                    this.f777w.mo1591A0(parcelable);
                }
                this.f757m = null;
            }
        }
        C0929d2 c0929d2 = this.f770s0;
        c0929d2.f3576g = false;
        this.f777w.mo1499v0(this.f755l, c0929d2);
        C0929d2 c0929d22 = this.f770s0;
        c0929d22.f3575f = false;
        c0929d22.f3579j = c0929d22.f3579j && this.f743a0 != null;
        c0929d22.f3573d = 4;
        m3177W(true);
        m3143p0(false);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 == null || this.f724I) {
            return;
        }
        boolean mo1532f = abstractC0980q1.mo1532f();
        boolean mo1530g = this.f777w.mo1530g();
        if (mo1532f || mo1530g) {
            if (!mo1532f) {
                i = 0;
            }
            if (!mo1530g) {
                i2 = 0;
            }
            m3157i0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m3184P()) {
            int contentChangeTypes = (accessibilityEvent == null || Build.VERSION.SDK_INT < 19) ? 0 : accessibilityEvent.getContentChangeTypes();
            this.f728K |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0949i2 c0949i2) {
        this.f784z0 = c0949i2;
        AbstractC0605j0.m2269N(this, c0949i2);
    }

    public void setAdapter(AbstractC0932e1 abstractC0932e1) {
        setLayoutFrozen(false);
        AbstractC0932e1 abstractC0932e12 = this.f775v;
        if (abstractC0932e12 != null) {
            abstractC0932e12.f3589a.unregisterObserver(this.f753k);
            this.f775v.getClass();
        }
        m3165e0();
        C0918b c0918b = this.f759n;
        c0918b.m1720l(c0918b.f3532b);
        c0918b.m1720l(c0918b.f3533c);
        c0918b.f3536f = 0;
        AbstractC0932e1 abstractC0932e13 = this.f775v;
        this.f775v = abstractC0932e1;
        if (abstractC0932e1 != null) {
            abstractC0932e1.f3589a.registerObserver(this.f753k);
        }
        AbstractC0980q1 abstractC0980q1 = this.f777w;
        if (abstractC0980q1 != null) {
            abstractC0980q1.mo1533e0(abstractC0932e13, this.f775v);
        }
        C1007x1 c1007x1 = this.f755l;
        AbstractC0932e1 abstractC0932e14 = this.f775v;
        c1007x1.m1406b();
        C1004w1 m1404d = c1007x1.m1404d();
        m1404d.getClass();
        if (abstractC0932e13 != null) {
            m1404d.f3881b--;
        }
        if (m1404d.f3881b == 0) {
            for (int i = 0; i < m1404d.f3880a.size(); i++) {
                ((C1000v1) m1404d.f3880a.valueAt(i)).f3868a.clear();
            }
        }
        if (abstractC0932e14 != null) {
            m1404d.f3881b++;
        }
        this.f770s0.f3575f = true;
        m3169c0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0940g1 interfaceC0940g1) {
        if (interfaceC0940g1 == this.f709A0) {
            return;
        }
        this.f709A0 = interfaceC0940g1;
        setChildrenDrawingOrderEnabled(interfaceC0940g1 != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f765q) {
            m3186N();
        }
        this.f765q = z;
        super.setClipToPadding(z);
        if (this.f718F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0944h1 c0944h1) {
        c0944h1.getClass();
        this.f738S = c0944h1;
        m3186N();
    }

    public void setHasFixedSize(boolean z) {
        this.f714D = z;
    }

    public void setItemAnimator(AbstractC0956k1 abstractC0956k1) {
        AbstractC0956k1 abstractC0956k12 = this.f743a0;
        if (abstractC0956k12 != null) {
            abstractC0956k12.mo1609f();
            this.f743a0.f3658a = null;
        }
        this.f743a0 = abstractC0956k1;
        if (abstractC0956k1 != null) {
            abstractC0956k1.f3658a = this.f780x0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1007x1 c1007x1 = this.f755l;
        c1007x1.f3896e = i;
        c1007x1.m1395m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0980q1 abstractC0980q1) {
        if (abstractC0980q1 == this.f777w) {
            return;
        }
        m3139r0();
        if (this.f777w != null) {
            AbstractC0956k1 abstractC0956k1 = this.f743a0;
            if (abstractC0956k1 != null) {
                abstractC0956k1.mo1609f();
            }
            this.f777w.m1581F0(this.f755l);
            this.f777w.m1579G0(this.f755l);
            this.f755l.m1406b();
            if (this.f712C) {
                AbstractC0980q1 abstractC0980q12 = this.f777w;
                C1007x1 c1007x1 = this.f755l;
                abstractC0980q12.f3780i = false;
                abstractC0980q12.mo1525i0(this, c1007x1);
            }
            this.f777w.m1553T0(null);
            this.f777w = null;
        } else {
            this.f755l.m1406b();
        }
        C0926d c0926d = this.f761o;
        C0922c c0922c = c0926d.f3551b;
        c0922c.f3546a = 0L;
        C0922c c0922c2 = c0922c.f3547b;
        if (c0922c2 != null) {
            c0922c2.m1708g();
        }
        int size = c0926d.f3552c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0924c1 c0924c1 = c0926d.f3550a;
            c0924c1.getClass();
            AbstractC0941g2 m3189K = m3189K((View) c0926d.f3552c.get(size));
            if (m3189K != null) {
                c0924c1.f3549a.m3151l0(m3189K, m3189K.f3620r);
                m3189K.f3620r = 0;
            }
            c0926d.f3552c.remove(size);
        }
        C0924c1 c0924c12 = c0926d.f3550a;
        int m1705b = c0924c12.m1705b();
        for (int i = 0; i < m1705b; i++) {
            View m1706a = c0924c12.m1706a(i);
            c0924c12.f3549a.m3144p(m1706a);
            m1706a.clearAnimation();
        }
        c0924c12.f3549a.removeAllViews();
        this.f777w = abstractC0980q1;
        if (abstractC0980q1 != null) {
            if (abstractC0980q1.f3773b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(abstractC0980q1);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC1124a.m1194b(abstractC0980q1.f3773b, sb));
            }
            abstractC0980q1.m1553T0(this);
            if (this.f712C) {
                AbstractC0980q1 abstractC0980q13 = this.f777w;
                abstractC0980q13.f3780i = true;
                abstractC0980q13.m1529g0();
            }
        }
        this.f755l.m1395m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m2219i(z);
    }

    public void setOnFlingListener(AbstractC0988s1 abstractC0988s1) {
        this.f752j0 = abstractC0988s1;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0996u1 abstractC0996u1) {
        this.f772t0 = abstractC0996u1;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f762o0 = z;
    }

    public void setRecycledViewPool(C1004w1 c1004w1) {
        C1004w1 c1004w12;
        C1007x1 c1007x1 = this.f755l;
        if (c1007x1.f3898g != null) {
            c1004w12.f3881b--;
        }
        c1007x1.f3898g = c1004w1;
        if (c1004w1 == null || c1007x1.f3899h.getAdapter() == null) {
            return;
        }
        c1007x1.f3898g.f3881b++;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1010y1 interfaceC1010y1) {
        this.f779x = interfaceC1010y1;
    }

    public void setScrollState(int i) {
        C0983r0 c0983r0;
        if (i == this.f744b0) {
            return;
        }
        this.f744b0 = i;
        if (i != 2) {
            this.f764p0.m1673c();
            AbstractC0980q1 abstractC0980q1 = this.f777w;
            if (abstractC0980q1 != null && (c0983r0 = abstractC0980q1.f3778g) != null) {
                c0983r0.m1474f();
            }
        }
        AbstractC0980q1 abstractC0980q12 = this.f777w;
        if (abstractC0980q12 != null) {
            abstractC0980q12.mo1587C0(i);
        }
        m3175Y();
        AbstractC0996u1 abstractC0996u1 = this.f772t0;
        if (abstractC0996u1 != null) {
            abstractC0996u1.mo545a(this, i);
        }
        List list = this.f774u0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((AbstractC0996u1) this.f774u0.get(size)).mo545a(this, i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f751i0 = i != 1 ? viewConfiguration.getScaledTouchSlop() : viewConfiguration.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0933e2 abstractC0933e2) {
        this.f755l.getClass();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m2218j(i, 0);
    }

    @Override // android.view.View, p010b.p046j.p058l.InterfaceC0610m
    public void stopNestedScroll() {
        getScrollingChildHelper().m2217k(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f724I) {
            m3158i("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f724I = true;
                this.f726J = true;
                m3139r0();
                return;
            }
            this.f724I = false;
            if (this.f722H && this.f777w != null && this.f775v != null) {
                requestLayout();
            }
            this.f722H = false;
        }
    }

    /* renamed from: t */
    public boolean m3137t(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m2225c(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: u */
    public final void m3136u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m2222f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: v */
    public void m3135v(int i, int i2) {
        this.f737R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m3174Z();
        AbstractC0996u1 abstractC0996u1 = this.f772t0;
        if (abstractC0996u1 != null) {
            abstractC0996u1.mo544b(this, i, i2);
        }
        List list = this.f774u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC0996u1) this.f774u0.get(size)).mo544b(this, i, i2);
            }
        }
        this.f737R--;
    }

    /* renamed from: w */
    public void m3134w() {
        int measuredWidth;
        int measuredHeight;
        if (this.f742W != null) {
            return;
        }
        EdgeEffect m1649a = this.f738S.m1649a(this);
        this.f742W = m1649a;
        if (this.f765q) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m1649a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: x */
    public void m3133x() {
        int measuredHeight;
        int measuredWidth;
        if (this.f739T != null) {
            return;
        }
        EdgeEffect m1649a = this.f738S.m1649a(this);
        this.f739T = m1649a;
        if (this.f765q) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m1649a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: y */
    public void m3132y() {
        int measuredHeight;
        int measuredWidth;
        if (this.f741V != null) {
            return;
        }
        EdgeEffect m1649a = this.f738S.m1649a(this);
        this.f741V = m1649a;
        if (this.f765q) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m1649a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: z */
    public void m3131z() {
        int measuredWidth;
        int measuredHeight;
        if (this.f740U != null) {
            return;
        }
        EdgeEffect m1649a = this.f738S.m1649a(this);
        this.f740U = m1649a;
        if (this.f765q) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m1649a.setSize(measuredWidth, measuredHeight);
    }
}