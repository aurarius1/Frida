package p093c.p145g.p146a.p147a.p156i0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: c.g.a.a.i0.c */
/* loaded from: classes.dex */
public class C1882c implements InterfaceC1913r0 {

    /* renamed from: a */
    public final /* synthetic */ C1898k f5764a;

    public C1882c(C1898k c1898k) {
        this.f5764a = c1898k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r0.getText().length() > 0) != false) goto L7;
     */
    @Override // p093c.p145g.p146a.p147a.p156i0.InterfaceC1913r0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo686a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.getEditText();
        boolean z = true;
        if (editText.hasFocus()) {
        }
        z = false;
        textInputLayout.setEndIconVisible(z);
        textInputLayout.setEndIconCheckable(false);
        editText.setOnFocusChangeListener(this.f5764a.f5804e);
        editText.removeTextChangedListener(this.f5764a.f5803d);
        editText.addTextChangedListener(this.f5764a.f5803d);
    }
}