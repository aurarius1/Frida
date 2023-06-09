package p010b.p046j.p058l;

import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import p010b.p016c.p017k.C0090b1;

/* renamed from: b.j.l.o0 */
/* loaded from: classes.dex */
public final class C0615o0 {

    /* renamed from: a */
    public WeakReference f2776a;

    /* renamed from: b */
    public int f2777b = -1;

    public C0615o0(View view) {
        this.f2776a = new WeakReference(view);
    }

    /* renamed from: a */
    public C0615o0 m2211a(float f) {
        View view = (View) this.f2776a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void m2210b() {
        View view = (View) this.f2776a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public C0615o0 m2209c(long j) {
        View view = (View) this.f2776a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: d */
    public C0615o0 m2208d(InterfaceC0617p0 interfaceC0617p0) {
        View view = (View) this.f2776a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, interfaceC0617p0);
                interfaceC0617p0 = new C0613n0(this);
            }
            m2207e(view, interfaceC0617p0);
        }
        return this;
    }

    /* renamed from: e */
    public final void m2207e(View view, InterfaceC0617p0 interfaceC0617p0) {
        if (interfaceC0617p0 != null) {
            view.animate().setListener(new C0609l0(this, interfaceC0617p0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: f */
    public C0615o0 m2206f(C0090b1 c0090b1) {
        View view = (View) this.f2776a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(c0090b1 != null ? new C0611m0(this, c0090b1, view) : null);
        }
        return this;
    }

    /* renamed from: g */
    public C0615o0 m2205g(float f) {
        View view = (View) this.f2776a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}