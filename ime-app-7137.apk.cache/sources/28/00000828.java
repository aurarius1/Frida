package p093c.p145g.p146a.p147a.p163o;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: c.g.a.a.o.a */
/* loaded from: classes.dex */
public class RunnableC1956a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f5920b;

    /* renamed from: c */
    public final /* synthetic */ FrameLayout f5921c;

    /* renamed from: d */
    public final /* synthetic */ C1958c f5922d;

    public RunnableC1956a(C1958c c1958c, View view, FrameLayout frameLayout) {
        this.f5922d = c1958c;
        this.f5920b = view;
        this.f5921c = frameLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5922d.m662f(this.f5920b, this.f5921c);
    }
}