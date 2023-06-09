package p010b.p046j.p050f;

import android.graphics.Color;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.f.a */
/* loaded from: classes.dex */
public abstract class AbstractC0506a {

    /* renamed from: a */
    public static final ThreadLocal f2540a = new ThreadLocal();

    /* renamed from: a */
    public static void m2393a(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m2387g(f7, 0.0f, 360.0f);
        fArr[1] = m2387g(abs, 0.0f, 1.0f);
        fArr[2] = m2387g(f6, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public static double m2392b(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            StringBuilder m1187i = AbstractC1124a.m1187i("background can not be translucent: #");
            m1187i.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(m1187i.toString());
        }
        if (Color.alpha(i) < 255) {
            i = m2389e(i, i2);
        }
        double m2391c = m2391c(i) + 0.05d;
        double m2391c2 = m2391c(i2) + 0.05d;
        return Math.max(m2391c, m2391c2) / Math.min(m2391c, m2391c2);
    }

    /* renamed from: c */
    public static double m2391c(int i) {
        ThreadLocal threadLocal = f2540a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = red;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            double d2 = d / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green;
            Double.isNaN(d3);
            Double.isNaN(d3);
            Double.isNaN(d3);
            double d4 = d3 / 255.0d;
            double pow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            double d5 = blue;
            Double.isNaN(d5);
            Double.isNaN(d5);
            Double.isNaN(d5);
            double d6 = d5 / 255.0d;
            double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: d */
    public static int m2390d(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            StringBuilder m1187i = AbstractC1124a.m1187i("background can not be translucent: #");
            m1187i.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(m1187i.toString());
        }
        double d = f;
        if (m2392b(m2386h(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (m2392b(m2386h(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    /* renamed from: e */
    public static int m2389e(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, m2388f(Color.red(i), alpha2, Color.red(i2), alpha, i3), m2388f(Color.green(i), alpha2, Color.green(i2), alpha, i3), m2388f(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: f */
    public static int m2388f(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* renamed from: g */
    public static float m2387g(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: h */
    public static int m2386h(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}