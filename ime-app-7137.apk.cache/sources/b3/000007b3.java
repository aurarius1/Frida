package p093c.p145g.p146a.p147a.p152e0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import p010b.p046j.p050f.AbstractC0506a;

/* renamed from: c.g.a.a.e0.d */
/* loaded from: classes.dex */
public abstract class AbstractC1839d {

    /* renamed from: a */
    public static final boolean f5603a;

    /* renamed from: b */
    public static final int[] f5604b;

    /* renamed from: c */
    public static final int[] f5605c;

    /* renamed from: d */
    public static final int[] f5606d;

    /* renamed from: e */
    public static final int[] f5607e;

    /* renamed from: f */
    public static final int[] f5608f;

    /* renamed from: g */
    public static final int[] f5609g;

    /* renamed from: h */
    public static final int[] f5610h;

    /* renamed from: i */
    public static final int[] f5611i;

    /* renamed from: j */
    public static final int[] f5612j;

    /* renamed from: k */
    public static final int[] f5613k;

    /* renamed from: l */
    public static final String f5614l;

    static {
        f5603a = Build.VERSION.SDK_INT >= 21;
        f5604b = new int[]{16842919};
        f5605c = new int[]{16843623, 16842908};
        f5606d = new int[]{16842908};
        f5607e = new int[]{16843623};
        f5608f = new int[]{16842913, 16842919};
        f5609g = new int[]{16842913, 16843623, 16842908};
        f5610h = new int[]{16842913, 16842908};
        f5611i = new int[]{16842913, 16843623};
        f5612j = new int[]{16842913};
        f5613k = new int[]{16842910, 16842919};
        f5614l = AbstractC1839d.class.getSimpleName();
    }

    /* renamed from: a */
    public static int m755a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f5603a ? AbstractC0506a.m2386h(colorForState, Math.min(Color.alpha(colorForState) * 2, 255)) : colorForState;
    }

    /* renamed from: b */
    public static ColorStateList m754b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(f5613k, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: c */
    public static boolean m753c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}