package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p024p.p025m.AbstractC0176c;
import p010b.p016c.p024p.p025m.C0174b;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0181e0;
import p010b.p016c.p024p.p025m.InterfaceC0198o;
import p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1;
import p010b.p016c.p026q.C0242f1;
import p010b.p016c.p026q.InterfaceC0303r;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0242f1 implements InterfaceC0181e0, View.OnClickListener, InterfaceC0303r {

    /* renamed from: g */
    public C0202s f137g;

    /* renamed from: h */
    public CharSequence f138h;

    /* renamed from: i */
    public Drawable f139i;

    /* renamed from: j */
    public InterfaceC0198o f140j;

    /* renamed from: k */
    public AbstractView$OnTouchListenerC0330w1 f141k;

    /* renamed from: l */
    public AbstractC0176c f142l;

    /* renamed from: m */
    public boolean f143m;

    /* renamed from: n */
    public boolean f144n;

    /* renamed from: o */
    public int f145o;

    /* renamed from: p */
    public int f146p;

    /* renamed from: q */
    public int f147q;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f143m = m3450f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.ActionMenuItemView, 0, 0);
        this.f145o = obtainStyledAttributes.getDimensionPixelSize(AbstractC0084j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f147q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f146p = -1;
        setSaveEnabled(false);
    }

    @Override // p010b.p016c.p026q.InterfaceC0303r
    /* renamed from: a */
    public boolean mo2739a() {
        return m3451e();
    }

    @Override // p010b.p016c.p026q.InterfaceC0303r
    /* renamed from: b */
    public boolean mo2738b() {
        return m3451e() && this.f137g.getIcon() == null;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    /* renamed from: d */
    public void mo275d(C0202s c0202s, int i) {
        this.f137g = c0202s;
        setIcon(c0202s.getIcon());
        setTitle(c0202s.getTitleCondensed());
        setId(c0202s.f1404a);
        setVisibility(c0202s.isVisible() ? 0 : 8);
        setEnabled(c0202s.isEnabled());
        if (c0202s.hasSubMenu() && this.f141k == null) {
            this.f141k = new C0174b(this);
        }
    }

    /* renamed from: e */
    public boolean m3451e() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: f */
    public final boolean m3450f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: g */
    public final void m3449g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f138h);
        if (this.f139i != null) {
            if (!((this.f137g.f1428y & 4) == 4) || (!this.f143m && !this.f144n)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f138h : null);
        CharSequence charSequence = this.f137g.f1420q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z3 ? null : this.f137g.f1408e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f137g.f1421r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0022t.m3476p0(this, z3 ? null : this.f137g.f1408e);
        } else {
            AbstractC0022t.m3476p0(this, charSequence2);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    public C0202s getItemData() {
        return this.f137g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC0198o interfaceC0198o = this.f140j;
        if (interfaceC0198o != null) {
            interfaceC0198o.mo2939a(this.f137g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f143m = m3450f();
        m3449g();
    }

    @Override // p010b.p016c.p026q.C0242f1, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean m3451e = m3451e();
        if (m3451e && (i3 = this.f146p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f145o) : this.f145o;
        if (mode != 1073741824 && this.f145o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m3451e || this.f139i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f139i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0330w1 abstractView$OnTouchListenerC0330w1;
        if (this.f137g.hasSubMenu() && (abstractView$OnTouchListenerC0330w1 = this.f141k) != null && abstractView$OnTouchListenerC0330w1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f144n != z) {
            this.f144n = z;
            C0202s c0202s = this.f137g;
            if (c0202s != null) {
                c0202s.f1417n.m2923p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f139i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f147q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3449g();
    }

    public void setItemInvoker(InterfaceC0198o interfaceC0198o) {
        this.f140j = interfaceC0198o;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f146p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0176c abstractC0176c) {
        this.f142l = abstractC0176c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f138h = charSequence;
        m3449g();
    }
}