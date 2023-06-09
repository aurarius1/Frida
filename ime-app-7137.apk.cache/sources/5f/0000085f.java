package p093c.p145g.p146a.p147a.p171w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1940l;

/* renamed from: c.g.a.a.w.d */
/* loaded from: classes.dex */
public final class C2011d {

    /* renamed from: a */
    public final C2009c f6136a;

    /* renamed from: b */
    public final C2009c f6137b;

    /* renamed from: c */
    public final C2009c f6138c;

    /* renamed from: d */
    public final C2009c f6139d;

    /* renamed from: e */
    public final C2009c f6140e;

    /* renamed from: f */
    public final C2009c f6141f;

    /* renamed from: g */
    public final C2009c f6142g;

    /* renamed from: h */
    public final Paint f6143h;

    public C2011d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1077v0.m1283U(context, AbstractC1804b.materialCalendarStyle, C2034q.class.getCanonicalName()), AbstractC1940l.MaterialCalendar);
        this.f6136a = C2009c.m560a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendar_dayStyle, 0));
        this.f6142g = C2009c.m560a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendar_dayInvalidStyle, 0));
        this.f6137b = C2009c.m560a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendar_daySelectedStyle, 0));
        this.f6138c = C2009c.m560a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList m1262q = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.MaterialCalendar_rangeFillColor);
        this.f6139d = C2009c.m560a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendar_yearStyle, 0));
        this.f6140e = C2009c.m560a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendar_yearSelectedStyle, 0));
        this.f6141f = C2009c.m560a(context, obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f6143h = paint;
        paint.setColor(m1262q.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}