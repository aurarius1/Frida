package p093c.p145g.p146a.p147a.p156i0;

import android.widget.AutoCompleteTextView;

/* renamed from: c.g.a.a.i0.n */
/* loaded from: classes.dex */
public class RunnableC1904n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f5817b;

    /* renamed from: c */
    public final /* synthetic */ C1908p f5818c;

    public RunnableC1904n(C1908p c1908p, AutoCompleteTextView autoCompleteTextView) {
        this.f5818c = c1908p;
        this.f5817b = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean isPopupShowing = this.f5817b.isPopupShowing();
        C1923z.m680f(this.f5818c.f5822b, isPopupShowing);
        this.f5818c.f5822b.f5842j = isPopupShowing;
    }
}