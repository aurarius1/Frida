package p093c.p097b.p130z;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.KeyEvent;
import com.anysoftkeyboard.ime.AnySoftKeyboardBase;
import com.menny.android.anysoftkeyboard.R;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p129y.C1656a;
import p093c.p097b.p130z.p131q0.C1691a;

/* renamed from: c.b.z.w */
/* loaded from: classes.dex */
public class C1765w extends AbstractC1762t implements InterfaceC1692r {

    /* renamed from: K */
    public final CharSequence f5431K;

    /* renamed from: L */
    public final int f5432L;

    /* renamed from: M */
    public final String f5433M;

    /* renamed from: N */
    public final Locale f5434N;

    /* renamed from: O */
    public final C1767y f5435O;

    /* renamed from: P */
    public final Set f5436P;

    /* renamed from: Q */
    public final char[] f5437Q;

    /* renamed from: R */
    public final C1656a f5438R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cb, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("attribute characters should contain more than one character when used in MultiTap tag!", r6, new java.text.ParseException("characters", r6.getLineNumber()));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [c.b.z.d0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1765w(AbstractC1427e abstractC1427e, Context context, int i, int i2, CharSequence charSequence, int i3, int i4, String str, String str2, String str3, int i5, C1656a c1656a) {
        super(abstractC1427e, context, context.getResources().getConfiguration().orientation == 1 ? i : i2, i5);
        boolean z;
        int charAt;
        int i6 = 1;
        boolean z2 = false;
        this.f5431K = charSequence;
        this.f5432L = i3;
        this.f5433M = str;
        this.f5434N = AbstractC1077v0.m1259t(str);
        this.f5438R = c1656a;
        String str4 = null;
        if (i4 != 0) {
            Context m1062a = abstractC1427e.m1062a();
            C1767y c1767y = new C1767y();
            XmlResourceParser xml = m1062a.getResources().getXml(i4);
            boolean z3 = false;
            while (true) {
                try {
                    try {
                        int next = xml.next();
                        if (next == i6) {
                            break;
                        }
                        String name = xml.getName();
                        if (next != 2) {
                            z = z3;
                            if (next == 3 && "PhysicalTranslation".equals(name)) {
                                break;
                            }
                        } else if ("PhysicalTranslation".equals(name)) {
                            String attributeValue = Xml.asAttributeSet(xml).getAttributeValue(str4, "QwertyTranslation");
                            if (attributeValue != null) {
                                c1767y.m816b(attributeValue);
                            }
                            z3 = true;
                            str4 = null;
                            i6 = 1;
                            z2 = false;
                        } else {
                            if (z3 && "SequenceMapping".equals(name)) {
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                int[] m819z = m819z(asAttributeSet.getAttributeValue(str4, "keySequence"));
                                boolean attributeBooleanValue = asAttributeSet.getAttributeBooleanValue(str4, "altModifier", z2);
                                boolean attributeBooleanValue2 = asAttributeSet.getAttributeBooleanValue(str4, "shiftModifier", z2);
                                String attributeValue2 = asAttributeSet.getAttributeValue(str4, "targetChar");
                                String attributeValue3 = asAttributeSet.getAttributeValue(str4, "targetCharCode");
                                if (!TextUtils.isEmpty(attributeValue3)) {
                                    charAt = Integer.parseInt(attributeValue3);
                                } else if (TextUtils.isEmpty(attributeValue2)) {
                                    throw new IllegalArgumentException("both targetCharCode and targetCharfor key-codes " + Arrays.toString(m819z) + " are empty in SequenceMapping for keyboard " + mo818q());
                                } else {
                                    charAt = attributeValue2.charAt(z2 ? 1 : 0);
                                }
                                if (m819z.length != 0) {
                                    if (!attributeBooleanValue && !attributeBooleanValue2) {
                                        c1767y.f5442c.m928b(m819z, z2 ? 1 : 0, charAt);
                                        c1767y.f5442c.m928b(m819z, -1, Character.toUpperCase(charAt));
                                    } else if (attributeBooleanValue) {
                                        c1767y.f5442c.m928b(m819z, -6, charAt);
                                    } else {
                                        c1767y.f5442c.m928b(m819z, -1, charAt);
                                    }
                                }
                            } else if (z3 && "MultiTap".equals(name)) {
                                AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                                int[] m819z2 = m819z(asAttributeSet2.getAttributeValue(str4, "key"));
                                if (m819z2.length != 1) {
                                    throw new XmlPullParserException("attribute key should contain exactly one key-code when used in MultiTap tag!", xml, new ParseException("key", xml.getLineNumber()));
                                }
                                boolean attributeBooleanValue3 = asAttributeSet2.getAttributeBooleanValue(str4, "altModifier", z2);
                                boolean attributeBooleanValue4 = asAttributeSet2.getAttributeBooleanValue(str4, "shiftModifier", z2);
                                String attributeValue4 = asAttributeSet2.getAttributeValue(str4, "characters");
                                if (TextUtils.isEmpty(attributeValue4) || attributeValue4.length() < 2) {
                                    break;
                                }
                                int i7 = 0;
                                ?? r5 = z2;
                                while (i7 <= attributeValue4.length()) {
                                    int i8 = i7 + 1;
                                    int[] iArr = new int[i8];
                                    boolean z4 = z3;
                                    Arrays.fill(iArr, m819z2[r5]);
                                    if (i7 < attributeValue4.length()) {
                                        char charAt2 = attributeValue4.charAt(i7);
                                        if (!attributeBooleanValue3 && !attributeBooleanValue4) {
                                            c1767y.f5442c.m928b(iArr, r5, charAt2);
                                            c1767y.f5442c.m928b(iArr, -1, Character.toUpperCase((int) charAt2));
                                        } else if (attributeBooleanValue3) {
                                            c1767y.f5442c.m928b(m819z2, -6, charAt2);
                                        } else {
                                            c1767y.f5442c.m928b(m819z2, -1, charAt2);
                                        }
                                    } else if (!attributeBooleanValue3 && !attributeBooleanValue4) {
                                        c1767y.f5442c.m928b(iArr, 0, -4097);
                                        c1767y.f5442c.m928b(iArr, -1, -4097);
                                    } else if (attributeBooleanValue3) {
                                        c1767y.f5442c.m928b(m819z2, -6, -4097);
                                        z3 = z4;
                                        i7 = i8;
                                        r5 = 0;
                                    } else {
                                        c1767y.f5442c.m928b(m819z2, -1, -4097);
                                        z3 = z4;
                                        i7 = i8;
                                        r5 = 0;
                                    }
                                    z3 = z4;
                                    i7 = i8;
                                    r5 = 0;
                                }
                            }
                            z = z3;
                        }
                        z3 = z;
                        str4 = null;
                        i6 = 1;
                        z2 = false;
                    } catch (IOException unused) {
                    } catch (XmlPullParserException unused2) {
                        mo818q();
                        String str5 = this.f5134d.f4708d;
                    }
                } catch (Throwable th) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th;
                }
            }
            if (xml != null) {
                xml.close();
            }
            this.f5435O = c1767y;
        } else {
            this.f5435O = null;
        }
        if (str2 != null) {
            this.f5436P = new HashSet(str2.codePointCount(0, str2.length()));
            int i9 = 0;
            while (i9 < str2.length()) {
                int codePointAt = str2.codePointAt(i9);
                i9 += Character.charCount(codePointAt);
                this.f5436P.add(Integer.valueOf(codePointAt));
            }
        } else {
            this.f5436P = Collections.emptySet();
        }
        if (str3 != null) {
            this.f5437Q = str3.toCharArray();
        } else {
            this.f5437Q = new char[0];
        }
    }

