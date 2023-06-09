package p010b.p087x.p088a.p089a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p036g.C0378b;
import p010b.p046j.p048e.p049b.AbstractC0505k;

/* renamed from: b.x.a.a.e */
/* loaded from: classes.dex */
public class C1090e extends AbstractC1095j implements Animatable {

    /* renamed from: c */
    public C1088c f4070c;

    /* renamed from: d */
    public Context f4071d;

    /* renamed from: e */
    public ArgbEvaluator f4072e = null;

    /* renamed from: f */
    public final Drawable.Callback f4073f;

    public C1090e(Context context, C1088c c1088c, Resources resources) {
        C1087b c1087b = new C1087b(this);
        this.f4073f = c1087b;
        this.f4071d = context;
        this.f4070c = new C1088c(null, c1087b, null);
    }

    /* renamed from: a */
    public final void m1249a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m1249a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4072e == null) {
                    this.f4072e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4072e);
            }
        }
    }

    @Override // p010b.p087x.p088a.p089a.AbstractC1095j, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3505b(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            return AbstractC0022t.m3499e(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4070c.f4065b.draw(canvas);
        if (this.f4070c.f4066c.isStarted()) {
            invalidateSelf();
        }
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
        return this.f4070c.f4065b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4070c.f4064a;
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
        return this.f4070c.f4065b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4078b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1089d(this.f4078b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4070c.f4065b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4070c.f4065b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.getOpacity() : this.f4070c.f4065b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser xmlResourceParser;
        int i;
        Animator m1248a;
        C1105t c1105t;
        int next;
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
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        for (int i2 = 1; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3); i2 = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m2394k = AbstractC0505k.m2394k(resources, theme, attributeSet, AbstractC1086a.f4055e);
                    int resourceId = m2394k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C1105t.f4138c;
                        if (Build.VERSION.SDK_INT >= 24) {
                            c1105t = new C1105t();
                            c1105t.f4078b = AbstractC0505k.m2402c(resources, resourceId, theme);
                            new C1104s(c1105t.f4078b.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                while (true) {
                                    next = xml.next();
                                    if (next == 2 || next == i2) {
                                        break;
                                    }
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                    break;
                                }
                                c1105t = C1105t.m1236a(resources, xml, asAttributeSet, theme);
                            } catch (IOException | XmlPullParserException unused) {
                                c1105t = null;
                            }
                        }
                        c1105t.f4143h = false;
                        c1105t.setCallback(this.f4073f);
                        C1105t c1105t2 = this.f4070c.f4065b;
                        if (c1105t2 != null) {
                            c1105t2.setCallback(null);
                        }
                        this.f4070c.f4065b = c1105t;
                    }
                    m2394k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1086a.f4056f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i2, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4071d;
                        if (context != null) {
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 24) {
                                m1248a = AnimatorInflater.loadAnimator(context, resourceId2);
                                i = i3;
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        xmlResourceParser = resources2.getAnimation(resourceId2);
                                        try {
                                            i = i3;
                                            m1248a = AbstractC1092g.m1248a(context, resources2, theme2, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
                                            xmlResourceParser.close();
                                        } catch (IOException e) {
                                            e = e;
                                            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException.initCause(e);
                                            throw notFoundException;
                                        } catch (XmlPullParserException e2) {
                                            e = e2;
                                            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException2.initCause(e);
                                            throw notFoundException2;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (xmlResourceParser != null) {
                                                xmlResourceParser.close();
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                    } catch (XmlPullParserException e4) {
                                        e = e4;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = null;
                                }
                            }
                            m1248a.setTarget(this.f4070c.f4065b.f4139d.f4126b.f4124q.getOrDefault(string, null));
                            if (i < 21) {
                                m1249a(m1248a);
                            }
                            C1088c c1088c = this.f4070c;
                            if (c1088c.f4067d == null) {
                                c1088c.f4067d = new ArrayList();
                                this.f4070c.f4068e = new C0378b();
                            }
                            this.f4070c.f4067d.add(m1248a);
                            this.f4070c.f4068e.put(m1248a, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                    eventType = xmlPullParser.next();
                }
            }
            eventType = xmlPullParser.next();
        }
        C1088c c1088c2 = this.f4070c;
        if (c1088c2.f4066c == null) {
            c1088c2.f4066c = new AnimatorSet();
        }
        c1088c2.f4066c.playTogether(c1088c2.f4067d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4078b;
        return drawable != null ? AbstractC0022t.m3521M(drawable) : this.f4070c.f4065b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f4078b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4070c.f4066c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.isStateful() : this.f4070c.f4065b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4070c.f4065b.setBounds(rect);
        }
    }

    @Override // p010b.p087x.p088a.p089a.AbstractC1095j, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.setLevel(i) : this.f4070c.f4065b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4078b;
        return drawable != null ? drawable.setState(iArr) : this.f4070c.f4065b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4070c.f4065b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3509Y(drawable, z);
            return;
        }
        C1105t c1105t = this.f4070c.f4065b;
        Drawable drawable2 = c1105t.f4078b;
        if (drawable2 != null) {
            AbstractC0022t.m3509Y(drawable2, z);
        } else {
            c1105t.f4139d.f4129e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C1105t c1105t = this.f4070c.f4065b;
        Drawable drawable2 = c1105t.f4078b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        c1105t.f4141f = colorFilter;
        c1105t.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTint(int i) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3482m0(drawable, i);
        } else {
            this.f4070c.f4065b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3480n0(drawable, colorStateList);
        } else {
            this.f4070c.f4065b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            AbstractC0022t.m3478o0(drawable, mode);
        } else {
            this.f4070c.f4065b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f4070c.f4065b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f4070c.f4066c.isStarted()) {
        } else {
            this.f4070c.f4066c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f4078b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4070c.f4066c.end();
        }
    }
}