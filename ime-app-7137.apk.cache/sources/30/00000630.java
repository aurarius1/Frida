package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.GestureDetector;
import android.view.inputmethod.InputMethodSubtype;
import p093c.p097b.p130z.p132r0.GestureDetector$OnGestureListenerC1724h0;

@TargetApi(19)
/* renamed from: c.b.t.i */
/* loaded from: classes.dex */
public class C1452i extends C1451h {
    @Override // p093c.p097b.p121t.C1450g
    /* renamed from: c */
    public GestureDetector mo1027c(Context context, GestureDetector$OnGestureListenerC1724h0 gestureDetector$OnGestureListenerC1724h0) {
        return new C1445b(context, gestureDetector$OnGestureListenerC1724h0);
    }

    @Override // p093c.p097b.p121t.C1450g
    /* renamed from: e */
    public InputMethodSubtype mo1026e(String str, CharSequence charSequence) {
        return mo1025g(str, charSequence).build();
    }

    @Override // p093c.p097b.p121t.C1451h, p093c.p097b.p121t.C1450g
    /* renamed from: f */
    public String mo1022f() {
        return "DeviceSpecificV19";
    }

    /* renamed from: g */
    public InputMethodSubtype.InputMethodSubtypeBuilder mo1025g(String str, CharSequence charSequence) {
        InputMethodSubtype.InputMethodSubtypeBuilder subtypeNameResId = new InputMethodSubtype.InputMethodSubtypeBuilder().setSubtypeNameResId(0);
        long j = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            j = (j * 31) + charSequence.charAt(i);
        }
        return subtypeNameResId.setSubtypeId((int) (j ^ (j >>> 32))).setIsAsciiCapable(true).setSubtypeLocale(str).setSubtypeMode("keyboard").setSubtypeExtraValue(charSequence.toString());
    }
}