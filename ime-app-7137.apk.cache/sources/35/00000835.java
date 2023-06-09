package p093c.p145g.p146a.p147a.p166r;

import android.view.View;
import p010b.p016c.p024p.p025m.C0202s;

/* renamed from: c.g.a.a.r.d */
/* loaded from: classes.dex */
public class View$OnClickListenerC1969d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1970e f5968b;

    public View$OnClickListenerC1969d(C1970e c1970e) {
        this.f5968b = c1970e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0202s itemData = ((C1967b) view).getItemData();
        C1970e c1970e = this.f5968b;
        if (c1970e.f5973C.m2920s(itemData, c1970e.f5972B, 0)) {
            return;
        }
        itemData.setChecked(true);
    }
}