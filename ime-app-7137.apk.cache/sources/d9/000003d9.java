package p010b.p080s.p081a;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p010b.p046j.p050f.AbstractC0506a;

/* renamed from: b.s.a.c */
/* loaded from: classes.dex */
public final class C0853c {

    /* renamed from: a */
    public static final Comparator f3418a = new C0851a();

    /* renamed from: b */
    public final int[] f3419b;

    /* renamed from: c */
    public final int[] f3420c;

    /* renamed from: d */
    public final List f3421d;

    /* renamed from: e */
    public final C0854d[] f3422e;

    /* renamed from: f */
    public final float[] f3423f = new float[3];

    public C0853c(int[] iArr, int i, C0854d[] c0854dArr) {
        C0852b c0852b;
        int i2;
        this.f3422e = c0854dArr;
        int[] iArr2 = new int[32768];
        this.f3420c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int m1765c = m1765c(Color.blue(i4), 8, 5) | (m1765c(Color.red(i4), 8, 5) << 10) | (m1765c(Color.green(i4), 8, 5) << 5);
            iArr[i3] = m1765c;
            iArr2[m1765c] = iArr2[m1765c] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int m1767a = m1767a((i6 >> 10) & 31, (i6 >> 5) & 31, i6 & 31);
                float[] fArr = this.f3423f;
                ThreadLocal threadLocal = AbstractC0506a.f2540a;
                AbstractC0506a.m2393a(Color.red(m1767a), Color.green(m1767a), Color.blue(m1767a), fArr);
                if (m1764d(m1767a, this.f3423f)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.f3419b = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i) {
            this.f3421d = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                this.f3421d.add(new C0855e(m1767a((i10 >> 10) & 31, (i10 >> 5) & 31, i10 & 31), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f3418a);
        priorityQueue.offer(new C0852b(this, 0, this.f3419b.length - 1));
        while (priorityQueue.size() < i && (c0852b = (C0852b) priorityQueue.poll()) != null) {
            int i11 = c0852b.f3409b;
            int i12 = c0852b.f3408a;
            int i13 = (i11 + 1) - i12;
            if (!(i13 > 1)) {
                break;
            }
            if (i13 > 1) {
                int i14 = c0852b.f3412e - c0852b.f3411d;
                int i15 = c0852b.f3414g - c0852b.f3413f;
                int i16 = c0852b.f3416i - c0852b.f3415h;
                int i17 = (i14 < i15 || i14 < i16) ? (i15 < i14 || i15 < i16) ? -1 : -2 : -3;
                C0853c c0853c = c0852b.f3417j;
                int[] iArr4 = c0853c.f3419b;
                int[] iArr5 = c0853c.f3420c;
                m1766b(iArr4, i17, i12, i11);
                Arrays.sort(iArr4, c0852b.f3408a, c0852b.f3409b + 1);
                m1766b(iArr4, i17, c0852b.f3408a, c0852b.f3409b);
                int i18 = c0852b.f3410c / 2;
                int i19 = c0852b.f3408a;
                int i20 = 0;
                while (true) {
                    int i21 = c0852b.f3409b;
                    if (i19 > i21) {
                        i2 = c0852b.f3408a;
                        break;
                    }
                    i20 += iArr5[iArr4[i19]];
                    if (i20 >= i18) {
                        i2 = Math.min(i21 - 1, i19);
                        break;
                    }
                    i19++;
                }
                C0852b c0852b2 = new C0852b(c0852b.f3417j, i2 + 1, c0852b.f3409b);
                c0852b.f3409b = i2;
                c0852b.m1769a();
                priorityQueue.offer(c0852b2);
                priorityQueue.offer(c0852b);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C0852b c0852b3 = (C0852b) it.next();
            C0853c c0853c2 = c0852b3.f3417j;
            int[] iArr6 = c0853c2.f3419b;
            int[] iArr7 = c0853c2.f3420c;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = c0852b3.f3408a; i26 <= c0852b3.f3409b; i26++) {
                int i27 = iArr6[i26];
                int i28 = iArr7[i27];
                i23 += i28;
                i22 += ((i27 >> 10) & 31) * i28;
                i24 += ((i27 >> 5) & 31) * i28;
                i25 += i28 * (i27 & 31);
            }
            float f = i23;
            C0855e c0855e = new C0855e(m1767a(Math.round(i22 / f), Math.round(i24 / f), Math.round(i25 / f)), i23);
            if (!m1764d(c0855e.f3427d, c0855e.m1762b())) {
                arrayList.add(c0855e);
            }
        }
        this.f3421d = arrayList;
    }

    /* renamed from: a */
    public static int m1767a(int i, int i2, int i3) {
        return Color.rgb(m1765c(i, 5, 8), m1765c(i2, 5, 8), m1765c(i3, 5, 8));
    }

    /* renamed from: b */
    public static void m1766b(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i != -1) {
        } else {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static int m1765c(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[LOOP:0: B:7:0x000a->B:31:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1764d(int i, float[] fArr) {
        boolean z;
        C0854d[] c0854dArr = this.f3422e;
        if (c0854dArr != null && c0854dArr.length > 0) {
            int length = c0854dArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f3422e[i2].getClass();
                if (!(fArr[2] >= 0.95f)) {
                    if (!(fArr[2] <= 0.05f)) {
                        if (!(fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f)) {
                            z = true;
                            if (z) {
                                return true;
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
        return false;
    }
}