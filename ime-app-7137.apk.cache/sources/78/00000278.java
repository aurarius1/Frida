package p010b.p046j.p048e.p049b;

import java.util.List;

/* renamed from: b.j.e.b.f */
/* loaded from: classes.dex */
public final class C0500f {

    /* renamed from: a */
    public final int[] f2531a;

    /* renamed from: b */
    public final float[] f2532b;

    public C0500f(int i, int i2) {
        this.f2531a = new int[]{i, i2};
        this.f2532b = new float[]{0.0f, 1.0f};
    }

    public C0500f(int i, int i2, int i3) {
        this.f2531a = new int[]{i, i2, i3};
        this.f2532b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0500f(List list, List list2) {
        int size = list.size();
        this.f2531a = new int[size];
        this.f2532b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f2531a[i] = ((Integer) list.get(i)).intValue();
            this.f2532b[i] = ((Float) list2.get(i)).floatValue();
        }
    }
}