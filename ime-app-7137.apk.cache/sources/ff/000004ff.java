package p093c.p097b.p099b0;

import android.content.res.ColorStateList;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: c.b.b0.j */
/* loaded from: classes.dex */
public class C1147j {

    /* renamed from: a */
    public static final int[][] f4267a = {new int[]{0}};

    /* renamed from: b */
    public C1138a f4268b = new C1138a();

    /* renamed from: c */
    public final C1146i f4269c = new C1146i(null);

    /* renamed from: d */
    public final C1146i f4270d = new C1146i(null);

    /* renamed from: a */
    public InterfaceC1148k m1174a() {
        return this.f4268b.mo936a() ? this.f4270d : this.f4269c;
    }

    /* renamed from: b */
    public final void m1173b() {
        Drawable drawable = this.f4269c.f4266e;
        if (drawable != null) {
            drawable.clearColorFilter();
        }
        Drawable drawable2 = this.f4269c.f4265d;
        if (drawable2 != null) {
            drawable2.clearColorFilter();
        }
        if (this.f4268b.mo936a()) {
            C1146i c1146i = this.f4270d;
            Drawable drawable3 = this.f4269c.f4265d;
            int i = this.f4268b.f4250a;
            if (drawable3 == null) {
                drawable3 = new ColorDrawable(i);
            } else {
                drawable3.setColorFilter(new LightingColorFilter(-13421773, i));
            }
            c1146i.f4265d = drawable3;
            C1146i c1146i2 = this.f4270d;
            Drawable drawable4 = this.f4269c.f4266e;
            int i2 = this.f4268b.f4251b;
            if (drawable4 == null) {
                drawable4 = new ColorDrawable(i2);
            } else {
                drawable4.setColorFilter(new LightingColorFilter(-13421773, i2));
            }
            c1146i2.f4266e = drawable4;
            this.f4270d.f4262a = new ColorStateList(f4267a, new int[]{this.f4268b.f4252c});
            C1146i c1146i3 = this.f4270d;
            int i3 = this.f4268b.f4253d;
            c1146i3.f4263b = i3;
            c1146i3.f4264c = i3;
        }
    }
}