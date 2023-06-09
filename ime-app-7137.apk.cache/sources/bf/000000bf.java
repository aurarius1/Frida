package p010b.p011a;

import java.util.ArrayDeque;
import java.util.Iterator;
import p010b.p067m.p068d.C0690f1;
import p010b.p067m.p068d.C0745t0;

/* renamed from: b.a.i */
/* loaded from: classes.dex */
public final class C0059i {

    /* renamed from: a */
    public final Runnable f855a;

    /* renamed from: b */
    public final ArrayDeque f856b = new ArrayDeque();

    public C0059i(Runnable runnable) {
        this.f855a = runnable;
    }

    /* renamed from: a */
    public void m3089a() {
        Iterator descendingIterator = this.f856b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0745t0 c0745t0 = (C0745t0) descendingIterator.next();
            if (c0745t0.f3133a) {
                C0690f1 c0690f1 = c0745t0.f3135c;
                c0690f1.m2092E(true);
                if (c0690f1.f2974h.f3133a) {
                    c0690f1.m2067b0();
                    return;
                } else {
                    c0690f1.f2973g.m3089a();
                    return;
                }
            }
        }
        Runnable runnable = this.f855a;
        if (runnable != null) {
            runnable.run();
        }
    }
}