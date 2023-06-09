package p010b.p082t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p016c.p018l.p019a.AbstractC0142b;

/* renamed from: b.t.g */
/* loaded from: classes.dex */
public final class C0870g extends Preference {

    /* renamed from: P */
    public long f3466P;

    public C0870g(Context context, List list, long j) {
        super(context);
        this.f600G = AbstractC0891q0.expand_button;
        int i = AbstractC0887o0.ic_arrow_down_24dp;
        Drawable m3000b = AbstractC0142b.m3000b(this.f609b, i);
        if (this.f619l != m3000b) {
            this.f619l = m3000b;
            this.f618k = 0;
            mo3277m();
        }
        this.f618k = i;
        m3288I(this.f609b.getString(AbstractC0893r0.expand_button_title));
        if (999 != this.f615h) {
            this.f615h = 999;
            m3276o();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.f616i;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.f604K)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                str = str == null ? charSequence : this.f609b.getString(AbstractC0893r0.summary_collapsed_preference_list, str, charSequence);
            }
        }
        mo3289H(str);
        this.f3466P = j + 1000000;
    }

    @Override // androidx.preference.Preference
    /* renamed from: d */
    public long mo1747d() {
        return this.f3466P;
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        super.mo0r(c0881l0);
        c0881l0.f3487w = false;
    }
}