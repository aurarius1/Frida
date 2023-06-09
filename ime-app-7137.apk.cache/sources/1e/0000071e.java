package p093c.p097b.p130z;

import android.content.Context;
import android.content.res.XmlResourceParser;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p097b.p130z.p132r0.C1738o0;

/* renamed from: c.b.z.q */
/* loaded from: classes.dex */
public class C1690q extends Key {

    /* renamed from: J */
    public final int f5245J;

    public C1690q(InterfaceC1423a interfaceC1423a, Context context, C1667e0 c1667e0, InterfaceC1677j0 interfaceC1677j0, int i, int i2, XmlResourceParser xmlResourceParser) {
        super(interfaceC1423a, context, c1667e0, interfaceC1677j0, i, i2, xmlResourceParser);
        this.f5245J = this.height;
    }

    @Override // p093c.p097b.p130z.Key
    /* renamed from: a */
    public void mo892a() {
        this.height = 0;
        super.mo892a();
    }

    @Override // p093c.p097b.p130z.Key
    /* renamed from: c */
    public int[] mo891c(C1738o0 c1738o0) {
        return this.f5229l ? c1738o0.f5353m : c1738o0.f5352l;
    }
}