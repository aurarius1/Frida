package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;
import p183e.p184a.p189o.InterfaceC2122d;

/* renamed from: c.d.a.a.i */
/* loaded from: classes.dex */
public class C1787i implements InterfaceC2122d {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f5461a;

    /* renamed from: b */
    public final /* synthetic */ C1788j f5462b;

    public C1787i(C1788j c1788j, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5462b = c1788j;
        this.f5461a = onSharedPreferenceChangeListener;
    }

    @Override // p183e.p184a.p189o.InterfaceC2122d
    public void cancel() {
        this.f5462b.f5463a.unregisterOnSharedPreferenceChangeListener(this.f5461a);
    }
}