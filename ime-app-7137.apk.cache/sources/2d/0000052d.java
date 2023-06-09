package p093c.p097b.p102d0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import p010b.p036g.C0378b;
import p010b.p036g.C0385i;
import p010b.p036g.C0387k;
import p010b.p046j.p057k.C0561b;
import p093c.p097b.p122u.AbstractC1467d0;
import p093c.p097b.p122u.AbstractC1533z;
import p093c.p097b.p122u.C1477i0;
import p093c.p097b.p122u.InterfaceC1479j0;
import p093c.p097b.p122u.InterfaceC1532y;
import p093c.p097b.p128x.C1619q2;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.d0.j */
/* loaded from: classes.dex */
public class C1193j implements InterfaceC1190g {

    /* renamed from: a */
    public static final InterfaceC1190g f4330a = new C1191h();

    /* renamed from: d */
    public final C1477i0 f4333d;

    /* renamed from: h */
    public final C1187d f4337h;

    /* renamed from: b */
    public final C0378b f4331b = new C0378b();

    /* renamed from: c */
    public final C1619q2 f4332c = new C1619q2();

    /* renamed from: e */
    public final C1192i f4334e = new C1192i(null);

    /* renamed from: f */
    public final Set f4335f = new TreeSet();

    /* renamed from: g */
    public final List f4336g = new ArrayList(64);

    public C1193j(Context context, List list, C1187d c1187d) {
        this.f4337h = c1187d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Key key : (List) it.next()) {
                for (String str : key.f5217I) {
                    String lowerCase = str.toLowerCase(Locale.US);
                    if (!this.f4331b.containsKey(lowerCase)) {
                        this.f4331b.put(lowerCase, new ArrayList());
                    }
                    ((List) this.f4331b.get(lowerCase)).add(key.f5230m);
                }
            }
        }
        C0378b c0378b = this.f4331b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((C0385i) c0378b.entrySet()).iterator();
        while (true) {
            C0387k c0387k = (C0387k) it2;
            if (c0387k.hasNext()) {
                c0387k.next();
                arrayList.add(new C0561b((String) c0387k.getKey(), Integer.valueOf(((List) c0387k.getValue()).size())));
            } else {
                C1477i0 c1477i0 = new C1477i0("quick_text_tags_dictionary", context, arrayList, true);
                this.f4333d = c1477i0;
                AbstractC1467d0.m1017a(c1477i0);
                return;
            }
        }
    }

    @Override // p093c.p097b.p102d0.InterfaceC1190g
    /* renamed from: a */
    public List mo1150a(CharSequence charSequence, InterfaceC1479j0 interfaceC1479j0) {
        C1619q2 c1619q2 = this.f4332c;
        c1619q2.getClass();
        c1619q2.f5051b = "🔍" + ((Object) charSequence);
        String lowerCase = charSequence.toString().toLowerCase(Locale.US);
        this.f4336g.clear();
        if (lowerCase.length() == 0) {
            for (C1186c c1186c : this.f4337h.m1157b()) {
                this.f4336g.add(0, c1186c.f4318b);
            }
        } else {
            this.f4335f.clear();
            C1192i c1192i = this.f4334e;
            c1192i.f4328b = interfaceC1479j0;
            c1192i.f4329c = charSequence;
            this.f4333d.mo499h(c1192i, new InterfaceC1532y() { // from class: c.b.d0.a
                @Override // p093c.p097b.p122u.InterfaceC1532y
                /* renamed from: a */
                public final boolean mo955a(char[] cArr, int i, int i2, int i3, AbstractC1533z abstractC1533z) {
                    C1193j c1193j = C1193j.this;
                    c1193j.f4335f.addAll((Collection) c1193j.f4331b.getOrDefault(new String(cArr, i, i2), null));
                    return true;
                }
            });
            this.f4336g.addAll(this.f4335f);
        }
        C1619q2 c1619q22 = this.f4332c;
        c1619q22.f5052c = this.f4336g;
        return c1619q22;
    }

    @Override // p093c.p097b.p102d0.InterfaceC1190g
    public boolean isEnabled() {
        return true;
    }
}