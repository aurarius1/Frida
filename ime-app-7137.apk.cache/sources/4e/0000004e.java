package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0183f0;
import p010b.p016c.p026q.AbstractC0257h4;
import p010b.p016c.p026q.C0210a;
import p010b.p016c.p026q.C0298q;
import p010b.p016c.p026q.View$OnClickListenerC0222c;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0615o0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: b */
    public final C0210a f177b;

    /* renamed from: c */
    public final Context f178c;

    /* renamed from: d */
    public ActionMenuView f179d;

    /* renamed from: e */
    public C0298q f180e;

    /* renamed from: f */
    public int f181f;

    /* renamed from: g */
    public C0615o0 f182g;

    /* renamed from: h */
    public boolean f183h;

    /* renamed from: i */
    public boolean f184i;

    /* renamed from: j */
    public CharSequence f185j;

    /* renamed from: k */
    public CharSequence f186k;

    /* renamed from: l */
    public View f187l;

    /* renamed from: m */
    public View f188m;

    /* renamed from: n */
    public View f189n;

    /* renamed from: o */
    public LinearLayout f190o;

    /* renamed from: p */
    public TextView f191p;

    /* renamed from: q */
    public TextView f192q;

    /* renamed from: r */
    public int f193r;

    /* renamed from: s */
    public int f194s;

    /* renamed from: t */
    public boolean f195t;

    /* renamed from: u */
    public int f196u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int resourceId;
        int i = AbstractC0075a.actionModeStyle;
        this.f177b = new C0210a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC0075a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f178c = context;
        } else {
            this.f178c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.ActionMode, i, 0);
        int i2 = AbstractC0084j.ActionMode_background;
        Drawable drawable = (!obtainStyledAttributes.hasValue(i2) || (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) == 0) ? obtainStyledAttributes.getDrawable(i2) : AbstractC0142b.m3000b(context, resourceId);
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
        this.f193r = obtainStyledAttributes.getResourceId(AbstractC0084j.ActionMode_titleTextStyle, 0);
        this.f194s = obtainStyledAttributes.getResourceId(AbstractC0084j.ActionMode_subtitleTextStyle, 0);
        this.f181f = obtainStyledAttributes.getLayoutDimension(AbstractC0084j.ActionMode_height, 0);
        this.f196u = obtainStyledAttributes.getResourceId(AbstractC0084j.ActionMode_closeItemLayout, AbstractC0081g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m3441c(AbstractC0161b abstractC0161b) {
        View view;
        C0298q c0298q;
        InterfaceC0183f0 interfaceC0183f0;
        InterfaceC0183f0 interfaceC0183f02;
        View view2 = this.f187l;
        if (view2 != null) {
            if (view2.getParent() == null) {
                view = this.f187l;
            }
            View findViewById = this.f187l.findViewById(AbstractC0080f.action_mode_close_button);
            this.f188m = findViewById;
            findViewById.setOnClickListener(new View$OnClickListenerC0222c(this, abstractC0161b));
            C0199p c0199p = (C0199p) abstractC0161b.mo2977e();
            c0298q = this.f180e;
            if (c0298q != null) {
                c0298q.m2765b();
            }
            C0298q c0298q2 = new C0298q(getContext());
            this.f180e = c0298q2;
            c0298q2.f1715n = true;
            c0298q2.f1716o = true;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            c0199p.m2937b(this.f180e, this.f178c);
            C0298q c0298q3 = this.f180e;
            interfaceC0183f0 = c0298q3.f1710i;
            if (interfaceC0183f0 == null) {
                InterfaceC0183f0 interfaceC0183f03 = (InterfaceC0183f0) c0298q3.f1706e.inflate(c0298q3.f1708g, (ViewGroup) this, false);
                c0298q3.f1710i = interfaceC0183f03;
                interfaceC0183f03.mo274b(c0298q3.f1705d);
                c0298q3.mo640n(true);
            }
            interfaceC0183f02 = c0298q3.f1710i;
            if (interfaceC0183f0 != interfaceC0183f02) {
                ((ActionMenuView) interfaceC0183f02).setPresenter(c0298q3);
            }
            ActionMenuView actionMenuView = (ActionMenuView) interfaceC0183f02;
            this.f179d = actionMenuView;
            AbstractC0605j0.m2267P(actionMenuView, null);
            addView(this.f179d, layoutParams);
        }
        view = LayoutInflater.from(getContext()).inflate(this.f196u, (ViewGroup) this, false);
        this.f187l = view;
        addView(view);
        View findViewById2 = this.f187l.findViewById(AbstractC0080f.action_mode_close_button);
        this.f188m = findViewById2;
        findViewById2.setOnClickListener(new View$OnClickListenerC0222c(this, abstractC0161b));
        C0199p c0199p2 = (C0199p) abstractC0161b.mo2977e();
        c0298q = this.f180e;
        if (c0298q != null) {
        }
        C0298q c0298q22 = new C0298q(getContext());
        this.f180e = c0298q22;
        c0298q22.f1715n = true;
        c0298q22.f1716o = true;
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        c0199p2.m2937b(this.f180e, this.f178c);
        C0298q c0298q32 = this.f180e;
        interfaceC0183f0 = c0298q32.f1710i;
        if (interfaceC0183f0 == null) {
        }
        interfaceC0183f02 = c0298q32.f1710i;
        if (interfaceC0183f0 != interfaceC0183f02) {
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) interfaceC0183f02;
        this.f179d = actionMenuView2;
        AbstractC0605j0.m2267P(actionMenuView2, null);
        addView(this.f179d, layoutParams2);
    }

    /* renamed from: d */
    public final void m3440d() {
        if (this.f190o == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC0081g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f190o = linearLayout;
            this.f191p = (TextView) linearLayout.findViewById(AbstractC0080f.action_bar_title);
            this.f192q = (TextView) this.f190o.findViewById(AbstractC0080f.action_bar_subtitle);
            if (this.f193r != 0) {
                this.f191p.setTextAppearance(getContext(), this.f193r);
            }
            if (this.f194s != 0) {
                this.f192q.setTextAppearance(getContext(), this.f194s);
            }
        }
        this.f191p.setText(this.f185j);
        this.f192q.setText(this.f186k);
        boolean z = !TextUtils.isEmpty(this.f185j);
        boolean z2 = !TextUtils.isEmpty(this.f186k);
        int i = 0;
        this.f192q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f190o;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f190o.getParent() == null) {
            addView(this.f190o);
        }
    }

    /* renamed from: e */
    public void m3439e() {
        removeAllViews();
        this.f189n = null;
        this.f179d = null;
        this.f180e = null;
        View view = this.f188m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: f */
    public int m3438f(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: g */
    public int m3437g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f182g != null ? this.f177b.f1443b : getVisibility();
    }

    public int getContentHeight() {
        return this.f181f;
    }

    public CharSequence getSubtitle() {
        return this.f186k;
    }

    public CharSequence getTitle() {
        return this.f185j;
    }

    /* renamed from: h */
    public C0615o0 m3436h(int i, long j) {
        C0615o0 c0615o0 = this.f182g;
        if (c0615o0 != null) {
            c0615o0.m2210b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0615o0 m2256b = AbstractC0605j0.m2256b(this);
            m2256b.m2211a(1.0f);
            m2256b.m2209c(j);
            C0210a c0210a = this.f177b;
            c0210a.f1444c.f182g = m2256b;
            c0210a.f1443b = i;
            m2256b.m2208d(c0210a);
            return m2256b;
        }
        C0615o0 m2256b2 = AbstractC0605j0.m2256b(this);
        m2256b2.m2211a(0.0f);
        m2256b2.m2209c(j);
        C0210a c0210a2 = this.f177b;
        c0210a2.f1444c.f182g = m2256b2;
        c0210a2.f1443b = i;
        m2256b2.m2208d(c0210a2);
        return m2256b2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0084j.ActionBar, AbstractC0075a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(AbstractC0084j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0298q c0298q = this.f180e;
        if (c0298q != null) {
            Configuration configuration2 = c0298q.f1704c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0298q.f1719r = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            C0199p c0199p = c0298q.f1705d;
            if (c0199p != null) {
                c0199p.m2922q(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0298q c0298q = this.f180e;
        if (c0298q != null) {
            c0298q.m2763k();
            this.f180e.m2761o();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f184i = false;
        }
        if (!this.f184i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f184i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f184i = false;
        }
        return true;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f185j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m2817a = AbstractC0257h4.m2817a(this);
        int paddingRight = m2817a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f187l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f187l.getLayoutParams();
            int i5 = m2817a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m2817a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = m2817a ? paddingRight - i5 : paddingRight + i5;
            int m3437g = i7 + m3437g(this.f187l, i7, paddingTop, paddingTop2, m2817a);
            paddingRight = m2817a ? m3437g - i6 : m3437g + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f190o;
        if (linearLayout != null && this.f189n == null && linearLayout.getVisibility() != 8) {
            i8 += m3437g(this.f190o, i8, paddingTop, paddingTop2, m2817a);
        }
        int i9 = i8;
        View view2 = this.f189n;
        if (view2 != null) {
            m3437g(view2, i9, paddingTop, paddingTop2, m2817a);
        }
        int paddingLeft = m2817a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f179d;
        if (actionMenuView != null) {
            m3437g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m2817a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f181f;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.f187l;
            if (view != null) {
                int m3438f = m3438f(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f187l.getLayoutParams();
                paddingLeft = m3438f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f179d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = m3438f(this.f179d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f190o;
            if (linearLayout != null && this.f189n == null) {
                if (this.f195t) {
                    this.f190o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f190o.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f190o.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = m3438f(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f189n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width;
                int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i5 >= 0) {
                    paddingLeft = Math.min(i5, paddingLeft);
                }
                int i7 = layoutParams.height;
                int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i7 >= 0) {
                    i4 = Math.min(i7, i4);
                }
                this.f189n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
            }
            if (this.f181f <= 0) {
                int childCount = getChildCount();
                i3 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i3) {
                        i3 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f183h = false;
        }
        if (!this.f183h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f183h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f183h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f181f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f189n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f189n = view;
        if (view != null && (linearLayout = this.f190o) != null) {
            removeView(linearLayout);
            this.f190o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f186k = charSequence;
        m3440d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f185j = charSequence;
        m3440d();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f195t) {
            requestLayout();
        }
        this.f195t = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0615o0 c0615o0 = this.f182g;
            if (c0615o0 != null) {
                c0615o0.m2210b();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}