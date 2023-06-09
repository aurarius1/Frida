package p010b.p082t;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* renamed from: b.t.f */
/* loaded from: classes.dex */
public class C0868f extends AbstractDialogInterface$OnClickListenerC0896t {

    /* renamed from: u0 */
    public EditText f3464u0;

    /* renamed from: v0 */
    public CharSequence f3465v0;

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t, p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        CharSequence charSequence;
        super.mo523T(bundle);
        if (bundle == null) {
            charSequence = m1748Z0().f582V;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.f3465v0 = charSequence;
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t
    /* renamed from: V0 */
    public void mo1740V0(View view) {
        super.mo1740V0(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f3464u0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f3464u0.setText(this.f3465v0);
        EditText editText2 = this.f3464u0;
        editText2.setSelection(editText2.getText().length());
        m1748Z0().getClass();
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t
    /* renamed from: X0 */
    public void mo1738X0(boolean z) {
        if (z) {
            String obj = this.f3464u0.getText().toString();
            EditTextPreference m1748Z0 = m1748Z0();
            m1748Z0.m3285a(obj);
            m1748Z0.m3299M(obj);
        }
    }

    /* renamed from: Z0 */
    public final EditTextPreference m1748Z0() {
        return (EditTextPreference) m1741U0();
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t, p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        super.mo521n0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f3465v0);
    }
}