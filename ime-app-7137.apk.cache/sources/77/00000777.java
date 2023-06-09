package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;

/* renamed from: c.d.a.a.a */
/* loaded from: classes.dex */
public final class C1779a implements InterfaceC1784f {

    /* renamed from: a */
    public static final C1779a f5451a = new C1779a();

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: a */
    public void mo806a(String str, Object obj, SharedPreferences.Editor editor) {
        editor.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: b */
    public Object mo805b(String str, SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
    }
}