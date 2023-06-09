package p010b.p087x.p088a.p089a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.x.a.a.i  reason: invalid class name */
/* loaded from: classes.dex */
public class animationInterpolatorC1094i implements Interpolator {

    /* renamed from: a */
    public float[] f4076a;

    /* renamed from: b */
    public float[] f4077b;

    public animationInterpolatorC1094i(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m2394k = AbstractC0505k.m2394k(context.getResources(), context.getTheme(), attributeSet, AbstractC1086a.f4062l);
        if (AbstractC0505k.m2396i(xmlPullParser, "pathData")) {
            String m2400e = AbstractC0505k.m2400e(m2394k, xmlPullParser, "pathData", 4);
            Path m3467u = AbstractC0022t.m3467u(m2400e);
            if (m3467u == null) {
                throw new InflateException(AbstractC1124a.m1190f("The path is null, which is created from ", m2400e));
            }
            m1243a(m3467u);
        } else if (!AbstractC0505k.m2396i(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!AbstractC0505k.m2396i(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float f = !AbstractC0505k.m2396i(xmlPullParser, "controlX1") ? 0.0f : m2394k.getFloat(0, 0.0f);
            float f2 = !AbstractC0505k.m2396i(xmlPullParser, "controlY1") ? 0.0f : m2394k.getFloat(1, 0.0f);
            boolean m2396i = AbstractC0505k.m2396i(xmlPullParser, "controlX2");
            if (m2396i != AbstractC0505k.m2396i(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (!m2396i) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(f, f2, 1.0f, 1.0f);
                m1243a(path);
            } else {
                float f3 = !AbstractC0505k.m2396i(xmlPullParser, "controlX2") ? 0.0f : m2394k.getFloat(2, 0.0f);
                float f4 = !AbstractC0505k.m2396i(xmlPullParser, "controlY2") ? 0.0f : m2394k.getFloat(3, 0.0f);
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                m1243a(path2);
            }
        }
        m2394k.recycle();
    }

    /* renamed from: a */
    public final void m1243a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f4076a = new float[min];
        this.f4077b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f4076a[i2] = fArr[0];
            this.f4077b[i2] = fArr[1];
        }
        if (Math.abs(this.f4076a[0]) <= 1.0E-5d && Math.abs(this.f4077b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f4076a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f4077b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.f4076a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("The Path must start at (0,0) and end at (1,1) start: ");
        m1187i.append(this.f4076a[0]);
        m1187i.append(",");
        m1187i.append(this.f4077b[0]);
        m1187i.append(" end:");
        int i6 = min - 1;
        m1187i.append(this.f4076a[i6]);
        m1187i.append(",");
        m1187i.append(this.f4077b[i6]);
        throw new IllegalArgumentException(m1187i.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f4076a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f4076a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f4076a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f4077b[i];
        }
        float[] fArr2 = this.f4077b;
        float f3 = fArr2[i];
        return AbstractC1124a.m1195a(fArr2[length], f3, (f - fArr[i]) / f2, f3);
    }
}