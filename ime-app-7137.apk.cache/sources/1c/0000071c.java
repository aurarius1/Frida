package p093c.p097b.p130z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.util.Xml;
import com.menny.android.anysoftkeyboard.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p097b.p130z.p132r0.C1738o0;
import p093c.p176h.p177a.p178a.AbstractC2062a0;

/* renamed from: c.b.z.p */
/* loaded from: classes.dex */
public class Key {

    /* renamed from: A */
    public CharSequence f5209A;

    /* renamed from: B */
    public CharSequence f5210B;

    /* renamed from: C */
    public int f5211C;

    /* renamed from: D */
    public int f5212D;

    /* renamed from: E */
    public int[] f5213E;

    /* renamed from: F */
    public boolean f5214F;

    /* renamed from: G */
    public boolean f5215G;

    /* renamed from: H */
    public boolean f5216H;

    /* renamed from: I */
    public List f5217I;

    /* renamed from: a */
    public int[] f5218a;

    /* renamed from: b */
    public CharSequence f5219b;

    /* renamed from: c */
    public Drawable f5220c;

    /* renamed from: d */
    public Drawable f5221d;

    /* renamed from: e */
    public int width;

    /* renamed from: f */
    public int height;

    /* renamed from: g */
    public int f5224g;

    /* renamed from: h */
    public int x;

    /* renamed from: i */
    public int centerX;

    /* renamed from: j */
    public int y;

    /* renamed from: k */
    public int centerY;

    /* renamed from: l */
    public boolean f5229l;

    /* renamed from: m */
    public CharSequence f5230m;

    /* renamed from: n */
    public CharSequence f5231n;

    /* renamed from: o */
    public CharSequence f5232o;

    /* renamed from: p */
    public CharSequence f5233p;

    /* renamed from: q */
    public CharSequence f5234q;

    /* renamed from: r */
    public int f5235r;

    /* renamed from: s */
    public boolean f5236s;

    /* renamed from: t */
    public AbstractC1669f0 f5237t;

    /* renamed from: u */
    public final C1667e0 f5238u;

    /* renamed from: v */
    public int f5239v;

    /* renamed from: w */
    public boolean f5240w;

    /* renamed from: x */
    public boolean f5241x;

    /* renamed from: y */
    public boolean f5242y;

    /* renamed from: z */
    public int f5243z;

