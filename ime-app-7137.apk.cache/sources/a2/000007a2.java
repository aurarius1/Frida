package p093c.p145g.p146a.p147a.p149b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1940l;

/* renamed from: c.g.a.a.b0.r */
/* loaded from: classes.dex */
public abstract class AbstractC1822r {

    /* renamed from: a */
    public static final int[] f5566a = {AbstractC1804b.colorPrimary};

    /* renamed from: b */
    public static final int[] f5567b = {AbstractC1804b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m767a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(AbstractC1940l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(AbstractC1804b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m765c(context, f5567b, "Theme.MaterialComponents");
            }
        }
        m765c(context, f5566a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r0.getResourceId(p093c.p145g.p146a.p147a.AbstractC1940l.ThemeEnforcement_android_textAppearance, -1) != (-1)) goto L24;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m766b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.ThemeEnforcement, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(AbstractC1940l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: c */
    public static void m765c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(AbstractC1124a.m1189g("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: d */
    public static TypedArray m764d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m767a(context, attributeSet, i, i2);
        m766b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}