package p093c.p097b.p128x;

import android.view.inputmethod.EditorInfo;
import p183e.p184a.p189o.InterfaceC2123e;

/* renamed from: c.b.x.b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1555b2 implements InterfaceC2123e {

    /* renamed from: b */
    public final /* synthetic */ C1551a3 f4975b;

    @Override // p183e.p184a.p189o.InterfaceC2123e
    public final void accept(Object obj) {
        C1551a3 c1551a3 = this.f4975b;
        c1551a3.f4971e = ((Boolean) obj).booleanValue();
        EditorInfo currentInputEditorInfo = c1551a3.f4970d.getCurrentInputEditorInfo();
        if (currentInputEditorInfo != null) {
            c1551a3.f4970d.m437f0(currentInputEditorInfo);
        }
    }
}