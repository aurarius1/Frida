package p093c.p097b.p122u;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p093c.p097b.p098a0.InterfaceC1133h;
import p093c.p097b.p102d0.C1193j;
import p093c.p097b.p102d0.InterfaceC1190g;

/* renamed from: c.b.u.n0 */
/* loaded from: classes.dex */
public class C1487n0 implements InterfaceC1481k0 {

    /* renamed from: a */
    public final C1495r0 f4785a;

    /* renamed from: b */
    public final List f4786b;

    /* renamed from: c */
    public final List f4787c;

    /* renamed from: d */
    public final List f4788d;

    /* renamed from: e */
    public final List f4789e;

    /* renamed from: f */
    public final InterfaceC1532y f4790f;

    /* renamed from: g */
    public Locale f4791g;

    /* renamed from: h */
    public int f4792h;

    /* renamed from: i */
    public int f4793i;

    /* renamed from: j */
    public InterfaceC1190g f4794j;

    /* renamed from: k */
    public int[] f4795k;

    /* renamed from: l */
    public boolean f4796l;

    /* renamed from: m */
    public String f4797m;

    /* renamed from: n */
    public boolean f4798n;

    /* renamed from: o */
    public boolean f4799o;

    /* renamed from: p */
    public final C1485m0 f4800p;

    /* renamed from: q */
    public int f4801q;

    /* renamed from: r */
    public int f4802r;

    /* renamed from: s */
    public boolean f4803s;

    public C1487n0(Context context) {
        C1495r0 c1495r0 = new C1495r0(context);
        this.f4786b = new ArrayList();
        this.f4787c = new ArrayList();
        this.f4788d = new ArrayList();
        this.f4789e = new ArrayList();
        this.f4790f = new InterfaceC1532y() { // from class: c.b.u.l
            @Override // p093c.p097b.p122u.InterfaceC1532y
            /* renamed from: a */
            public final boolean mo955a(char[] cArr, int i, int i2, int i3, AbstractC1533z abstractC1533z) {
                C1487n0.this.f4789e.add(new String(cArr, i, i2));
                return true;
            }
        };
        this.f4791g = Locale.getDefault();
        this.f4792h = 2;
        this.f4793i = 12;
        this.f4794j = C1193j.f4330a;
        this.f4795k = new int[12];
        this.f4797m = "";
        this.f4800p = new C1485m0(this, null);
        this.f4801q = 1;
        this.f4802r = 1;
        this.f4785a = c1495r0;
        this.f4793i = 12;
        this.f4795k = new int[12];
        m1007a();
        while (this.f4788d.size() < this.f4793i) {
            this.f4788d.add(new StringBuilder(32));
        }
    }

    /* renamed from: a */
    public final void m1007a() {
        int i;
        int size = this.f4788d.size();
        int size2 = this.f4786b.size();
        while (true) {
            i = this.f4793i;
            if (size >= i || size2 <= 0) {
                break;
            }
            CharSequence charSequence = (CharSequence) this.f4786b.get(size2 - 1);
            if (charSequence instanceof StringBuilder) {
                this.f4788d.add(charSequence);
                size++;
            }
            size2--;
        }
        int i2 = i + 1;
        this.f4786b.clear();
    }

    /* renamed from: b */
    public List m1006b(CharSequence charSequence, boolean z) {
        if (charSequence.length() < this.f4792h) {
            return Collections.emptyList();
        }
        this.f4787c.clear();
        this.f4799o = z;
        if (this.f4785a.m1000d(charSequence)) {
            String charSequence2 = charSequence.toString();
            C1495r0 c1495r0 = this.f4785a;
            List list = this.f4787c;
            int i = this.f4793i;
            if (c1495r0.f4821m) {
                int i2 = i;
                loop0: for (InterfaceC1133h interfaceC1133h : c1495r0.f4817i) {
                    if (!c1495r0.f4829u) {
                        interfaceC1133h.mo985a(charSequence2);
                    }
                    for (String str : interfaceC1133h.mo984c(charSequence2, c1495r0.f4823o, c1495r0.f4824p)) {
                        list.add(str);
                        i2--;
                        if (i2 == 0) {
                            break loop0;
                        }
                    }
                }
                int size = i - list.size();
                if (size != 0) {
                    Iterator it = c1495r0.f4830v.mo984c(charSequence2, c1495r0.f4823o, c1495r0.f4824p).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            list.add((String) it.next());
                            size--;
                            if (size == 0) {
                                break;
                            }
                        } else if (c1495r0.f4822n) {
                            for (String str2 : c1495r0.f4812d) {
                                list.add(str2);
                                size--;
                                if (size == 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f4799o) {
                for (int i3 = 0; i3 < this.f4787c.size(); i3++) {
                    List list2 = this.f4787c;
                    list2.set(i3, ((CharSequence) list2.get(i3)).toString().toUpperCase(this.f4791g));
                }
            }
        }
        return this.f4787c;
    }

    /* renamed from: c */
    public boolean m1005c(CharSequence charSequence) {
        return this.f4785a.m1000d(charSequence);
    }

    /* renamed from: d */
    public void m1004d() {
        this.f4787c.clear();
        this.f4785a.m999e();
    }
}