package p010b.p046j.p048e.p049b;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: b.j.e.b.i */
/* loaded from: classes.dex */
public abstract class AbstractC0503i {
    /* renamed from: c */
    public static Handler m2405c(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    /* renamed from: a */
    public final void m2407a(int i, Handler handler) {
        m2405c(handler).post(new RunnableC0502h(this, i));
    }

    /* renamed from: b */
    public final void m2406b(Typeface typeface, Handler handler) {
        m2405c(handler).post(new RunnableC0501g(this, typeface));
    }

    /* renamed from: d */
    public abstract void mo761d(int i);

    /* renamed from: e */
    public abstract void mo760e(Typeface typeface);
}