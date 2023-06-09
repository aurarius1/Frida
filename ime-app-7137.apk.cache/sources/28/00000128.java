package p010b.p016c.p024p;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0197n;
import p010b.p016c.p026q.C0298q;

/* renamed from: b.c.p.e */
/* loaded from: classes.dex */
public class C0164e extends AbstractC0161b implements InterfaceC0197n {

    /* renamed from: d */
    public Context f1199d;

    /* renamed from: e */
    public ActionBarContextView f1200e;

    /* renamed from: f */
    public InterfaceC0160a f1201f;

    /* renamed from: g */
    public WeakReference f1202g;

    /* renamed from: h */
    public boolean f1203h;

    /* renamed from: i */
    public C0199p f1204i;

    public C0164e(Context context, ActionBarContextView actionBarContextView, InterfaceC0160a interfaceC0160a, boolean z) {
        this.f1199d = context;
        this.f1200e = actionBarContextView;
        this.f1201f = interfaceC0160a;
        C0199p c0199p = new C0199p(actionBarContextView.getContext());
        c0199p.f1383m = 1;
        this.f1204i = c0199p;
        c0199p.f1376f = this;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: a */
    public boolean mo639a(C0199p c0199p, MenuItem menuItem) {
        return this.f1201f.mo2964b(this, menuItem);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: b */
    public void mo638b(C0199p c0199p) {
        mo2973i();
        C0298q c0298q = this.f1200e.f180e;
        if (c0298q != null) {
            c0298q.m2759q();
        }
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: c */
    public void mo2979c() {
        if (this.f1203h) {
            return;
        }
        this.f1203h = true;
        this.f1200e.sendAccessibilityEvent(32);
        this.f1201f.mo2962d(this);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: d */
    public View mo2978d() {
        WeakReference weakReference = this.f1202g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: e */
    public Menu mo2977e() {
        return this.f1204i;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: f */
    public MenuInflater mo2976f() {
        return new C0169j(this.f1200e.getContext());
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: g */
    public CharSequence mo2975g() {
        return this.f1200e.getSubtitle();
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: h */
    public CharSequence mo2974h() {
        return this.f1200e.getTitle();
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: i */
    public void mo2973i() {
        this.f1201f.mo2965a(this, this.f1204i);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: j */
    public boolean mo2972j() {
        return this.f1200e.f195t;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: k */
    public void mo2971k(View view) {
        this.f1200e.setCustomView(view);
        this.f1202g = view != null ? new WeakReference(view) : null;
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: l */
    public void mo2970l(int i) {
        this.f1200e.setSubtitle(this.f1199d.getString(i));
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: m */
    public void mo2969m(CharSequence charSequence) {
        this.f1200e.setSubtitle(charSequence);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: n */
    public void mo2968n(int i) {
        this.f1200e.setTitle(this.f1199d.getString(i));
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: o */
    public void mo2967o(CharSequence charSequence) {
        this.f1200e.setTitle(charSequence);
    }

    @Override // p010b.p016c.p024p.AbstractC0161b
    /* renamed from: p */
    public void mo2966p(boolean z) {
        this.f1193c = z;
        this.f1200e.setTitleOptional(z);
    }
}