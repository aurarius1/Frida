package p010b.p016c.p020m.p021a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import p000a.p001a.p002a.p004b.AbstractC0022t;

/* renamed from: b.c.m.a.l */
/* loaded from: classes.dex */
public abstract class AbstractC0154l extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public static final /* synthetic */ int f1175b = 0;

    /* renamed from: c */
    public AbstractC0153k f1176c;

    /* renamed from: d */
    public Rect f1177d;

    /* renamed from: e */
    public Drawable f1178e;

    /* renamed from: f */
    public Drawable f1179f;

    /* renamed from: h */
    public boolean f1181h;

    /* renamed from: j */
    public boolean f1183j;

    /* renamed from: k */
    public Runnable f1184k;

    /* renamed from: l */
    public long f1185l;

    /* renamed from: m */
    public long f1186m;

    /* renamed from: n */
    public C0152j f1187n;

    /* renamed from: g */
    public int f1180g = 255;

    /* renamed from: i */
    public int f1182i = -1;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2986a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.f1181h = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f1178e;
        if (drawable2 != null) {
            long j = this.f1185l;
            if (j != 0) {
                if (j <= uptimeMillis) {
                    drawable2.setAlpha(this.f1180g);
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.f1176c.f1140A)) * this.f1180g) / 255);
                    z2 = true;
                    drawable = this.f1179f;
                    if (drawable != null) {
                        long j2 = this.f1186m;
                        if (j2 != 0) {
                            if (j2 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.f1176c.f1141B) * this.f1180g) / 255);
                                if (z && z3) {
                                    scheduleSelf(this.f1184k, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.f1179f = null;
                        }
                        z3 = z2;
                        if (z) {
                            return;
                        }
                        return;
                    }
                    this.f1186m = 0L;
                    z3 = z2;
                    if (z) {
                    }
                }
            }
            z2 = false;
            drawable = this.f1179f;
            if (drawable != null) {
            }
            this.f1186m = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f1185l = 0L;
        z2 = false;
        drawable = this.f1179f;
        if (drawable != null) {
        }
        this.f1186m = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        AbstractC0153k abstractC0153k = this.f1176c;
        abstractC0153k.getClass();
        if (theme != null) {
            abstractC0153k.m2990c();
            int i = abstractC0153k.f1156h;
            Drawable[] drawableArr = abstractC0153k.f1155g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && AbstractC0022t.m3499e(drawableArr[i2])) {
                    AbstractC0022t.m3505b(drawableArr[i2], theme);
                    abstractC0153k.f1153e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            abstractC0153k.m2987f(theme.getResources());
        }
    }

    /* renamed from: b */
    public final void m2985b(Drawable drawable) {
        if (this.f1187n == null) {
            this.f1187n = new C0152j();
        }
        C0152j c0152j = this.f1187n;
        c0152j.f1139b = drawable.getCallback();
        drawable.setCallback(c0152j);
        try {
            if (this.f1176c.f1140A <= 0 && this.f1181h) {
                drawable.setAlpha(this.f1180g);
            }
            AbstractC0153k abstractC0153k = this.f1176c;
            if (abstractC0153k.f1144E) {
                drawable.setColorFilter(abstractC0153k.f1143D);
            } else {
                if (abstractC0153k.f1147H) {
                    AbstractC0022t.m3480n0(drawable, abstractC0153k.f1145F);
                }
                AbstractC0153k abstractC0153k2 = this.f1176c;
                if (abstractC0153k2.f1148I) {
                    AbstractC0022t.m3478o0(drawable, abstractC0153k2.f1146G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1176c.f1172x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                AbstractC0022t.m3494g0(drawable, AbstractC0022t.m3529E(this));
            }
            if (i >= 19) {
                AbstractC0022t.m3509Y(drawable, this.f1176c.f1142C);
            }
            Rect rect = this.f1177d;
            if (i >= 21 && rect != null) {
                AbstractC0022t.m3498e0(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0152j c0152j2 = this.f1187n;
            Drawable.Callback callback = c0152j2.f1139b;
            c0152j2.f1139b = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2984c(int i) {
        Runnable runnable;
        if (i == this.f1182i) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f1176c.f1141B > 0) {
            Drawable drawable = this.f1179f;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f1178e;
            if (drawable2 != null) {
                this.f1179f = drawable2;
                this.f1186m = this.f1176c.f1141B + uptimeMillis;
            } else {
                this.f1179f = null;
                this.f1186m = 0L;
            }
        } else {
            Drawable drawable3 = this.f1178e;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            AbstractC0153k abstractC0153k = this.f1176c;
            if (i < abstractC0153k.f1156h) {
                Drawable m2989d = abstractC0153k.m2989d(i);
                this.f1178e = m2989d;
                this.f1182i = i;
                if (m2989d != null) {
                    int i2 = this.f1176c.f1140A;
                    if (i2 > 0) {
                        this.f1185l = uptimeMillis + i2;
                    }
                    m2985b(m2989d);
                }
                if (this.f1185l == 0 || this.f1186m != 0) {
                    runnable = this.f1184k;
                    if (runnable != null) {
                        this.f1184k = new RunnableC0151i(this);
                    } else {
                        unscheduleSelf(runnable);
                    }
                    m2986a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f1178e = null;
        this.f1182i = -1;
        if (this.f1185l == 0) {
        }
        runnable = this.f1184k;
        if (runnable != null) {
        }
        m2986a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f1176c.canApplyTheme();
    }

    /* renamed from: d */
    public abstract void mo2983d(AbstractC0153k abstractC0153k);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1179f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1180g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1176c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        AbstractC0153k abstractC0153k = this.f1176c;
        boolean z = false;
        if (!abstractC0153k.f1170v) {
            abstractC0153k.m2990c();
            abstractC0153k.f1170v = true;
            int i = abstractC0153k.f1156h;
            Drawable[] drawableArr = abstractC0153k.f1155g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    abstractC0153k.f1171w = true;
                    z = true;
                    break;
                } else if (drawableArr[i2].getConstantState() == null) {
                    abstractC0153k.f1171w = false;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            z = abstractC0153k.f1171w;
        }
        if (z) {
            this.f1176c.f1152d = getChangingConfigurations();
            return this.f1176c;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1178e;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1177d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k.f1160l) {
            if (!abstractC0153k.f1161m) {
                abstractC0153k.m2991b();
            }
            return abstractC0153k.f1163o;
        }
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k.f1160l) {
            if (!abstractC0153k.f1161m) {
                abstractC0153k.m2991b();
            }
            return abstractC0153k.f1162n;
        }
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k.f1160l) {
            if (!abstractC0153k.f1161m) {
                abstractC0153k.m2991b();
            }
            return abstractC0153k.f1165q;
        }
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k.f1160l) {
            if (!abstractC0153k.f1161m) {
                abstractC0153k.m2991b();
            }
            return abstractC0153k.f1164p;
        }
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1178e;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k.f1166r) {
            return abstractC0153k.f1167s;
        }
        abstractC0153k.m2990c();
        int i = abstractC0153k.f1156h;
        Drawable[] drawableArr = abstractC0153k.f1155g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        abstractC0153k.f1167s = opacity;
        abstractC0153k.f1166r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        AbstractC0153k abstractC0153k = this.f1176c;
        Rect rect2 = null;
        boolean z = true;
        if (!abstractC0153k.f1157i) {
            Rect rect3 = abstractC0153k.f1159k;
            if (rect3 != null || abstractC0153k.f1158j) {
                rect2 = rect3;
            } else {
                abstractC0153k.m2990c();
                Rect rect4 = new Rect();
                int i = abstractC0153k.f1156h;
                Drawable[] drawableArr = abstractC0153k.f1155g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                abstractC0153k.f1158j = true;
                abstractC0153k.f1159k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f1178e;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if ((this.f1176c.f1142C && AbstractC0022t.m3529E(this) == 1) ? false : false) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k != null) {
            abstractC0153k.f1166r = false;
            abstractC0153k.f1168t = false;
        }
        if (drawable != this.f1178e || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1176c.f1142C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1179f;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1179f = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1178e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1181h) {
                this.f1178e.setAlpha(this.f1180g);
            }
        }
        if (this.f1186m != 0) {
            this.f1186m = 0L;
            z = true;
        }
        if (this.f1185l != 0) {
            this.f1185l = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1183j && super.mutate() == this) {
            C0150h c0150h = (C0150h) this;
            C0145c c0145c = new C0145c(c0150h.f1133q, c0150h, null);
            c0145c.mo2988e();
            mo2983d(c0145c);
            this.f1183j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1179f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1178e;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        AbstractC0153k abstractC0153k = this.f1176c;
        int i2 = this.f1182i;
        int i3 = abstractC0153k.f1156h;
        Drawable[] drawableArr = abstractC0153k.f1155g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean m3494g0 = Build.VERSION.SDK_INT >= 23 ? AbstractC0022t.m3494g0(drawableArr[i4], i) : false;
                if (i4 == i2) {
                    z = m3494g0;
                }
            }
        }
        abstractC0153k.f1174z = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f1179f;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f1178e;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f1178e || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f1181h && this.f1180g == i) {
            return;
        }
        this.f1181h = true;
        this.f1180g = i;
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            if (this.f1185l == 0) {
                drawable.setAlpha(i);
            } else {
                m2986a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k.f1142C != z) {
            abstractC0153k.f1142C = z;
            Drawable drawable = this.f1178e;
            if (drawable != null) {
                AbstractC0022t.m3509Y(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0153k abstractC0153k = this.f1176c;
        abstractC0153k.f1144E = true;
        if (abstractC0153k.f1143D != colorFilter) {
            abstractC0153k.f1143D = colorFilter;
            Drawable drawable = this.f1178e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC0153k abstractC0153k = this.f1176c;
        if (abstractC0153k.f1172x != z) {
            abstractC0153k.f1172x = z;
            Drawable drawable = this.f1178e;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            AbstractC0022t.m3500d0(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f1177d;
        if (rect == null) {
            this.f1177d = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f1178e;
        if (drawable != null) {
            AbstractC0022t.m3498e0(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC0153k abstractC0153k = this.f1176c;
        abstractC0153k.f1147H = true;
        if (abstractC0153k.f1145F != colorStateList) {
            abstractC0153k.f1145F = colorStateList;
            AbstractC0022t.m3480n0(this.f1178e, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0153k abstractC0153k = this.f1176c;
        abstractC0153k.f1148I = true;
        if (abstractC0153k.f1146G != mode) {
            abstractC0153k.f1146G = mode;
            AbstractC0022t.m3478o0(this.f1178e, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1179f;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1178e;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f1178e || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}