package p010b.p086w;

import java.util.ArrayList;
import p010b.p036g.C0378b;

/* renamed from: b.w.g0 */
/* loaded from: classes.dex */
public class C1040g0 extends AbstractC1037f0 {

    /* renamed from: a */
    public final /* synthetic */ C0378b f3950a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC1043h0 f3951b;

    public C1040g0(ViewTreeObserver$OnPreDrawListenerC1043h0 viewTreeObserver$OnPreDrawListenerC1043h0, C0378b c0378b) {
        this.f3951b = viewTreeObserver$OnPreDrawListenerC1043h0;
        this.f3950a = c0378b;
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: e */
    public void mo1325e(AbstractC1034e0 abstractC1034e0) {
        ((ArrayList) this.f3950a.get(this.f3951b.f3957c)).remove(abstractC1034e0);
        abstractC1034e0.mo1340v(this);
    }
}