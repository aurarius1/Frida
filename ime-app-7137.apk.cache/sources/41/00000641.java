package p093c.p097b.p122u;

import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import p093c.p097b.p105f0.AbstractC1216c;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.InterfaceC2095c;
import p183e.p184a.InterfaceC2096d;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p190p.p195e.p196a.C2179f1;
import p183e.p184a.p190p.p195e.p196a.C2195l;

/* renamed from: c.b.u.e0 */
/* loaded from: classes.dex */
public class C1469e0 extends ContentObserver {

    /* renamed from: a */
    public final WeakReference f4772a;

    public C1469e0(AbstractC1531x abstractC1531x) {
        super(new Handler(Looper.getMainLooper()));
        this.f4772a = new WeakReference(abstractC1531x);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        final AbstractC1531x abstractC1531x = (AbstractC1531x) this.f4772a.get();
        if (abstractC1531x == null || z || abstractC1531x.m953i()) {
            return;
        }
        abstractC1531x.m963s();
        AbstractC2094b m171G = AbstractC2094b.m146s(new InterfaceC2096d() { // from class: c.b.u.h
            @Override // p183e.p184a.InterfaceC2096d
            /* renamed from: a */
            public final void mo138a(InterfaceC2095c interfaceC2095c) {
                ((C2195l) interfaceC2095c).m92c(AbstractC1533z.this);
            }
        }).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.u.a
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                AbstractC1533z abstractC1533z = (AbstractC1533z) obj;
                abstractC1533z.m952l();
                return abstractC1533z;
            }
        }).m171G(AbstractC1216c.f4392b);
        AbstractC2101i abstractC2101i = AbstractC1216c.f4391a;
        if (abstractC2101i != null) {
            abstractC1531x.f4896f = new C2179f1(m171G, abstractC2101i).m164N(new InterfaceC2123e() { // from class: c.b.u.f
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AbstractC1533z abstractC1533z = (AbstractC1533z) obj;
                }
            }, new InterfaceC2123e() { // from class: c.b.u.c
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    ((Throwable) obj).getMessage();
                }
            }, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
            return;
        }
        throw new NullPointerException("scheduler is null");
    }
}