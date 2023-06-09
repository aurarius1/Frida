package p010b.p087x.p088a.p089a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: b.x.a.a.d */
/* loaded from: classes.dex */
public class C1089d extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4069a;

    public C1089d(Drawable.ConstantState constantState) {
        this.f4069a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        return this.f4069a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4069a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1090e c1090e = new C1090e(null, null, null);
        Drawable newDrawable = this.f4069a.newDrawable();
        c1090e.f4078b = newDrawable;
        newDrawable.setCallback(c1090e.f4073f);
        return c1090e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        C1090e c1090e = new C1090e(null, null, null);
        Drawable newDrawable = this.f4069a.newDrawable(resources);
        c1090e.f4078b = newDrawable;
        newDrawable.setCallback(c1090e.f4073f);
        return c1090e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1090e c1090e = new C1090e(null, null, null);
        Drawable newDrawable = this.f4069a.newDrawable(resources, theme);
        c1090e.f4078b = newDrawable;
        newDrawable.setCallback(c1090e.f4073f);
        return c1090e;
    }
}