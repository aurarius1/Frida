package p010b.p086w;

import android.view.View;
import android.view.WindowId;

/* renamed from: b.w.l1 */
/* loaded from: classes.dex */
public class C1056l1 implements InterfaceC1059m1 {

    /* renamed from: a */
    public final WindowId f3999a;

    public C1056l1(View view) {
        this.f3999a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1056l1) && ((C1056l1) obj).f3999a.equals(this.f3999a);
    }

    public int hashCode() {
        return this.f3999a.hashCode();
    }
}