package p093c.p097b.p128x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.b.x.p2 */
/* loaded from: classes.dex */
public class C1615p2 implements Iterator {

    /* renamed from: b */
    public int f5046b = 0;

    /* renamed from: c */
    public final /* synthetic */ C1619q2 f5047c;

    public C1615p2(C1619q2 c1619q2) {
        this.f5047c = c1619q2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5046b < this.f5047c.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            C1619q2 c1619q2 = this.f5047c;
            int i = this.f5046b;
            this.f5046b = i + 1;
            return i == 0 ? c1619q2.f5051b : (CharSequence) c1619q2.f5052c.get(i - 1);
        }
        throw new NoSuchElementException("Called after end of list!");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}