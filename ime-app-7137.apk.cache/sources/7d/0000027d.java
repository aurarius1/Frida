package p010b.p046j.p048e.p049b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.AbstractC0511f;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.e.b.k */
/* loaded from: classes.dex */
public abstract class AbstractC0505k {
    /* renamed from: a */
    public static int m2404a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: b */
    public static boolean m2403b(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: c */
    public static Drawable m2402c(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: d */
    public static C0495a m2401d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        C0495a c0495a;
        if (m2396i(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C0495a(null, null, typedValue.data);
            }
            try {
                c0495a = C0495a.m2411a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                c0495a = null;
            }
            if (c0495a != null) {
                return c0495a;
            }
        }
        return new C0495a(null, null, i2);
    }

    /* renamed from: e */
    public static String m2400e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m2396i(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: f */
    public static int m2399f(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: g */
    public static String m2398g(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: h */
    public static CharSequence[] m2397h(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: i */
    public static boolean m2396i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r17 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        r17.m2407a(-3, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r17 != null) goto L13;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m2395j(Context context, int i, TypedValue typedValue, int i2, AbstractC0503i abstractC0503i, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Resource \"");
            m1187i.append(resources.getResourceName(i));
            m1187i.append("\" (");
            m1187i.append(Integer.toHexString(i));
            m1187i.append(") is not a Font: ");
            m1187i.append(typedValue);
            throw new Resources.NotFoundException(m1187i.toString());
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            Typeface typeface2 = (Typeface) AbstractC0511f.f2551b.m2639a(AbstractC0511f.m2379c(resources, i, i2));
            if (typeface2 != null) {
                if (abstractC0503i != null) {
                    abstractC0503i.m2406b(typeface2, handler);
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        InterfaceC0496b m3511W = AbstractC0022t.m3511W(resources.getXml(i), resources);
                        if (m3511W != null) {
                            typeface = AbstractC0511f.m2381a(context, m3511W, resources, i, i2, abstractC0503i, handler, z);
                        } else if (abstractC0503i != null) {
                            abstractC0503i.m2407a(-3, handler);
                        }
                    } else {
                        Typeface m2380b = AbstractC0511f.m2380b(context, resources, i, charSequence2, i2);
                        if (abstractC0503i != null) {
                            if (m2380b != null) {
                                abstractC0503i.m2406b(m2380b, handler);
                            } else {
                                abstractC0503i.m2407a(-3, handler);
                            }
                        }
                        typeface = m2380b;
                    }
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            if (typeface == null && abstractC0503i == null && !z2) {
                StringBuilder m1187i2 = AbstractC1124a.m1187i("Font resource ID #0x");
                m1187i2.append(Integer.toHexString(i));
                m1187i2.append(" could not be retrieved.");
                throw new Resources.NotFoundException(m1187i2.toString());
            }
            return typeface;
        }
    }

    /* renamed from: k */
    public static TypedArray m2394k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}