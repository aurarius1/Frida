package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.InterfaceC0630w;
import p010b.p046j.p061m.InterfaceC0647j;

/* renamed from: b.c.q.z */
/* loaded from: classes.dex */
public class C0343z extends CheckBox implements InterfaceC0647j, InterfaceC0630w {

    /* renamed from: b */
    public final C0217b0 f1831b;

    /* renamed from: c */
    public final C0333x f1832c;

    /* renamed from: d */
    public final C0236e1 f1833d;

    public C0343z(Context context, AttributeSet attributeSet, int i) {
        super(C0287n3.m2787a(context), attributeSet, i);
        AbstractC0282m3.m2793a(this, getContext());
        C0217b0 c0217b0 = new C0217b0(this);
        this.f1831b = c0217b0;
        c0217b0.m2873c(attributeSet, i);
        C0333x c0333x = new C0333x(this);
        this.f1832c = c0333x;
        c0333x.m2725d(attributeSet, i);
        C0236e1 c0236e1 = new C0236e1(this);
        this.f1833d = c0236e1;
        c0236e1.m2849e(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1832c;
        if (c0333x != null) {
            c0333x.m2728a();
        }
        C0236e1 c0236e1 = this.f1833d;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0217b0 c0217b0 = this.f1831b;
        return c0217b0 != null ? c0217b0.m2874b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1832c;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1832c;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    @Override // p010b.p046j.p061m.InterfaceC0647j
    public ColorStateList getSupportButtonTintList() {
        C0217b0 c0217b0 = this.f1831b;
        if (c0217b0 != null) {
            return c0217b0.f1476b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0217b0 c0217b0 = this.f1831b;
        if (c0217b0 != null) {
            return c0217b0.f1477c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1832c;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1832c;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0142b.m3000b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0217b0 c0217b0 = this.f1831b;
        if (c0217b0 != null) {
            if (c0217b0.f1480f) {
                c0217b0.f1480f = false;
                return;
            }
            c0217b0.f1480f = true;
            c0217b0.m2875a();
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1832c;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1832c;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }

    @Override // p010b.p046j.p061m.InterfaceC0647j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0217b0 c0217b0 = this.f1831b;
        if (c0217b0 != null) {
            c0217b0.f1476b = colorStateList;
            c0217b0.f1478d = true;
            c0217b0.m2875a();
        }
    }

    @Override // p010b.p046j.p061m.InterfaceC0647j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0217b0 c0217b0 = this.f1831b;
        if (c0217b0 != null) {
            c0217b0.f1477c = mode;
            c0217b0.f1479e = true;
            c0217b0.m2875a();
        }
    }
}