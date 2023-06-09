package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0889p0;
import p010b.p082t.C0862c;
import p010b.p082t.C0881l0;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: a0 */
    public final Context f578a0;

    /* renamed from: b0 */
    public final ArrayAdapter f579b0;

    /* renamed from: c0 */
    public Spinner f580c0;

    /* renamed from: d0 */
    public final AdapterView.OnItemSelectedListener f581d0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0883m0.dropdownPreferenceStyle, 0);
        this.f581d0 = new C0862c(this);
        this.f578a0 = context;
        this.f579b0 = new ArrayAdapter(context, 17367049);
        m3300Q();
    }

    @Override // androidx.preference.ListPreference
    /* renamed from: O */
    public void mo3296O(CharSequence[] charSequenceArr) {
        this.f584V = charSequenceArr;
        m3300Q();
    }

    /* renamed from: Q */
    public final void m3300Q() {
        this.f579b0.clear();
        CharSequence[] charSequenceArr = this.f584V;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f579b0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: m */
    public void mo3277m() {
        super.mo3277m();
        ArrayAdapter arrayAdapter = this.f579b0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        Spinner spinner = (Spinner) c0881l0.f3605c.findViewById(AbstractC0889p0.spinner);
        this.f580c0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f579b0);
        this.f580c0.setOnItemSelectedListener(this.f581d0);
        Spinner spinner2 = this.f580c0;
        String str = this.f586X;
        CharSequence[] charSequenceArr = this.f585W;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (charSequenceArr[length].equals(str)) {
                    i = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo0r(c0881l0);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: s */
    public void mo3247s() {
        this.f580c0.performClick();
    }
}