package p210g.p211a.p212a.p213l;

import android.app.Activity;
import android.content.Context;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: g.a.a.l.d */
/* loaded from: classes.dex */
public class C2316d extends AbstractC2317e {
    public C2316d(Object obj) {
        super(obj);
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: a */
    public void mo10a(int i, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: b */
    public Context mo9b() {
        Object obj = this.f7470a;
        if (obj instanceof Activity) {
            return (Context) obj;
        }
        if (obj instanceof AbstractComponentCallbacksC0763z) {
            return ((AbstractComponentCallbacksC0763z) obj).m1866k();
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Unknown host: ");
        m1187i.append(this.f7470a);
        throw new IllegalStateException(m1187i.toString());
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: d */
    public boolean mo8d(String str) {
        return false;
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: e */
    public void mo11e(String str, String str2, String str3, int i, int i2, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }
}