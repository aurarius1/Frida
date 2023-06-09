package p093c.p097b.p130z;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import com.menny.android.anysoftkeyboard.R;
import java.util.Iterator;
import java.util.List;
import p010b.p046j.p050f.AbstractC0508c;
import p010b.p046j.p057k.C0561b;
import p010b.p046j.p057k.InterfaceC0564e;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p097b.p129y.C1656a;
import p181d.p182a.EnumC2090a;
import p181d.p182a.EnumC2091b;

/* renamed from: c.b.z.u */
/* loaded from: classes.dex */
public class C1763u extends AbstractC1762t {

    /* renamed from: K */
    public static final char[] f5420K = new char[0];

    /* renamed from: L */
    public final CharSequence f5421L;

    /* renamed from: M */
    public final EnumC2091b f5422M;

    /* renamed from: N */
    public final EnumC2090a f5423N;

    /* renamed from: O */
    public final Paint f5424O;

    /* renamed from: P */
    public int f5425P;

    public C1763u(AbstractC1427e abstractC1427e, Context context, int i, InterfaceC1677j0 interfaceC1677j0, CharSequence charSequence, EnumC2091b enumC2091b, EnumC2090a enumC2090a) {
        super(abstractC1427e, context, i, 1);
        this.f5424O = new Paint();
        this.f5425P = 0;
        this.f5422M = enumC2091b;
        this.f5423N = enumC2090a;
        this.f5421L = charSequence;
        mo837i(interfaceC1677j0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1763u(AbstractC1427e abstractC1427e, Context context, CharSequence charSequence, InterfaceC1677j0 interfaceC1677j0, String str) {
        super(abstractC1427e, context, r3);
        int i;
        CharSequence charSequence2 = charSequence;
        InterfaceC1677j0 interfaceC1677j02 = interfaceC1677j0;
        int m828z = m828z(charSequence);
        int i2 = 1;
        if (m828z == 1) {
            i = R.xml.popup_one_row;
        } else if (m828z == 2) {
            i = R.xml.popup_two_rows;
        } else if (m828z != 3) {
            throw new RuntimeException("AnyPopupKeyboard supports 1, 2, and 3 rows only!");
        } else {
            i = R.xml.popup_three_rows;
        }
        this.f5424O = new Paint();
        this.f5425P = 0;
        this.f5422M = null;
        this.f5423N = null;
        this.f5421L = str;
        mo837i(interfaceC1677j02);
        int m828z2 = m828z(charSequence);
        int ceil = (int) Math.ceil(Character.codePointCount(charSequence2, 0, charSequence.length()) / m828z2);
        List list = this.f5147q;
        int i3 = m828z2 - 1;
        while (i3 >= 0) {
            int size = (list.size() - i3) - i2;
            int i4 = i3 * ceil;
            Key key = (Key) list.get(size);
            C1667e0 c1667e0 = key.f5238u;
            float f = key.y;
            float f2 = c1667e0.f5125c;
            int codePointAt = Character.codePointAt(charSequence2, Character.offsetByCodePoints(charSequence2, 0, i4));
            int[] iArr = new int[i2];
            iArr[0] = codePointAt;
            key.f5218a = iArr;
            int i5 = i3;
            int[] iArr2 = new int[i2];
            iArr2[0] = codePointAt;
            key.f5219b = new String(iArr2, 0, i2);
            int[] iArr3 = new int[i2];
            iArr3[0] = Character.toUpperCase(codePointAt);
            key.f5213E = iArr3;
            float f3 = key.width;
            int codePointCount = Character.codePointCount(charSequence2, 0, charSequence.length());
            int i6 = i4 + 1;
            Key key2 = null;
            int i7 = 0;
            while (i6 < i4 + ceil && i6 < codePointCount) {
                float f4 = f2 / 2.0f;
                float f5 = f3 + f4;
                int i8 = codePointCount;
                Key key3 = new Key(c1667e0, interfaceC1677j02);
                int codePointAt2 = Character.codePointAt(charSequence2, Character.offsetByCodePoints(charSequence2, 0, i6));
                key3.f5218a = new int[]{codePointAt2};
                key3.f5219b = new String(new int[]{codePointAt2}, 0, 1);
                key3.f5213E = new int[]{Character.toUpperCase(codePointAt2)};
                int i9 = (int) f5;
                key3.x = i9;
                int i10 = (int) (key3.width - f2);
                key3.width = i10;
                key3.centerX = (i10 / 2) + i9;
                int i11 = (int) f;
                key3.y = i11;
                key3.centerY = i11 + key3.height;
                int i12 = (int) (i10 + f2 + f4);
                f3 = f5 + i12;
                i7 += i12;
                list.add(size, key3);
                i6++;
                charSequence2 = charSequence;
                interfaceC1677j02 = interfaceC1677j0;
                key2 = key3;
                ceil = ceil;
                i4 = i4;
                codePointCount = i8;
            }
            int i13 = ceil;
            int i14 = i7;
            key.f5235r = 1;
            Key key4 = key2;
            if (key4 != null) {
                key4.f5235r = 2;
            } else {
                key.f5235r = 3;
            }
            this.f5425P = Math.max(i14, this.f5425P);
            i3 = i5 - 1;
            charSequence2 = charSequence;
            interfaceC1677j02 = interfaceC1677j0;
            ceil = i13;
            i2 = 1;
        }
    }

    /* renamed from: z */
    public static int m828z(CharSequence charSequence) {
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        if (codePointCount <= 8) {
            return 1;
        }
        return codePointCount <= 16 ? 2 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r10 >= r11) goto L34;
     */
    @Override // p093c.p097b.p130z.AbstractC1762t, p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Key mo832b(InterfaceC1423a interfaceC1423a, Context context, Context context2, C1667e0 c1667e0, InterfaceC1677j0 interfaceC1677j0, int i, int i2, XmlResourceParser xmlResourceParser) {
        InterfaceC0564e interfaceC0564e;
        Key key;
        boolean z;
        Key mo832b = super.mo832b(interfaceC1423a, context, context2, c1667e0, interfaceC1677j0, i, i2, xmlResourceParser);
        if (!TextUtils.isEmpty(mo832b.f5230m)) {
            Paint paint = this.f5424O;
            CharSequence charSequence = mo832b.f5230m;
            boolean z2 = true;
            if (AbstractC1077v0.m1301C(charSequence)) {
                String charSequence2 = charSequence.toString();
                ThreadLocal threadLocal = AbstractC0508c.f2546a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z = paint.hasGlyph(charSequence2);
                } else {
                    int length = charSequence2.length();
                    if (length != 1 || !Character.isWhitespace(charSequence2.charAt(0))) {
                        float measureText = paint.measureText("\udfffd");
                        float measureText2 = paint.measureText("m");
                        float measureText3 = paint.measureText(charSequence2);
                        float f = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (charSequence2.codePointCount(0, charSequence2.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i3 = 0;
                                    while (i3 < length) {
                                        int charCount = Character.charCount(charSequence2.codePointAt(i3)) + i3;
                                        f += paint.measureText(charSequence2, i3, charCount);
                                        i3 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal threadLocal2 = AbstractC0508c.f2546a;
                                C0561b c0561b = (C0561b) threadLocal2.get();
                                if (c0561b == null) {
                                    c0561b = new C0561b(new Rect(), new Rect());
                                    threadLocal2.set(c0561b);
                                } else {
                                    ((Rect) c0561b.f2654a).setEmpty();
                                    ((Rect) c0561b.f2655b).setEmpty();
                                }
                                paint.getTextBounds("\udfffd", 0, 2, (Rect) c0561b.f2654a);
                                paint.getTextBounds(charSequence2, 0, length, (Rect) c0561b.f2655b);
                                z = !((Rect) c0561b.f2654a).equals(c0561b.f2655b);
                            }
                        }
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (!z2) {
                mo832b.mo892a();
                mo832b.width = 0;
                mo832b.f5230m = "";
                mo832b.f5219b = "";
                mo832b.f5213E = AbstractC1762t.f5408y;
            }
        }
        if ((this.f5422M != null || this.f5423N != null) && mo832b.f5239v != 0 && TextUtils.isEmpty(mo832b.f5234q) && !TextUtils.isEmpty(mo832b.f5230m) && AbstractC1077v0.m1301C(mo832b.f5230m)) {
            List list = new C1763u(this.f5134d, context, mo832b.f5239v, interfaceC1677j0, "temp", null, null).f5147q;
            final EnumC2091b enumC2091b = this.f5422M;
            final EnumC2090a enumC2090a = this.f5423N;
            if (enumC2091b != null && enumC2090a != null) {
                interfaceC0564e = new InterfaceC0564e() { // from class: c.b.z.a
                    @Override // p010b.p046j.p057k.InterfaceC0564e
                    /* renamed from: a */
                    public final boolean mo933a(Object obj) {
                        CharSequence charSequence3 = (CharSequence) obj;
                        return AbstractC1077v0.m1273f(charSequence3, EnumC2091b.this) && AbstractC1077v0.m1274e(charSequence3, enumC2090a);
                    }
                };
            } else if (enumC2091b != null) {
                interfaceC0564e = new InterfaceC0564e() { // from class: c.b.z.b
                    @Override // p010b.p046j.p057k.InterfaceC0564e
                    /* renamed from: a */
                    public final boolean mo933a(Object obj) {
                        return AbstractC1077v0.m1273f((CharSequence) obj, EnumC2091b.this);
                    }
                };
            } else if (enumC2090a == null) {
                throw new IllegalArgumentException("can not have both skin-tone and gender set to null!");
            } else {
                interfaceC0564e = new InterfaceC0564e() { // from class: c.b.z.c
                    @Override // p010b.p046j.p057k.InterfaceC0564e
                    /* renamed from: a */
                    public final boolean mo933a(Object obj) {
                        return AbstractC1077v0.m1274e((CharSequence) obj, EnumC2090a.this);
                    }
                };
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    key = null;
                    break;
                }
                key = (Key) it.next();
                if (interfaceC0564e.mo933a(key.f5230m)) {
                    break;
                }
            }
            if (key != null) {
                mo832b.f5230m = key.f5230m;
                mo832b.f5219b = key.f5219b;
            }
        }
        return mo832b;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t, p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: g */
    public int mo831g() {
        return super.mo831g() + this.f5425P;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: l */
    public void mo830l(InterfaceC1677j0 interfaceC1677j0, C1656a c1656a, C1656a c1656a2) {
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: o */
    public String mo826o() {
        return null;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: p */
    public int mo825p() {
        return -1;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: q */
    public String mo818q() {
        return "keyboard_popup";
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: r */
    public CharSequence mo824r() {
        return this.f5421L;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: t */
    public char[] mo822t() {
        return f5420K;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: v */
    public boolean mo829v() {
        return true;
    }
}