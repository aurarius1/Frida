package p010b.p016c.p024p.p025m;

import android.os.SystemClock;
import android.view.MenuItem;
import p010b.p016c.p026q.InterfaceC0249g2;

/* renamed from: b.c.p.m.h */
/* loaded from: classes.dex */
public class C0186h implements InterfaceC0249g2 {

    /* renamed from: b */
    public final /* synthetic */ View$OnKeyListenerC0190j f1300b;

    public C0186h(View$OnKeyListenerC0190j view$OnKeyListenerC0190j) {
        this.f1300b = view$OnKeyListenerC0190j;
    }

    @Override // p010b.p016c.p026q.InterfaceC0249g2
    /* renamed from: e */
    public void mo2814e(C0199p c0199p, MenuItem menuItem) {
        this.f1300b.f1314i.removeCallbacksAndMessages(null);
        int size = this.f1300b.f1316k.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0199p == ((C0188i) this.f1300b.f1316k.get(i)).f1302b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        this.f1300b.f1314i.postAtTime(new RunnableC0184g(this, i2 < this.f1300b.f1316k.size() ? (C0188i) this.f1300b.f1316k.get(i2) : null, menuItem, c0199p), c0199p, SystemClock.uptimeMillis() + 200);
    }

    @Override // p010b.p016c.p026q.InterfaceC0249g2
    /* renamed from: h */
    public void mo2813h(C0199p c0199p, MenuItem menuItem) {
        this.f1300b.f1314i.removeCallbacksAndMessages(c0199p);
    }
}