package p093c.p097b.p098a0;

import java.util.Iterator;

/* renamed from: c.b.a0.d */
/* loaded from: classes.dex */
public class C1129d implements Iterable {

    /* renamed from: b */
    public final String[] f4231b;

    /* renamed from: c */
    public int f4232c = 0;

    public C1129d(String[] strArr) {
        this.f4231b = strArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C1128c(this);
    }
}