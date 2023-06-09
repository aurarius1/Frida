package p010b.p046j.p054h;

/* renamed from: b.j.h.b */
/* loaded from: classes.dex */
public final class C0529b {

    /* renamed from: a */
    public boolean f2581a;

    /* renamed from: b */
    public InterfaceC0528a f2582b;

    /* renamed from: c */
    public boolean f2583c;

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: a */
    public void m2350a() {
        synchronized (this) {
            if (this.f2581a) {
                return;
            }
            this.f2581a = true;
            this.f2583c = true;
            InterfaceC0528a interfaceC0528a = this.f2582b;
            if (interfaceC0528a != null) {
                try {
                    interfaceC0528a.mo1968a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2583c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f2583c = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public void m2349b(InterfaceC0528a interfaceC0528a) {
        synchronized (this) {
            while (this.f2583c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f2582b == interfaceC0528a) {
                return;
            }
            this.f2582b = interfaceC0528a;
            if (this.f2581a) {
                interfaceC0528a.mo1968a();
            }
        }
    }
}