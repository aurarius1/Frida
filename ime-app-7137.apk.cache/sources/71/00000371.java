package p010b.p067m.p068d;

import java.util.HashSet;
import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.u0 */
/* loaded from: classes.dex */
public class C0749u0 {

    /* renamed from: a */
    public final /* synthetic */ C0690f1 f3145a;

    public C0749u0(C0690f1 c0690f1) {
        this.f3145a = c0690f1;
    }

    /* renamed from: a */
    public void m1941a(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0529b c0529b) {
        boolean z;
        synchronized (c0529b) {
            z = c0529b.f2581a;
        }
        if (z) {
            return;
        }
        C0690f1 c0690f1 = this.f3145a;
        HashSet hashSet = (HashSet) c0690f1.f2978l.get(abstractComponentCallbacksC0763z);
        if (hashSet != null && hashSet.remove(c0529b) && hashSet.isEmpty()) {
            c0690f1.f2978l.remove(abstractComponentCallbacksC0763z);
            if (abstractComponentCallbacksC0763z.f3230c < 5) {
                c0690f1.m2050k(abstractComponentCallbacksC0763z);
                c0690f1.m2072Y(abstractComponentCallbacksC0763z, c0690f1.f2982p);
            }
        }
    }

    /* renamed from: b */
    public void m1940b(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0529b c0529b) {
        C0690f1 c0690f1 = this.f3145a;
        if (c0690f1.f2978l.get(abstractComponentCallbacksC0763z) == null) {
            c0690f1.f2978l.put(abstractComponentCallbacksC0763z, new HashSet());
        }
        ((HashSet) c0690f1.f2978l.get(abstractComponentCallbacksC0763z)).add(c0529b);
    }
}