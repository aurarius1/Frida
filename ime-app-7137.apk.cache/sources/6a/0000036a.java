package p010b.p067m.p068d;

import android.view.View;
import java.util.ArrayList;

/* renamed from: b.m.d.s1 */
/* loaded from: classes.dex */
public class RunnableC0742s1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f3119b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0695g2 f3120c;

    /* renamed from: d */
    public final /* synthetic */ View f3121d;

    /* renamed from: e */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3122e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f3123f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f3124g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f3125h;

    /* renamed from: i */
    public final /* synthetic */ Object f3126i;

    public RunnableC0742s1(Object obj, AbstractC0695g2 abstractC0695g2, View view, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f3119b = obj;
        this.f3120c = abstractC0695g2;
        this.f3121d = view;
        this.f3122e = abstractComponentCallbacksC0763z;
        this.f3123f = arrayList;
        this.f3124g = arrayList2;
        this.f3125h = arrayList3;
        this.f3126i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f3119b;
        if (obj != null) {
            this.f3120c.mo1315o(obj, this.f3121d);
            this.f3124g.addAll(AbstractC0756w1.m1924h(this.f3120c, this.f3119b, this.f3122e, this.f3123f, this.f3121d));
        }
        if (this.f3125h != null) {
            if (this.f3126i != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f3121d);
                this.f3120c.mo1314p(this.f3126i, this.f3125h, arrayList);
            }
            this.f3125h.clear();
            this.f3125h.add(this.f3121d);
        }
    }
}