package p093c.p097b.p130z.p132r0.p134b1;

import android.graphics.Point;
import android.graphics.Rect;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.b1.b */
/* loaded from: classes.dex */
public class C1703b implements InterfaceC1711j {
    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1711j
    /* renamed from: a */
    public Point mo874a(Key key, C1712k c1712k, int[] iArr) {
        Point point = new Point(key.x + iArr[0], iArr[1]);
        Rect rect = new Rect();
        c1712k.f5292c.getPadding(rect);
        point.offset(key.width / 2, rect.bottom - c1712k.f5295f);
        return point;
    }
}