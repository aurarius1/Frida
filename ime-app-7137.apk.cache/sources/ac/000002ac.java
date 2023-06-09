package p010b.p046j.p056j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.j.d */
/* loaded from: classes.dex */
public final class C0552d {

    /* renamed from: a */
    public final TextPaint f2642a;

    /* renamed from: b */
    public final TextDirectionHeuristic f2643b;

    /* renamed from: c */
    public final int f2644c;

    /* renamed from: d */
    public final int f2645d;

    public C0552d(PrecomputedText.Params params) {
        this.f2642a = params.getTextPaint();
        this.f2643b = params.getTextDirection();
        this.f2644c = params.getBreakStrategy();
        this.f2645d = params.getHyphenationFrequency();
        int i = Build.VERSION.SDK_INT;
    }

    @SuppressLint({"NewApi"})
    public C0552d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f2642a = textPaint;
        this.f2643b = textDirectionHeuristic;
        this.f2644c = i;
        this.f2645d = i2;
    }

    /* renamed from: a */
    public boolean m2337a(C0552d c0552d) {
        int i = Build.VERSION.SDK_INT;
        if ((i < 23 || (this.f2644c == c0552d.f2644c && this.f2645d == c0552d.f2645d)) && this.f2642a.getTextSize() == c0552d.f2642a.getTextSize() && this.f2642a.getTextScaleX() == c0552d.f2642a.getTextScaleX() && this.f2642a.getTextSkewX() == c0552d.f2642a.getTextSkewX()) {
            if ((i < 21 || (this.f2642a.getLetterSpacing() == c0552d.f2642a.getLetterSpacing() && TextUtils.equals(this.f2642a.getFontFeatureSettings(), c0552d.f2642a.getFontFeatureSettings()))) && this.f2642a.getFlags() == c0552d.f2642a.getFlags()) {
                if (i >= 24) {
                    if (!this.f2642a.getTextLocales().equals(c0552d.f2642a.getTextLocales())) {
                        return false;
                    }
                } else if (i >= 17 && !this.f2642a.getTextLocale().equals(c0552d.f2642a.getTextLocale())) {
                    return false;
                }
                return this.f2642a.getTypeface() == null ? c0552d.f2642a.getTypeface() == null : this.f2642a.getTypeface().equals(c0552d.f2642a.getTypeface());
            }
            return false;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0552d) {
            C0552d c0552d = (C0552d) obj;
            if (m2337a(c0552d)) {
                return Build.VERSION.SDK_INT < 18 || this.f2643b == c0552d.f2643b;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return AbstractC0022t.m3522L(Float.valueOf(this.f2642a.getTextSize()), Float.valueOf(this.f2642a.getTextScaleX()), Float.valueOf(this.f2642a.getTextSkewX()), Float.valueOf(this.f2642a.getLetterSpacing()), Integer.valueOf(this.f2642a.getFlags()), this.f2642a.getTextLocales(), this.f2642a.getTypeface(), Boolean.valueOf(this.f2642a.isElegantTextHeight()), this.f2643b, Integer.valueOf(this.f2644c), Integer.valueOf(this.f2645d));
        }
        if (i >= 21) {
            return AbstractC0022t.m3522L(Float.valueOf(this.f2642a.getTextSize()), Float.valueOf(this.f2642a.getTextScaleX()), Float.valueOf(this.f2642a.getTextSkewX()), Float.valueOf(this.f2642a.getLetterSpacing()), Integer.valueOf(this.f2642a.getFlags()), this.f2642a.getTextLocale(), this.f2642a.getTypeface(), Boolean.valueOf(this.f2642a.isElegantTextHeight()), this.f2643b, Integer.valueOf(this.f2644c), Integer.valueOf(this.f2645d));
        }
        if (i < 18 && i < 17) {
            return AbstractC0022t.m3522L(Float.valueOf(this.f2642a.getTextSize()), Float.valueOf(this.f2642a.getTextScaleX()), Float.valueOf(this.f2642a.getTextSkewX()), Integer.valueOf(this.f2642a.getFlags()), this.f2642a.getTypeface(), this.f2643b, Integer.valueOf(this.f2644c), Integer.valueOf(this.f2645d));
        }
        return AbstractC0022t.m3522L(Float.valueOf(this.f2642a.getTextSize()), Float.valueOf(this.f2642a.getTextScaleX()), Float.valueOf(this.f2642a.getTextSkewX()), Integer.valueOf(this.f2642a.getFlags()), this.f2642a.getTextLocale(), this.f2642a.getTypeface(), this.f2643b, Integer.valueOf(this.f2644c), Integer.valueOf(this.f2645d));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        StringBuilder m1187i;
        Object textLocale;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder m1187i2 = AbstractC1124a.m1187i("textSize=");
        m1187i2.append(this.f2642a.getTextSize());
        sb.append(m1187i2.toString());
        sb.append(", textScaleX=" + this.f2642a.getTextScaleX());
        sb.append(", textSkewX=" + this.f2642a.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            StringBuilder m1187i3 = AbstractC1124a.m1187i(", letterSpacing=");
            m1187i3.append(this.f2642a.getLetterSpacing());
            sb.append(m1187i3.toString());
            sb.append(", elegantTextHeight=" + this.f2642a.isElegantTextHeight());
        }
        if (i < 24) {
            if (i >= 17) {
                m1187i = AbstractC1124a.m1187i(", textLocale=");
                textLocale = this.f2642a.getTextLocale();
            }
            StringBuilder m1187i4 = AbstractC1124a.m1187i(", typeface=");
            m1187i4.append(this.f2642a.getTypeface());
            sb.append(m1187i4.toString());
            if (i >= 26) {
                StringBuilder m1187i5 = AbstractC1124a.m1187i(", variationSettings=");
                m1187i5.append(this.f2642a.getFontVariationSettings());
                sb.append(m1187i5.toString());
            }
            StringBuilder m1187i6 = AbstractC1124a.m1187i(", textDir=");
            m1187i6.append(this.f2643b);
            sb.append(m1187i6.toString());
            sb.append(", breakStrategy=" + this.f2644c);
            sb.append(", hyphenationFrequency=" + this.f2645d);
            sb.append("}");
            return sb.toString();
        }
        m1187i = AbstractC1124a.m1187i(", textLocale=");
        textLocale = this.f2642a.getTextLocales();
        m1187i.append(textLocale);
        sb.append(m1187i.toString());
        StringBuilder m1187i42 = AbstractC1124a.m1187i(", typeface=");
        m1187i42.append(this.f2642a.getTypeface());
        sb.append(m1187i42.toString());
        if (i >= 26) {
        }
        StringBuilder m1187i62 = AbstractC1124a.m1187i(", textDir=");
        m1187i62.append(this.f2643b);
        sb.append(m1187i62.toString());
        sb.append(", breakStrategy=" + this.f2644c);
        sb.append(", hyphenationFrequency=" + this.f2645d);
        sb.append("}");
        return sb.toString();
    }
}