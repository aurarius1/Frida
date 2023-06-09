package p093c.p145g.p146a.p147a.p154g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1940l;

/* renamed from: c.g.a.a.g0.n */
/* loaded from: classes.dex */
public class C1856n {

    /* renamed from: a */
    public AbstractC1846d f5692a;

    /* renamed from: b */
    public AbstractC1846d f5693b;

    /* renamed from: c */
    public AbstractC1846d f5694c;

    /* renamed from: d */
    public AbstractC1846d f5695d;

    /* renamed from: e */
    public InterfaceC1845c f5696e;

    /* renamed from: f */
    public InterfaceC1845c f5697f;

    /* renamed from: g */
    public InterfaceC1845c f5698g;

    /* renamed from: h */
    public InterfaceC1845c f5699h;

    /* renamed from: i */
    public C1848f f5700i;

    /* renamed from: j */
    public C1848f f5701j;

    /* renamed from: k */
    public C1848f f5702k;

    /* renamed from: l */
    public C1848f f5703l;

    public C1856n() {
        this.f5692a = new C1853k();
        this.f5693b = new C1853k();
        this.f5694c = new C1853k();
        this.f5695d = new C1853k();
        this.f5696e = new C1843a(0.0f);
        this.f5697f = new C1843a(0.0f);
        this.f5698g = new C1843a(0.0f);
        this.f5699h = new C1843a(0.0f);
        this.f5700i = new C1848f();
        this.f5701j = new C1848f();
        this.f5702k = new C1848f();
        this.f5703l = new C1848f();
    }

    /* renamed from: a */
    public static C1855m m720a(Context context, int i, int i2, InterfaceC1845c interfaceC1845c) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1940l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(AbstractC1940l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(AbstractC1940l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(AbstractC1940l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(AbstractC1940l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(AbstractC1940l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            InterfaceC1845c m718c = m718c(obtainStyledAttributes, AbstractC1940l.ShapeAppearance_cornerSize, interfaceC1845c);
            InterfaceC1845c m718c2 = m718c(obtainStyledAttributes, AbstractC1940l.ShapeAppearance_cornerSizeTopLeft, m718c);
            InterfaceC1845c m718c3 = m718c(obtainStyledAttributes, AbstractC1940l.ShapeAppearance_cornerSizeTopRight, m718c);
            InterfaceC1845c m718c4 = m718c(obtainStyledAttributes, AbstractC1940l.ShapeAppearance_cornerSizeBottomRight, m718c);
            InterfaceC1845c m718c5 = m718c(obtainStyledAttributes, AbstractC1940l.ShapeAppearance_cornerSizeBottomLeft, m718c);
            C1855m c1855m = new C1855m();
            AbstractC1846d m1269j = AbstractC1077v0.m1269j(i4);
            c1855m.f5680a = m1269j;
            C1855m.m726b(m1269j);
            c1855m.f5684e = m718c2;
            AbstractC1846d m1269j2 = AbstractC1077v0.m1269j(i5);
            c1855m.f5681b = m1269j2;
            C1855m.m726b(m1269j2);
            c1855m.f5685f = m718c3;
            AbstractC1846d m1269j3 = AbstractC1077v0.m1269j(i6);
            c1855m.f5682c = m1269j3;
            C1855m.m726b(m1269j3);
            c1855m.f5686g = m718c4;
            AbstractC1846d m1269j4 = AbstractC1077v0.m1269j(i7);
            c1855m.f5683d = m1269j4;
            C1855m.m726b(m1269j4);
            c1855m.f5687h = m718c5;
            return c1855m;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C1855m m719b(Context context, AttributeSet attributeSet, int i, int i2) {
        C1843a c1843a = new C1843a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(AbstractC1940l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m720a(context, resourceId, resourceId2, c1843a);
    }

    /* renamed from: c */
    public static InterfaceC1845c m718c(TypedArray typedArray, int i, InterfaceC1845c interfaceC1845c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC1845c;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C1843a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C1852j(peekValue.getFraction(1.0f, 1.0f)) : interfaceC1845c;
    }

    /* renamed from: d */
    public boolean m717d(RectF rectF) {
        boolean z = this.f5703l.getClass().equals(C1848f.class) && this.f5701j.getClass().equals(C1848f.class) && this.f5700i.getClass().equals(C1848f.class) && this.f5702k.getClass().equals(C1848f.class);
        float mo729a = this.f5696e.mo729a(rectF);
        return z && ((this.f5697f.mo729a(rectF) > mo729a ? 1 : (this.f5697f.mo729a(rectF) == mo729a ? 0 : -1)) == 0 && (this.f5699h.mo729a(rectF) > mo729a ? 1 : (this.f5699h.mo729a(rectF) == mo729a ? 0 : -1)) == 0 && (this.f5698g.mo729a(rectF) > mo729a ? 1 : (this.f5698g.mo729a(rectF) == mo729a ? 0 : -1)) == 0) && ((this.f5693b instanceof C1853k) && (this.f5692a instanceof C1853k) && (this.f5694c instanceof C1853k) && (this.f5695d instanceof C1853k));
    }

    /* renamed from: e */
    public C1856n m716e(float f) {
        C1855m c1855m = new C1855m(this);
        c1855m.m725c(f);
        return c1855m.m727a();
    }

    public C1856n(C1855m c1855m, AbstractC1854l abstractC1854l) {
        this.f5692a = c1855m.f5680a;
        this.f5693b = c1855m.f5681b;
        this.f5694c = c1855m.f5682c;
        this.f5695d = c1855m.f5683d;
        this.f5696e = c1855m.f5684e;
        this.f5697f = c1855m.f5685f;
        this.f5698g = c1855m.f5686g;
        this.f5699h = c1855m.f5687h;
        this.f5700i = c1855m.f5688i;
        this.f5701j = c1855m.f5689j;
        this.f5702k = c1855m.f5690k;
        this.f5703l = c1855m.f5691l;
    }
}