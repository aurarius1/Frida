package p093c.p135c;

import com.astuetz.PagerSlidingTabStrip;
import p010b.p091z.p092a.InterfaceC1119j;

/* renamed from: c.c.d */
/* loaded from: classes.dex */
public class C1772d implements InterfaceC1119j {

    /* renamed from: a */
    public final /* synthetic */ PagerSlidingTabStrip f5448a;

    public C1772d(PagerSlidingTabStrip pagerSlidingTabStrip, View$OnClickListenerC1769a view$OnClickListenerC1769a) {
        this.f5448a = pagerSlidingTabStrip;
    }

    @Override // p010b.p091z.p092a.InterfaceC1119j
    /* renamed from: a */
    public void mo813a(int i, float f, int i2) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f5448a;
        pagerSlidingTabStrip.f6623k = i;
        pagerSlidingTabStrip.f6624l = f;
        PagerSlidingTabStrip.m368a(this.f5448a, i, pagerSlidingTabStrip.f6622j > 0 ? (int) (pagerSlidingTabStrip.f6615c.getChildAt(i).getWidth() * f) : 0);
        this.f5448a.invalidate();
        InterfaceC1119j interfaceC1119j = this.f5448a.f6620h;
        if (interfaceC1119j != null) {
            interfaceC1119j.mo813a(i, f, i2);
        }
    }

    @Override // p010b.p091z.p092a.InterfaceC1119j
    /* renamed from: b */
    public void mo812b(int i) {
        if (i == 0) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.f5448a;
            PagerSlidingTabStrip.m368a(pagerSlidingTabStrip, pagerSlidingTabStrip.f6621i.getCurrentItem(), 0);
        }
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.f5448a;
        this.f5448a.m365d(pagerSlidingTabStrip2.f6615c.getChildAt(pagerSlidingTabStrip2.f6621i.getCurrentItem()));
        if (this.f5448a.f6621i.getCurrentItem() - 1 >= 0) {
            PagerSlidingTabStrip pagerSlidingTabStrip3 = this.f5448a;
            this.f5448a.m364e(pagerSlidingTabStrip3.f6615c.getChildAt(pagerSlidingTabStrip3.f6621i.getCurrentItem() - 1));
        }
        if (this.f5448a.f6621i.getCurrentItem() + 1 <= this.f5448a.f6621i.getAdapter().mo1093c() - 1) {
            PagerSlidingTabStrip pagerSlidingTabStrip4 = this.f5448a;
            this.f5448a.m364e(pagerSlidingTabStrip4.f6615c.getChildAt(pagerSlidingTabStrip4.f6621i.getCurrentItem() + 1));
        }
        InterfaceC1119j interfaceC1119j = this.f5448a.f6620h;
        if (interfaceC1119j != null) {
            interfaceC1119j.mo812b(i);
        }
    }

    @Override // p010b.p091z.p092a.InterfaceC1119j
    /* renamed from: c */
    public void mo811c(int i) {
        PagerSlidingTabStrip.m367b(this.f5448a, i);
        InterfaceC1119j interfaceC1119j = this.f5448a.f6620h;
        if (interfaceC1119j != null) {
            interfaceC1119j.mo811c(i);
        }
    }
}