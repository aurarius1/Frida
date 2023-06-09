package p010b.p046j.p048e.p049b;

import android.graphics.Typeface;

/* renamed from: b.j.e.b.g */
/* loaded from: classes.dex */
public class RunnableC0501g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Typeface f2533b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0503i f2534c;

    public RunnableC0501g(AbstractC0503i abstractC0503i, Typeface typeface) {
        this.f2534c = abstractC0503i;
        this.f2533b = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2534c.mo760e(this.f2533b);
    }
}