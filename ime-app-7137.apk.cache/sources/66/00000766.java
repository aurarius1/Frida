package p093c.p097b.p130z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p097b.p129y.C1656a;
import p093c.p137d.p138a.p139a.C1785g;

/* renamed from: c.b.z.t */
/* loaded from: classes.dex */
public abstract class AbstractC1762t extends AbstractC1669f0 {

    /* renamed from: y */
    public static final int[] f5408y = new int[0];

    /* renamed from: A */
    public int f5409A;

    /* renamed from: B */
    public Key f5410B;

    /* renamed from: C */
    public Key f5411C;

    /* renamed from: D */
    public C1690q f5412D;

    /* renamed from: E */
    public boolean f5413E;

    /* renamed from: F */
    public boolean f5414F;

    /* renamed from: G */
    public boolean f5415G;

    /* renamed from: H */
    public int f5416H;

    /* renamed from: I */
    public int f5417I;

    /* renamed from: J */
    public C1675i0 f5418J;

    /* renamed from: z */
    public int f5419z;

    public AbstractC1762t(AbstractC1427e abstractC1427e, Context context, int i) {
        super(abstractC1427e, context, i, 1);
        this.f5419z = 0;
        this.f5409A = 0;
        this.f5413E = false;
        this.f5416H = 0;
        this.f5417I = 0;
    }

    public AbstractC1762t(AbstractC1427e abstractC1427e, Context context, int i, int i2) {
        super(abstractC1427e, context, i, i2);
        this.f5419z = 0;
        this.f5409A = 0;
        this.f5413E = false;
        this.f5416H = 0;
        this.f5417I = 0;
    }

    @Override // p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: b */
    public Key mo832b(InterfaceC1423a interfaceC1423a, Context context, Context context2, C1667e0 c1667e0, InterfaceC1677j0 interfaceC1677j0, int i, int i2, XmlResourceParser xmlResourceParser) {
        Key key = new Key(interfaceC1423a, context2, c1667e0, interfaceC1677j0, i, i2, xmlResourceParser);
        int[] iArr = key.f5218a;
        C1690q c1690q = key;
        if (iArr.length > 0) {
            int i3 = iArr[0];
            if (i3 == -11) {
                this.f5411C = key;
                c1690q = key;
            } else if (i3 != 10) {
                c1690q = key;
                if (i3 == -1) {
                    this.f5410B = key;
                    c1690q = key;
                } else if (i3 == 0) {
                    key.mo892a();
                    c1690q = key;
                }
            } else {
                C1690q c1690q2 = new C1690q(interfaceC1423a, context2, c1667e0, interfaceC1677j0, i, i2, xmlResourceParser);
                this.f5412D = c1690q2;
                c1690q = c1690q2;
            }
        }
        mo820y(c1690q);
        return c1690q;
    }

    @Override // p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: c */
    public C1667e0 mo840c(InterfaceC1423a interfaceC1423a, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        C1667e0 mo840c = super.mo840c(interfaceC1423a, resources, xmlResourceParser, i);
        if (mo840c != null) {
            int i2 = mo840c.f5127e;
            if ((i2 & 4) != 0) {
                this.f5414F = true;
            }
            if ((i2 & 8) != 0) {
                this.f5415G = true;
            }
        }
        return mo840c;
    }

    @Override // p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: e */
    public int mo839e() {
        return this.f5145o + this.f5416H;
    }

    @Override // p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: g */
    public int mo831g() {
        return Math.max(this.f5417I, this.f5146p);
    }

    @Override // p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: h */
    public boolean mo838h() {
        return mo829v() && this.f5419z != 0;
    }

    @Override // p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: i */
    public void mo837i(InterfaceC1677j0 interfaceC1677j0) {
        m834w(interfaceC1677j0, (C1656a) AnyApplication.m188n(this.f5135e).m1058f(), (C1656a) AnyApplication.m193i(this.f5135e).m1058f());
    }

