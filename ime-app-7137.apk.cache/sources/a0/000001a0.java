package p010b.p016c.p026q;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0571c;
import p010b.p046j.p058l.C0574d;
import p010b.p046j.p058l.p060e1.C0595g;

/* renamed from: b.c.q.n0 */
/* loaded from: classes.dex */
public class C0284n0 {

    /* renamed from: a */
    public final /* synthetic */ View f1668a;

    public C0284n0(View view) {
        this.f1668a = view;
    }

    /* renamed from: a */
    public boolean m2788a(C0595g c0595g, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c0595g.f2716a.mo2295a();
                InputContentInfo inputContentInfo = (InputContentInfo) c0595g.f2716a.mo2292d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        C0571c c0571c = new C0571c(new ClipData(c0595g.m2289b(), new ClipData.Item(c0595g.m2290a())), 2);
        c0571c.f2669d = c0595g.f2716a.mo2294b();
        c0571c.f2670e = bundle;
        return AbstractC0605j0.m2278E(this.f1668a, new C0574d(c0571c)) == null;
    }
}