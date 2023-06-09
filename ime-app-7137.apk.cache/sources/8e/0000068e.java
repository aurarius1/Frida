package p093c.p097b.p127w;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import p093c.p097b.p130z.p132r0.C1755x;

/* renamed from: c.b.w.l */
/* loaded from: classes.dex */
public class C1546l {

    /* renamed from: a */
    public final C1755x f4958a;

    /* renamed from: b */
    public C1545k f4959b;

    /* renamed from: c */
    public final List f4960c = new ArrayList();

    /* renamed from: d */
    public final float f4961d;

    /* renamed from: e */
    public final Paint f4962e;

    public C1546l(C1755x c1755x, Paint paint) {
        this.f4962e = paint;
        this.f4958a = c1755x;
        float strokeWidth = paint.getStrokeWidth();
        this.f4961d = strokeWidth;
        this.f4959b = new C1545k(strokeWidth);
    }

    /* renamed from: a */
    public final boolean m943a(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3) > 1.0f || Math.abs(f2 - f4) > 1.0f;
    }
}