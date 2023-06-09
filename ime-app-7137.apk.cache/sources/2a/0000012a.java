package p010b.p016c.p024p;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p010b.p016c.p024p.p025m.MenuC0185g0;
import p010b.p046j.p052g.p053a.InterfaceMenuC0526a;

/* renamed from: b.c.p.g */
/* loaded from: classes.dex */
public class C0166g extends ActionMode {

    /* renamed from: a */
    public final Context f1209a;

    /* renamed from: b */
    public final AbstractC0161b f1210b;

    public C0166g(Context context, AbstractC0161b abstractC0161b) {
        this.f1209a = context;
        this.f1210b = abstractC0161b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1210b.mo2979c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1210b.mo2978d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0185g0(this.f1209a, (InterfaceMenuC0526a) this.f1210b.mo2977e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1210b.mo2976f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1210b.mo2975g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1210b.f1192b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1210b.mo2974h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1210b.f1193c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1210b.mo2973i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1210b.mo2972j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1210b.mo2971k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f1210b.mo2970l(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1210b.mo2969m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1210b.f1192b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f1210b.mo2968n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1210b.mo2967o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1210b.mo2966p(z);
    }
}