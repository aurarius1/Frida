package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;
import p183e.p184a.InterfaceC2095c;
import p183e.p184a.p190p.p195e.p196a.C2195l;

/* renamed from: c.d.a.a.h */
/* loaded from: classes.dex */
public class SharedPreferences$OnSharedPreferenceChangeListenerC1786h implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2095c f5460a;

    public SharedPreferences$OnSharedPreferenceChangeListenerC1786h(C1788j c1788j, InterfaceC2095c interfaceC2095c) {
        this.f5460a = interfaceC2095c;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ((C2195l) this.f5460a).m92c(str);
    }
}