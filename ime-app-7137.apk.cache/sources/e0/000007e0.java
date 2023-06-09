package p093c.p145g.p146a.p147a.p156i0;

import android.widget.EditText;

/* renamed from: c.g.a.a.i0.d */
/* loaded from: classes.dex */
public class RunnableC1884d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ EditText f5786b;

    /* renamed from: c */
    public final /* synthetic */ C1886e f5787c;

    public RunnableC1884d(C1886e c1886e, EditText editText) {
        this.f5787c = c1886e;
        this.f5786b = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5786b.removeTextChangedListener(this.f5787c.f5789a.f5803d);
    }
}