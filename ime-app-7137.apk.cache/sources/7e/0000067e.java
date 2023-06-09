package p093c.p097b.p122u.p125w0;

import android.content.Context;
import com.menny.android.anysoftkeyboard.AnyApplication;
import p010b.p046j.p057k.C0561b;
import p093c.p097b.p100c0.p101b0.C1153a;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.InterfaceC1154b;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.C1461a0;
import p093c.p097b.p122u.InterfaceC1515w;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: c.b.u.w0.o */
/* loaded from: classes.dex */
public class C1530o implements InterfaceC1154b {

    /* renamed from: a */
    public final Context f4893a;

    /* renamed from: b */
    public final String f4894b;

    /* renamed from: c */
    public final Iterable f4895c;

    public C1530o(Context context, String str) {
        C1450g c1450g = AnyApplication.f6979b;
        Iterable m158f = AbstractC2094b.m174D(((AnyApplication) context.getApplicationContext()).f6983f.m1059e()).m172F(new InterfaceC2127i() { // from class: c.b.u.w0.b
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                return ((C1461a0) obj).f4760k;
            }
        }).m145t().m158f();
        this.f4893a = context;
        this.f4894b = str;
        this.f4895c = m158f;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: a */
    public void mo974a(C1155c c1155c) {
        AbstractC2094b.m174D(c1155c.m1165c()).m172F(new InterfaceC2127i() { // from class: c.b.u.w0.c
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C1530o c1530o = C1530o.this;
                C1153a c1153a = (C1153a) obj;
                c1530o.getClass();
                return new C0561b(new C1529n(c1530o.f4893a, c1530o.f4894b, (String) c1153a.f4276a.get("locale")), AbstractC2094b.m174D(c1153a.m1165c()));
            }
        }).m156i(new InterfaceC2123e() { // from class: c.b.u.w0.h
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                final C0561b c0561b = (C0561b) obj;
                ((AbstractC2094b) c0561b.f2655b).m156i(new InterfaceC2123e() { // from class: c.b.u.w0.d
                    @Override // p183e.p184a.p189o.InterfaceC2123e
                    public final void accept(Object obj2) {
                        C1153a c1153a = (C1153a) obj2;
                        ((C1529n) C0561b.this.f2654a).m976a((String) c1153a.f4276a.get("word"), Integer.parseInt((String) c1153a.f4276a.get("freq")));
                    }
                });
            }
        });
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: b */
    public C1155c mo973b() {
        final C1155c c1155c = new C1155c(1);
        AbstractC2094b.m174D(this.f4895c).m172F(new InterfaceC2127i() { // from class: c.b.u.w0.f
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C1530o c1530o = C1530o.this;
                C1155c c1155c2 = c1155c;
                String str = (String) obj;
                c1530o.getClass();
                C1153a m1166b = c1155c2.m1166b();
                m1166b.m1167a("locale", str);
                return new C0561b(m1166b, new C1529n(c1530o.f4893a, c1530o.f4894b, str));
            }
        }).m156i(new InterfaceC2123e() { // from class: c.b.u.w0.g
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                final C0561b c0561b = (C0561b) obj;
                ((C1529n) c0561b.f2655b).m975b(new InterfaceC1515w() { // from class: c.b.u.w0.e
                    @Override // p093c.p097b.p122u.InterfaceC1515w
                    /* renamed from: a */
                    public final boolean mo979a(String str, int i) {
                        C1153a m1166b = ((C1153a) C0561b.this.f2654a).m1166b();
                        m1166b.m1167a("word", str);
                        m1166b.m1167a("freq", Integer.toString(i));
                        return true;
                    }
                });
            }
        });
        return c1155c;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: c */
    public String mo972c() {
        return "WordsSQLiteConnectionPrefsProvider";
    }
}