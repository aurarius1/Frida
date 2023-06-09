package p010b.p082t;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p010b.p016c.p017k.C0119p;

/* renamed from: b.t.n */
/* loaded from: classes.dex */
public class C0884n extends AbstractDialogInterface$OnClickListenerC0896t {

    /* renamed from: u0 */
    public Set f3490u0 = new HashSet();

    /* renamed from: v0 */
    public boolean f3491v0;

    /* renamed from: w0 */
    public CharSequence[] f3492w0;

    /* renamed from: x0 */
    public CharSequence[] f3493x0;

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t, p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        if (bundle != null) {
            this.f3490u0.clear();
            this.f3490u0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f3491v0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f3492w0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f3493x0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m1741U0();
        if (multiSelectListPreference.f590V == null || multiSelectListPreference.f591W == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f3490u0.clear();
        this.f3490u0.addAll(multiSelectListPreference.f592X);
        this.f3491v0 = false;
        this.f3492w0 = multiSelectListPreference.f590V;
        this.f3493x0 = multiSelectListPreference.f591W;
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t
    /* renamed from: X0 */
    public void mo1738X0(boolean z) {
        if (z && this.f3491v0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m1741U0();
            multiSelectListPreference.m3285a(this.f3490u0);
            multiSelectListPreference.m3294M(this.f3490u0);
        }
        this.f3491v0 = false;
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t
    /* renamed from: Y0 */
    public void mo1737Y0(C0119p c0119p) {
        int length = this.f3493x0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f3490u0.contains(this.f3493x0[i].toString());
        }
        c0119p.m3061c(this.f3492w0, zArr, new DialogInterface$OnMultiChoiceClickListenerC0882m(this));
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t, p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        super.mo521n0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f3490u0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f3491v0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f3492w0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f3493x0);
    }
}