package p010b.p016c.p026q;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.v2 */
/* loaded from: classes.dex */
public class View$OnFocusChangeListenerC0326v2 implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f1782a;

    public View$OnFocusChangeListenerC0326v2(SearchView searchView) {
        this.f1782a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f1782a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f271O;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}