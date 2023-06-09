package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.view.inputmethod.InputMethodSubtype;

@TargetApi(24)
/* renamed from: c.b.t.j */
/* loaded from: classes.dex */
public class C1453j extends C1452i {
    @Override // p093c.p097b.p121t.C1452i, p093c.p097b.p121t.C1451h, p093c.p097b.p121t.C1450g
    /* renamed from: f */
    public String mo1022f() {
        return "DeviceSpecificV24";
    }

    @Override // p093c.p097b.p121t.C1452i
    /* renamed from: g */
    public InputMethodSubtype.InputMethodSubtypeBuilder mo1025g(String str, CharSequence charSequence) {
        return super.mo1025g(str, charSequence).setLanguageTag(str);
    }
}