package p010b.p011a;

import p010b.p011a.p013l.C0066d;
import p010b.p011a.p013l.InterfaceC0064b;
import p010b.p011a.p013l.p014h.C0070a;

/* renamed from: b.a.c */
/* loaded from: classes.dex */
public class RunnableC0053c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f830b;

    /* renamed from: c */
    public final /* synthetic */ C0070a f831c;

    /* renamed from: d */
    public final /* synthetic */ C0055e f832d;

    public RunnableC0053c(C0055e c0055e, int i, C0070a c0070a) {
        this.f832d = c0055e;
        this.f830b = i;
        this.f831c = c0070a;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC0064b interfaceC0064b;
        C0055e c0055e = this.f832d;
        int i = this.f830b;
        Object obj = this.f831c.f865a;
        String str = (String) c0055e.f837b.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        c0055e.f840e.remove(str);
        C0066d c0066d = (C0066d) c0055e.f841f.get(str);
        if (c0066d != null && (interfaceC0064b = c0066d.f863a) != null) {
            interfaceC0064b.mo1841a(obj);
            return;
        }
        c0055e.f843h.remove(str);
        c0055e.f842g.put(str, obj);
    }
}