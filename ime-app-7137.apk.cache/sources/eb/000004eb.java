package p093c.p097b.p098a0;

import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.a0.b */
/* loaded from: classes.dex */
public class C1127b {

    /* renamed from: a */
    public final String f4227a;

    /* renamed from: b */
    public int f4228b;

    public C1127b(CharSequence charSequence) {
        this.f4227a = charSequence.toString();
        this.f4228b = 1;
    }

    public C1127b(String str, int i) {
        this.f4227a = str;
        this.f4228b = i;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("[");
        m1187i.append(this.f4227a);
        m1187i.append(":");
        m1187i.append(this.f4228b);
        m1187i.append("]");
        return m1187i.toString();
    }
}