package p093c.p097b.p102d0.p103k;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p093c.p097b.p102d0.C1188e;

/* renamed from: c.b.d0.k.j */
/* loaded from: classes.dex */
public class C1203j {

    /* renamed from: a */
    public final SharedPreferences f4366a;

    /* renamed from: b */
    public final String f4367b;

    /* renamed from: c */
    public final String f4368c;

    public C1203j(Context context) {
        this.f4366a = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f4367b = context.getString(R.string.settings_key_initial_quick_text_tab);
        this.f4368c = context.getString(R.string.settings_default_initial_quick_text_tab);
        context.getString(R.string.settings_key_one_shot_quick_text_popup);
        context.getResources().getBoolean(R.bool.settings_default_one_shot_quick_text_popup);
    }

    /* renamed from: a */
    public final int m1146a(List list, String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -73219968:
                if (str.equals("always_first")) {
                    c = 0;
                    break;
                }
                break;
            case 926934164:
                if (str.equals("history")) {
                    c = 1;
                    break;
                }
                break;
            case 2013347782:
                if (str.equals("last_used")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 0;
            case 2:
                String string = this.f4366a.getString("KEY_QUICK_TEXT_PREF_LAST_SELECTED_TAB_ADD_ON_ID", "");
                if (TextUtils.isEmpty(string)) {
                    return 1;
                }
                for (int i = 0; i < list.size(); i++) {
                    if (TextUtils.equals(((C1188e) list.get(i)).f4705a, string)) {
                        return i;
                    }
                }
                return 1;
            default:
                return m1146a(list, this.f4368c);
        }
    }
}