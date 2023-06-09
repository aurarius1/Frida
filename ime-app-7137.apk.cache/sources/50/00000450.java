package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.u.e.o1 */
/* loaded from: classes.dex */
public class C0972o1 implements InterfaceC0989s2 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0980q1 f3751a;

    public C0972o1(AbstractC0980q1 abstractC0980q1) {
        this.f3751a = abstractC0980q1;
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: a */
    public View mo1468a(int i) {
        return this.f3751a.m1494y(i);
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: b */
    public int mo1467b() {
        AbstractC0980q1 abstractC0980q1 = this.f3751a;
        return abstractC0980q1.f3788q - abstractC0980q1.m1564O();
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: c */
    public int mo1466c() {
        return this.f3751a.m1558R();
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: d */
    public int mo1465d(View view) {
        return this.f3751a.m1588C(view) + ((ViewGroup.MarginLayoutParams) ((C0984r1) view.getLayoutParams())).bottomMargin;
    }

    @Override // p010b.p083u.p084e.InterfaceC0989s2
    /* renamed from: e */
    public int mo1464e(View view) {
        return this.f3751a.m1576I(view) - ((ViewGroup.MarginLayoutParams) ((C0984r1) view.getLayoutParams())).topMargin;
    }
}