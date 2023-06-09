package p093c.p137d.p138a.p139a;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Set;

@TargetApi(11)
/* renamed from: c.d.a.a.m */
/* loaded from: classes.dex */
public final class C1791m implements InterfaceC1784f {

    /* renamed from: a */
    public static final C1791m f5467a = new C1791m();

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: a */
    public void mo806a(String str, Object obj, SharedPreferences.Editor editor) {
        editor.putStringSet(str, (Set) obj);
    }

    @Override // p093c.p137d.p138a.p139a.InterfaceC1784f
    /* renamed from: b */
    public Object mo805b(String str, SharedPreferences sharedPreferences) {
        return Collections.unmodifiableSet(sharedPreferences.getStringSet(str, null));
    }
}