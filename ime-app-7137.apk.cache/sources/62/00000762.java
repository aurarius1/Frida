package p093c.p097b.p130z.p132r0;

import java.util.Arrays;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.y0 */
/* loaded from: classes.dex */
public class C1758y0 extends KeyDetector {

    /* renamed from: i */
    public int[] f5402i = new int[36];

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r3 >= r0.f5338g) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r16 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r11.m898b(0, r2.mo838h()) <= 32) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        r0 = r11.f5218a.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r3 >= r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
        r7 = r3;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r22 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r4 >= r8.length) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r8[r4] <= r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
        r15 = r4 + r0;
        r16 = r5;
        java.lang.System.arraycopy(r8, r4, r8, r15, (r8.length - r4) - r0);
        java.lang.System.arraycopy(r22, r4, r22, r15, (r22.length - r4) - r0);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
        if (r5 >= r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
        r22[r4 + r5] = r11.m898b(r5, r2.mo838h());
        r5 = r5 + 1;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        java.util.Arrays.fill(r8, r4, r15, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
        r12 = r12 + 1;
        r0 = r19;
        r5 = r16;
        r4 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // p093c.p097b.p130z.p132r0.KeyDetector
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo842a(int i, int i2, int[] iArr) {
        int[] iArr2;
        int length;
        int i3;
        Key[] keyArr;
        int i4;
        C1758y0 c1758y0 = this;
        AbstractC1762t abstractC1762t = c1758y0.f5332a;
        if (abstractC1762t == null) {
            return 0;
        }
        Key[] keyArr2 = c1758y0.f5334c;
        int i5 = i + c1758y0.f5335d;
        int i6 = i2 + c1758y0.f5336e;
        int i7 = c1758y0.f5338g + 1;
        int[] iArr3 = c1758y0.f5402i;
        Arrays.fill(iArr3, Integer.MAX_VALUE);
        if (abstractC1762t.f5153w == null) {
            abstractC1762t.m927a();
        }
        if (i5 >= 0 && i5 < abstractC1762t.mo831g() && i6 >= 0 && i6 < abstractC1762t.mo839e()) {
            int i8 = (i5 / abstractC1762t.f5151u) + ((i6 / abstractC1762t.f5152v) * 10);
            if (i8 < 50) {
                iArr2 = abstractC1762t.f5153w[i8];
                length = iArr2.length;
                i3 = 0;
                int i9 = -1;
                int i10 = -1;
                while (i3 < length) {
                    int i11 = iArr2[i3];
                    Key key = keyArr2[i11];
                    boolean m895f = key.m895f(i5, i6);
                    if (m895f) {
                        i9 = i11;
                    }
                    if (c1758y0.f5337f) {
                        i4 = key.m893h(i5, i6);
                        keyArr = keyArr2;
                    } else {
                        keyArr = keyArr2;
                        i4 = 0;
                    }
                }
                return i9 != -1 ? i10 : i9;
            }
        }
        iArr2 = new int[0];
        length = iArr2.length;
        i3 = 0;
        int i92 = -1;
        int i102 = -1;
        while (i3 < length) {
        }
        if (i92 != -1) {
        }
    }

    @Override // p093c.p097b.p130z.p132r0.KeyDetector
    /* renamed from: b */
    public int mo841b() {
        return 36;
    }
}