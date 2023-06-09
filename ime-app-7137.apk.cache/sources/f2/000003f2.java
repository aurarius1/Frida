package p010b.p082t;

import android.os.Bundle;
import androidx.preference.ListPreference;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;

/* renamed from: b.t.k */
/* loaded from: classes.dex */
public class C0878k extends AbstractDialogInterface$OnClickListenerC0896t {

    /* renamed from: u0 */
    public int f3480u0;

    /* renamed from: v0 */
    public CharSequence[] f3481v0;

    /* renamed from: w0 */
    public CharSequence[] f3482w0;

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t, p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        if (bundle != null) {
            this.f3480u0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f3481v0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f3482w0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) m1741U0();
        if (listPreference.f584V == null || listPreference.f585W == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f3480u0 = listPreference.m3298M(listPreference.f586X);
        this.f3481v0 = listPreference.f584V;
        this.f3482w0 = listPreference.f585W;
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t
    /* renamed from: X0 */
    public void mo1738X0(boolean z) {
        int i;
        if (!z || (i = this.f3480u0) < 0) {
            return;
        }
        String charSequence = this.f3482w0[i].toString();
        ListPreference listPreference = (ListPreference) m1741U0();
        listPreference.m3285a(charSequence);
        listPreference.m3295P(charSequence);
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t
    /* renamed from: Y0 */
    public void mo1737Y0(C0119p c0119p) {
        CharSequence[] charSequenceArr = this.f3481v0;
        int i = this.f3480u0;
        DialogInterface$OnClickListenerC0876j dialogInterface$OnClickListenerC0876j = new DialogInterface$OnClickListenerC0876j(this);
        C0111l c0111l = c0119p.f1026a;
        c0111l.f951p = charSequenceArr;
        c0111l.f953r = dialogInterface$OnClickListenerC0876j;
        c0111l.f958w = i;
        c0111l.f957v = true;
        c0119p.m3057g(null, null);
    }

    @Override // p010b.p082t.AbstractDialogInterface$OnClickListenerC0896t, p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        super.mo521n0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f3480u0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f3481v0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f3482w0);
    }
}