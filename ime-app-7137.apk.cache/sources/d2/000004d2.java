package p010b.p087x.p088a.p089a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import p010b.p036g.C0378b;
import p010b.p046j.p048e.p049b.C0495a;
import p010b.p046j.p050f.C0509d;

/* renamed from: b.x.a.a.q */
/* loaded from: classes.dex */
public class C1102q {

    /* renamed from: a */
    public static final Matrix f4108a = new Matrix();

    /* renamed from: b */
    public final Path f4109b;

    /* renamed from: c */
    public final Path f4110c;

    /* renamed from: d */
    public final Matrix f4111d;

    /* renamed from: e */
    public Paint f4112e;

    /* renamed from: f */
    public Paint f4113f;

    /* renamed from: g */
    public PathMeasure f4114g;

    /* renamed from: h */
    public int f4115h;

    /* renamed from: i */
    public final C1099n f4116i;

    /* renamed from: j */
    public float f4117j;

    /* renamed from: k */
    public float f4118k;

    /* renamed from: l */
    public float f4119l;

    /* renamed from: m */
    public float f4120m;

    /* renamed from: n */
    public int f4121n;

    /* renamed from: o */
    public String f4122o;

    /* renamed from: p */
    public Boolean f4123p;

    /* renamed from: q */
    public final C0378b f4124q;

    public C1102q() {
        this.f4111d = new Matrix();
        this.f4117j = 0.0f;
        this.f4118k = 0.0f;
        this.f4119l = 0.0f;
        this.f4120m = 0.0f;
        this.f4121n = 255;
        this.f4122o = null;
        this.f4123p = null;
        this.f4124q = new C0378b();
        this.f4116i = new C1099n();
        this.f4109b = new Path();
        this.f4110c = new Path();
    }

