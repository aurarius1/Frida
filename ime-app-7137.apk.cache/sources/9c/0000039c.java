package p010b.p072o;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: b.o.u */
/* loaded from: classes.dex */
public class FragmentC0792u extends Fragment {
    /* renamed from: a */
    public static void m1805a(Activity activity, EnumC0777f enumC0777f) {
        if (activity instanceof InterfaceC0782k) {
            AbstractC0779h mo1826g = ((InterfaceC0782k) activity).mo1826g();
            if (mo1826g instanceof C0784m) {
                C0784m c0784m = (C0784m) mo1826g;
                c0784m.m1822c("handleLifecycleEvent");
                c0784m.m1819f(enumC0777f.m1829a());
            }
        }
    }

    /* renamed from: c */
    public static void m1803c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0791t.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0792u(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void m1804b(EnumC0777f enumC0777f) {
        if (Build.VERSION.SDK_INT < 29) {
            m1805a(getActivity(), enumC0777f);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1804b(EnumC0777f.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m1804b(EnumC0777f.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m1804b(EnumC0777f.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m1804b(EnumC0777f.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m1804b(EnumC0777f.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m1804b(EnumC0777f.ON_STOP);
    }
}