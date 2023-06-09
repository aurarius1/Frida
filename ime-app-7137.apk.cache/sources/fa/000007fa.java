package p093c.p145g.p146a.p147a.p156i0;

import android.view.View;

/* renamed from: c.g.a.a.i0.q */
/* loaded from: classes.dex */
public class View$OnFocusChangeListenerC1910q implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C1923z f5824a;

    public View$OnFocusChangeListenerC1910q(C1923z c1923z) {
        this.f5824a = c1923z;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        this.f5824a.f5755a.setEndIconActivated(z);
        if (z) {
            return;
        }
        C1923z.m680f(this.f5824a, false);
        this.f5824a.f5842j = false;
    }
}