package p210g.p211a.p212a;

import android.os.Bundle;

/* renamed from: g.a.a.i */
/* loaded from: classes.dex */
public class C2310i {

    /* renamed from: a */
    public String f7463a;

    /* renamed from: b */
    public String f7464b;

    /* renamed from: c */
    public int f7465c;

    /* renamed from: d */
    public int f7466d;

    /* renamed from: e */
    public String f7467e;

    /* renamed from: f */
    public String[] f7468f;

    public C2310i(Bundle bundle) {
        this.f7463a = bundle.getString("positiveButton");
        this.f7464b = bundle.getString("negativeButton");
        this.f7467e = bundle.getString("rationaleMsg");
        this.f7465c = bundle.getInt("theme");
        this.f7466d = bundle.getInt("requestCode");
        this.f7468f = bundle.getStringArray("permissions");
    }
}