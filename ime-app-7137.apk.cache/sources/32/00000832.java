package p093c.p145g.p146a.p147a.p166r;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p093c.p145g.p146a.p147a.p163o.AbstractC1959d;
import p093c.p145g.p146a.p147a.p163o.C1958c;

/* renamed from: c.g.a.a.r.a */
/* loaded from: classes.dex */
public class View$OnLayoutChangeListenerC1966a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C1967b f5950a;

    public View$OnLayoutChangeListenerC1966a(C1967b c1967b) {
        this.f5950a = c1967b;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f5950a.f5958i.getVisibility() == 0) {
            C1967b c1967b = this.f5950a;
            ImageView imageView = c1967b.f5958i;
            if (c1967b.m657b()) {
                C1958c c1958c = c1967b.f5967r;
                ImageView imageView2 = c1967b.f5958i;
                FrameLayout frameLayout = null;
                if (imageView == imageView2 && AbstractC1959d.f5939a) {
                    frameLayout = (FrameLayout) imageView2.getParent();
                }
                boolean z = AbstractC1959d.f5939a;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c1958c.setBounds(rect);
                c1958c.m662f(imageView, frameLayout);
            }
        }
    }
}