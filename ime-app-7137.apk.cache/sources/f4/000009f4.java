package p210g.p211a.p212a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* renamed from: g.a.a.j */
/* loaded from: classes.dex */
public class DialogFragmentC2311j extends DialogFragment {

    /* renamed from: b */
    public boolean f7469b = false;

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (Build.VERSION.SDK_INT < 17 || getParentFragment() == null) {
            return;
        }
        getParentFragment();
        getParentFragment();
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        C2310i c2310i = new C2310i(getArguments());
        DialogInterface$OnClickListenerC2309h dialogInterface$OnClickListenerC2309h = new DialogInterface$OnClickListenerC2309h(this, c2310i, (InterfaceC2304c) null, (InterfaceC2305d) null);
        Activity activity = getActivity();
        return (c2310i.f7465c > 0 ? new AlertDialog.Builder(activity, c2310i.f7465c) : new AlertDialog.Builder(activity)).setCancelable(false).setPositiveButton(c2310i.f7463a, dialogInterface$OnClickListenerC2309h).setNegativeButton(c2310i.f7464b, dialogInterface$OnClickListenerC2309h).setMessage(c2310i.f7467e).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f7469b = true;
        super.onSaveInstanceState(bundle);
    }
}