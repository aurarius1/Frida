package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p050f.AbstractC0506a;

/* renamed from: b.c.q.m3 */
/* loaded from: classes.dex */
public abstract class AbstractC0282m3 {

    /* renamed from: a */
    public static final ThreadLocal f1660a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f1661b = {-16842910};

    /* renamed from: c */
    public static final int[] f1662c = {16842908};

    /* renamed from: d */
    public static final int[] f1663d = {16842919};

    /* renamed from: e */
    public static final int[] f1664e = {16842912};

    /* renamed from: f */
    public static final int[] f1665f = new int[0];

    /* renamed from: g */
    public static final int[] f1666g = new int[1];

    /* renamed from: a */
    public static void m2793a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0084j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(AbstractC0084j.AppCompatTheme_windowActionBar)) {
                String str = "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).";
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2792b(Context context, int i) {
        ColorStateList m2790d = m2790d(context, i);
        if (m2790d == null || !m2790d.isStateful()) {
            ThreadLocal threadLocal = f1660a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(16842803, typedValue, true);
            float f = typedValue.getFloat();
            int m2791c = m2791c(context, i);
            return AbstractC0506a.m2386h(m2791c, Math.round(Color.alpha(m2791c) * f));
        }
        return m2790d.getColorForState(f1661b, m2790d.getDefaultColor());
    }

    /* renamed from: c */
    public static int m2791c(Context context, int i) {
        int[] iArr = f1666g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m2790d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1666g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0142b.m3001a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}