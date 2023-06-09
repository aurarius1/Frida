package p010b.p087x.p088a.p089a;

import android.graphics.Matrix;
import java.util.ArrayList;
import p010b.p036g.C0378b;

/* renamed from: b.x.a.a.n */
/* loaded from: classes.dex */
public class C1099n extends AbstractC1100o {

    /* renamed from: a */
    public final Matrix f4091a;

    /* renamed from: b */
    public final ArrayList f4092b;

    /* renamed from: c */
    public float f4093c;

    /* renamed from: d */
    public float f4094d;

    /* renamed from: e */
    public float f4095e;

    /* renamed from: f */
    public float f4096f;

    /* renamed from: g */
    public float f4097g;

    /* renamed from: h */
    public float f4098h;

    /* renamed from: i */
    public float f4099i;

    /* renamed from: j */
    public final Matrix f4100j;

    /* renamed from: k */
    public int f4101k;

    /* renamed from: l */
    public int[] f4102l;

    /* renamed from: m */
    public String f4103m;

    public C1099n() {
        super(null);
        this.f4091a = new Matrix();
        this.f4092b = new ArrayList();
        this.f4093c = 0.0f;
        this.f4094d = 0.0f;
        this.f4095e = 0.0f;
        this.f4096f = 1.0f;
        this.f4097g = 1.0f;
        this.f4098h = 0.0f;
        this.f4099i = 0.0f;
        this.f4100j = new Matrix();
        this.f4103m = null;
    }

    public C1099n(C1099n c1099n, C0378b c0378b) {
        super(null);
        AbstractC1101p c1097l;
        this.f4091a = new Matrix();
        this.f4092b = new ArrayList();
        this.f4093c = 0.0f;
        this.f4094d = 0.0f;
        this.f4095e = 0.0f;
        this.f4096f = 1.0f;
        this.f4097g = 1.0f;
        this.f4098h = 0.0f;
        this.f4099i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4100j = matrix;
        this.f4103m = null;
        this.f4093c = c1099n.f4093c;
        this.f4094d = c1099n.f4094d;
        this.f4095e = c1099n.f4095e;
        this.f4096f = c1099n.f4096f;
        this.f4097g = c1099n.f4097g;
        this.f4098h = c1099n.f4098h;
        this.f4099i = c1099n.f4099i;
        this.f4102l = c1099n.f4102l;
        String str = c1099n.f4103m;
        this.f4103m = str;
        this.f4101k = c1099n.f4101k;
        if (str != null) {
            c0378b.put(str, this);
        }
        matrix.set(c1099n.f4100j);
        ArrayList arrayList = c1099n.f4092b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C1099n) {
                this.f4092b.add(new C1099n((C1099n) obj, c0378b));
            } else {
                if (obj instanceof C1098m) {
                    c1097l = new C1098m((C1098m) obj);
                } else if (!(obj instanceof C1097l)) {
                    throw new IllegalStateException("Unknown object in the tree!");
                } else {
                    c1097l = new C1097l((C1097l) obj);
                }
                this.f4092b.add(c1097l);
                Object obj2 = c1097l.f4105b;
                if (obj2 != null) {
                    c0378b.put(obj2, c1097l);
                }
            }
        }
    }

    @Override // p010b.p087x.p088a.p089a.AbstractC1100o
    /* renamed from: a */
    public boolean mo1241a() {
        for (int i = 0; i < this.f4092b.size(); i++) {
            if (((AbstractC1100o) this.f4092b.get(i)).mo1241a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p010b.p087x.p088a.p089a.AbstractC1100o
    /* renamed from: b */
    public boolean mo1240b(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f4092b.size(); i++) {
            z |= ((AbstractC1100o) this.f4092b.get(i)).mo1240b(iArr);
        }
        return z;
    }

    /* renamed from: c */
    public final void m1242c() {
        this.f4100j.reset();
        this.f4100j.postTranslate(-this.f4094d, -this.f4095e);
        this.f4100j.postScale(this.f4096f, this.f4097g);
        this.f4100j.postRotate(this.f4093c, 0.0f, 0.0f);
        this.f4100j.postTranslate(this.f4098h + this.f4094d, this.f4099i + this.f4095e);
    }

    public String getGroupName() {
        return this.f4103m;
    }

    public Matrix getLocalMatrix() {
        return this.f4100j;
    }

    public float getPivotX() {
        return this.f4094d;
    }

    public float getPivotY() {
        return this.f4095e;
    }

    public float getRotation() {
        return this.f4093c;
    }

    public float getScaleX() {
        return this.f4096f;
    }

    public float getScaleY() {
        return this.f4097g;
    }

    public float getTranslateX() {
        return this.f4098h;
    }

    public float getTranslateY() {
        return this.f4099i;
    }

    public void setPivotX(float f) {
        if (f != this.f4094d) {
            this.f4094d = f;
            m1242c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f4095e) {
            this.f4095e = f;
            m1242c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f4093c) {
            this.f4093c = f;
            m1242c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f4096f) {
            this.f4096f = f;
            m1242c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f4097g) {
            this.f4097g = f;
            m1242c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f4098h) {
            this.f4098h = f;
            m1242c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f4099i) {
            this.f4099i = f;
            m1242c();
        }
    }
}