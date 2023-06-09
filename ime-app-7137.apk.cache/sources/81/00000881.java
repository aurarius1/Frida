package p093c.p145g.p146a.p147a.p173y;

import android.content.Context;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;

/* renamed from: c.g.a.a.y.a */
/* loaded from: classes.dex */
public class C2045a {

    /* renamed from: a */
    public final boolean f6219a;

    /* renamed from: b */
    public final int f6220b;

    /* renamed from: c */
    public final int f6221c;

    /* renamed from: d */
    public final float f6222d;

    public C2045a(Context context) {
        this.f6219a = AbstractC1077v0.m1284T(context, AbstractC1804b.elevationOverlayEnabled, false);
        this.f6220b = AbstractC1077v0.m1264o(context, AbstractC1804b.elevationOverlayColor, 0);
        this.f6221c = AbstractC1077v0.m1264o(context, AbstractC1804b.colorSurface, 0);
        this.f6222d = context.getResources().getDisplayMetrics().density;
    }
}