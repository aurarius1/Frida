package p010b.p016c.p026q;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.y2 */
/* loaded from: classes.dex */
public class View$OnKeyListenerC0341y2 implements View.OnKeyListener {

    /* renamed from: b */
    public final /* synthetic */ SearchView f1828b;

    public View$OnKeyListenerC0341y2(SearchView searchView) {
        this.f1828b = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f1828b;
        if (searchView.f287h0 == null) {
            return false;
        }
        if (!searchView.f297r.isPopupShowing() || this.f1828b.f297r.getListSelection() == -1) {
            if (!(TextUtils.getTrimmedLength(this.f1828b.f297r.getText()) == 0) && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                SearchView searchView2 = this.f1828b;
                searchView2.m3407t(0, null, searchView2.f297r.getText().toString());
                return true;
            }
            return false;
        }
        return this.f1828b.m3418A(i, keyEvent);
    }
}