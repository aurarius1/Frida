package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p190p.p195e.p196a.C2208r0;

/* renamed from: c.d.a.a.k */
/* loaded from: classes.dex */
public final class C1789k {

    /* renamed from: a */
    public final SharedPreferences f5464a;

    /* renamed from: b */
    public final AbstractC2094b f5465b;

    public C1789k(SharedPreferences sharedPreferences) {
        this.f5464a = sharedPreferences;
        this.f5465b = C2208r0.m87V(AbstractC2094b.m146s(new C1788j(this, sharedPreferences))).m41U();
    }

    /* renamed from: a */
    public InterfaceC1781c m807a(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return new C1785g(this.f5464a, str, str2, C1790l.f5466a, this.f5465b);
            }
            throw new NullPointerException("defaultValue == null");
        }
        throw new NullPointerException("key == null");
    }
}