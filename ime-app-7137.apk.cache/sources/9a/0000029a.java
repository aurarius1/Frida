package p010b.p046j.p055i;

import java.util.Comparator;

/* renamed from: b.j.i.d */
/* loaded from: classes.dex */
public class C0534d implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i;
        int i2;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length == bArr2.length) {
            for (int i3 = 0; i3 < bArr.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    i = bArr[i3];
                    i2 = bArr2[i3];
                }
            }
            return 0;
        }
        i = bArr.length;
        i2 = bArr2.length;
        return i - i2;
    }
}