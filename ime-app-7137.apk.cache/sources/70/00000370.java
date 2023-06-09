package p010b.p067m.p068d;

import android.app.Dialog;
import android.view.View;

/* renamed from: b.m.d.u */
/* loaded from: classes.dex */
public class C0748u extends AbstractC0709k0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0709k0 f3143a;

    /* renamed from: b */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0751v f3144b;

    public C0748u(DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v, AbstractC0709k0 abstractC0709k0) {
        this.f3144b = dialogInterface$OnCancelListenerC0751v;
        this.f3143a = abstractC0709k0;
    }

    @Override // p010b.p067m.p068d.AbstractC0709k0
    /* renamed from: c */
    public View mo1933c(int i) {
        if (this.f3143a.mo1932d()) {
            return this.f3143a.mo1933c(i);
        }
        Dialog dialog = this.f3144b.f3169h0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p010b.p067m.p068d.AbstractC0709k0
    /* renamed from: d */
    public boolean mo1932d() {
        return this.f3143a.mo1932d() || this.f3144b.f3173l0;
    }
}