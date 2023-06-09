package p010b.p085v;

import android.annotation.SuppressLint;
import android.os.Bundle;
import p010b.p027d.p028a.p030b.C0359h;
import p093c.p094a.p095a.p096a.AbstractC1124a;

@SuppressLint({"RestrictedApi"})
/* renamed from: b.v.e */
/* loaded from: classes.dex */
public final class C1018e {

    /* renamed from: b */
    public Bundle f3907b;

    /* renamed from: c */
    public boolean f3908c;

    /* renamed from: d */
    public C1015b f3909d;

    /* renamed from: a */
    public C0359h f3906a = new C0359h();

    /* renamed from: e */
    public boolean f3910e = true;

    /* renamed from: a */
    public Bundle m1390a(String str) {
        if (this.f3908c) {
            Bundle bundle = this.f3907b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f3907b.remove(str);
                if (this.f3907b.isEmpty()) {
                    this.f3907b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: b */
    public void m1389b(String str, InterfaceC1017d interfaceC1017d) {
        if (((InterfaceC1017d) this.f3906a.mo2687d(str, interfaceC1017d)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: c */
    public void m1388c(Class cls) {
        if (!this.f3910e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3909d == null) {
            this.f3909d = new C1015b(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            C1015b c1015b = this.f3909d;
            c1015b.f3905a.add(cls.getName());
        } catch (NoSuchMethodException e) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Class");
            m1187i.append(cls.getSimpleName());
            m1187i.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(m1187i.toString(), e);
        }
    }
}