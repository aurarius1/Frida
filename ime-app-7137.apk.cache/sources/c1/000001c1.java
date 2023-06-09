package p010b.p016c.p026q;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p010b.p016c.p024p.p025m.C0202s;

/* renamed from: b.c.q.t3 */
/* loaded from: classes.dex */
public class View$OnClickListenerC0317t3 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Toolbar f1772b;

    public View$OnClickListenerC0317t3(Toolbar toolbar) {
        this.f1772b = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0322u3 c0322u3 = this.f1772b.f364L;
        C0202s c0202s = c0322u3 == null ? null : c0322u3.f1778c;
        if (c0202s != null) {
            c0202s.collapseActionView();
        }
    }
}