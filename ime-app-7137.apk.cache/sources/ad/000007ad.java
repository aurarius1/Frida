package p093c.p145g.p146a.p147a.p151d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1940l;

/* renamed from: c.g.a.a.d0.d */
/* loaded from: classes.dex */
public class C1833d {

    /* renamed from: a */
    public final ColorStateList f5586a;

    /* renamed from: b */
    public final ColorStateList f5587b;

    /* renamed from: c */
    public final String f5588c;

    /* renamed from: d */
    public final int f5589d;

    /* renamed from: e */
    public final int f5590e;

    /* renamed from: f */
    public final float f5591f;

    /* renamed from: g */
    public final float f5592g;

    /* renamed from: h */
    public final float f5593h;

    /* renamed from: i */
    public final boolean f5594i;

    /* renamed from: j */
    public final float f5595j;

    /* renamed from: k */
    public float f5596k;

    /* renamed from: l */
    public final int f5597l;

    /* renamed from: m */
    public boolean f5598m = false;

    /* renamed from: n */
    public Typeface f5599n;

    public C1833d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1940l.TextAppearance);
        this.f5596k = obtainStyledAttributes.getDimension(AbstractC1940l.TextAppearance_android_textSize, 0.0f);
        this.f5586a = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_textColor);
        AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_textColorHint);
        AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_textColorLink);
        this.f5589d = obtainStyledAttributes.getInt(AbstractC1940l.TextAppearance_android_textStyle, 0);
        this.f5590e = obtainStyledAttributes.getInt(AbstractC1940l.TextAppearance_android_typeface, 1);
        int i2 = AbstractC1940l.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : AbstractC1940l.TextAppearance_android_fontFamily;
        this.f5597l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f5588c = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(AbstractC1940l.TextAppearance_textAllCaps, false);
        this.f5587b = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_shadowColor);
        this.f5591f = obtainStyledAttributes.getFloat(AbstractC1940l.TextAppearance_android_shadowDx, 0.0f);
        this.f5592g = obtainStyledAttributes.getFloat(AbstractC1940l.TextAppearance_android_shadowDy, 0.0f);
        this.f5593h = obtainStyledAttributes.getFloat(AbstractC1940l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.f5594i = false;
            this.f5595j = 0.0f;
            return;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC1940l.MaterialTextAppearance);
        int i3 = AbstractC1940l.MaterialTextAppearance_android_letterSpacing;
        this.f5594i = obtainStyledAttributes2.hasValue(i3);
        this.f5595j = obtainStyledAttributes2.getFloat(i3, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m759a() {
        String str;
        if (this.f5599n == null && (str = this.f5588c) != null) {
            this.f5599n = Typeface.create(str, this.f5589d);
        }
        if (this.f5599n == null) {
            int i = this.f5590e;
            this.f5599n = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f5599n = Typeface.create(this.f5599n, this.f5589d);
        }
    }

    /* renamed from: b */
    public void m758b(Context context, AbstractC1834e abstractC1834e) {
        m759a();
        int i = this.f5597l;
        if (i == 0) {
            this.f5598m = true;
        }
        if (this.f5598m) {
            abstractC1834e.mo618b(this.f5599n, true);
            return;
        }
        try {
            C1831b c1831b = new C1831b(this, abstractC1834e);
            if (context.isRestricted()) {
                c1831b.m2407a(-4, null);
            } else {
                AbstractC0505k.m2395j(context, i, new TypedValue(), 0, c1831b, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f5598m = true;
            abstractC1834e.mo619a(1);
        } catch (Exception unused2) {
            this.f5598m = true;
            abstractC1834e.mo619a(-3);
        }
    }

    /* renamed from: c */
    public void m757c(Context context, TextPaint textPaint, AbstractC1834e abstractC1834e) {
        m759a();
        m756d(textPaint, this.f5599n);
        m758b(context, new C1832c(this, textPaint, abstractC1834e));
        ColorStateList colorStateList = this.f5586a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f5593h;
        float f2 = this.f5591f;
        float f3 = this.f5592g;
        ColorStateList colorStateList2 = this.f5587b;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: d */
    public void m756d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f5589d;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f5596k);
        if (Build.VERSION.SDK_INT < 21 || !this.f5594i) {
            return;
        }
        textPaint.setLetterSpacing(this.f5595j);
    }
}