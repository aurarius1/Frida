package p010b.p046j.p055i;

import android.graphics.Typeface;
import p010b.p046j.p048e.p049b.AbstractC0503i;
import p010b.p046j.p050f.C0510e;

/* renamed from: b.j.i.a */
/* loaded from: classes.dex */
public class RunnableC0531a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0510e f2584b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f2585c;

    public RunnableC0531a(C0533c c0533c, C0510e c0510e, Typeface typeface) {
        this.f2584b = c0510e;
        this.f2585c = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0510e c0510e = this.f2584b;
        Typeface typeface = this.f2585c;
        AbstractC0503i abstractC0503i = c0510e.f2549a;
        if (abstractC0503i != null) {
            abstractC0503i.mo760e(typeface);
        }
    }
}