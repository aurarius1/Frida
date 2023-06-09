package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p010b.p037h.p040b.AbstractC0403k;

/* renamed from: b.h.c.a */
/* loaded from: classes.dex */
public class C0431a {

    /* renamed from: a */
    public String f2210a;

    /* renamed from: b */
    public int f2211b;

    /* renamed from: c */
    public int f2212c;

    /* renamed from: d */
    public float f2213d;

    /* renamed from: e */
    public String f2214e;

    /* renamed from: f */
    public boolean f2215f;

    /* renamed from: g */
    public int f2216g;

    public C0431a(C0431a c0431a, Object obj) {
        this.f2210a = c0431a.f2210a;
        this.f2211b = c0431a.f2211b;
        m2470b(obj);
    }

    public C0431a(String str, int i, Object obj) {
        this.f2210a = str;
        this.f2211b = i;
        m2470b(obj);
    }

    /* renamed from: a */
    public static void m2471a(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        int i;
        Object string;
        int integer;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0447q.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = 1;
            if (index == AbstractC0447q.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == AbstractC0447q.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                if (index == AbstractC0447q.CustomAttribute_customColorValue) {
                    i4 = 3;
                } else if (index == AbstractC0447q.CustomAttribute_customColorDrawableValue) {
                    i4 = 4;
                } else {
                    if (index == AbstractC0447q.CustomAttribute_customPixelDimension) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == AbstractC0447q.CustomAttribute_customDimension) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == AbstractC0447q.CustomAttribute_customFloatValue) {
                            i = 2;
                            string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        } else if (index == AbstractC0447q.CustomAttribute_customIntegerValue) {
                            integer = obtainStyledAttributes.getInteger(index, -1);
                            string = Integer.valueOf(integer);
                            i = i4;
                        } else if (index == AbstractC0447q.CustomAttribute_customStringValue) {
                            i = 5;
                            string = obtainStyledAttributes.getString(index);
                        }
                        Object obj2 = string;
                        i2 = i;
                        obj = obj2;
                    }
                    obj = Float.valueOf(dimension);
                    i2 = 7;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                i = i4;
                Object obj22 = string;
                i2 = i;
                obj = obj22;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C0431a(str, i2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public void m2470b(Object obj) {
        switch (AbstractC0403k.m2567a(this.f2211b)) {
            case 0:
                this.f2212c = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f2213d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f2216g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2214e = (String) obj;
                return;
            case 5:
                this.f2215f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}