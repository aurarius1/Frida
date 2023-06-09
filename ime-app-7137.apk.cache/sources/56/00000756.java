package p093c.p097b.p130z.p132r0;

import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.s0 */
/* loaded from: classes.dex */
public class C1746s0 extends KeyDetector {

    /* renamed from: i */
    public final int f5368i;

    /* renamed from: j */
    public final int f5369j;

    public C1746s0(float f) {
        int i = (int) (f * f);
        this.f5368i = i;
        this.f5369j = i * 2;
    }

    @Override // p093c.p097b.p130z.p132r0.KeyDetector
    /* renamed from: a */
    public int mo842a(int i, int i2, int[] iArr) {
        Key[] keyArr = this.f5334c;
        int i3 = i + this.f5335d;
        int i4 = this.f5336e + i2;
        int i5 = i2 < 0 ? this.f5369j : this.f5368i;
        int length = keyArr.length;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            int m893h = keyArr[i7].m893h(i3, i4);
            if (m893h < i5) {
                i6 = i7;
                i5 = m893h;
            }
        }
        if (iArr != null && i6 != -1) {
            Key key = keyArr[i6];
            iArr[0] = key.m898b(0, isKeyShifted(key));
        }
        return i6;
    }

    @Override // p093c.p097b.p130z.p132r0.KeyDetector
    /* renamed from: b */
    public int mo841b() {
        return 1;
    }

    @Override // p093c.p097b.p130z.p132r0.KeyDetector
    /* renamed from: c */
    public boolean isKeyShifted(Key key) {
        AbstractC1762t abstractC1762t = this.f5332a;
        return abstractC1762t != null && abstractC1762t.mo838h();
    }
}