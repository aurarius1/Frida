package p010b.p067m.p068d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.n1 */
/* loaded from: classes.dex */
public class C0722n1 {

    /* renamed from: a */
    public final ArrayList f3070a = new ArrayList();

    /* renamed from: b */
    public final HashMap f3071b = new HashMap();

    /* renamed from: c */
    public C0702i1 f3072c;

    /* renamed from: a */
    public void m1988a(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (this.f3070a.contains(abstractComponentCallbacksC0763z)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0763z);
        }
        synchronized (this.f3070a) {
            this.f3070a.add(abstractComponentCallbacksC0763z);
        }
        abstractComponentCallbacksC0763z.f3241n = true;
    }

    /* renamed from: b */
    public void m1987b() {
        this.f3071b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m1986c(String str) {
        return this.f3071b.get(str) != null;
    }

    /* renamed from: d */
    public AbstractComponentCallbacksC0763z m1985d(String str) {
        C0718m1 c0718m1 = (C0718m1) this.f3071b.get(str);
        if (c0718m1 != null) {
            return c0718m1.f3061c;
        }
        return null;
    }

    /* renamed from: e */
    public AbstractComponentCallbacksC0763z m1984e(String str) {
        for (C0718m1 c0718m1 : this.f3071b.values()) {
            if (c0718m1 != null) {
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
                if (!str.equals(abstractComponentCallbacksC0763z.f3235h)) {
                    abstractComponentCallbacksC0763z = abstractComponentCallbacksC0763z.f3250w.f2969c.m1984e(str);
                }
                if (abstractComponentCallbacksC0763z != null) {
                    return abstractComponentCallbacksC0763z;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public List m1983f() {
        ArrayList arrayList = new ArrayList();
        for (C0718m1 c0718m1 : this.f3071b.values()) {
            if (c0718m1 != null) {
                arrayList.add(c0718m1);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m1982g() {
        ArrayList arrayList = new ArrayList();
        for (C0718m1 c0718m1 : this.f3071b.values()) {
            arrayList.add(c0718m1 != null ? c0718m1.f3061c : null);
        }
        return arrayList;
    }

    /* renamed from: h */
    public C0718m1 m1981h(String str) {
        return (C0718m1) this.f3071b.get(str);
    }

    /* renamed from: i */
    public List m1980i() {
        ArrayList arrayList;
        if (this.f3070a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3070a) {
            arrayList = new ArrayList(this.f3070a);
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m1979j(C0718m1 c0718m1) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
        if (m1986c(abstractComponentCallbacksC0763z.f3235h)) {
            return;
        }
        this.f3071b.put(abstractComponentCallbacksC0763z.f3235h, c0718m1);
        if (C0690f1.m2078S(2)) {
            AbstractC1124a.m1186j("Added fragment to active set ", abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: k */
    public void m1978k(C0718m1 c0718m1) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
        if (abstractComponentCallbacksC0763z.f3211D) {
            this.f3072c.m2017b(abstractComponentCallbacksC0763z);
        }
        if (((C0718m1) this.f3071b.put(abstractComponentCallbacksC0763z.f3235h, null)) != null && C0690f1.m2078S(2)) {
            AbstractC1124a.m1186j("Removed fragment from active set ", abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: l */
    public void m1977l(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        synchronized (this.f3070a) {
            this.f3070a.remove(abstractComponentCallbacksC0763z);
        }
        abstractComponentCallbacksC0763z.f3241n = false;
    }
}