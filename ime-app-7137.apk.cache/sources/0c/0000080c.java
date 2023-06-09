package p093c.p145g.p146a.p147a.p159k0;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1821q;

/* renamed from: c.g.a.a.k0.b */
/* loaded from: classes.dex */
public class C1928b extends AbstractC1821q {

    /* renamed from: b */
    public final /* synthetic */ ChipTextInputComboView f5870b;

    public C1928b(ChipTextInputComboView chipTextInputComboView, AbstractC1927a abstractC1927a) {
        this.f5870b = chipTextInputComboView;
    }

    @Override // p093c.p145g.p146a.p147a.p149b0.AbstractC1821q, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            ChipTextInputComboView chipTextInputComboView = this.f5870b;
            chipTextInputComboView.f6929b.setText(ChipTextInputComboView.m230a(chipTextInputComboView, "00"));
            return;
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f5870b;
        chipTextInputComboView2.f6929b.setText(ChipTextInputComboView.m230a(chipTextInputComboView2, editable));
    }
}