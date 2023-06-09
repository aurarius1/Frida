package p010b.p087x.p088a.p089a;

import android.graphics.drawable.Drawable;

/* renamed from: b.x.a.a.b */
/* loaded from: classes.dex */
public class C1087b implements Drawable.Callback {

    /* renamed from: b */
    public final /* synthetic */ C1090e f4063b;

    public C1087b(C1090e c1090e) {
        this.f4063b = c1090e;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.f4063b.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f4063b.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f4063b.unscheduleSelf(runnable);
    }
}