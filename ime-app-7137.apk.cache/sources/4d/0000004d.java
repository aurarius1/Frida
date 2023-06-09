package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p026q.AbstractC0306r2;
import p010b.p016c.p026q.C0216b;
import p010b.p046j.p058l.AbstractC0605j0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f167b;

    /* renamed from: c */
    public View f168c;

    /* renamed from: d */
    public View f169d;

    /* renamed from: e */
    public View f170e;

    /* renamed from: f */
    public Drawable f171f;

    /* renamed from: g */
    public Drawable f172g;

    /* renamed from: h */
    public Drawable f173h;

    /* renamed from: i */
    public boolean f174i;

    /* renamed from: j */
    public boolean f175j;

    /* renamed from: k */
    public int f176k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0216b c0216b = new C0216b(this);
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(c0216b);
        } else {
            setBackgroundDrawable(c0216b);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.ActionBar);
        this.f171f = obtainStyledAttributes.getDrawable(AbstractC0084j.ActionBar_background);
        this.f172g = obtainStyledAttributes.getDrawable(AbstractC0084j.ActionBar_backgroundStacked);
        this.f176k = obtainStyledAttributes.getDimensionPixelSize(AbstractC0084j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == AbstractC0080f.split_action_bar) {
            this.f174i = true;
            this.f173h = obtainStyledAttributes.getDrawable(AbstractC0084j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f174i ? this.f171f != null || this.f172g != null : this.f173h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int m3445a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m3444b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f171f;
        if (drawable != null && drawable.isStateful()) {
            this.f171f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f172g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f172g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f173h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f173h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f168c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f171f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f172g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f173h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f169d = findViewById(AbstractC0080f.action_bar);
        this.f170e = findViewById(AbstractC0080f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f167b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f168c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f174i) {
            Drawable drawable3 = this.f173h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f171f != null) {
                if (this.f169d.getVisibility() == 0) {
                    drawable2 = this.f171f;
                    left = this.f169d.getLeft();
                    top = this.f169d.getTop();
                    right = this.f169d.getRight();
                    view = this.f169d;
                } else {
                    View view3 = this.f170e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f171f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f171f;
                        left = this.f170e.getLeft();
                        top = this.f170e.getTop();
                        right = this.f170e.getRight();
                        view = this.f170e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f175j = z4;
            if (!z4 || (drawable = this.f172g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        View view;
        int i4;
        if (this.f169d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f176k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f169d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view2 = this.f168c;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!m3444b(this.f169d)) {
            view = this.f169d;
        } else if (m3444b(this.f170e)) {
            i3 = 0;
            setMeasuredDimension(getMeasuredWidth(), Math.min(m3445a(this.f168c) + i3, mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
        } else {
            view = this.f170e;
        }
        i3 = m3445a(view);
        setMeasuredDimension(getMeasuredWidth(), Math.min(m3445a(this.f168c) + i3, mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f171f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f171f);
        }
        this.f171f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f169d;
            if (view != null) {
                this.f171f.setBounds(view.getLeft(), this.f169d.getTop(), this.f169d.getRight(), this.f169d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f174i ? this.f171f != null || this.f172g != null : this.f173h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f173h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f173h);
        }
        this.f173h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f174i && (drawable2 = this.f173h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f174i ? !(this.f171f != null || this.f172g != null) : this.f173h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f172g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f172g);
        }
        this.f172g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f175j && (drawable2 = this.f172g) != null) {
                drawable2.setBounds(this.f168c.getLeft(), this.f168c.getTop(), this.f168c.getRight(), this.f168c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f174i ? this.f171f != null || this.f172g != null : this.f173h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(AbstractC0306r2 abstractC0306r2) {
        View view = this.f168c;
        if (view != null) {
            removeView(view);
        }
        this.f168c = abstractC0306r2;
        if (abstractC0306r2 == null) {
            return;
        }
        addView(abstractC0306r2);
        throw null;
    }

    public void setTransitioning(boolean z) {
        this.f167b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f171f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f172g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f173h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f171f && !this.f174i) || (drawable == this.f172g && this.f175j) || ((drawable == this.f173h && this.f174i) || super.verifyDrawable(drawable));
    }
}