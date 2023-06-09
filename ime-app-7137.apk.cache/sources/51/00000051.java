package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0177c0;
import p010b.p016c.p024p.p025m.InterfaceC0183f0;
import p010b.p016c.p024p.p025m.InterfaceC0197n;
import p010b.p016c.p024p.p025m.InterfaceC0198o;
import p010b.p016c.p026q.AbstractC0257h4;
import p010b.p016c.p026q.AbstractC0340y1;
import p010b.p016c.p026q.C0278m;
import p010b.p016c.p026q.C0298q;
import p010b.p016c.p026q.C0308s;
import p010b.p016c.p026q.C0313t;
import p010b.p016c.p026q.C0318u;
import p010b.p016c.p026q.C0335x1;
import p010b.p016c.p026q.InterfaceC0303r;
import p010b.p016c.p026q.InterfaceC0323v;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0340y1 implements InterfaceC0198o, InterfaceC0183f0 {

    /* renamed from: A */
    public int f230A;

    /* renamed from: B */
    public InterfaceC0323v f231B;

    /* renamed from: q */
    public C0199p f232q;

    /* renamed from: r */
    public Context f233r;

    /* renamed from: s */
    public int f234s;

    /* renamed from: t */
    public boolean f235t;

    /* renamed from: u */
    public C0298q f236u;

    /* renamed from: v */
    public InterfaceC0177c0 f237v;

    /* renamed from: w */
    public InterfaceC0197n f238w;

    /* renamed from: x */
    public boolean f239x;

    /* renamed from: y */
    public int f240y;

    /* renamed from: z */
    public int f241z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f241z = (int) (56.0f * f);
        this.f230A = (int) (f * 4.0f);
        this.f233r = context;
        this.f234s = 0;
    }

    /* renamed from: t */
    public static int m3423t(View view, int i, int i2, int i3, int i4) {
        C0313t c0313t = (C0313t) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m3451e();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!c0313t.f1763a && z2) {
            z = true;
        }
        c0313t.f1766d = z;
        c0313t.f1764b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0198o
    /* renamed from: a */
    public boolean mo2939a(C0202s c0202s) {
        return this.f232q.m2920s(c0202s, null, 0);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0183f0
    /* renamed from: b */
    public void mo274b(C0199p c0199p) {
        this.f232q = c0199p;
    }

    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0313t;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0313t(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f232q == null) {
            Context context = getContext();
            C0199p c0199p = new C0199p(context);
            this.f232q = c0199p;
            c0199p.f1376f = new C0318u(this);
            C0298q c0298q = new C0298q(context);
            this.f236u = c0298q;
            c0298q.f1715n = true;
            c0298q.f1716o = true;
            InterfaceC0177c0 interfaceC0177c0 = this.f237v;
            if (interfaceC0177c0 == null) {
                interfaceC0177c0 = new C0308s();
            }
            c0298q.f1707f = interfaceC0177c0;
            this.f232q.m2937b(c0298q, this.f233r);
            C0298q c0298q2 = this.f236u;
            c0298q2.f1710i = this;
            this.f232q = c0298q2.f1705d;
        }
        return this.f232q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0298q c0298q = this.f236u;
        C0278m c0278m = c0298q.f1712k;
        if (c0278m != null) {
            return c0278m.getDrawable();
        }
        if (c0298q.f1714m) {
            return c0298q.f1713l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f234s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p010b.p016c.p026q.AbstractC0340y1
    /* renamed from: i */
    public C0335x1 mo2715i(AttributeSet attributeSet) {
        return new C0313t(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0298q c0298q = this.f236u;
        if (c0298q != null) {
            c0298q.mo640n(false);
            if (this.f236u.m2760p()) {
                this.f236u.m2763k();
                this.f236u.m2759q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0298q c0298q = this.f236u;
        if (c0298q != null) {
            c0298q.m2765b();
        }
    }

    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f239x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m2817a = AbstractC0257h4.m2817a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0313t c0313t = (C0313t) childAt.getLayoutParams();
                if (c0313t.f1763a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m3424s(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2817a) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0313t).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0313t).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0313t).leftMargin) + ((LinearLayout.LayoutParams) c0313t).rightMargin;
                    m3424s(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m2817a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0313t c0313t2 = (C0313t) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0313t2.f1763a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0313t2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0313t2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0313t c0313t3 = (C0313t) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0313t3.f1763a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0313t3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0313t3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ?? r3;
        C0199p c0199p;
        boolean z3 = this.f239x;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f239x = z4;
        if (z3 != z4) {
            this.f240y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f239x && (c0199p = this.f232q) != null && size != this.f240y) {
            this.f240y = size;
            c0199p.m2922q(true);
        }
        int childCount = getChildCount();
        if (!this.f239x || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0313t c0313t = (C0313t) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0313t).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0313t).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f241z;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z5 = false;
        long j = 0;
        while (i17 < childCount2) {
            View childAt = getChildAt(i17);
            int i18 = size3;
            int i19 = i8;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i20 = i13 + 1;
                if (z6) {
                    int i21 = this.f230A;
                    i6 = i20;
                    r3 = 0;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i6 = i20;
                    r3 = 0;
                }
                C0313t c0313t2 = (C0313t) childAt.getLayoutParams();
                c0313t2.f1768f = r3;
                c0313t2.f1765c = r3;
                c0313t2.f1764b = r3;
                c0313t2.f1766d = r3;
                ((LinearLayout.LayoutParams) c0313t2).leftMargin = r3;
                ((LinearLayout.LayoutParams) c0313t2).rightMargin = r3;
                c0313t2.f1767e = z6 && ((ActionMenuItemView) childAt).m3451e();
                int m3423t = m3423t(childAt, i12, c0313t2.f1763a ? 1 : i10, childMeasureSpec, paddingBottom);
                i15 = Math.max(i15, m3423t);
                if (c0313t2.f1766d) {
                    i16++;
                }
                if (c0313t2.f1763a) {
                    z5 = true;
                }
                i10 -= m3423t;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (m3423t == 1) {
                    j |= 1 << i17;
                }
                i13 = i6;
            }
            i17++;
            size3 = i18;
            i8 = i19;
        }
        int i22 = i8;
        int i23 = size3;
        boolean z7 = z5 && i13 == 2;
        boolean z8 = false;
        while (i16 > 0 && i10 > 0) {
            int i24 = Integer.MAX_VALUE;
            int i25 = 0;
            int i26 = 0;
            long j2 = 0;
            while (i25 < childCount2) {
                int i27 = i14;
                C0313t c0313t3 = (C0313t) getChildAt(i25).getLayoutParams();
                boolean z9 = z8;
                if (c0313t3.f1766d) {
                    int i28 = c0313t3.f1764b;
                    if (i28 < i24) {
                        j2 = 1 << i25;
                        i24 = i28;
                        i26 = 1;
                    } else if (i28 == i24) {
                        i26++;
                        j2 |= 1 << i25;
                    }
                }
                i25++;
                z8 = z9;
                i14 = i27;
            }
            i3 = i14;
            z = z8;
            j |= j2;
            if (i26 > i10) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C0313t c0313t4 = (C0313t) childAt2.getLayoutParams();
                int i31 = i16;
                long j3 = 1 << i30;
                if ((j2 & j3) == 0) {
                    if (c0313t4.f1764b == i29) {
                        j |= j3;
                    }
                    z2 = z7;
                } else {
                    if (z7 && c0313t4.f1767e && i10 == 1) {
                        int i32 = this.f230A;
                        z2 = z7;
                        childAt2.setPadding(i32 + i12, 0, i32, 0);
                    } else {
                        z2 = z7;
                    }
                    c0313t4.f1764b++;
                    c0313t4.f1768f = true;
                    i10--;
                }
                i30++;
                i16 = i31;
                z7 = z2;
            }
            i14 = i3;
            z8 = true;
        }
        i3 = i14;
        z = z8;
        boolean z10 = !z5 && i13 == 1;
        if (i10 > 0 && j != 0 && (i10 < i13 - 1 || z10 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0313t) getChildAt(0).getLayoutParams()).f1767e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((C0313t) getChildAt(i33).getLayoutParams()).f1767e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : 0;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    C0313t c0313t5 = (C0313t) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0313t5.f1765c = i34;
                        c0313t5.f1768f = true;
                        if (i35 == 0 && !c0313t5.f1767e) {
                            ((LinearLayout.LayoutParams) c0313t5).leftMargin = (-i34) / 2;
                        }
                    } else if (c0313t5.f1763a) {
                        c0313t5.f1765c = i34;
                        c0313t5.f1768f = true;
                        ((LinearLayout.LayoutParams) c0313t5).rightMargin = (-i34) / 2;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) c0313t5).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0313t5).rightMargin = i34 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                C0313t c0313t6 = (C0313t) childAt4.getLayoutParams();
                if (c0313t6.f1768f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0313t6.f1764b * i12) + c0313t6.f1765c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i22;
            i4 = i3;
        } else {
            i4 = i23;
            i5 = i22;
        }
        setMeasuredDimension(i5, i4);
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // p010b.p016c.p026q.AbstractC0340y1
    /* renamed from: q */
    public C0313t mo2716h() {
        C0313t c0313t = new C0313t(-2, -2);
        ((LinearLayout.LayoutParams) c0313t).gravity = 16;
        return c0313t;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // p010b.p016c.p026q.AbstractC0340y1
    /* renamed from: r */
    public C0313t mo2714j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C0313t c0313t = layoutParams instanceof C0313t ? new C0313t((C0313t) layoutParams) : new C0313t(layoutParams);
            if (((LinearLayout.LayoutParams) c0313t).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0313t).gravity = 16;
            }
            return c0313t;
        }
        return mo2716h();
    }

    /* renamed from: s */
    public boolean m3424s(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0303r)) {
            z = false | ((InterfaceC0303r) childAt).mo2739a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0303r)) ? z : z | ((InterfaceC0303r) childAt2).mo2738b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f236u.f1720s = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0323v interfaceC0323v) {
        this.f231B = interfaceC0323v;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0298q c0298q = this.f236u;
        C0278m c0278m = c0298q.f1712k;
        if (c0278m != null) {
            c0278m.setImageDrawable(drawable);
            return;
        }
        c0298q.f1714m = true;
        c0298q.f1713l = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f235t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f234s != i) {
            this.f234s = i;
            if (i == 0) {
                this.f233r = getContext();
            } else {
                this.f233r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0298q c0298q) {
        this.f236u = c0298q;
        c0298q.f1710i = this;
        this.f232q = c0298q.f1705d;
    }
}