package p093c.p145g.p146a.p147a.p156i0;

import android.widget.AutoCompleteTextView;

/* renamed from: c.g.a.a.i0.t */
/* loaded from: classes.dex */
public class RunnableC1916t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f5828b;

    /* renamed from: c */
    public final /* synthetic */ C1918u f5829c;

    public RunnableC1916t(C1918u c1918u, AutoCompleteTextView autoCompleteTextView) {
        this.f5829c = c1918u;
        this.f5828b = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5828b.removeTextChangedListener(this.f5829c.f5830a.f5837e);
    }
}