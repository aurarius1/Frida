package p093c.p145g.p146a.p147a.p156i0;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: c.g.a.a.i0.a */
/* loaded from: classes.dex */
public class C1878a implements TextWatcher {

    /* renamed from: b */
    public final /* synthetic */ C1898k f5754b;

    public C1878a(C1898k c1898k) {
        this.f5754b = c1898k;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.f5754b.f5755a.getSuffixText() != null) {
            return;
        }
        this.f5754b.m690d(editable.length() > 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}