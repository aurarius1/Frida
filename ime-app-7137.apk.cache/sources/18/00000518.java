package p093c.p097b.p100c0;

import java.util.Map;
import p093c.p097b.p100c0.p101b0.C1153a;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.InterfaceC1154b;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2120b;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2128j;

/* renamed from: c.b.c0.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C1172p implements InterfaceC2120b {

    /* renamed from: a */
    public static final /* synthetic */ C1172p f4298a = new C1172p();

    @Override // p183e.p184a.p189o.InterfaceC2120b
    /* renamed from: a */
    public final void mo128a(Object obj, Object obj2) {
        final InterfaceC1154b interfaceC1154b = (InterfaceC1154b) obj;
        AbstractC2094b.m174D(((C1155c) obj2).m1165c()).m140y(new InterfaceC2128j() { // from class: c.b.c0.f
            @Override // p183e.p184a.p189o.InterfaceC2128j
            /* renamed from: a */
            public final boolean mo40a(Object obj3) {
                return InterfaceC1154b.this.mo972c().equals((String) ((C1153a) obj3).f4276a.get("providerId"));
            }
        }).m156i(new InterfaceC2123e() { // from class: c.b.c0.g
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj3) {
                InterfaceC1154b interfaceC1154b2 = InterfaceC1154b.this;
                C1153a c1153a = (C1153a) obj3;
                C1155c c1155c = new C1155c(Integer.parseInt((String) c1153a.f4276a.get("version")));
                C1153a c1153a2 = (C1153a) c1153a.m1165c().iterator().next();
                for (Map.Entry entry : c1153a2.m1164d()) {
                    c1155c.m1167a((String) entry.getKey(), (String) entry.getValue());
                }
                for (C1153a c1153a3 : c1153a2.m1165c()) {
                    c1155c.f4277b.add(c1153a3);
                }
                interfaceC1154b2.mo974a(c1155c);
            }
        });
    }
}