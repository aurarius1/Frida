package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.c.q.y1 */
/* loaded from: classes.dex */
public abstract class AbstractC0340y1 extends ViewGroup {

    /* renamed from: b */
    public boolean f1813b;

    /* renamed from: c */
    public int f1814c;

    /* renamed from: d */
    public int f1815d;

    /* renamed from: e */
    public int f1816e;

    /* renamed from: f */
    public int f1817f;

    /* renamed from: g */
    public int f1818g;

    /* renamed from: h */
    public float f1819h;

    /* renamed from: i */
    public boolean f1820i;

    /* renamed from: j */
    public int[] f1821j;

    /* renamed from: k */
    public int[] f1822k;

    /* renamed from: l */
    public Drawable f1823l;

    /* renamed from: m */
    public int f1824m;

    /* renamed from: n */
    public int f1825n;

    /* renamed from: o */
    public int f1826o;

    /* renamed from: p */
    public int f1827p;

    public AbstractC0340y1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        this.f1813b = true;
        this.f1814c = -1;
        this.f1815d = 0;
        this.f1817f = 8388659;
        int[] iArr = AbstractC0084j.LinearLayoutCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC0605j0.m2270M(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = obtainStyledAttributes.getInt(AbstractC0084j.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(AbstractC0084j.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(AbstractC0084j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1819h = obtainStyledAttributes.getFloat(AbstractC0084j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1814c = obtainStyledAttributes.getInt(AbstractC0084j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1820i = obtainStyledAttributes.getBoolean(AbstractC0084j.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = AbstractC0084j.LinearLayoutCompat_divider;
        setDividerDrawable((!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) ? obtainStyledAttributes.getDrawable(i4) : AbstractC0142b.m3000b(context, resourceId));
        this.f1826o = obtainStyledAttributes.getInt(AbstractC0084j.LinearLayoutCompat_showDividers, 0);
        this.f1827p = obtainStyledAttributes.getDimensionPixelSize(AbstractC0084j.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0335x1;
    }

    /* renamed from: f */
    public void m2718f(Canvas canvas, int i) {
        this.f1823l.setBounds(getPaddingLeft() + this.f1827p, i, (getWidth() - getPaddingRight()) - this.f1827p, this.f1825n + i);
        this.f1823l.draw(canvas);
    }

    /* renamed from: g */
    public void m2717g(Canvas canvas, int i) {
        this.f1823l.setBounds(i, getPaddingTop() + this.f1827p, this.f1824m + i, (getHeight() - getPaddingBottom()) - this.f1827p);
        this.f1823l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1814c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1814c;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1814c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f1815d;
            if (this.f1816e == 1 && (i = this.f1817f & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1818g) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1818g;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((C0335x1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1814c;
    }

    public Drawable getDividerDrawable() {
        return this.f1823l;
    }

    public int getDividerPadding() {
        return this.f1827p;
    }

    public int getDividerWidth() {
        return this.f1824m;
    }

    public int getGravity() {
        return this.f1817f;
    }

    public int getOrientation() {
        return this.f1816e;
    }

    public int getShowDividers() {
        return this.f1826o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1819h;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public C0335x1 generateDefaultLayoutParams() {
        int i = this.f1816e;
        if (i == 0) {
            return new C0335x1(-2, -2);
        }
        if (i == 1) {
            return new C0335x1(-1, -2);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.view.ViewGroup
    /* renamed from: i */
    public C0335x1 generateLayoutParams(AttributeSet attributeSet) {
        return new C0335x1(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.view.ViewGroup
    /* renamed from: j */
    public C0335x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0335x1(layoutParams);
    }

    /* renamed from: k */
    public int m2713k() {
        return 0;
    }

    /* renamed from: l */
    public int m2712l() {
        return 0;
    }

    /* renamed from: m */
    public int m2711m() {
        return 0;
    }

    /* renamed from: n */
    public boolean m2710n(int i) {
        if (i == 0) {
            return (this.f1826o & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f1826o & 4) != 0;
        } else if ((this.f1826o & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: o */
    public void m2709o(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f1823l == null) {
            return;
        }
        int i2 = 0;
        if (this.f1816e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m2710n(i2)) {
                    m2718f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0335x1) childAt.getLayoutParams())).topMargin) - this.f1825n);
                }
                i2++;
            }
            if (m2710n(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2718f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1825n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0335x1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m2817a = AbstractC0257h4.m2817a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2710n(i2)) {
                C0335x1 c0335x1 = (C0335x1) childAt3.getLayoutParams();
                m2717g(canvas, m2817a ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0335x1).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0335x1).leftMargin) - this.f1824m);
            }
            i2++;
        }
        if (m2710n(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0335x1 c0335x12 = (C0335x1) childAt4.getLayoutParams();
                if (m2817a) {
                    left = childAt4.getLeft();
                    i = ((LinearLayout.LayoutParams) c0335x12).leftMargin;
                    right = (left - i) - this.f1824m;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0335x12).rightMargin;
                }
            } else if (m2817a) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.f1824m;
            }
            m2717g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int m2711m;
        int i16 = 8;
        int i17 = 5;
        if (this.f1816e == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.f1817f;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f1818g : getPaddingTop() + (((i4 - i2) - this.f1818g) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt == null) {
                    m2711m = m2708p() + paddingTop;
                } else if (childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0335x1 c0335x1 = (C0335x1) childAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) c0335x1).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    int m3460z = AbstractC0022t.m3460z(i23, AbstractC0605j0.m2241q(this)) & 7;
                    if (m3460z == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0335x1).leftMargin;
                    } else if (m3460z != i17) {
                        i15 = ((LinearLayout.LayoutParams) c0335x1).leftMargin + paddingLeft;
                        if (m2710n(i22)) {
                            paddingTop += this.f1825n;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) c0335x1).topMargin;
                        int m2712l = m2712l() + i24;
                        childAt.layout(i15, m2712l, measuredWidth + i15, measuredHeight + m2712l);
                        m2711m = m2711m() + measuredHeight + ((LinearLayout.LayoutParams) c0335x1).bottomMargin + i24;
                        i22 = m2713k() + i22;
                    } else {
                        i14 = paddingRight - measuredWidth;
                    }
                    i15 = i14 - ((LinearLayout.LayoutParams) c0335x1).rightMargin;
                    if (m2710n(i22)) {
                    }
                    int i242 = paddingTop + ((LinearLayout.LayoutParams) c0335x1).topMargin;
                    int m2712l2 = m2712l() + i242;
                    childAt.layout(i15, m2712l2, measuredWidth + i15, measuredHeight + m2712l2);
                    m2711m = m2711m() + measuredHeight + ((LinearLayout.LayoutParams) c0335x1).bottomMargin + i242;
                    i22 = m2713k() + i22;
                } else {
                    i22++;
                    i16 = 8;
                    i17 = 5;
                }
                paddingTop = m2711m;
                i22++;
                i16 = 8;
                i17 = 5;
            }
            return;
        }
        boolean m2817a = AbstractC0257h4.m2817a(this);
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.f1817f;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z3 = this.f1813b;
        int[] iArr = this.f1821j;
        int[] iArr2 = this.f1822k;
        int m3460z2 = AbstractC0022t.m3460z(i27, AbstractC0605j0.m2241q(this));
        int paddingLeft2 = m3460z2 != 1 ? m3460z2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f1818g : getPaddingLeft() + (((i3 - i) - this.f1818g) / 2);
        if (m2817a) {
            i7 = virtualChildCount2 - 1;
            i5 = 0;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
            i7 = 0;
        }
        while (i5 < virtualChildCount2) {
            int i29 = (i6 * i5) + i7;
            View childAt2 = getChildAt(i29);
            if (childAt2 == null) {
                paddingLeft2 = m2708p() + paddingLeft2;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                C0335x1 c0335x12 = (C0335x1) childAt2.getLayoutParams();
                i8 = virtualChildCount2;
                if (z3) {
                    i9 = i28;
                    if (((LinearLayout.LayoutParams) c0335x12).height != -1) {
                        i10 = childAt2.getBaseline();
                        i11 = ((LinearLayout.LayoutParams) c0335x12).gravity;
                        if (i11 < 0) {
                            i11 = i9;
                        }
                        i12 = i11 & 112;
                        z2 = z3;
                        if (i12 != 16) {
                            i13 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0335x12).topMargin) - ((LinearLayout.LayoutParams) c0335x12).bottomMargin;
                        } else if (i12 == 48) {
                            i13 = ((LinearLayout.LayoutParams) c0335x12).topMargin + paddingTop2;
                            if (i10 != -1) {
                                i13 = (iArr[1] - i10) + i13;
                            }
                        } else if (i12 != 80) {
                            i13 = paddingTop2;
                        } else {
                            i13 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c0335x12).bottomMargin;
                            if (i10 != -1) {
                                i13 -= iArr2[2] - (childAt2.getMeasuredHeight() - i10);
                            }
                        }
                        if (m2710n(i29)) {
                            paddingLeft2 += this.f1824m;
                        }
                        int i30 = paddingLeft2 + ((LinearLayout.LayoutParams) c0335x12).leftMargin;
                        int m2712l3 = m2712l() + i30;
                        childAt2.layout(m2712l3, i13, measuredWidth2 + m2712l3, measuredHeight2 + i13);
                        paddingLeft2 = i30 + m2711m() + measuredWidth2 + ((LinearLayout.LayoutParams) c0335x12).rightMargin;
                        i5 = m2713k() + i5;
                        i5++;
                        virtualChildCount2 = i8;
                        i28 = i9;
                        z3 = z2;
                    }
                } else {
                    i9 = i28;
                }
                i10 = -1;
                i11 = ((LinearLayout.LayoutParams) c0335x12).gravity;
                if (i11 < 0) {
                }
                i12 = i11 & 112;
                z2 = z3;
                if (i12 != 16) {
                }
                if (m2710n(i29)) {
                }
                int i302 = paddingLeft2 + ((LinearLayout.LayoutParams) c0335x12).leftMargin;
                int m2712l32 = m2712l() + i302;
                childAt2.layout(m2712l32, i13, measuredWidth2 + m2712l32, measuredHeight2 + i13);
                paddingLeft2 = i302 + m2711m() + measuredWidth2 + ((LinearLayout.LayoutParams) c0335x12).rightMargin;
                i5 = m2713k() + i5;
                i5++;
                virtualChildCount2 = i8;
                i28 = i9;
                z3 = z2;
            }
            i8 = virtualChildCount2;
            i9 = i28;
            z2 = z3;
            i5++;
            virtualChildCount2 = i8;
            i28 = i9;
            z3 = z2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c8, code lost:
        if (r13 < 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x075a, code lost:
        if (r7 < 0) goto L404;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        char c;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        char c2;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        int max;
        int i13;
        boolean z;
        int baseline;
        int measuredWidth;
        int i14;
        int i15;
        int i16;
        float f3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        boolean z3;
        C0335x1 c0335x1;
        boolean z4;
        int i22;
        boolean z5;
        int i23;
        int i24;
        int baseline2;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z6;
        int measuredHeight;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        C0335x1 c0335x12;
        boolean z7;
        int i35;
        boolean z8;
        int max2;
        int i36 = -2;
        int i37 = Integer.MIN_VALUE;
        int i38 = 8;
        float f4 = 0.0f;
        int i39 = 1073741824;
        if (this.f1816e == 1) {
            this.f1818g = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i40 = this.f1814c;
            boolean z9 = this.f1820i;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            float f5 = 0.0f;
            boolean z10 = false;
            int i46 = 0;
            boolean z11 = true;
            boolean z12 = false;
            while (i41 < virtualChildCount) {
                View childAt = getChildAt(i41);
                if (childAt == null) {
                    this.f1818g = m2708p() + this.f1818g;
                } else if (childAt.getVisibility() == i38) {
                    i41 += m2713k();
                } else {
                    if (m2710n(i41)) {
                        this.f1818g += this.f1825n;
                    }
                    C0335x1 c0335x13 = (C0335x1) childAt.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c0335x13).weight;
                    f5 += f6;
                    if (mode2 == i39 && ((LinearLayout.LayoutParams) c0335x13).height == 0 && f6 > f4) {
                        int i47 = this.f1818g;
                        this.f1818g = Math.max(i47, ((LinearLayout.LayoutParams) c0335x13).topMargin + i47 + ((LinearLayout.LayoutParams) c0335x13).bottomMargin);
                        i30 = i40;
                        i32 = mode2;
                        i33 = mode;
                        i34 = virtualChildCount;
                        c0335x12 = c0335x13;
                        z7 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) c0335x13).height != 0 || f6 <= f4) {
                            i29 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0335x13).height = i36;
                            i29 = 0;
                        }
                        if (f5 == f4) {
                            i31 = this.f1818g;
                            i30 = i40;
                        } else {
                            i30 = i40;
                            i31 = 0;
                        }
                        i32 = mode2;
                        i33 = mode;
                        i34 = virtualChildCount;
                        c0335x12 = c0335x13;
                        m2709o(childAt, i, 0, i2, i31);
                        if (i29 != i37) {
                            ((LinearLayout.LayoutParams) c0335x12).height = i29;
                        }
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int i48 = this.f1818g;
                        this.f1818g = Math.max(i48, m2711m() + i48 + measuredHeight2 + ((LinearLayout.LayoutParams) c0335x12).topMargin + ((LinearLayout.LayoutParams) c0335x12).bottomMargin);
                        int i49 = i43;
                        if (z9) {
                            i43 = Math.max(measuredHeight2, i49);
                        }
                        z7 = z10;
                    }
                    if (i30 >= 0 && i30 == i41 + 1) {
                        this.f1815d = this.f1818g;
                    }
                    if (i41 < i30 && ((LinearLayout.LayoutParams) c0335x12).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i35 = i33;
                    if (i35 == 1073741824 || ((LinearLayout.LayoutParams) c0335x12).width != -1) {
                        z8 = false;
                    } else {
                        z8 = true;
                        z12 = true;
                    }
                    int i50 = ((LinearLayout.LayoutParams) c0335x12).leftMargin + ((LinearLayout.LayoutParams) c0335x12).rightMargin;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i50;
                    max2 = Math.max(i45, measuredWidth2);
                    int combineMeasuredStates = View.combineMeasuredStates(i46, childAt.getMeasuredState());
                    boolean z13 = z11 && ((LinearLayout.LayoutParams) c0335x12).width == -1;
                    if (((LinearLayout.LayoutParams) c0335x12).weight > 0.0f) {
                        if (!z8) {
                            i50 = measuredWidth2;
                        }
                        i42 = Math.max(i42, i50);
                    } else {
                        int i51 = i42;
                        if (!z8) {
                            i50 = measuredWidth2;
                        }
                        i44 = Math.max(i44, i50);
                        i42 = i51;
                    }
                    i41 += m2713k();
                    z10 = z7;
                    z11 = z13;
                    i46 = combineMeasuredStates;
                    i41++;
                    mode = i35;
                    i45 = max2;
                    i40 = i30;
                    mode2 = i32;
                    virtualChildCount = i34;
                    i36 = -2;
                    i37 = Integer.MIN_VALUE;
                    i38 = 8;
                    f4 = 0.0f;
                    i39 = 1073741824;
                }
                i30 = i40;
                i32 = mode2;
                i35 = mode;
                i34 = virtualChildCount;
                max2 = i45;
                i41++;
                mode = i35;
                i45 = max2;
                i40 = i30;
                mode2 = i32;
                virtualChildCount = i34;
                i36 = -2;
                i37 = Integer.MIN_VALUE;
                i38 = 8;
                f4 = 0.0f;
                i39 = 1073741824;
            }
            int i52 = mode2;
            int i53 = mode;
            int i54 = virtualChildCount;
            int i55 = i42;
            int i56 = i43;
            int i57 = i44;
            int i58 = i45;
            int i59 = i46;
            if (this.f1818g > 0 && m2710n(i54)) {
                this.f1818g += this.f1825n;
            }
            int i60 = i52;
            if (z9 && (i60 == Integer.MIN_VALUE || i60 == 0)) {
                this.f1818g = 0;
                int i61 = 0;
                while (i61 < i54) {
                    View childAt2 = getChildAt(i61);
                    if (childAt2 == null) {
                        this.f1818g = m2708p() + this.f1818g;
                    } else if (childAt2.getVisibility() == 8) {
                        i61 += m2713k();
                    } else {
                        C0335x1 c0335x14 = (C0335x1) childAt2.getLayoutParams();
                        int i62 = this.f1818g;
                        this.f1818g = Math.max(i62, m2711m() + i62 + i56 + ((LinearLayout.LayoutParams) c0335x14).topMargin + ((LinearLayout.LayoutParams) c0335x14).bottomMargin);
                    }
                    i61++;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f1818g;
            this.f1818g = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i63 = (16777215 & resolveSizeAndState) - this.f1818g;
            if (z10 || (i63 != 0 && f5 > 0.0f)) {
                float f7 = this.f1819h;
                if (f7 > 0.0f) {
                    f5 = f7;
                }
                this.f1818g = 0;
                int i64 = 0;
                while (i64 < i54) {
                    View childAt3 = getChildAt(i64);
                    if (childAt3.getVisibility() == 8) {
                        i26 = i60;
                    } else {
                        C0335x1 c0335x15 = (C0335x1) childAt3.getLayoutParams();
                        float f8 = ((LinearLayout.LayoutParams) c0335x15).weight;
                        if (f8 > 0.0f) {
                            int i65 = (int) ((i63 * f8) / f5);
                            f5 -= f8;
                            int i66 = i63 - i65;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c0335x15).leftMargin + ((LinearLayout.LayoutParams) c0335x15).rightMargin, ((LinearLayout.LayoutParams) c0335x15).width);
                            if (((LinearLayout.LayoutParams) c0335x15).height == 0 && i60 == 1073741824) {
                                if (i65 > 0) {
                                    measuredHeight = i65;
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                                    i59 = View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                                    i63 = i66;
                                }
                                measuredHeight = 0;
                                childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                                i59 = View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                                i63 = i66;
                            } else {
                                measuredHeight = childAt3.getMeasuredHeight() + i65;
                            }
                        }
                        int i67 = ((LinearLayout.LayoutParams) c0335x15).leftMargin + ((LinearLayout.LayoutParams) c0335x15).rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth() + i67;
                        i58 = Math.max(i58, measuredWidth3);
                        i26 = i60;
                        if (i53 != 1073741824) {
                            i27 = i63;
                            i28 = -1;
                            if (((LinearLayout.LayoutParams) c0335x15).width == -1) {
                                z6 = true;
                                if (!z6) {
                                    i67 = measuredWidth3;
                                }
                                i57 = Math.max(i57, i67);
                                boolean z14 = !z11 && ((LinearLayout.LayoutParams) c0335x15).width == i28;
                                int i68 = this.f1818g;
                                this.f1818g = Math.max(i68, m2711m() + childAt3.getMeasuredHeight() + i68 + ((LinearLayout.LayoutParams) c0335x15).topMargin + ((LinearLayout.LayoutParams) c0335x15).bottomMargin);
                                z11 = z14;
                                i63 = i27;
                            }
                        } else {
                            i27 = i63;
                            i28 = -1;
                        }
                        z6 = false;
                        if (!z6) {
                        }
                        i57 = Math.max(i57, i67);
                        if (z11) {
                        }
                        int i682 = this.f1818g;
                        this.f1818g = Math.max(i682, m2711m() + childAt3.getMeasuredHeight() + i682 + ((LinearLayout.LayoutParams) c0335x15).topMargin + ((LinearLayout.LayoutParams) c0335x15).bottomMargin);
                        z11 = z14;
                        i63 = i27;
                    }
                    i64++;
                    i60 = i26;
                }
                this.f1818g = getPaddingBottom() + getPaddingTop() + this.f1818g;
            } else {
                i57 = Math.max(i57, i55);
                if (z9 && i60 != 1073741824) {
                    for (int i69 = 0; i69 < i54; i69++) {
                        View childAt4 = getChildAt(i69);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0335x1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                        }
                    }
                }
            }
            int i70 = i58;
            if (z11 || i53 == 1073741824) {
                i57 = i70;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i57, getSuggestedMinimumWidth()), i, i59), resolveSizeAndState);
            if (z12) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i71 = 0; i71 < i54; i71++) {
                    View childAt5 = getChildAt(i71);
                    if (childAt5.getVisibility() != 8) {
                        C0335x1 c0335x16 = (C0335x1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0335x16).width == -1) {
                            int i72 = ((LinearLayout.LayoutParams) c0335x16).height;
                            ((LinearLayout.LayoutParams) c0335x16).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i2, 0);
                            ((LinearLayout.LayoutParams) c0335x16).height = i72;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f1818g = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.f1821j == null || this.f1822k == null) {
            this.f1821j = new int[4];
            this.f1822k = new int[4];
        }
        int[] iArr = this.f1821j;
        int[] iArr2 = this.f1822k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.f1813b;
        boolean z16 = this.f1820i;
        boolean z17 = mode3 == 1073741824;
        int i73 = 0;
        float f9 = 0.0f;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        boolean z18 = false;
        boolean z19 = true;
        boolean z20 = false;
        while (i75 < virtualChildCount2) {
            View childAt6 = getChildAt(i75);
            if (childAt6 == null) {
                this.f1818g = m2708p() + this.f1818g;
                i15 = i73;
                i16 = i74;
            } else {
                i15 = i73;
                i16 = i74;
                if (childAt6.getVisibility() == 8) {
                    i75 += m2713k();
                } else {
                    if (m2710n(i75)) {
                        this.f1818g += this.f1824m;
                    }
                    C0335x1 c0335x17 = (C0335x1) childAt6.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) c0335x17).weight;
                    float f11 = f9 + f10;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0335x17).width == 0 && f10 > 0.0f) {
                        if (z17) {
                            i25 = i75;
                            this.f1818g = ((LinearLayout.LayoutParams) c0335x17).leftMargin + ((LinearLayout.LayoutParams) c0335x17).rightMargin + this.f1818g;
                        } else {
                            i25 = i75;
                            int i79 = this.f1818g;
                            this.f1818g = Math.max(i79, ((LinearLayout.LayoutParams) c0335x17).leftMargin + i79 + ((LinearLayout.LayoutParams) c0335x17).rightMargin);
                        }
                        if (z15) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c0335x1 = c0335x17;
                            i18 = i15;
                            i19 = i16;
                            i21 = i25;
                            z2 = z16;
                            z3 = z15;
                        } else {
                            c0335x1 = c0335x17;
                            i18 = i15;
                            i19 = i16;
                            i21 = i25;
                            i22 = 1073741824;
                            z2 = z16;
                            z3 = z15;
                            z4 = true;
                            if (mode4 == i22 && ((LinearLayout.LayoutParams) c0335x1).height == -1) {
                                z5 = true;
                                z20 = true;
                            } else {
                                z5 = false;
                            }
                            i23 = ((LinearLayout.LayoutParams) c0335x1).topMargin + ((LinearLayout.LayoutParams) c0335x1).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i23;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i77, childAt6.getMeasuredState());
                            if (z3 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i24 = i23;
                            } else {
                                int i80 = ((LinearLayout.LayoutParams) c0335x1).gravity;
                                if (i80 < 0) {
                                    i80 = this.f1817f;
                                }
                                int i81 = (((i80 & 112) >> 4) & (-2)) >> 1;
                                i24 = i23;
                                iArr[i81] = Math.max(iArr[i81], baseline2);
                                iArr2[i81] = Math.max(iArr2[i81], measuredHeight3 - baseline2);
                            }
                            int max3 = Math.max(i78, measuredHeight3);
                            boolean z21 = !z19 && ((LinearLayout.LayoutParams) c0335x1).height == -1;
                            if (((LinearLayout.LayoutParams) c0335x1).weight <= 0.0f) {
                                if (z5) {
                                    measuredHeight3 = i24;
                                }
                                i73 = Math.max(i18, measuredHeight3);
                            } else {
                                int i82 = i18;
                                if (z5) {
                                    measuredHeight3 = i24;
                                }
                                i19 = Math.max(i19, measuredHeight3);
                                i73 = i82;
                            }
                            i75 = m2713k() + i21;
                            i78 = max3;
                            i77 = combineMeasuredStates2;
                            z18 = z4;
                            z19 = z21;
                            f9 = f11;
                            i74 = i19;
                            i75++;
                            z16 = z2;
                            z15 = z3;
                        }
                    } else {
                        int i83 = i75;
                        if (((LinearLayout.LayoutParams) c0335x17).width == 0) {
                            f3 = 0.0f;
                            if (f10 > 0.0f) {
                                ((LinearLayout.LayoutParams) c0335x17).width = -2;
                                i17 = 0;
                                i18 = i15;
                                i19 = i16;
                                i20 = i17;
                                i21 = i83;
                                z2 = z16;
                                z3 = z15;
                                m2709o(childAt6, i, f11 != f3 ? this.f1818g : 0, i2, 0);
                                if (i20 == Integer.MIN_VALUE) {
                                    c0335x1 = c0335x17;
                                    ((LinearLayout.LayoutParams) c0335x1).width = i20;
                                } else {
                                    c0335x1 = c0335x17;
                                }
                                int measuredWidth4 = childAt6.getMeasuredWidth();
                                int i84 = this.f1818g;
                                if (z17) {
                                    this.f1818g = Math.max(i84, m2711m() + i84 + measuredWidth4 + ((LinearLayout.LayoutParams) c0335x1).leftMargin + ((LinearLayout.LayoutParams) c0335x1).rightMargin);
                                } else {
                                    this.f1818g = m2711m() + ((LinearLayout.LayoutParams) c0335x1).leftMargin + measuredWidth4 + ((LinearLayout.LayoutParams) c0335x1).rightMargin + i84;
                                }
                                if (z2) {
                                    i76 = Math.max(measuredWidth4, i76);
                                }
                            }
                        } else {
                            f3 = 0.0f;
                        }
                        i17 = Integer.MIN_VALUE;
                        i18 = i15;
                        i19 = i16;
                        i20 = i17;
                        i21 = i83;
                        z2 = z16;
                        z3 = z15;
                        m2709o(childAt6, i, f11 != f3 ? this.f1818g : 0, i2, 0);
                        if (i20 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth42 = childAt6.getMeasuredWidth();
                        int i842 = this.f1818g;
                        if (z17) {
                        }
                        if (z2) {
                        }
                    }
                    z4 = z18;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                    }
                    z5 = false;
                    i23 = ((LinearLayout.LayoutParams) c0335x1).topMargin + ((LinearLayout.LayoutParams) c0335x1).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i23;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i77, childAt6.getMeasuredState());
                    if (z3) {
                    }
                    i24 = i23;
                    int max32 = Math.max(i78, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) c0335x1).weight <= 0.0f) {
                    }
                    i75 = m2713k() + i21;
                    i78 = max32;
                    i77 = combineMeasuredStates22;
                    z18 = z4;
                    z19 = z21;
                    f9 = f11;
                    i74 = i19;
                    i75++;
                    z16 = z2;
                    z15 = z3;
                }
            }
            z3 = z15;
            i73 = i15;
            i74 = i16;
            z2 = z16;
            i75++;
            z16 = z2;
            z15 = z3;
        }
        boolean z22 = z16;
        boolean z23 = z15;
        int i85 = i74;
        int i86 = i73;
        int i87 = i85;
        if (this.f1818g > 0 && m2710n(virtualChildCount2)) {
            this.f1818g += this.f1824m;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] == -1) {
                i3 = i77;
                if (z22 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f1818g = 0;
                    i14 = 0;
                    while (i14 < virtualChildCount2) {
                        View childAt7 = getChildAt(i14);
                        if (childAt7 == null) {
                            this.f1818g = m2708p() + this.f1818g;
                        } else if (childAt7.getVisibility() == 8) {
                            i14 += m2713k();
                        } else {
                            C0335x1 c0335x18 = (C0335x1) childAt7.getLayoutParams();
                            int i88 = this.f1818g;
                            this.f1818g = z17 ? m2711m() + ((LinearLayout.LayoutParams) c0335x18).leftMargin + i76 + ((LinearLayout.LayoutParams) c0335x18).rightMargin + i88 : Math.max(i88, m2711m() + i88 + i76 + ((LinearLayout.LayoutParams) c0335x18).leftMargin + ((LinearLayout.LayoutParams) c0335x18).rightMargin);
                        }
                        i14++;
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f1818g;
                this.f1818g = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
                i4 = (16777215 & resolveSizeAndState2) - this.f1818g;
                if (!z18 || (i4 != 0 && f9 > 0.0f)) {
                    f = this.f1819h;
                    if (f > 0.0f) {
                        f9 = f;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f1818g = 0;
                    int i89 = i4;
                    i5 = i3;
                    int i90 = -1;
                    i6 = 0;
                    while (i6 < virtualChildCount2) {
                        View childAt8 = getChildAt(i6);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i9 = i89;
                            i10 = virtualChildCount2;
                        } else {
                            C0335x1 c0335x19 = (C0335x1) childAt8.getLayoutParams();
                            float f12 = ((LinearLayout.LayoutParams) c0335x19).weight;
                            if (f12 > 0.0f) {
                                i10 = virtualChildCount2;
                                int i91 = (int) ((i89 * f12) / f9);
                                float f13 = f9 - f12;
                                int i92 = i89 - i91;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c0335x19).topMargin + ((LinearLayout.LayoutParams) c0335x19).bottomMargin, ((LinearLayout.LayoutParams) c0335x19).height);
                                if (((LinearLayout.LayoutParams) c0335x19).width == 0 && mode3 == 1073741824) {
                                    if (i91 > 0) {
                                        measuredWidth = i91;
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec2);
                                        i5 = View.combineMeasuredStates(i5, childAt8.getMeasuredState() & (-16777216));
                                        f9 = f13;
                                        i11 = i92;
                                    }
                                    measuredWidth = 0;
                                    childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec2);
                                    i5 = View.combineMeasuredStates(i5, childAt8.getMeasuredState() & (-16777216));
                                    f9 = f13;
                                    i11 = i92;
                                } else {
                                    measuredWidth = childAt8.getMeasuredWidth() + i91;
                                }
                            } else {
                                i11 = i89;
                                i10 = virtualChildCount2;
                            }
                            if (z17) {
                                f2 = f9;
                                max = m2711m() + childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0335x19).leftMargin + ((LinearLayout.LayoutParams) c0335x19).rightMargin + this.f1818g;
                                i12 = i11;
                            } else {
                                f2 = f9;
                                int i93 = this.f1818g;
                                i12 = i11;
                                max = Math.max(i93, m2711m() + childAt8.getMeasuredWidth() + i93 + ((LinearLayout.LayoutParams) c0335x19).leftMargin + ((LinearLayout.LayoutParams) c0335x19).rightMargin);
                            }
                            this.f1818g = max;
                            boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0335x19).height == -1;
                            int i94 = ((LinearLayout.LayoutParams) c0335x19).topMargin + ((LinearLayout.LayoutParams) c0335x19).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i94;
                            i90 = Math.max(i90, measuredHeight4);
                            if (!z24) {
                                i94 = measuredHeight4;
                            }
                            i87 = Math.max(i87, i94);
                            if (z19) {
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) c0335x19).height == -1) {
                                    z = true;
                                    if (!z23 && (baseline = childAt8.getBaseline()) != i13) {
                                        int i95 = ((LinearLayout.LayoutParams) c0335x19).gravity;
                                        if (i95 < 0) {
                                            i95 = this.f1817f;
                                        }
                                        int i96 = (((i95 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i96] = Math.max(iArr[i96], baseline);
                                        iArr2[i96] = Math.max(iArr2[i96], measuredHeight4 - baseline);
                                    }
                                    z19 = z;
                                    i9 = i12;
                                    f9 = f2;
                                }
                            } else {
                                i13 = -1;
                            }
                            z = false;
                            if (!z23) {
                            }
                            z19 = z;
                            i9 = i12;
                            f9 = f2;
                        }
                        i6++;
                        i89 = i9;
                        virtualChildCount2 = i10;
                    }
                    i7 = i2;
                    i8 = virtualChildCount2;
                    this.f1818g = getPaddingRight() + getPaddingLeft() + this.f1818g;
                    if (iArr[1] != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c2 = 3;
                        if (iArr[3] == -1) {
                            i78 = i90;
                        }
                    } else {
                        c2 = 3;
                    }
                    i78 = Math.max(i90, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
                    if (!z19 || mode4 == 1073741824) {
                        i87 = i78;
                    }
                    setMeasuredDimension(((-16777216) & i5) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i87, getSuggestedMinimumHeight()), i7, i5 << 16));
                    if (z20) {
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        int i97 = i8;
                        for (int i98 = 0; i98 < i97; i98++) {
                            View childAt9 = getChildAt(i98);
                            if (childAt9.getVisibility() != 8) {
                                C0335x1 c0335x110 = (C0335x1) childAt9.getLayoutParams();
                                if (((LinearLayout.LayoutParams) c0335x110).height == -1) {
                                    int i99 = ((LinearLayout.LayoutParams) c0335x110).width;
                                    ((LinearLayout.LayoutParams) c0335x110).width = childAt9.getMeasuredWidth();
                                    measureChildWithMargins(childAt9, i, 0, makeMeasureSpec3, 0);
                                    ((LinearLayout.LayoutParams) c0335x110).width = i99;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                i87 = Math.max(i87, i86);
                if (z22 && mode3 != 1073741824) {
                    for (int i100 = 0; i100 < virtualChildCount2; i100++) {
                        View childAt10 = getChildAt(i100);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0335x1) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i7 = i2;
                i8 = virtualChildCount2;
                i5 = i3;
                if (!z19) {
                }
                i87 = i78;
                setMeasuredDimension(((-16777216) & i5) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i87, getSuggestedMinimumHeight()), i7, i5 << 16));
                if (z20) {
                }
            }
        } else {
            c = 3;
        }
        i3 = i77;
        i78 = Math.max(i78, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z22) {
            this.f1818g = 0;
            i14 = 0;
            while (i14 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f1818g;
        this.f1818g = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i4 = (16777215 & resolveSizeAndState22) - this.f1818g;
        if (z18) {
        }
        f = this.f1819h;
        if (f > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f1818g = 0;
        int i892 = i4;
        i5 = i3;
        int i902 = -1;
        i6 = 0;
        while (i6 < virtualChildCount2) {
        }
        i7 = i2;
        i8 = virtualChildCount2;
        this.f1818g = getPaddingRight() + getPaddingLeft() + this.f1818g;
        if (iArr[1] != -1) {
        }
        c2 = 3;
        i78 = Math.max(i902, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (!z19) {
        }
        i87 = i78;
        setMeasuredDimension(((-16777216) & i5) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i87, getSuggestedMinimumHeight()), i7, i5 << 16));
        if (z20) {
        }
    }

    /* renamed from: p */
    public int m2708p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.f1813b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1814c = i;
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("base aligned child index out of range (0, ");
        m1187i.append(getChildCount());
        m1187i.append(")");
        throw new IllegalArgumentException(m1187i.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1823l) {
            return;
        }
        this.f1823l = drawable;
        if (drawable != null) {
            this.f1824m = drawable.getIntrinsicWidth();
            this.f1825n = drawable.getIntrinsicHeight();
        } else {
            this.f1824m = 0;
            this.f1825n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1827p = i;
    }

    public void setGravity(int i) {
        if (this.f1817f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1817f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1817f;
        if ((8388615 & i3) != i2) {
            this.f1817f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1820i = z;
    }

    public void setOrientation(int i) {
        if (this.f1816e != i) {
            this.f1816e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1826o) {
            requestLayout();
        }
        this.f1826o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1817f;
        if ((i3 & 112) != i2) {
            this.f1817f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1819h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}