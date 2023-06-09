package p010b.p016c.p020m.p021a;

import android.graphics.drawable.Drawable;

/* renamed from: b.c.m.a.j */
/* loaded from: classes.dex */
public class C0152j implements Drawable.Callback {

    /* renamed from: b */
    public Drawable.Callback f1139b;

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.f1139b;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.f1139b;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}