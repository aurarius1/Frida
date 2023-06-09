package p010b.p087x.p088a.p089a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p048e.p049b.AbstractC0505k;

/* renamed from: b.x.a.a.t */
/* loaded from: classes.dex */
public class C1105t extends AbstractC1095j {

    /* renamed from: c */
    public static final PorterDuff.Mode f4138c = PorterDuff.Mode.SRC_IN;

    /* renamed from: d */
    public C1103r f4139d;

    /* renamed from: e */
    public PorterDuffColorFilter f4140e;

    /* renamed from: f */
    public ColorFilter f4141f;

    /* renamed from: g */
    public boolean f4142g;

    /* renamed from: h */
    public boolean f4143h;

    /* renamed from: i */
    public final float[] f4144i;

    /* renamed from: j */
    public final Matrix f4145j;

    /* renamed from: k */
    public final Rect f4146k;

    public C1105t() {
        this.f4143h = true;
        this.f4144i = new float[9];
        this.f4145j = new Matrix();
        this.f4146k = new Rect();
        this.f4139d = new C1103r();
    }

    public C1105t(C1103r c1103r) {
        this.f4143h = true;
        this.f4144i = new float[9];
        this.f4145j = new Matrix();
        this.f4146k = new Rect();
        this.f4139d = c1103r;
        this.f4140e = m1235b(c1103r.f4127c, c1103r.f4128d);
    }

