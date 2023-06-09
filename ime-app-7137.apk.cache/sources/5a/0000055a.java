package p093c.p097b.p107h0;

import android.content.Context;
import android.util.AttributeSet;
import com.menny.android.anysoftkeyboard.R;
import java.util.Locale;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1431i;

/* renamed from: c.b.h0.g */
/* loaded from: classes.dex */
public class C1238g extends AbstractC1431i {

    /* renamed from: o */
    public final String f4418o;

    public C1238g(Context context) {
        super(context, "ASK_KT", "com.anysoftkeyboard.plugin.KEYBOARD_THEME", "com.anysoftkeyboard.plugindata.keyboardtheme", "KeyboardThemes", "KeyboardTheme", "theme_", R.xml.keyboard_themes, R.string.settings_default_keyboard_theme_key, true, false);
        this.f4418o = this.f4717a.getString(R.string.fallback_keyboard_theme_id);
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: c */
    public AbstractC1427e mo918c(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i2, AttributeSet attributeSet) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "themeRes", 0);
        int attributeResourceValue2 = attributeSet.getAttributeResourceValue(null, "popupThemeRes", 0);
        int attributeResourceValue3 = attributeSet.getAttributeResourceValue(null, "iconsThemeRes", 0);
        int attributeResourceValue4 = attributeSet.getAttributeResourceValue(null, "popupIconsThemeRes", 0);
        if (attributeResourceValue != -1) {
            return new C1237f(context, context2, i, charSequence, charSequence2, attributeResourceValue, attributeResourceValue2, attributeResourceValue3, attributeResourceValue4, z, charSequence3, i2);
        }
        throw new RuntimeException(String.format(Locale.US, "Missing details for creating Keyboard theme! prefId %s, keyboardThemeResId: %d", charSequence, Integer.valueOf(attributeResourceValue)));
    }
}