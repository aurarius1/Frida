package p010b.p016c.p024p.p025m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p010b.p016c.p017k.DialogInterfaceC0121q;

/* renamed from: b.c.p.m.q */
/* loaded from: classes.dex */
public class DialogInterface$OnKeyListenerC0200q implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0177c0 {

    /* renamed from: b */
    public C0199p f1396b;

    /* renamed from: c */
    public DialogInterfaceC0121q f1397c;

    /* renamed from: d */
    public C0194l f1398d;

    public DialogInterface$OnKeyListenerC0200q(C0199p c0199p) {
        this.f1396b = c0199p;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: a */
    public void mo2734a(C0199p c0199p, boolean z) {
        DialogInterfaceC0121q dialogInterfaceC0121q;
        if ((z || c0199p == this.f1396b) && (dialogInterfaceC0121q = this.f1397c) != null) {
            dialogInterfaceC0121q.dismiss();
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: b */
    public boolean mo2733b(C0199p c0199p) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1396b.m2921r(((C0192k) this.f1398d.m2942b()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C0194l c0194l = this.f1398d;
        C0199p c0199p = this.f1396b;
        InterfaceC0177c0 interfaceC0177c0 = c0194l.f1361g;
        if (interfaceC0177c0 != null) {
            interfaceC0177c0.mo2734a(c0199p, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1397c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1397c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1396b.m2936c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1396b.performShortcut(i, keyEvent, 0);
    }
}