package p093c.p145g.p146a.p147a.p156i0;

import android.widget.AutoCompleteTextView;

/* renamed from: c.g.a.a.i0.x */
/* loaded from: classes.dex */
public class C1921x implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C1923z f5834a;

    public C1921x(C1923z c1923z) {
        this.f5834a = c1923z;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        C1923z c1923z = this.f5834a;
        c1923z.f5842j = true;
        c1923z.f5844l = System.currentTimeMillis();
        C1923z.m680f(this.f5834a, false);
    }
}