    /* renamed from: l */
    public void mo830l(InterfaceC1677j0 interfaceC1677j0, C1656a c1656a, C1656a c1656a2) {
        boolean z = !AbstractC1077v0.m1265n(this.f5135e, R.string.settings_key_allow_layouts_to_provide_generic_rows, R.bool.settings_default_allow_layouts_to_provide_generic_rows);
        this.f5416H = 0;
        if (!this.f5414F || z) {
            String str = c1656a.f4705a;
            m835n(m836m(c1656a.f4712h, c1656a.m1062a(), c1656a.f5096k, interfaceC1677j0, this.f5150t, true), true);
        }
        if (!this.f5415G || z) {
            String str2 = c1656a2.f4705a;
            C1761s m836m = m836m(c1656a2.f4712h, c1656a2.m1062a(), c1656a2.f5096k, interfaceC1677j0, this.f5150t, false);
            if (m836m.f5405c == 0) {
                m836m = m836m(c1656a2.f4712h, c1656a2.m1062a(), c1656a2.f5096k, interfaceC1677j0, 1, false);
            }
            m835n(m836m, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
        r7 = r24;
        r4 = r7.f5126d;
        r5 = (int) ((r0 + r14) + r4);
        r8 = r23 + r5;
        r15.f5406d += r5;
        r15.f5403a = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1761s m836m(InterfaceC1423a interfaceC1423a, Context context, int i, InterfaceC1677j0 interfaceC1677j0, int i2, boolean z) {
        C1761s c1761s;
        String str;
        float f;
        float f2;
        Resources resources;
        String str2 = "Row";
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            List list = this.f5147q;
            float mo866a = interfaceC1677j0.mo866a();
            float mo864c = interfaceC1677j0.mo864c();
            float mo839e = z ? mo864c : mo839e();
            Resources resources2 = context.getResources();
            Key key = null;
            C1761s c1761s2 = new C1761s(null);
            float f3 = mo839e;
            C1667e0 c1667e0 = null;
            boolean z2 = false;
            float f4 = 0.0f;
            float f5 = 0.0f;
            loop0: while (true) {
                boolean z3 = false;
                while (true) {
                    try {
                        int next = xml.next();
                        if (next == 1) {
                            break loop0;
                        }
                        float f6 = f5;
                        if (next == 2) {
                            String name = xml.getName();
                            if (str2.equals(name)) {
                                C1667e0 mo840c = mo840c(interfaceC1423a, resources2, xml, i2);
                                if (mo840c == null) {
                                    while (true) {
                                        int next2 = xml.next();
                                        if (next2 == 1 || (next2 == 3 && xml.getName().equals(str2))) {
                                            break;
                                        }
                                    }
                                    str = str2;
                                    c1667e0 = mo840c;
                                    f = f3;
                                    resources = resources2;
                                    f4 = 0.0f;
                                    f5 = 0.0f;
                                    z3 = false;
                                } else {
                                    c1761s2.f5405c++;
                                    str = str2;
                                    c1667e0 = mo840c;
                                    f = f3;
                                    resources = resources2;
                                    f4 = 0.0f;
                                    f5 = 0.0f;
                                    z3 = true;
                                }
                                c1761s = c1761s2;
                            } else {
                                str = str2;
                                if ("Key".equals(name)) {
                                    float f7 = (mo866a / 2.0f) + f4;
                                    resources = resources2;
                                    C1667e0 c1667e02 = c1667e0;
                                    f = f3;
                                    c1761s = c1761s2;
                                    try {
                                        Key mo832b = mo832b(interfaceC1423a, this.f5135e, context, c1667e0, interfaceC1677j0, (int) f7, (int) f3, xml);
                                        mo832b.width = (int) (mo832b.width - mo866a);
                                        if (z) {
                                            list.add(c1761s.f5404b, mo832b);
                                        } else {
                                            list.add(mo832b);
                                        }
                                        c1761s.f5404b++;
                                        f4 = f7;
                                        f5 = Math.max(mo832b.height, f6);
                                        key = mo832b;
                                        c1667e0 = c1667e02;
                                        z2 = true;
                                    } catch (IOException e) {
                                        e = e;
                                        e.getMessage();
                                        if (xml != null) {
                                        }
                                        return c1761s;
                                    } catch (XmlPullParserException e2) {
                                        e = e2;
                                        e.getMessage();
                                        if (xml != null) {
                                        }
                                        return c1761s;
                                    }
                                } else {
                                    f = f3;
                                    f2 = f6;
                                    resources = resources2;
                                    c1761s = c1761s2;
                                }
                            }
                            c1761s2 = c1761s;
                            resources2 = resources;
                            str2 = str;
                            f3 = f;
                        } else {
                            str = str2;
                            C1667e0 c1667e03 = c1667e0;
                            f = f3;
                            f2 = f6;
                            resources = resources2;
                            c1761s = c1761s2;
                            if (next == 3) {
                                if (!z2) {
                                    if (z3) {
                                        break;
                                    }
                                } else {
                                    f4 = f4 + key.f5224g + key.width + (mo866a / 2.0f);
                                    if (f4 > c1761s.f5407e) {
                                        int i3 = (int) f4;
                                        c1761s.f5407e = i3;
                                        this.f5417I = Math.max(this.f5417I, i3);
                                    }
                                    f5 = f2;
                                    c1761s2 = c1761s;
                                    resources2 = resources;
                                    str2 = str;
                                    f3 = f;
                                    c1667e0 = c1667e03;
                                    z2 = false;
                                }
                            }
                            c1667e0 = c1667e03;
                        }
                        f5 = f2;
                        c1761s2 = c1761s;
                        resources2 = resources;
                        str2 = str;
                        f3 = f;
                    } catch (IOException e3) {
                        e = e3;
                        c1761s = c1761s2;
                    } catch (XmlPullParserException e4) {
                        e = e4;
                        c1761s = c1761s2;
                    }
                }
                if (xml != null) {
                    xml.close();
                }
                return c1761s;
                f5 = f2;
                c1761s2 = c1761s;
                resources2 = resources;
                str2 = str;
            }
            c1761s = c1761s2;
            if (xml != null) {
            }
            return c1761s;
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* renamed from: n */
    public final void m835n(C1761s c1761s, boolean z) {
        this.f5416H += c1761s.f5406d;
        if (z) {
            List list = this.f5147q;
            for (int i = c1761s.f5404b; i < list.size(); i++) {
                Key key = (Key) list.get(i);
                int i2 = key.y + c1761s.f5406d;
                key.y = i2;
                key.centerY = (key.height / 2) + i2;
            }
            return;
        }
        List list2 = this.f5147q;
        for (int size = list2.size() - c1761s.f5404b; size < list2.size(); size++) {
            Key key2 = (Key) list2.get(size);
            int i3 = key2.y + c1761s.f5403a;
            key2.y = i3;
            key2.centerY = (key2.height / 2) + i3;
        }
    }

    /* renamed from: o */
    public abstract String mo826o();

    /* renamed from: p */
    public abstract int mo825p();

    /* renamed from: q */
    public abstract String mo818q();

    /* renamed from: r */
    public abstract CharSequence mo824r();

    /* renamed from: s */
    public Locale mo823s() {
        return Locale.ROOT;
    }

    /* renamed from: t */
    public abstract char[] mo822t();

    /* renamed from: u */
    public boolean mo821u(int i) {
        return Character.isLetter(i) || i == 39 || i == 8217 || Character.getType(i) == 6 || Character.getType(i) == 8;
    }

    /* renamed from: v */
    public boolean mo829v() {
        return this.f5410B != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0164  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m834w(InterfaceC1677j0 interfaceC1677j0, C1656a c1656a, C1656a c1656a2) {
        List list;
        int i;
        byte directionality;
        int i2;
        super.mo837i(interfaceC1677j0);
        mo830l(interfaceC1677j0, c1656a, c1656a2);
        Context context = this.f5135e;
        ArrayList arrayList = new ArrayList();
        List list2 = this.f5147q;
        int i3 = 0;
        while (true) {
            if (i3 >= list2.size()) {
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < arrayList.size()) {
                        int intValue = ((Integer) arrayList.get(i4)).intValue() - i5;
                        List list3 = this.f5147q;
                        Key key = (Key) list3.get(intValue);
                        if (key.f5212D != 0) {
                            i5++;
                            int i6 = key.y;
                            int i7 = intValue;
                            while (i7 > 0) {
                                int i8 = i7 - 1;
                                if (((Key) list3.get(i8)).y != i6) {
                                    i = intValue + 1;
                                    while (i < list3.size() && ((Key) list3.get(i)).y == i6) {
                                        i++;
                                    }
                                    float mo866a = interfaceC1677j0.mo866a() + key.width;
                                    float f = mo866a / ((i - i7) - r9);
                                    float f2 = 0.0f;
                                    while (i7 < i) {
                                        Key key2 = (Key) list3.get(i7);
                                        key2.width = (int) (key2.width + f);
                                        key2.x = (int) (key2.x + f2);
                                        f2 = i7 == intValue ? f2 - mo866a : f2 + f;
                                        i7++;
                                    }
                                    list3.remove(intValue);
                                } else {
                                    i7 = i8;
                                }
                            }
                            i = intValue + 1;
                            while (i < list3.size()) {
                                i++;
                            }
                            float mo866a2 = interfaceC1677j0.mo866a() + key.width;
                            float f3 = mo866a2 / ((i - i7) - r9);
                            float f22 = 0.0f;
                            while (i7 < i) {
                            }
                            list3.remove(intValue);
                        }
                        i4++;
                        r9 = 1;
                    }
                }
                this.f5418J = new C1675i0(context, this);
                int i9 = ((Key) this.f5147q.get(0)).y;
                int i10 = ((Key) this.f5147q.get(list.size() - 1)).y;
                Key key3 = null;
                for (Key key4 : this.f5147q) {
                    key4.f5235r = 0;
                    int i11 = key4.y;
                    if (i11 == i9) {
                        key4.f5235r = 4;
                    }
                    if (i11 == i10) {
                        key4.f5235r |= 8;
                    }
                    if (key3 == null || key3.y != i11) {
                        key4.f5235r |= 1;
                        if (key3 != null) {
                            key3.f5235r |= 2;
                            key3 = key4;
                        }
                    }
                    key3 = key4;
                }
                if (key3 != null) {
                    key3.f5235r |= 2;
                    return;
                }
                return;
            }
            Key key5 = (Key) list2.get(i3);
            if (key5.f5218a.length > 0) {
                int primaryCode = key5.getPrimaryCode();
                if (primaryCode != -99 && primaryCode != -6 && primaryCode != -5 && primaryCode != -3 && primaryCode != -2 && primaryCode != -1) {
                    switch (primaryCode) {
                        default:
                            switch (primaryCode) {
                            }
                        case -97:
                        case -96:
                        case -95:
                        case -94:
                            key5.f5215G = true;
                            break;
                    }
                    directionality = Character.getDirectionality((char) primaryCode);
                    if (directionality != 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                        this.f5413E = true;
                    }
                    if (primaryCode != -99) {
                        if (!AbstractC1077v0.m1265n(context, R.string.settings_key_always_hide_language_key, R.bool.settings_default_always_hide_language_key)) {
                            if ((AnyApplication.m191k(this.f5135e).m1056h().size() <= 1 ? 0 : 1) != 0) {
                            }
                        }
                        arrayList.add(Integer.valueOf(i3));
                    } else if (primaryCode != -10) {
                        if (primaryCode != -9) {
                            if ((!key5.f5241x && key5.getPrimaryCode() > 0) && key5.f5220c == null && TextUtils.isEmpty(key5.f5219b) && (i2 = key5.f5218a[0]) > 31 && !Character.isWhitespace(i2)) {
                                key5.f5219b = new String(new int[]{i2}, 0, 1);
                            }
                        } else {
                            String trim = ((String) ((C1785g) AnyApplication.m182t(context).m1170c(R.string.settings_key_default_domain_text, R.string.settings_default_default_domain_text)).m809b()).trim();
                            key5.f5219b = trim;
                            key5.f5230m = trim;
                            key5.f5239v = R.xml.popup_domains;
                        }
                    } else if (key5.f5211C == 0 && key5.f5239v == 0 && TextUtils.isEmpty(key5.f5234q)) {
                        key5.f5211C = -102;
                    }
                }
                key5.f5215G = true;
                directionality = Character.getDirectionality((char) primaryCode);
                if (directionality != 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                }
                if (primaryCode != -99) {
                }
            }
            i3++;
        }
    }

    /* renamed from: x */
    public void m833x() {
        C1690q c1690q = this.f5412D;
        if (c1690q == null) {
            return;
        }
        c1690q.height = c1690q.f5245J;
        c1690q.f5216H = true;
    }

    /* renamed from: y */
    public boolean mo820y(Key key) {
        if (key.f5239v > 0) {
            return true;
        }
        CharSequence charSequence = key.f5234q;
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                key.f5239v = R.xml.popup_one_row;
            }
            return true;
        }
        return false;
    }
}