package p093c.p137d.p138a.p139a;

import android.content.SharedPreferences;

/* renamed from: c.d.a.a.b */
/* loaded from: classes.dex */
public final class C1780b implements InterfaceC1784f {

    /* renamed from: a */
    public static final C1780b f5452a = new C1780b();

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: a */
    public void mo806a(String str, Object obj, SharedPreferences.Editor editor) {
        editor.putInt(str, ((Integer) obj).intValue());
    }

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: b */
    public Object mo805b(String str, SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(str, 0));
    }
}