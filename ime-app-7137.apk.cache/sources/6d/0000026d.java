package p010b.p046j.p047d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p036g.C0380d;

/* renamed from: b.j.d.v */
/* loaded from: classes.dex */
public abstract class AbstractC0489v {
    /* renamed from: a */
    public static List m2416a(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C0380d c0380d = new C0380d(list2.size() + list.size());
        c0380d.addAll(list);
        c0380d.addAll(list2);
        return new ArrayList(c0380d);
    }

    /* renamed from: b */
    public static List m2415b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC0471d0 abstractC0471d0 = (AbstractC0471d0) it.next();
            throw null;
        }
        return arrayList;
    }
}