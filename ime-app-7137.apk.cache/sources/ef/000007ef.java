package p093c.p145g.p146a.p147a.p156i0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: c.g.a.a.i0.k0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1899k0 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1901l0 f5809b;

    public View$OnClickListenerC1899k0(C1901l0 c1901l0) {
        this.f5809b = c1901l0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        EditText editText = this.f5809b.f5755a.getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        editText.setTransformationMethod(C1901l0.m689d(this.f5809b) ? null : PasswordTransformationMethod.getInstance());
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
        this.f5809b.f5755a.m248p();
    }
}