package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010b.p036g.C0378b;
import p010b.p077q.AbstractC0830p;
import p010b.p077q.C0819i;
import p010b.p077q.C0823k;
import p010b.p077q.C0827m;
import p010b.p077q.C0828n;
import p010b.p077q.C0829o;
import p010b.p077q.HandlerC0806b0;
import p010b.p077q.InterfaceC0815g;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: b */
    public static final boolean f567b = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: c */
    public InterfaceC0815g f568c;

    /* renamed from: d */
    public final C0378b f569d = new C0378b();

    /* renamed from: e */
    public final HandlerC0806b0 f570e = new HandlerC0806b0(this);

    /* renamed from: a */
    public void m3310a(AbstractC0830p abstractC0830p) {
        if (abstractC0830p.f3351b || abstractC0830p.f3352c) {
            StringBuilder m1187i = AbstractC1124a.m1187i("sendError() called when either sendResult() or sendError() had already been called for: ");
            m1187i.append(abstractC0830p.f3350a);
            throw new IllegalStateException(m1187i.toString());
        }
        abstractC0830p.f3352c = true;
        abstractC0830p.mo1787b(null);
    }

    /* renamed from: b */
    public abstract void m3309b(String str, int i, Bundle bundle);

    /* renamed from: c */
    public abstract void m3308c(String str, AbstractC0830p abstractC0830p);

    /* renamed from: d */
    public void m3307d(String str, AbstractC0830p abstractC0830p) {
        abstractC0830p.f3353d = 1;
        m3308c(str, abstractC0830p);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public void m3306e(AbstractC0830p abstractC0830p) {
        abstractC0830p.f3353d = 2;
        abstractC0830p.m1785d(null);
    }

    /* renamed from: f */
    public void m3305f(AbstractC0830p abstractC0830p) {
        abstractC0830p.f3353d = 4;
        abstractC0830p.m1785d(null);
    }

    /* renamed from: g */
    public void m3304g() {
    }

    /* renamed from: h */
    public void m3303h() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f568c.mo1789b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        InterfaceC0815g c0828n = i >= 28 ? new C0828n(this) : i >= 26 ? new C0827m(this) : i >= 23 ? new C0823k(this) : i >= 21 ? new C0819i(this) : new C0829o(this);
        this.f568c = c0828n;
        c0828n.mo1790a();
    }
}