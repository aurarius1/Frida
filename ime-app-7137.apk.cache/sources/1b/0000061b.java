package p093c.p097b.p116p;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: c.b.p.i */
/* loaded from: classes.dex */
public abstract class AbstractC1431i extends AbstractC1432j {
    public AbstractC1431i(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2) {
        super(context, str, str2, str3, str4, str5, str6, i, i2, z, z2);
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: r */
    public void mo1012r(String str, boolean z) {
        SharedPreferences.Editor edit = this.f4719c.edit();
        if (z) {
            m1059e();
            for (String str2 : this.f4721e.keySet()) {
                m1050q(edit, str2, TextUtils.equals(str2, str));
            }
        } else {
            m1050q(edit, str, false);
            m1050q(edit, this.f4722f, true);
        }
        edit.apply();
    }
}