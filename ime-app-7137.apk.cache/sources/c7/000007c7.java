package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
import p093c.p145g.p146a.p147a.p153f0.C1841a;

/* renamed from: c.g.a.a.g0.q */
/* loaded from: classes.dex */
public class C1859q extends AbstractC1865w {

    /* renamed from: b */
    public final /* synthetic */ List f5717b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f5718c;

    public C1859q(C1866x c1866x, List list, Matrix matrix) {
        this.f5717b = list;
        this.f5718c = matrix;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.AbstractC1865w
    /* renamed from: a */
    public void mo711a(Matrix matrix, C1841a c1841a, int i, Canvas canvas) {
        for (AbstractC1865w abstractC1865w : this.f5717b) {
            abstractC1865w.mo711a(this.f5718c, c1841a, i, canvas);
        }
    }
}