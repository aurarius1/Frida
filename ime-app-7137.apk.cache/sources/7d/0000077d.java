package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;
import p183e.p184a.AbstractC2094b;

/* renamed from: c.d.a.a.g */
/* loaded from: classes.dex */
public final class C1785g implements InterfaceC1781c {

    /* renamed from: a */
    public final SharedPreferences f5455a;

    /* renamed from: b */
    public final String f5456b;

    /* renamed from: c */
    public final Object f5457c;

    /* renamed from: d */
    public final InterfaceC1784f f5458d;

    /* renamed from: e */
    public final AbstractC2094b f5459e;

    public C1785g(SharedPreferences sharedPreferences, String str, Object obj, InterfaceC1784f interfaceC1784f, AbstractC2094b abstractC2094b) {
        this.f5455a = sharedPreferences;
        this.f5456b = str;
        this.f5457c = obj;
        this.f5458d = interfaceC1784f;
        this.f5459e = abstractC2094b.m140y(new C1783e(this, str)).m168J("<init>").m172F(new C1782d(this));
    }

    /* renamed from: a */
    public AbstractC2094b m810a() {
        return this.f5459e;
    }

    /* renamed from: b */
    public synchronized Object m809b() {
        if (this.f5455a.contains(this.f5456b)) {
            return this.f5458d.mo805b(this.f5456b, this.f5455a);
        }
        return this.f5457c;
    }

    /* renamed from: c */
    public void m808c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        SharedPreferences.Editor edit = this.f5455a.edit();
        this.f5458d.mo806a(this.f5456b, obj, edit);
        edit.apply();
    }
}