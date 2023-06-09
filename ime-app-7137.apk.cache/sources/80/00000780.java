package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;
import p183e.p184a.InterfaceC2095c;
import p183e.p184a.InterfaceC2096d;
import p183e.p184a.p190p.p195e.p196a.C2195l;

/* renamed from: c.d.a.a.j */
/* loaded from: classes.dex */
public class C1788j implements InterfaceC2096d {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f5463a;

    public C1788j(C1789k c1789k, SharedPreferences sharedPreferences) {
        this.f5463a = sharedPreferences;
    }

    @Override // p183e.p184a.InterfaceC2096d
    /* renamed from: a */
    public void mo138a(InterfaceC2095c interfaceC2095c) {
        SharedPreferences$OnSharedPreferenceChangeListenerC1786h sharedPreferences$OnSharedPreferenceChangeListenerC1786h = new SharedPreferences$OnSharedPreferenceChangeListenerC1786h(this, interfaceC2095c);
        ((C2195l) interfaceC2095c).m91d(new C1787i(this, sharedPreferences$OnSharedPreferenceChangeListenerC1786h));
        this.f5463a.registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListenerC1786h);
    }
}