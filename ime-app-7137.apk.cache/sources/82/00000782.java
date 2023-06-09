package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;

/* renamed from: c.d.a.a.l */
/* loaded from: classes.dex */
public final class C1790l implements InterfaceC1784f {

    /* renamed from: a */
    public static final C1790l f5466a = new C1790l();

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: a */
    public void mo806a(String str, Object obj, SharedPreferences.Editor editor) {
        editor.putString(str, (String) obj);
    }

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: b */
    public Object mo805b(String str, SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(str, null);
    }
}