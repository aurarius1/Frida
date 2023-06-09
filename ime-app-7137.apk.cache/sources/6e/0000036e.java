package p010b.p067m.p068d;

import android.graphics.Rect;
import android.view.View;
import p010b.p036g.C0378b;

/* renamed from: b.m.d.t1 */
/* loaded from: classes.dex */
public class RunnableC0746t1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3136b;

    /* renamed from: c */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3137c;

    /* renamed from: d */
    public final /* synthetic */ boolean f3138d;

    /* renamed from: e */
    public final /* synthetic */ C0378b f3139e;

    /* renamed from: f */
    public final /* synthetic */ View f3140f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC0695g2 f3141g;

    /* renamed from: h */
    public final /* synthetic */ Rect f3142h;

    public RunnableC0746t1(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2, boolean z, C0378b c0378b, View view, AbstractC0695g2 abstractC0695g2, Rect rect) {
        this.f3136b = abstractComponentCallbacksC0763z;
        this.f3137c = abstractComponentCallbacksC0763z2;
        this.f3138d = z;
        this.f3139e = c0378b;
        this.f3140f = view;
        this.f3141g = abstractC0695g2;
        this.f3142h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0756w1.m1929c(this.f3136b, this.f3137c, this.f3138d, this.f3139e, false);
        View view = this.f3140f;
        if (view != null) {
            this.f3141g.m2024j(view, this.f3142h);
        }
    }
}