package p010b.p016c.p026q;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ListAdapter;
import android.widget.ListView;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;

/* renamed from: b.c.q.s0 */
/* loaded from: classes.dex */
public class DialogInterface$OnClickListenerC0309s0 implements InterfaceC0344z0, DialogInterface.OnClickListener {

    /* renamed from: b */
    public DialogInterfaceC0121q f1757b;

    /* renamed from: c */
    public ListAdapter f1758c;

    /* renamed from: d */
    public CharSequence f1759d;

    /* renamed from: e */
    public final /* synthetic */ C0212a1 f1760e;

    public DialogInterface$OnClickListenerC0309s0(C0212a1 c0212a1) {
        this.f1760e = c0212a1;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: a */
    public void mo2707a(int i) {
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: b */
    public boolean mo2706b() {
        DialogInterfaceC0121q dialogInterfaceC0121q = this.f1757b;
        if (dialogInterfaceC0121q != null) {
            return dialogInterfaceC0121q.isShowing();
        }
        return false;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: c */
    public int mo2705c() {
        return 0;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: d */
    public void mo2704d(int i, int i2) {
        if (this.f1758c == null) {
            return;
        }
        C0119p c0119p = new C0119p(this.f1760e.getPopupContext());
        CharSequence charSequence = this.f1759d;
        if (charSequence != null) {
            c0119p.f1026a.f940e = charSequence;
        }
        ListAdapter listAdapter = this.f1758c;
        int selectedItemPosition = this.f1760e.getSelectedItemPosition();
        C0111l c0111l = c0119p.f1026a;
        c0111l.f952q = listAdapter;
        c0111l.f953r = this;
        c0111l.f958w = selectedItemPosition;
        c0111l.f957v = true;
        DialogInterfaceC0121q m3063a = c0119p.m3063a();
        this.f1757b = m3063a;
        ListView listView = m3063a.f1084d.f1005g;
        if (Build.VERSION.SDK_INT >= 17) {
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
        }
        this.f1757b.show();
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    public void dismiss() {
        DialogInterfaceC0121q dialogInterfaceC0121q = this.f1757b;
        if (dialogInterfaceC0121q != null) {
            dialogInterfaceC0121q.dismiss();
            this.f1757b = null;
        }
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: g */
    public int mo2703g() {
        return 0;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: i */
    public Drawable mo2702i() {
        return null;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: j */
    public CharSequence mo2701j() {
        return this.f1759d;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: l */
    public void mo2700l(CharSequence charSequence) {
        this.f1759d = charSequence;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: m */
    public void mo2699m(Drawable drawable) {
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: n */
    public void mo2698n(int i) {
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: o */
    public void mo2697o(ListAdapter listAdapter) {
        this.f1758c = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1760e.setSelection(i);
        if (this.f1760e.getOnItemClickListener() != null) {
            this.f1760e.performItemClick(null, i, this.f1758c.getItemId(i));
        }
        DialogInterfaceC0121q dialogInterfaceC0121q = this.f1757b;
        if (dialogInterfaceC0121q != null) {
            dialogInterfaceC0121q.dismiss();
            this.f1757b = null;
        }
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: p */
    public void mo2696p(int i) {
    }
}