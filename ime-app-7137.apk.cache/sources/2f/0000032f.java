package p010b.p067m.p068d;

import android.view.View;
import java.util.ArrayList;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.m.d.d2 */
/* loaded from: classes.dex */
public class RunnableC0683d2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f2942b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f2943c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f2944d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f2945e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f2946f;

    public RunnableC0683d2(AbstractC0695g2 abstractC0695g2, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2942b = i;
        this.f2943c = arrayList;
        this.f2944d = arrayList2;
        this.f2945e = arrayList3;
        this.f2946f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f2942b; i++) {
            AbstractC0605j0.m2259X((View) this.f2943c.get(i), (String) this.f2944d.get(i));
            AbstractC0605j0.m2259X((View) this.f2945e.get(i), (String) this.f2946f.get(i));
        }
    }
}