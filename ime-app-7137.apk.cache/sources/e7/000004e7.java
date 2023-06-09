package p010b.p091z.p092a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager$SavedState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.z.a.n */
/* loaded from: classes.dex */
public abstract class AbstractC1123n extends ViewGroup {

    /* renamed from: b */
    public static final int[] f4176b = {16842931};

    /* renamed from: c */
    public static final Comparator f4177c = new C1111b();

    /* renamed from: d */
    public static final Interpolator f4178d = new animationInterpolatorC1112c();

    /* renamed from: e */
    public static final C1122m f4179e = new C1122m();

    /* renamed from: A */
    public boolean f4180A;

    /* renamed from: B */
    public int f4181B;

    /* renamed from: C */
    public boolean f4182C;

    /* renamed from: D */
    public boolean f4183D;

    /* renamed from: E */
    public int f4184E;

    /* renamed from: F */
    public int f4185F;

    /* renamed from: G */
    public int f4186G;

    /* renamed from: H */
    public float f4187H;

    /* renamed from: I */
    public float f4188I;

    /* renamed from: J */
    public float f4189J;

    /* renamed from: K */
    public float f4190K;

    /* renamed from: L */
    public int f4191L;

    /* renamed from: M */
    public VelocityTracker f4192M;

    /* renamed from: N */
    public int f4193N;

    /* renamed from: O */
    public int f4194O;

    /* renamed from: P */
    public int f4195P;

    /* renamed from: Q */
    public int f4196Q;

    /* renamed from: R */
    public EdgeEffect f4197R;

    /* renamed from: S */
    public EdgeEffect f4198S;

    /* renamed from: T */
    public boolean f4199T;

    /* renamed from: U */
    public boolean f4200U;

    /* renamed from: V */
    public int f4201V;

    /* renamed from: W */
    public InterfaceC1119j f4202W;

    /* renamed from: a0 */
    public final Runnable f4203a0;

    /* renamed from: b0 */
    public int f4204b0;

    /* renamed from: f */
    public int f4205f;

    /* renamed from: g */
    public final ArrayList f4206g;

    /* renamed from: h */
    public final C1116g f4207h;

    /* renamed from: i */
    public final Rect f4208i;

    /* renamed from: j */
    public AbstractC1110a f4209j;

    /* renamed from: k */
    public int f4210k;

    /* renamed from: l */
    public int f4211l;

    /* renamed from: m */
    public Parcelable f4212m;

    /* renamed from: n */
    public ClassLoader f4213n;

    /* renamed from: o */
    public Scroller f4214o;

    /* renamed from: p */
    public boolean f4215p;

    /* renamed from: q */
    public C1120k f4216q;

    /* renamed from: r */
    public int f4217r;

    /* renamed from: s */
    public Drawable f4218s;

    /* renamed from: t */
    public int f4219t;

    /* renamed from: u */
    public int f4220u;

    /* renamed from: v */
    public float f4221v;

    /* renamed from: w */
    public float f4222w;

    /* renamed from: x */
    public int f4223x;

    /* renamed from: y */
    public boolean f4224y;

    /* renamed from: z */
    public boolean f4225z;

