package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p017k.C0097e;
import p010b.p016c.p017k.C0117o;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0612n;
import p010b.p046j.p058l.C0620r;
import p010b.p046j.p058l.InterfaceC0610m;
import p010b.p046j.p058l.InterfaceC0616p;
import p010b.p046j.p061m.C0642e;
import p010b.p046j.p061m.C0644g;
import p010b.p046j.p061m.InterfaceC0643f;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0616p, InterfaceC0610m {

    /* renamed from: b */
    public static final C0642e f481b = new C0642e();

    /* renamed from: c */
    public static final int[] f482c = {16843130};

    /* renamed from: A */
    public final C0612n f483A;

    /* renamed from: B */
    public float f484B;

    /* renamed from: C */
    public InterfaceC0643f f485C;

    /* renamed from: d */
    public long f486d;

    /* renamed from: e */
    public final Rect f487e;

    /* renamed from: f */
    public OverScroller f488f;

    /* renamed from: g */
    public EdgeEffect f489g;

    /* renamed from: h */
    public EdgeEffect f490h;

    /* renamed from: i */
    public int f491i;

    /* renamed from: j */
    public boolean f492j;

    /* renamed from: k */
    public boolean f493k;

    /* renamed from: l */
    public View f494l;

    /* renamed from: m */
    public boolean f495m;

    /* renamed from: n */
    public VelocityTracker f496n;

    /* renamed from: o */
    public boolean f497o;

    /* renamed from: p */
    public boolean f498p;

    /* renamed from: q */
    public int f499q;

    /* renamed from: r */
    public int f500r;

    /* renamed from: s */
    public int f501s;

    /* renamed from: t */
    public int f502t;

    /* renamed from: u */
    public final int[] f503u;

    /* renamed from: v */
    public final int[] f504v;

    /* renamed from: w */
    public int f505w;

    /* renamed from: x */
    public int f506x;

    /* renamed from: y */
    public SavedState f507y;

    /* renamed from: z */
    public final C0620r f508z;

    /* loaded from: classes.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0644g();

        /* renamed from: b */
        public int f509b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f509b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m1187i = AbstractC1124a.m1187i("HorizontalScrollView.SavedState{");
            m1187i.append(Integer.toHexString(System.identityHashCode(this)));
            m1187i.append(" scrollPosition=");
            m1187i.append(this.f509b);
            m1187i.append("}");
            return m1187i.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f509b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f487e = new Rect();
        this.f492j = true;
        this.f493k = false;
        this.f494l = null;
        this.f495m = false;
        this.f498p = true;
        this.f502t = -1;
        this.f503u = new int[2];
        this.f504v = new int[2];
        this.f488f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f499q = viewConfiguration.getScaledTouchSlop();
        this.f500r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f501s = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f482c, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f508z = new C0620r();
        this.f483A = new C0612n(this);
        setNestedScrollingEnabled(true);
        AbstractC0605j0.m2269N(this, f481b);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f484B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f484B = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f484B;
    }

    /* renamed from: i */
    public static int m3328i(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: s */
    public static boolean m3318s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m3318s((View) parent, view2);
    }

    /* renamed from: A */
    public final void m3334A(View view) {
        view.getDrawingRect(this.f487e);
        offsetDescendantRectToMyCoords(view, this.f487e);
        int m3327j = m3327j(this.f487e);
        if (m3327j != 0) {
            scrollBy(0, m3327j);
        }
    }

    /* renamed from: B */
    public final void m3333B(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f486d > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f488f;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            m3312y(z);
        } else {
            if (!this.f488f.isFinished()) {
                m3330g();
            }
            scrollBy(i, i2);
        }
        this.f486d = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: C */
    public boolean m3332C(int i, int i2) {
        return this.f483A.m2218j(i, i2);
    }

    /* renamed from: D */
    public void m3331D(int i) {
        this.f483A.m2217k(i);
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: a */
    public void mo2216a(View view, View view2, int i, int i2) {
        C0620r c0620r = this.f508z;
        if (i2 == 1) {
            c0620r.f2779b = i;
        } else {
            c0620r.f2778a = i;
        }
        m3332C(2, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: b */
    public void mo2215b(View view, int i) {
        C0620r c0620r = this.f508z;
        if (i == 1) {
            c0620r.f2779b = 0;
        } else {
            c0620r.f2778a = 0;
        }
        this.f483A.m2217k(i);
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: c */
    public void mo2214c(View view, int i, int i2, int[] iArr, int i3) {
        m3326k(i, i2, iArr, null, i3);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f488f.isFinished()) {
            return;
        }
        this.f488f.computeScrollOffset();
        int currY = this.f488f.getCurrY();
        int i = currY - this.f506x;
        this.f506x = currY;
        int[] iArr = this.f504v;
        boolean z = false;
        iArr[1] = 0;
        m3326k(0, i, iArr, null, 1);
        int i2 = i - this.f504v[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m3314w(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f504v;
            iArr2[1] = 0;
            this.f483A.m2222f(0, scrollY2, 0, i3, this.f503u, 1, iArr2);
            i2 = i3 - this.f504v[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                m3323n();
                if (i2 < 0) {
                    if (this.f489g.isFinished()) {
                        edgeEffect = this.f489g;
                        edgeEffect.onAbsorb((int) this.f488f.getCurrVelocity());
                    }
                } else if (this.f490h.isFinished()) {
                    edgeEffect = this.f490h;
                    edgeEffect.onAbsorb((int) this.f488f.getCurrVelocity());
                }
            }
            m3330g();
        }
        if (!this.f488f.isFinished()) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
                return;
            } else {
                postInvalidate();
                return;
            }
        }
        this.f483A.m2217k(1);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // p010b.p046j.p058l.InterfaceC0616p
    /* renamed from: d */
    public void mo2204d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m3316u(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m3322o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f483A.m2227a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f483A.m2226b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m3326k(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f483A.m2223e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f489g != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f489g.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i2 >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f489g.setSize(width, height);
                if (this.f489g.draw(canvas)) {
                    AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                    if (i2 >= 16) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidate();
                    }
                }
                canvas.restoreToCount(save);
            }
            if (this.f490h.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i = 0 + getPaddingLeft();
            }
            if (i3 >= 21 && getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f490h.setSize(width2, height2);
            if (this.f490h.draw(canvas)) {
                AtomicInteger atomicInteger2 = AbstractC0605j0.f2748a;
                if (i3 >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: e */
    public void mo2213e(View view, int i, int i2, int i3, int i4, int i5) {
        m3316u(i4, i5, null);
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: f */
    public boolean mo2212f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: g */
    public final void m3330g() {
        this.f488f.abortAnimation();
        this.f483A.m2217k(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f508z.m2200a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean m3329h(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3317t(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3325l(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f487e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f487e);
            m3325l(m3327j(this.f487e));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!m3317t(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m3319r(0);
    }

    @Override // android.view.View, p010b.p046j.p058l.InterfaceC0610m
    public boolean isNestedScrollingEnabled() {
        return this.f483A.f2772d;
    }

    /* renamed from: j */
    public int m3327j(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: k */
    public boolean m3326k(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f483A.m2225c(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: l */
    public final void m3325l(int i) {
        if (i != 0) {
            if (this.f498p) {
                m3333B(0, i, 250, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: m */
    public final void m3324m() {
        this.f495m = false;
        m3313x();
        this.f483A.m2217k(0);
        EdgeEffect edgeEffect = this.f489g;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f490h.onRelease();
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m3323n() {
        if (getOverScrollMode() == 2) {
            this.f489g = null;
            this.f490h = null;
        } else if (this.f489g == null) {
            Context context = getContext();
            this.f489g = new EdgeEffect(context);
            this.f490h = new EdgeEffect(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m3322o(KeyEvent keyEvent) {
        boolean z;
        Rect rect;
        int i;
        this.f487e.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
                if (z) {
                    if (!isFocused() || keyEvent.getKeyCode() == 4) {
                        return false;
                    }
                    View findFocus = findFocus();
                    if (findFocus == this) {
                        findFocus = null;
                    }
                    View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                    return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
                } else if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return !keyEvent.isAltPressed() ? m3329h(33) : m3320q(33);
                    } else if (keyCode == 20) {
                        return !keyEvent.isAltPressed() ? m3329h(130) : m3320q(130);
                    } else if (keyCode != 62) {
                        return false;
                    } else {
                        int i2 = keyEvent.isShiftPressed() ? 33 : 130;
                        boolean z2 = i2 == 130;
                        int height = getHeight();
                        if (!z2) {
                            this.f487e.top = getScrollY() - height;
                            rect = this.f487e;
                            if (rect.top < 0) {
                                i = 0;
                                rect.top = i;
                            }
                            Rect rect2 = this.f487e;
                            int i3 = rect2.top;
                            int i4 = height + i3;
                            rect2.bottom = i4;
                            m3311z(i2, i3, i4);
                            return false;
                        }
                        this.f487e.top = getScrollY() + height;
                        int childCount = getChildCount();
                        if (childCount > 0) {
                            View childAt2 = getChildAt(childCount - 1);
                            int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                            rect = this.f487e;
                            if (rect.top + height > paddingBottom) {
                                i = paddingBottom - height;
                                rect.top = i;
                            }
                        }
                        Rect rect22 = this.f487e;
                        int i32 = rect22.top;
                        int i42 = height + i32;
                        rect22.bottom = i42;
                        m3311z(i2, i32, i42);
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f493k = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f495m) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        int action = motionEvent.getAction();
        if (action == 2 && this.f495m) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f502t;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.f491i) > this.f499q && (2 & getNestedScrollAxes()) == 0) {
                            this.f495m = true;
                            this.f491i = y;
                            if (this.f496n == null) {
                                this.f496n = VelocityTracker.obtain();
                            }
                            this.f496n.addMovement(motionEvent);
                            this.f505w = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m3315v(motionEvent);
                    }
                }
            }
            this.f495m = false;
            this.f502t = -1;
            m3313x();
            if (this.f488f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                if (Build.VERSION.SDK_INT >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            }
            this.f483A.m2217k(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    z = true;
                    if (z) {
                        this.f495m = false;
                        m3313x();
                    } else {
                        this.f491i = y2;
                        this.f502t = motionEvent.getPointerId(0);
                        VelocityTracker velocityTracker = this.f496n;
                        if (velocityTracker == null) {
                            this.f496n = VelocityTracker.obtain();
                        } else {
                            velocityTracker.clear();
                        }
                        this.f496n.addMovement(motionEvent);
                        this.f488f.computeScrollOffset();
                        this.f495m = !this.f488f.isFinished();
                        m3332C(2, 0);
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return this.f495m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f492j = false;
        View view = this.f494l;
        if (view != null && m3318s(view, this)) {
            m3334A(this.f494l);
        }
        this.f494l = null;
        if (!this.f493k) {
            if (this.f507y != null) {
                scrollTo(getScrollX(), this.f507y.f509b);
                this.f507y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m3328i = m3328i(scrollY, paddingTop, i5);
            if (m3328i != scrollY) {
                scrollTo(getScrollX(), m3328i);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f493k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f497o && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m3321p((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m3326k(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m3316u(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f508z.f2778a = i;
        m3332C(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || (true ^ m3317t(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f507y = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f509b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0643f interfaceC0643f = this.f485C;
        if (interfaceC0643f != null) {
            C0097e c0097e = (C0097e) interfaceC0643f;
            C0117o.m3067c(this, c0097e.f908a, c0097e.f909b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m3317t(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f487e);
        offsetDescendantRectToMyCoords(findFocus, this.f487e);
        m3325l(m3327j(this.f487e));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onStopNestedScroll(View view) {
        this.f508z.f2778a = 0;
        m3331D(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020b, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020d, code lost:
        postInvalidateOnAnimation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0211, code lost:
        postInvalidate();
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        if (this.f496n == null) {
            this.f496n = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f505w = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f505w);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f496n;
                velocityTracker.computeCurrentVelocity(1000, this.f501s);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f502t);
                if (Math.abs(yVelocity) >= this.f500r) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        m3321p(i);
                    }
                } else if (this.f488f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                }
                this.f502t = -1;
                m3324m();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f502t);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f491i - y;
                    if (!this.f495m && Math.abs(i2) > this.f499q) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f495m = true;
                        int i3 = this.f499q;
                        i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                    }
                    int i4 = i2;
                    if (this.f495m) {
                        if (m3326k(0, i4, this.f504v, this.f503u, 0)) {
                            i4 -= this.f504v[1];
                            this.f505w += this.f503u[1];
                        }
                        int i5 = i4;
                        this.f491i = y - this.f503u[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (m3314w(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0) && !m3319r(0)) {
                            this.f496n.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f504v;
                        iArr[1] = 0;
                        this.f483A.m2222f(0, scrollY2, 0, i5 - scrollY2, this.f503u, 0, iArr);
                        int i6 = this.f491i;
                        int[] iArr2 = this.f503u;
                        this.f491i = i6 - iArr2[1];
                        this.f505w += iArr2[1];
                        if (z) {
                            int i7 = i5 - this.f504v[1];
                            m3323n();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                AbstractC0022t.m3512V(this.f489g, i7 / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                if (!this.f490h.isFinished()) {
                                    edgeEffect = this.f490h;
                                    edgeEffect.onRelease();
                                }
                                edgeEffect2 = this.f489g;
                                if (edgeEffect2 != null && (!edgeEffect2.isFinished() || !this.f490h.isFinished())) {
                                    AtomicInteger atomicInteger2 = AbstractC0605j0.f2748a;
                                    if (Build.VERSION.SDK_INT < 16) {
                                        postInvalidateOnAnimation();
                                    } else {
                                        postInvalidate();
                                    }
                                }
                            } else {
                                if (i8 > scrollRange) {
                                    AbstractC0022t.m3512V(this.f490h, i7 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                    if (!this.f489g.isFinished()) {
                                        edgeEffect = this.f489g;
                                        edgeEffect.onRelease();
                                    }
                                }
                                edgeEffect2 = this.f489g;
                                if (edgeEffect2 != null) {
                                    AtomicInteger atomicInteger22 = AbstractC0605j0.f2748a;
                                    if (Build.VERSION.SDK_INT < 16) {
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f495m && getChildCount() > 0 && this.f488f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    AtomicInteger atomicInteger3 = AbstractC0605j0.f2748a;
                }
                this.f502t = -1;
                m3324m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f491i = (int) motionEvent.getY(actionIndex);
                this.f502t = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m3315v(motionEvent);
                this.f491i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f502t));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f488f.isFinished();
            this.f495m = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f488f.isFinished()) {
                m3330g();
            }
            this.f491i = (int) motionEvent.getY();
            this.f502t = motionEvent.getPointerId(0);
            m3332C(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f496n;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public void m3321p(int i) {
        if (getChildCount() > 0) {
            this.f488f.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3312y(true);
        }
    }

    /* renamed from: q */
    public boolean m3320q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f487e;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f487e.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f487e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f487e;
        return m3311z(i, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean m3319r(int i) {
        return this.f483A.m2221g(i) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f492j) {
            this.f494l = view2;
        } else {
            m3334A(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m3327j = m3327j(rect);
        boolean z2 = m3327j != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m3327j);
            } else {
                m3333B(0, m3327j, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3313x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f492j = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int m3328i = m3328i(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int m3328i2 = m3328i(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (m3328i == getScrollX() && m3328i2 == getScrollY()) {
                return;
            }
            super.scrollTo(m3328i, m3328i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f497o) {
            this.f497o = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f483A.m2219i(z);
    }

    public void setOnScrollChangeListener(InterfaceC0643f interfaceC0643f) {
        this.f485C = interfaceC0643f;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f498p = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f483A.m2218j(i, 0);
    }

    @Override // android.view.View, p010b.p046j.p058l.InterfaceC0610m
    public void stopNestedScroll() {
        this.f483A.m2217k(0);
    }

    /* renamed from: t */
    public final boolean m3317t(View view, int i, int i2) {
        view.getDrawingRect(this.f487e);
        offsetDescendantRectToMyCoords(view, this.f487e);
        return this.f487e.bottom + i >= getScrollY() && this.f487e.top - i <= getScrollY() + i2;
    }

    /* renamed from: u */
    public final void m3316u(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f483A.m2224d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: v */
    public final void m3315v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f502t) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f491i = (int) motionEvent.getY(i);
            this.f502t = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f496n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m3314w(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
        } else if (i9 >= i13) {
            z = false;
            if (i11 <= i16) {
                i11 = i16;
            } else if (i11 >= i15) {
                z2 = false;
                if (z2 && !m3319r(1)) {
                    this.f488f.springBack(i9, i11, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i9, i11, z, z2);
                return !z || z2;
            } else {
                i11 = i15;
            }
            z2 = true;
            if (z2) {
                this.f488f.springBack(i9, i11, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i9, i11, z, z2);
            if (z) {
            }
        } else {
            i9 = i13;
        }
        z = true;
        if (i11 <= i16) {
        }
        z2 = true;
        if (z2) {
        }
        onOverScrolled(i9, i11, z, z2);
        if (z) {
        }
    }

    /* renamed from: x */
    public final void m3313x() {
        VelocityTracker velocityTracker = this.f496n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f496n = null;
        }
    }

    /* renamed from: y */
    public final void m3312y(boolean z) {
        if (z) {
            m3332C(2, 1);
        } else {
            this.f483A.m2217k(1);
        }
        this.f506x = getScrollY();
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            postInvalidate();
        }
    }

    /* renamed from: z */
    public final boolean m3311z(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3325l(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }
}