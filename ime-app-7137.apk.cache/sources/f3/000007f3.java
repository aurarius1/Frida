package p093c.p145g.p146a.p147a.p156i0;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: c.g.a.a.i0.m0 */
/* loaded from: classes.dex */
public class C1903m0 implements TextWatcher {

    /* renamed from: b */
    public final /* synthetic */ TextInputLayout f5816b;

    public C1903m0(TextInputLayout textInputLayout) {
        this.f5816b = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f5816b;
        textInputLayout.m238z(!textInputLayout.f6861K0, false);
        TextInputLayout textInputLayout2 = this.f5816b;
        if (textInputLayout2.f6890j) {
            textInputLayout2.m243u(editable.length());
        }
        TextInputLayout textInputLayout3 = this.f5816b;
        if (textInputLayout3.f6904q) {
            textInputLayout3.m270A(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}