package p093c.p145g.p146a.p147a.p171w;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import p010b.p046j.p057k.C0561b;
import p010b.p083u.p084e.AbstractC0964m1;
import p010b.p083u.p084e.C0929d2;

/* renamed from: c.g.a.a.w.k */
/* loaded from: classes.dex */
public class C2025k extends AbstractC0964m1 {

    /* renamed from: a */
    public final Calendar f6162a = AbstractC2024j0.m548e();

    /* renamed from: b */
    public final Calendar f6163b = AbstractC2024j0.m548e();

    /* renamed from: c */
    public final /* synthetic */ C2034q f6164c;

    public C2025k(C2034q c2034q) {
        this.f6164c = c2034q;
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: e */
    public void mo546e(Canvas canvas, RecyclerView recyclerView, C0929d2 c0929d2) {
        if ((recyclerView.getAdapter() instanceof C2030m0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C2030m0 c2030m0 = (C2030m0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (C0561b c0561b : this.f6164c.f6180Z.m290e()) {
                Object obj = c0561b.f2654a;
                if (obj != null && c0561b.f2655b != null) {
                    this.f6162a.setTimeInMillis(((Long) obj).longValue());
                    this.f6163b.setTimeInMillis(((Long) c0561b.f2655b).longValue());
                    int m540h = c2030m0.m540h(this.f6162a.get(1));
                    int m540h2 = c2030m0.m540h(this.f6163b.get(1));
                    View mo1502u = gridLayoutManager.mo1502u(m540h);
                    View mo1502u2 = gridLayoutManager.mo1502u(m540h2);
                    int i = gridLayoutManager.f674H;
                    int i2 = m540h / i;
                    int i3 = m540h2 / i;
                    for (int i4 = i2; i4 <= i3; i4++) {
                        View mo1502u3 = gridLayoutManager.mo1502u(gridLayoutManager.f674H * i4);
                        if (mo1502u3 != null) {
                            int top = mo1502u3.getTop() + this.f6164c.f6184d0.f6139d.f6128a.top;
                            int bottom = mo1502u3.getBottom() - this.f6164c.f6184d0.f6139d.f6128a.bottom;
                            canvas.drawRect(i4 == i2 ? (mo1502u.getWidth() / 2) + mo1502u.getLeft() : 0, top, i4 == i3 ? (mo1502u2.getWidth() / 2) + mo1502u2.getLeft() : recyclerView.getWidth(), bottom, this.f6164c.f6184d0.f6143h);
                        }
                    }
                }
            }
        }
    }
}