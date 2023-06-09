package p093c.p097b.p122u;

import android.text.TextUtils;
import java.util.List;

/* renamed from: c.b.u.m0 */
/* loaded from: classes.dex */
public class C1485m0 implements InterfaceC1532y {

    /* renamed from: a */
    public final /* synthetic */ C1487n0 f4783a;

    public C1485m0(C1487n0 c1487n0, AbstractC1483l0 abstractC1483l0) {
        this.f4783a = c1487n0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    @Override // p093c.p097b.p122u.InterfaceC1532y
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo955a(char[] cArr, int i, int i2, int i3, AbstractC1533z abstractC1533z) {
        boolean z;
        int i4;
        C1487n0 c1487n0;
        List list;
        C1487n0 c1487n02 = this.f4783a;
        int[] iArr = c1487n02.f4795k;
        int i5 = c1487n02.f4793i;
        if (!TextUtils.isEmpty(c1487n02.f4797m)) {
            String str = this.f4783a.f4797m;
            int length = str.length();
            if (length == i2) {
                for (int i6 = 0; i6 < length; i6++) {
                    if (str.charAt(i6) == Character.toLowerCase(cArr[i + i6])) {
                    }
                }
                z = true;
                if (!z) {
                    i4 = 0;
                } else if (iArr[i5 - 1] >= i3) {
                    return true;
                } else {
                    i4 = 0;
                    while (i4 < i5 && iArr[i4] >= i3 && (iArr[i4] != i3 || i2 >= ((CharSequence) this.f4783a.f4786b.get(i4)).length())) {
                        i4++;
                    }
                }
                System.arraycopy(iArr, i4, iArr, i4 + 1, (i5 - i4) - 1);
                iArr[i4] = i3;
                int size = this.f4783a.f4788d.size();
                StringBuilder sb = size <= 0 ? (StringBuilder) this.f4783a.f4788d.remove(size - 1) : new StringBuilder(32);
                sb.setLength(0);
                c1487n0 = this.f4783a;
                if (!c1487n0.f4799o) {
                    sb.append(new String(cArr, i, i2).toUpperCase(this.f4783a.f4791g));
                } else {
                    if (c1487n0.f4798n) {
                        sb.append(Character.toUpperCase(cArr[i]));
                        if (i2 > 1) {
                            i++;
                            i2--;
                        }
                    }
                    sb.append(cArr, i, i2);
                }
                this.f4783a.f4786b.add(i4, sb);
                C1487n0 c1487n03 = this.f4783a;
                list = c1487n03.f4786b;
                List list2 = c1487n03.f4788d;
                while (list.size() > i5) {
                    CharSequence charSequence = (CharSequence) list.remove(i5);
                    if (charSequence instanceof StringBuilder) {
                        list2.add(charSequence);
                    }
                }
                return true;
            }
            z = false;
            if (!z) {
            }
            System.arraycopy(iArr, i4, iArr, i4 + 1, (i5 - i4) - 1);
            iArr[i4] = i3;
            int size2 = this.f4783a.f4788d.size();
            if (size2 <= 0) {
            }
            sb.setLength(0);
            c1487n0 = this.f4783a;
            if (!c1487n0.f4799o) {
            }
            this.f4783a.f4786b.add(i4, sb);
            C1487n0 c1487n032 = this.f4783a;
            list = c1487n032.f4786b;
            List list22 = c1487n032.f4788d;
            while (list.size() > i5) {
            }
            return true;
        }
        throw new IllegalStateException("mLowerOriginalWord should have already been set");
    }
}