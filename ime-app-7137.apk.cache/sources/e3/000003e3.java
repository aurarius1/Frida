package p010b.p082t;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: b.t.c0 */
/* loaded from: classes.dex */
public class C0863c0 {

    /* renamed from: a */
    public int f3448a;

    /* renamed from: b */
    public int f3449b;

    /* renamed from: c */
    public String f3450c;

    public C0863c0(Preference preference) {
        this.f3450c = preference.getClass().getName();
        this.f3448a = preference.f600G;
        this.f3449b = preference.f601H;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0863c0) {
            C0863c0 c0863c0 = (C0863c0) obj;
            return this.f3448a == c0863c0.f3448a && this.f3449b == c0863c0.f3449b && TextUtils.equals(this.f3450c, c0863c0.f3450c);
        }
        return false;
    }

    public int hashCode() {
        return this.f3450c.hashCode() + ((((527 + this.f3448a) * 31) + this.f3449b) * 31);
    }
}