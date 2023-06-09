package p093c.p097b.p122u.p124v0;

import android.content.Context;
import p093c.p097b.p100c0.p101b0.C1153a;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.InterfaceC1154b;
import p093c.p097b.p117q.AbstractC1438d;
import p093c.p097b.p122u.C1475h0;
import p093c.p097b.p122u.InterfaceC1515w;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.u.v0.k */
/* loaded from: classes.dex */
public class C1514k implements InterfaceC1154b {

    /* renamed from: a */
    public final Context f4874a;

    /* renamed from: b */
    public final Iterable f4875b;

    public C1514k(Context context) {
        Iterable m1009u = C1475h0.m1009u(context);
        this.f4874a = context;
        this.f4875b = m1009u;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: a */
    public void mo974a(C1155c c1155c) {
        AbstractC1438d.m1040j(AbstractC2094b.m174D(c1155c.m1165c()), new C1510g(this), C1507d.f4867b, AbstractC2146l.f7038c);
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: b */
    public C1155c mo973b() {
        C1155c c1155c = new C1155c(1);
        for (String str : this.f4875b) {
            final C1153a m1166b = c1155c.m1166b();
            m1166b.m1167a("locale", str);
            C1513j c1513j = new C1513j(this.f4874a, str, new InterfaceC1515w() { // from class: c.b.u.v0.c
                @Override // p093c.p097b.p122u.InterfaceC1515w
                /* renamed from: a */
                public final boolean mo979a(String str2, int i) {
                    C1153a m1166b2 = C1153a.this.m1166b();
                    m1166b2.m1167a("word", str2);
                    m1166b2.m1167a("freq", Integer.toString(i));
                    return true;
                }
            });
            c1513j.m952l();
            c1513j.m954e();
        }
        return c1155c;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: c */
    public String mo972c() {
        return "UserDictionaryPrefsProvider";
    }
}