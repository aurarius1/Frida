package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.u.e.n1 */
/* loaded from: classes.dex */
public class C0968n1 implements InterfaceC0989s2 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0980q1 f3733a;

    public C0968n1(AbstractC0980q1 abstractC0980q1) {
        this.f3733a = abstractC0980q1;
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: a */
    public View mo1468a(int i) {
        return this.f3733a.m1494y(i);
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: b */
    public int mo1467b() {
        AbstractC0980q1 abstractC0980q1 = this.f3733a;
        return abstractC0980q1.f3787p - abstractC0980q1.m1560Q();
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: c */
    public int mo1466c() {
        return this.f3733a.m1562P();
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: d */
    public int mo1465d(View view) {
        return this.f3733a.m1578H(view) + ((ViewGroup.MarginLayoutParams) ((C0984r1) view.getLayoutParams())).rightMargin;
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: e */
    public int mo1464e(View view) {
        return this.f3733a.m1584E(view) - ((ViewGroup.MarginLayoutParams) ((C0984r1) view.getLayoutParams())).leftMargin;
    }
}