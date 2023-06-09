package p010b.p082t;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: b.t.x0 */
/* loaded from: classes.dex */
public class C0905x0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SwitchPreference f3522a;

    public C0905x0(SwitchPreference switchPreference) {
        this.f3522a = switchPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f3522a.m3285a(Boolean.valueOf(z));
        this.f3522a.m3252M(z);
    }
}