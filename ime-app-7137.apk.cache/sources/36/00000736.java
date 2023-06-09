package p093c.p097b.p130z.p132r0;

import android.text.TextUtils;

/* renamed from: c.b.z.r0.c0 */
/* loaded from: classes.dex */
public class C1714c0 {

    /* renamed from: a */
    public final CharSequence f5298a;

    /* renamed from: b */
    public final int f5299b;

    public C1714c0(CharSequence charSequence, int i, AbstractC1759z abstractC1759z) {
        this.f5298a = charSequence;
        this.f5299b = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1714c0) {
            C1714c0 c1714c0 = (C1714c0) obj;
            if (c1714c0.f5299b == this.f5299b && TextUtils.equals(c1714c0.f5298a, this.f5298a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f5298a.hashCode() + this.f5299b;
    }
}