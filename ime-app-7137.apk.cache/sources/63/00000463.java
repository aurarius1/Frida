package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.u.e.t0 */
/* loaded from: classes.dex */
public class C0991t0 extends AbstractC0999v0 {
    public C0991t0(AbstractC0980q1 abstractC0980q1) {
        super(abstractC0980q1, null);
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: b */
    public int mo1445b(View view) {
        return this.f3865a.m1578H(view) + ((ViewGroup.MarginLayoutParams) ((C0984r1) view.getLayoutParams())).rightMargin;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: c */
    public int mo1444c(View view) {
        C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
        return this.f3865a.m1580G(view) + ((ViewGroup.MarginLayoutParams) c0984r1).leftMargin + ((ViewGroup.MarginLayoutParams) c0984r1).rightMargin;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: d */
    public int mo1443d(View view) {
        C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
        return this.f3865a.m1582F(view) + ((ViewGroup.MarginLayoutParams) c0984r1).topMargin + ((ViewGroup.MarginLayoutParams) c0984r1).bottomMargin;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: e */
    public int mo1442e(View view) {
        return this.f3865a.m1584E(view) - ((ViewGroup.MarginLayoutParams) ((C0984r1) view.getLayoutParams())).leftMargin;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: f */
    public int mo1441f() {
        return this.f3865a.f3787p;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: g */
    public int mo1440g() {
        AbstractC0980q1 abstractC0980q1 = this.f3865a;
        return abstractC0980q1.f3787p - abstractC0980q1.m1560Q();
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: h */
    public int mo1439h() {
        return this.f3865a.m1560Q();
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: i */
    public int mo1438i() {
        return this.f3865a.f3785n;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: j */
    public int mo1437j() {
        return this.f3865a.f3786o;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: k */
    public int mo1436k() {
        return this.f3865a.m1562P();
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: l */
    public int mo1435l() {
        AbstractC0980q1 abstractC0980q1 = this.f3865a;
        return (abstractC0980q1.f3787p - abstractC0980q1.m1562P()) - this.f3865a.m1560Q();
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: n */
    public int mo1433n(View view) {
        this.f3865a.m1548W(view, true, this.f3867c);
        return this.f3867c.right;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: o */
    public int mo1432o(View view) {
        this.f3865a.m1548W(view, true, this.f3867c);
        return this.f3867c.left;
    }

    @Override // p010b.p083u.p084e.AbstractC0999v0
    /* renamed from: p */
    public void mo1431p(int i) {
        this.f3865a.mo1537c0(i);
    }
}