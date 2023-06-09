package p010b.p016c.p017k;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p010b.p036g.C0380d;

/* renamed from: b.c.k.v */
/* loaded from: classes.dex */
public abstract class AbstractC0131v {

    /* renamed from: b */
    public static int f1100b = -100;

    /* renamed from: c */
    public static final C0380d f1101c = new C0380d(0);

    /* renamed from: d */
    public static final Object f1102d = new Object();

    /* renamed from: j */
    public static void m3009j(AbstractC0131v abstractC0131v) {
        synchronized (f1102d) {
            Iterator it = f1101c.iterator();
            while (it.hasNext()) {
                AbstractC0131v abstractC0131v2 = (AbstractC0131v) ((WeakReference) it.next()).get();
                if (abstractC0131v2 == abstractC0131v || abstractC0131v2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: o */
    public static void m3004o(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f1100b != i) {
            f1100b = i;
            synchronized (f1102d) {
                Iterator it = f1101c.iterator();
                while (it.hasNext()) {
                    AbstractC0131v abstractC0131v = (AbstractC0131v) ((WeakReference) it.next()).get();
                    if (abstractC0131v != null) {
                        abstractC0131v.mo3015d();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public abstract void mo3016c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public abstract boolean mo3015d();

    /* renamed from: e */
    public abstract void mo3014e();

    /* renamed from: f */
    public abstract void mo3013f();

    /* renamed from: g */
    public abstract void mo3012g(Bundle bundle);

    /* renamed from: h */
    public abstract void mo3011h();

    /* renamed from: i */
    public abstract void mo3010i();

    /* renamed from: k */
    public abstract boolean mo3008k(int i);

    /* renamed from: l */
    public abstract void mo3007l(int i);

    /* renamed from: m */
    public abstract void mo3006m(View view);

    /* renamed from: n */
    public abstract void mo3005n(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: p */
    public abstract void mo3003p(CharSequence charSequence);
}