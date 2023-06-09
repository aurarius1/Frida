package p010b.p077q.p078l0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;
import android.support.p007v4.media.session.MediaSessionCompat$Token;
import android.view.KeyEvent;
import java.util.HashSet;
import p000a.p001a.p002a.p004b.C0004b;
import p000a.p001a.p002a.p004b.C0006d;
import p000a.p001a.p002a.p004b.C0019q;
import p000a.p001a.p002a.p004b.C0020r;
import p000a.p001a.p002a.p004b.p005x.C0033h;
import p000a.p001a.p002a.p004b.p005x.C0034i;
import p000a.p001a.p002a.p004b.p005x.C0035j;
import p000a.p001a.p002a.p004b.p005x.C0036k;
import p000a.p001a.p002a.p004b.p005x.InterfaceC0031f;

/* renamed from: b.q.l0.a */
/* loaded from: classes.dex */
public class C0826a {

    /* renamed from: a */
    public final Object f3341a;

    /* renamed from: b */
    public C0006d f3342b;

    /* renamed from: c */
    public final Context f3343c;

    /* renamed from: d */
    public final Intent f3344d;

    /* renamed from: e */
    public final BroadcastReceiver.PendingResult f3345e;

    /* renamed from: f */
    public C0019q f3346f;

    public C0826a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3341a = new C0020r(new C0004b(this));
        } else {
            this.f3341a = null;
        }
        this.f3343c = context;
        this.f3344d = intent;
        this.f3345e = pendingResult;
    }

    /* renamed from: a */
    public final void m1792a() {
        this.f3346f.f36b.mo3544c();
        this.f3345e.finish();
    }

    /* renamed from: b */
    public void m1791b() {
        Context context;
        MediaSessionCompat$Token mo3545b;
        try {
            context = this.f3343c;
            mo3545b = this.f3346f.f36b.mo3545b();
            new HashSet();
        } catch (RemoteException unused) {
        }
        if (mo3545b != null) {
            int i = Build.VERSION.SDK_INT;
            InterfaceC0031f c0035j = i >= 24 ? new C0035j(context, mo3545b) : i >= 23 ? new C0034i(context, mo3545b) : i >= 21 ? new C0033h(context, mo3545b) : new C0036k(mo3545b);
            KeyEvent keyEvent = (KeyEvent) this.f3344d.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            c0035j.mo3457a(keyEvent);
            m1792a();
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}