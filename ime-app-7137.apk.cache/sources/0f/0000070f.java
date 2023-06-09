package p093c.p097b.p130z;

import android.content.Context;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: c.b.z.i0 */
/* loaded from: classes.dex */
public class C1675i0 {

    /* renamed from: a */
    public EnumC1764v f5171a = EnumC1764v.None;

    /* renamed from: b */
    public List f5172b = null;

    /* renamed from: c */
    public final AbstractC1762t f5173c;

    /* renamed from: d */
    public final float f5174d;

    /* renamed from: e */
    public final float f5175e;

    public C1675i0(Context context, AbstractC1762t abstractC1762t) {
        this.f5173c = abstractC1762t;
        this.f5174d = context.getResources().getInteger(R.integer.condensing_precentage) / 100.0f;
        this.f5175e = context.getResources().getInteger(R.integer.condensing_precentage_edge) / 100.0f;
    }

    /* renamed from: a */
    public final int m921a(int i, Key key, int i2) {
        key.x = i;
        key.width = i2;
        key.centerX = (i2 / 2) + i;
        return i + i2;
    }

    /* renamed from: b */
    public final void m920b(float f, int i, int i2, int i3, Deque deque, Key key) {
        int i4 = (int) (i2 - ((i2 - i3) * f));
        while (!deque.isEmpty()) {
            Key key2 = (Key) deque.pop();
            int i5 = key2.width;
            int i6 = (i4 - i) - i5;
            key2.x = i6;
            key2.centerX = (i5 / 2) + i6;
            i4 = i6 - i;
        }
        if (key != null) {
            key.width = i4 - key.x;
        }
    }

    /* renamed from: c */
    public final void m919c(int i, int i2, int i3, float f) {
        int i4;
        ArrayDeque arrayDeque = new ArrayDeque();
        boolean z = true;
        int i5 = i;
        Key key = null;
        int i6 = 0;
        int i7 = 0;
        for (Key key2 : this.f5173c.f5147q) {
            this.f5172b.add(new C1673h0(key2.width, key2.height, key2.x, key2.y));
            if (i6 != key2.y) {
                m920b(f, i3, i, i5, arrayDeque, key);
                i6 = key2.y;
                arrayDeque.clear();
                i5 = i;
                z = !z;
                i7 = 0;
            }
            int i8 = i7 + i3;
            int i9 = key2.width;
            int i10 = (int) (i9 * f);
            int i11 = (i9 / 2) + key2.x;
            if (key2.getPrimaryCode() == 32 && (i4 = key2.x) < i2 && i4 + key2.width > i2) {
                i8 = m921a(i8, key2, i10);
                key = key2;
            } else if (i11 >= i2 - 5 && (i11 > i2 + 5 || !z)) {
                arrayDeque.push(key2);
                key2.width = i10;
                i5 = key2.x + key2.width;
            } else {
                i8 = m921a(i8, key2, i10);
            }
            i7 = i8 + i3;
        }
        m920b(f, i3, i, i5, arrayDeque, key);
    }
}