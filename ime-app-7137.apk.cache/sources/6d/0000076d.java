package p093c.p135c;

import android.view.View;
import com.astuetz.PagerSlidingTabStrip;

/* renamed from: c.c.a */
/* loaded from: classes.dex */
public class View$OnClickListenerC1769a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f5445b;

    /* renamed from: c */
    public final /* synthetic */ PagerSlidingTabStrip f5446c;

    public View$OnClickListenerC1769a(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        this.f5446c = pagerSlidingTabStrip;
        this.f5445b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int currentItem = this.f5446c.f6621i.getCurrentItem();
        int i = this.f5445b;
        if (currentItem != i) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.f5446c;
            this.f5446c.m364e(pagerSlidingTabStrip.f6615c.getChildAt(pagerSlidingTabStrip.f6621i.getCurrentItem()));
            this.f5446c.f6621i.setCurrentItem(this.f5445b);
            return;
        }
        InterfaceC1771c interfaceC1771c = this.f5446c.f6619g;
        if (interfaceC1771c != null) {
            interfaceC1771c.m814a(i);
        }
    }
}