package p093c.p097b.p098a0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.b.a0.c */
/* loaded from: classes.dex */
public class C1128c implements Iterator {

    /* renamed from: b */
    public int f4229b = 0;

    /* renamed from: c */
    public final /* synthetic */ C1129d f4230c;

    public C1128c(C1129d c1129d) {
        this.f4230c = c1129d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4229b < this.f4230c.f4232c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            String[] strArr = this.f4230c.f4231b;
            int i = this.f4229b;
            this.f4229b = i + 1;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Not supporting remove right now");
    }
}