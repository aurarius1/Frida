package p093c.p097b.p130z.p132r0;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: c.b.z.r0.b0 */
/* loaded from: classes.dex */
public class C1701b0 {

    /* renamed from: a */
    public static final PointerTracker[] f5266a = new PointerTracker[0];

    /* renamed from: b */
    public final ArrayList f5267b = new ArrayList();

    /* renamed from: a */
    public void m886a() {
        Iterator it = this.f5267b.iterator();
        while (it.hasNext()) {
            ((PointerTracker) it.next()).m849g();
        }
        this.f5267b.clear();
    }

    /* renamed from: b */
    public void m885b(PointerTracker pointerTracker, long j) {
        Iterator it = this.f5267b.iterator();
        while (it.hasNext()) {
            PointerTracker pointerTracker2 = (PointerTracker) it.next();
            if (pointerTracker2 != pointerTracker) {
                C1750u0 c1750u0 = pointerTracker2.f5392h;
                pointerTracker2.m848h(c1750u0.f5376e, c1750u0.f5377f, j);
                pointerTracker2.f5395k = true;
            }
        }
        this.f5267b.clear();
        this.f5267b.add(pointerTracker);
    }
}