package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p010b.p046j.p058l.InterfaceC0630w;

/* renamed from: b.c.q.k1 */
/* loaded from: classes.dex */
public class C0270k1 extends ToggleButton implements InterfaceC0630w {

    /* renamed from: b */
    public final C0333x f1635b;

    /* renamed from: c */
    public final C0236e1 f1636c;

    public C0270k1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        AbstractC0282m3.m2793a(this, getContext());
        C0333x c0333x = new C0333x(this);
        this.f1635b = c0333x;
        c0333x.m2725d(attributeSet, 16842827);
        C0236e1 c0236e1 = new C0236e1(this);
        this.f1636c = c0236e1;
        c0236e1.m2849e(attributeSet, 16842827);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1635b;
        if (c0333x != null) {
            c0333x.m2728a();
        }
        C0236e1 c0236e1 = this.f1636c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1635b;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1635b;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1635b;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1635b;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1635b;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1635b;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }
}