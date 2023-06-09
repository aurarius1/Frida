package p093c.p145g.p146a.p147a.p156i0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: c.g.a.a.i0.h0 */
/* loaded from: classes.dex */
public class C1893h0 implements InterfaceC1913r0 {

    /* renamed from: a */
    public final /* synthetic */ C1901l0 f5797a;

    public C1893h0(C1901l0 c1901l0) {
        this.f5797a = c1901l0;
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.InterfaceC1913r0
    /* renamed from: a */
    public void mo686a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.getEditText();
        textInputLayout.setEndIconVisible(true);
        textInputLayout.setEndIconCheckable(true);
        C1901l0 c1901l0 = this.f5797a;
        c1901l0.f5757c.setChecked(!C1901l0.m689d(c1901l0));
        editText.removeTextChangedListener(this.f5797a.f5810d);
        editText.addTextChangedListener(this.f5797a.f5810d);
    }
}