    /* renamed from: A */
    public void m827A(C1691a c1691a, AnySoftKeyboardBase anySoftKeyboardBase, int i) {
        if (this.f5435O != null) {
            int i2 = 0;
            if ((MetaKeyKeyListener.getMetaState(c1691a.f5248c) & 514) != 0) {
                if (1 == this.f5435O.m817a(-6, i)) {
                    return;
                }
            }
            if ((MetaKeyKeyListener.getMetaState(c1691a.f5248c) & 257) != 0) {
                if (1 == this.f5435O.m817a(-1, i)) {
                    return;
                }
            }
            C1767y c1767y = this.f5435O;
            int m817a = c1767y.m817a(c1691a.f5246a, i);
            if (m817a == 5 || m817a == 4) {
                C1665d0 c1665d0 = c1767y.f5442c;
                i2 = c1665d0.f5121f;
                int i3 = c1665d0.f5120e - 1;
                if (i3 > 0) {
                    anySoftKeyboardBase.mo492u(i3);
                }
            }
            if (i2 != 0) {
                c1691a.f5247b = true;
                c1691a.f5246a = i2;
            }
        }
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: o */
    public String mo826o() {
        return this.f5433M;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: p */
    public int mo825p() {
        return this.f5432L;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: q */
    public String mo818q() {
        return this.f5134d.f4705a;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: r */
    public CharSequence mo824r() {
        return this.f5431K;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: s */
    public Locale mo823s() {
        return this.f5434N;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: t */
    public char[] mo822t() {
        return this.f5437Q;
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: u */
    public boolean mo821u(int i) {
        return super.mo821u(i) || this.f5436P.contains(Integer.valueOf(i));
    }

    @Override // p093c.p097b.p130z.AbstractC1762t
    /* renamed from: y */
    public boolean mo820y(Key key) {
        String str;
        if (super.mo820y(key)) {
            return true;
        }
        if (key.f5218a.length > 0) {
            switch (key.getPrimaryCode()) {
                case 97:
                    str = "àáâãāäåæąăα";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 98:
                    str = "β";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 99:
                    str = "çćĉčψ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 100:
                    str = "đďδ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 101:
                    str = "èéêëę€ėεē";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 102:
                    str = "φ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 103:
                    str = "ĝğγ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 104:
                    str = "ĥη";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 105:
                    str = "ìíîïłīįι";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 106:
                    str = "ĵξ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 107:
                    str = "κ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 108:
                    str = "ľĺłλ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 109:
                    str = "μ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 110:
                    str = "ñńν";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 111:
                    str = "òóôǒōõöőøœo";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 112:
                    str = "π";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 113:
                default:
                    super.mo820y(key);
                    break;
                case 114:
                    str = "ρ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 115:
                    str = "§ßśŝšșσ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 116:
                    str = "τ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 117:
                    str = "ùúûüŭűūųθ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 118:
                    str = "ω";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 119:
                    str = "ς";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 120:
                    str = "χ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 121:
                    str = "ýÿυ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
                case 122:
                    str = "żžźζ";
                    key.f5234q = str;
                    key.f5239v = R.xml.popup_one_row;
                    break;
            }
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final int[] m819z(String str) {
        String[] split = str.split(",", -1);
        int length = split.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            try {
                iArr[i] = Integer.parseInt(split[i]);
            } catch (NumberFormatException unused) {
                try {
                    iArr[i] = KeyEvent.class.getField(split[i]).getInt(null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return iArr;
    }
}