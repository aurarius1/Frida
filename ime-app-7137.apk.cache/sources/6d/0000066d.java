package p093c.p097b.p122u.p124v0;

import android.content.Context;
import p093c.p097b.p122u.C1497s0;
import p093c.p097b.p122u.InterfaceC1515w;
import p093c.p097b.p122u.p123u0.C1501a;
import p093c.p097b.p122u.p125w0.C1527l;

/* renamed from: c.b.u.v0.j */
/* loaded from: classes.dex */
public class C1513j extends C1497s0 {

    /* renamed from: j */
    public final InterfaceC1515w f4873j;

    public C1513j(Context context, String str, InterfaceC1515w interfaceC1515w) {
        super(context, str);
        this.f4873j = interfaceC1515w;
    }

    @Override // p093c.p097b.p122u.C1497s0
    /* renamed from: p */
    public C1501a mo981p(Context context, String str) {
        return new C1511h(context, str, this.f4873j);
    }

    @Override // p093c.p097b.p122u.C1497s0
    /* renamed from: q */
    public C1527l mo980q(Context context, String str) {
        return new C1512i(context, str, this.f4873j);
    }
}