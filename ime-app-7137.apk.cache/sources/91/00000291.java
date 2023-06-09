package p010b.p046j.p050f.p051p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: b.j.f.p.e */
/* loaded from: classes.dex */
public final class C0525e extends Drawable.ConstantState {

    /* renamed from: a */
    public int f2577a;

    /* renamed from: b */
    public Drawable.ConstantState f2578b;

    /* renamed from: c */
    public ColorStateList f2579c;

    /* renamed from: d */
    public PorterDuff.Mode f2580d;

    public C0525e(C0525e c0525e) {
        this.f2579c = null;
        this.f2580d = C0523c.f2569b;
        if (c0525e != null) {
            this.f2577a = c0525e.f2577a;
            this.f2578b = c0525e.f2578b;
            this.f2579c = c0525e.f2579c;
            this.f2580d = c0525e.f2580d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f2577a;
        Drawable.ConstantState constantState = this.f2578b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0524d(this, resources) : new C0523c(this, resources);
    }
}