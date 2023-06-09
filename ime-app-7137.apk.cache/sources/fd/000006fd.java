package p093c.p097b.p129y;

import android.content.Context;
import android.util.AttributeSet;
import com.menny.android.anysoftkeyboard.R;
import java.util.Locale;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1431i;

/* renamed from: c.b.y.b */
/* loaded from: classes.dex */
public class C1657b extends AbstractC1431i {

    /* renamed from: o */
    public final int f5097o;

    public C1657b(Context context, int i, String str, int i2) {
        super(context, "ASK_EKF", "com.anysoftkeyboard.plugin.EXTENSION_KEYBOARD", "com.anysoftkeyboard.plugindata.extensionkeyboard", "ExtensionKeyboards", "ExtensionKeyboard", str, R.xml.extension_keyboards, i, true, false);
        this.f5097o = i2;
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: c */
    public AbstractC1427e mo918c(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i2, AttributeSet attributeSet) {
        int attributeIntValue;
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "extensionKeyboardResId", 0);
        if (attributeResourceValue == 0) {
            attributeResourceValue = attributeSet.getAttributeIntValue(null, "extensionKeyboardResId", 0);
        }
        int i3 = attributeResourceValue;
        int attributeResourceValue2 = attributeSet.getAttributeResourceValue(null, "extensionKeyboardType", 0);
        if (attributeResourceValue2 != 0) {
            attributeIntValue = context2.getResources().getInteger(attributeResourceValue2);
            if (attributeIntValue != 1 && attributeIntValue != 2 && attributeIntValue != 3) {
                throw new RuntimeException(AbstractC1124a.m1193c("Invalid keyboard-extension-type ", attributeIntValue));
            }
        } else {
            attributeIntValue = attributeSet.getAttributeIntValue(null, "extensionKeyboardType", 0);
        }
        int i4 = attributeIntValue;
        if (i4 != 0) {
            if (i4 == this.f5097o) {
                return new C1656a(context, context2, i, charSequence, charSequence2, i3, i4, charSequence3, z, i2);
            }
            return null;
        }
        throw new RuntimeException(String.format(Locale.US, "Missing details for creating Extension Keyboard! prefId %s keyboardResId: %d, type: %d", charSequence, Integer.valueOf(i3), Integer.valueOf(i4)));
    }
}