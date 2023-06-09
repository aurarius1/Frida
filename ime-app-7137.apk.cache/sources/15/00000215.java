package p010b.p037h.p040b;

import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.i */
/* loaded from: classes.dex */
public class C0401i implements Comparable {

    /* renamed from: b */
    public C0404l f1988b;

    /* renamed from: c */
    public final /* synthetic */ C0402j f1989c;

    public C0401i(C0402j c0402j, C0402j c0402j2) {
        this.f1989c = c0402j;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f1988b.f2008c - ((C0404l) obj).f2008c;
    }

    public String toString() {
        String str = "[ ";
        if (this.f1988b != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder m1187i = AbstractC1124a.m1187i(str);
                m1187i.append(this.f1988b.f2014i[i]);
                m1187i.append(" ");
                str = m1187i.toString();
            }
        }
        return str + "] " + this.f1988b;
    }
}