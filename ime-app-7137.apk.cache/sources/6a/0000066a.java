package p093c.p097b.p122u.p124v0;

import android.text.TextUtils;
import p010b.p046j.p057k.C0561b;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p100c0.p101b0.C1153a;
import p093c.p097b.p117q.AbstractC1438d;
import p093c.p097b.p122u.C1497s0;
import p093c.p097b.p122u.InterfaceC1515w;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.u.v0.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C1510g implements InterfaceC2123e {

    /* renamed from: b */
    public final /* synthetic */ C1514k f4870b;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c.b.i0.p.b2.y.a(java.lang.Object):java.lang.Object, c.b.u.v0.k.a(c.b.c0.b0.c):void] */
    public /* synthetic */ C1510g(C1514k c1514k) {
        this.f4870b = c1514k;
    }

    @Override // p183e.p184a.p189o.InterfaceC2123e
    public final void accept(Object obj) {
        C1514k c1514k = this.f4870b;
        C1153a c1153a = (C1153a) obj;
        c1514k.getClass();
        String str = (String) c1153a.f4276a.get("locale");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final C1513j c1513j = new C1513j(c1514k.f4874a, str, new InterfaceC1515w() { // from class: c.b.u.v0.e
            @Override // p093c.p097b.p122u.InterfaceC1515w
            /* renamed from: a */
            public final boolean mo979a(String str2, int i) {
                return false;
            }
        });
        c1513j.m952l();
        AbstractC1438d.m1040j(AbstractC2094b.m174D(c1153a.m1165c()).m172F(new InterfaceC2127i() { // from class: c.b.u.v0.b
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj2) {
                C1153a c1153a2 = (C1153a) obj2;
                return new C0561b((String) c1153a2.f4276a.get("word"), Integer.valueOf(Integer.parseInt((String) c1153a2.f4276a.get("freq"))));
            }
        }), new InterfaceC2123e() { // from class: c.b.u.v0.f
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj2) {
                C1497s0 c1497s0 = C1497s0.this;
                C0561b c0561b = (C0561b) obj2;
                if (c1497s0.mo968n((String) c0561b.f2654a, ((Integer) c0561b.f2655b).intValue())) {
                    return;
                }
                StringBuilder m1187i = AbstractC1124a.m1187i("Failed to add word to dictionary. Word: ");
                m1187i.append((String) c0561b.f2654a);
                m1187i.append(", dictionary is closed? ");
                m1187i.append(c1497s0.m953i());
                throw new RuntimeException(m1187i.toString());
            }
        }, new InterfaceC2123e() { // from class: c.b.u.v0.a
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj2) {
                ((Throwable) obj2).printStackTrace();
            }
        }, AbstractC2146l.f7038c);
        c1513j.m954e();
    }
}