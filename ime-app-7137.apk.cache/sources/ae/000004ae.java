package p010b.p086w;

import android.view.View;
import java.util.ArrayList;

/* renamed from: b.w.q */
/* loaded from: classes.dex */
public class C1066q implements InterfaceC1031d0 {

    /* renamed from: a */
    public final /* synthetic */ View f4020a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f4021b;

    public C1066q(C1072t c1072t, View view, ArrayList arrayList) {
        this.f4020a = view;
        this.f4021b = arrayList;
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: a */
    public void mo1329a(AbstractC1034e0 abstractC1034e0) {
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: b */
    public void mo1328b(AbstractC1034e0 abstractC1034e0) {
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: c */
    public void mo1326c(AbstractC1034e0 abstractC1034e0) {
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: d */
    public void mo1327d(AbstractC1034e0 abstractC1034e0) {
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: e */
    public void mo1325e(AbstractC1034e0 abstractC1034e0) {
        abstractC1034e0.mo1340v(this);
        this.f4020a.setVisibility(8);
        int size = this.f4021b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f4021b.get(i)).setVisibility(0);
        }
    }
}