    public Key(InterfaceC1423a interfaceC1423a, Context context, C1667e0 c1667e0, InterfaceC1677j0 interfaceC1677j0, int i, int i2, XmlResourceParser xmlResourceParser) {
        this.f5218a = new int[0];
        this.f5240w = false;
        this.f5238u = c1667e0;
        AbstractC1669f0 abstractC1669f0 = c1667e0.f5129g;
        this.f5237t = abstractC1669f0;
        this.height = AbstractC1681l0.m915b(interfaceC1677j0, c1667e0.f5124b, abstractC1669f0.f5133c);
        int i3 = c1667e0.f5123a;
        this.width = i3;
        this.f5224g = c1667e0.f5125c;
        this.f5235r = c1667e0.f5127e;
        this.f5242y = this.f5237t.f5141k;
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = AbstractC1681l0.m915b(interfaceC1677j0, c1667e0.f5124b, c1667e0.f5129g.f5133c);
        this.f5224g = c1667e0.f5125c;
        this.f5218a = new int[0];
        this.f5221d = null;
        this.f5234q = null;
        this.f5239v = 0;
        this.f5241x = false;
        this.f5243z = 0;
        this.f5236s = false;
        int[] mo1065a = interfaceC1423a.mo1065a(AbstractC2062a0.KeyboardLayout);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), mo1065a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            m894g(c1667e0, interfaceC1677j0, obtainStyledAttributes, index, interfaceC1423a.mo1064b(mo1065a[index]));
        }
        obtainStyledAttributes.recycle();
        this.x += this.f5224g;
        int[] mo1065a2 = interfaceC1423a.mo1065a(AbstractC2062a0.KeyboardLayout_Key);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), mo1065a2);
        int indexCount2 = obtainStyledAttributes2.getIndexCount();
        for (int i5 = 0; i5 < indexCount2; i5++) {
            int index2 = obtainStyledAttributes2.getIndex(i5);
            m894g(c1667e0, interfaceC1677j0, obtainStyledAttributes2, index2, interfaceC1423a.mo1064b(mo1065a2[index2]));
        }
        boolean z = true;
        this.f5240w = this.f5239v != 0;
        if (interfaceC1423a.mo1063c() < 8 && this.f5218a.length == 0 && !TextUtils.isEmpty(this.f5219b)) {
            this.f5218a = new int[]{Character.codePointAt(this.f5219b, 0)};
        }
        obtainStyledAttributes2.recycle();
        this.centerX = (this.width / 2) + this.x;
        this.centerY = (this.height / 2) + this.y;
        if (this.f5231n == null) {
            this.f5231n = this.f5230m;
        }
        if (this.f5233p == null) {
            this.f5233p = this.f5232o;
        }
        this.f5213E = AbstractC1762t.f5408y;
        this.f5217I = Collections.emptyList();
        this.f5216H = true;
        this.f5215G = false;
        this.f5211C = 0;
        this.f5209A = null;
        this.f5210B = null;
        int[] mo1065a3 = interfaceC1423a.mo1065a(AbstractC2062a0.KeyboardLayout_Key);
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), mo1065a3);
        int indexCount3 = obtainStyledAttributes3.getIndexCount();
        boolean z2 = false;
        for (int i6 = 0; i6 < indexCount3; i6++) {
            int index3 = obtainStyledAttributes3.getIndex(i6);
            switch (interfaceC1423a.mo1064b(mo1065a3[index3])) {
                case R.attr.hintLabel /* 2130969003 */:
                    this.f5210B = obtainStyledAttributes3.getString(index3);
                    break;
                case R.attr.isFunctional /* 2130969074 */:
                    this.f5215G = obtainStyledAttributes3.getBoolean(index3, false);
                    break;
                case R.attr.isShiftAlways /* 2130969078 */:
                    try {
                        this.f5214F = obtainStyledAttributes3.getBoolean(index3, false);
                    } catch (Exception unused) {
                    }
                    z2 = true;
                    break;
                case R.attr.longPressCode /* 2130969226 */:
                    this.f5211C = obtainStyledAttributes3.getInt(index3, 0);
                    break;
                case R.attr.shiftedCodes /* 2130969418 */:
                    this.f5213E = AbstractC1681l0.m916a(obtainStyledAttributes3, index3);
                    break;
                case R.attr.shiftedKeyLabel /* 2130969419 */:
                    this.f5209A = obtainStyledAttributes3.getString(index3);
                    break;
                case R.attr.showInLayout /* 2130969429 */:
                    this.f5212D = obtainStyledAttributes3.getInt(index3, 0);
                    break;
                case R.attr.tags /* 2130969542 */:
                    try {
                        String string = obtainStyledAttributes3.getString(index3);
                        if (TextUtils.isEmpty(string)) {
                            break;
                        } else {
                            this.f5217I = Arrays.asList(string.split(","));
                            break;
                        }
                    } catch (Exception unused2) {
                        break;
                    }
            }
        }
        obtainStyledAttributes3.recycle();
        int[] iArr = this.f5213E;
        int length = iArr.length;
        int[] iArr2 = this.f5218a;
        if (length != iArr2.length) {
            this.f5213E = new int[iArr2.length];
            int i7 = 0;
            while (i7 < iArr.length && i7 < this.f5218a.length) {
                this.f5213E[i7] = iArr[i7];
                i7++;
            }
            while (true) {
                int[] iArr3 = this.f5218a;
                if (i7 < iArr3.length) {
                    int i8 = iArr3[i7];
                    if (Character.isLetter(i8)) {
                        this.f5213E[i7] = Character.toUpperCase(i8);
                    } else {
                        this.f5213E[i7] = i8;
                    }
                    i7++;
                }
            }
        }
        if (!z2) {
            int[] iArr4 = this.f5213E;
            if (iArr4.length != 0 && !Character.isLetter(iArr4[0]) && Character.getType(this.f5213E[0]) != 6 && Character.getType(this.f5213E[0]) != 8) {
                z = false;
            }
            this.f5214F = z;
        }
        CharSequence charSequence = this.f5234q;
        if (charSequence == null || charSequence.length() != 0) {
            return;
        }
        this.f5239v = 0;
    }

    /* renamed from: a */
    public void mo892a() {
        this.f5221d = null;
        this.f5220c = null;
        this.f5219b = "  ";
        this.f5216H = false;
    }

    /* renamed from: b */
    public int m898b(int i, boolean z) {
        int[] iArr = this.f5218a;
        if (iArr.length == 0) {
            return 0;
        }
        return z ? this.f5213E[i] : iArr[i];
    }

    /* renamed from: c */
    public int[] mo891c(C1738o0 c1738o0) {
        if (this.f5215G) {
            return this.f5229l ? c1738o0.f5344d : c1738o0.f5343c;
        }
        return this.f5229l ? c1738o0.f5342b : c1738o0.f5341a;
    }

    /* renamed from: d */
    public int m897d(int i) {
        int length = this.f5218a.length;
        if (length == 0) {
            return 32;
        }
        return m898b(i < 0 ? 0 : i % length, this.f5237t.mo838h());
    }

    /* renamed from: e */
    public int getPrimaryCode() {
        int[] iArr = this.f5218a;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    /* renamed from: f */
    public boolean m895f(int i, int i2) {
        int i3;
        if (this.f5216H) {
            int i4 = this.f5235r;
            boolean z = (i4 & 1) != 0;
            boolean z2 = (i4 & 2) != 0;
            boolean z3 = (i4 & 4) != 0;
            boolean z4 = (i4 & 8) != 0;
            int i5 = this.x;
            return (i >= i5 || (z && i <= this.width + i5)) && ((i < this.width + i5 || (z2 && i >= i5)) && ((i2 >= (i3 = this.y) || (z3 && i2 <= this.height + i3)) && (i2 < this.height + i3 || (z4 && i2 >= i3))));
        }
        return false;
    }

    /* renamed from: g */
    public final void m894g(C1667e0 c1667e0, InterfaceC1677j0 interfaceC1677j0, TypedArray typedArray, int i, int i2) {
        Drawable drawable;
        if (i2 == R.attr.keyDynamicEmblem) {
            this.f5243z = typedArray.getInt(i, 0);
        } else if (i2 == R.attr.keyOutputTyping) {
            this.f5232o = typedArray.getText(i);
        } else if (i2 == R.attr.showPreview) {
            this.f5242y = typedArray.getBoolean(i, this.f5237t.f5141k);
        } else {
            switch (i2) {
                case 16843325:
                    this.width = AbstractC1669f0.m926d(typedArray, i, this.f5237t.f5149s, c1667e0.f5123a);
                    return;
                case 16843326:
                    this.height = AbstractC1681l0.m915b(interfaceC1677j0, AbstractC1669f0.m925f(typedArray, i, c1667e0.f5124b), this.f5238u.f5129g.f5133c);
                    return;
                case 16843327:
                    this.f5224g = AbstractC1669f0.m926d(typedArray, i, this.f5237t.f5149s, c1667e0.f5125c);
                    return;
                default:
                    switch (i2) {
                        case 16843330:
                            this.f5218a = AbstractC1681l0.m916a(typedArray, i);
                            return;
                        case 16843331:
                            this.f5239v = typedArray.getResourceId(i, 0);
                            return;
                        case 16843332:
                            this.f5234q = typedArray.getText(i);
                            return;
                        case 16843333:
                            int i3 = typedArray.getInt(i, 0);
                            this.f5235r = i3;
                            this.f5235r = c1667e0.f5127e | i3;
                            return;
                        case 16843334:
                            this.f5236s = typedArray.getBoolean(i, false);
                            return;
                        default:
                            switch (i2) {
                                case 16843336:
                                    this.f5241x = typedArray.getBoolean(i, false);
                                    return;
                                case 16843337:
                                    drawable = typedArray.getDrawable(i);
                                    this.f5221d = drawable;
                                    TypedValue typedValue = AbstractC1681l0.f5179a;
                                    if (drawable == null) {
                                        return;
                                    }
                                    break;
                                case 16843338:
                                    this.f5230m = typedArray.getText(i);
                                    return;
                                case 16843339:
                                    this.f5219b = typedArray.getText(i);
                                    return;
                                case 16843340:
                                    drawable = typedArray.getDrawable(i);
                                    this.f5220c = drawable;
                                    TypedValue typedValue2 = AbstractC1681l0.f5179a;
                                    if (drawable == null) {
                                        return;
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case R.attr.shiftedKeyOutputText /* 2130969420 */:
                                            this.f5231n = typedArray.getText(i);
                                            return;
                                        case R.attr.shiftedKeyOutputTyping /* 2130969421 */:
                                            this.f5233p = typedArray.getText(i);
                                            return;
                                        default:
                                            return;
                                    }
                            }
                            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            return;
                    }
            }
        }
    }

    /* renamed from: h */
    public int m893h(int i, int i2) {
        int i3 = this.x;
        if (i >= i3 && i <= (i3 = i3 + this.width)) {
            i3 = i;
        }
        int i4 = this.y;
        if (i2 >= i4 && i2 <= (i4 = i4 + this.height)) {
            i4 = i2;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        return (i6 * i6) + (i5 * i5);
    }

    public Key(C1667e0 c1667e0, InterfaceC1677j0 interfaceC1677j0) {
        this.f5218a = new int[0];
        this.f5240w = false;
        this.f5238u = c1667e0;
        AbstractC1669f0 abstractC1669f0 = c1667e0.f5129g;
        this.f5237t = abstractC1669f0;
        this.height = AbstractC1681l0.m915b(interfaceC1677j0, c1667e0.f5124b, abstractC1669f0.f5133c);
        this.width = c1667e0.f5123a;
        this.f5224g = c1667e0.f5125c;
        this.f5235r = c1667e0.f5127e;
        this.f5242y = this.f5237t.f5141k;
        this.f5213E = AbstractC1762t.f5408y;
        this.f5217I = Collections.emptyList();
    }
}