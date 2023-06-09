package p010b.p016c.p026q;

import android.view.View;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0197n;

/* renamed from: b.c.q.k */
/* loaded from: classes.dex */
public class RunnableC0268k implements Runnable {

    /* renamed from: b */
    public C0283n f1630b;

    /* renamed from: c */
    public final /* synthetic */ C0298q f1631c;

    public RunnableC0268k(C0298q c0298q, C0283n c0283n) {
        this.f1631c = c0298q;
        this.f1630b = c0283n;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC0197n interfaceC0197n;
        C0199p c0199p = this.f1631c.f1705d;
        if (c0199p != null && (interfaceC0197n = c0199p.f1376f) != null) {
            interfaceC0197n.mo638b(c0199p);
        }
        View view = (View) this.f1631c.f1710i;
        if (view != null && view.getWindowToken() != null && this.f1630b.m2947f()) {
            this.f1631c.f1723v = this.f1630b;
        }
        this.f1631c.f1725x = null;
    }
}