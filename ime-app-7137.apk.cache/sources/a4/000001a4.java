package p010b.p016c.p026q;

import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0177c0;
import p010b.p016c.p024p.p025m.SubMenuC0195l0;

/* renamed from: b.c.q.o */
/* loaded from: classes.dex */
public class C0288o implements InterfaceC0177c0 {

    /* renamed from: b */
    public final /* synthetic */ C0298q f1672b;

    public C0288o(C0298q c0298q) {
        this.f1672b = c0298q;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: a */
    public void mo2734a(C0199p c0199p, boolean z) {
        if (c0199p instanceof SubMenuC0195l0) {
            c0199p.mo2928k().m2936c(false);
        }
        InterfaceC0177c0 interfaceC0177c0 = this.f1672b.f1707f;
        if (interfaceC0177c0 != null) {
            interfaceC0177c0.mo2734a(c0199p, z);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: b */
    public boolean mo2733b(C0199p c0199p) {
        C0298q c0298q = this.f1672b;
        if (c0199p == c0298q.f1705d) {
            return false;
        }
        c0298q.f1702A = ((SubMenuC0195l0) c0199p).f1363A.f1404a;
        InterfaceC0177c0 interfaceC0177c0 = c0298q.f1707f;
        if (interfaceC0177c0 != null) {
            return interfaceC0177c0.mo2733b(c0199p);
        }
        return false;
    }
}