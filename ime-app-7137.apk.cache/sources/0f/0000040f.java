package p010b.p082t;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: b.t.y0 */
/* loaded from: classes.dex */
public class C0907y0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SwitchPreferenceCompat f3524a;

    public C0907y0(SwitchPreferenceCompat switchPreferenceCompat) {
        this.f3524a = switchPreferenceCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f3524a.m3285a(Boolean.valueOf(z));
        this.f3524a.m3252M(z);
    }
}