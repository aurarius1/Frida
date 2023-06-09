package p093c.p145g.p146a.p147a.p153f0;

import android.graphics.Paint;
import android.graphics.Path;
import p010b.p046j.p050f.AbstractC0506a;

/* renamed from: c.g.a.a.f0.a */
/* loaded from: classes.dex */
public class C1841a {

    /* renamed from: a */
    public static final int[] f5617a = new int[3];

    /* renamed from: b */
    public static final float[] f5618b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c */
    public static final int[] f5619c = new int[4];

    /* renamed from: d */
    public static final float[] f5620d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: f */
    public final Paint f5622f;

    /* renamed from: g */
    public final Paint f5623g;

    /* renamed from: h */
    public int f5624h;

    /* renamed from: i */
    public int f5625i;

    /* renamed from: j */
    public int f5626j;

    /* renamed from: k */
    public final Path f5627k = new Path();

    /* renamed from: l */
    public Paint f5628l = new Paint();

    /* renamed from: e */
    public final Paint f5621e = new Paint();

    public C1841a() {
        m752a(-16777216);
        this.f5628l.setColor(0);
        Paint paint = new Paint(4);
        this.f5622f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5623g = new Paint(paint);
    }

    /* renamed from: a */
    public void m752a(int i) {
        this.f5624h = AbstractC0506a.m2386h(i, 68);
        this.f5625i = AbstractC0506a.m2386h(i, 20);
        this.f5626j = AbstractC0506a.m2386h(i, 0);
        this.f5621e.setColor(this.f5624h);
    }
}