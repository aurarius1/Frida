package p204f.p205a.p209b;

import android.content.Context;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;

/* renamed from: f.a.b.g */
/* loaded from: classes.dex */
public class C2296g {

    /* renamed from: a */
    public static final int f7446a = AbstractC2298i.progress_dialog_message_text_view;

    /* renamed from: b */
    public final Context f7447b;

    /* renamed from: c */
    public final InterfaceC2293d f7448c;

    /* renamed from: d */
    public DialogInterfaceC0121q f7449d;

    public C2296g(Context context, InterfaceC2293d interfaceC2293d) {
        this.f7447b = context;
        this.f7448c = interfaceC2293d;
    }

    public C2296g(Context context, InterfaceC2294e interfaceC2294e) {
        C2295f c2295f = new C2295f(interfaceC2294e);
        this.f7447b = context;
        this.f7448c = c2295f;
    }

    /* renamed from: a */
    public boolean m21a() {
        DialogInterfaceC0121q dialogInterfaceC0121q = this.f7449d;
        if (dialogInterfaceC0121q != null) {
            dialogInterfaceC0121q.dismiss();
            this.f7449d = null;
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m20b(int i, Object obj) {
        m21a();
        C0119p c0119p = new C0119p(this.f7447b, AbstractC2300k.Theme_AppCompat_Dialog_Alert);
        this.f7448c.mo23a(c0119p, i, obj);
        DialogInterfaceC0121q m3063a = c0119p.m3063a();
        this.f7449d = m3063a;
        m3063a.getWindow().getDecorView().setTag(f7446a, "GeneralDialogController");
        this.f7448c.mo22b(this.f7449d, obj);
        this.f7449d.show();
    }
}