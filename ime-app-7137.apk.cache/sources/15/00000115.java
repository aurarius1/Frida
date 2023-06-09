package p010b.p016c.p020m.p021a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p010b.p036g.C0382f;
import p010b.p036g.C0391o;

/* renamed from: b.c.m.a.c */
/* loaded from: classes.dex */
public class C0145c extends AbstractC0155m {

    /* renamed from: K */
    public C0382f f1125K;

    /* renamed from: L */
    public C0391o f1126L;

    public C0145c(C0145c c0145c, C0150h c0150h, Resources resources) {
        super(c0145c, c0150h, resources);
        C0391o c0391o;
        if (c0145c != null) {
            this.f1125K = c0145c.f1125K;
            c0391o = c0145c.f1126L;
        } else {
            this.f1125K = new C0382f();
            c0391o = new C0391o();
        }
        this.f1126L = c0391o;
    }

    /* renamed from: h */
    public static long m2999h(int i, int i2) {
        return i2 | (i << 32);
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0153k
    /* renamed from: e */
    public void mo2988e() {
        this.f1125K = this.f1125K.clone();
        this.f1126L = this.f1126L.clone();
    }

    /* renamed from: i */
    public int m2998i(int i) {
        if (i < 0) {
            return 0;
        }
        return ((Integer) this.f1126L.m2609d(i, 0)).intValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C0150h(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C0150h(this, resources);
    }
}