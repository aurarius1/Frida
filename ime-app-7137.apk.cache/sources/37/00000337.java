package p010b.p067m.p068d;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.m.d.f2 */
/* loaded from: classes.dex */
public class RunnableC0691f2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2993b;

    /* renamed from: c */
    public final /* synthetic */ Map f2994c;

    public RunnableC0691f2(AbstractC0695g2 abstractC0695g2, ArrayList arrayList, Map map) {
        this.f2993b = arrayList;
        this.f2994c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f2993b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f2993b.get(i);
            AbstractC0605j0.m2259X(view, (String) this.f2994c.get(AbstractC0605j0.m2235w(view)));
        }
    }
}