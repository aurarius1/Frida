package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.InterfaceC0630w;

/* renamed from: b.c.q.w */
/* loaded from: classes.dex */
public class C0328w extends AutoCompleteTextView implements InterfaceC0630w {

    /* renamed from: b */
    public static final int[] f1784b = {16843126};

    /* renamed from: c */
    public final C0333x f1785c;

    /* renamed from: d */
    public final C0236e1 f1786d;

    public C0328w(Context context, AttributeSet attributeSet, int i) {
        super(C0287n3.m2787a(context), attributeSet, i);
        AbstractC0282m3.m2793a(this, getContext());
        C0302q3 m2740r = C0302q3.m2740r(getContext(), attributeSet, f1784b, i, 0);
        if (m2740r.m2742p(0)) {
            setDropDownBackgroundDrawable(m2740r.m2751g(0));
        }
        m2740r.f1740b.recycle();
        C0333x c0333x = new C0333x(this);
        this.f1785c = c0333x;
        c0333x.m2725d(attributeSet, i);
        C0236e1 c0236e1 = new C0236e1(this);
        this.f1786d = c0236e1;
        c0236e1.m2849e(attributeSet, i);
        c0236e1.m2852b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1785c;
        if (c0333x != null) {
            c0333x.m2728a();
        }
        C0236e1 c0236e1 = this.f1786d;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1785c;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1785c;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0022t.m3513U(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1785c;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1785c;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0022t.m3464v0(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0142b.m3000b(getContext(), i));
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1785c;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1785c;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0236e1 c0236e1 = this.f1786d;
        if (c0236e1 != null) {
            c0236e1.m2848f(context, i);
        }
    }
}