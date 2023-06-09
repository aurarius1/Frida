package p010b.p087x.p088a.p089a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: b.x.a.a.s */
/* loaded from: classes.dex */
public class C1104s extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4137a;

    public C1104s(Drawable.ConstantState constantState) {
        this.f4137a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        return this.f4137a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4137a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1105t c1105t = new C1105t();
        c1105t.f4078b = (VectorDrawable) this.f4137a.newDrawable();
        return c1105t;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        C1105t c1105t = new C1105t();
        c1105t.f4078b = (VectorDrawable) this.f4137a.newDrawable(resources);
        return c1105t;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1105t c1105t = new C1105t();
        c1105t.f4078b = (VectorDrawable) this.f4137a.newDrawable(resources, theme);
        return c1105t;
    }
}