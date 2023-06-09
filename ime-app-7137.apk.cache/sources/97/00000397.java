package p010b.p072o;

import p010b.p067m.p068d.C0744t;

/* renamed from: b.o.p */
/* loaded from: classes.dex */
public abstract class AbstractC0787p {

    /* renamed from: a */
    public final C0744t f3292a;

    /* renamed from: b */
    public boolean f3293b;

    /* renamed from: c */
    public int f3294c = -1;

    /* renamed from: d */
    public final /* synthetic */ C0789r f3295d;

    public AbstractC0787p(C0789r c0789r, C0744t c0744t) {
        this.f3295d = c0789r;
        this.f3292a = c0744t;
    }

    /* renamed from: h */
    public void m1813h(boolean z) {
        if (z == this.f3293b) {
            return;
        }
        this.f3293b = z;
        C0789r c0789r = this.f3295d;
        int i = z ? 1 : -1;
        int i2 = c0789r.f3299d;
        c0789r.f3299d = i + i2;
        if (!c0789r.f3300e) {
            c0789r.f3300e = true;
            while (true) {
                try {
                    int i3 = c0789r.f3299d;
                    if (i2 == i3) {
                        break;
                    }
                    i2 = i3;
                } finally {
                    c0789r.f3300e = false;
                }
            }
        }
        if (this.f3293b) {
            this.f3295d.m1808c(this);
        }
    }

    /* renamed from: i */
    public void mo1812i() {
    }

    /* renamed from: j */
    public abstract boolean mo1811j();
}