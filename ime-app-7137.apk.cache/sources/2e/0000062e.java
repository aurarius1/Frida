package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Vibrator;
import android.view.GestureDetector;
import android.view.inputmethod.InputMethodSubtype;
import p093c.p097b.p122u.AbstractC1531x;
import p093c.p097b.p122u.C1469e0;
import p093c.p097b.p130z.p132r0.GestureDetector$OnGestureListenerC1724h0;

@TargetApi(15)
/* renamed from: c.b.t.g */
/* loaded from: classes.dex */
public class C1450g {
    /* renamed from: a */
    public C1448e mo1024a(Context context) {
        return new C1448e(context);
    }

    /* renamed from: b */
    public ContentObserver mo1028b(AbstractC1531x abstractC1531x) {
        return new C1469e0(abstractC1531x);
    }

    /* renamed from: c */
    public GestureDetector mo1027c(Context context, GestureDetector$OnGestureListenerC1724h0 gestureDetector$OnGestureListenerC1724h0) {
        return new C1447d(context, gestureDetector$OnGestureListenerC1724h0);
    }

    /* renamed from: d */
    public C1457n mo1023d(Vibrator vibrator) {
        return new C1457n(vibrator);
    }

    /* renamed from: e */
    public InputMethodSubtype mo1026e(String str, CharSequence charSequence) {
        return new InputMethodSubtype(0, 0, str, "", charSequence.toString(), false, false);
    }

    /* renamed from: f */
    public String mo1022f() {
        return "DeviceSpecificV15";
    }
}