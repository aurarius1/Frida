package p010b.p016c.p026q;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.h3 */
/* loaded from: classes.dex */
public class RunnableC0256h3 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SearchView.SearchAutoComplete f1594b;

    public RunnableC0256h3(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1594b = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1594b;
        if (searchAutoComplete.f310g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f310g = false;
        }
    }
}