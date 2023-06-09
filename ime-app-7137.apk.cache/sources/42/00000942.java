package p183e.p184a.p190p.p191a;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p199g.RunnableC2249n;
import p183e.p184a.p190p.p200h.AbstractC2262d;

/* renamed from: e.a.p.a.e */
/* loaded from: classes.dex */
public final class C2133e implements InterfaceC2112c, InterfaceC2130b {

    /* renamed from: b */
    public List f7027b;

    /* renamed from: c */
    public volatile boolean f7028c;

    @Override // p183e.p184a.p190p.p191a.InterfaceC2130b
    /* renamed from: a */
    public boolean mo119a(InterfaceC2112c interfaceC2112c) {
        if (interfaceC2112c != null) {
            if (this.f7028c) {
                return false;
            }
            synchronized (this) {
                if (this.f7028c) {
                    return false;
                }
                List list = this.f7027b;
                if (list != null && list.remove(interfaceC2112c)) {
                    return true;
                }
                return false;
            }
        }
        throw new NullPointerException("Disposable item is null");
    }

    @Override // p183e.p184a.p190p.p191a.InterfaceC2130b
    /* renamed from: b */
    public boolean mo118b(InterfaceC2112c interfaceC2112c) {
        if (mo119a(interfaceC2112c)) {
            ((RunnableC2249n) interfaceC2112c).mo35e();
            return true;
        }
        return false;
    }

    @Override // p183e.p184a.p190p.p191a.InterfaceC2130b
    /* renamed from: c */
    public boolean mo117c(InterfaceC2112c interfaceC2112c) {
        if (!this.f7028c) {
            synchronized (this) {
                if (!this.f7028c) {
                    List list = this.f7027b;
                    if (list == null) {
                        list = new LinkedList();
                        this.f7027b = list;
                    }
                    list.add(interfaceC2112c);
                    return true;
                }
            }
        }
        interfaceC2112c.mo35e();
        return false;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7028c) {
            return;
        }
        synchronized (this) {
            if (this.f7028c) {
                return;
            }
            this.f7028c = true;
            List<InterfaceC2112c> list = this.f7027b;
            ArrayList arrayList = null;
            this.f7027b = null;
            if (list == null) {
                return;
            }
            for (InterfaceC2112c interfaceC2112c : list) {
                try {
                    interfaceC2112c.mo35e();
                } catch (Throwable th) {
                    AbstractC1438d.m1039k(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new CompositeException(arrayList);
                }
                throw AbstractC2262d.m53a((Throwable) arrayList.get(0));
            }
        }
    }
}