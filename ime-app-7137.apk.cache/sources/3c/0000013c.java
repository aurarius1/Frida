package p010b.p016c.p024p.p025m;

import android.view.MenuItem;

/* renamed from: b.c.p.m.g */
/* loaded from: classes.dex */
public class RunnableC0184g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0188i f1295b;

    /* renamed from: c */
    public final /* synthetic */ MenuItem f1296c;

    /* renamed from: d */
    public final /* synthetic */ C0199p f1297d;

    /* renamed from: e */
    public final /* synthetic */ C0186h f1298e;

    public RunnableC0184g(C0186h c0186h, C0188i c0188i, MenuItem menuItem, C0199p c0199p) {
        this.f1298e = c0186h;
        this.f1295b = c0188i;
        this.f1296c = menuItem;
        this.f1297d = c0199p;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0188i c0188i = this.f1295b;
        if (c0188i != null) {
            this.f1298e.f1300b.f1308C = true;
            c0188i.f1302b.m2936c(false);
            this.f1298e.f1300b.f1308C = false;
        }
        if (this.f1296c.isEnabled() && this.f1296c.hasSubMenu()) {
            this.f1297d.m2921r(this.f1296c, 4);
        }
    }
}