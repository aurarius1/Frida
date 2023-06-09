package p093c.p097b.p130z;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1430h;
import p093c.p097b.p122u.C1475h0;

/* renamed from: c.b.z.k0 */
/* loaded from: classes.dex */
public class C1679k0 extends AbstractC1430h {
    public C1679k0(Context context) {
        super(context, "ASKKeyboardFactory", "com.menny.android.anysoftkeyboard.KEYBOARD", "com.menny.android.anysoftkeyboard.keyboards", "Keyboards", "Keyboard", "keyboard_", 0, R.string.settings_default_keyboard_id, true, false);
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: c */
    public AbstractC1427e mo918c(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i2, AttributeSet attributeSet) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "layoutResId", 0);
        int attributeResourceValue2 = attributeSet.getAttributeResourceValue(null, "landscapeResId", 0);
        int attributeResourceValue3 = attributeSet.getAttributeResourceValue(null, "iconResId", R.drawable.sym_keyboard_notification_icon);
        String attributeValue = attributeSet.getAttributeValue(null, "defaultDictionaryLocale");
        String attributeValue2 = attributeSet.getAttributeValue(null, "additionalIsLetterExceptions");
        String attributeValue3 = attributeSet.getAttributeValue(null, "sentenceSeparators");
        if (TextUtils.isEmpty(attributeValue3)) {
            attributeValue3 = ".,!?)]:;";
        }
        String str = attributeValue3;
        int attributeResourceValue4 = attributeSet.getAttributeResourceValue(null, "physicalKeyboardMappingResId", 0);
        boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue(null, "defaultEnabled", i2 == 1);
        if (attributeResourceValue == 0) {
            return null;
        }
        return new C1671g0(context, context2, i, charSequence, charSequence2, attributeResourceValue, attributeResourceValue2, attributeValue, attributeResourceValue3, attributeResourceValue4, attributeValue2, str, charSequence3, z, i2, attributeBooleanValue);
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: k */
    public boolean mo917k(String str) {
        C1671g0 c1671g0 = (C1671g0) m1060d(str);
        return ((this instanceof C1475h0) || TextUtils.equals(this.f4722f, str)) || (c1671g0 != null && c1671g0.f5163r);
    }
}