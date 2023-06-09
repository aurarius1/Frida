package p010b.p046j.p058l;

import android.os.Build;
import android.view.View;

/* renamed from: b.j.l.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC0572c0 {

    /* renamed from: a */
    public final int f2671a;

    /* renamed from: b */
    public final Class f2672b;

    /* renamed from: c */
    public final int f2673c;

    /* renamed from: d */
    public final int f2674d;

    public AbstractC0572c0(int i, Class cls, int i2) {
        this.f2671a = i;
        this.f2672b = cls;
        this.f2674d = 0;
        this.f2673c = i2;
    }

    public AbstractC0572c0(int i, Class cls, int i2, int i3) {
        this.f2671a = i;
        this.f2672b = cls;
        this.f2674d = i2;
        this.f2673c = i3;
    }

    /* renamed from: a */
    public boolean m2329a(Boolean bool, Boolean bool2) {
        return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
    }

    /* renamed from: b */
    public abstract Object mo2177b(View view);

    /* renamed from: c */
    public abstract void mo2176c(View view, Object obj);

    /* renamed from: d */
    public Object m2328d(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= this.f2673c) {
            return mo2177b(view);
        }
        if (i >= 19) {
            Object tag = view.getTag(this.f2671a);
            if (this.f2672b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public void m2327e(View view, Object obj) {
        int i = Build.VERSION.SDK_INT;
        if (i >= this.f2673c) {
            mo2176c(view, obj);
            return;
        }
        if ((i >= 19) && mo2175f(m2328d(view), obj)) {
            C0568b m2250h = AbstractC0605j0.m2250h(view);
            if (m2250h == null) {
                m2250h = new C0568b();
            }
            AbstractC0605j0.m2269N(view, m2250h);
            view.setTag(this.f2671a, obj);
            AbstractC0605j0.m2282A(view, this.f2674d);
        }
    }

    /* renamed from: f */
    public abstract boolean mo2175f(Object obj, Object obj2);
}