    /* renamed from: a */
    public static C1105t m1236a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1105t c1105t = new C1105t();
        c1105t.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1105t;
    }

    /* renamed from: b */
    public PorterDuffColorFilter m1235b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3499e(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f4130f.getHeight()) == false) goto L68;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4146k);
        if (this.f4146k.width() <= 0 || this.f4146k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4141f;
        if (colorFilter == null) {
            colorFilter = this.f4140e;
        }
        canvas.getMatrix(this.f4145j);
        this.f4145j.getValues(this.f4144i);
        float abs = Math.abs(this.f4144i[0]);
        float abs2 = Math.abs(this.f4144i[4]);
        float abs3 = Math.abs(this.f4144i[1]);
        float abs4 = Math.abs(this.f4144i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f4146k.width() * abs));
        int min2 = Math.min(2048, (int) (this.f4146k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f4146k;
        canvas.translate(rect.left, rect.top);
        if (Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && AbstractC0022t.m3529E(this) == 1) {
            canvas.translate(this.f4146k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f4146k.offsetTo(0, 0);
        C1103r c1103r = this.f4139d;
        Bitmap bitmap = c1103r.f4130f;
        if (bitmap != null) {
        }
        c1103r.f4130f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
        c1103r.f4135k = true;
        if (this.f4143h) {
            C1103r c1103r2 = this.f4139d;
            if (!(!c1103r2.f4135k && c1103r2.f4131g == c1103r2.f4127c && c1103r2.f4132h == c1103r2.f4128d && c1103r2.f4134j == c1103r2.f4129e && c1103r2.f4133i == c1103r2.f4126b.getRootAlpha())) {
                this.f4139d.m1237b(min, min2);
                C1103r c1103r3 = this.f4139d;
                c1103r3.f4131g = c1103r3.f4127c;
                c1103r3.f4132h = c1103r3.f4128d;
                c1103r3.f4133i = c1103r3.f4126b.getRootAlpha();
                c1103r3.f4134j = c1103r3.f4129e;
                c1103r3.f4135k = false;
            }
        } else {
            this.f4139d.m1237b(min, min2);
        }
        C1103r c1103r4 = this.f4139d;
        Rect rect2 = this.f4146k;
        if ((c1103r4.f4126b.getRootAlpha() < 255) || colorFilter != null) {
            if (c1103r4.f4136l == null) {
                Paint paint2 = new Paint();
                c1103r4.f4136l = paint2;
                paint2.setFilterBitmap(true);
            }
            c1103r4.f4136l.setAlpha(c1103r4.f4126b.getRootAlpha());
            c1103r4.f4136l.setColorFilter(colorFilter);
            paint = c1103r4.f4136l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(c1103r4.f4130f, (Rect) null, rect2, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                return drawable.getAlpha();
            }
            return 0;
        }
        return this.f4139d.f4126b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4139d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
            return null;
        }
        return this.f4141f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4078b == null || Build.VERSION.SDK_INT < 24) {
            this.f4139d.f4125a = getChangingConfigurations();
            return this.f4139d;
        }
        return new C1104s(this.f4078b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4139d.f4126b.f4118k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4139d.f4126b.f4117j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        ArrayDeque arrayDeque;
        C1102q c1102q;
        C1103r c1103r;
        ArrayDeque arrayDeque2;
        C1102q c1102q2;
        C1103r c1103r2;
        TypedArray typedArray;
        C1099n c1099n;
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        C1103r c1103r3 = this.f4139d;
        c1103r3.f4126b = new C1102q();
        TypedArray m2394k = AbstractC0505k.m2394k(resources, theme, attributeSet, AbstractC1086a.f4051a);
        C1103r c1103r4 = this.f4139d;
        C1102q c1102q3 = c1103r4.f4126b;
        int i2 = !AbstractC0505k.m2396i(xmlPullParser, "tintMode") ? -1 : m2394k.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1103r4.f4128d = mode;
        int i4 = 1;
        if (AbstractC0505k.m2396i(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            m2394k.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = m2394k.getResources();
                try {
                    colorStateList = AbstractC0022t.m3473r(resources2, resources2.getXml(m2394k.getResourceId(1, 0)), theme);
                } catch (Exception unused) {
                }
            }
            if (colorStateList != null) {
                c1103r4.f4127c = colorStateList;
            }
            boolean z = c1103r4.f4129e;
            if (AbstractC0505k.m2396i(xmlPullParser, "autoMirrored")) {
                z = m2394k.getBoolean(5, z);
            }
            c1103r4.f4129e = z;
            float f = c1102q3.f4119l;
            if (AbstractC0505k.m2396i(xmlPullParser, "viewportWidth")) {
                f = m2394k.getFloat(7, f);
            }
            c1102q3.f4119l = f;
            float f2 = c1102q3.f4120m;
            if (AbstractC0505k.m2396i(xmlPullParser, "viewportHeight")) {
                f2 = m2394k.getFloat(8, f2);
            }
            c1102q3.f4120m = f2;
            if (c1102q3.f4119l > 0.0f) {
                throw new XmlPullParserException(m2394k.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (f2 <= 0.0f) {
                throw new XmlPullParserException(m2394k.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
            } else {
                c1102q3.f4117j = m2394k.getDimension(3, c1102q3.f4117j);
                float dimension = m2394k.getDimension(2, c1102q3.f4118k);
                c1102q3.f4118k = dimension;
                if (c1102q3.f4117j <= 0.0f) {
                    throw new XmlPullParserException(m2394k.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    float alpha = c1102q3.getAlpha();
                    if (AbstractC0505k.m2396i(xmlPullParser, "alpha")) {
                        alpha = m2394k.getFloat(4, alpha);
                    }
                    c1102q3.setAlpha(alpha);
                    String string = m2394k.getString(0);
                    if (string != null) {
                        c1102q3.f4122o = string;
                        c1102q3.f4124q.put(string, c1102q3);
                    }
                    m2394k.recycle();
                    c1103r3.f4125a = getChangingConfigurations();
                    c1103r3.f4135k = true;
                    C1103r c1103r5 = this.f4139d;
                    C1102q c1102q4 = c1103r5.f4126b;
                    ArrayDeque arrayDeque3 = new ArrayDeque();
                    arrayDeque3.push(c1102q4.f4116i);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z2 = true;
                    while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            C1099n c1099n2 = (C1099n) arrayDeque3.peek();
                            if ("path".equals(name)) {
                                C1098m c1098m = new C1098m();
                                TypedArray m2394k2 = AbstractC0505k.m2394k(resources, theme, attributeSet, AbstractC1086a.f4053c);
                                c1098m.f4079e = null;
                                if (AbstractC0505k.m2396i(xmlPullParser, "pathData")) {
                                    String string2 = m2394k2.getString(0);
                                    if (string2 != null) {
                                        c1098m.f4105b = string2;
                                    }
                                    String string3 = m2394k2.getString(2);
                                    if (string3 != null) {
                                        c1098m.f4104a = AbstractC0022t.m3469t(string3);
                                    }
                                    arrayDeque2 = arrayDeque3;
                                    c1102q2 = c1102q4;
                                    c1103r2 = c1103r5;
                                    i = depth;
                                    typedArray = m2394k2;
                                    c1099n = c1099n2;
                                    c1098m.f4082h = AbstractC0505k.m2401d(m2394k2, xmlPullParser, theme, "fillColor", 1, 0);
                                    float f3 = c1098m.f4084j;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "fillAlpha")) {
                                        f3 = typedArray.getFloat(12, f3);
                                    }
                                    c1098m.f4084j = f3;
                                    int i6 = !AbstractC0505k.m2396i(xmlPullParser, "strokeLineCap") ? -1 : typedArray.getInt(8, -1);
                                    Paint.Cap cap = c1098m.f4088n;
                                    if (i6 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (i6 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (i6 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    c1098m.f4088n = cap;
                                    int i7 = !AbstractC0505k.m2396i(xmlPullParser, "strokeLineJoin") ? -1 : typedArray.getInt(9, -1);
                                    Paint.Join join = c1098m.f4089o;
                                    if (i7 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (i7 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (i7 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    c1098m.f4089o = join;
                                    float f4 = c1098m.f4090p;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "strokeMiterLimit")) {
                                        f4 = typedArray.getFloat(10, f4);
                                    }
                                    c1098m.f4090p = f4;
                                    c1098m.f4080f = AbstractC0505k.m2401d(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                                    float f5 = c1098m.f4083i;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "strokeAlpha")) {
                                        f5 = typedArray.getFloat(11, f5);
                                    }
                                    c1098m.f4083i = f5;
                                    float f6 = c1098m.f4081g;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "strokeWidth")) {
                                        f6 = typedArray.getFloat(4, f6);
                                    }
                                    c1098m.f4081g = f6;
                                    float f7 = c1098m.f4086l;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "trimPathEnd")) {
                                        f7 = typedArray.getFloat(6, f7);
                                    }
                                    c1098m.f4086l = f7;
                                    float f8 = c1098m.f4087m;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "trimPathOffset")) {
                                        f8 = typedArray.getFloat(7, f8);
                                    }
                                    c1098m.f4087m = f8;
                                    float f9 = c1098m.f4085k;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "trimPathStart")) {
                                        f9 = typedArray.getFloat(5, f9);
                                    }
                                    c1098m.f4085k = f9;
                                    int i8 = c1098m.f4106c;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "fillType")) {
                                        i8 = typedArray.getInt(13, i8);
                                    }
                                    c1098m.f4106c = i8;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    c1102q2 = c1102q4;
                                    c1103r2 = c1103r5;
                                    c1099n = c1099n2;
                                    i = depth;
                                    typedArray = m2394k2;
                                }
                                typedArray.recycle();
                                c1099n.f4092b.add(c1098m);
                                c1102q = c1102q2;
                                if (c1098m.getPathName() != null) {
                                    c1102q.f4124q.put(c1098m.getPathName(), c1098m);
                                }
                                c1103r = c1103r2;
                                c1103r.f4125a |= c1098m.f4107d;
                                arrayDeque = arrayDeque2;
                                i4 = 1;
                                z2 = false;
                            } else {
                                ArrayDeque arrayDeque4 = arrayDeque3;
                                c1102q = c1102q4;
                                c1103r = c1103r5;
                                i = depth;
                                if ("clip-path".equals(name)) {
                                    C1097l c1097l = new C1097l();
                                    if (AbstractC0505k.m2396i(xmlPullParser, "pathData")) {
                                        TypedArray m2394k3 = AbstractC0505k.m2394k(resources, theme, attributeSet, AbstractC1086a.f4054d);
                                        String string4 = m2394k3.getString(0);
                                        if (string4 != null) {
                                            c1097l.f4105b = string4;
                                        }
                                        String string5 = m2394k3.getString(1);
                                        if (string5 != null) {
                                            c1097l.f4104a = AbstractC0022t.m3469t(string5);
                                        }
                                        c1097l.f4106c = !AbstractC0505k.m2396i(xmlPullParser, "fillType") ? 0 : m2394k3.getInt(2, 0);
                                        m2394k3.recycle();
                                    }
                                    c1099n2.f4092b.add(c1097l);
                                    if (c1097l.getPathName() != null) {
                                        c1102q.f4124q.put(c1097l.getPathName(), c1097l);
                                    }
                                    c1103r.f4125a = c1097l.f4107d | c1103r.f4125a;
                                } else if ("group".equals(name)) {
                                    C1099n c1099n3 = new C1099n();
                                    TypedArray m2394k4 = AbstractC0505k.m2394k(resources, theme, attributeSet, AbstractC1086a.f4052b);
                                    c1099n3.f4102l = null;
                                    float f10 = c1099n3.f4093c;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "rotation")) {
                                        f10 = m2394k4.getFloat(5, f10);
                                    }
                                    c1099n3.f4093c = f10;
                                    i4 = 1;
                                    c1099n3.f4094d = m2394k4.getFloat(1, c1099n3.f4094d);
                                    c1099n3.f4095e = m2394k4.getFloat(2, c1099n3.f4095e);
                                    float f11 = c1099n3.f4096f;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "scaleX")) {
                                        f11 = m2394k4.getFloat(3, f11);
                                    }
                                    c1099n3.f4096f = f11;
                                    float f12 = c1099n3.f4097g;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "scaleY")) {
                                        f12 = m2394k4.getFloat(4, f12);
                                    }
                                    c1099n3.f4097g = f12;
                                    float f13 = c1099n3.f4098h;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "translateX")) {
                                        f13 = m2394k4.getFloat(6, f13);
                                    }
                                    c1099n3.f4098h = f13;
                                    float f14 = c1099n3.f4099i;
                                    if (AbstractC0505k.m2396i(xmlPullParser, "translateY")) {
                                        f14 = m2394k4.getFloat(7, f14);
                                    }
                                    c1099n3.f4099i = f14;
                                    String string6 = m2394k4.getString(0);
                                    if (string6 != null) {
                                        c1099n3.f4103m = string6;
                                    }
                                    c1099n3.m1242c();
                                    m2394k4.recycle();
                                    c1099n2.f4092b.add(c1099n3);
                                    arrayDeque = arrayDeque4;
                                    arrayDeque.push(c1099n3);
                                    if (c1099n3.getGroupName() != null) {
                                        c1102q.f4124q.put(c1099n3.getGroupName(), c1099n3);
                                    }
                                    c1103r.f4125a = c1099n3.f4101k | c1103r.f4125a;
                                }
                                arrayDeque = arrayDeque4;
                                i4 = 1;
                            }
                        } else {
                            i = depth;
                            C1103r c1103r6 = c1103r5;
                            arrayDeque = arrayDeque3;
                            c1102q = c1102q4;
                            c1103r = c1103r6;
                            if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                        }
                        eventType = xmlPullParser.next();
                        i3 = 3;
                        depth = i;
                        C1103r c1103r7 = c1103r;
                        c1102q4 = c1102q;
                        arrayDeque3 = arrayDeque;
                        c1103r5 = c1103r7;
                    }
                    if (!z2) {
                        this.f4140e = m1235b(c1103r3.f4127c, c1103r3.f4128d);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    throw new XmlPullParserException(m2394k.getPositionDescription() + "<vector> tag requires height > 0");
                }
            }
        }
        colorStateList = null;
        if (colorStateList != null) {
        }
        boolean z3 = c1103r4.f4129e;
        if (AbstractC0505k.m2396i(xmlPullParser, "autoMirrored")) {
        }
        c1103r4.f4129e = z3;
        float f15 = c1102q3.f4119l;
        if (AbstractC0505k.m2396i(xmlPullParser, "viewportWidth")) {
        }
        c1102q3.f4119l = f15;
        float f22 = c1102q3.f4120m;
        if (AbstractC0505k.m2396i(xmlPullParser, "viewportHeight")) {
        }
        c1102q3.f4120m = f22;
        if (c1102q3.f4119l > 0.0f) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4078b;
        return drawable != null ? AbstractC0022t.m3521M(drawable) : this.f4139d.f4129e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C1103r c1103r;
        ColorStateList colorStateList;
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c1103r = this.f4139d) != null && (c1103r.m1238a() || ((colorStateList = this.f4139d.f4127c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4142g && super.mutate() == this) {
            this.f4139d = new C1103r(this.f4139d);
            this.f4142g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1103r c1103r = this.f4139d;
        ColorStateList colorStateList = c1103r.f4127c;
        if (colorStateList != null && (mode = c1103r.f4128d) != null) {
            this.f4140e = m1235b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (c1103r.m1238a()) {
            boolean mo1240b = c1103r.f4126b.f4116i.mo1240b(iArr);
            c1103r.f4135k |= mo1240b;
            if (mo1240b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4139d.f4126b.getRootAlpha() != i) {
            this.f4139d.f4126b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3509Y(drawable, z);
        } else {
            this.f4139d.f4129e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4141f = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTint(int i) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3482m0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3480n0(drawable, colorStateList);
            return;
        }
        C1103r c1103r = this.f4139d;
        if (c1103r.f4127c != colorStateList) {
            c1103r.f4127c = colorStateList;
            this.f4140e = m1235b(colorStateList, c1103r.f4128d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3478o0(drawable, mode);
            return;
        }
        C1103r c1103r = this.f4139d;
        if (c1103r.f4128d != mode) {
            c1103r.f4128d = mode;
            this.f4140e = m1235b(c1103r.f4127c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}