package p093c.p135c;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.astuetz.PagerSlidingTabStrip;

/* renamed from: c.c.b */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC1770b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ PagerSlidingTabStrip f5447b;

    public ViewTreeObserver$OnGlobalLayoutListenerC1770b(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.f5447b = pagerSlidingTabStrip;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        View childAt = this.f5447b.f6615c.getChildAt(0);
        if (Build.VERSION.SDK_INT < 16) {
            this.f5447b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else {
            this.f5447b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        if (this.f5447b.f6607B) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.f5447b;
            int width = (pagerSlidingTabStrip.getWidth() / 2) - (childAt.getWidth() / 2);
            pagerSlidingTabStrip.f6638z = width;
            pagerSlidingTabStrip.f6637y = width;
        }
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.f5447b;
        int i = pagerSlidingTabStrip2.f6637y;
        int paddingTop = pagerSlidingTabStrip2.getPaddingTop();
        PagerSlidingTabStrip pagerSlidingTabStrip3 = this.f5447b;
        pagerSlidingTabStrip2.setPadding(i, paddingTop, pagerSlidingTabStrip3.f6638z, pagerSlidingTabStrip3.getPaddingBottom());
        PagerSlidingTabStrip pagerSlidingTabStrip4 = this.f5447b;
        if (pagerSlidingTabStrip4.f6611F == 0) {
            pagerSlidingTabStrip4.f6611F = (pagerSlidingTabStrip4.getWidth() / 2) - this.f5447b.f6637y;
        }
        PagerSlidingTabStrip pagerSlidingTabStrip5 = this.f5447b;
        pagerSlidingTabStrip5.f6623k = pagerSlidingTabStrip5.f6621i.getCurrentItem();
        PagerSlidingTabStrip pagerSlidingTabStrip6 = this.f5447b;
        pagerSlidingTabStrip6.f6624l = 0.0f;
        PagerSlidingTabStrip.m368a(pagerSlidingTabStrip6, pagerSlidingTabStrip6.f6623k, 0);
        PagerSlidingTabStrip pagerSlidingTabStrip7 = this.f5447b;
        PagerSlidingTabStrip.m367b(pagerSlidingTabStrip7, pagerSlidingTabStrip7.f6623k);
    }
}