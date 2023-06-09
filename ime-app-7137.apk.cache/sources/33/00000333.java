package p010b.p067m.p068d;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.m.d.e2 */
/* loaded from: classes.dex */
public class RunnableC0687e2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2952b;

    /* renamed from: c */
    public final /* synthetic */ Map f2953c;

    public RunnableC0687e2(AbstractC0695g2 abstractC0695g2, ArrayList arrayList, Map map) {
        this.f2952b = arrayList;
        this.f2953c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f2952b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f2952b.get(i);
            String m2235w = AbstractC0605j0.m2235w(view);
            if (m2235w != null) {
                Iterator it = this.f2953c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (m2235w.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                AbstractC0605j0.m2259X(view, str);
            }
        }
    }
}