package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p048e.p049b.AbstractC0503i;
import p010b.p046j.p048e.p049b.AbstractC0505k;

/* renamed from: b.c.q.q3 */
/* loaded from: classes.dex */
public class C0302q3 {

    /* renamed from: a */
    public final Context f1739a;

    /* renamed from: b */
    public final TypedArray f1740b;

    /* renamed from: c */
    public TypedValue f1741c;

    public C0302q3(Context context, TypedArray typedArray) {
        this.f1739a = context;
        this.f1740b = typedArray;
    }

    /* renamed from: q */
    public static C0302q3 m2741q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0302q3(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: r */
    public static C0302q3 m2740r(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0302q3(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m2757a(int i, boolean z) {
        return this.f1740b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m2756b(int i, int i2) {
        return this.f1740b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m2755c(int i) {
        int resourceId;
        ColorStateList m3001a;
        return (!this.f1740b.hasValue(i) || (resourceId = this.f1740b.getResourceId(i, 0)) == 0 || (m3001a = AbstractC0142b.m3001a(this.f1739a, resourceId)) == null) ? this.f1740b.getColorStateList(i) : m3001a;
    }

    /* renamed from: d */
    public float m2754d(int i, float f) {
        return this.f1740b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m2753e(int i, int i2) {
        return this.f1740b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m2752f(int i, int i2) {
        return this.f1740b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m2751g(int i) {
        int resourceId;
        return (!this.f1740b.hasValue(i) || (resourceId = this.f1740b.getResourceId(i, 0)) == 0) ? this.f1740b.getDrawable(i) : AbstractC0142b.m3000b(this.f1739a, resourceId);
    }

    /* renamed from: h */
    public Drawable m2750h(int i) {
        int resourceId;
        Drawable m2772g;
        if (!this.f1740b.hasValue(i) || (resourceId = this.f1740b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0229d0 m2865a = C0229d0.m2865a();
        Context context = this.f1739a;
        synchronized (m2865a) {
            m2772g = m2865a.f1502c.m2772g(context, resourceId, true);
        }
        return m2772g;
    }

    /* renamed from: i */
    public Typeface m2749i(int i, int i2, AbstractC0503i abstractC0503i) {
        int resourceId = this.f1740b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1741c == null) {
            this.f1741c = new TypedValue();
        }
        Context context = this.f1739a;
        TypedValue typedValue = this.f1741c;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0505k.m2395j(context, resourceId, typedValue, i2, abstractC0503i, null, true, false);
    }

    /* renamed from: j */
    public int m2748j(int i, int i2) {
        return this.f1740b.getInt(i, i2);
    }

    /* renamed from: k */
    public int m2747k(int i, int i2) {
        return this.f1740b.getInteger(i, i2);
    }

    /* renamed from: l */
    public int m2746l(int i, int i2) {
        return this.f1740b.getLayoutDimension(i, i2);
    }

    /* renamed from: m */
    public int m2745m(int i, int i2) {
        return this.f1740b.getResourceId(i, i2);
    }

    /* renamed from: n */
    public String m2744n(int i) {
        return this.f1740b.getString(i);
    }

    /* renamed from: o */
    public CharSequence m2743o(int i) {
        return this.f1740b.getText(i);
    }

    /* renamed from: p */
    public boolean m2742p(int i) {
        return this.f1740b.hasValue(i);
    }
}