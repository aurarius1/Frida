package p010b.p046j.p058l;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;

/* renamed from: b.j.l.j */
/* loaded from: classes.dex */
public final class C0604j {

    /* renamed from: a */
    public final InterfaceC0596f f2747a;

    public C0604j(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f2747a = Build.VERSION.SDK_INT > 17 ? new C0602i(context, onGestureListener, null) : new C0600h(context, onGestureListener, null);
    }
}