package p093c.p135c;

import android.database.DataSetObserver;
import com.astuetz.PagerSlidingTabStrip;

/* renamed from: c.c.e */
/* loaded from: classes.dex */
public class C1773e extends DataSetObserver {

    /* renamed from: a */
    public boolean f5449a = false;

    /* renamed from: b */
    public final /* synthetic */ PagerSlidingTabStrip f5450b;

    public C1773e(PagerSlidingTabStrip pagerSlidingTabStrip, View$OnClickListenerC1769a view$OnClickListenerC1769a) {
        this.f5450b = pagerSlidingTabStrip;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f5450b.m366c();
    }
}