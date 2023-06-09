package p183e.p184a.p190p.p195e.p196a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p198f.C2235b;
import p183e.p184a.p190p.p200h.AbstractC2262d;

/* renamed from: e.a.p.e.a.b */
/* loaded from: classes.dex */
public final class C2165b extends AtomicReference implements InterfaceC2098f, Iterator, InterfaceC2112c {

    /* renamed from: b */
    public final C2235b f7075b;

    /* renamed from: c */
    public final Lock f7076c;

    /* renamed from: d */
    public final Condition f7077d;

    /* renamed from: e */
    public volatile boolean f7078e;

    /* renamed from: f */
    public volatile Throwable f7079f;

    public C2165b(int i) {
        this.f7075b = new C2235b(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f7076c = reentrantLock;
        this.f7077d = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public void m104a() {
        this.f7076c.lock();
        try {
            this.f7077d.signalAll();
        } finally {
            this.f7076c.unlock();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7079f = th;
        this.f7078e = true;
        m104a();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this, interfaceC2112c);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7078e = true;
        m104a();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        EnumC2131c.m124a(this);
        m104a();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7075b.mo68f(obj);
        m104a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0057, code lost:
        continue;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasNext() {
        EnumC2131c enumC2131c = EnumC2131c.DISPOSED;
        while (true) {
            if (((InterfaceC2112c) get()) == enumC2131c) {
                Throwable th = this.f7079f;
                if (th == null) {
                    return false;
                }
                throw AbstractC2262d.m53a(th);
            }
            boolean z = this.f7078e;
            boolean isEmpty = this.f7075b.isEmpty();
            if (z) {
                Throwable th2 = this.f7079f;
                if (th2 != null) {
                    throw AbstractC2262d.m53a(th2);
                }
                if (isEmpty) {
                    return false;
                }
            }
            if (!isEmpty) {
                return true;
            }
            try {
                this.f7076c.lock();
                while (!this.f7078e && this.f7075b.isEmpty()) {
                    if (!(((InterfaceC2112c) get()) == enumC2131c)) {
                        this.f7077d.await();
                    }
                }
                this.f7076c.unlock();
            } catch (InterruptedException e) {
                EnumC2131c.m124a(this);
                m104a();
                throw AbstractC2262d.m53a(e);
            }
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            return this.f7075b.mo69a();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}