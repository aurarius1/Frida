package p010b.p086w;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: b.w.r0 */
/* loaded from: classes.dex */
public class C1069r0 implements InterfaceC1071s0 {

    /* renamed from: a */
    public final ViewGroupOverlay f4029a;

    public C1069r0(ViewGroup viewGroup) {
        this.f4029a = viewGroup.getOverlay();
    }

    @Override // p010b.p086w.InterfaceC1071s0
    /* renamed from: a */
    public void mo1324a(View view) {
        this.f4029a.add(view);
    }

    @Override // p010b.p086w.InterfaceC1071s0
    /* renamed from: b */
    public void mo1323b(View view) {
        this.f4029a.remove(view);
    }
}