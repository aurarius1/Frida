package com.astuetz;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p010b.p046j.p057k.C0561b;
import p010b.p091z.p092a.AbstractC1110a;
import p010b.p091z.p092a.AbstractC1123n;
import p010b.p091z.p092a.InterfaceC1119j;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p135c.C1772d;
import p093c.p135c.C1773e;
import p093c.p135c.C1774f;
import p093c.p135c.InterfaceC1771c;
import p093c.p135c.View$OnClickListenerC1769a;
import p093c.p135c.ViewTreeObserver$OnGlobalLayoutListenerC1770b;
import p093c.p135c.p136g.AbstractC1775a;
import p093c.p135c.p136g.AbstractC1776b;
import p093c.p135c.p136g.AbstractC1777c;
import p093c.p135c.p136g.AbstractC1778d;

/* loaded from: classes.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: b */
    public static final int[] f6605b = {16842806, 16842965, 16842966, 16842968};

    /* renamed from: A */
    public boolean f6606A;

    /* renamed from: B */
    public boolean f6607B;

    /* renamed from: C */
    public boolean f6608C;

    /* renamed from: D */
    public Typeface f6609D;

    /* renamed from: E */
    public int f6610E;

    /* renamed from: F */
    public int f6611F;

    /* renamed from: G */
    public int f6612G;

    /* renamed from: H */
    public int f6613H;

    /* renamed from: I */
    public ViewTreeObserver.OnGlobalLayoutListener f6614I;

    /* renamed from: c */
    public LinearLayout f6615c;

    /* renamed from: d */
    public LinearLayout.LayoutParams f6616d;

    /* renamed from: e */
    public final C1773e f6617e;

    /* renamed from: f */
    public final C1772d f6618f;

    /* renamed from: g */
    public InterfaceC1771c f6619g;

    /* renamed from: h */
    public InterfaceC1119j f6620h;

    /* renamed from: i */
    public AbstractC1123n f6621i;

    /* renamed from: j */
    public int f6622j;

    /* renamed from: k */
    public int f6623k;

    /* renamed from: l */
    public float f6624l;

    /* renamed from: m */
    public Paint f6625m;

    /* renamed from: n */
    public Paint f6626n;

    /* renamed from: o */
    public int f6627o;

    /* renamed from: p */
    public int f6628p;

    /* renamed from: q */
    public int f6629q;

    /* renamed from: r */
    public int f6630r;

    /* renamed from: s */
    public int f6631s;

    /* renamed from: t */
    public int f6632t;

    /* renamed from: u */
    public int f6633u;

    /* renamed from: v */
    public int f6634v;

    /* renamed from: w */
    public int f6635w;

    /* renamed from: x */
    public ColorStateList f6636x;

    /* renamed from: y */
    public int f6637y;

    /* renamed from: z */
    public int f6638z;

    /* loaded from: classes.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C1774f();

        /* renamed from: b */
        public int f6639b;

        public SavedState(Parcel parcel, View$OnClickListenerC1769a view$OnClickListenerC1769a) {
            super(parcel);
            this.f6639b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6639b);
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f6617e = new C1773e(this, null);
        this.f6618f = new C1772d(this, null);
        this.f6619g = null;
        this.f6623k = 0;
        this.f6624l = 0.0f;
        this.f6628p = 2;
        this.f6629q = 0;
        this.f6631s = 0;
        this.f6632t = 0;
        this.f6634v = 12;
        this.f6635w = 14;
        this.f6636x = null;
        this.f6637y = 0;
        this.f6638z = 0;
        this.f6606A = false;
        this.f6607B = false;
        this.f6608C = true;
        this.f6609D = null;
        this.f6610E = 1;
        this.f6612G = 0;
        this.f6613H = AbstractC1775a.psts_background_tab;
        this.f6614I = new ViewTreeObserver$OnGlobalLayoutListenerC1770b(this);
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f6615c = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.f6615c);
        Paint paint = new Paint();
        this.f6625m = paint;
        paint.setAntiAlias(true);
        this.f6625m.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f6611F = (int) TypedValue.applyDimension(1, this.f6611F, displayMetrics);
        this.f6628p = (int) TypedValue.applyDimension(1, this.f6628p, displayMetrics);
        this.f6629q = (int) TypedValue.applyDimension(1, this.f6629q, displayMetrics);
        this.f6632t = (int) TypedValue.applyDimension(1, this.f6632t, displayMetrics);
        this.f6634v = (int) TypedValue.applyDimension(1, this.f6634v, displayMetrics);
        this.f6631s = (int) TypedValue.applyDimension(1, this.f6631s, displayMetrics);
        this.f6635w = (int) TypedValue.applyDimension(2, this.f6635w, displayMetrics);
        Paint paint2 = new Paint();
        this.f6626n = paint2;
        paint2.setAntiAlias(true);
        this.f6626n.setStrokeWidth(this.f6631s);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6605b);
        int color = obtainStyledAttributes.getColor(0, getResources().getColor(17170444));
        this.f6630r = color;
        this.f6633u = color;
        this.f6627o = color;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f6637y = dimensionPixelSize > 0 ? dimensionPixelSize : obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f6638z = dimensionPixelSize <= 0 ? obtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6610E = 0;
            str = "sans-serif-medium";
        } else {
            str = "sans-serif";
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1778d.PagerSlidingTabStrip);
        this.f6627o = obtainStyledAttributes2.getColor(AbstractC1778d.PagerSlidingTabStrip_pstsIndicatorColor, this.f6627o);
        this.f6628p = obtainStyledAttributes2.getDimensionPixelSize(AbstractC1778d.PagerSlidingTabStrip_pstsIndicatorHeight, this.f6628p);
        this.f6630r = obtainStyledAttributes2.getColor(AbstractC1778d.PagerSlidingTabStrip_pstsUnderlineColor, this.f6630r);
        this.f6629q = obtainStyledAttributes2.getDimensionPixelSize(AbstractC1778d.PagerSlidingTabStrip_pstsUnderlineHeight, this.f6629q);
        this.f6633u = obtainStyledAttributes2.getColor(AbstractC1778d.PagerSlidingTabStrip_pstsDividerColor, this.f6633u);
        this.f6631s = obtainStyledAttributes2.getDimensionPixelSize(AbstractC1778d.PagerSlidingTabStrip_pstsDividerWidth, this.f6631s);
        this.f6632t = obtainStyledAttributes2.getDimensionPixelSize(AbstractC1778d.PagerSlidingTabStrip_pstsDividerPadding, this.f6632t);
        this.f6606A = obtainStyledAttributes2.getBoolean(AbstractC1778d.PagerSlidingTabStrip_pstsShouldExpand, this.f6606A);
        this.f6611F = obtainStyledAttributes2.getDimensionPixelSize(AbstractC1778d.PagerSlidingTabStrip_pstsScrollOffset, this.f6611F);
        this.f6607B = obtainStyledAttributes2.getBoolean(AbstractC1778d.PagerSlidingTabStrip_pstsPaddingMiddle, this.f6607B);
        this.f6634v = obtainStyledAttributes2.getDimensionPixelSize(AbstractC1778d.PagerSlidingTabStrip_pstsTabPaddingLeftRight, this.f6634v);
        this.f6613H = obtainStyledAttributes2.getResourceId(AbstractC1778d.PagerSlidingTabStrip_pstsTabBackground, this.f6613H);
        this.f6635w = obtainStyledAttributes2.getDimensionPixelSize(AbstractC1778d.PagerSlidingTabStrip_pstsTabTextSize, this.f6635w);
        int i = AbstractC1778d.PagerSlidingTabStrip_pstsTabTextColor;
        this.f6636x = obtainStyledAttributes2.hasValue(i) ? obtainStyledAttributes2.getColorStateList(i) : null;
        this.f6610E = obtainStyledAttributes2.getInt(AbstractC1778d.PagerSlidingTabStrip_pstsTabTextStyle, this.f6610E);
        this.f6608C = obtainStyledAttributes2.getBoolean(AbstractC1778d.PagerSlidingTabStrip_pstsTabTextAllCaps, this.f6608C);
        int i2 = obtainStyledAttributes2.getInt(AbstractC1778d.PagerSlidingTabStrip_pstsTabTextAlpha, 150);
        String string = obtainStyledAttributes2.getString(AbstractC1778d.PagerSlidingTabStrip_pstsTabTextFontFamily);
        obtainStyledAttributes2.recycle();
        if (this.f6636x == null) {
            this.f6636x = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842913}, new int[0]}, new int[]{color, color, Color.argb(i2, Color.red(color), Color.green(color), Color.blue(color))});
        }
        this.f6609D = Typeface.create(string != null ? string : str, this.f6610E);
        int i3 = this.f6628p;
        int i4 = this.f6629q;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i3 < i4 ? i4 : i3);
        this.f6616d = this.f6606A ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
    }

    /* renamed from: a */
    public static void m368a(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        if (pagerSlidingTabStrip.f6622j == 0) {
            return;
        }
        int left = pagerSlidingTabStrip.f6615c.getChildAt(i).getLeft() + i2;
        if (i > 0 || i2 > 0) {
            int i3 = left - pagerSlidingTabStrip.f6611F;
            C0561b indicatorCoordinates = pagerSlidingTabStrip.getIndicatorCoordinates();
            left = (int) (((((Float) indicatorCoordinates.f2655b).floatValue() - ((Float) indicatorCoordinates.f2654a).floatValue()) / 2.0f) + i3);
        }
        if (left != pagerSlidingTabStrip.f6612G) {
            pagerSlidingTabStrip.f6612G = left;
            pagerSlidingTabStrip.scrollTo(left, 0);
        }
    }

    /* renamed from: b */
    public static void m367b(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        int i2 = 0;
        while (i2 < pagerSlidingTabStrip.f6622j) {
            View childAt = pagerSlidingTabStrip.f6615c.getChildAt(i2);
            if (i2 == i) {
                pagerSlidingTabStrip.m365d(childAt);
            } else {
                pagerSlidingTabStrip.m364e(childAt);
            }
            i2++;
        }
    }

    private C0561b getIndicatorCoordinates() {
        int i;
        View childAt = this.f6615c.getChildAt(this.f6623k);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f6624l > 0.0f && (i = this.f6623k) < this.f6622j - 1) {
            View childAt2 = this.f6615c.getChildAt(i + 1);
            float f = this.f6624l;
            left = AbstractC1124a.m1195a(1.0f, f, left, childAt2.getLeft() * f);
            right = AbstractC1124a.m1195a(1.0f, f, right, childAt2.getRight() * f);
        }
        return new C0561b(Float.valueOf(left), Float.valueOf(right));
    }

    /* renamed from: c */
    public void m366c() {
        this.f6615c.removeAllViews();
        this.f6622j = this.f6621i.getAdapter().mo1093c();
        for (int i = 0; i < this.f6622j; i++) {
            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC1777c.psts_tab, (ViewGroup) this, false);
            CharSequence mo1147e = this.f6621i.getAdapter().mo1147e(i);
            TextView textView = (TextView) inflate.findViewById(AbstractC1776b.psts_tab_title);
            if (textView != null && mo1147e != null) {
                textView.setText(mo1147e);
            }
            inflate.setFocusable(true);
            inflate.setOnClickListener(new View$OnClickListenerC1769a(this, i));
            this.f6615c.addView(inflate, i, this.f6616d);
        }
        m363f();
    }

    /* renamed from: d */
    public final void m365d(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(AbstractC1776b.psts_tab_title)) == null) {
            return;
        }
        textView.setSelected(true);
    }

    /* renamed from: e */
    public final void m364e(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(AbstractC1776b.psts_tab_title)) == null) {
            return;
        }
        textView.setSelected(false);
    }

    /* renamed from: f */
    public final void m363f() {
        for (int i = 0; i < this.f6622j; i++) {
            View childAt = this.f6615c.getChildAt(i);
            childAt.setBackgroundResource(this.f6613H);
            childAt.setPadding(this.f6634v, childAt.getPaddingTop(), this.f6634v, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(AbstractC1776b.psts_tab_title);
            if (textView != null) {
                textView.setTextColor(this.f6636x);
                textView.setTypeface(this.f6609D, this.f6610E);
                textView.setTextSize(0, this.f6635w);
                if (this.f6608C) {
                    textView.setAllCaps(true);
                }
            }
        }
    }

    public int getDividerColor() {
        return this.f6633u;
    }

    public int getDividerPadding() {
        return this.f6632t;
    }

    public int getDividerWidth() {
        return this.f6631s;
    }

    public int getIndicatorColor() {
        return this.f6627o;
    }

    public int getIndicatorHeight() {
        return this.f6628p;
    }

    public int getScrollOffset() {
        return this.f6611F;
    }

    public boolean getShouldExpand() {
        return this.f6606A;
    }

    public int getTabBackground() {
        return this.f6613H;
    }

    public int getTabPaddingLeftRight() {
        return this.f6634v;
    }

    public ColorStateList getTextColor() {
        return this.f6636x;
    }

    public int getTextSize() {
        return this.f6635w;
    }

    public int getUnderlineColor() {
        return this.f6630r;
    }

    public int getUnderlineHeight() {
        return this.f6629q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1123n abstractC1123n = this.f6621i;
        if (abstractC1123n == null || this.f6617e.f5449a) {
            return;
        }
        AbstractC1110a adapter = abstractC1123n.getAdapter();
        adapter.f4158a.registerObserver(this.f6617e);
        this.f6617e.f5449a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1123n abstractC1123n = this.f6621i;
        if (abstractC1123n == null || !this.f6617e.f5449a) {
            return;
        }
        AbstractC1110a adapter = abstractC1123n.getAdapter();
        adapter.f4158a.unregisterObserver(this.f6617e);
        this.f6617e.f5449a = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f6622j == 0) {
            return;
        }
        int height = getHeight();
        int i = this.f6631s;
        if (i > 0) {
            this.f6626n.setStrokeWidth(i);
            this.f6626n.setColor(this.f6633u);
            for (int i2 = 0; i2 < this.f6622j - 1; i2++) {
                View childAt = this.f6615c.getChildAt(i2);
                canvas.drawLine(childAt.getRight(), this.f6632t, childAt.getRight(), height - this.f6632t, this.f6626n);
            }
        }
        if (this.f6629q > 0) {
            this.f6625m.setColor(this.f6630r);
            canvas.drawRect(this.f6637y, height - this.f6629q, this.f6615c.getWidth() + this.f6638z, height, this.f6625m);
        }
        if (this.f6628p > 0) {
            this.f6625m.setColor(this.f6627o);
            C0561b indicatorCoordinates = getIndicatorCoordinates();
            canvas.drawRect(((Float) indicatorCoordinates.f2654a).floatValue() + this.f6637y, height - this.f6628p, ((Float) indicatorCoordinates.f2655b).floatValue() + this.f6637y, height, this.f6625m);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.f6607B;
        if (z2 || this.f6637y > 0 || this.f6638z > 0) {
            this.f6615c.setMinimumWidth(z2 ? getWidth() : (getWidth() - this.f6637y) - this.f6638z);
            setClipToPadding(false);
        }
        if (this.f6615c.getChildCount() > 0) {
            this.f6615c.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.f6614I);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f6639b;
        this.f6623k = i;
        if (i != 0 && this.f6615c.getChildCount() > 0) {
            m364e(this.f6615c.getChildAt(0));
            m365d(this.f6615c.getChildAt(this.f6623k));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6639b = this.f6623k;
        return savedState;
    }

    public void setAllCaps(boolean z) {
        this.f6608C = z;
    }

    public void setDividerColor(int i) {
        this.f6633u = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f6633u = getResources().getColor(i);
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.f6632t = i;
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.f6631s = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f6627o = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f6627o = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.f6628p = i;
        invalidate();
    }

    public void setOnPageChangeListener(InterfaceC1119j interfaceC1119j) {
        this.f6620h = interfaceC1119j;
    }

    public void setOnTabReselectedListener(InterfaceC1771c interfaceC1771c) {
        this.f6619g = interfaceC1771c;
    }

    public void setScrollOffset(int i) {
        this.f6611F = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f6606A = z;
        if (this.f6621i != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i) {
        this.f6613H = i;
    }

    public void setTabPaddingLeftRight(int i) {
        this.f6634v = i;
        m363f();
    }

    public void setTextColor(int i) {
        setTextColor(new ColorStateList(new int[][]{new int[0]}, new int[]{i}));
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f6636x = colorStateList;
        m363f();
    }

    public void setTextColorResource(int i) {
        setTextColor(getResources().getColor(i));
    }

    public void setTextColorStateListResource(int i) {
        setTextColor(getResources().getColorStateList(i));
    }

    public void setTextSize(int i) {
        this.f6635w = i;
        m363f();
    }

    public void setUnderlineColor(int i) {
        this.f6630r = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.f6630r = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.f6629q = i;
        invalidate();
    }

    public void setViewPager(AbstractC1123n abstractC1123n) {
        this.f6621i = abstractC1123n;
        if (abstractC1123n.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        abstractC1123n.getAdapter();
        abstractC1123n.setOnPageChangeListener(this.f6618f);
        AbstractC1110a adapter = abstractC1123n.getAdapter();
        adapter.f4158a.registerObserver(this.f6617e);
        this.f6617e.f5449a = true;
        m366c();
    }
}