package p093c.p097b.p122u.p125w0;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p093c.p097b.p122u.AbstractC1533z;
import p093c.p097b.p122u.C1499t0;
import p093c.p097b.p122u.InterfaceC1479j0;
import p093c.p097b.p122u.InterfaceC1532y;

/* renamed from: c.b.u.w0.j */
/* loaded from: classes.dex */
public class C1525j extends AbstractC1528m {

    /* renamed from: q */
    public final Map f4886q;

    public C1525j(Context context, String str) {
        super("AbbreviationsDictionary", context, str);
        this.f4886q = new HashMap();
    }

    @Override // p093c.p097b.p122u.p125w0.AbstractC1528m
    /* renamed from: D */
    public C1529n mo977D(String str) {
        return new C1529n(this.f4897g, "abbreviations.db", str);
    }

    /* renamed from: E */
    public final void m978E(InterfaceC1532y interfaceC1532y, String str) {
        List<String> list = (List) this.f4886q.get(str);
        if (list != null) {
            for (String str2 : list) {
                interfaceC1532y.mo955a(str2.toCharArray(), 0, str2.length(), 255, this);
            }
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1531x, p093c.p097b.p122u.AbstractC1533z
    /* renamed from: h */
    public void mo499h(InterfaceC1479j0 interfaceC1479j0, InterfaceC1532y interfaceC1532y) {
        if (m953i() || this.f4906b) {
            return;
        }
        String charSequence = interfaceC1479j0.mo995c().toString();
        m978E(interfaceC1532y, charSequence);
        if (((C1499t0) interfaceC1479j0).f4852j) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC1533z.m951m(charSequence.charAt(0)));
            sb.append(charSequence.length() > 1 ? charSequence.substring(1) : "");
            m978E(interfaceC1532y, sb.toString());
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: p */
    public void mo966p(String str, int i) {
        String substring = str.substring(0, i);
        String substring2 = str.substring(i);
        if (this.f4886q.containsKey(substring)) {
            ((List) this.f4886q.get(substring)).add(substring2);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(substring2);
        this.f4886q.put(substring, arrayList);
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: x */
    public int mo958x() {
        return 2048;
    }
}