package p010b.p016c.p020m.p021a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.c.m.a.n */
/* loaded from: classes.dex */
public abstract class AbstractC0156n extends AbstractC0154l {

    /* renamed from: o */
    public AbstractC0155m f1189o;

    /* renamed from: p */
    public boolean f1190p;

    public AbstractC0156n(AbstractC0155m abstractC0155m) {
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0154l, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0154l, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1190p) {
            super.mutate();
            if (this == this) {
                this.f1189o.mo2988e();
                this.f1190p = true;
            }
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}