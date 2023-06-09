package p093c.p097b.p130z;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p010b.p036g.C0378b;
import p010b.p037h.p040b.AbstractC0403k;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.C1433k;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.z.o0 */
/* loaded from: classes.dex */
public class C1687o0 {

    /* renamed from: a */
    public static final AbstractC1762t[] f5184a = new AbstractC1762t[0];

    /* renamed from: b */
    public static final C1671g0[] f5185b = new C1671g0[0];

    /* renamed from: d */
    public boolean f5187d;

    /* renamed from: e */
    public boolean f5188e;

    /* renamed from: f */
    public boolean f5189f;

    /* renamed from: g */
    public boolean f5190g;

    /* renamed from: h */
    public final InterfaceC1685n0 f5191h;

    /* renamed from: i */
    public final Context f5192i;

    /* renamed from: k */
    public final InterfaceC1677j0 f5194k;

    /* renamed from: l */
    public final C1433k f5195l;

    /* renamed from: m */
    public InterfaceC1566d3 f5196m;

    /* renamed from: n */
    public int f5197n;

    /* renamed from: p */
    public AbstractC1762t[] f5199p;

    /* renamed from: q */
    public AbstractC1762t[] f5200q;

    /* renamed from: r */
    public C1671g0[] f5201r;

    /* renamed from: s */
    public boolean f5202s;

    /* renamed from: t */
    public int f5203t;

    /* renamed from: u */
    public boolean f5204u;

    /* renamed from: v */
    public EditorInfo f5205v;

    /* renamed from: w */
    public String f5206w;

    /* renamed from: x */
    public int f5207x;

    /* renamed from: y */
    public final int[] f5208y;

    /* renamed from: c */
    public final C2111b f5186c = new C2111b();

    /* renamed from: j */
    public final C0378b f5193j = new C0378b();

    /* renamed from: o */
    public int f5198o = 0;

