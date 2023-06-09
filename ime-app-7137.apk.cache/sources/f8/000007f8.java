package p093c.p145g.p146a.p147a.p156i0;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1821q;

/* renamed from: c.g.a.a.i0.p */
/* loaded from: classes.dex */
public class C1908p extends AbstractC1821q {

    /* renamed from: b */
    public final /* synthetic */ C1923z f5822b;

    public C1908p(C1923z c1923z) {
        this.f5822b = c1923z;
    }

    @Override // p093c.p145g.p146a.p147a.p149b0.AbstractC1821q, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        AutoCompleteTextView m682d = C1923z.m682d(this.f5822b.f5755a.getEditText());
        if (this.f5822b.f5847o.isTouchExplorationEnabled() && C1923z.m681e(m682d) && !this.f5822b.f5757c.hasFocus()) {
            m682d.dismissDropDown();
        }
        m682d.post(new RunnableC1904n(this, m682d));
    }
}