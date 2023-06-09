package p010b.p083u.p084e;

import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.Arrays;
import java.util.List;

/* renamed from: b.u.e.o2 */
/* loaded from: classes.dex */
public class C0973o2 {

    /* renamed from: a */
    public int[] f3752a;

    /* renamed from: b */
    public List f3753b;

    /* renamed from: a */
    public void m1601a() {
        int[] iArr = this.f3752a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f3753b = null;
    }

    /* renamed from: b */
    public void m1600b(int i) {
        int[] iArr = this.f3752a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f3752a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f3752a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f3752a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: c */
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem m1599c(int i) {
        List list = this.f3753b;
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f3753b.get(size);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f819b == i) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m1598d(int i) {
        int i2;
        int[] iArr = this.f3752a;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        if (this.f3753b != null) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem m1599c = m1599c(i);
            if (m1599c != null) {
                this.f3753b.remove(m1599c);
            }
            int size = this.f3753b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f3753b.get(i3)).f819b >= i) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 != -1) {
                this.f3753b.remove(i3);
                i2 = ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f3753b.get(i3)).f819b;
                if (i2 != -1) {
                    int[] iArr2 = this.f3752a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f3752a.length;
                }
                int min = Math.min(i2 + 1, this.f3752a.length);
                Arrays.fill(this.f3752a, i, min, -1);
                return min;
            }
        }
        i2 = -1;
        if (i2 != -1) {
        }
    }

    /* renamed from: e */
    public void m1597e(int i, int i2) {
        int[] iArr = this.f3752a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m1600b(i3);
        int[] iArr2 = this.f3752a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.f3752a, i, i3, -1);
        List list = this.f3753b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f3753b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f819b;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f819b = i4 + i2;
            }
        }
    }

    /* renamed from: f */
    public void m1596f(int i, int i2) {
        int[] iArr = this.f3752a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m1600b(i3);
        int[] iArr2 = this.f3752a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.f3752a;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        List list = this.f3753b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f3753b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f819b;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.f3753b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f819b = i4 - i2;
                }
            }
        }
    }
}