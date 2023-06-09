package p010b.p082t;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;

/* renamed from: b.t.e */
/* loaded from: classes.dex */
public final class C0866e implements InterfaceC0894s {

    /* renamed from: a */
    public static C0866e f3457a;

    @Override // p010b.p082t.InterfaceC0894s
    /* renamed from: a */
    public CharSequence mo1742a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.f582V)) {
            return editTextPreference.f609b.getString(AbstractC0893r0.not_set);
        }
        return editTextPreference.f582V;
    }
}