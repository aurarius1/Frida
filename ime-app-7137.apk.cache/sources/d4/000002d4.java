package p010b.p046j.p058l.p060e1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: b.j.l.e1.d */
/* loaded from: classes.dex */
public final class C0592d implements InterfaceC0594f {

    /* renamed from: a */
    public final InputContentInfo f2712a;

    public C0592d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2712a = new InputContentInfo(uri, clipDescription, uri2);
    }

    public C0592d(Object obj) {
        this.f2712a = (InputContentInfo) obj;
    }

    @Override // p010b.p046j.p058l.p060e1.InterfaceC0594f
    /* renamed from: a */
    public void mo2295a() {
        this.f2712a.requestPermission();
    }

    @Override // p010b.p046j.p058l.p060e1.InterfaceC0594f
    /* renamed from: b */
    public Uri mo2294b() {
        return this.f2712a.getLinkUri();
    }

    @Override // p010b.p046j.p058l.p060e1.InterfaceC0594f
    /* renamed from: c */
    public ClipDescription mo2293c() {
        return this.f2712a.getDescription();
    }

    @Override // p010b.p046j.p058l.p060e1.InterfaceC0594f
    /* renamed from: d */
    public Object mo2292d() {
        return this.f2712a;
    }

    @Override // p010b.p046j.p058l.p060e1.InterfaceC0594f
    /* renamed from: e */
    public Uri mo2291e() {
        return this.f2712a.getContentUri();
    }
}