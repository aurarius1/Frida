package p093c.p145g.p146a.p147a.p156i0;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: c.g.a.a.i0.u */
/* loaded from: classes.dex */
public class C1918u implements InterfaceC1915s0 {

    /* renamed from: a */
    public final /* synthetic */ C1923z f5830a;

    public C1918u(C1923z c1923z) {
        this.f5830a = c1923z;
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.InterfaceC1915s0
    /* renamed from: a */
    public void mo685a(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
        if (autoCompleteTextView == null || i != 3) {
            return;
        }
        autoCompleteTextView.post(new RunnableC1916t(this, autoCompleteTextView));
        if (autoCompleteTextView.getOnFocusChangeListener() == this.f5830a.f5838f) {
            autoCompleteTextView.setOnFocusChangeListener(null);
        }
        autoCompleteTextView.setOnTouchListener(null);
        if (C1923z.f5836d) {
            autoCompleteTextView.setOnDismissListener(null);
        }
    }
}