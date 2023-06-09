package p010b.p016c.p026q;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.s2 */
/* loaded from: classes.dex */
public class C0311s2 implements TextWatcher {

    /* renamed from: b */
    public final /* synthetic */ SearchView f1761b;

    public C0311s2(SearchView searchView) {
        this.f1761b = searchView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.f1761b;
        Editable text = searchView.f297r.getText();
        searchView.f284e0 = text;
        boolean z = !TextUtils.isEmpty(text);
        searchView.m3413F(z);
        searchView.m3411H(!z);
        searchView.m3417B();
        searchView.m3414E();
        if (searchView.f269M != null && !TextUtils.equals(charSequence, searchView.f283d0)) {
            searchView.f269M.m2859a(charSequence.toString());
        }
        searchView.f283d0 = charSequence.toString();
    }
}