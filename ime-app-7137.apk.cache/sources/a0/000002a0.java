package p010b.p046j.p055i;

import java.util.ArrayList;
import p010b.p036g.C0390n;
import p010b.p046j.p057k.InterfaceC0560a;

/* renamed from: b.j.i.j */
/* loaded from: classes.dex */
public class C0540j implements InterfaceC0560a {

    /* renamed from: a */
    public final /* synthetic */ String f2605a;

    public C0540j(String str) {
        this.f2605a = str;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // p010b.p046j.p057k.InterfaceC0560a
    /* renamed from: a */
    public void accept(C0541k c0541k) {
        synchronized (AbstractC0542l.f2610c) {
            C0390n c0390n = AbstractC0542l.f2611d;
            ArrayList arrayList = (ArrayList) c0390n.get(this.f2605a);
            if (arrayList == null) {
                return;
            }
            c0390n.remove(this.f2605a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((InterfaceC0560a) arrayList.get(i)).accept(c0541k);
            }
        }
    }
}