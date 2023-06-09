package p093c.p145g.p146a.p147a.p156i0;

import android.text.Editable;
import android.view.View;

/* renamed from: c.g.a.a.i0.f */
/* loaded from: classes.dex */
public class View$OnClickListenerC1888f implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1898k f5793b;

    public View$OnClickListenerC1888f(C1898k c1898k) {
        this.f5793b = c1898k;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Editable text = this.f5793b.f5755a.getEditText().getText();
        if (text != null) {
            text.clear();
        }
        this.f5793b.f5755a.m248p();
    }
}