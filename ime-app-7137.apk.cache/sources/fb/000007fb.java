package p093c.p145g.p146a.p147a.p156i0;

import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;
import p093c.p145g.p146a.p147a.AbstractC1840f;

/* renamed from: c.g.a.a.i0.q0 */
/* loaded from: classes.dex */
public class C1911q0 extends C0568b {

    /* renamed from: d */
    public final TextInputLayout f5825d;

    public C1911q0(TextInputLayout textInputLayout) {
        this.f5825d = textInputLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r3 != null) goto L52;
     */
    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        EditText editText = this.f5825d.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = this.f5825d.getHint();
        CharSequence error = this.f5825d.getError();
        CharSequence placeholderText = this.f5825d.getPlaceholderText();
        int counterMaxLength = this.f5825d.getCounterMaxLength();
        CharSequence counterOverflowDescription = this.f5825d.getCounterOverflowDescription();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !this.f5825d.f6849E0;
        boolean z4 = !TextUtils.isEmpty(error);
        boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
        String charSequence = z2 ? hint.toString() : "";
        if (z) {
            c0580e.f2703b.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            c0580e.f2703b.setText(charSequence);
            if (z3 && placeholderText != null) {
                placeholderText = charSequence + ", " + ((Object) placeholderText);
                c0580e.f2703b.setText(placeholderText);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                c0580e.m2303k(charSequence);
            } else {
                if (z) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                c0580e.f2703b.setText(charSequence);
            }
            boolean z6 = !z;
            if (i >= 26) {
                c0580e.f2703b.setShowingHintText(z6);
            } else {
                c0580e.m2306h(4, z6);
            }
        }
        counterMaxLength = (text == null || text.length() != counterMaxLength) ? -1 : -1;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            c0580e.f2703b.setMaxTextLength(counterMaxLength);
        }
        if (z5) {
            if (!z4) {
                error = counterOverflowDescription;
            }
            if (i2 >= 21) {
                c0580e.f2703b.setError(error);
            }
        }
        if (i2 < 17 || editText == null) {
            return;
        }
        editText.setLabelFor(AbstractC1840f.textinput_helper_text);
    }
}