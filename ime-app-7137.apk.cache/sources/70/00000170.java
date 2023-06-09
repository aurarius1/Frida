package p010b.p016c.p026q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p060e1.AbstractC0589a;
import p010b.p046j.p061m.InterfaceC0640c;
import p010b.p046j.p061m.InterfaceC0648k;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.c.q.e1 */
/* loaded from: classes.dex */
public class C0236e1 {

    /* renamed from: a */
    public final TextView f1523a;

    /* renamed from: b */
    public C0292o3 f1524b;

    /* renamed from: c */
    public C0292o3 f1525c;

    /* renamed from: d */
    public C0292o3 f1526d;

    /* renamed from: e */
    public C0292o3 f1527e;

    /* renamed from: f */
    public C0292o3 f1528f;

    /* renamed from: g */
    public C0292o3 f1529g;

    /* renamed from: h */
    public C0292o3 f1530h;

    /* renamed from: i */
    public final C0265j1 f1531i;

    /* renamed from: j */
    public int f1532j = 0;

    /* renamed from: k */
    public int f1533k = -1;

    /* renamed from: l */
    public Typeface f1534l;

    /* renamed from: m */
    public boolean f1535m;

    public C0236e1(TextView textView) {
        this.f1523a = textView;
        this.f1531i = new C0265j1(textView);
    }

    /* renamed from: c */
    public static C0292o3 m2851c(Context context, C0229d0 c0229d0, int i) {
        ColorStateList m2862d = c0229d0.m2862d(context, i);
        if (m2862d != null) {
            C0292o3 c0292o3 = new C0292o3();
            c0292o3.f1681d = true;
            c0292o3.f1678a = m2862d;
            return c0292o3;
        }
        return null;
    }

    /* renamed from: a */
    public final void m2853a(Drawable drawable, C0292o3 c0292o3) {
        if (drawable == null || c0292o3 == null) {
            return;
        }
        C0229d0.m2860f(drawable, c0292o3, this.f1523a.getDrawableState());
    }

