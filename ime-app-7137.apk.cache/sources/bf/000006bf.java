package p093c.p097b.p128x;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;
import p204f.p205a.p209b.InterfaceC2293d;

/* renamed from: c.b.x.k2 */
/* loaded from: classes.dex */
public class C1595k2 implements InterfaceC2293d {

    /* renamed from: a */
    public final /* synthetic */ AnySoftKeyboardDialogProvider f5022a;

    public C1595k2(AnySoftKeyboardDialogProvider anySoftKeyboardDialogProvider, AbstractC1591j2 abstractC1591j2) {
        this.f5022a = anySoftKeyboardDialogProvider;
    }

    @Override // p204f.p205a.p209b.InterfaceC2294e
    /* renamed from: a */
    public void mo23a(C0119p c0119p, int i, Object obj) {
        final C1599l2 c1599l2 = (C1599l2) obj;
        C0111l c0111l = c0119p.f1026a;
        c0111l.f949n = true;
        c0111l.f938c = c1599l2.f5027b;
        c0111l.f940e = c1599l2.f5026a;
        c0119p.m3060d(17039360, null);
        CharSequence[] charSequenceArr = c1599l2.f5028c;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c.b.x.d2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1599l2 c1599l22 = C1599l2.this;
                c1599l22.f5031f.f6326l.m21a();
                if (i2 >= 0) {
                    CharSequence[] charSequenceArr2 = c1599l22.f5028c;
                    if (i2 >= charSequenceArr2.length) {
                        return;
                    }
                    CharSequence charSequence = charSequenceArr2[i2];
                    c1599l22.f5029d.onClick(dialogInterface, i2);
                }
            }
        };
        C0111l c0111l2 = c0119p.f1026a;
        c0111l2.f951p = charSequenceArr;
        c0111l2.f953r = onClickListener;
        this.f5022a.f6308d.mo410c();
        InterfaceC2293d interfaceC2293d = c1599l2.f5030e;
        if (interfaceC2293d != null) {
            interfaceC2293d.mo23a(c0119p, i, obj);
        }
    }

    @Override // p204f.p205a.p209b.InterfaceC2293d
    /* renamed from: b */
    public void mo22b(DialogInterfaceC0121q dialogInterfaceC0121q, Object obj) {
        Window window = dialogInterfaceC0121q.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.token = ((View) this.f5022a.f6308d).getWindowToken();
        attributes.type = 1003;
        window.setAttributes(attributes);
        window.addFlags(131072);
        InterfaceC2293d interfaceC2293d = ((C1599l2) obj).f5030e;
        if (interfaceC2293d != null) {
            interfaceC2293d.mo22b(dialogInterfaceC0121q, obj);
        }
    }
}