package p093c.p145g.p146a.p147a.p156i0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: c.g.a.a.i0.e */
/* loaded from: classes.dex */
public class C1886e implements InterfaceC1915s0 {

    /* renamed from: a */
    public final /* synthetic */ C1898k f5789a;

    public C1886e(C1898k c1898k) {
        this.f5789a = c1898k;
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.InterfaceC1915s0
    /* renamed from: a */
    public void mo685a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.getEditText();
        if (editText == null || i != 2) {
            return;
        }
        editText.post(new RunnableC1884d(this, editText));
        if (editText.getOnFocusChangeListener() == this.f5789a.f5804e) {
            editText.setOnFocusChangeListener(null);
        }
    }
}