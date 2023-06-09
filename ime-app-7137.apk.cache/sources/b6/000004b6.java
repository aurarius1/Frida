package p010b.p086w;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: b.w.u */
/* loaded from: classes.dex */
public class C1074u extends Property {

    /* renamed from: a */
    public final Property f4031a;

    /* renamed from: b */
    public final PathMeasure f4032b;

    /* renamed from: c */
    public final float f4033c;

    /* renamed from: d */
    public final float[] f4034d;

    /* renamed from: e */
    public final PointF f4035e;

    /* renamed from: f */
    public float f4036f;

    public C1074u(Property property, Path path) {
        super(Float.class, property.getName());
        this.f4034d = new float[2];
        this.f4035e = new PointF();
        this.f4031a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f4032b = pathMeasure;
        this.f4033c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return Float.valueOf(this.f4036f);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.f4036f = f.floatValue();
        this.f4032b.getPosTan(f.floatValue() * this.f4033c, this.f4034d, null);
        PointF pointF = this.f4035e;
        float[] fArr = this.f4034d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f4031a.set(obj, pointF);
    }
}