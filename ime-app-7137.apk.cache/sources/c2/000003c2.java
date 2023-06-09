package p010b.p077q;

import android.os.Bundle;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.q.p */
/* loaded from: classes.dex */
public abstract class AbstractC0830p {

    /* renamed from: a */
    public final Object f3350a;

    /* renamed from: b */
    public boolean f3351b;

    /* renamed from: c */
    public boolean f3352c;

    /* renamed from: d */
    public int f3353d;

    public AbstractC0830p(Object obj) {
        this.f3350a = obj;
    }

    /* renamed from: a */
    public boolean m1788a() {
        return this.f3351b || this.f3352c;
    }

    /* renamed from: b */
    public void mo1787b(Bundle bundle) {
        StringBuilder m1187i = AbstractC1124a.m1187i("It is not supported to send an error for ");
        m1187i.append(this.f3350a);
        throw new UnsupportedOperationException(m1187i.toString());
    }

    /* renamed from: c */
    public abstract void mo1786c(Object obj);

    /* renamed from: d */
    public void m1785d(Object obj) {
        if (this.f3351b || this.f3352c) {
            StringBuilder m1187i = AbstractC1124a.m1187i("sendResult() called when either sendResult() or sendError() had already been called for: ");
            m1187i.append(this.f3350a);
            throw new IllegalStateException(m1187i.toString());
        }
        this.f3351b = true;
        mo1786c(null);
    }
}