    public C1687o0(InterfaceC1685n0 interfaceC1685n0, Context context) {
        AbstractC1762t[] abstractC1762tArr = f5184a;
        this.f5199p = abstractC1762tArr;
        this.f5200q = abstractC1762tArr;
        this.f5201r = f5185b;
        this.f5202s = false;
        this.f5203t = 0;
        this.f5204u = true;
        this.f5208y = new int[]{0, 1, 2, 3, 4, 5};
        this.f5195l = new C1433k(context, context);
        this.f5191h = interfaceC1685n0;
        this.f5192i = context;
        this.f5194k = new C1683m0(this, context.getResources());
        this.f5197n = 1;
        for (String str : (Set) ((C1785g) AnyApplication.m182t(context).m1169d(R.string.settings_key_persistent_layout_per_package_id_mapping)).m809b()) {
            String[] split = str.split("\\s+->\\s+", -1);
            if (split.length == 2) {
                this.f5193j.put(split[0], split[1]);
            }
        }
        C1151a0 m182t = AnyApplication.m182t(this.f5192i);
        C2111b c2111b = this.f5186c;
        AbstractC2094b abstractC2094b = ((C1785g) m182t.m1170c(R.string.settings_key_layout_for_internet_fields, R.string.settings_default_keyboard_id)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.z.i
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0 c1687o0 = C1687o0.this;
                c1687o0.f5206w = (String) obj;
                c1687o0.f5207x = c1687o0.m911c();
            }
        };
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7040e;
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e3 = AbstractC2146l.f7039d;
        c2111b.mo117c(abstractC2094b.m164N(interfaceC2123e, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_support_keyboard_type_state_row_type_2, R.bool.settings_default_true)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.f
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0.this.f5208y[2] = ((Boolean) obj).booleanValue() ? 2 : 1;
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_support_keyboard_type_state_row_type_3, R.bool.settings_default_true)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.m
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0.this.f5208y[3] = ((Boolean) obj).booleanValue() ? 3 : 1;
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_support_keyboard_type_state_row_type_4, R.bool.settings_default_true)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.j
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0.this.f5208y[4] = ((Boolean) obj).booleanValue() ? 4 : 1;
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_support_keyboard_type_state_row_type_5, R.bool.settings_default_true)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.e
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0.this.f5208y[5] = ((Boolean) obj).booleanValue() ? 5 : 1;
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_use_16_keys_symbols_keyboards, R.bool.settings_default_use_16_keys_symbols_keyboards)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.g
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0 c1687o0 = C1687o0.this;
                c1687o0.getClass();
                c1687o0.f5187d = ((Boolean) obj).booleanValue();
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_persistent_layout_per_package_id, R.bool.settings_default_persistent_layout_per_package_id)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.l
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0 c1687o0 = C1687o0.this;
                c1687o0.getClass();
                c1687o0.f5188e = ((Boolean) obj).booleanValue();
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_cycle_all_symbols, R.bool.settings_default_cycle_all_symbols)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.k
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0 c1687o0 = C1687o0.this;
                c1687o0.getClass();
                c1687o0.f5189f = ((Boolean) obj).booleanValue();
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
        this.f5186c.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_lang_key_shows_popup, R.bool.settings_default_lang_key_shows_popup)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.h
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1687o0 c1687o0 = C1687o0.this;
                c1687o0.getClass();
                c1687o0.f5190g = ((Boolean) obj).booleanValue();
            }
        }, interfaceC2123e2, interfaceC2119a, interfaceC2123e3));
    }

    /* renamed from: a */
    public C1766x m913a(AbstractC1427e abstractC1427e, Context context, int i, int i2, String str, String str2, int i3) {
        return new C1766x(abstractC1427e, context, i, i2, str, str2, i3);
    }

    /* renamed from: b */
    public final void m912b() {
        AbstractC1762t[] abstractC1762tArr = this.f5200q;
        if (abstractC1762tArr.length == 0 || this.f5199p.length == 0 || this.f5201r.length == 0) {
            if (abstractC1762tArr.length == 0 || this.f5201r.length == 0) {
                List<C1671g0> m1057g = AnyApplication.m191k(this.f5192i).m1057g();
                this.f5201r = (C1671g0[]) m1057g.toArray(new C1671g0[m1057g.size()]);
                this.f5207x = m911c();
                this.f5200q = new AbstractC1762t[this.f5201r.length];
                this.f5203t = 0;
                AnySoftKeyboardKeyboardSwitchedListener anySoftKeyboardKeyboardSwitchedListener = (AnySoftKeyboardKeyboardSwitchedListener) this.f5191h;
                anySoftKeyboardKeyboardSwitchedListener.getClass();
                C1450g c1450g = AnyApplication.f6979b;
                InputMethodManager inputMethodManager = anySoftKeyboardKeyboardSwitchedListener.f6309e;
                String mo179y = anySoftKeyboardKeyboardSwitchedListener.mo179y();
                c1450g.getClass();
                ArrayList arrayList = new ArrayList();
                for (C1671g0 c1671g0 : m1057g) {
                    String str = c1671g0.f4705a;
                    String str2 = c1671g0.f5159n;
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(c1450g.mo1026e(str2, c1671g0.f4705a));
                    }
                }
                inputMethodManager.setAdditionalInputMethodSubtypes(mo179y, (InputMethodSubtype[]) arrayList.toArray(new InputMethodSubtype[0]));
            }
            if (this.f5199p.length == 0) {
                AbstractC1762t[] abstractC1762tArr2 = new AbstractC1762t[6];
                this.f5199p = abstractC1762tArr2;
                if (this.f5198o >= abstractC1762tArr2.length) {
                    this.f5198o = 0;
                }
            }
        }
    }

    /* renamed from: c */
    public final int m911c() {
        int i = 0;
        while (true) {
            C1671g0[] c1671g0Arr = this.f5201r;
            if (i >= c1671g0Arr.length) {
                return -1;
            }
            if (TextUtils.equals(c1671g0Arr[i].f4705a, this.f5206w)) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: d */
    public void m910d() {
        AbstractC1762t[] abstractC1762tArr = f5184a;
        this.f5200q = abstractC1762tArr;
        this.f5199p = abstractC1762tArr;
        this.f5201r = f5185b;
        this.f5207x = -1;
        this.f5205v = null;
    }

    /* renamed from: e */
    public final AbstractC1762t m909e(int i, EditorInfo editorInfo) {
        m912b();
        AbstractC1762t[] abstractC1762tArr = this.f5200q;
        if (i >= abstractC1762tArr.length) {
            i = 0;
        }
        AbstractC1762t abstractC1762t = abstractC1762tArr[i];
        int m907g = m907g(editorInfo);
        if (abstractC1762t == null || abstractC1762t.f5150t != m907g) {
            abstractC1762t = this.f5201r[i].m922b(m907g);
            abstractC1762tArr[i] = abstractC1762t;
            if (abstractC1762t == null) {
                m910d();
                return m909e(0, editorInfo);
            }
            InterfaceC1566d3 interfaceC1566d3 = this.f5196m;
            abstractC1762t.mo837i(interfaceC1566d3 != null ? interfaceC1566d3.getThemedKeyboardDimens() : this.f5194k);
        }
        if (editorInfo != null && !TextUtils.isEmpty(editorInfo.packageName)) {
            this.f5193j.put(editorInfo.packageName, abstractC1762t.f5134d.f4705a);
        }
        return abstractC1762t;
    }

    /* renamed from: f */
    public final AbstractC1762t m908f() {
        return this.f5204u ? m909e(this.f5203t, this.f5205v) : m905i(this.f5198o);
    }

    /* renamed from: g */
    public final int m907g(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return 1;
        }
        int i = editorInfo.inputType & 4080;
        if (i != 16) {
            if (i != 32) {
                if (i == 48 || i == 64 || i == 80) {
                    return this.f5208y[2];
                }
                if (i != 128 && i != 144) {
                    if (i != 208) {
                        if (i != 224) {
                            return 1;
                        }
                    }
                }
                return this.f5208y[5];
            }
            return this.f5208y[4];
        }
        return this.f5208y[3];
    }

    /* renamed from: h */
    public final AbstractC1762t m906h(EditorInfo editorInfo) {
        if (this.f5202s) {
            AbstractC1762t m908f = m908f();
            StringBuilder m1187i = AbstractC1124a.m1187i("Request for keyboard but the keyboard-switcher is locked! Returning ");
            m1187i.append((Object) m908f.mo824r());
            m1187i.toString();
            this.f5192i.getResources();
            m908f.m833x();
            this.f5191h.mo430e(m908f);
            return m908f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1762t m905i(int i) {
        Context context;
        int i2;
        int i3;
        String str;
        C1433k c1433k;
        int i4;
        String str2;
        int i5;
        String str3;
        Context context2;
        int i6;
        C1433k c1433k2;
        Context context3;
        m912b();
        AbstractC1762t abstractC1762t = this.f5199p[i];
        if (abstractC1762t == null || abstractC1762t.f5150t != this.f5197n) {
            int i7 = R.xml.simple_alt_numbers;
            String str4 = "symbols_keyboard";
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c1433k2 = this.f5195l;
                            context3 = this.f5192i;
                            str2 = context3.getString(R.string.symbols_numbers_keyboard);
                            i4 = this.f5197n;
                            str3 = "numbers_symbols_keyboard";
                            i6 = R.xml.simple_numbers;
                            i5 = R.xml.simple_numbers;
                        } else if (i == 4) {
                            c1433k2 = this.f5195l;
                            context3 = this.f5192i;
                            str2 = context3.getString(R.string.symbols_phone_keyboard);
                            i4 = this.f5197n;
                            str3 = "phone_symbols_keyboard";
                            i6 = R.xml.simple_phone;
                            i5 = R.xml.simple_phone;
                        } else if (i != 5) {
                            throw new IllegalArgumentException(AbstractC1124a.m1193c("Unknown keyboardIndex ", i));
                        } else {
                            c1433k2 = this.f5195l;
                            context3 = this.f5192i;
                            str2 = context3.getString(R.string.symbols_time_keyboard);
                            i4 = this.f5197n;
                            str3 = "datetime_symbols_keyboard";
                            i6 = R.xml.simple_datetime;
                            i5 = R.xml.simple_datetime;
                        }
                        context2 = context3;
                        c1433k = c1433k2;
                        abstractC1762t = m913a(c1433k, context2, i6, i5, str2, str3, i4);
                        this.f5199p[i] = abstractC1762t;
                        this.f5198o = i;
                        InterfaceC1566d3 interfaceC1566d3 = this.f5196m;
                        abstractC1762t.mo837i(interfaceC1566d3 == null ? interfaceC1566d3.getThemedKeyboardDimens() : this.f5194k);
                        this.f5191h.mo430e(abstractC1762t);
                    } else {
                        c1433k = this.f5195l;
                        Context context4 = this.f5192i;
                        String string = context4.getString(R.string.symbols_alt_num_keyboard);
                        int i8 = this.f5197n;
                        i2 = R.xml.simple_alt_numbers;
                        context = context4;
                        str4 = "alt_numbers_symbols_keyboard";
                        i3 = i8;
                        str = string;
                    }
                } else if (this.f5187d) {
                    C1433k c1433k3 = this.f5195l;
                    context = this.f5192i;
                    String string2 = context.getString(R.string.symbols_alt_keyboard);
                    i3 = this.f5197n;
                    i2 = R.xml.symbols_alt;
                    str = string2;
                    str4 = "alt_symbols_keyboard";
                    c1433k = c1433k3;
                    i7 = R.xml.symbols_alt_16keys;
                } else {
                    C1433k c1433k4 = this.f5195l;
                    context = this.f5192i;
                    String string3 = context.getString(R.string.symbols_alt_keyboard);
                    int i9 = this.f5197n;
                    i2 = R.xml.symbols_alt;
                    i3 = i9;
                    str = string3;
                    str4 = "alt_symbols_keyboard";
                    c1433k = c1433k4;
                    i7 = R.xml.symbols_alt;
                }
            } else if (this.f5187d) {
                C1433k c1433k5 = this.f5195l;
                context = this.f5192i;
                String string4 = context.getString(R.string.symbols_keyboard);
                i3 = this.f5197n;
                i2 = R.xml.symbols;
                str = string4;
                c1433k = c1433k5;
                i7 = R.xml.symbols_16keys;
            } else {
                C1433k c1433k6 = this.f5195l;
                context = this.f5192i;
                String string5 = context.getString(R.string.symbols_keyboard);
                int i10 = this.f5197n;
                i2 = R.xml.symbols;
                i3 = i10;
                str = string5;
                c1433k = c1433k6;
                i7 = R.xml.symbols;
            }
            i4 = i3;
            str2 = str;
            i5 = i2;
            str3 = str4;
            context2 = context;
            i6 = i7;
            abstractC1762t = m913a(c1433k, context2, i6, i5, str2, str3, i4);
            this.f5199p[i] = abstractC1762t;
            this.f5198o = i;
            InterfaceC1566d3 interfaceC1566d32 = this.f5196m;
            abstractC1762t.mo837i(interfaceC1566d32 == null ? interfaceC1566d32.getThemedKeyboardDimens() : this.f5194k);
            this.f5191h.mo430e(abstractC1762t);
        }
        return abstractC1762t;
    }

    /* renamed from: j */
    public AbstractC1762t m904j(EditorInfo editorInfo, String str) {
        AbstractC1762t m906h = m906h(editorInfo);
        if (m906h != null) {
            return m906h;
        }
        m912b();
        List asList = Arrays.asList(this.f5201r);
        int size = asList.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(((C1671g0) asList.get(i)).f4705a, str)) {
                AbstractC1762t m909e = m909e(i, editorInfo);
                this.f5204u = true;
                this.f5203t = i;
                this.f5198o = 0;
                this.f5192i.getResources();
                m909e.m833x();
                this.f5191h.mo431d(m909e);
                return m909e;
            }
        }
        return null;
    }

    /* renamed from: k */
    public AbstractC1762t m903k(EditorInfo editorInfo, int i) {
        AbstractC1762t m906h = m906h(editorInfo);
        if (m906h != null) {
            return m906h;
        }
        m912b();
        int length = this.f5200q.length;
        switch (AbstractC0403k.m2567a(i)) {
            case 0:
                return m901m(editorInfo, 1);
            case 1:
            case 2:
                return m902l(editorInfo, i == 3, 1);
            case 3:
                if (this.f5204u) {
                    if (this.f5203t >= length - 1) {
                        this.f5203t = 0;
                        return m901m(editorInfo, 1);
                    }
                    return m902l(editorInfo, false, 1);
                } else if (this.f5198o >= 2) {
                    this.f5198o = 0;
                    return m902l(editorInfo, false, 1);
                } else {
                    return m901m(editorInfo, 1);
                }
            case 4:
                if (this.f5204u) {
                    if (this.f5203t <= 0) {
                        this.f5203t = 0;
                        return m901m(editorInfo, -1);
                    }
                    return m902l(editorInfo, false, -1);
                } else if (this.f5198o <= 0) {
                    this.f5198o = 0;
                    this.f5203t = length - 1;
                    return m902l(editorInfo, false, 1);
                } else {
                    return m901m(editorInfo, -1);
                }
            case 5:
                return this.f5204u ? m903k(editorInfo, 2) : m903k(editorInfo, 1);
            case 6:
                return this.f5204u ? m903k(editorInfo, 1) : m903k(editorInfo, 2);
            default:
                return m902l(editorInfo, false, 1);
        }
    }

    /* renamed from: l */
    public final AbstractC1762t m902l(EditorInfo editorInfo, boolean z, int i) {
        AbstractC1762t m906h = m906h(editorInfo);
        if (m906h == null) {
            m912b();
            int length = this.f5200q.length;
            if (this.f5204u) {
                this.f5203t += i;
            }
            this.f5204u = true;
            int i2 = this.f5203t;
            if (i2 >= length) {
                this.f5203t = 0;
            } else if (i2 < 0) {
                this.f5203t = length - 1;
            }
            AbstractC1762t m909e = m909e(this.f5203t, editorInfo);
            this.f5198o = 0;
            if (z) {
                int i3 = length;
                while (!(m909e instanceof InterfaceC1692r) && i3 > 0) {
                    int i4 = this.f5203t + i;
                    this.f5203t = i4;
                    if (i4 >= length) {
                        this.f5203t = 0;
                    } else if (i4 < 0) {
                        this.f5203t = length - 1;
                    }
                    m909e = m909e(this.f5203t, editorInfo);
                    i3--;
                }
                if (i3 == 0) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("Could not locate the next physical keyboard. Will continue with ");
                    m1187i.append((Object) m909e.mo824r());
                    m1187i.toString();
                }
            }
            this.f5192i.getResources();
            m909e.m833x();
            this.f5191h.mo431d(m909e);
            return m909e;
        }
        return m906h;
    }

    /* renamed from: m */
    public final AbstractC1762t m901m(EditorInfo editorInfo, int i) {
        AbstractC1762t m906h = m906h(editorInfo);
        if (m906h != null) {
            return m906h;
        }
        int m900n = m900n(i);
        this.f5198o = m900n;
        this.f5204u = false;
        AbstractC1762t m905i = m905i(m900n);
        this.f5192i.getResources();
        m905i.m833x();
        this.f5191h.mo430e(m905i);
        return m905i;
    }

    /* renamed from: n */
    public final int m900n(int i) {
        int i2 = this.f5198o;
        if (this.f5189f) {
            if (!this.f5204u) {
                int i3 = i2 + i;
                if (i3 <= 2) {
                    if (i3 < 0) {
                        return 2;
                    }
                    return i3;
                }
            } else if (i <= 0) {
                return 2;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m899o(int i, EditorInfo editorInfo, boolean z) {
        AbstractC1762t m905i;
        int i2;
        m912b();
        int i3 = editorInfo.inputType;
        EditorInfo editorInfo2 = this.f5205v;
        boolean z2 = false;
        boolean z3 = i3 != (editorInfo2 == null ? 0 : editorInfo2.inputType);
        this.f5205v = editorInfo;
        this.f5197n = m907g(editorInfo);
        if (i == 2) {
            this.f5204u = false;
            this.f5202s = true;
            m905i = m905i(0);
        } else if (i == 3) {
            this.f5204u = false;
            this.f5202s = true;
            m905i = m905i(4);
        } else if (i == 7) {
            this.f5204u = false;
            this.f5202s = true;
            m905i = m905i(5);
        } else if (i != 8) {
            this.f5202s = false;
            if (!z && (i2 = this.f5207x) >= 0 && (i == 4 || i == 5)) {
                this.f5203t = i2;
            } else if (this.f5188e && !TextUtils.isEmpty(editorInfo.packageName) && this.f5193j.containsKey(editorInfo.packageName)) {
                CharSequence charSequence = (CharSequence) this.f5193j.get(editorInfo.packageName);
                int i4 = 0;
                while (true) {
                    C1671g0[] c1671g0Arr = this.f5201r;
                    if (i4 >= c1671g0Arr.length) {
                        break;
                    }
                    if (TextUtils.equals(c1671g0Arr[i4].f4705a, charSequence)) {
                        this.f5203t = i4;
                    }
                    i4++;
                }
            }
            if (z && !z3) {
                m905i = m908f();
                this.f5192i.getResources();
                m905i.m833x();
                if (z2) {
                    return;
                }
                this.f5191h.mo431d(m905i);
                return;
            }
            this.f5204u = true;
            m905i = m909e(this.f5203t, editorInfo);
        } else {
            this.f5204u = false;
            this.f5202s = true;
            m905i = m905i(3);
        }
        z2 = true;
        this.f5192i.getResources();
        m905i.m833x();
        if (z2) {
        }
    }
}