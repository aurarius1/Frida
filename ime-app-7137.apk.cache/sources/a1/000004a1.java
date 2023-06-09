package p010b.p086w;

import android.os.IBinder;

/* renamed from: b.w.k1 */
/* loaded from: classes.dex */
public class C1053k1 implements InterfaceC1059m1 {

    /* renamed from: a */
    public final IBinder f3988a;

    public C1053k1(IBinder iBinder) {
        this.f3988a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1053k1) && ((C1053k1) obj).f3988a.equals(this.f3988a);
    }

    public int hashCode() {
        return this.f3988a.hashCode();
    }
}