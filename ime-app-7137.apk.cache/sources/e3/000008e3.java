package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: O */
    public static final int f6651O = AbstractC1926k.Widget_MaterialComponents_Toolbar;

    /* renamed from: P */
    public Integer f6652P;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = AbstractC1804b.toolbarStyle;
        int i2 = f6651O;
        Context context2 = getContext();
        TypedArray m764d = AbstractC1822r.m764d(context2, attributeSet, AbstractC1940l.MaterialToolbar, i, i2, new int[0]);
        int i3 = AbstractC1940l.MaterialToolbar_navigationIconTint;
        if (m764d.hasValue(i3)) {
            setNavigationIconTint(m764d.getColor(i3, -1));
        }
        m764d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1851i c1851i = new C1851i();
            c1851i.m737p(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c1851i.f5657d.f5634b = new C2045a(context2);
            c1851i.m730w();
            c1851i.m738o(AbstractC0605j0.m2245m(this));
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(c1851i);
            } else {
                setBackgroundDrawable(c1851i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1851i) {
            AbstractC1077v0.m1280X(this, (C1851i) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        AbstractC1077v0.m1281W(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f6652P != null) {
            drawable = AbstractC0022t.m3466u0(drawable);
            AbstractC0022t.m3482m0(drawable, this.f6652P.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f6652P = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}