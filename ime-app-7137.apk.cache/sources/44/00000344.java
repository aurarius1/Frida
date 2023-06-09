package p010b.p067m.p068d;

import android.graphics.Rect;
import android.view.View;

/* renamed from: b.m.d.j */
/* loaded from: classes.dex */
public class RunnableC0704j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0695g2 f3027b;

    /* renamed from: c */
    public final /* synthetic */ View f3028c;

    /* renamed from: d */
    public final /* synthetic */ Rect f3029d;

    public RunnableC0704j(C0728p c0728p, AbstractC0695g2 abstractC0695g2, View view, Rect rect) {
        this.f3027b = abstractC0695g2;
        this.f3028c = view;
        this.f3029d = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3027b.m2024j(this.f3028c, this.f3029d);
    }
}