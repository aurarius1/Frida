package p010b.p046j.p058l.p059d1;

import android.os.Build;
import android.os.Bundle;

/* renamed from: b.j.l.d1.i */
/* loaded from: classes.dex */
public class C0584i {

    /* renamed from: a */
    public final Object f2707a;

    public C0584i() {
        int i = Build.VERSION.SDK_INT;
        this.f2707a = i >= 26 ? new C0583h(this) : i >= 19 ? new C0582g(this) : i >= 16 ? new C0581f(this) : null;
    }

    public C0584i(Object obj) {
        this.f2707a = obj;
    }

    /* renamed from: a */
    public C0580e mo2155a(int i) {
        return null;
    }

    /* renamed from: b */
    public C0580e mo2154b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo2153c(int i, int i2, Bundle bundle) {
        return false;
    }
}