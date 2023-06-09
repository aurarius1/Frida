package p093c.p097b.p106g0;

/* renamed from: c.b.g0.l */
/* loaded from: classes.dex */
public class C1229l {

    /* renamed from: a */
    public final char[] f4405a;

    /* renamed from: b */
    public int f4406b;

    public C1229l(String str) {
        char[] charArray = str.toCharArray();
        this.f4406b = 0;
        int length = charArray.length;
        char[] cArr = new char[length];
        this.f4405a = cArr;
        System.arraycopy(charArray, 0, cArr, 0, length);
    }

    /* renamed from: a */
    public boolean m1144a(int i) {
        char[] cArr = this.f4405a;
        int i2 = this.f4406b;
        if (i == cArr[i2]) {
            int i3 = i2 + 1;
            this.f4406b = i3;
            if (i3 == cArr.length) {
                this.f4406b = 0;
                return true;
            }
        } else {
            this.f4406b = 0;
            if (i == cArr[0]) {
                return m1144a(i);
            }
        }
        return false;
    }
}