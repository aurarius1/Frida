package p093c.p097b.p108i0.p110p.p113z1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: c.b.i0.p.z1.m */
/* loaded from: classes.dex */
public class View$OnClickListenerC1401m implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1402n f4640b;

    public View$OnClickListenerC1401m(C1402n c1402n) {
        this.f4640b = c1402n;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ((InputMethodManager) this.f4640b.m1872h().getSystemService("input_method")).showInputMethodPicker();
    }
}