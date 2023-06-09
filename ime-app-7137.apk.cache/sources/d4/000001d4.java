package p010b.p016c.p026q;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.x2 */
/* loaded from: classes.dex */
public class View$OnClickListenerC0336x2 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SearchView f1810b;

    public View$OnClickListenerC0336x2(SearchView searchView) {
        this.f1810b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SearchView searchView = this.f1810b;
        if (view == searchView.f302v) {
            searchView.m3402y();
        } else if (view == searchView.f304x) {
            searchView.m3406u();
        } else if (view == searchView.f303w) {
            searchView.m3401z();
        } else if (view == searchView.f305y) {
            SearchableInfo searchableInfo = searchView.f287h0;
            if (searchableInfo != null) {
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m3409r(searchView.f267K, searchableInfo));
                            return;
                        }
                        return;
                    }
                    Intent intent = new Intent(searchView.f266J);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                }
            }
        } else if (view == searchView.f297r) {
            searchView.m3408s();
        }
    }
}