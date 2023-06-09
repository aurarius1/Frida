package p093c.p097b.p098a0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010b.p036g.C0378b;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.a0.i */
/* loaded from: classes.dex */
public class C1134i {

    /* renamed from: a */
    public static final C1126a f4243a = new C1126a();

    /* renamed from: b */
    public final String f4244b;

    /* renamed from: c */
    public final List f4245c = new ArrayList();

    /* renamed from: d */
    public final Map f4246d = new C0378b();

    public C1134i(String str) {
        this.f4244b = str;
    }

    public C1134i(String str, List list) {
        this.f4244b = str;
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C1127b c1127b = new C1127b(str2, size);
            this.f4246d.put(str2, c1127b);
            this.f4245c.add(c1127b);
        }
    }

    /* renamed from: a */
    public List m1184a() {
        Collections.sort(this.f4245c, f4243a);
        return this.f4245c;
    }

    /* renamed from: b */
    public void m1183b(String str) {
        C1127b c1127b = (C1127b) this.f4246d.get(str);
        if (c1127b != null) {
            c1127b.f4228b++;
            return;
        }
        C1127b c1127b2 = new C1127b(str);
        this.f4246d.put(str, c1127b2);
        this.f4245c.add(c1127b2);
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("(");
        m1187i.append(this.f4244b);
        m1187i.append(") -> [");
        m1187i.append(this.f4245c.toString());
        m1187i.append("]");
        return m1187i.toString();
    }
}