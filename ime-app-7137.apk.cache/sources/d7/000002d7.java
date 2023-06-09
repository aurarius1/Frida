package p010b.p046j.p058l.p060e1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* renamed from: b.j.l.e1.g */
/* loaded from: classes.dex */
public final class C0595g {

    /* renamed from: a */
    public final InterfaceC0594f f2716a;

    public C0595g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2716a = Build.VERSION.SDK_INT >= 25 ? new C0592d(uri, clipDescription, uri2) : new C0593e(uri, clipDescription, uri2);
    }

    public C0595g(InterfaceC0594f interfaceC0594f) {
        this.f2716a = interfaceC0594f;
    }

    /* renamed from: a */
    public Uri m2290a() {
        return this.f2716a.mo2291e();
    }

    /* renamed from: b */
    public ClipDescription m2289b() {
        return this.f2716a.mo2293c();
    }
}