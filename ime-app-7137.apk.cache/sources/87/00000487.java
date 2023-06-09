package p010b.p086w;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: b.w.c */
/* loaded from: classes.dex */
public final class C1027c extends Property {

    /* renamed from: a */
    public Rect f3922a;

    public C1027c(Class cls, String str) {
        super(cls, str);
        this.f3922a = new Rect();
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f3922a);
        Rect rect = this.f3922a;
        return new PointF(rect.left, rect.top);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.f3922a);
        this.f3922a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f3922a);
    }
}