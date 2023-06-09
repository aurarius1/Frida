package p010b.p086w;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: b.w.h1 */
/* loaded from: classes.dex */
public class C1044h1 extends AbstractC1037f0 {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f3958a;

    /* renamed from: b */
    public final /* synthetic */ View f3959b;

    /* renamed from: c */
    public final /* synthetic */ View f3960c;

    /* renamed from: d */
    public final /* synthetic */ C1062o f3961d;

    public C1044h1(C1062o c1062o, ViewGroup viewGroup, View view, View view2) {
        this.f3961d = c1062o;
        this.f3958a = viewGroup;
        this.f3959b = view;
        this.f3960c = view2;
    }

    @Override // p010b.p086w.AbstractC1037f0, p010b.p086w.InterfaceC1031d0
    /* renamed from: a */
    public void mo1329a(AbstractC1034e0 abstractC1034e0) {
        AbstractC1073t0.m1305a(this.f3958a).mo1323b(this.f3959b);
    }

    @Override // p010b.p086w.AbstractC1037f0, p010b.p086w.InterfaceC1031d0
    /* renamed from: b */
    public void mo1328b(AbstractC1034e0 abstractC1034e0) {
        if (this.f3959b.getParent() == null) {
            AbstractC1073t0.m1305a(this.f3958a).mo1324a(this.f3959b);
            return;
        }
        C1062o c1062o = this.f3961d;
        int size = c1062o.f3941q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) c1062o.f3941q.get(size)).cancel();
        }
        ArrayList arrayList = c1062o.f3945u;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) c1062o.f3945u.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC1031d0) arrayList2.get(i)).mo1327d(c1062o);
        }
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: e */
    public void mo1325e(AbstractC1034e0 abstractC1034e0) {
        this.f3960c.setTag(AbstractC1076v.save_overlay_view, null);
        AbstractC1073t0.m1305a(this.f3958a).mo1323b(this.f3959b);
        abstractC1034e0.mo1340v(this);
    }
}