    /* renamed from: b */
    public void m2852b() {
        if (this.f1524b != null || this.f1525c != null || this.f1526d != null || this.f1527e != null) {
            Drawable[] compoundDrawables = this.f1523a.getCompoundDrawables();
            m2853a(compoundDrawables[0], this.f1524b);
            m2853a(compoundDrawables[1], this.f1525c);
            m2853a(compoundDrawables[2], this.f1526d);
            m2853a(compoundDrawables[3], this.f1527e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1528f == null && this.f1529g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1523a.getCompoundDrawablesRelative();
            m2853a(compoundDrawablesRelative[0], this.f1528f);
            m2853a(compoundDrawablesRelative[2], this.f1529g);
        }
    }

    /* renamed from: d */
    public boolean m2850d() {
        C0265j1 c0265j1 = this.f1531i;
        return c0265j1.m2801j() && c0265j1.f1614d != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5 A[ADDED_TO_REGION] */
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2849e(AttributeSet attributeSet, int i) {
        String str;
        String str2;
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z2;
        String str3;
        int i2;
        String m2744n;
        C0229d0 c0229d0;
        Typeface typeface;
        int i3;
        C0265j1 c0265j1;
        TypedArray obtainStyledAttributes;
        int i4;
        int i5;
        TypedArray obtainStyledAttributes2;
        int resourceId;
        C0229d0 c0229d02;
        Drawable drawable;
        Drawable m2864b;
        Drawable m2864b2;
        Drawable m2864b3;
        int i6;
        int i7;
        int i8;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        ColorStateList colorStateList4;
        int resourceId2;
        int resourceId3;
        int length;
        Context context = this.f1523a.getContext();
        C0229d0 m2865a = C0229d0.m2865a();
        int[] iArr = AbstractC0084j.AppCompatTextHelper;
        C0302q3 m2740r = C0302q3.m2740r(context, attributeSet, iArr, i, 0);
        TextView textView = this.f1523a;
        AbstractC0605j0.m2270M(textView, textView.getContext(), iArr, attributeSet, m2740r.f1740b, i, 0);
        int m2745m = m2740r.m2745m(AbstractC0084j.AppCompatTextHelper_android_textAppearance, -1);
        int i9 = AbstractC0084j.AppCompatTextHelper_android_drawableLeft;
        if (m2740r.m2742p(i9)) {
            this.f1524b = m2851c(context, m2865a, m2740r.m2745m(i9, 0));
        }
        int i10 = AbstractC0084j.AppCompatTextHelper_android_drawableTop;
        if (m2740r.m2742p(i10)) {
            this.f1525c = m2851c(context, m2865a, m2740r.m2745m(i10, 0));
        }
        int i11 = AbstractC0084j.AppCompatTextHelper_android_drawableRight;
        if (m2740r.m2742p(i11)) {
            this.f1526d = m2851c(context, m2865a, m2740r.m2745m(i11, 0));
        }
        int i12 = AbstractC0084j.AppCompatTextHelper_android_drawableBottom;
        if (m2740r.m2742p(i12)) {
            this.f1527e = m2851c(context, m2865a, m2740r.m2745m(i12, 0));
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 17) {
            int i14 = AbstractC0084j.AppCompatTextHelper_android_drawableStart;
            if (m2740r.m2742p(i14)) {
                this.f1528f = m2851c(context, m2865a, m2740r.m2745m(i14, 0));
            }
            int i15 = AbstractC0084j.AppCompatTextHelper_android_drawableEnd;
            if (m2740r.m2742p(i15)) {
                this.f1529g = m2851c(context, m2865a, m2740r.m2745m(i15, 0));
            }
        }
        m2740r.f1740b.recycle();
        boolean z3 = this.f1523a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m2745m != -1) {
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(m2745m, AbstractC0084j.TextAppearance);
            C0302q3 c0302q3 = new C0302q3(context, obtainStyledAttributes3);
            if (!z3) {
                int i16 = AbstractC0084j.TextAppearance_textAllCaps;
                if (c0302q3.m2742p(i16)) {
                    z = c0302q3.m2757a(i16, false);
                    z2 = true;
                    m2841m(context, c0302q3);
                    if (i13 >= 23) {
                        int i17 = AbstractC0084j.TextAppearance_android_textColor;
                        colorStateList3 = c0302q3.m2742p(i17) ? c0302q3.m2755c(i17) : null;
                        int i18 = AbstractC0084j.TextAppearance_android_textColorHint;
                        colorStateList = c0302q3.m2742p(i18) ? c0302q3.m2755c(i18) : null;
                        int i19 = AbstractC0084j.TextAppearance_android_textColorLink;
                        colorStateList2 = c0302q3.m2742p(i19) ? c0302q3.m2755c(i19) : null;
                    } else {
                        colorStateList = null;
                        colorStateList2 = null;
                        colorStateList3 = null;
                    }
                    int i20 = AbstractC0084j.TextAppearance_textLocale;
                    str = !c0302q3.m2742p(i20) ? c0302q3.m2744n(i20) : null;
                    if (i13 >= 26) {
                        int i21 = AbstractC0084j.TextAppearance_fontVariationSettings;
                        if (c0302q3.m2742p(i21)) {
                            str2 = c0302q3.m2744n(i21);
                            obtainStyledAttributes3.recycle();
                        }
                    }
                    str2 = null;
                    obtainStyledAttributes3.recycle();
                }
            }
            z = false;
            z2 = false;
            m2841m(context, c0302q3);
            if (i13 >= 23) {
            }
            int i202 = AbstractC0084j.TextAppearance_textLocale;
            if (!c0302q3.m2742p(i202)) {
            }
            if (i13 >= 26) {
            }
            str2 = null;
            obtainStyledAttributes3.recycle();
        } else {
            str = null;
            str2 = null;
            z = false;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            z2 = false;
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, AbstractC0084j.TextAppearance, i, 0);
        C0302q3 c0302q32 = new C0302q3(context, obtainStyledAttributes4);
        if (!z3) {
            int i22 = AbstractC0084j.TextAppearance_textAllCaps;
            if (c0302q32.m2742p(i22)) {
                str3 = str;
                z = c0302q32.m2757a(i22, false);
                i2 = 23;
                z2 = true;
                if (i13 < i2) {
                    int i23 = AbstractC0084j.TextAppearance_android_textColor;
                    if (c0302q32.m2742p(i23)) {
                        colorStateList3 = c0302q32.m2755c(i23);
                    }
                    int i24 = AbstractC0084j.TextAppearance_android_textColorHint;
                    if (c0302q32.m2742p(i24)) {
                        colorStateList = c0302q32.m2755c(i24);
                    }
                    int i25 = AbstractC0084j.TextAppearance_android_textColorLink;
                    if (c0302q32.m2742p(i25)) {
                        colorStateList2 = c0302q32.m2755c(i25);
                    }
                }
                int i26 = AbstractC0084j.TextAppearance_textLocale;
                m2744n = !c0302q32.m2742p(i26) ? c0302q32.m2744n(i26) : str3;
                if (i13 >= 26) {
                    int i27 = AbstractC0084j.TextAppearance_fontVariationSettings;
                    if (c0302q32.m2742p(i27)) {
                        str2 = c0302q32.m2744n(i27);
                    }
                }
                if (i13 >= 28) {
                    int i28 = AbstractC0084j.TextAppearance_android_textSize;
                    if (c0302q32.m2742p(i28)) {
                        c0229d0 = m2865a;
                        if (c0302q32.m2752f(i28, -1) == 0) {
                            this.f1523a.setTextSize(0, 0.0f);
                        }
                        m2841m(context, c0302q32);
                        obtainStyledAttributes4.recycle();
                        if (colorStateList3 != null) {
                            this.f1523a.setTextColor(colorStateList3);
                        }
                        if (colorStateList != null) {
                            this.f1523a.setHintTextColor(colorStateList);
                        }
                        if (colorStateList2 != null) {
                            this.f1523a.setLinkTextColor(colorStateList2);
                        }
                        if (!z3 && z2) {
                            this.f1523a.setAllCaps(z);
                        }
                        typeface = this.f1534l;
                        if (typeface != null) {
                            if (this.f1533k == -1) {
                                this.f1523a.setTypeface(typeface, this.f1532j);
                            } else {
                                this.f1523a.setTypeface(typeface);
                            }
                        }
                        if (str2 != null) {
                            this.f1523a.setFontVariationSettings(str2);
                        }
                        if (m2744n != null) {
                            if (i13 >= 24) {
                                this.f1523a.setTextLocales(LocaleList.forLanguageTags(m2744n));
                            } else if (i13 >= 21) {
                                i3 = 0;
                                this.f1523a.setTextLocale(Locale.forLanguageTag(m2744n.substring(0, m2744n.indexOf(44))));
                                c0265j1 = this.f1531i;
                                Context context2 = c0265j1.f1623m;
                                int[] iArr2 = AbstractC0084j.AppCompatTextView;
                                obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, i3);
                                TextView textView2 = c0265j1.f1622l;
                                AbstractC0605j0.m2270M(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i, 0);
                                i4 = AbstractC0084j.AppCompatTextView_autoSizeTextType;
                                if (obtainStyledAttributes.hasValue(i4)) {
                                    c0265j1.f1614d = obtainStyledAttributes.getInt(i4, 0);
                                }
                                int i29 = AbstractC0084j.AppCompatTextView_autoSizeStepGranularity;
                                float dimension = !obtainStyledAttributes.hasValue(i29) ? obtainStyledAttributes.getDimension(i29, -1.0f) : -1.0f;
                                int i30 = AbstractC0084j.AppCompatTextView_autoSizeMinTextSize;
                                float dimension2 = !obtainStyledAttributes.hasValue(i30) ? obtainStyledAttributes.getDimension(i30, -1.0f) : -1.0f;
                                int i31 = AbstractC0084j.AppCompatTextView_autoSizeMaxTextSize;
                                float dimension3 = !obtainStyledAttributes.hasValue(i31) ? obtainStyledAttributes.getDimension(i31, -1.0f) : -1.0f;
                                i5 = AbstractC0084j.AppCompatTextView_autoSizePresetSizes;
                                if (obtainStyledAttributes.hasValue(i5) && (resourceId3 = obtainStyledAttributes.getResourceId(i5, 0)) > 0) {
                                    TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId3);
                                    length = obtainTypedArray.length();
                                    int[] iArr3 = new int[length];
                                    if (length > 0) {
                                        for (int i32 = 0; i32 < length; i32++) {
                                            iArr3[i32] = obtainTypedArray.getDimensionPixelSize(i32, -1);
                                        }
                                        c0265j1.f1619i = c0265j1.m2808c(iArr3);
                                        c0265j1.m2802i();
                                    }
                                    obtainTypedArray.recycle();
                                }
                                obtainStyledAttributes.recycle();
                                if (c0265j1.m2801j()) {
                                    c0265j1.f1614d = 0;
                                } else if (c0265j1.f1614d == 1) {
                                    if (!c0265j1.f1620j) {
                                        DisplayMetrics displayMetrics = c0265j1.f1623m.getResources().getDisplayMetrics();
                                        if (dimension2 == -1.0f) {
                                            dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                                        }
                                        if (dimension3 == -1.0f) {
                                            dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                                        }
                                        if (dimension == -1.0f) {
                                            dimension = 1.0f;
                                        }
                                        c0265j1.m2800k(dimension2, dimension3, dimension);
                                    }
                                    c0265j1.m2803h();
                                }
                                if (InterfaceC0640c.f2820a) {
                                    C0265j1 c0265j12 = this.f1531i;
                                    if (c0265j12.f1614d != 0) {
                                        int[] iArr4 = c0265j12.f1619i;
                                        if (iArr4.length > 0) {
                                            if (this.f1523a.getAutoSizeStepGranularity() != -1.0f) {
                                                this.f1523a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f1531i.f1617g), Math.round(this.f1531i.f1618h), Math.round(this.f1531i.f1616f), 0);
                                            } else {
                                                this.f1523a.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                                            }
                                        }
                                    }
                                }
                                obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0084j.AppCompatTextView);
                                resourceId = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableLeftCompat, -1);
                                if (resourceId == -1) {
                                    c0229d02 = c0229d0;
                                    drawable = c0229d02.m2864b(context, resourceId);
                                } else {
                                    c0229d02 = c0229d0;
                                    drawable = null;
                                }
                                int resourceId4 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableTopCompat, -1);
                                m2864b = resourceId4 == -1 ? c0229d02.m2864b(context, resourceId4) : null;
                                int resourceId5 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableRightCompat, -1);
                                m2864b2 = resourceId5 == -1 ? c0229d02.m2864b(context, resourceId5) : null;
                                int resourceId6 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableBottomCompat, -1);
                                m2864b3 = resourceId6 == -1 ? c0229d02.m2864b(context, resourceId6) : null;
                                int resourceId7 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableStartCompat, -1);
                                Drawable m2864b4 = resourceId7 == -1 ? c0229d02.m2864b(context, resourceId7) : null;
                                int resourceId8 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableEndCompat, -1);
                                Drawable m2864b5 = resourceId8 == -1 ? c0229d02.m2864b(context, resourceId8) : null;
                                i6 = Build.VERSION.SDK_INT;
                                if (i6 < 17 && !(m2864b4 == null && m2864b5 == null)) {
                                    Drawable[] compoundDrawablesRelative = this.f1523a.getCompoundDrawablesRelative();
                                    TextView textView3 = this.f1523a;
                                    if (m2864b4 == null) {
                                        m2864b4 = compoundDrawablesRelative[0];
                                    }
                                    if (m2864b == null) {
                                        m2864b = compoundDrawablesRelative[1];
                                    }
                                    if (m2864b5 == null) {
                                        m2864b5 = compoundDrawablesRelative[2];
                                    }
                                    if (m2864b3 == null) {
                                        m2864b3 = compoundDrawablesRelative[3];
                                    }
                                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(m2864b4, m2864b, m2864b5, m2864b3);
                                } else if (drawable == null || m2864b != null || m2864b2 != null || m2864b3 != null) {
                                    if (i6 >= 17) {
                                        Drawable[] compoundDrawablesRelative2 = this.f1523a.getCompoundDrawablesRelative();
                                        if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                                            TextView textView4 = this.f1523a;
                                            Drawable drawable2 = compoundDrawablesRelative2[0];
                                            if (m2864b == null) {
                                                m2864b = compoundDrawablesRelative2[1];
                                            }
                                            Drawable drawable3 = compoundDrawablesRelative2[2];
                                            if (m2864b3 == null) {
                                                m2864b3 = compoundDrawablesRelative2[3];
                                            }
                                            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, m2864b, drawable3, m2864b3);
                                        }
                                    }
                                    Drawable[] compoundDrawables = this.f1523a.getCompoundDrawables();
                                    TextView textView5 = this.f1523a;
                                    if (drawable == null) {
                                        drawable = compoundDrawables[0];
                                    }
                                    if (m2864b == null) {
                                        m2864b = compoundDrawables[1];
                                    }
                                    if (m2864b2 == null) {
                                        m2864b2 = compoundDrawables[2];
                                    }
                                    if (m2864b3 == null) {
                                        m2864b3 = compoundDrawables[3];
                                    }
                                    textView5.setCompoundDrawablesWithIntrinsicBounds(drawable, m2864b, m2864b2, m2864b3);
                                }
                                i7 = AbstractC0084j.AppCompatTextView_drawableTint;
                                if (obtainStyledAttributes2.hasValue(i7)) {
                                    if (!obtainStyledAttributes2.hasValue(i7) || (resourceId2 = obtainStyledAttributes2.getResourceId(i7, 0)) == 0 || (colorStateList4 = AbstractC0142b.m3001a(context, resourceId2)) == null) {
                                        colorStateList4 = obtainStyledAttributes2.getColorStateList(i7);
                                    }
                                    TextView textView6 = this.f1523a;
                                    textView6.getClass();
                                    if (i6 >= 24) {
                                        textView6.setCompoundDrawableTintList(colorStateList4);
                                    } else if (textView6 instanceof InterfaceC0648k) {
                                        ((InterfaceC0648k) textView6).setSupportCompoundDrawablesTintList(colorStateList4);
                                    }
                                }
                                i8 = AbstractC0084j.AppCompatTextView_drawableTintMode;
                                if (obtainStyledAttributes2.hasValue(i8)) {
                                    PorterDuff.Mode m2783d = AbstractC0290o1.m2783d(obtainStyledAttributes2.getInt(i8, -1), null);
                                    TextView textView7 = this.f1523a;
                                    textView7.getClass();
                                    if (i6 >= 24) {
                                        textView7.setCompoundDrawableTintMode(m2783d);
                                    } else if (textView7 instanceof InterfaceC0648k) {
                                        ((InterfaceC0648k) textView7).setSupportCompoundDrawablesTintMode(m2783d);
                                    }
                                }
                                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_firstBaselineToTopHeight, -1);
                                dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lastBaselineToBottomHeight, -1);
                                dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lineHeight, -1);
                                obtainStyledAttributes2.recycle();
                                if (dimensionPixelSize != -1) {
                                    AbstractC0022t.m3502c0(this.f1523a, dimensionPixelSize);
                                }
                                if (dimensionPixelSize2 != -1) {
                                    AbstractC0022t.m3496f0(this.f1523a, dimensionPixelSize2);
                                }
                                if (dimensionPixelSize3 == -1) {
                                    AbstractC0022t.m3492h0(this.f1523a, dimensionPixelSize3);
                                    return;
                                }
                                return;
                            }
                        }
                        i3 = 0;
                        c0265j1 = this.f1531i;
                        Context context22 = c0265j1.f1623m;
                        int[] iArr22 = AbstractC0084j.AppCompatTextView;
                        obtainStyledAttributes = context22.obtainStyledAttributes(attributeSet, iArr22, i, i3);
                        TextView textView22 = c0265j1.f1622l;
                        AbstractC0605j0.m2270M(textView22, textView22.getContext(), iArr22, attributeSet, obtainStyledAttributes, i, 0);
                        i4 = AbstractC0084j.AppCompatTextView_autoSizeTextType;
                        if (obtainStyledAttributes.hasValue(i4)) {
                        }
                        int i292 = AbstractC0084j.AppCompatTextView_autoSizeStepGranularity;
                        if (!obtainStyledAttributes.hasValue(i292)) {
                        }
                        int i302 = AbstractC0084j.AppCompatTextView_autoSizeMinTextSize;
                        if (!obtainStyledAttributes.hasValue(i302)) {
                        }
                        int i312 = AbstractC0084j.AppCompatTextView_autoSizeMaxTextSize;
                        if (!obtainStyledAttributes.hasValue(i312)) {
                        }
                        i5 = AbstractC0084j.AppCompatTextView_autoSizePresetSizes;
                        if (obtainStyledAttributes.hasValue(i5)) {
                            TypedArray obtainTypedArray2 = obtainStyledAttributes.getResources().obtainTypedArray(resourceId3);
                            length = obtainTypedArray2.length();
                            int[] iArr32 = new int[length];
                            if (length > 0) {
                            }
                            obtainTypedArray2.recycle();
                        }
                        obtainStyledAttributes.recycle();
                        if (c0265j1.m2801j()) {
                        }
                        if (InterfaceC0640c.f2820a) {
                        }
                        obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0084j.AppCompatTextView);
                        resourceId = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableLeftCompat, -1);
                        if (resourceId == -1) {
                        }
                        int resourceId42 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableTopCompat, -1);
                        if (resourceId42 == -1) {
                        }
                        int resourceId52 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableRightCompat, -1);
                        if (resourceId52 == -1) {
                        }
                        int resourceId62 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableBottomCompat, -1);
                        if (resourceId62 == -1) {
                        }
                        int resourceId72 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableStartCompat, -1);
                        if (resourceId72 == -1) {
                        }
                        int resourceId82 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableEndCompat, -1);
                        if (resourceId82 == -1) {
                        }
                        i6 = Build.VERSION.SDK_INT;
                        if (i6 < 17) {
                        }
                        if (drawable == null) {
                        }
                        if (i6 >= 17) {
                        }
                        Drawable[] compoundDrawables2 = this.f1523a.getCompoundDrawables();
                        TextView textView52 = this.f1523a;
                        if (drawable == null) {
                        }
                        if (m2864b == null) {
                        }
                        if (m2864b2 == null) {
                        }
                        if (m2864b3 == null) {
                        }
                        textView52.setCompoundDrawablesWithIntrinsicBounds(drawable, m2864b, m2864b2, m2864b3);
                        i7 = AbstractC0084j.AppCompatTextView_drawableTint;
                        if (obtainStyledAttributes2.hasValue(i7)) {
                        }
                        i8 = AbstractC0084j.AppCompatTextView_drawableTintMode;
                        if (obtainStyledAttributes2.hasValue(i8)) {
                        }
                        dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_firstBaselineToTopHeight, -1);
                        dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lastBaselineToBottomHeight, -1);
                        dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lineHeight, -1);
                        obtainStyledAttributes2.recycle();
                        if (dimensionPixelSize != -1) {
                        }
                        if (dimensionPixelSize2 != -1) {
                        }
                        if (dimensionPixelSize3 == -1) {
                        }
                    }
                }
                c0229d0 = m2865a;
                m2841m(context, c0302q32);
                obtainStyledAttributes4.recycle();
                if (colorStateList3 != null) {
                }
                if (colorStateList != null) {
                }
                if (colorStateList2 != null) {
                }
                if (!z3) {
                    this.f1523a.setAllCaps(z);
                }
                typeface = this.f1534l;
                if (typeface != null) {
                }
                if (str2 != null) {
                }
                if (m2744n != null) {
                }
                i3 = 0;
                c0265j1 = this.f1531i;
                Context context222 = c0265j1.f1623m;
                int[] iArr222 = AbstractC0084j.AppCompatTextView;
                obtainStyledAttributes = context222.obtainStyledAttributes(attributeSet, iArr222, i, i3);
                TextView textView222 = c0265j1.f1622l;
                AbstractC0605j0.m2270M(textView222, textView222.getContext(), iArr222, attributeSet, obtainStyledAttributes, i, 0);
                i4 = AbstractC0084j.AppCompatTextView_autoSizeTextType;
                if (obtainStyledAttributes.hasValue(i4)) {
                }
                int i2922 = AbstractC0084j.AppCompatTextView_autoSizeStepGranularity;
                if (!obtainStyledAttributes.hasValue(i2922)) {
                }
                int i3022 = AbstractC0084j.AppCompatTextView_autoSizeMinTextSize;
                if (!obtainStyledAttributes.hasValue(i3022)) {
                }
                int i3122 = AbstractC0084j.AppCompatTextView_autoSizeMaxTextSize;
                if (!obtainStyledAttributes.hasValue(i3122)) {
                }
                i5 = AbstractC0084j.AppCompatTextView_autoSizePresetSizes;
                if (obtainStyledAttributes.hasValue(i5)) {
                }
                obtainStyledAttributes.recycle();
                if (c0265j1.m2801j()) {
                }
                if (InterfaceC0640c.f2820a) {
                }
                obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0084j.AppCompatTextView);
                resourceId = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableLeftCompat, -1);
                if (resourceId == -1) {
                }
                int resourceId422 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableTopCompat, -1);
                if (resourceId422 == -1) {
                }
                int resourceId522 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableRightCompat, -1);
                if (resourceId522 == -1) {
                }
                int resourceId622 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableBottomCompat, -1);
                if (resourceId622 == -1) {
                }
                int resourceId722 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableStartCompat, -1);
                if (resourceId722 == -1) {
                }
                int resourceId822 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableEndCompat, -1);
                if (resourceId822 == -1) {
                }
                i6 = Build.VERSION.SDK_INT;
                if (i6 < 17) {
                }
                if (drawable == null) {
                }
                if (i6 >= 17) {
                }
                Drawable[] compoundDrawables22 = this.f1523a.getCompoundDrawables();
                TextView textView522 = this.f1523a;
                if (drawable == null) {
                }
                if (m2864b == null) {
                }
                if (m2864b2 == null) {
                }
                if (m2864b3 == null) {
                }
                textView522.setCompoundDrawablesWithIntrinsicBounds(drawable, m2864b, m2864b2, m2864b3);
                i7 = AbstractC0084j.AppCompatTextView_drawableTint;
                if (obtainStyledAttributes2.hasValue(i7)) {
                }
                i8 = AbstractC0084j.AppCompatTextView_drawableTintMode;
                if (obtainStyledAttributes2.hasValue(i8)) {
                }
                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_firstBaselineToTopHeight, -1);
                dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lastBaselineToBottomHeight, -1);
                dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lineHeight, -1);
                obtainStyledAttributes2.recycle();
                if (dimensionPixelSize != -1) {
                }
                if (dimensionPixelSize2 != -1) {
                }
                if (dimensionPixelSize3 == -1) {
                }
            }
        }
        str3 = str;
        i2 = 23;
        if (i13 < i2) {
        }
        int i262 = AbstractC0084j.TextAppearance_textLocale;
        if (!c0302q32.m2742p(i262)) {
        }
        if (i13 >= 26) {
        }
        if (i13 >= 28) {
        }
        c0229d0 = m2865a;
        m2841m(context, c0302q32);
        obtainStyledAttributes4.recycle();
        if (colorStateList3 != null) {
        }
        if (colorStateList != null) {
        }
        if (colorStateList2 != null) {
        }
        if (!z3) {
        }
        typeface = this.f1534l;
        if (typeface != null) {
        }
        if (str2 != null) {
        }
        if (m2744n != null) {
        }
        i3 = 0;
        c0265j1 = this.f1531i;
        Context context2222 = c0265j1.f1623m;
        int[] iArr2222 = AbstractC0084j.AppCompatTextView;
        obtainStyledAttributes = context2222.obtainStyledAttributes(attributeSet, iArr2222, i, i3);
        TextView textView2222 = c0265j1.f1622l;
        AbstractC0605j0.m2270M(textView2222, textView2222.getContext(), iArr2222, attributeSet, obtainStyledAttributes, i, 0);
        i4 = AbstractC0084j.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i4)) {
        }
        int i29222 = AbstractC0084j.AppCompatTextView_autoSizeStepGranularity;
        if (!obtainStyledAttributes.hasValue(i29222)) {
        }
        int i30222 = AbstractC0084j.AppCompatTextView_autoSizeMinTextSize;
        if (!obtainStyledAttributes.hasValue(i30222)) {
        }
        int i31222 = AbstractC0084j.AppCompatTextView_autoSizeMaxTextSize;
        if (!obtainStyledAttributes.hasValue(i31222)) {
        }
        i5 = AbstractC0084j.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i5)) {
        }
        obtainStyledAttributes.recycle();
        if (c0265j1.m2801j()) {
        }
        if (InterfaceC0640c.f2820a) {
        }
        obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0084j.AppCompatTextView);
        resourceId = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableLeftCompat, -1);
        if (resourceId == -1) {
        }
        int resourceId4222 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableTopCompat, -1);
        if (resourceId4222 == -1) {
        }
        int resourceId5222 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableRightCompat, -1);
        if (resourceId5222 == -1) {
        }
        int resourceId6222 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableBottomCompat, -1);
        if (resourceId6222 == -1) {
        }
        int resourceId7222 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableStartCompat, -1);
        if (resourceId7222 == -1) {
        }
        int resourceId8222 = obtainStyledAttributes2.getResourceId(AbstractC0084j.AppCompatTextView_drawableEndCompat, -1);
        if (resourceId8222 == -1) {
        }
        i6 = Build.VERSION.SDK_INT;
        if (i6 < 17) {
        }
        if (drawable == null) {
        }
        if (i6 >= 17) {
        }
        Drawable[] compoundDrawables222 = this.f1523a.getCompoundDrawables();
        TextView textView5222 = this.f1523a;
        if (drawable == null) {
        }
        if (m2864b == null) {
        }
        if (m2864b2 == null) {
        }
        if (m2864b3 == null) {
        }
        textView5222.setCompoundDrawablesWithIntrinsicBounds(drawable, m2864b, m2864b2, m2864b3);
        i7 = AbstractC0084j.AppCompatTextView_drawableTint;
        if (obtainStyledAttributes2.hasValue(i7)) {
        }
        i8 = AbstractC0084j.AppCompatTextView_drawableTintMode;
        if (obtainStyledAttributes2.hasValue(i8)) {
        }
        dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_firstBaselineToTopHeight, -1);
        dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.AppCompatTextView_lineHeight, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (dimensionPixelSize3 == -1) {
        }
    }

    /* renamed from: f */
    public void m2848f(Context context, int i) {
        String m2744n;
        ColorStateList m2755c;
        ColorStateList m2755c2;
        ColorStateList m2755c3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0084j.TextAppearance);
        C0302q3 c0302q3 = new C0302q3(context, obtainStyledAttributes);
        int i2 = AbstractC0084j.TextAppearance_textAllCaps;
        if (c0302q3.m2742p(i2)) {
            this.f1523a.setAllCaps(c0302q3.m2757a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = AbstractC0084j.TextAppearance_android_textColor;
            if (c0302q3.m2742p(i4) && (m2755c3 = c0302q3.m2755c(i4)) != null) {
                this.f1523a.setTextColor(m2755c3);
            }
            int i5 = AbstractC0084j.TextAppearance_android_textColorLink;
            if (c0302q3.m2742p(i5) && (m2755c2 = c0302q3.m2755c(i5)) != null) {
                this.f1523a.setLinkTextColor(m2755c2);
            }
            int i6 = AbstractC0084j.TextAppearance_android_textColorHint;
            if (c0302q3.m2742p(i6) && (m2755c = c0302q3.m2755c(i6)) != null) {
                this.f1523a.setHintTextColor(m2755c);
            }
        }
        int i7 = AbstractC0084j.TextAppearance_android_textSize;
        if (c0302q3.m2742p(i7) && c0302q3.m2752f(i7, -1) == 0) {
            this.f1523a.setTextSize(0, 0.0f);
        }
        m2841m(context, c0302q3);
        if (i3 >= 26) {
            int i8 = AbstractC0084j.TextAppearance_fontVariationSettings;
            if (c0302q3.m2742p(i8) && (m2744n = c0302q3.m2744n(i8)) != null) {
                this.f1523a.setFontVariationSettings(m2744n);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f1534l;
        if (typeface != null) {
            this.f1523a.setTypeface(typeface, this.f1532j);
        }
    }

    /* renamed from: g */
    public void m2847g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        text.getClass();
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
        int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
        int length = text.length();
        if (i4 >= 0 && i5 <= length) {
            int i6 = editorInfo.inputType & 4095;
            if (!(i6 == 129 || i6 == 225 || i6 == 18)) {
                if (length <= 2048) {
                    AbstractC0589a.m2296c(editorInfo, text, i4, i5);
                    return;
                }
                int i7 = i5 - i4;
                int i8 = i7 > 1024 ? 0 : i7;
                int i9 = 2048 - i8;
                double d = i9;
                Double.isNaN(d);
                Double.isNaN(d);
                Double.isNaN(d);
                Double.isNaN(d);
                Double.isNaN(d);
                int min = Math.min(text.length() - i5, i9 - Math.min(i4, (int) (d * 0.8d)));
                int min2 = Math.min(i4, i9 - min);
                int i10 = i4 - min2;
                if (AbstractC0589a.m2297b(text, i10, 0)) {
                    i10++;
                    min2--;
                }
                if (AbstractC0589a.m2297b(text, (i5 + min) - 1, 1)) {
                    min--;
                }
                CharSequence concat = i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i5, min + i5)) : text.subSequence(i10, min2 + i8 + min + i10);
                int i11 = min2 + 0;
                AbstractC0589a.m2296c(editorInfo, concat, i11, i8 + i11);
                return;
            }
        }
        AbstractC0589a.m2296c(editorInfo, null, 0, 0);
    }

    /* renamed from: h */
    public void m2846h(int i, int i2, int i3, int i4) {
        C0265j1 c0265j1 = this.f1531i;
        if (c0265j1.m2801j()) {
            DisplayMetrics displayMetrics = c0265j1.f1623m.getResources().getDisplayMetrics();
            c0265j1.m2800k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0265j1.m2803h()) {
                c0265j1.m2809b();
            }
        }
    }

    /* renamed from: i */
    public void m2845i(int[] iArr, int i) {
        C0265j1 c0265j1 = this.f1531i;
        if (c0265j1.m2801j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0265j1.f1623m.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0265j1.f1619i = c0265j1.m2808c(iArr2);
                if (!c0265j1.m2802i()) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("None of the preset sizes is valid: ");
                    m1187i.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(m1187i.toString());
                }
            } else {
                c0265j1.f1620j = false;
            }
            if (c0265j1.m2803h()) {
                c0265j1.m2809b();
            }
        }
    }

    /* renamed from: j */
    public void m2844j(int i) {
        C0265j1 c0265j1 = this.f1531i;
        if (c0265j1.m2801j()) {
            if (i == 0) {
                c0265j1.f1614d = 0;
                c0265j1.f1617g = -1.0f;
                c0265j1.f1618h = -1.0f;
                c0265j1.f1616f = -1.0f;
                c0265j1.f1619i = new int[0];
                c0265j1.f1615e = false;
            } else if (i != 1) {
                throw new IllegalArgumentException(AbstractC1124a.m1193c("Unknown auto-size text type: ", i));
            } else {
                DisplayMetrics displayMetrics = c0265j1.f1623m.getResources().getDisplayMetrics();
                c0265j1.m2800k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (c0265j1.m2803h()) {
                    c0265j1.m2809b();
                }
            }
        }
    }

    /* renamed from: k */
    public void m2843k(ColorStateList colorStateList) {
        if (this.f1530h == null) {
            this.f1530h = new C0292o3();
        }
        C0292o3 c0292o3 = this.f1530h;
        c0292o3.f1678a = colorStateList;
        c0292o3.f1681d = colorStateList != null;
        this.f1524b = c0292o3;
        this.f1525c = c0292o3;
        this.f1526d = c0292o3;
        this.f1527e = c0292o3;
        this.f1528f = c0292o3;
        this.f1529g = c0292o3;
    }

    /* renamed from: l */
    public void m2842l(PorterDuff.Mode mode) {
        if (this.f1530h == null) {
            this.f1530h = new C0292o3();
        }
        C0292o3 c0292o3 = this.f1530h;
        c0292o3.f1679b = mode;
        c0292o3.f1680c = mode != null;
        this.f1524b = c0292o3;
        this.f1525c = c0292o3;
        this.f1526d = c0292o3;
        this.f1527e = c0292o3;
        this.f1528f = c0292o3;
        this.f1529g = c0292o3;
    }

    /* renamed from: m */
    public final void m2841m(Context context, C0302q3 c0302q3) {
        String m2744n;
        Typeface create;
        Typeface typeface;
        this.f1532j = c0302q3.m2748j(AbstractC0084j.TextAppearance_android_textStyle, this.f1532j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int m2748j = c0302q3.m2748j(AbstractC0084j.TextAppearance_android_textFontWeight, -1);
            this.f1533k = m2748j;
            if (m2748j != -1) {
                this.f1532j = (this.f1532j & 2) | 0;
            }
        }
        int i2 = AbstractC0084j.TextAppearance_android_fontFamily;
        if (!c0302q3.m2742p(i2) && !c0302q3.m2742p(AbstractC0084j.TextAppearance_fontFamily)) {
            int i3 = AbstractC0084j.TextAppearance_android_typeface;
            if (c0302q3.m2742p(i3)) {
                this.f1535m = false;
                int m2748j2 = c0302q3.m2748j(i3, 1);
                if (m2748j2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m2748j2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m2748j2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1534l = typeface;
                return;
            }
            return;
        }
        this.f1534l = null;
        int i4 = AbstractC0084j.TextAppearance_fontFamily;
        if (c0302q3.m2742p(i4)) {
            i2 = i4;
        }
        int i5 = this.f1533k;
        int i6 = this.f1532j;
        if (!context.isRestricted()) {
            try {
                Typeface m2749i = c0302q3.m2749i(i2, this.f1532j, new C0224c1(this, i5, i6, new WeakReference(this.f1523a)));
                if (m2749i != null) {
                    if (i >= 28 && this.f1533k != -1) {
                        m2749i = Typeface.create(Typeface.create(m2749i, 0), this.f1533k, (this.f1532j & 2) != 0);
                    }
                    this.f1534l = m2749i;
                }
                this.f1535m = this.f1534l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1534l != null || (m2744n = c0302q3.m2744n(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1533k == -1) {
            create = Typeface.create(m2744n, this.f1532j);
        } else {
            create = Typeface.create(Typeface.create(m2744n, 0), this.f1533k, (this.f1532j & 2) != 0);
        }
        this.f1534l = create;
    }
}