package p010b.p082t;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: b.t.a */
/* loaded from: classes.dex */
public class C0858a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBoxPreference f3443a;

    public C0858a(CheckBoxPreference checkBoxPreference) {
        this.f3443a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f3443a.m3285a(Boolean.valueOf(z));
        this.f3443a.m3252M(z);
    }
}