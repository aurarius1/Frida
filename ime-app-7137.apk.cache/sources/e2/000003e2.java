package p010b.p082t;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* renamed from: b.t.c */
/* loaded from: classes.dex */
public class C0862c implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ DropDownPreference f3447b;

    public C0862c(DropDownPreference dropDownPreference) {
        this.f3447b = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = this.f3447b.f585W[i].toString();
            if (charSequence.equals(this.f3447b.f586X)) {
                return;
            }
            this.f3447b.m3285a(charSequence);
            this.f3447b.m3295P(charSequence);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}