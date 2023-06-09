package p010b.p046j.p048e.p049b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.AbstractC0463c;

/* renamed from: b.j.e.b.a */
/* loaded from: classes.dex */
public final class C0495a {

    /* renamed from: a */
    public final Shader f2517a;

    /* renamed from: b */
    public final ColorStateList f2518b;

    /* renamed from: c */
    public int f2519c;

    public C0495a(Shader shader, ColorStateList colorStateList, int i) {
        this.f2517a = shader;
        this.f2518b = colorStateList;
        this.f2519c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
        if (r9 == 2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
        r4 = r0.f2531a;
        r0 = r0.f2532b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0200, code lost:
        if (r6 == 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
        if (r6 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0204, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0207, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020a, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020c, code lost:
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r24, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021d, code lost:
        r3 = new android.graphics.SweepGradient(r20, r22, r0.f2531a, r0.f2532b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0232, code lost:
        if (r21 <= 0.0f) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0234, code lost:
        r1 = r0.f2531a;
        r0 = r0.f2532b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023b, code lost:
        if (r6 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023e, code lost:
        if (r6 == 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0240, code lost:
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0243, code lost:
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0246, code lost:
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0248, code lost:
        r22 = r2;
        r3 = new android.graphics.RadialGradient(r20, (float) r22, r21, r1, r0, (android.graphics.Shader.TileMode) r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0260, code lost:
        return new p010b.p046j.p048e.p049b.C0495a(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0268, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dc, code lost:
        if (r8.size() <= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01de, code lost:
        r0 = new p010b.p046j.p048e.p049b.C0500f(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e4, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e5, code lost:
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01eb, code lost:
        if (r18 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ed, code lost:
        r0 = new p010b.p046j.p048e.p049b.C0500f(r5, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
        r0 = new p010b.p046j.p048e.p049b.C0500f(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
        if (r9 == 1) goto L80;
     */
    /* JADX WARN: Type inference failed for: r22v1, types: [android.graphics.Shader$TileMode, float] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0495a m2411a(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList m3471s = AbstractC0022t.m3471s(resources, xml, asAttributeSet, theme);
                    return new C0495a(null, m3471s, m3471s.getDefaultColor());
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (!name2.equals("gradient")) {
                throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
            }
            TypedArray m2394k = AbstractC0505k.m2394k(resources, theme, asAttributeSet, AbstractC0463c.GradientColor);
            float f2 = !AbstractC0505k.m2396i(xml, "startX") ? 0.0f : m2394k.getFloat(AbstractC0463c.GradientColor_android_startX, 0.0f);
            float f3 = !AbstractC0505k.m2396i(xml, "startY") ? 0.0f : m2394k.getFloat(AbstractC0463c.GradientColor_android_startY, 0.0f);
            float f4 = !AbstractC0505k.m2396i(xml, "endX") ? 0.0f : m2394k.getFloat(AbstractC0463c.GradientColor_android_endX, 0.0f);
            float f5 = !AbstractC0505k.m2396i(xml, "endY") ? 0.0f : m2394k.getFloat(AbstractC0463c.GradientColor_android_endY, 0.0f);
            float f6 = !AbstractC0505k.m2396i(xml, "centerX") ? 0.0f : m2394k.getFloat(AbstractC0463c.GradientColor_android_centerX, 0.0f);
            float f7 = !AbstractC0505k.m2396i(xml, "centerY") ? 0.0f : m2394k.getFloat(AbstractC0463c.GradientColor_android_centerY, 0.0f);
            int i2 = !AbstractC0505k.m2396i(xml, "type") ? 0 : m2394k.getInt(AbstractC0463c.GradientColor_android_type, 0);
            int color = !AbstractC0505k.m2396i(xml, "startColor") ? 0 : m2394k.getColor(AbstractC0463c.GradientColor_android_startColor, 0);
            boolean m2396i = AbstractC0505k.m2396i(xml, "centerColor");
            int color2 = !AbstractC0505k.m2396i(xml, "centerColor") ? 0 : m2394k.getColor(AbstractC0463c.GradientColor_android_centerColor, 0);
            int color3 = !AbstractC0505k.m2396i(xml, "endColor") ? 0 : m2394k.getColor(AbstractC0463c.GradientColor_android_endColor, 0);
            int i3 = !AbstractC0505k.m2396i(xml, "tileMode") ? 0 : m2394k.getInt(AbstractC0463c.GradientColor_android_tileMode, 0);
            float f8 = f6;
            float f9 = !AbstractC0505k.m2396i(xml, "gradientRadius") ? 0.0f : m2394k.getFloat(AbstractC0463c.GradientColor_android_gradientRadius, 0.0f);
            m2394k.recycle();
            int depth = xml.getDepth() + 1;
            float f10 = f9;
            ArrayList arrayList = new ArrayList(20);
            float f11 = f7;
            ArrayList arrayList2 = new ArrayList(20);
            Resources resources2 = resources;
            float f12 = f5;
            while (true) {
                int next2 = xml.next();
                float f13 = f4;
                if (next2 == 1) {
                    f = f3;
                    break;
                }
                int depth2 = xml.getDepth();
                f = f3;
                if (depth2 < depth && next2 == 3) {
                    break;
                }
                if (next2 == 2) {
                    if (depth2 <= depth) {
                        if (xml.getName().equals("item")) {
                            TypedArray m2394k2 = AbstractC0505k.m2394k(resources2, theme, asAttributeSet, AbstractC0463c.GradientColorItem);
                            int i4 = AbstractC0463c.GradientColorItem_android_color;
                            boolean hasValue = m2394k2.hasValue(i4);
                            int i5 = AbstractC0463c.GradientColorItem_android_offset;
                            boolean hasValue2 = m2394k2.hasValue(i5);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color4 = m2394k2.getColor(i4, 0);
                            float f14 = m2394k2.getFloat(i5, 0.0f);
                            m2394k2.recycle();
                            arrayList2.add(Integer.valueOf(color4));
                            arrayList.add(Float.valueOf(f14));
                        } else {
                            continue;
                        }
                    }
                    resources2 = resources;
                }
                f4 = f13;
                f3 = f;
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public boolean m2410b() {
        return this.f2517a != null;
    }

    /* renamed from: c */
    public boolean m2409c() {
        ColorStateList colorStateList;
        return this.f2517a == null && (colorStateList = this.f2518b) != null && colorStateList.isStateful();
    }

    /* renamed from: d */
    public boolean m2408d(int[] iArr) {
        if (m2409c()) {
            ColorStateList colorStateList = this.f2518b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2519c) {
                this.f2519c = colorForState;
                return true;
            }
        }
        return false;
    }
}