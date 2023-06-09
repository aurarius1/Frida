package p093c.p145g.p146a.p147a.p156i0;

import android.widget.EditText;

/* renamed from: c.g.a.a.i0.i0 */
/* loaded from: classes.dex */
public class RunnableC1895i0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ EditText f5799b;

    /* renamed from: c */
    public final /* synthetic */ C1897j0 f5800c;

    public RunnableC1895i0(C1897j0 c1897j0, EditText editText) {
        this.f5800c = c1897j0;
        this.f5799b = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5799b.removeTextChangedListener(this.f5800c.f5802a.f5810d);
    }
}