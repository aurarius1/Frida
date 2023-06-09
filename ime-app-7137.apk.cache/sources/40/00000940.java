package p183e.p184a.p190p.p191a;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.p.a.c */
/* loaded from: classes.dex */
public enum EnumC2131c implements InterfaceC2112c {
    DISPOSED;

    /* renamed from: a */
    public static boolean m124a(AtomicReference atomicReference) {
        InterfaceC2112c interfaceC2112c;
        InterfaceC2112c interfaceC2112c2 = (InterfaceC2112c) atomicReference.get();
        EnumC2131c enumC2131c = DISPOSED;
        if (interfaceC2112c2 == enumC2131c || (interfaceC2112c = (InterfaceC2112c) atomicReference.getAndSet(enumC2131c)) == enumC2131c) {
            return false;
        }
        if (interfaceC2112c != null) {
            interfaceC2112c.mo35e();
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m123b(AtomicReference atomicReference, InterfaceC2112c interfaceC2112c) {
        InterfaceC2112c interfaceC2112c2;
        do {
            interfaceC2112c2 = (InterfaceC2112c) atomicReference.get();
            if (interfaceC2112c2 == DISPOSED) {
                if (interfaceC2112c != null) {
                    interfaceC2112c.mo35e();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(interfaceC2112c2, interfaceC2112c));
        return true;
    }

    /* renamed from: c */
    public static boolean m122c(AtomicReference atomicReference, InterfaceC2112c interfaceC2112c) {
        if (interfaceC2112c != null) {
            if (atomicReference.compareAndSet(null, interfaceC2112c)) {
                return true;
            }
            interfaceC2112c.mo35e();
            if (atomicReference.get() != DISPOSED) {
                AbstractC1438d.m1044f(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
            return false;
        }
        throw new NullPointerException("d is null");
    }

    /* renamed from: d */
    public static boolean m121d(InterfaceC2112c interfaceC2112c, InterfaceC2112c interfaceC2112c2) {
        if (interfaceC2112c2 == null) {
            AbstractC1438d.m1044f(new NullPointerException("next is null"));
            return false;
        } else if (interfaceC2112c != null) {
            interfaceC2112c2.mo35e();
            AbstractC1438d.m1044f(new ProtocolViolationException("Disposable already set!"));
            return false;
        } else {
            return true;
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
    }
}