package p093c.p145g.p146a.p147a.p154g0;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* renamed from: c.g.a.a.g0.h */
/* loaded from: classes.dex */
public final class C1850h extends Drawable.ConstantState {

    /* renamed from: a */
    public C1856n f5633a;

    /* renamed from: b */
    public C2045a f5634b;

    /* renamed from: c */
    public ColorFilter f5635c;

    /* renamed from: d */
    public ColorStateList f5636d;

    /* renamed from: e */
    public ColorStateList f5637e;

    /* renamed from: f */
    public ColorStateList f5638f;

    /* renamed from: g */
    public ColorStateList f5639g;

    /* renamed from: h */
    public PorterDuff.Mode f5640h;

    /* renamed from: i */
    public Rect f5641i;

    /* renamed from: j */
    public float f5642j;

    /* renamed from: k */
    public float f5643k;

    /* renamed from: l */
    public float f5644l;

    /* renamed from: m */
    public int f5645m;

    /* renamed from: n */
    public float f5646n;

    /* renamed from: o */
    public float f5647o;

    /* renamed from: p */
    public float f5648p;

    /* renamed from: q */
    public int f5649q;

    /* renamed from: r */
    public int f5650r;

    /* renamed from: s */
    public int f5651s;

    /* renamed from: t */
    public int f5652t;

    /* renamed from: u */
    public boolean f5653u;

    /* renamed from: v */
    public Paint.Style f5654v;

    public C1850h(C1850h c1850h) {
        this.f5636d = null;
        this.f5637e = null;
        this.f5638f = null;
        this.f5639g = null;
        this.f5640h = PorterDuff.Mode.SRC_IN;
        this.f5641i = null;
        this.f5642j = 1.0f;
        this.f5643k = 1.0f;
        this.f5645m = 255;
        this.f5646n = 0.0f;
        this.f5647o = 0.0f;
        this.f5648p = 0.0f;
        this.f5649q = 0;
        this.f5650r = 0;
        this.f5651s = 0;
        this.f5652t = 0;
        this.f5653u = false;
        this.f5654v = Paint.Style.FILL_AND_STROKE;
        this.f5633a = c1850h.f5633a;
        this.f5634b = c1850h.f5634b;
        this.f5644l = c1850h.f5644l;
        this.f5635c = c1850h.f5635c;
        this.f5636d = c1850h.f5636d;
        this.f5637e = c1850h.f5637e;
        this.f5640h = c1850h.f5640h;
        this.f5639g = c1850h.f5639g;
        this.f5645m = c1850h.f5645m;
        this.f5642j = c1850h.f5642j;
        this.f5651s = c1850h.f5651s;
        this.f5649q = c1850h.f5649q;
        this.f5653u = c1850h.f5653u;
        this.f5643k = c1850h.f5643k;
        this.f5646n = c1850h.f5646n;
        this.f5647o = c1850h.f5647o;
        this.f5648p = c1850h.f5648p;
        this.f5650r = c1850h.f5650r;
        this.f5652t = c1850h.f5652t;
        this.f5638f = c1850h.f5638f;
        this.f5654v = c1850h.f5654v;
        if (c1850h.f5641i != null) {
            this.f5641i = new Rect(c1850h.f5641i);
        }
    }

    public C1850h(C1856n c1856n, C2045a c2045a) {
        this.f5636d = null;
        this.f5637e = null;
        this.f5638f = null;
        this.f5639g = null;
        this.f5640h = PorterDuff.Mode.SRC_IN;
        this.f5641i = null;
        this.f5642j = 1.0f;
        this.f5643k = 1.0f;
        this.f5645m = 255;
        this.f5646n = 0.0f;
        this.f5647o = 0.0f;
        this.f5648p = 0.0f;
        this.f5649q = 0;
        this.f5650r = 0;
        this.f5651s = 0;
        this.f5652t = 0;
        this.f5653u = false;
        this.f5654v = Paint.Style.FILL_AND_STROKE;
        this.f5633a = c1856n;
        this.f5634b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1851i c1851i = new C1851i(this);
        c1851i.f5661h = true;
        return c1851i;
    }
}