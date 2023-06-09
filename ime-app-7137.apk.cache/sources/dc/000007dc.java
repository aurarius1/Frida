package p093c.p145g.p146a.p147a.p156i0;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: c.g.a.a.i0.b */
/* loaded from: classes.dex */
public class View$OnFocusChangeListenerC1880b implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C1898k f5758a;

    public View$OnFocusChangeListenerC1880b(C1898k c1898k) {
        this.f5758a = c1898k;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        boolean z2 = true;
        this.f5758a.m690d(((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z) ? false : false);
    }
}