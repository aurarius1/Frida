package p010b.p087x.p088a.p089a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: b.x.a.a.r */
/* loaded from: classes.dex */
public class C1103r extends Drawable.ConstantState {

    /* renamed from: a */
    public int f4125a;

    /* renamed from: b */
    public C1102q f4126b;

    /* renamed from: c */
    public ColorStateList f4127c;

    /* renamed from: d */
    public PorterDuff.Mode f4128d;

    /* renamed from: e */
    public boolean f4129e;

    /* renamed from: f */
    public Bitmap f4130f;

    /* renamed from: g */
    public ColorStateList f4131g;

    /* renamed from: h */
    public PorterDuff.Mode f4132h;

    /* renamed from: i */
    public int f4133i;

    /* renamed from: j */
    public boolean f4134j;

    /* renamed from: k */
    public boolean f4135k;

    /* renamed from: l */
    public Paint f4136l;

    public C1103r() {
        this.f4127c = null;
        this.f4128d = C1105t.f4138c;
        this.f4126b = new C1102q();
    }

    public C1103r(C1103r c1103r) {
        this.f4127c = null;
        this.f4128d = C1105t.f4138c;
        if (c1103r != null) {
            this.f4125a = c1103r.f4125a;
            C1102q c1102q = new C1102q(c1103r.f4126b);
            this.f4126b = c1102q;
            if (c1103r.f4126b.f4113f != null) {
                c1102q.f4113f = new Paint(c1103r.f4126b.f4113f);
            }
            if (c1103r.f4126b.f4112e != null) {
                this.f4126b.f4112e = new Paint(c1103r.f4126b.f4112e);
            }
            this.f4127c = c1103r.f4127c;
            this.f4128d = c1103r.f4128d;
            this.f4129e = c1103r.f4129e;
        }
    }

    /* renamed from: a */
    public boolean m1238a() {
        C1102q c1102q = this.f4126b;
        if (c1102q.f4123p == null) {
            c1102q.f4123p = Boolean.valueOf(c1102q.f4116i.mo1241a());
        }
        return c1102q.f4123p.booleanValue();
    }

    /* renamed from: b */
    public void m1237b(int i, int i2) {
        this.f4130f.eraseColor(0);
        Canvas canvas = new Canvas(this.f4130f);
        C1102q c1102q = this.f4126b;
        c1102q.m1239a(c1102q.f4116i, C1102q.f4108a, canvas, i, i2, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4125a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C1105t(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C1105t(this);
    }
}