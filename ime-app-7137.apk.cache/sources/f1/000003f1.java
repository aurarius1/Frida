package p010b.p082t;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0941g2;

/* renamed from: b.t.j0 */
/* loaded from: classes.dex */
public class C0877j0 extends C0568b {

    /* renamed from: d */
    public final /* synthetic */ C0879k0 f3479d;

    public C0877j0(C0879k0 c0879k0) {
        this.f3479d = c0879k0;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        Preference m1756j;
        this.f3479d.f3484g.mo534d(view, c0580e);
        this.f3479d.f3483f.getClass();
        AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
        int m1668e = m3189K != null ? m3189K.m1668e() : -1;
        AbstractC0932e1 adapter = this.f3479d.f3483f.getAdapter();
        if ((adapter instanceof C0865d0) && (m1756j = ((C0865d0) adapter).m1756j(m1668e)) != null) {
            m1756j.mo3271w(c0580e);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: g */
    public boolean mo1219g(View view, int i, Bundle bundle) {
        return this.f3479d.f3484g.mo1219g(view, i, bundle);
    }
}