    public AbstractC1123n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4206g = new ArrayList();
        this.f4207h = new C1116g();
        this.f4208i = new Rect();
        this.f4211l = -1;
        this.f4212m = null;
        this.f4213n = null;
        this.f4221v = -3.4028235E38f;
        this.f4222w = Float.MAX_VALUE;
        this.f4181B = 1;
        this.f4191L = -1;
        this.f4199T = true;
        this.f4203a0 = new RunnableC1113d(this);
        this.f4204b0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f4214o = new Scroller(context2, f4178d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f4186G = viewConfiguration.getScaledPagingTouchSlop();
        this.f4193N = (int) (400.0f * f);
        this.f4194O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4197R = new EdgeEffect(context2);
        this.f4198S = new EdgeEffect(context2);
        this.f4195P = (int) (25.0f * f);
        this.f4196Q = (int) (2.0f * f);
        this.f4184E = (int) (f * 16.0f);
        AbstractC0605j0.m2269N(this, new C1118i(this));
        if (AbstractC0605j0.m2242p(this) == 0) {
            AbstractC0605j0.m2263T(this, 1);
        }
        AbstractC0605j0.m2262U(this, new C1114e(this));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f4225z != z) {
            this.f4225z = z;
        }
    }

    /* renamed from: a */
    public C1116g m1218a(int i, int i2) {
        C1116g c1116g = new C1116g();
        c1116g.f4164b = i;
        c1116g.f4163a = this.f4209j.mo1091f(this, i);
        this.f4209j.getClass();
        c1116g.f4166d = 1.0f;
        if (i2 < 0 || i2 >= this.f4206g.size()) {
            this.f4206g.add(c1116g);
        } else {
            this.f4206g.add(i2, c1116g);
        }
        return c1116g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        C1116g m1211h;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m1211h = m1211h(childAt)) != null && m1211h.f4164b == this.f4210k) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        C1116g m1211h;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m1211h = m1211h(childAt)) != null && m1211h.f4164b == this.f4210k) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C1117h c1117h = (C1117h) layoutParams;
        boolean z = c1117h.f4168a | (view.getClass().getAnnotation(InterfaceC1115f.class) != null);
        c1117h.f4168a = z;
        if (!this.f4224y) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            c1117h.f4171d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1217b(int i) {
        boolean z;
        View findNextFocus;
        boolean m1205n;
        View findFocus = findFocus();
        boolean z2 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    sb.toString();
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i != 17 || i == 1) {
                    z2 = m1206m();
                } else if (i == 66 || i == 2) {
                    z2 = m1205n();
                }
            } else if (i == 17) {
                int i2 = m1212g(this.f4208i, findNextFocus).left;
                int i3 = m1212g(this.f4208i, findFocus).left;
                if (findFocus != null && i2 >= i3) {
                    m1205n = m1206m();
                    z2 = m1205n;
                }
                m1205n = findNextFocus.requestFocus();
                z2 = m1205n;
            } else if (i == 66) {
                int i4 = m1212g(this.f4208i, findNextFocus).left;
                int i5 = m1212g(this.f4208i, findFocus).left;
                if (findFocus != null && i4 <= i5) {
                    m1205n = m1205n();
                    z2 = m1205n;
                }
                m1205n = findNextFocus.requestFocus();
                z2 = m1205n;
            }
            if (z2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z2;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
        }
        if (i != 17) {
        }
        z2 = m1206m();
        if (z2) {
        }
        return z2;
    }

    /* renamed from: c */
    public boolean m1216c(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m1216c(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f4209j == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f4221v)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f4222w));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1117h) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f4215p = true;
        if (!this.f4214o.isFinished() && this.f4214o.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f4214o.getCurrX();
            int currY = this.f4214o.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m1204o(currX)) {
                    this.f4214o.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
                return;
            } else {
                postInvalidate();
                return;
            }
        }
        m1215d(true);
    }

    /* renamed from: d */
    public final void m1215d(boolean z) {
        boolean z2 = this.f4204b0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f4214o.isFinished()) {
                this.f4214o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4214o.getCurrX();
                int currY = this.f4214o.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m1204o(currX);
                    }
                }
            }
        }
        this.f4180A = false;
        for (int i = 0; i < this.f4206g.size(); i++) {
            C1116g c1116g = (C1116g) this.f4206g.get(i);
            if (c1116g.f4165c) {
                c1116g.f4165c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                AbstractC0605j0.m2276G(this, this.f4203a0);
            } else {
                this.f4203a0.run();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        int i;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                z = m1217b(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                z = m1217b(1);
                            }
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        z = m1205n();
                    } else {
                        i = 66;
                        z = m1217b(i);
                    }
                    if (z) {
                        return false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    z = m1206m();
                    if (z) {
                    }
                } else {
                    i = 17;
                    z = m1217b(i);
                    if (z) {
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1116g m1211h;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m1211h = m1211h(childAt)) != null && m1211h.f4164b == this.f4210k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC1110a abstractC1110a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC1110a = this.f4209j) != null && abstractC1110a.mo1093c() > 1)) {
            if (!this.f4197R.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f4221v * width);
                this.f4197R.setSize(height, width);
                z = false | this.f4197R.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f4198S.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4222w + 1.0f)) * width2);
                this.f4198S.setSize(height2, width2);
                z |= this.f4198S.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f4197R.finish();
            this.f4198S.finish();
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

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4218s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public void m1214e() {
        int mo1093c = this.f4209j.mo1093c();
        this.f4205f = mo1093c;
        boolean z = this.f4206g.size() < (this.f4181B * 2) + 1 && this.f4206g.size() < mo1093c;
        int i = this.f4210k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f4206g.size()) {
            C1116g c1116g = (C1116g) this.f4206g.get(i2);
            int mo1092d = this.f4209j.mo1092d(c1116g.f4163a);
            if (mo1092d != -1) {
                if (mo1092d == -2) {
                    this.f4206g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f4209j.mo1086k(this);
                        z2 = true;
                    }
                    this.f4209j.mo1095a(this, c1116g.f4164b, c1116g.f4163a);
                    int i3 = this.f4210k;
                    if (i3 == c1116g.f4164b) {
                        i = Math.max(0, Math.min(i3, mo1093c - 1));
                    }
                } else {
                    int i4 = c1116g.f4164b;
                    if (i4 != mo1092d) {
                        if (i4 == this.f4210k) {
                            i = mo1092d;
                        }
                        c1116g.f4164b = mo1092d;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f4209j.mo1094b(this);
        }
        Collections.sort(this.f4206g, f4177c);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C1117h c1117h = (C1117h) getChildAt(i5).getLayoutParams();
                if (!c1117h.f4168a) {
                    c1117h.f4170c = 0.0f;
                }
            }
            m1196w(i, false, true, 0);
            requestLayout();
        }
    }

    /* renamed from: f */
    public final void m1213f(int i) {
        InterfaceC1119j interfaceC1119j = this.f4202W;
        if (interfaceC1119j != null) {
            interfaceC1119j.mo811c(i);
        }
    }

    /* renamed from: g */
    public final Rect m1212g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1117h();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1117h(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC1110a getAdapter() {
        return this.f4209j;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f4210k;
    }

    public int getOffscreenPageLimit() {
        return this.f4181B;
    }

    public int getPageMargin() {
        return this.f4217r;
    }

    /* renamed from: h */
    public C1116g m1211h(View view) {
        for (int i = 0; i < this.f4206g.size(); i++) {
            C1116g c1116g = (C1116g) this.f4206g.get(i);
            if (this.f4209j.mo1090g(view, c1116g.f4163a)) {
                return c1116g;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final C1116g m1210i() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f4217r / clientWidth : 0.0f;
        C1116g c1116g = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f4206g.size()) {
            C1116g c1116g2 = (C1116g) this.f4206g.get(i3);
            if (!z && c1116g2.f4164b != (i = i2 + 1)) {
                c1116g2 = this.f4207h;
                c1116g2.f4167e = f + f3 + f2;
                c1116g2.f4164b = i;
                this.f4209j.getClass();
                c1116g2.f4166d = 1.0f;
                i3--;
            }
            f = c1116g2.f4167e;
            float f4 = c1116g2.f4166d + f + f2;
            if (!z && scrollX < f) {
                return c1116g;
            }
            if (scrollX < f4 || i3 == this.f4206g.size() - 1) {
                return c1116g2;
            }
            i2 = c1116g2.f4164b;
            f3 = c1116g2.f4166d;
            i3++;
            c1116g = c1116g2;
            z = false;
        }
        return c1116g;
    }

    /* renamed from: j */
    public C1116g m1209j(int i) {
        for (int i2 = 0; i2 < this.f4206g.size(); i2++) {
            C1116g c1116g = (C1116g) this.f4206g.get(i2);
            if (c1116g.f4164b == i) {
                return c1116g;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1208k(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.f4201V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C1117h c1117h = (C1117h) childAt.getLayoutParams();
                if (c1117h.f4168a) {
                    int i5 = c1117h.f4169b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        InterfaceC1119j interfaceC1119j = this.f4202W;
        if (interfaceC1119j != null) {
            interfaceC1119j.mo813a(i, f, i2);
        }
        this.f4200U = true;
    }

    /* renamed from: l */
    public final void m1207l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4191L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4187H = motionEvent.getX(i);
            this.f4191L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4192M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: m */
    public boolean m1206m() {
        int i = this.f4210k;
        if (i > 0) {
            m1197v(i - 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1205n() {
        AbstractC1110a abstractC1110a = this.f4209j;
        if (abstractC1110a == null || this.f4210k >= abstractC1110a.mo1093c() - 1) {
            return false;
        }
        m1197v(this.f4210k + 1, true);
        return true;
    }

    /* renamed from: o */
    public final boolean m1204o(int i) {
        if (this.f4206g.size() == 0) {
            if (this.f4199T) {
                return false;
            }
            this.f4200U = false;
            m1208k(0, 0.0f, 0);
            if (this.f4200U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1116g m1210i = m1210i();
        int clientWidth = getClientWidth();
        int i2 = this.f4217r;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = m1210i.f4164b;
        float f2 = ((i / f) - m1210i.f4167e) / (m1210i.f4166d + (i2 / f));
        this.f4200U = false;
        m1208k(i4, f2, (int) (i3 * f2));
        if (this.f4200U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4199T = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4203a0);
        Scroller scroller = this.f4214o;
        if (scroller != null && !scroller.isFinished()) {
            this.f4214o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f4217r <= 0 || this.f4218s == null || this.f4206g.size() <= 0 || this.f4209j == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f3 = this.f4217r / width2;
        int i2 = 0;
        C1116g c1116g = (C1116g) this.f4206g.get(0);
        float f4 = c1116g.f4167e;
        int size = this.f4206g.size();
        int i3 = c1116g.f4164b;
        int i4 = ((C1116g) this.f4206g.get(size - 1)).f4164b;
        while (i3 < i4) {
            while (true) {
                i = c1116g.f4164b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c1116g = (C1116g) this.f4206g.get(i2);
            }
            if (i3 == i) {
                float f5 = c1116g.f4167e;
                float f6 = c1116g.f4166d;
                f = (f5 + f6) * width2;
                f4 = f5 + f6 + f3;
            } else {
                this.f4209j.getClass();
                f = (f4 + 1.0f) * width2;
                f4 = 1.0f + f3 + f4;
            }
            if (this.f4217r + f > scrollX) {
                f2 = f3;
                this.f4218s.setBounds(Math.round(f), this.f4219t, Math.round(this.f4217r + f), this.f4220u);
                this.f4218s.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m1199t();
            return false;
        }
        if (action != 0) {
            if (this.f4182C) {
                return true;
            }
            if (this.f4183D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f4189J = x;
            this.f4187H = x;
            float y = motionEvent.getY();
            this.f4190K = y;
            this.f4188I = y;
            this.f4191L = motionEvent.getPointerId(0);
            this.f4183D = false;
            this.f4215p = true;
            this.f4214o.computeScrollOffset();
            if (this.f4204b0 != 2 || Math.abs(this.f4214o.getFinalX() - this.f4214o.getCurrX()) <= this.f4196Q) {
                m1215d(false);
                this.f4182C = false;
            } else {
                this.f4214o.abortAnimation();
                this.f4180A = false;
                m1202q(this.f4210k);
                this.f4182C = true;
                m1200s(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f4191L;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f4187H;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f4190K);
                if (f != 0.0f) {
                    float f2 = this.f4187H;
                    if (!((f2 < ((float) this.f4185F) && f > 0.0f) || (f2 > ((float) (getWidth() - this.f4185F)) && f < 0.0f)) && m1216c(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f4187H = x2;
                        this.f4188I = y2;
                        this.f4183D = true;
                        return false;
                    }
                }
                int i2 = this.f4186G;
                if (abs > i2 && abs * 0.5f > abs2) {
                    this.f4182C = true;
                    m1200s(true);
                    setScrollState(1);
                    this.f4187H = f > 0.0f ? this.f4189J + this.f4186G : this.f4189J - this.f4186G;
                    this.f4188I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i2) {
                    this.f4183D = true;
                }
                if (this.f4182C && m1203p(x2)) {
                    AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                    if (Build.VERSION.SDK_INT >= 16) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidate();
                    }
                }
            }
        } else if (action == 6) {
            m1207l(motionEvent);
        }
        if (this.f4192M == null) {
            this.f4192M = VelocityTracker.obtain();
        }
        this.f4192M.addMovement(motionEvent);
        return this.f4182C;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C1116g m1211h;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1117h c1117h = (C1117h) childAt.getLayoutParams();
                if (c1117h.f4168a) {
                    int i11 = c1117h.f4169b;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i13 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 == 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, childAt.getMeasuredHeight() + paddingTop);
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i17 = (i7 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                C1117h c1117h2 = (C1117h) childAt2.getLayoutParams();
                if (!c1117h2.f4168a && (m1211h = m1211h(childAt2)) != null) {
                    float f = i17;
                    int i19 = ((int) (m1211h.f4167e * f)) + paddingLeft;
                    if (c1117h2.f4171d) {
                        c1117h2.f4171d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c1117h2.f4170c), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f4219t = paddingTop;
        this.f4220u = i8 - paddingBottom;
        this.f4201V = i9;
        if (this.f4199T) {
            z2 = false;
            m1198u(this.f4210k, false, 0, false);
        } else {
            z2 = false;
        }
        this.f4199T = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        C1117h c1117h;
        C1117h c1117h2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f4185F = Math.min(measuredWidth / 10, this.f4184E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c1117h2 = (C1117h) childAt.getLayoutParams()) != null && c1117h2.f4168a) {
                int i8 = c1117h2.f4169b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                } else if (z) {
                    i3 = 1073741824;
                    i4 = ((ViewGroup.LayoutParams) c1117h2).width;
                    if (i4 == -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c1117h2).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (!z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i3 = Integer.MIN_VALUE;
                i4 = ((ViewGroup.LayoutParams) c1117h2).width;
                if (i4 == -2) {
                }
                i5 = ((ViewGroup.LayoutParams) c1117h2).height;
                if (i5 != -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (!z2) {
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f4223x = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f4224y = true;
        m1202q(this.f4210k);
        this.f4224y = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c1117h = (C1117h) childAt2.getLayoutParams()) == null || !c1117h.f4168a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c1117h.f4170c), 1073741824), this.f4223x);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1116g m1211h;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m1211h = m1211h(childAt)) != null && m1211h.f4164b == this.f4210k && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(viewPager$SavedState.f511c);
        AbstractC1110a abstractC1110a = this.f4209j;
        if (abstractC1110a != null) {
            abstractC1110a.mo1089h(viewPager$SavedState.f827e, viewPager$SavedState.f828f);
            m1196w(viewPager$SavedState.f826d, false, true, 0);
            return;
        }
        this.f4211l = viewPager$SavedState.f826d;
        this.f4212m = viewPager$SavedState.f827e;
        this.f4213n = viewPager$SavedState.f828f;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.f826d = this.f4210k;
        AbstractC1110a abstractC1110a = this.f4209j;
        if (abstractC1110a != null) {
            viewPager$SavedState.f827e = abstractC1110a.mo1088i();
        }
        return viewPager$SavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f4217r;
            m1201r(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC1110a abstractC1110a;
        int pointerId;
        ArrayList arrayList;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC1110a = this.f4209j) == null || abstractC1110a.mo1093c() == 0) {
            return false;
        }
        if (this.f4192M == null) {
            this.f4192M = VelocityTracker.obtain();
        }
        this.f4192M.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f4182C) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f4191L);
                        if (findPointerIndex != -1) {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.f4187H);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.f4188I);
                            if (abs > this.f4186G && abs > abs2) {
                                this.f4182C = true;
                                m1200s(true);
                                float f = this.f4189J;
                                this.f4187H = x - f > 0.0f ? f + this.f4186G : f - this.f4186G;
                                this.f4188I = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        z = m1199t();
                    }
                    if (this.f4182C) {
                        z = false | m1203p(motionEvent.getX(motionEvent.findPointerIndex(this.f4191L)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f4187H = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m1207l(motionEvent);
                        this.f4187H = motionEvent.getX(motionEvent.findPointerIndex(this.f4191L));
                    }
                } else if (this.f4182C) {
                    m1198u(this.f4210k, true, 0, false);
                    z = m1199t();
                }
            } else if (this.f4182C) {
                VelocityTracker velocityTracker = this.f4192M;
                velocityTracker.computeCurrentVelocity(1000, this.f4194O);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f4191L);
                this.f4180A = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C1116g m1210i = m1210i();
                float f2 = clientWidth;
                int i = m1210i.f4164b;
                float f3 = ((scrollX / f2) - m1210i.f4167e) / (m1210i.f4166d + (this.f4217r / f2));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f4191L)) - this.f4189J)) <= this.f4195P || Math.abs(xVelocity) <= this.f4193N) {
                    i += (int) (f3 + (i >= this.f4210k ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    i++;
                }
                if (this.f4206g.size() > 0) {
                    i = Math.max(((C1116g) this.f4206g.get(0)).f4164b, Math.min(i, ((C1116g) this.f4206g.get(arrayList.size() - 1)).f4164b));
                }
                m1196w(i, true, true, xVelocity);
                z = m1199t();
            }
            if (z) {
                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                if (Build.VERSION.SDK_INT >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            }
            return true;
        }
        this.f4214o.abortAnimation();
        this.f4180A = false;
        m1202q(this.f4210k);
        float x2 = motionEvent.getX();
        this.f4189J = x2;
        this.f4187H = x2;
        float y2 = motionEvent.getY();
        this.f4190K = y2;
        this.f4188I = y2;
        pointerId = motionEvent.getPointerId(0);
        this.f4191L = pointerId;
        if (z) {
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m1203p(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f4187H - f;
        this.f4187H = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f4221v * clientWidth;
        float f4 = this.f4222w * clientWidth;
        boolean z3 = false;
        C1116g c1116g = (C1116g) this.f4206g.get(0);
        ArrayList arrayList = this.f4206g;
        C1116g c1116g2 = (C1116g) arrayList.get(arrayList.size() - 1);
        if (c1116g.f4164b != 0) {
            f3 = c1116g.f4167e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c1116g2.f4164b != this.f4209j.mo1093c() - 1) {
            f4 = c1116g2.f4167e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f4197R.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f4198S.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f4187H = (scrollX - i) + this.f4187H;
        scrollTo(i, getScrollY());
        m1204o(i);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r5 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
        if (r6 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c4, code lost:
        if (r6 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
        if (r6 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
        r7 = (p010b.p091z.p092a.C1116g) r14.f4206g.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0132, code lost:
        if (r10 < r14.f4206g.size()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0146, code lost:
        if (r10 < r14.f4206g.size()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0158, code lost:
        if (r10 < r14.f4206g.size()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015a, code lost:
        r7 = (p010b.p091z.p092a.C1116g) r14.f4206g.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0163, code lost:
        r7 = null;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1202q(int i) {
        C1116g c1116g;
        String hexString;
        C1116g c1116g2;
        C1116g c1116g3;
        C1116g m1211h;
        int i2;
        int i3;
        C1116g c1116g4;
        C1116g c1116g5;
        int i4 = this.f4210k;
        if (i4 != i) {
            c1116g = m1209j(i4);
            this.f4210k = i;
        } else {
            c1116g = null;
        }
        if (this.f4209j == null || this.f4180A || getWindowToken() == null) {
            return;
        }
        this.f4209j.mo1086k(this);
        int i5 = this.f4181B;
        int max = Math.max(0, this.f4210k - i5);
        int mo1093c = this.f4209j.mo1093c();
        int min = Math.min(mo1093c - 1, this.f4210k + i5);
        if (mo1093c != this.f4205f) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder m1187i = AbstractC1124a.m1187i("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            m1187i.append(this.f4205f);
            m1187i.append(", found: ");
            m1187i.append(mo1093c);
            m1187i.append(" Pager id: ");
            m1187i.append(hexString);
            m1187i.append(" Pager class: ");
            m1187i.append(getClass());
            m1187i.append(" Problematic adapter: ");
            m1187i.append(this.f4209j.getClass());
            throw new IllegalStateException(m1187i.toString());
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f4206g.size()) {
                break;
            }
            c1116g2 = (C1116g) this.f4206g.get(i6);
            int i7 = c1116g2.f4164b;
            int i8 = this.f4210k;
            if (i7 < i8) {
                i6++;
            }
        }
        c1116g2 = null;
        if (c1116g2 == null && mo1093c > 0) {
            c1116g2 = m1218a(this.f4210k, i6);
        }
        if (c1116g2 != null) {
            int i9 = i6 - 1;
            C1116g c1116g6 = i9 >= 0 ? (C1116g) this.f4206g.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c1116g2.f4166d) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i10 = this.f4210k - 1; i10 >= 0; i10--) {
                if (f < paddingLeft || i10 >= max) {
                    if (c1116g6 == null || i10 != c1116g6.f4164b) {
                        f += m1218a(i10, i9 + 1).f4166d;
                        i6++;
                    } else {
                        f += c1116g6.f4166d;
                        i9--;
                    }
                } else if (c1116g6 == null) {
                    break;
                } else if (i10 == c1116g6.f4164b && !c1116g6.f4165c) {
                    this.f4206g.remove(i9);
                    this.f4209j.mo1095a(this, i10, c1116g6.f4163a);
                    i9--;
                    i6--;
                }
            }
            float f2 = c1116g2.f4166d;
            int i11 = i6 + 1;
            if (f2 < 2.0f) {
                C1116g c1116g7 = i11 < this.f4206g.size() ? (C1116g) this.f4206g.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.f4210k + 1; i13 < mo1093c; i13++) {
                    if (f2 < paddingRight || i13 <= min) {
                        if (c1116g7 == null || i13 != c1116g7.f4164b) {
                            C1116g m1218a = m1218a(i13, i12);
                            i12++;
                            f2 += m1218a.f4166d;
                        } else {
                            f2 += c1116g7.f4166d;
                            i12++;
                        }
                    } else if (c1116g7 == null) {
                        break;
                    } else if (i13 == c1116g7.f4164b && !c1116g7.f4165c) {
                        this.f4206g.remove(i12);
                        this.f4209j.mo1095a(this, i13, c1116g7.f4163a);
                    }
                }
            }
            int mo1093c2 = this.f4209j.mo1093c();
            int clientWidth2 = getClientWidth();
            float f3 = clientWidth2 > 0 ? this.f4217r / clientWidth2 : 0.0f;
            if (c1116g != null) {
                int i14 = c1116g.f4164b;
                int i15 = c1116g2.f4164b;
                if (i14 < i15) {
                    float f4 = c1116g.f4167e + c1116g.f4166d + f3;
                    int i16 = 0;
                    while (true) {
                        i14++;
                        if (i14 > c1116g2.f4164b || i16 >= this.f4206g.size()) {
                            break;
                        }
                        while (true) {
                            c1116g5 = (C1116g) this.f4206g.get(i16);
                            if (i14 <= c1116g5.f4164b || i16 >= this.f4206g.size() - 1) {
                                break;
                            }
                            i16++;
                        }
                        while (i14 < c1116g5.f4164b) {
                            this.f4209j.getClass();
                            f4 += 1.0f + f3;
                            i14++;
                        }
                        c1116g5.f4167e = f4;
                        f4 += c1116g5.f4166d + f3;
                    }
                } else if (i14 > i15) {
                    int size = this.f4206g.size() - 1;
                    float f5 = c1116g.f4167e;
                    while (true) {
                        i14--;
                        if (i14 < c1116g2.f4164b || size < 0) {
                            break;
                        }
                        while (true) {
                            c1116g4 = (C1116g) this.f4206g.get(size);
                            if (i14 >= c1116g4.f4164b || size <= 0) {
                                break;
                            }
                            size--;
                        }
                        while (i14 > c1116g4.f4164b) {
                            this.f4209j.getClass();
                            f5 -= 1.0f + f3;
                            i14--;
                        }
                        f5 -= c1116g4.f4166d + f3;
                        c1116g4.f4167e = f5;
                    }
                }
            }
            int size2 = this.f4206g.size();
            float f6 = c1116g2.f4167e;
            int i17 = c1116g2.f4164b;
            int i18 = i17 - 1;
            this.f4221v = i17 == 0 ? f6 : -3.4028235E38f;
            int i19 = mo1093c2 - 1;
            this.f4222w = i17 == i19 ? (c1116g2.f4166d + f6) - 1.0f : Float.MAX_VALUE;
            int i20 = i6 - 1;
            while (i20 >= 0) {
                C1116g c1116g8 = (C1116g) this.f4206g.get(i20);
                while (true) {
                    i3 = c1116g8.f4164b;
                    if (i18 <= i3) {
                        break;
                    }
                    i18--;
                    this.f4209j.getClass();
                    f6 -= 1.0f + f3;
                }
                f6 -= c1116g8.f4166d + f3;
                c1116g8.f4167e = f6;
                if (i3 == 0) {
                    this.f4221v = f6;
                }
                i20--;
                i18--;
            }
            float f7 = c1116g2.f4167e + c1116g2.f4166d + f3;
            int i21 = c1116g2.f4164b;
            while (true) {
                i21++;
                if (i11 >= size2) {
                    break;
                }
                C1116g c1116g9 = (C1116g) this.f4206g.get(i11);
                while (true) {
                    i2 = c1116g9.f4164b;
                    if (i21 >= i2) {
                        break;
                    }
                    i21++;
                    this.f4209j.getClass();
                    f7 += 1.0f + f3;
                }
                if (i2 == i19) {
                    this.f4222w = (c1116g9.f4166d + f7) - 1.0f;
                }
                c1116g9.f4167e = f7;
                f7 += c1116g9.f4166d + f3;
                i11++;
            }
            this.f4209j.mo1087j(this, this.f4210k, c1116g2.f4163a);
        }
        this.f4209j.mo1094b(this);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            C1117h c1117h = (C1117h) childAt.getLayoutParams();
            c1117h.f4173f = i22;
            if (!c1117h.f4168a && c1117h.f4170c == 0.0f && (m1211h = m1211h(childAt)) != null) {
                c1117h.f4170c = m1211h.f4166d;
                c1117h.f4172e = m1211h.f4164b;
            }
        }
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    ViewParent parent = findFocus.getParent();
                    if (parent == this) {
                        c1116g3 = m1211h(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            c1116g3 = null;
            if (c1116g3 == null || c1116g3.f4164b != this.f4210k) {
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt2 = getChildAt(i23);
                    C1116g m1211h2 = m1211h(childAt2);
                    if (m1211h2 != null && m1211h2.f4164b == this.f4210k && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final void m1201r(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f4206g.isEmpty()) {
            C1116g m1209j = m1209j(this.f4210k);
            min = (int) ((m1209j != null ? Math.min(m1209j.f4167e, this.f4222w) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            m1215d(false);
        } else if (!this.f4214o.isFinished()) {
            this.f4214o.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(min, getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f4224y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public final void m1200s(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAdapter(AbstractC1110a abstractC1110a) {
        AbstractC1110a abstractC1110a2 = this.f4209j;
        if (abstractC1110a2 != null) {
            synchronized (abstractC1110a2) {
                abstractC1110a2.f4159b = null;
            }
            this.f4209j.mo1086k(this);
            for (int i = 0; i < this.f4206g.size(); i++) {
                C1116g c1116g = (C1116g) this.f4206g.get(i);
                this.f4209j.mo1095a(this, c1116g.f4164b, c1116g.f4163a);
            }
            this.f4209j.mo1094b(this);
            this.f4206g.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C1117h) getChildAt(i2).getLayoutParams()).f4168a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f4210k = 0;
            scrollTo(0, 0);
        }
        this.f4209j = abstractC1110a;
        this.f4205f = 0;
        if (abstractC1110a != null) {
            if (this.f4216q == null) {
                this.f4216q = new C1120k(this);
            }
            AbstractC1110a abstractC1110a3 = this.f4209j;
            C1120k c1120k = this.f4216q;
            synchronized (abstractC1110a3) {
                abstractC1110a3.f4159b = c1120k;
            }
            this.f4180A = false;
            boolean z = this.f4199T;
            this.f4199T = true;
            this.f4205f = this.f4209j.mo1093c();
            if (this.f4211l < 0) {
                if (!z) {
                    m1202q(this.f4210k);
                    return;
                } else {
                    requestLayout();
                    return;
                }
            }
            this.f4209j.mo1089h(this.f4212m, this.f4213n);
            m1196w(this.f4211l, false, true, 0);
            this.f4211l = -1;
            this.f4212m = null;
            this.f4213n = null;
        }
    }

    public void setCurrentItem(int i) {
        this.f4180A = false;
        m1196w(i, !this.f4199T, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.f4181B) {
            this.f4181B = i;
            m1202q(this.f4210k);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1119j interfaceC1119j) {
        this.f4202W = interfaceC1119j;
    }

    public void setPageMargin(int i) {
        int i2 = this.f4217r;
        this.f4217r = i;
        int width = getWidth();
        m1201r(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(AbstractC0472e.m2430c(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4218s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f4204b0 == i) {
            return;
        }
        this.f4204b0 = i;
        InterfaceC1119j interfaceC1119j = this.f4202W;
        if (interfaceC1119j != null) {
            interfaceC1119j.mo812b(i);
        }
    }

    /* renamed from: t */
    public final boolean m1199t() {
        this.f4191L = -1;
        this.f4182C = false;
        this.f4183D = false;
        VelocityTracker velocityTracker = this.f4192M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4192M = null;
        }
        this.f4197R.onRelease();
        this.f4198S.onRelease();
        return this.f4197R.isFinished() || this.f4198S.isFinished();
    }

    /* renamed from: u */
    public final void m1198u(int i, boolean z, int i2, boolean z2) {
        InterfaceC1119j interfaceC1119j;
        int scrollX;
        int abs;
        InterfaceC1119j interfaceC1119j2;
        C1116g m1209j = m1209j(i);
        int max = m1209j != null ? (int) (Math.max(this.f4221v, Math.min(m1209j.f4167e, this.f4222w)) * getClientWidth()) : 0;
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f4214o;
                if ((scroller == null || scroller.isFinished()) ? false : true) {
                    scrollX = this.f4215p ? this.f4214o.getCurrX() : this.f4214o.getStartX();
                    this.f4214o.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i3 = scrollX;
                int scrollY = getScrollY();
                int i4 = max - i3;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    m1215d(false);
                    m1202q(this.f4210k);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i6 = clientWidth / 2;
                    float f = clientWidth;
                    float f2 = i6;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.f4209j.getClass();
                        abs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.f4217r)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f4215p = false;
                    this.f4214o.startScroll(i3, scrollY, i4, i5, min);
                    AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                    if (Build.VERSION.SDK_INT >= 16) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidate();
                    }
                }
            }
            if (!z2 || (interfaceC1119j2 = this.f4202W) == null) {
                return;
            }
            interfaceC1119j2.mo811c(i);
            return;
        }
        if (z2 && (interfaceC1119j = this.f4202W) != null) {
            interfaceC1119j.mo811c(i);
        }
        m1215d(false);
        scrollTo(max, 0);
        m1204o(max);
    }

    /* renamed from: v */
    public void m1197v(int i, boolean z) {
        this.f4180A = false;
        m1196w(i, z, false, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4218s;
    }

    /* renamed from: w */
    public void m1196w(int i, boolean z, boolean z2, int i2) {
        AbstractC1110a abstractC1110a = this.f4209j;
        if (abstractC1110a == null || abstractC1110a.mo1093c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f4210k != i || this.f4206g.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f4209j.mo1093c()) {
                i = this.f4209j.mo1093c() - 1;
            }
            int i3 = this.f4181B;
            int i4 = this.f4210k;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f4206g.size(); i5++) {
                    ((C1116g) this.f4206g.get(i5)).f4165c = true;
                }
            }
            boolean z3 = this.f4210k != i;
            if (!this.f4199T) {
                m1202q(i);
                m1198u(i, z, i2, z3);
                return;
            }
            this.f4210k = i;
            if (z3) {
                m1213f(i);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }
}