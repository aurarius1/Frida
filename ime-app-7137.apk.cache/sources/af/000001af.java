package p010b.p016c.p026q;

import android.annotation.SuppressLint;
import android.view.View;
import p010b.p016c.p024p.p025m.InterfaceC0187h0;

/* renamed from: b.c.q.q0 */
/* loaded from: classes.dex */
public class C0299q0 extends AbstractView$OnTouchListenerC0330w1 {

    /* renamed from: k */
    public final /* synthetic */ C0334x0 f1728k;

    /* renamed from: l */
    public final /* synthetic */ C0212a1 f1729l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0299q0(C0212a1 c0212a1, View view, C0334x0 c0334x0) {
        super(view);
        this.f1729l = c0212a1;
        this.f1728k = c0334x0;
    }

    @Override // p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1
    /* renamed from: b */
    public InterfaceC0187h0 mo2731b() {
        return this.f1728k;
    }

    @Override // p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public boolean mo2730c() {
        if (this.f1729l.getInternalPopup().mo2706b()) {
            return true;
        }
        this.f1729l.m2883b();
        return true;
    }
}