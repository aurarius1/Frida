package p010b.p067m.p068d;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import p010b.p036g.C0378b;

/* renamed from: b.m.d.u1 */
/* loaded from: classes.dex */
public class RunnableC0750u1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0695g2 f3146b;

    /* renamed from: c */
    public final /* synthetic */ C0378b f3147c;

    /* renamed from: d */
    public final /* synthetic */ Object f3148d;

    /* renamed from: e */
    public final /* synthetic */ C0753v1 f3149e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f3150f;

    /* renamed from: g */
    public final /* synthetic */ View f3151g;

    /* renamed from: h */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3152h;

    /* renamed from: i */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3153i;

    /* renamed from: j */
    public final /* synthetic */ boolean f3154j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f3155k;

    /* renamed from: l */
    public final /* synthetic */ Object f3156l;

    /* renamed from: m */
    public final /* synthetic */ Rect f3157m;

    public RunnableC0750u1(AbstractC0695g2 abstractC0695g2, C0378b c0378b, Object obj, C0753v1 c0753v1, ArrayList arrayList, View view, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f3146b = abstractC0695g2;
        this.f3147c = c0378b;
        this.f3148d = obj;
        this.f3149e = c0753v1;
        this.f3150f = arrayList;
        this.f3151g = view;
        this.f3152h = abstractComponentCallbacksC0763z;
        this.f3153i = abstractComponentCallbacksC0763z2;
        this.f3154j = z;
        this.f3155k = arrayList2;
        this.f3156l = obj2;
        this.f3157m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0378b m1927e = AbstractC0756w1.m1927e(this.f3146b, this.f3147c, this.f3148d, this.f3149e);
        if (m1927e != null) {
            this.f3150f.addAll(m1927e.values());
            this.f3150f.add(this.f3151g);
        }
        AbstractC0756w1.m1929c(this.f3152h, this.f3153i, this.f3154j, m1927e, false);
        Object obj = this.f3148d;
        if (obj != null) {
            this.f3146b.mo1308x(obj, this.f3155k, this.f3150f);
            View m1921k = AbstractC0756w1.m1921k(m1927e, this.f3149e, this.f3156l, this.f3154j);
            if (m1921k != null) {
                this.f3146b.m2024j(m1921k, this.f3157m);
            }
        }
    }
}