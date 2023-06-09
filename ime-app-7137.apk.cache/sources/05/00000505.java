package p093c.p097b.p100c0.p101b0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.c0.b0.a */
/* loaded from: classes.dex */
public class C1153a {

    /* renamed from: a */
    public final Map f4276a = new HashMap();

    /* renamed from: b */
    public final List f4277b = new ArrayList();

    /* renamed from: a */
    public C1153a m1167a(String str, String str2) {
        Map map = this.f4276a;
        if (str.matches("\\A[\\p{Upper}|\\p{Lower}]+[\\p{Upper}|\\p{Lower}|\\p{Digit}|_|-]*\\z")) {
            map.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(AbstractC1124a.m1189g("The key '", str, "' has non ASCII or has whitespaces or is empty! This is not valid as an XML attribute"));
    }

    /* renamed from: b */
    public C1153a m1166b() {
        C1153a c1153a = new C1153a();
        this.f4277b.add(c1153a);
        return c1153a;
    }

    /* renamed from: c */
    public Iterable m1165c() {
        return Collections.unmodifiableCollection(this.f4277b);
    }

    /* renamed from: d */
    public Iterable m1164d() {
        return Collections.unmodifiableCollection(this.f4276a.entrySet());
    }
}