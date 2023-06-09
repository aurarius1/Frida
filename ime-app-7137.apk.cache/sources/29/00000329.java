package p010b.p067m.p068d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p011a.C0055e;
import p010b.p011a.C0059i;
import p010b.p011a.InterfaceC0060j;
import p010b.p011a.p013l.InterfaceC0068f;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p072o.AbstractC0779h;
import p010b.p072o.C0796y;
import p010b.p072o.InterfaceC0797z;

/* renamed from: b.m.d.c0 */
/* loaded from: classes.dex */
public class C0677c0 extends AbstractC0709k0 implements InterfaceC0797z, InterfaceC0060j, InterfaceC0068f, InterfaceC0706j1 {

    /* renamed from: b */
    public final Activity f2923b;

    /* renamed from: c */
    public final Context f2924c;

    /* renamed from: d */
    public final Handler f2925d;

    /* renamed from: e */
    public final C0690f1 f2926e;

    /* renamed from: f */
    public final /* synthetic */ AbstractActivityC0681d0 f2927f;

    public C0677c0(AbstractActivityC0681d0 abstractActivityC0681d0) {
        this.f2927f = abstractActivityC0681d0;
        Handler handler = new Handler();
        this.f2926e = new C0690f1();
        this.f2923b = abstractActivityC0681d0;
        AbstractC0022t.m3493h(abstractActivityC0681d0, "context == null");
        this.f2924c = abstractActivityC0681d0;
        AbstractC0022t.m3493h(handler, "handler == null");
        this.f2925d = handler;
    }

    @Override // p010b.p067m.p068d.InterfaceC0706j1
    /* renamed from: a */
    public void mo1915a(C0690f1 c0690f1, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        this.f2927f.m2100n();
    }

    @Override // p010b.p067m.p068d.AbstractC0709k0
    /* renamed from: c */
    public View mo1933c(int i) {
        return this.f2927f.findViewById(i);
    }

    @Override // p010b.p067m.p068d.AbstractC0709k0
    /* renamed from: d */
    public boolean mo1932d() {
        Window window = this.f2927f.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p010b.p072o.InterfaceC0797z
    /* renamed from: e */
    public C0796y mo1801e() {
        return this.f2927f.mo1801e();
    }

    /* renamed from: f */
    public C0055e m2106f() {
        return this.f2927f.f852h;
    }

    @Override // p010b.p072o.InterfaceC0782k
    /* renamed from: g */
    public AbstractC0779h mo1826g() {
        return this.f2927f.f2934j;
    }

    /* renamed from: h */
    public C0059i m2105h() {
        return this.f2927f.f851g;
    }

    /* renamed from: i */
    public void m2104i(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            Context context = this.f2924c;
            Object obj = AbstractC0472e.f2456a;
            if (Build.VERSION.SDK_INT >= 16) {
                context.startActivity(intent, bundle);
                return;
            } else {
                context.startActivity(intent);
                return;
            }
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
}