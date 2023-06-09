package p093c.p097b.p102d0;

import android.content.Context;
import android.util.AttributeSet;
import com.menny.android.anysoftkeyboard.R;
import java.util.Locale;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1430h;
import p093c.p097b.p116p.AbstractC1432j;

/* renamed from: c.b.d0.f */
/* loaded from: classes.dex */
public class C1189f extends AbstractC1430h {
    public C1189f(Context context) {
        super(context, "ASK_QKF", "com.anysoftkeyboard.plugin.QUICK_TEXT_KEY", "com.anysoftkeyboard.plugindata.quicktextkeys", "QuickTextKeys", "QuickTextKey", "quick_text_", R.xml.quick_text_keys, R.string.settings_default_quick_text_key_id, true, false);
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: c */
    public AbstractC1427e mo918c(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i2, AttributeSet attributeSet) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "popupKeyboard", 0);
        int attributeResourceValue2 = attributeSet.getAttributeResourceValue(null, "popupListText", 0);
        int attributeResourceValue3 = attributeSet.getAttributeResourceValue(null, "popupListOutput", 0);
        int attributeResourceValue4 = attributeSet.getAttributeResourceValue(null, "popupListIcons", 0);
        int attributeResourceValue5 = attributeSet.getAttributeResourceValue(null, "keyIcon", 0);
        CharSequence m1055i = AbstractC1432j.m1055i(context2, attributeSet, "keyLabel");
        CharSequence m1055i2 = AbstractC1432j.m1055i(context2, attributeSet, "keyOutputText");
        int attributeResourceValue6 = attributeSet.getAttributeResourceValue(null, "iconPreview", 0);
        if ((attributeResourceValue == 0 && (attributeResourceValue2 == 0 || attributeResourceValue3 == 0)) || ((attributeResourceValue5 == 0 && m1055i == null) || m1055i2 == null)) {
            throw new RuntimeException(String.format(Locale.US, "Missing details for creating QuickTextKey! prefId %s, popupKeyboardResId: %d, popupListTextResId: %d, popupListOutputResId: %d, (iconResId: %d, keyLabel: %s), keyOutputText: %s", charSequence, Integer.valueOf(attributeResourceValue), Integer.valueOf(attributeResourceValue2), Integer.valueOf(attributeResourceValue3), Integer.valueOf(attributeResourceValue5), m1055i, m1055i2));
        }
        return new C1188e(context, context2, i, charSequence, charSequence2, attributeResourceValue, attributeResourceValue2, attributeResourceValue3, attributeResourceValue4, attributeResourceValue5, m1055i, m1055i2, attributeResourceValue6, z, charSequence3, i2);
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: k */
    public boolean mo917k(String str) {
        return true;
    }
}