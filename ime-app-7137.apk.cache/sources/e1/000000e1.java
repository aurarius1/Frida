package p010b.p016c.p017k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.C0169j;
import p010b.p016c.p024p.InterfaceC0160a;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0197n;
import p010b.p016c.p026q.C0215a4;
import p010b.p016c.p026q.C0298q;

/* renamed from: b.c.k.c1 */
/* loaded from: classes.dex */
public class C0093c1 extends AbstractC0161b implements InterfaceC0197n {

    /* renamed from: d */
    public final Context f874d;

    /* renamed from: e */
    public final C0199p f875e;

    /* renamed from: f */
    public InterfaceC0160a f876f;

    /* renamed from: g */
    public WeakReference f877g;

    /* renamed from: h */
    public final /* synthetic */ C0096d1 f878h;

    public C0093c1(C0096d1 c0096d1, Context context, InterfaceC0160a interfaceC0160a) {
        this.f878h = c0096d1;
        this.f874d = context;
        this.f876f = interfaceC0160a;
        C0199p c0199p = new C0199p(context);
        c0199p.f1383m = 1;
        this.f875e = c0199p;
        c0199p.f1376f = this;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: a */
    public boolean mo639a(C0199p c0199p, MenuItem menuItem) {
        InterfaceC0160a interfaceC0160a = this.f876f;
        if (interfaceC0160a != null) {
            return interfaceC0160a.mo2964b(this, menuItem);
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: b */
    public void mo638b(C0199p c0199p) {
        if (this.f876f == null) {
            return;
        }
        mo2973i();
        C0298q c0298q = this.f878h.f889h.f180e;
        if (c0298q != null) {
            c0298q.m2759q();
        }
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: c */
    public void mo2979c() {
        C0096d1 c0096d1 = this.f878h;
        if (c0096d1.f892k != this) {
            return;
        }
        if (!c0096d1.f900s) {
            this.f876f.mo2962d(this);
        } else {
            c0096d1.f893l = this;
            c0096d1.f894m = this.f876f;
        }
        this.f876f = null;
        this.f878h.m3081d(false);
        ActionBarContextView actionBarContextView = this.f878h.f889h;
        if (actionBarContextView.f187l == null) {
            actionBarContextView.m3439e();
        }
        ((C0215a4) this.f878h.f888g).f1458a.sendAccessibilityEvent(32);
        C0096d1 c0096d12 = this.f878h;
        c0096d12.f886e.setHideOnContentScrollEnabled(c0096d12.f905x);
        this.f878h.f892k = null;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: d */
    public View mo2978d() {
        WeakReference weakReference = this.f877g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: e */
    public Menu mo2977e() {
        return this.f875e;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: f */
    public MenuInflater mo2976f() {
        return new C0169j(this.f874d);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: g */
    public CharSequence mo2975g() {
        return this.f878h.f889h.getSubtitle();
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: h */
    public CharSequence mo2974h() {
        return this.f878h.f889h.getTitle();
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: i */
    public void mo2973i() {
        if (this.f878h.f892k != this) {
            return;
        }
        this.f875e.m2938A();
        try {
            this.f876f.mo2965a(this, this.f875e);
        } finally {
            this.f875e.m2913z();
        }
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: j */
    public boolean mo2972j() {
        return this.f878h.f889h.f195t;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: k */
    public void mo2971k(View view) {
        this.f878h.f889h.setCustomView(view);
        this.f877g = new WeakReference(view);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: l */
    public void mo2970l(int i) {
        this.f878h.f889h.setSubtitle(this.f878h.f884c.getResources().getString(i));
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: m */
    public void mo2969m(CharSequence charSequence) {
        this.f878h.f889h.setSubtitle(charSequence);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: n */
    public void mo2968n(int i) {
        this.f878h.f889h.setTitle(this.f878h.f884c.getResources().getString(i));
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: o */
    public void mo2967o(CharSequence charSequence) {
        this.f878h.f889h.setTitle(charSequence);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: p */
    public void mo2966p(boolean z) {
        this.f1193c = z;
        this.f878h.f889h.setTitleOptional(z);
    }
}