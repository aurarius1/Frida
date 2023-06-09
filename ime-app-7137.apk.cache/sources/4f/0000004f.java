package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.p017k.C0096d1;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p024p.C0171l;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0177c0;
import p010b.p016c.p026q.AbstractC0257h4;
import p010b.p016c.p026q.C0215a4;
import p010b.p016c.p026q.C0228d;
import p010b.p016c.p026q.C0252h;
import p010b.p016c.p026q.C0298q;
import p010b.p016c.p026q.C0322u3;
import p010b.p016c.p026q.InterfaceC0246g;
import p010b.p016c.p026q.InterfaceC0280m1;
import p010b.p016c.p026q.InterfaceC0285n1;
import p010b.p016c.p026q.RunnableC0234e;
import p010b.p016c.p026q.RunnableC0240f;
import p010b.p046j.p050f.C0507b;
import p010b.p046j.p058l.AbstractC0588e0;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0573c1;
import p010b.p046j.p058l.C0620r;
import p010b.p046j.p058l.C0623s0;
import p010b.p046j.p058l.C0625t0;
import p010b.p046j.p058l.C0627u0;
import p010b.p046j.p058l.C0629v0;
import p010b.p046j.p058l.InterfaceC0614o;
import p010b.p046j.p058l.InterfaceC0616p;
import p010b.p046j.p058l.InterfaceC0618q;
import p093c.p094a.p095a.p096a.AbstractC1124a;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0280m1, InterfaceC0618q, InterfaceC0614o, InterfaceC0616p {

    /* renamed from: b */
    public static final int[] f197b = {AbstractC0075a.actionBarSize, 16842841};

    /* renamed from: A */
    public InterfaceC0246g f198A;

    /* renamed from: B */
    public OverScroller f199B;

    /* renamed from: C */
    public ViewPropertyAnimator f200C;

    /* renamed from: D */
    public final AnimatorListenerAdapter f201D;

    /* renamed from: E */
    public final Runnable f202E;

    /* renamed from: F */
    public final Runnable f203F;

    /* renamed from: G */
    public final C0620r f204G;

    /* renamed from: c */
    public int f205c;

    /* renamed from: d */
    public int f206d;

    /* renamed from: e */
    public ContentFrameLayout f207e;

    /* renamed from: f */
    public ActionBarContainer f208f;

    /* renamed from: g */
    public InterfaceC0285n1 f209g;

    /* renamed from: h */
    public Drawable f210h;

    /* renamed from: i */
    public boolean f211i;

    /* renamed from: j */
    public boolean f212j;

    /* renamed from: k */
    public boolean f213k;

    /* renamed from: l */
    public boolean f214l;

    /* renamed from: m */
    public boolean f215m;

    /* renamed from: n */
    public int f216n;

    /* renamed from: o */
    public int f217o;

    /* renamed from: p */
    public final Rect f218p;

    /* renamed from: q */
    public final Rect f219q;

    /* renamed from: r */
    public final Rect f220r;

    /* renamed from: s */
    public final Rect f221s;

    /* renamed from: t */
    public final Rect f222t;

    /* renamed from: u */
    public final Rect f223u;

    /* renamed from: v */
    public final Rect f224v;

    /* renamed from: w */
    public C0573c1 f225w;

    /* renamed from: x */
    public C0573c1 f226x;

    /* renamed from: y */
    public C0573c1 f227y;

    /* renamed from: z */
    public C0573c1 f228z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206d = 0;
        this.f218p = new Rect();
        this.f219q = new Rect();
        this.f220r = new Rect();
        this.f221s = new Rect();
        this.f222t = new Rect();
        this.f223u = new Rect();
        this.f224v = new Rect();
        C0573c1 c0573c1 = C0573c1.f2675a;
        this.f225w = c0573c1;
        this.f226x = c0573c1;
        this.f227y = c0573c1;
        this.f228z = c0573c1;
        this.f201D = new C0228d(this);
        this.f202E = new RunnableC0234e(this);
        this.f203F = new RunnableC0240f(this);
        m3431k(context);
        this.f204G = new C0620r();
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: a */
    public void mo2216a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: b */
    public void mo2215b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: c */
    public void mo2214c(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0252h;
    }

    @Override // p010b.p046j.p058l.InterfaceC0616p
    /* renamed from: d */
    public void mo2204d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f210h == null || this.f211i) {
            return;
        }
        if (this.f208f.getVisibility() == 0) {
            i = (int) (this.f208f.getTranslationY() + this.f208f.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f210h.setBounds(0, i, getWidth(), this.f210h.getIntrinsicHeight() + i);
        this.f210h.draw(canvas);
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: e */
    public void mo2213e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: f */
    public boolean mo2212f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m3428n();
        boolean m3435g = m3435g(this.f208f, rect, true, true, false, true);
        this.f221s.set(rect);
        Rect rect2 = this.f221s;
        Rect rect3 = this.f218p;
        Method method = AbstractC0257h4.f1595a;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception unused) {
            }
        }
        if (!this.f222t.equals(this.f221s)) {
            this.f222t.set(this.f221s);
            m3435g = true;
        }
        if (!this.f219q.equals(this.f218p)) {
            this.f219q.set(this.f218p);
            m3435g = true;
        }
        if (m3435g) {
            requestLayout();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3435g(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0252h c0252h = (C0252h) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) c0252h).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) c0252h).leftMargin = i2;
                z5 = true;
                if (z2) {
                    int i3 = ((ViewGroup.MarginLayoutParams) c0252h).topMargin;
                    int i4 = rect.top;
                    if (i3 != i4) {
                        ((ViewGroup.MarginLayoutParams) c0252h).topMargin = i4;
                        z5 = true;
                    }
                }
                if (z4) {
                    int i5 = ((ViewGroup.MarginLayoutParams) c0252h).rightMargin;
                    int i6 = rect.right;
                    if (i5 != i6) {
                        ((ViewGroup.MarginLayoutParams) c0252h).rightMargin = i6;
                        z5 = true;
                    }
                }
                if (z3) {
                    int i7 = ((ViewGroup.MarginLayoutParams) c0252h).bottomMargin;
                    int i8 = rect.bottom;
                    if (i7 != i8) {
                        ((ViewGroup.MarginLayoutParams) c0252h).bottomMargin = i8;
                        return true;
                    }
                }
                return z5;
            }
        }
        z5 = false;
        if (z2) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0252h(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0252h(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0252h(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f208f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f204G.m2200a();
    }

    public CharSequence getTitle() {
        m3428n();
        return ((C0215a4) this.f209g).f1458a.getTitle();
    }

    /* renamed from: h */
    public boolean m3434h() {
        ActionMenuView actionMenuView;
        m3428n();
        Toolbar toolbar = ((C0215a4) this.f209g).f1458a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f367b) != null && actionMenuView.f235t;
    }

    /* renamed from: i */
    public void m3433i() {
        removeCallbacks(this.f202E);
        removeCallbacks(this.f203F);
        ViewPropertyAnimator viewPropertyAnimator = this.f200C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: j */
    public boolean m3432j() {
        m3428n();
        ActionMenuView actionMenuView = ((C0215a4) this.f209g).f1458a.f367b;
        if (actionMenuView != null) {
            C0298q c0298q = actionMenuView.f236u;
            if (c0298q != null && c0298q.m2763k()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void m3431k(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f197b);
        this.f205c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f210h = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f211i = context.getApplicationInfo().targetSdkVersion < 19;
        this.f199B = new OverScroller(context);
    }

    /* renamed from: l */
    public void m3430l(int i) {
        m3428n();
        if (i == 2) {
            ((C0215a4) this.f209g).getClass();
        } else if (i == 5) {
            ((C0215a4) this.f209g).getClass();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    /* renamed from: m */
    public boolean m3429m() {
        m3428n();
        return ((C0215a4) this.f209g).f1458a.m3380o();
    }

    /* renamed from: n */
    public void m3428n() {
        InterfaceC0285n1 wrapper;
        if (this.f207e == null) {
            this.f207e = (ContentFrameLayout) findViewById(AbstractC0080f.action_bar_activity_content);
            this.f208f = (ActionBarContainer) findViewById(AbstractC0080f.action_bar_container);
            View findViewById = findViewById(AbstractC0080f.action_bar);
            if (findViewById instanceof InterfaceC0285n1) {
                wrapper = (InterfaceC0285n1) findViewById;
            } else if (!(findViewById instanceof Toolbar)) {
                StringBuilder m1187i = AbstractC1124a.m1187i("Can't make a decor toolbar out of ");
                m1187i.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(m1187i.toString());
            } else {
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f209g = wrapper;
        }
    }

    /* renamed from: o */
    public void m3427o(Menu menu, InterfaceC0177c0 interfaceC0177c0) {
        C0202s c0202s;
        m3428n();
        C0215a4 c0215a4 = (C0215a4) this.f209g;
        if (c0215a4.f1471n == null) {
            C0298q c0298q = new C0298q(c0215a4.f1458a.getContext());
            c0215a4.f1471n = c0298q;
            c0298q.f1711j = AbstractC0080f.action_menu_presenter;
        }
        C0298q c0298q2 = c0215a4.f1471n;
        c0298q2.f1707f = interfaceC0177c0;
        Toolbar toolbar = c0215a4.f1458a;
        C0199p c0199p = (C0199p) menu;
        if (c0199p == null && toolbar.f367b == null) {
            return;
        }
        toolbar.m3389f();
        C0199p c0199p2 = toolbar.f367b.f232q;
        if (c0199p2 == c0199p) {
            return;
        }
        if (c0199p2 != null) {
            c0199p2.m2918u(toolbar.f363K);
            c0199p2.m2918u(toolbar.f364L);
        }
        if (toolbar.f364L == null) {
            toolbar.f364L = new C0322u3(toolbar);
        }
        c0298q2.f1720s = true;
        if (c0199p != null) {
            c0199p.m2937b(c0298q2, toolbar.f376k);
            c0199p.m2937b(toolbar.f364L, toolbar.f376k);
        } else {
            c0298q2.mo645g(toolbar.f376k, null);
            C0322u3 c0322u3 = toolbar.f364L;
            C0199p c0199p3 = c0322u3.f1777b;
            if (c0199p3 != null && (c0202s = c0322u3.f1778c) != null) {
                c0199p3.mo2935d(c0202s);
            }
            c0322u3.f1777b = null;
            c0298q2.mo640n(true);
            toolbar.f364L.mo640n(true);
        }
        toolbar.f367b.setPopupTheme(toolbar.f377l);
        toolbar.f367b.setPresenter(c0298q2);
        toolbar.f363K = c0298q2;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m3428n();
        C0573c1 m2317j = C0573c1.m2317j(windowInsets, this);
        boolean m3435g = m3435g(this.f208f, new Rect(m2317j.m2325b(), m2317j.m2323d(), m2317j.m2324c(), m2317j.m2326a()), true, true, false, true);
        Rect rect = this.f218p;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 21) {
            AbstractC0588e0.m2301b(this, m2317j, rect);
        }
        Rect rect2 = this.f218p;
        C0573c1 mo2173i = m2317j.f2676b.mo2173i(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f225w = mo2173i;
        boolean z = true;
        if (!this.f226x.equals(mo2173i)) {
            this.f226x = this.f225w;
            m3435g = true;
        }
        if (this.f219q.equals(this.f218p)) {
            z = m3435g;
        } else {
            this.f219q.set(this.f218p);
        }
        if (z) {
            requestLayout();
        }
        return m2317j.f2676b.mo2179a().f2676b.mo2182c().f2676b.mo2183b().m2319h();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3431k(getContext());
        AbstractC0605j0.m2271L(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3433i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0252h c0252h = (C0252h) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0252h).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0252h).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        C0629v0 c0625t0;
        C0573c1 mo2195b;
        m3428n();
        measureChildWithMargins(this.f208f, i, 0, i2, 0);
        C0252h c0252h = (C0252h) this.f208f.getLayoutParams();
        int max = Math.max(0, this.f208f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0252h).leftMargin + ((ViewGroup.MarginLayoutParams) c0252h).rightMargin);
        int max2 = Math.max(0, this.f208f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0252h).topMargin + ((ViewGroup.MarginLayoutParams) c0252h).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f208f.getMeasuredState());
        boolean z = (AbstractC0605j0.m2234x(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f205c;
            if (this.f213k && this.f208f.getTabContainer() != null) {
                measuredHeight += this.f205c;
            }
        } else {
            measuredHeight = this.f208f.getVisibility() != 8 ? this.f208f.getMeasuredHeight() : 0;
        }
        this.f220r.set(this.f218p);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            this.f227y = this.f225w;
        } else {
            this.f223u.set(this.f221s);
        }
        if (!this.f212j && !z) {
            Rect rect = this.f220r;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i3 >= 21) {
                mo2195b = this.f227y.f2676b.mo2173i(0, measuredHeight, 0, 0);
                this.f227y = mo2195b;
            }
        } else if (i3 >= 21) {
            C0507b m2385a = C0507b.m2385a(this.f227y.m2325b(), this.f227y.m2323d() + measuredHeight, this.f227y.m2324c(), this.f227y.m2326a() + 0);
            C0573c1 c0573c1 = this.f227y;
            if (i3 >= 30) {
                c0625t0 = new C0627u0(c0573c1);
            } else {
                c0625t0 = i3 >= 29 ? new C0625t0(c0573c1) : i3 >= 20 ? new C0623s0(c0573c1) : new C0629v0(c0573c1);
            }
            c0625t0.mo2193d(m2385a);
            mo2195b = c0625t0.mo2195b();
            this.f227y = mo2195b;
        } else {
            Rect rect2 = this.f223u;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m3435g(this.f207e, this.f220r, true, true, true, true);
        if (i3 >= 21 && !this.f228z.equals(this.f227y)) {
            C0573c1 c0573c12 = this.f227y;
            this.f228z = c0573c12;
            AbstractC0605j0.m2253e(this.f207e, c0573c12);
        } else if (i3 < 21 && !this.f224v.equals(this.f223u)) {
            this.f224v.set(this.f223u);
            this.f207e.m3419a(this.f223u);
        }
        measureChildWithMargins(this.f207e, i, 0, i2, 0);
        C0252h c0252h2 = (C0252h) this.f207e.getLayoutParams();
        int max3 = Math.max(max, this.f207e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0252h2).leftMargin + ((ViewGroup.MarginLayoutParams) c0252h2).rightMargin);
        int max4 = Math.max(max2, this.f207e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0252h2).topMargin + ((ViewGroup.MarginLayoutParams) c0252h2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f207e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f214l && z) {
            this.f199B.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f199B.getFinalY() > this.f208f.getHeight()) {
                m3433i();
                this.f203F.run();
            } else {
                m3433i();
                this.f202E.run();
            }
            this.f215m = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f216n + i2;
        this.f216n = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C0096d1 c0096d1;
        C0171l c0171l;
        this.f204G.f2778a = i;
        this.f216n = getActionBarHideOffset();
        m3433i();
        InterfaceC0246g interfaceC0246g = this.f198A;
        if (interfaceC0246g == null || (c0171l = (c0096d1 = (C0096d1) interfaceC0246g).f903v) == null) {
            return;
        }
        c0171l.m2954a();
        c0096d1.f903v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f208f.getVisibility() != 0) {
            return false;
        }
        return this.f214l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onStopNestedScroll(View view) {
        if (this.f214l && !this.f215m) {
            if (this.f216n <= this.f208f.getHeight()) {
                m3433i();
                postDelayed(this.f202E, 600L);
            } else {
                m3433i();
                postDelayed(this.f203F, 600L);
            }
        }
        InterfaceC0246g interfaceC0246g = this.f198A;
        if (interfaceC0246g != null) {
            ((C0096d1) interfaceC0246g).getClass();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m3428n();
        int i2 = this.f217o ^ i;
        this.f217o = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0246g interfaceC0246g = this.f198A;
        if (interfaceC0246g != null) {
            ((C0096d1) interfaceC0246g).f899r = !z2;
            if (!z && z2) {
                C0096d1 c0096d1 = (C0096d1) interfaceC0246g;
                if (!c0096d1.f900s) {
                    c0096d1.f900s = true;
                    c0096d1.m3077h(true);
                }
            } else {
                C0096d1 c0096d12 = (C0096d1) interfaceC0246g;
                if (c0096d12.f900s) {
                    c0096d12.f900s = false;
                    c0096d12.m3077h(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.f198A == null) {
            return;
        }
        AbstractC0605j0.m2271L(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f206d = i;
        InterfaceC0246g interfaceC0246g = this.f198A;
        if (interfaceC0246g != null) {
            ((C0096d1) interfaceC0246g).f898q = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m3433i();
        this.f208f.setTranslationY(-Math.max(0, Math.min(i, this.f208f.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0246g interfaceC0246g) {
        this.f198A = interfaceC0246g;
        if (getWindowToken() != null) {
            ((C0096d1) this.f198A).f898q = this.f206d;
            int i = this.f217o;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AbstractC0605j0.m2271L(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f213k = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f214l) {
            this.f214l = z;
            if (z) {
                return;
            }
            m3433i();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m3428n();
        C0215a4 c0215a4 = (C0215a4) this.f209g;
        c0215a4.f1462e = i != 0 ? AbstractC0142b.m3000b(c0215a4.m2882a(), i) : null;
        c0215a4.m2876g();
    }

    public void setLogo(int i) {
        m3428n();
        C0215a4 c0215a4 = (C0215a4) this.f209g;
        c0215a4.f1463f = i != 0 ? AbstractC0142b.m3000b(c0215a4.m2882a(), i) : null;
        c0215a4.m2876g();
    }

    public void setOverlayMode(boolean z) {
        this.f212j = z;
        this.f211i = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p010b.p016c.p026q.InterfaceC0280m1
    public void setWindowCallback(Window.Callback callback) {
        m3428n();
        ((C0215a4) this.f209g).f1469l = callback;
    }

    @Override // p010b.p016c.p026q.InterfaceC0280m1
    public void setWindowTitle(CharSequence charSequence) {
        m3428n();
        C0215a4 c0215a4 = (C0215a4) this.f209g;
        if (c0215a4.f1465h) {
            return;
        }
        c0215a4.f1466i = charSequence;
        if ((c0215a4.f1459b & 8) != 0) {
            c0215a4.f1458a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setIcon(Drawable drawable) {
        m3428n();
        C0215a4 c0215a4 = (C0215a4) this.f209g;
        c0215a4.f1462e = drawable;
        c0215a4.m2876g();
    }
}