package p010b.p044i.p045d;

import java.util.ArrayList;
import java.util.HashSet;
import p010b.p036g.C0390n;
import p010b.p046j.p057k.C0562c;

/* renamed from: b.i.d.i */
/* loaded from: classes.dex */
public final class C0459i {

    /* renamed from: a */
    public final C0562c f2429a = new C0562c(10);

    /* renamed from: b */
    public final C0390n f2430b = new C0390n();

    /* renamed from: c */
    public final ArrayList f2431c = new ArrayList();

    /* renamed from: d */
    public final HashSet f2432d = new HashSet();

    /* renamed from: a */
    public void m2437a(Object obj) {
        if (this.f2430b.m2619e(obj) >= 0) {
            return;
        }
        this.f2430b.put(obj, null);
    }

    /* renamed from: b */
    public final void m2436b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f2430b.getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m2436b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}