package p010b.p083u.p084e;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

@SuppressLint({"VisibleForTests"})
/* renamed from: b.u.e.v */
/* loaded from: classes.dex */
public class C0998v {

    /* renamed from: a */
    public int f3861a;

    /* renamed from: b */
    public int f3862b;

    /* renamed from: c */
    public int[] f3863c;

    /* renamed from: d */
    public int f3864d;

    /* renamed from: a */
    public void m1449a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f3864d * 2;
        int[] iArr = this.f3863c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3863c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i3 >= iArr.length) {
            int[] iArr3 = new int[i3 * 2];
            this.f3863c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3863c;
        iArr4[i3] = i;
        iArr4[i3 + 1] = i2;
        this.f3864d++;
    }

    /* renamed from: b */
    public void m1448b(RecyclerView recyclerView, boolean z) {
        this.f3864d = 0;
        int[] iArr = this.f3863c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0980q1 abstractC0980q1 = recyclerView.f777w;
        if (recyclerView.f775v == null || abstractC0980q1 == null || !abstractC0980q1.f3782k) {
            return;
        }
        if (z) {
            if (!recyclerView.f759n.m1725g()) {
                abstractC0980q1.mo1522k(recyclerView.f775v.mo543a(), this);
            }
        } else if (!recyclerView.m3187M()) {
            abstractC0980q1.mo1524j(this.f3861a, this.f3862b, recyclerView.f770s0, this);
        }
        int i = this.f3864d;
        if (i > abstractC0980q1.f3783l) {
            abstractC0980q1.f3783l = i;
            abstractC0980q1.f3784m = z;
            recyclerView.f755l.m1395m();
        }
    }

    /* renamed from: c */
    public boolean m1447c(int i) {
        if (this.f3863c != null) {
            int i2 = this.f3864d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (this.f3863c[i3] == i) {
                    return true;
                }
            }
        }
        return false;
    }
}