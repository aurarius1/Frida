package p093c.p097b.p108i0.p110p.p112b2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p093c.p097b.p122u.InterfaceC1515w;
import p093c.p097b.p122u.p123u0.C1501a;

/* renamed from: c.b.i0.p.b2.s0 */
/* loaded from: classes.dex */
public class C1306s0 extends C1501a implements InterfaceC1308t0 {

    /* renamed from: q */
    public final List f4521q;

    public C1306s0(Context context, String str) {
        super(context, str);
        this.f4521q = new ArrayList();
    }

    @Override // p093c.p097b.p122u.p123u0.C1501a, p093c.p097b.p122u.AbstractC1531x
    /* renamed from: B */
    public void mo970B(final InterfaceC1515w interfaceC1515w) {
        this.f4521q.clear();
        super.mo970B(new InterfaceC1515w() { // from class: c.b.i0.p.b2.m
            @Override // p093c.p097b.p122u.InterfaceC1515w
            /* renamed from: a */
            public final boolean mo979a(String str, int i) {
                C1306s0 c1306s0 = C1306s0.this;
                InterfaceC1515w interfaceC1515w2 = interfaceC1515w;
                c1306s0.f4521q.add(new C1302q0(str, i));
                return interfaceC1515w2.mo979a(str, i);
            }
        });
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.InterfaceC1308t0
    /* renamed from: b */
    public List mo1128b() {
        return this.f4521q;
    }
}