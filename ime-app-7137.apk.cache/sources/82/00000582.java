package p093c.p097b.p108i0.p110p.p112b2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p093c.p097b.p122u.InterfaceC1515w;
import p093c.p097b.p122u.p125w0.C1525j;

/* renamed from: c.b.i0.p.b2.e0 */
/* loaded from: classes.dex */
public class C1278e0 extends C1525j implements InterfaceC1308t0 {

    /* renamed from: r */
    public final List f4487r;

    public C1278e0(Context context, String str) {
        super(context, str);
        this.f4487r = new ArrayList();
    }

    @Override // p093c.p097b.p122u.p125w0.AbstractC1528m, p093c.p097b.p122u.AbstractC1531x
    /* renamed from: B */
    public void mo970B(final InterfaceC1515w interfaceC1515w) {
        this.f4487r.clear();
        super.mo970B(new InterfaceC1515w() { // from class: c.b.i0.p.b2.b
            @Override // p093c.p097b.p122u.InterfaceC1515w
            /* renamed from: a */
            public final boolean mo979a(String str, int i) {
                C1278e0 c1278e0 = C1278e0.this;
                InterfaceC1515w interfaceC1515w2 = interfaceC1515w;
                c1278e0.f4487r.add(new C1302q0(str, i));
                return interfaceC1515w2.mo979a(str, i);
            }
        });
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.InterfaceC1308t0
    /* renamed from: b */
    public List mo1128b() {
        return this.f4487r;
    }
}