package p093c.p145g.p146a.p147a.p156i0;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: c.g.a.a.i0.j0 */
/* loaded from: classes.dex */
public class C1897j0 implements InterfaceC1915s0 {

    /* renamed from: a */
    public final /* synthetic */ C1901l0 f5802a;

    public C1897j0(C1901l0 c1901l0) {
        this.f5802a = c1901l0;
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.InterfaceC1915s0
    /* renamed from: a */
    public void mo685a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.getEditText();
        if (editText == null || i != 1) {
            return;
        }
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.post(new RunnableC1895i0(this, editText));
    }
}