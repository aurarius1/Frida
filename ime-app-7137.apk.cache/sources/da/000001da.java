package p010b.p016c.p026q;

import android.view.View;
import android.view.Window;
import p010b.p016c.p024p.p025m.C0172a;

/* renamed from: b.c.q.y3 */
/* loaded from: classes.dex */
public class View$OnClickListenerC0342y3 implements View.OnClickListener {

    /* renamed from: b */
    public final C0172a f1829b;

    /* renamed from: c */
    public final /* synthetic */ C0215a4 f1830c;

    public View$OnClickListenerC0342y3(C0215a4 c0215a4) {
        this.f1830c = c0215a4;
        this.f1829b = new C0172a(c0215a4.f1458a.getContext(), 0, 16908332, 0, c0215a4.f1466i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0215a4 c0215a4 = this.f1830c;
        Window.Callback callback = c0215a4.f1469l;
        if (callback == null || !c0215a4.f1470m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1829b);
    }
}