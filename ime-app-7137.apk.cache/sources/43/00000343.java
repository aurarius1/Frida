package p010b.p067m.p068d;

import android.widget.ListView;

/* renamed from: b.m.d.i2 */
/* loaded from: classes.dex */
public class RunnableC0703i2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0711k2 f3026b;

    public RunnableC0703i2(C0711k2 c0711k2) {
        this.f3026b = c0711k2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ListView listView = this.f3026b.f3041a0;
        listView.focusableViewAvailable(listView);
    }
}