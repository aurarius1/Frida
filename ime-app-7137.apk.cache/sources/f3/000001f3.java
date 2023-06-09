package p010b.p034f.p035f;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* renamed from: b.f.f.a */
/* loaded from: classes.dex */
public class C0367a {

    /* renamed from: a */
    public Drawable f1861a;

    /* renamed from: b */
    public final /* synthetic */ CardView f1862b;

    public C0367a(CardView cardView) {
        this.f1862b = cardView;
    }

    /* renamed from: a */
    public boolean m2685a() {
        return this.f1862b.getPreventCornerOverlap();
    }

    /* renamed from: b */
    public void m2684b(int i, int i2, int i3, int i4) {
        this.f1862b.f406i.set(i, i2, i3, i4);
        CardView cardView = this.f1862b;
        Rect rect = cardView.f405h;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }
}