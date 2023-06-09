package p010b.p016c.p026q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.InterfaceC0630w;
import p010b.p046j.p061m.InterfaceC0640c;
import p010b.p046j.p061m.InterfaceC0648k;

/* renamed from: b.c.q.y */
/* loaded from: classes.dex */
public class C0338y extends Button implements InterfaceC0630w, InterfaceC0640c, InterfaceC0648k {

    /* renamed from: b */
    public final C0333x f1811b;

    /* renamed from: c */
    public final C0236e1 f1812c;

    public C0338y(Context context, AttributeSet attributeSet, int i) {
        super(C0287n3.m2787a(context), attributeSet, i);
        AbstractC0282m3.m2793a(this, getContext());
        C0333x c0333x = new C0333x(this);
        this.f1811b = c0333x;
        c0333x.m2725d(attributeSet, i);
        C0236e1 c0236e1 = new C0236e1(this);
        this.f1812c = c0236e1;
        c0236e1.m2849e(attributeSet, i);
        c0236e1.m2852b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1811b;
        if (c0333x != null) {
            c0333x.m2728a();
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            return Math.round(c0236e1.f1531i.f1618h);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeMinTextSize();
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            return Math.round(c0236e1.f1531i.f1617g);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeStepGranularity();
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            return Math.round(c0236e1.f1531i.f1616f);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0236e1 c0236e1 = this.f1812c;
        return c0236e1 != null ? c0236e1.f1531i.f1619i : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            return c0236e1.f1531i.f1614d;
        }
        return 0;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1811b;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1811b;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0292o3 c0292o3 = this.f1812c.f1530h;
        if (c0292o3 != null) {
            return c0292o3.f1678a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0292o3 c0292o3 = this.f1812c.f1530h;
        if (c0292o3 != null) {
            return c0292o3.f1679b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 == null || InterfaceC0640c.f2820a) {
            return;
        }
        c0236e1.f1531i.m2809b();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 == null || InterfaceC0640c.f2820a || !c0236e1.m2850d()) {
            return;
        }
        this.f1812c.f1531i.m2809b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0640c.f2820a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            c0236e1.m2846h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0640c.f2820a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            c0236e1.m2845i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0640c.f2820a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            c0236e1.m2844j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1811b;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1811b;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0022t.m3464v0(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            c0236e1.f1523a.setAllCaps(z);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1811b;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1811b;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }

    @Override // p010b.p046j.p061m.InterfaceC0648k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1812c.m2843k(colorStateList);
        this.f1812c.m2852b();
    }

    @Override // p010b.p046j.p061m.InterfaceC0648k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1812c.m2842l(mode);
        this.f1812c.m2852b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 != null) {
            c0236e1.m2848f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC0640c.f2820a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0236e1 c0236e1 = this.f1812c;
        if (c0236e1 == null || z || c0236e1.m2850d()) {
            return;
        }
        c0236e1.f1531i.m2804g(i, f);
    }
}