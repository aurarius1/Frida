package p010b.p016c.p026q;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.z2 */
/* loaded from: classes.dex */
public class C0346z2 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f1835a;

    public C0346z2(SearchView searchView) {
        this.f1835a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f1835a.m3401z();
        return true;
    }
}