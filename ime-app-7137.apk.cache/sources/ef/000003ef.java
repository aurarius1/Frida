package p010b.p082t;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* renamed from: b.t.i0 */
/* loaded from: classes.dex */
public class C0875i0 {

    /* renamed from: a */
    public Context f3468a;

    /* renamed from: b */
    public long f3469b = 0;

    /* renamed from: c */
    public SharedPreferences f3470c = null;

    /* renamed from: d */
    public SharedPreferences.Editor f3471d;

    /* renamed from: e */
    public boolean f3472e;

    /* renamed from: f */
    public String f3473f;

    /* renamed from: g */
    public PreferenceScreen f3474g;

    /* renamed from: h */
    public InterfaceC0873h0 f3475h;

    /* renamed from: i */
    public InterfaceC0869f0 f3476i;

    /* renamed from: j */
    public InterfaceC0871g0 f3477j;

    public C0875i0(Context context) {
        this.f3468a = context;
        this.f3473f = context.getPackageName() + "_preferences";
    }

    /* renamed from: a */
    public static SharedPreferences m1746a(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    /* renamed from: b */
    public SharedPreferences.Editor m1745b() {
        if (this.f3472e) {
            if (this.f3471d == null) {
                this.f3471d = m1744c().edit();
            }
            return this.f3471d;
        }
        return m1744c().edit();
    }

    /* renamed from: c */
    public SharedPreferences m1744c() {
        if (this.f3470c == null) {
            this.f3470c = this.f3468a.getSharedPreferences(this.f3473f, 0);
        }
        return this.f3470c;
    }
}