package p093c.p097b.p116p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.p.h */
/* loaded from: classes.dex */
public abstract class AbstractC1430h extends AbstractC1432j {

    /* renamed from: o */
    public final String f4716o;

    public AbstractC1430h(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2) {
        super(context, str, str2, str3, str4, str5, str6, i, i2, z, z2);
        this.f4716o = AbstractC1124a.m1190f(str6, "AddOnsFactory_order_key");
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: n */
    public void mo1013n() {
        super.mo1013n();
        String[] split = this.f4719c.getString(this.f4716o, "").split(",", -1);
        HashSet hashSet = new HashSet();
        int i = 0;
        for (String str : split) {
            if (this.f4721e.containsKey(str) && !hashSet.contains(str)) {
                hashSet.add(str);
                AbstractC1427e abstractC1427e = (AbstractC1427e) this.f4721e.get(str);
                this.f4720d.remove(abstractC1427e);
                this.f4720d.add(i, abstractC1427e);
                i++;
            }
        }
    }

    @Override // p093c.p097b.p116p.AbstractC1432j
    /* renamed from: r */
    public void mo1012r(String str, boolean z) {
        SharedPreferences.Editor edit = this.f4719c.edit();
        m1050q(edit, str, z);
        edit.apply();
    }
}