package p093c.p097b.p130z;

import android.content.Context;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p093c.p097b.p116p.AbstractC1427e;

/* renamed from: c.b.z.p0 */
/* loaded from: classes.dex */
public class C1689p0 extends C1763u {

    /* renamed from: Q */
    public final int f5244Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689p0(AbstractC1427e abstractC1427e, Context context, InterfaceC1677j0 interfaceC1677j0, List list, List list2, CharSequence charSequence) {
        super(abstractC1427e, context, R.xml.quick_text_list_popup, interfaceC1677j0, charSequence, null, null);
        Key key = null;
        int i = 0;
        Key key2 = (Key) this.f5147q.get(0);
        C1667e0 c1667e0 = key2.f5238u;
        float f = key2.y;
        float f2 = c1667e0.f5125c;
        key2.f5218a = new int[]{0};
        key2.f5219b = (CharSequence) list.get(0);
        key2.f5230m = (CharSequence) list2.get(0);
        float f3 = key2.width;
        int i2 = 1;
        int i3 = 0;
        while (i2 < list.size()) {
            float f4 = f2 / 2.0f;
            float f5 = f3 + f4;
            Key key3 = new Key(c1667e0, interfaceC1677j0);
            int[] iArr = new int[1];
            iArr[i] = i;
            key3.f5218a = iArr;
            int[] iArr2 = new int[1];
            iArr2[i] = i;
            key3.f5213E = iArr2;
            key3.f5219b = (CharSequence) list.get(i2);
            key3.f5230m = (CharSequence) list2.get(i2);
            key3.x = (int) f5;
            int i4 = (int) (key3.width - f2);
            key3.width = i4;
            key3.y = (int) f;
            int i5 = (int) (i4 + f2 + f4);
            f3 = f5 + i5;
            i3 += i5;
            this.f5147q.add(key3);
            i2++;
            key = key3;
            i = 0;
        }
        key2.f5235r = 1;
        if (key != null) {
            key.f5235r = 2;
        } else {
            key2.f5235r = 3;
        }
        this.f5244Q = i3;
    }

    @Override // p093c.p097b.p130z.C1763u, p093c.p097b.p130z.AbstractC1762t, p093c.p097b.p130z.AbstractC1669f0
    /* renamed from: g */
    public int mo831g() {
        return super.mo831g() + this.f5244Q;
    }
}