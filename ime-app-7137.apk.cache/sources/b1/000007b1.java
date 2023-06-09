package p093c.p145g.p146a.p147a.p152e0;

import android.graphics.drawable.Drawable;
import p093c.p145g.p146a.p147a.p154g0.C1851i;

/* renamed from: c.g.a.a.e0.b */
/* loaded from: classes.dex */
public final class C1837b extends Drawable.ConstantState {

    /* renamed from: a */
    public C1851i f5600a;

    /* renamed from: b */
    public boolean f5601b;

    public C1837b(C1837b c1837b) {
        this.f5600a = (C1851i) c1837b.f5600a.f5657d.newDrawable();
        this.f5601b = c1837b.f5601b;
    }

    public C1837b(C1851i c1851i) {
        this.f5600a = c1851i;
        this.f5601b = false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C1838c(new C1837b(this), null);
    }
}