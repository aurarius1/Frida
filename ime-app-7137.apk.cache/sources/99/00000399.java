package p010b.p072o;

import android.view.View;
import java.util.Map;
import p010b.p027d.p028a.p029a.C0348a;
import p010b.p027d.p028a.p030b.C0356e;
import p010b.p027d.p028a.p030b.C0359h;
import p010b.p067m.p068d.C0690f1;
import p010b.p067m.p068d.C0744t;
import p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.o.r */
/* loaded from: classes.dex */
public class C0789r {

    /* renamed from: a */
    public static final Object f3296a = new Object();

    /* renamed from: b */
    public final Object f3297b = new Object();

    /* renamed from: c */
    public C0359h f3298c = new C0359h();

    /* renamed from: d */
    public int f3299d = 0;

    /* renamed from: e */
    public boolean f3300e;

    /* renamed from: f */
    public volatile Object f3301f;

    /* renamed from: g */
    public volatile Object f3302g;

    /* renamed from: h */
    public int f3303h;

    /* renamed from: i */
    public boolean f3304i;

    /* renamed from: j */
    public boolean f3305j;

    public C0789r() {
        Object obj = f3296a;
        this.f3302g = obj;
        this.f3301f = obj;
        this.f3303h = -1;
    }

    /* renamed from: a */
    public static void m1810a(String str) {
        if (!C0348a.m2695b().mo2694a()) {
            throw new IllegalStateException(AbstractC1124a.m1189g("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1809b(AbstractC0787p abstractC0787p) {
        if (abstractC0787p.f3293b) {
            if (!abstractC0787p.mo1811j()) {
                abstractC0787p.m1813h(false);
                return;
            }
            int i = abstractC0787p.f3294c;
            int i2 = this.f3303h;
            if (i >= i2) {
                return;
            }
            abstractC0787p.f3294c = i2;
            C0744t c0744t = abstractC0787p.f3292a;
            Object obj = this.f3301f;
            c0744t.getClass();
            if (((InterfaceC0782k) obj) != null) {
                DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v = c0744t.f3132a;
                if (dialogInterface$OnCancelListenerC0751v.f3165d0) {
                    View m1909C0 = dialogInterface$OnCancelListenerC0751v.m1909C0();
                    if (m1909C0.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (c0744t.f3132a.f3169h0 != null) {
                        if (C0690f1.m2078S(3)) {
                            String str = "DialogFragment " + c0744t + " setting the content view on " + c0744t.f3132a.f3169h0;
                        }
                        c0744t.f3132a.f3169h0.setContentView(m1909C0);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m1808c(AbstractC0787p abstractC0787p) {
        if (this.f3304i) {
            this.f3305j = true;
            return;
        }
        this.f3304i = true;
        do {
            this.f3305j = false;
            if (abstractC0787p == null) {
                C0356e m2689b = this.f3298c.m2689b();
                while (m2689b.hasNext()) {
                    m1809b((AbstractC0787p) ((Map.Entry) m2689b.next()).getValue());
                    if (this.f3305j) {
                        break;
                    }
                }
            } else {
                m1809b(abstractC0787p);
                abstractC0787p = null;
            }
        } while (this.f3305j);
        this.f3304i = false;
    }

    /* renamed from: d */
    public void m1807d(C0744t c0744t) {
        m1810a("removeObserver");
        AbstractC0787p abstractC0787p = (AbstractC0787p) this.f3298c.mo2686e(c0744t);
        if (abstractC0787p == null) {
            return;
        }
        abstractC0787p.mo1812i();
        abstractC0787p.m1813h(false);
    }

    /* renamed from: e */
    public void m1806e(Object obj) {
        m1810a("setValue");
        this.f3303h++;
        this.f3301f = obj;
        m1808c(null);
    }
}