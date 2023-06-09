package p093c.p097b.p128x;

import android.content.DialogInterface;
import com.anysoftkeyboard.ime.AnySoftKeyboardClipboard;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;
import p204f.p205a.p209b.InterfaceC2293d;

/* renamed from: c.b.x.g2 */
/* loaded from: classes.dex */
public class C1579g2 implements InterfaceC2293d {

    /* renamed from: a */
    public final /* synthetic */ CharSequence[] f5003a;

    /* renamed from: b */
    public final /* synthetic */ DialogInterface.OnClickListener f5004b;

    /* renamed from: c */
    public final /* synthetic */ AnySoftKeyboardClipboard f5005c;

    public C1579g2(AnySoftKeyboardClipboard anySoftKeyboardClipboard, CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f5005c = anySoftKeyboardClipboard;
        this.f5003a = charSequenceArr;
        this.f5004b = onClickListener;
    }

    @Override // p204f.p205a.p209b.InterfaceC2294e
    /* renamed from: a */
    public void mo23a(C0119p c0119p, int i, Object obj) {
        AnySoftKeyboardClipboard anySoftKeyboardClipboard = this.f5005c;
        C1583h2 c1583h2 = new C1583h2(anySoftKeyboardClipboard, anySoftKeyboardClipboard, this.f5003a);
        DialogInterface.OnClickListener onClickListener = this.f5004b;
        C0111l c0111l = c0119p.f1026a;
        c0111l.f952q = c1583h2;
        c0111l.f953r = onClickListener;
    }

    @Override // p204f.p205a.p209b.InterfaceC2293d
    /* renamed from: b */
    public void mo22b(DialogInterfaceC0121q dialogInterfaceC0121q, Object obj) {
    }
}