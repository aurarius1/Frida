package p010b.p016c.p020m.p021a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p016c.p022n.AbstractC0158b;
import p010b.p016c.p026q.C0296p2;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p046j.p050f.p051p.InterfaceC0521a;
import p010b.p087x.p088a.p089a.C1090e;
import p010b.p087x.p088a.p089a.C1105t;
import p093c.p094a.p095a.p096a.AbstractC1124a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.c.m.a.h */
/* loaded from: classes.dex */
public class C0150h extends AbstractC0156n implements InterfaceC0521a {

    /* renamed from: q */
    public C0145c f1133q;

    /* renamed from: r */
    public AbstractC0149g f1134r;

    /* renamed from: s */
    public int f1135s;

    /* renamed from: t */
    public int f1136t;

    /* renamed from: u */
    public boolean f1137u;

    public C0150h(C0145c c0145c, Resources resources) {
        super(null);
        this.f1135s = -1;
        this.f1136t = -1;
        mo2983d(new C0145c(c0145c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0247, code lost:
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024e, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01de  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0150h m2993e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        Drawable drawable;
        int next;
        int next2;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0150h c0150h = new C0150h(null, null);
            TypedArray m2394k = AbstractC0505k.m2394k(resources, theme2, attributeSet2, AbstractC0158b.AnimatedStateListDrawableCompat);
            int i = 1;
            c0150h.setVisible(m2394k.getBoolean(AbstractC0158b.AnimatedStateListDrawableCompat_android_visible, true), true);
            C0145c c0145c = c0150h.f1133q;
            if (Build.VERSION.SDK_INT >= 21) {
                c0145c.f1152d |= m2394k.getChangingConfigurations();
            }
            c0145c.f1157i = m2394k.getBoolean(AbstractC0158b.AnimatedStateListDrawableCompat_android_variablePadding, c0145c.f1157i);
            c0145c.f1160l = m2394k.getBoolean(AbstractC0158b.AnimatedStateListDrawableCompat_android_constantSize, c0145c.f1160l);
            c0145c.f1140A = m2394k.getInt(AbstractC0158b.AnimatedStateListDrawableCompat_android_enterFadeDuration, c0145c.f1140A);
            c0145c.f1141B = m2394k.getInt(AbstractC0158b.AnimatedStateListDrawableCompat_android_exitFadeDuration, c0145c.f1141B);
            c0150h.setDither(m2394k.getBoolean(AbstractC0158b.AnimatedStateListDrawableCompat_android_dither, c0145c.f1172x));
            c0150h.f1176c.m2987f(resources);
            m2394k.recycle();
            int depth2 = xmlPullParser.getDepth() + 1;
            Context context2 = context;
            Resources resources2 = resources;
            C0150h c0150h2 = c0150h;
            while (true) {
                int next3 = xmlPullParser.next();
                if (next3 == i || ((depth = xmlPullParser.getDepth()) < depth2 && next3 == 3)) {
                    break;
                } else if (next3 == 2 && depth <= depth2) {
                    if (xmlPullParser.getName().equals("item")) {
                        TypedArray m2394k2 = AbstractC0505k.m2394k(resources2, theme2, attributeSet2, AbstractC0158b.AnimatedStateListDrawableItem);
                        int resourceId = m2394k2.getResourceId(AbstractC0158b.AnimatedStateListDrawableItem_android_id, 0);
                        int resourceId2 = m2394k2.getResourceId(AbstractC0158b.AnimatedStateListDrawableItem_android_drawable, -1);
                        Drawable m2773f = resourceId2 > 0 ? C0296p2.m2775d().m2773f(context2, resourceId2) : null;
                        m2394k2.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i2 = 0;
                        for (int i3 = 0; i3 < attributeCount; i3++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i3);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i4 = i2 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i2] = attributeNameResource;
                                i2 = i4;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i2);
                        if (m2773f == null) {
                            do {
                                next2 = xmlPullParser.next();
                            } while (next2 == 4);
                            if (next2 != 2) {
                                throw new XmlPullParserException(AbstractC1124a.m1188h(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                            }
                            m2773f = xmlPullParser.getName().equals("vector") ? C1105t.m1236a(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                        if (m2773f != null) {
                            C0145c c0145c2 = c0150h2.f1133q;
                            int m2992a = c0145c2.m2992a(m2773f);
                            c0145c2.f1188J[m2992a] = trimStateSet;
                            c0145c2.f1126L.m2607f(m2992a, Integer.valueOf(resourceId));
                        } else {
                            throw new XmlPullParserException(AbstractC1124a.m1188h(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        }
                    } else {
                        if (xmlPullParser.getName().equals("transition")) {
                            TypedArray m2394k3 = AbstractC0505k.m2394k(resources2, theme2, attributeSet2, AbstractC0158b.AnimatedStateListDrawableTransition);
                            int resourceId3 = m2394k3.getResourceId(AbstractC0158b.AnimatedStateListDrawableTransition_android_fromId, -1);
                            int resourceId4 = m2394k3.getResourceId(AbstractC0158b.AnimatedStateListDrawableTransition_android_toId, -1);
                            int resourceId5 = m2394k3.getResourceId(AbstractC0158b.AnimatedStateListDrawableTransition_android_drawable, -1);
                            Drawable m2773f2 = resourceId5 > 0 ? C0296p2.m2775d().m2773f(context2, resourceId5) : null;
                            boolean z = m2394k3.getBoolean(AbstractC0158b.AnimatedStateListDrawableTransition_android_reversible, false);
                            m2394k3.recycle();
                            if (m2773f2 == null) {
                                do {
                                    next = xmlPullParser.next();
                                } while (next == 4);
                                if (next != 2) {
                                    throw new XmlPullParserException(AbstractC1124a.m1188h(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                                }
                                if (xmlPullParser.getName().equals("animated-vector")) {
                                    m2773f2 = new C1090e(context2, null, null);
                                    m2773f2.inflate(resources2, xmlPullParser, attributeSet2, theme2);
                                } else {
                                    drawable = Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                                    if (drawable != null) {
                                        throw new XmlPullParserException(AbstractC1124a.m1188h(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                                    }
                                    if (resourceId3 == -1 || resourceId4 == -1) {
                                        break;
                                    }
                                    C0145c c0145c3 = c0150h2.f1133q;
                                    int m2992a2 = c0145c3.m2992a(drawable);
                                    long m2999h = C0145c.m2999h(resourceId3, resourceId4);
                                    long j = z ? 8589934592L : 0L;
                                    long j2 = m2992a2;
                                    c0145c3.f1125K.m2648a(m2999h, Long.valueOf(j2 | j));
                                    if (z) {
                                        c0145c3.f1125K.m2648a(C0145c.m2999h(resourceId4, resourceId3), Long.valueOf(j2 | 4294967296L | j));
                                    }
                                }
                            }
                            drawable = m2773f2;
                            if (drawable != null) {
                            }
                        }
                        context2 = context;
                        resources2 = resources;
                        c0150h2 = c0150h;
                    }
                    i = 1;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                }
            }
            throw new XmlPullParserException(AbstractC1124a.m1188h(xmlPullParser, new StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0154l
    /* renamed from: d */
    public void mo2983d(AbstractC0153k abstractC0153k) {
        this.f1176c = abstractC0153k;
        int i = this.f1182i;
        if (i >= 0) {
            Drawable m2989d = abstractC0153k.m2989d(i);
            this.f1178e = m2989d;
            if (m2989d != null) {
                m2985b(m2989d);
            }
        }
        this.f1179f = null;
        this.f1189o = (AbstractC0155m) abstractC0153k;
        if (abstractC0153k instanceof C0145c) {
            this.f1133q = (C0145c) abstractC0153k;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0154l, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0149g abstractC0149g = this.f1134r;
        if (abstractC0149g != null) {
            abstractC0149g.mo2994d();
            this.f1134r = null;
            m2984c(this.f1135s);
            this.f1135s = -1;
            this.f1136t = -1;
        }
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0156n, p010b.p016c.p020m.p021a.AbstractC0154l, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1137u) {
            super.mutate();
            if (this == this) {
                this.f1133q.mo2988e();
                this.f1137u = true;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    @Override // p010b.p016c.p020m.p021a.AbstractC0156n, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        AbstractC0149g c0144b;
        C0145c c0145c = this.f1133q;
        int m2982g = c0145c.m2982g(iArr);
        if (m2982g < 0) {
            m2982g = c0145c.m2982g(StateSet.WILD_CARD);
        }
        int i = this.f1182i;
        boolean z2 = false;
        if (m2982g != i) {
            AbstractC0149g abstractC0149g = this.f1134r;
            if (abstractC0149g != null) {
                if (m2982g != this.f1135s) {
                    if (m2982g == this.f1136t && abstractC0149g.mo2997a()) {
                        abstractC0149g.mo2996b();
                        this.f1135s = this.f1136t;
                        this.f1136t = m2982g;
                    } else {
                        i = this.f1135s;
                        abstractC0149g.mo2994d();
                    }
                }
                z = true;
                if (!z || m2984c(m2982g)) {
                    z2 = true;
                }
            }
            this.f1134r = null;
            this.f1136t = -1;
            this.f1135s = -1;
            C0145c c0145c2 = this.f1133q;
            int m2998i = c0145c2.m2998i(i);
            int m2998i2 = c0145c2.m2998i(m2982g);
            if (m2998i2 != 0 && m2998i != 0) {
                int longValue = (int) ((Long) c0145c2.f1125K.m2643f(C0145c.m2999h(m2998i, m2998i2), -1L)).longValue();
                if (longValue >= 0) {
                    boolean z3 = (((Long) c0145c2.f1125K.m2643f(C0145c.m2999h(m2998i, m2998i2), -1L)).longValue() & 8589934592L) != 0;
                    m2984c(longValue);
                    Drawable drawable = this.f1178e;
                    if (drawable instanceof AnimationDrawable) {
                        c0144b = new C0147e((AnimationDrawable) drawable, (((Long) c0145c2.f1125K.m2643f(C0145c.m2999h(m2998i, m2998i2), -1L)).longValue() & 4294967296L) != 0, z3);
                    } else if (drawable instanceof C1090e) {
                        c0144b = new C0146d((C1090e) drawable);
                    } else if (drawable instanceof Animatable) {
                        c0144b = new C0144b((Animatable) drawable);
                    }
                    c0144b.mo2995c();
                    this.f1134r = c0144b;
                    this.f1136t = i;
                    this.f1135s = m2982g;
                    z = true;
                    if (!z) {
                    }
                    z2 = true;
                }
            }
            z = false;
            if (!z) {
            }
            z2 = true;
        }
        Drawable drawable2 = this.f1178e;
        return drawable2 != null ? z2 | drawable2.setState(iArr) : z2;
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0154l, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC0149g abstractC0149g = this.f1134r;
        if (abstractC0149g != null && (visible || z2)) {
            if (z) {
                abstractC0149g.mo2995c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}