    public C1102q(C1102q c1102q) {
        this.f4111d = new Matrix();
        this.f4117j = 0.0f;
        this.f4118k = 0.0f;
        this.f4119l = 0.0f;
        this.f4120m = 0.0f;
        this.f4121n = 255;
        this.f4122o = null;
        this.f4123p = null;
        C0378b c0378b = new C0378b();
        this.f4124q = c0378b;
        this.f4116i = new C1099n(c1102q.f4116i, c0378b);
        this.f4109b = new Path(c1102q.f4109b);
        this.f4110c = new Path(c1102q.f4110c);
        this.f4117j = c1102q.f4117j;
        this.f4118k = c1102q.f4118k;
        this.f4119l = c1102q.f4119l;
        this.f4120m = c1102q.f4120m;
        this.f4115h = c1102q.f4115h;
        this.f4121n = c1102q.f4121n;
        this.f4122o = c1102q.f4122o;
        String str = c1102q.f4122o;
        if (str != null) {
            c0378b.put(str, this);
        }
        this.f4123p = c1102q.f4123p;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: android.graphics.PathMeasure */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* renamed from: a */
    public final void m1239a(C1099n c1099n, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        C1102q c1102q;
        C1102q c1102q2 = this;
        c1099n.f4091a.set(matrix);
        c1099n.f4091a.preConcat(c1099n.f4100j);
        canvas.save();
        ?? r11 = 0;
        int i3 = 0;
        while (i3 < c1099n.f4092b.size()) {
            AbstractC1100o abstractC1100o = (AbstractC1100o) c1099n.f4092b.get(i3);
            if (abstractC1100o instanceof C1099n) {
                m1239a((C1099n) abstractC1100o, c1099n.f4091a, canvas, i, i2, colorFilter);
            } else if (abstractC1100o instanceof AbstractC1101p) {
                AbstractC1101p abstractC1101p = (AbstractC1101p) abstractC1100o;
                float f = i / c1102q2.f4119l;
                float f2 = i2 / c1102q2.f4120m;
                float min = Math.min(f, f2);
                Matrix matrix2 = c1099n.f4091a;
                c1102q2.f4111d.set(matrix2);
                c1102q2.f4111d.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float f3 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[r11], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                float abs = max > 0.0f ? Math.abs(f3) / max : 0.0f;
                if (abs == 0.0f) {
                    c1102q = this;
                } else {
                    c1102q = this;
                    Path path = c1102q.f4109b;
                    abstractC1101p.getClass();
                    path.reset();
                    C0509d[] c0509dArr = abstractC1101p.f4104a;
                    if (c0509dArr != null) {
                        C0509d.m2382b(c0509dArr, path);
                    }
                    Path path2 = c1102q.f4109b;
                    c1102q.f4110c.reset();
                    if (abstractC1101p instanceof C1097l) {
                        c1102q.f4110c.setFillType(abstractC1101p.f4106c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        c1102q.f4110c.addPath(path2, c1102q.f4111d);
                        canvas.clipPath(c1102q.f4110c);
                    } else {
                        C1098m c1098m = (C1098m) abstractC1101p;
                        float f4 = c1098m.f4085k;
                        if (f4 != 0.0f || c1098m.f4086l != 1.0f) {
                            float f5 = c1098m.f4087m;
                            float f6 = (f4 + f5) % 1.0f;
                            float f7 = (c1098m.f4086l + f5) % 1.0f;
                            if (c1102q.f4114g == null) {
                                c1102q.f4114g = new PathMeasure();
                            }
                            c1102q.f4114g.setPath(c1102q.f4109b, r11);
                            float length = c1102q.f4114g.getLength();
                            float f8 = f6 * length;
                            float f9 = f7 * length;
                            path2.reset();
                            if (f8 > f9) {
                                c1102q.f4114g.getSegment(f8, length, path2, true);
                                c1102q.f4114g.getSegment(0.0f, f9, path2, true);
                            } else {
                                c1102q.f4114g.getSegment(f8, f9, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        c1102q.f4110c.addPath(path2, c1102q.f4111d);
                        C0495a c0495a = c1098m.f4082h;
                        if (c0495a.m2410b() || c0495a.f2519c != 0) {
                            C0495a c0495a2 = c1098m.f4082h;
                            if (c1102q.f4113f == null) {
                                Paint paint = new Paint(1);
                                c1102q.f4113f = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = c1102q.f4113f;
                            if (c0495a2.m2410b()) {
                                Shader shader = c0495a2.f2517a;
                                shader.setLocalMatrix(c1102q.f4111d);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c1098m.f4084j * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i4 = c0495a2.f2519c;
                                float f10 = c1098m.f4084j;
                                PorterDuff.Mode mode = C1105t.f4138c;
                                paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f10)) << 24));
                            }
                            paint2.setColorFilter(colorFilter);
                            c1102q.f4110c.setFillType(c1098m.f4106c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(c1102q.f4110c, paint2);
                        }
                        C0495a c0495a3 = c1098m.f4080f;
                        if (c0495a3.m2410b() || c0495a3.f2519c != 0) {
                            C0495a c0495a4 = c1098m.f4080f;
                            if (c1102q.f4112e == null) {
                                Paint paint3 = new Paint(1);
                                c1102q.f4112e = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = c1102q.f4112e;
                            Paint.Join join = c1098m.f4089o;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c1098m.f4088n;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c1098m.f4090p);
                            if (c0495a4.m2410b()) {
                                Shader shader2 = c0495a4.f2517a;
                                shader2.setLocalMatrix(c1102q.f4111d);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c1098m.f4083i * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i5 = c0495a4.f2519c;
                                float f11 = c1098m.f4083i;
                                PorterDuff.Mode mode2 = C1105t.f4138c;
                                paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                            }
                            paint4.setColorFilter(colorFilter);
                            paint4.setStrokeWidth(c1098m.f4081g * abs * min);
                            canvas.drawPath(c1102q.f4110c, paint4);
                        }
                    }
                }
                i3++;
                c1102q2 = c1102q;
                r11 = 0;
            }
            c1102q = c1102q2;
            i3++;
            c1102q2 = c1102q;
            r11 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f4121n;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f4121n = i;
    }
}