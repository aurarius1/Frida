package p093c.p145g.p146a.p147a.p156i0;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p093c.p145g.p146a.p147a.AbstractC1835e;
import p093c.p145g.p146a.p147a.AbstractC1924j;

/* renamed from: c.g.a.a.i0.l0 */
/* loaded from: classes.dex */
public class C1901l0 extends AbstractC1879a0 {

    /* renamed from: d */
    public final TextWatcher f5810d;

    /* renamed from: e */
    public final InterfaceC1913r0 f5811e;

    /* renamed from: f */
    public final InterfaceC1915s0 f5812f;

    public C1901l0(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5810d = new C1891g0(this);
        this.f5811e = new C1893h0(this);
        this.f5812f = new C1897j0(this);
    }

    /* renamed from: d */
    public static boolean m689d(C1901l0 c1901l0) {
        EditText editText = c1901l0.f5755a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.AbstractC1879a0
    /* renamed from: a */
    public void mo684a() {
        this.f5755a.setEndIconDrawable(AbstractC0142b.m3000b(this.f5756b, AbstractC1835e.design_password_eye));
        TextInputLayout textInputLayout = this.f5755a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(AbstractC1924j.password_toggle_content_description));
        this.f5755a.setEndIconOnClickListener(new View$OnClickListenerC1899k0(this));
        this.f5755a.m263a(this.f5811e);
        this.f5755a.f6887h0.add(this.f5812f);
        EditText editText = this.f5755a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}