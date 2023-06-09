package p010b.p046j.p058l.p060e1;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p010b.p016c.p026q.C0284n0;

/* renamed from: b.j.l.e1.b */
/* loaded from: classes.dex */
public class C0590b extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0284n0 f2710a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0590b(InputConnection inputConnection, boolean z, C0284n0 c0284n0) {
        super(inputConnection, z);
        this.f2710a = c0284n0;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C0284n0 c0284n0 = this.f2710a;
        C0595g c0595g = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0595g = new C0595g(new C0592d(inputContentInfo));
        }
        if (c0284n0.m2788a(c0595g, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}