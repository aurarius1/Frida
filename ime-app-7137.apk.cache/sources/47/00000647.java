package p093c.p097b.p122u;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.menny.android.anysoftkeyboard.AnyApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p010b.p036g.C0378b;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1432j;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p130z.AbstractC1762t;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p189o.InterfaceC2128j;

/* renamed from: c.b.u.h0 */
/* loaded from: classes.dex */
public class C1475h0 extends AbstractC1432j {

    /* renamed from: o */
    public final Map f4776o;

    public C1475h0(Context context) {
        super(context, "ASKExtDictFactory", "com.menny.android.anysoftkeyboard.DICTIONARY", "com.menny.android.anysoftkeyboard.dictionaries", "Dictionaries", "Dictionary", "dictionary_", 0, 0, true, false);
        this.f4776o = new C0378b();
    }

    /* renamed from: t */
    public static String m1010t(AbstractC1762t abstractC1762t) {
        return String.format(Locale.US, "%s%s%s", "keyboard_", abstractC1762t.mo818q(), "_override_dictionary");
    }

    /* renamed from: u */
    public static Iterable m1009u(Context context) {
        C1450g c1450g = AnyApplication.f6979b;
        return AbstractC2094b.m174D(((AnyApplication) context.getApplicationContext()).f6983f.m1059e()).m140y(new InterfaceC2128j() { // from class: c.b.u.j
            @Override // p183e.p184a.p189o.InterfaceC2128j
            /* renamed from: a */
            public final boolean mo40a(Object obj) {
                return !TextUtils.isEmpty(((C1461a0) obj).f4760k);
            }
        }).m172F(new InterfaceC2127i() { // from class: c.b.u.i
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                return ((C1461a0) obj).f4760k;
            }
        }).m145t().m158f();
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: a */
    public synchronized void mo1015a() {
        super.mo1015a();
        this.f4776o.clear();
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: c */
    public AbstractC1427e mo918c(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i2, AttributeSet attributeSet) {
        C1461a0 c1461a0 = null;
        String attributeValue = attributeSet.getAttributeValue(null, "locale");
        String attributeValue2 = attributeSet.getAttributeValue(null, "dictionaryAssertName");
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "dictionaryResourceId", 0);
        int attributeResourceValue2 = attributeSet.getAttributeResourceValue(null, "autoTextResourceId", 0);
        int attributeResourceValue3 = attributeSet.getAttributeResourceValue(null, "initialSuggestions", 0);
        if (attributeValue != null && (attributeValue2 != null || attributeResourceValue != 0)) {
            c1461a0 = attributeResourceValue == 0 ? new C1461a0(context, context2, i, charSequence, charSequence2, charSequence3, z, i2, attributeValue, attributeValue2, attributeResourceValue3) : new C1461a0(context, context2, i, charSequence, charSequence2, charSequence3, z, i2, attributeValue, attributeResourceValue, attributeResourceValue2, attributeResourceValue3);
        }
        return c1461a0;
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: j */
    public boolean mo1014j(String str) {
        return true;
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: n */
    public void mo1013n() {
        super.mo1013n();
        for (C1461a0 c1461a0 : m1059e()) {
            this.f4776o.put(c1461a0.f4760k, c1461a0);
        }
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: r */
    public void mo1012r(String str, boolean z) {
        throw new UnsupportedOperationException("This is not supported for dictionaries.");
    }

    /* renamed from: s */
    public List m1011s(AbstractC1762t abstractC1762t) {
        C1461a0 c1461a0;
        ArrayList arrayList = new ArrayList();
        String string = this.f4719c.getString(m1010t(abstractC1762t), null);
        if (TextUtils.isEmpty(string)) {
            C1475h0 m192j = AnyApplication.m192j(this.f4717a);
            String mo826o = abstractC1762t.mo826o();
            synchronized (m192j) {
                if (m192j.f4776o.size() == 0) {
                    m192j.mo1013n();
                }
                c1461a0 = (C1461a0) m192j.f4776o.get(mo826o);
            }
            if (c1461a0 != null) {
                arrayList.add(c1461a0);
            }
        } else {
            for (String str : string.split(":", -1)) {
                C1461a0 c1461a02 = (C1461a0) AnyApplication.m192j(this.f4717a).m1060d(str);
                if (c1461a02 != null) {
                    arrayList.add(c1461a02);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    public void m1008v(AbstractC1762t abstractC1762t, List list) {
        String m1010t = m1010t(abstractC1762t);
        SharedPreferences.Editor edit = this.f4719c.edit();
        if (list.size() == 0) {
            edit.remove(m1010t);
        } else {
            StringBuilder sb = new StringBuilder(list.size() * 24);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1461a0 c1461a0 = (C1461a0) it.next();
                if (sb.length() > 0) {
                    sb.append(':');
                }
                sb.append(c1461a0.f4705a);
            }
            edit.putString(m1010t, sb.toString());
        }
        edit.apply();
    }
}