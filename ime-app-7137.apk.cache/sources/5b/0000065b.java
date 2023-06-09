package p093c.p097b.p122u;

import android.content.Context;
import android.text.TextUtils;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p093c.p097b.p098a0.InterfaceC1133h;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p105f0.C1215b;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.u.r0 */
/* loaded from: classes.dex */
public class C1495r0 {

    /* renamed from: a */
    public static final AbstractC1473g0 f4809a = new C1489o0("NULL");

    /* renamed from: b */
    public static final InterfaceC1133h f4810b = new C1491p0();

    /* renamed from: c */
    public final Context f4811c;

    /* renamed from: f */
    public int f4814f;

    /* renamed from: j */
    public boolean f4818j;

    /* renamed from: k */
    public boolean f4819k;

    /* renamed from: m */
    public boolean f4821m;

    /* renamed from: n */
    public boolean f4822n;

    /* renamed from: o */
    public int f4823o;

    /* renamed from: p */
    public int f4824p;

    /* renamed from: q */
    public AbstractC1473g0 f4825q;

    /* renamed from: r */
    public boolean f4826r;

    /* renamed from: s */
    public boolean f4827s;

    /* renamed from: t */
    public AbstractC1533z f4828t;

    /* renamed from: u */
    public boolean f4829u;

    /* renamed from: v */
    public InterfaceC1133h f4830v;

    /* renamed from: w */
    public final InterfaceC1465c0 f4831w;

    /* renamed from: x */
    public final List f4832x;

    /* renamed from: y */
    public final C2111b f4833y;

    /* renamed from: d */
    public final List f4812d = new ArrayList();

    /* renamed from: e */
    public C2111b f4813e = new C2111b();

    /* renamed from: g */
    public final List f4815g = new ArrayList();

    /* renamed from: h */
    public final List f4816h = new ArrayList();

    /* renamed from: i */
    public final List f4817i = new ArrayList();

    /* renamed from: l */
    public final List f4820l = new ArrayList();

    public C1495r0(Context context) {
        AbstractC1473g0 abstractC1473g0 = f4809a;
        this.f4825q = abstractC1473g0;
        this.f4828t = abstractC1473g0;
        this.f4830v = f4810b;
        this.f4831w = new C1493q0(this);
        this.f4832x = new ArrayList();
        C2111b c2111b = new C2111b();
        this.f4833y = c2111b;
        Context applicationContext = context.getApplicationContext();
        this.f4811c = applicationContext;
        C1151a0 m182t = AnyApplication.m182t(applicationContext);
        AbstractC2094b abstractC2094b = ((C1785g) m182t.m1172a(R.string.settings_key_quick_fix, R.bool.settings_default_quick_fix)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.u.o
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1495r0 c1495r0 = C1495r0.this;
                c1495r0.f4814f = 0;
                c1495r0.f4818j = ((Boolean) obj).booleanValue();
            }
        };
        C1215b c1215b = new C1215b("settings_key_quick_fix");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        c2111b.mo117c(abstractC2094b.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_quick_fix_second_disabled, R.bool.settings_default_key_quick_fix_second_disabled)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.u.r
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1495r0 c1495r0 = C1495r0.this;
                c1495r0.f4814f = 0;
                c1495r0.f4819k = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_quick_fix_second_disable"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_use_contacts_dictionary, R.bool.settings_default_contacts_dictionary)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.u.m
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1495r0 c1495r0 = C1495r0.this;
                c1495r0.f4814f = 0;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c1495r0.f4826r = booleanValue;
                if (booleanValue) {
                    return;
                }
                c1495r0.f4828t.m954e();
                c1495r0.f4828t = C1495r0.f4809a;
            }
        }, new C1215b("settings_key_use_contacts_dictionary"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_use_user_dictionary, R.bool.settings_default_user_dictionary)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.u.n
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1495r0 c1495r0 = C1495r0.this;
                c1495r0.f4814f = 0;
                c1495r0.f4827s = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_use_user_dictionary"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_next_word_suggestion_aggressiveness, R.string.settings_default_next_word_suggestion_aggressiveness)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.u.p
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1495r0 c1495r0 = C1495r0.this;
                String str = (String) obj;
                c1495r0.getClass();
                str.hashCode();
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != 141129818) {
                    if (hashCode != 285616741) {
                        if (hashCode == 839356089 && str.equals("minimal_aggressiveness")) {
                            c = 2;
                        }
                    } else if (str.equals("medium_aggressiveness")) {
                        c = 1;
                    }
                } else if (str.equals("maximum_aggressiveness")) {
                    c = 0;
                }
                if (c == 0) {
                    c1495r0.f4823o = 8;
                    c1495r0.f4824p = 1;
                } else if (c != 1) {
                    c1495r0.f4823o = 3;
                    c1495r0.f4824p = 5;
                } else {
                    c1495r0.f4823o = 5;
                    c1495r0.f4824p = 3;
                }
            }
        }, new C1215b("settings_key_next_word_suggestion_aggressiveness"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_next_word_dictionary_type, R.string.settings_default_next_words_dictionary_type)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.u.q
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1495r0 c1495r0 = C1495r0.this;
                String str = (String) obj;
                c1495r0.getClass();
                str.hashCode();
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != -2097034193) {
                    if (hashCode != 109935) {
                        if (hashCode == 3655434 && str.equals("word")) {
                            c = 2;
                        }
                    } else if (str.equals("off")) {
                        c = 1;
                    }
                } else if (str.equals("words_punctuations")) {
                    c = 0;
                }
                if (c == 0) {
                    c1495r0.f4821m = true;
                    c1495r0.f4822n = true;
                    return;
                }
                if (c != 1) {
                    c1495r0.f4821m = true;
                } else {
                    c1495r0.f4821m = false;
                }
                c1495r0.f4822n = false;
            }
        }, new C1215b("settings_key_next_word_dictionary_type"), interfaceC2119a, interfaceC2123e2));
    }

    /* renamed from: a */
    public static void m1003a(List list, C1499t0 c1499t0, InterfaceC1532y interfaceC1532y) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC1533z) it.next()).mo499h(c1499t0, interfaceC1532y);
        }
    }

    /* renamed from: b */
    public static boolean m1002b(List list, CharSequence charSequence) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC1533z) it.next()).mo498j(charSequence)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m1001c() {
        this.f4814f = 0;
        this.f4815g.clear();
        this.f4832x.clear();
        this.f4816h.clear();
        this.f4820l.clear();
        this.f4817i.clear();
        this.f4812d.clear();
        m999e();
        this.f4830v = f4810b;
        AbstractC1473g0 abstractC1473g0 = f4809a;
        this.f4825q = abstractC1473g0;
        this.f4828t = abstractC1473g0;
        this.f4813e.mo35e();
        this.f4813e = new C2111b();
    }

    /* renamed from: d */
    public boolean m1000d(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return m1002b(this.f4815g, charSequence) || m1002b(this.f4816h, charSequence) || this.f4828t.mo498j(charSequence);
    }

    /* renamed from: e */
    public void m999e() {
        for (InterfaceC1133h interfaceC1133h : this.f4817i) {
            interfaceC1133h.mo983d();
        }
        this.f4830v.mo983d();
    }
}