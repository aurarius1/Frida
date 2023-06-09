package p010b.p082t;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* renamed from: b.t.i */
/* loaded from: classes.dex */
public final class C0874i implements InterfaceC0894s {

    /* renamed from: a */
    public static C0874i f3467a;

    @Override // p010b.p082t.InterfaceC0894s
    /* renamed from: a */
    public CharSequence mo1742a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.m3297N()) ? listPreference.f609b.getString(AbstractC0893r0.not_set) : listPreference.m3297N();
    }
}