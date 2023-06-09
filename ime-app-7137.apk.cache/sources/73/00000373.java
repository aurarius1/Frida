package p010b.p067m.p068d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import p010b.p072o.AbstractC0787p;
import p010b.p072o.C0786o;
import p010b.p072o.C0789r;
import p010b.p072o.p073a0.AbstractC0771a;
import p010b.p072o.p074b0.AbstractC0773a;
import p010b.p085v.AbstractC1014a;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.v */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC0751v extends AbstractComponentCallbacksC0763z implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: W */
    public Handler f3158W;

    /* renamed from: f0 */
    public boolean f3167f0;

    /* renamed from: h0 */
    public Dialog f3169h0;

    /* renamed from: i0 */
    public boolean f3170i0;

    /* renamed from: j0 */
    public boolean f3171j0;

    /* renamed from: k0 */
    public boolean f3172k0;

    /* renamed from: X */
    public Runnable f3159X = new RunnableC0732q(this);

    /* renamed from: Y */
    public DialogInterface.OnCancelListener f3160Y = new DialogInterface$OnCancelListenerC0736r(this);

    /* renamed from: Z */
    public DialogInterface.OnDismissListener f3161Z = new DialogInterface$OnDismissListenerC0740s(this);

    /* renamed from: a0 */
    public int f3162a0 = 0;

    /* renamed from: b0 */
    public int f3163b0 = 0;

    /* renamed from: c0 */
    public boolean f3164c0 = true;

    /* renamed from: d0 */
    public boolean f3165d0 = true;

    /* renamed from: e0 */
    public int f3166e0 = -1;

    /* renamed from: g0 */
    public C0744t f3168g0 = new C0744t(this);

    /* renamed from: l0 */
    public boolean f3173l0 = false;

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Q */
    public void mo15Q(Context context) {
        super.mo15Q(context);
        C0789r c0789r = this.f3227T;
        C0744t c0744t = this.f3168g0;
        c0789r.getClass();
        C0789r.m1810a("observeForever");
        C0786o c0786o = new C0786o(c0789r, c0744t);
        AbstractC0787p abstractC0787p = (AbstractC0787p) c0789r.f3298c.mo2687d(c0744t, c0786o);
        if (!(abstractC0787p instanceof LiveData$LifecycleBoundObserver)) {
            if (abstractC0787p == null) {
                c0786o.m1813h(true);
            }
            if (this.f3172k0) {
                return;
            }
            this.f3171j0 = false;
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    /* renamed from: Q0 */
    public final void m1939Q0(boolean z, boolean z2) {
        if (this.f3171j0) {
            return;
        }
        this.f3171j0 = true;
        this.f3172k0 = false;
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3169h0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f3158W.getLooper()) {
                    onDismiss(this.f3169h0);
                } else {
                    this.f3158W.post(this.f3159X);
                }
            }
        }
        this.f3170i0 = true;
        if (this.f3166e0 >= 0) {
            C0690f1 m1853u = m1853u();
            int i = this.f3166e0;
            if (i >= 0) {
                m1853u.m2094C(new C0682d1(m1853u, null, i, 1), false);
                this.f3166e0 = -1;
                return;
            }
            throw new IllegalArgumentException(AbstractC1124a.m1193c("Bad id: ", i));
        }
        C0668a c0668a = new C0668a(m1853u());
        C0690f1 c0690f1 = this.f3248u;
        if (c0690f1 != null && c0690f1 != c0668a.f2913q) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            m1187i.append(toString());
            m1187i.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(m1187i.toString());
        }
        c0668a.m2122b(new C0726o1(3, this));
        if (z) {
            c0668a.m2118f(true);
        } else {
            c0668a.m2119e();
        }
    }

    /* renamed from: R0 */
    public Dialog mo14R0(Bundle bundle) {
        if (C0690f1.m2078S(3)) {
            String str = "onCreateDialog called for DialogFragment " + this;
        }
        return new Dialog(m1911B0(), this.f3163b0);
    }

    /* renamed from: S0 */
    public final Dialog m1938S0() {
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        this.f3158W = new Handler();
        this.f3165d0 = this.f3253z == 0;
        if (bundle != null) {
            this.f3162a0 = bundle.getInt("android:style", 0);
            this.f3163b0 = bundle.getInt("android:theme", 0);
            this.f3164c0 = bundle.getBoolean("android:cancelable", true);
            this.f3165d0 = bundle.getBoolean("android:showsDialog", this.f3165d0);
            this.f3166e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: T0 */
    public void mo1937T0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Z */
    public void mo1096Z() {
        this.f3214G = true;
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            this.f3170i0 = true;
            dialog.setOnDismissListener(null);
            this.f3169h0.dismiss();
            if (!this.f3171j0) {
                onDismiss(this.f3169h0);
            }
            this.f3169h0 = null;
            this.f3173l0 = false;
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: a0 */
    public void mo13a0() {
        this.f3214G = true;
        if (!this.f3172k0 && !this.f3171j0) {
            this.f3171j0 = true;
        }
        this.f3227T.m1807d(this.f3168g0);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: b0 */
    public LayoutInflater mo1880b0(Bundle bundle) {
        LayoutInflater m1857s = m1857s();
        boolean z = this.f3165d0;
        if (!z || this.f3167f0) {
            if (C0690f1.m2078S(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                boolean z2 = this.f3165d0;
            }
            return m1857s;
        }
        if (z && !this.f3173l0) {
            try {
                this.f3167f0 = true;
                Dialog mo14R0 = mo14R0(bundle);
                this.f3169h0 = mo14R0;
                if (this.f3165d0) {
                    mo1937T0(mo14R0, this.f3162a0);
                    Context m1866k = m1866k();
                    if (m1866k instanceof Activity) {
                        this.f3169h0.setOwnerActivity((Activity) m1866k);
                    }
                    this.f3169h0.setCancelable(this.f3164c0);
                    this.f3169h0.setOnCancelListener(this.f3160Y);
                    this.f3169h0.setOnDismissListener(this.f3161Z);
                    this.f3173l0 = true;
                } else {
                    this.f3169h0 = null;
                }
            } finally {
                this.f3167f0 = false;
            }
        }
        if (C0690f1.m2078S(2)) {
            String str2 = "get layout inflater for DialogFragment " + this + " from dialog context";
        }
        Dialog dialog = this.f3169h0;
        return dialog != null ? m1857s.cloneInContext(dialog.getContext()) : m1857s;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: c */
    public AbstractC0709k0 mo1879c() {
        return new C0748u(this, new C0754w(this));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f3162a0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3163b0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3164c0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3165d0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3166e0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            this.f3170i0 = false;
            dialog.show();
            View decorView = this.f3169h0.getWindow().getDecorView();
            decorView.setTag(AbstractC0771a.view_tree_lifecycle_owner, this);
            decorView.setTag(AbstractC0773a.view_tree_view_model_store_owner, this);
            decorView.setTag(AbstractC1014a.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f3170i0) {
            return;
        }
        if (C0690f1.m2078S(3)) {
            String str = "onDismiss called for DialogFragment " + this;
        }
        m1939Q0(true, true);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        this.f3214G = true;
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: r0 */
    public void mo1113r0(Bundle bundle) {
        Bundle bundle2;
        this.f3214G = true;
        if (this.f3169h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3169h0.onRestoreInstanceState(bundle2);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: t0 */
    public void mo1854t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1854t0(layoutInflater, viewGroup, bundle);
        if (this.f3216I != null || this.f3169h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3169h0.onRestoreInstanceState(bundle2);
    }
}