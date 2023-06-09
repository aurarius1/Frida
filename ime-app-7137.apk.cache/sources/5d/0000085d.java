package p093c.p145g.p146a.p147a.p171w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p154g0.C1843a;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;

/* renamed from: c.g.a.a.w.c */
/* loaded from: classes.dex */
public final class C2009c {

    /* renamed from: a */
    public final Rect f6128a;

    /* renamed from: b */
    public final ColorStateList f6129b;

    /* renamed from: c */
    public final ColorStateList f6130c;

    /* renamed from: d */
    public final ColorStateList f6131d;

    /* renamed from: e */
    public final int f6132e;

    /* renamed from: f */
    public final C1856n f6133f;

    public C2009c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1856n c1856n, Rect rect) {
        AbstractC0022t.m3495g(rect.left);
        AbstractC0022t.m3495g(rect.top);
        AbstractC0022t.m3495g(rect.right);
        AbstractC0022t.m3495g(rect.bottom);
        this.f6128a = rect;
        this.f6129b = colorStateList2;
        this.f6130c = colorStateList;
        this.f6131d = colorStateList3;
        this.f6132e = i;
        this.f6133f = c1856n;
    }

    /* renamed from: a */
    public static C2009c m560a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1940l.MaterialCalendarItem);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(AbstractC1940l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(AbstractC1940l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(AbstractC1940l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(AbstractC1940l.MaterialCalendarItem_android_insetBottom, 0));
            ColorStateList m1262q = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.MaterialCalendarItem_itemFillColor);
            ColorStateList m1262q2 = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.MaterialCalendarItem_itemTextColor);
            ColorStateList m1262q3 = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.MaterialCalendarItem_itemStrokeColor);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC1940l.MaterialCalendarItem_itemStrokeWidth, 0);
            C1856n m727a = C1856n.m720a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new C1843a(0)).m727a();
            obtainStyledAttributes.recycle();
            return new C2009c(m1262q, m1262q2, m1262q3, dimensionPixelSize, m727a, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* renamed from: b */
    public void m559b(TextView textView) {
        C1851i c1851i = new C1851i();
        C1851i c1851i2 = new C1851i();
        c1851i.setShapeAppearanceModel(this.f6133f);
        c1851i2.setShapeAppearanceModel(this.f6133f);
        c1851i.m737p(this.f6130c);
        c1851i.m734s(this.f6132e, this.f6131d);
        textView.setTextColor(this.f6129b);
        int i = Build.VERSION.SDK_INT;
        Drawable rippleDrawable = i >= 21 ? new RippleDrawable(this.f6129b.withAlpha(30), c1851i, c1851i2) : c1851i;
        Rect rect = this.f6128a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (i >= 16) {
            textView.setBackground(insetDrawable);
        } else {
            textView.setBackgroundDrawable(insetDrawable);
        }
    }
}