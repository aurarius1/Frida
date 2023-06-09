package p010b.p086w;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p026q.C0302q3;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p050f.AbstractC0506a;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p069n.p070a.p071a.C0766a;
import p010b.p069n.p070a.p071a.C0767b;
import p010b.p069n.p070a.p071a.C0768c;
import p010b.p087x.p088a.p089a.animationInterpolatorC1094i;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p108i0.p114q.C1413g;
import p093c.p097b.p130z.C1671g0;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p142f.p143a.p144a.C1800b;
import p093c.p145g.p146a.p147a.p149b0.C1823s;
import p093c.p145g.p146a.p147a.p149b0.C1826v;
import p093c.p145g.p146a.p147a.p149b0.InterfaceC1825u;
import p093c.p145g.p146a.p147a.p149b0.View$OnAttachStateChangeListenerC1824t;
import p093c.p145g.p146a.p147a.p154g0.AbstractC1846d;
import p093c.p145g.p146a.p147a.p154g0.C1847e;
import p093c.p145g.p146a.p147a.p154g0.C1850h;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1853k;
import p093c.p145g.p146a.p147a.p173y.C2045a;
import p181d.p182a.AbstractC2092c;
import p181d.p182a.EnumC2090a;
import p181d.p182a.EnumC2091b;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2114e;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2125g;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p204f.p205a.p209b.AbstractC2298i;
import p204f.p205a.p209b.AbstractC2300k;
import p210g.p211a.p212a.AbstractC2308g;
import p210g.p211a.p212a.C2307f;
import p210g.p211a.p212a.InterfaceC2302a;
import p210g.p211a.p212a.p213l.AbstractC2317e;
import p210g.p211a.p212a.p213l.C2316d;
import p210g.p211a.p212a.p213l.C2318f;

/* renamed from: b.w.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC1077v0 {

    /* renamed from: a */
    public static LayoutTransition f4037a;

    /* renamed from: b */
    public static Field f4038b;

    /* renamed from: c */
    public static boolean f4039c;

    /* renamed from: d */
    public static Method f4040d;

    /* renamed from: e */
    public static boolean f4041e;

    /* renamed from: f */
    public static volatile InterfaceC2127i f4042f;

    /* renamed from: A */
    public static boolean m1303A(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: B */
    public static boolean m1302B(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    /* renamed from: C */
    public static boolean m1301C(CharSequence charSequence) {
        char charAt;
        int i = AbstractC2092c.f7003a;
        return charSequence.length() != 0 && 55296 <= (charAt = charSequence.charAt(0)) && charAt <= 56319;
    }

    /* renamed from: D */
    public static boolean m1300D(View view) {
        return AbstractC0605j0.m2241q(view) == 1;
    }

    /* renamed from: E */
    public static boolean m1299E(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_input_methods");
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : string.split(":", -1)) {
            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
            if (unflattenFromString != null && unflattenFromString.getPackageName().equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m1298F(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
        return !TextUtils.isEmpty(string) && ComponentName.unflattenFromString(string).getPackageName().equals(context.getPackageName());
    }

    /* renamed from: G */
    public static int m1297G(int i, int i2, float f) {
        return AbstractC0506a.m2389e(AbstractC0506a.m2386h(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* renamed from: H */
    public static Interpolator m1296H(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i == 17563663) {
                    return new C0766a();
                }
                if (i == 17563661) {
                    return new C0767b();
                }
                if (i == 17563662) {
                    return new C0768c();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i);
                context.getResources();
                context.getTheme();
                Interpolator m1268k = m1268k(context, animation);
                animation.close();
                return m1268k;
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: I */
    public static AbstractC2094b m1295I(Context context, int i) {
        return m1294J(context, i, R.bool.settings_default_true);
    }

    /* renamed from: J */
    public static AbstractC2094b m1294J(Context context, int i, int i2) {
        AbstractC2094b abstractC2094b;
        AbstractC2094b m173E;
        C1151a0 m182t = AnyApplication.m182t(context);
        AbstractC2094b abstractC2094b2 = ((C1785g) m182t.m1170c(R.string.settings_key_power_save_mode, R.string.settings_default_power_save_mode_value)).f5459e;
        if (i == 0) {
            abstractC2094b = AbstractC2094b.m173E(Boolean.TRUE);
        } else {
            abstractC2094b = ((C1785g) m182t.m1172a(i, i2)).f5459e;
        }
        AbstractC2094b abstractC2094b3 = abstractC2094b;
        Context applicationContext = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        AbstractC2094b m168J = new C1800b(applicationContext, intentFilter).m168J(new Intent("android.intent.action.BATTERY_OKAY"));
        Context applicationContext2 = context.getApplicationContext();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter2.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        AbstractC2094b m168J2 = new C1800b(applicationContext2, intentFilter2).m168J(new Intent("android.intent.action.ACTION_POWER_DISCONNECTED"));
        if (Build.VERSION.SDK_INT >= 21) {
            final PowerManager powerManager = (PowerManager) context.getSystemService("power");
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            m173E = new C1800b(context, intentFilter3).m172F(new InterfaceC2127i() { // from class: c.b.q.b
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    Intent intent = (Intent) obj;
                    return Boolean.valueOf(powerManager.isPowerSaveMode());
                }
            }).m168J(Boolean.FALSE);
        } else {
            m173E = AbstractC2094b.m173E(Boolean.FALSE);
        }
        return AbstractC2094b.m152m(abstractC2094b2, abstractC2094b3, m168J, m168J2, m173E, new InterfaceC2125g() { // from class: c.b.q.c
            @Override // p183e.p184a.p189o.InterfaceC2125g
            /* renamed from: a */
            public final Object mo125a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                String str = (String) obj;
                Intent intent = (Intent) obj3;
                Intent intent2 = (Intent) obj4;
                Boolean bool = (Boolean) obj5;
                if (((Boolean) obj2).booleanValue()) {
                    str.hashCode();
                    if (str.equals("always")) {
                        return Boolean.TRUE;
                    }
                    if (!str.equals("never")) {
                        return Boolean.valueOf(bool.booleanValue() || ("android.intent.action.BATTERY_LOW".equals(intent.getAction()) && "android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent2.getAction())));
                    }
                }
                return Boolean.FALSE;
            }
        }).m143v();
    }

    /* renamed from: K */
    public static void m1293K(int i, String[] strArr, int[] iArr, Object obj) {
        m1292L(i, strArr, iArr, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        r1 = p093c.p094a.p095a.p096a.AbstractC1124a.m1187i("Cannot execute method ");
        r1.append(r14.getName());
        r1.append(" because it is non-void method and/or has input parameters.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        throw new java.lang.RuntimeException(r1.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cc -> B:43:0x00d1). Please submit an issue!!! */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1292L(int i, String[] strArr, int[] iArr, Object... objArr) {
        boolean z;
        Class<? super Object> cls;
        boolean z2;
        Object obj;
        int i2;
        int i3;
        Object[] objArr2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        int i5;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i6 = 0; i6 < strArr.length; i6++) {
            String str = strArr[i6];
            if (iArr[i6] == 0) {
                arrayList3.add(str);
            } else {
                arrayList4.add(str);
            }
        }
        Object[] objArr3 = objArr;
        ArrayList arrayList5 = arrayList4;
        int i7 = 0;
        int i8 = 0;
        ArrayList arrayList6 = arrayList3;
        int length = objArr3.length;
        loop1: while (i8 < length) {
            Object obj2 = objArr3[i8];
            arrayList6.isEmpty();
            arrayList5.isEmpty();
            int i9 = 1;
            if (!arrayList6.isEmpty() && arrayList5.isEmpty()) {
                Class<?> cls2 = obj2.getClass();
                if (obj2.getClass().getSimpleName().endsWith("_")) {
                    try {
                        z = Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj2);
                    } catch (ClassNotFoundException unused) {
                        z = false;
                    }
                    if (z) {
                        cls = cls2;
                        z2 = true;
                        obj = obj2;
                        i2 = i8;
                        i3 = i7;
                        objArr2 = objArr3;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i4 = length;
                        i5 = i;
                        if (cls != null) {
                        }
                    } else {
                        Object obj3 = obj2;
                        z2 = true;
                        i2 = i8;
                        i3 = i7;
                        objArr2 = objArr3;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i4 = length;
                        i5 = i;
                        Object obj4 = obj3;
                        cls = cls2.getSuperclass();
                        obj = obj4;
                        if (cls != null) {
                            Method[] declaredMethods = cls.getDeclaredMethods();
                            int length2 = declaredMethods.length;
                            for (int i10 = 0; i10 < length2; i10++) {
                                Method method = declaredMethods[i10];
                                InterfaceC2302a interfaceC2302a = (InterfaceC2302a) method.getAnnotation(InterfaceC2302a.class);
                                if (interfaceC2302a != null && interfaceC2302a.value() == i5) {
                                    if (method.getParameterTypes().length > 0) {
                                        break loop1;
                                    }
                                    try {
                                        if (!method.isAccessible()) {
                                            method.setAccessible(z2);
                                        }
                                        method.invoke(obj, new Object[i3]);
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    }
                                }
                            }
                            Class<?> cls3 = cls;
                            obj3 = obj;
                            cls2 = cls3;
                            Object obj42 = obj3;
                            cls = cls2.getSuperclass();
                            obj = obj42;
                            if (cls != null) {
                                length = i4;
                                arrayList6 = arrayList2;
                                arrayList5 = arrayList;
                                objArr3 = objArr2;
                                i7 = i3;
                                i8 = i2;
                                i9 = z2 ? 1 : 0;
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
            i8 += i9;
        }
    }

    /* renamed from: M */
    public static PorterDuff.Mode m1291M(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: N */
    public static void m1290N(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    /* renamed from: O */
    public static void m1289O(View view, int... iArr) {
        int length = iArr.length;
        View[] viewArr = new View[length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                viewArr[i] = view.findViewById(i2);
            }
        }
        int i3 = 500;
        for (int i4 = 0; i4 < length; i4++) {
            View view2 = viewArr[i4];
            if (view2 != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(view2.getContext(), R.anim.link_popup);
                loadAnimation.setStartOffset(i3);
                view2.startAnimation(loadAnimation);
            }
            i3 += 200;
        }
    }

    /* renamed from: P */
    public static long m1288P(long j, int i, long j2) {
        long j3 = i;
        long j4 = j3 << 32;
        if ((j & j4) == 0) {
            long j5 = j3 << 40;
            if ((j & j5) != 0) {
                return (j3 << 8) | ((j2 ^ (-1)) & j) | j3;
            } else if (((j3 << 24) & j) == 0) {
                return ((j3 << 8) & j) != 0 ? (j2 ^ (-1)) & j : (j3 | j | j4) & (j5 ^ (-1));
            }
        }
        return j;
    }

    /* renamed from: Q */
    public static long m1287Q(long j, int i, long j2) {
        long j3 = i;
        if (((j3 << 24) & j) != 0) {
            return j & (j2 ^ (-1));
        }
        long j4 = j3 << 32;
        return (j & j4) != 0 ? (j | j3 | (j3 << 40)) & (j4 ^ (-1)) : j;
    }

    /* renamed from: R */
    public static void m1286R(C2307f c2307f) {
        boolean z = true;
        if (m1254y(c2307f.f7452a.mo9b(), c2307f.m16a())) {
            Object obj = c2307f.f7452a.f7470a;
            int i = c2307f.f7454c;
            String[] m16a = c2307f.m16a();
            int[] iArr = new int[m16a.length];
            for (int i2 = 0; i2 < m16a.length; i2++) {
                iArr[i2] = 0;
            }
            m1292L(i, m16a, iArr, obj);
            return;
        }
        AbstractC2317e abstractC2317e = c2307f.f7452a;
        String str = c2307f.f7455d;
        String str2 = c2307f.f7456e;
        String str3 = c2307f.f7457f;
        int i3 = c2307f.f7458g;
        int i4 = c2307f.f7454c;
        String[] m16a2 = c2307f.m16a();
        abstractC2317e.getClass();
        int length = m16a2.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                z = false;
                break;
            } else if (abstractC2317e.mo8d(m16a2[i5])) {
                break;
            } else {
                i5++;
            }
        }
        if (z) {
            abstractC2317e.mo11e(str, str2, str3, i3, i4, m16a2);
        } else {
            abstractC2317e.mo10a(i4, m16a2);
        }
    }

    /* renamed from: S */
    public static TypedValue m1285S(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: T */
    public static boolean m1284T(Context context, int i, boolean z) {
        TypedValue m1285S = m1285S(context, i);
        return (m1285S == null || m1285S.type != 18) ? z : m1285S.data != 0;
    }

    /* renamed from: U */
    public static int m1283U(Context context, int i, String str) {
        TypedValue m1285S = m1285S(context, i);
        if (m1285S != null) {
            return m1285S.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: V */
    public static int m1282V(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* renamed from: W */
    public static void m1281W(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C1851i) {
            C1851i c1851i = (C1851i) background;
            C1850h c1850h = c1851i.f5657d;
            if (c1850h.f5647o != f) {
                c1850h.f5647o = f;
                c1851i.m730w();
            }
        }
    }

    /* renamed from: X */
    public static void m1280X(View view, C1851i c1851i) {
        C2045a c2045a = c1851i.f5657d.f5634b;
        if (c2045a != null && c2045a.f6219a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += AbstractC0605j0.m2245m((View) parent);
            }
            C1850h c1850h = c1851i.f5657d;
            if (c1850h.f5646n != f) {
                c1850h.f5646n = f;
                c1851i.m730w();
            }
        }
    }

    /* renamed from: Y */
    public static PorterDuffColorFilter m1279Y(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    /* renamed from: a */
    public static long m1278a(long j, int i, long j2) {
        long j3 = i;
        return ((j3 << 32) & j) != 0 ? (j & (j2 ^ (-1))) | j3 | (j3 << 24) : ((j3 << 40) & j) != 0 ? j & (j2 ^ (-1)) : j;
    }

    /* renamed from: b */
    public static long m1277b(long j) {
        return m1278a(m1278a(m1278a(j, 1, 1103823372545L), 2, 2207646745090L), 4, 4415293490180L);
    }

    /* renamed from: c */
    public static void m1276c(XmlPullParser xmlPullParser, String str) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xmlPullParser.getName().equals(str)) {
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Unexpected start tag: found ");
        m1187i.append(xmlPullParser.getName());
        m1187i.append(", expected ");
        m1187i.append(str);
        throw new XmlPullParserException(m1187i.toString());
    }

    /* renamed from: d */
    public static boolean m1275d(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, int i) {
        String[] m1257v = m1257v(i);
        if (m1254y(abstractComponentCallbacksC0763z.m1911B0(), m1257v)) {
            return true;
        }
        AbstractC2317e c2316d = Build.VERSION.SDK_INT < 23 ? new C2316d(abstractComponentCallbacksC0763z) : new C2318f(abstractComponentCallbacksC0763z);
        String string = c2316d.mo9b().getString(m1256w(i));
        String string2 = c2316d.mo9b().getString(R.string.allow_permission);
        if (string == null) {
            string = c2316d.mo9b().getString(AbstractC2308g.rationale_ask);
        }
        m1286R(new C2307f(c2316d, m1257v, i, string, string2 == null ? c2316d.mo9b().getString(17039370) : string2, c2316d.mo9b().getString(17039360), 2131886578, null));
        return false;
    }

    /* renamed from: e */
    public static boolean m1274e(CharSequence charSequence, EnumC2090a enumC2090a) {
        int i = AbstractC2092c.f7003a;
        for (int i2 = 0; i2 < charSequence.length() - 1; i2++) {
            if (charSequence.charAt(i2) == 8205 && charSequence.charAt(i2 + 1) == enumC2090a.f6995e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m1273f(CharSequence charSequence, EnumC2091b enumC2091b) {
        int i = AbstractC2092c.f7003a;
        for (int i2 = 0; i2 < charSequence.length() - 1; i2++) {
            if (charSequence.charAt(i2) == 55356 && charSequence.charAt(i2 + 1) == enumC2091b.f7002h) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static AbstractC2094b m1272g(Object obj, Activity activity, int i) {
        return m1271h(obj, activity, null, i);
    }

    /* renamed from: h */
    public static AbstractC2094b m1271h(final Object obj, Activity activity, CharSequence charSequence, int i) {
        final Dialog dialog = new Dialog(activity, AbstractC2300k.ProgressDialog);
        dialog.setContentView(i);
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView = (TextView) dialog.findViewById(AbstractC2298i.progress_dialog_message_text_view);
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
        dialog.setTitle((CharSequence) null);
        dialog.setCancelable(false);
        dialog.setOwnerActivity(activity);
        dialog.show();
        return AbstractC2094b.m162Q(new Callable() { // from class: f.a.b.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dialog;
            }
        }, new InterfaceC2127i() { // from class: f.a.b.b
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj2) {
                Dialog dialog2 = (Dialog) obj2;
                return AbstractC2094b.m173E(obj);
            }
        }, new InterfaceC2123e() { // from class: f.a.b.a
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj2) {
                ((Dialog) obj2).dismiss();
            }
        }, true);
    }

    /* renamed from: i */
    public static List m1270i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1413g(1, 11, "r1", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/93"), "Minimum Android version is 4.0.3 (ICS, API level 15).", "Basic support for OS field auto-fill.", "Better vibration control for newer OS versions.", "Fixes around permission requests.", "Fixes for colorized nav-bar.", "A few small gesture-typing fixes.", "Other bug fixes.", "Updated translations from the community."));
        arrayList.add(new C1413g(1, 10, "r4", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/92"), "Keep safe! #covid19 😷", "Updated emoji to version 13.1 - Android 8.1+", "So, you just copied some text? Let me suggest pasting it.", "Wrapping selected text with \"'<>(){}[]*-_`~.", "Finally, you can decide where the settings backup file should be.", "People spotted bugs. We slayed them!", "YABTU.", "Updated translations from the community."));
        arrayList.add(new C1413g(1, 10, "r3", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/91"), "Colorized nav-bar on supported devices.", "Gesture-Typing fixes and improvements.", "Various fixes around theme setting.", "Updated build tools.", "Updated translations."));
        arrayList.add(new C1413g(1, 10, "r2", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/90"), "Support for image/gif insertion. This is an option in the Emoji popup.", "Update Emojis to v12.0.", "Improvements for Gesture-Typing. Thanks to Philipp Fischbeck.", "New themes.", "Updated localization: AR, DE, ES-MX, EU, KMR, LT, RU, TR, UK"));
        arrayList.add(new C1413g(1, 10, "r1", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/89"), "Keyboard colors will adapt to used app. Enable this in Themes settings.", "Night Mode - if enabled, keyboard and app will use dark theme.", "Power Saving mode tweaks.", "Updated build-tools (smaller binary now).", "Halmak layout for English.", "Updated localization: AR, BE, BG, DE, EO, EU, ES, ES-MX, FR, IT, IW (HE), KMR, KU, NB, PT, SC, SK, TR."));
        arrayList.add(new C1413g(1, 9, "r6", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/88"), "➿ Gesture-Typing is here! As BETA. You'll need to enable it in Settings if you want to try it out.", "Honoring IME_FLAG_NO_PERSONALIZED_LEARNING and PASSWORD as Incognito - if an app ask us not to remember stuff, we'll do it.", "Updated localization: BE, CKB, EU, FR, IT, NB, SC."));
        arrayList.add(new C1413g(1, 9, "r5", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/87"), "Power-Saving mode improvements - you can pick which features to include in Power-Saving.", "Also, we allow switching to dark, simple theme in Power-Saving mode. But this is optional.", "New Workman layout, Terminal generic-top-row and long-press fixes. Done by Alex Griffin.", "Updated localization: AR, BE, EU, FR, HU, IT, KA, KN, KU, LT, NB, NL, PT, RO, RU, SC, UK."));
        arrayList.add(new C1413g(1, 9, "r4", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/86"), "Power-Saving mode - when battery is low, we will not do animations or dictionary look ups.", "A few UI/UX changes.", "A few bug fixes.", "Updated localization: CA, IT, RO."));
        arrayList.add(new C1413g(1, 9, "r3", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/85"), "You can now set the default skin-tone for emojis #expressYourself. Android 7+.", "Clipboard is now synced with outside changes. Long-press PASTE for list.", "Various bug fixes.", "Updated localization: BE, CA, EU, LT, NB, RU, SC, TR, UK."));
        arrayList.add(new C1413g(1, 9, "r2", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/84"), "Completely rewrote backup and restore mechanism. Now you can backup words, abbr, next-word and all-app settings.", "New Kaomoji emoji group.", "Pressing shift will change caps of selected text.", "A few bug fixes.", "Updated localization: AR, BE, BG, DU, EU, FI, FIL, FR, HU, KA, KMR, KU, LT, NB, PT-rBR, RU, SC, TR, UK."));
        arrayList.add(new C1413g(1, 9, "r1", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/83"), "New Settings UI bottom navigation.", "Also, new Setup Wizard UI.", "And many new settings all around.", "Localization update: AR, BE, pt-rBR, ES, EU, FR, FIL, HU, KU, LT, MY, SC, TR, RU, UK.", "YABTU and also will only work with Android 2.2 🍪 or newer."));
        arrayList.add(new C1413g(1, 8, "r12", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/82"), "Fine-tuned icon to match Android's design.", "Updated emojis for Android-O.", "Long-pressing SHIFT will lock. Or unlock..", "Incognito Mode! Long-press ENTER to start.", "YABTU", "Localization update: FR, EU, NL, IW."));
        arrayList.add(new C1413g(1, 8, "r11", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/81"), "All languages are equal! You can now reorder keyboards. In keyboard selection page - long press an enabled keyboard and drag it.", "Now you can use multiple dictionaries on a given keyboard. Long-press ENTER for options.", "Brought alternative layouts: DVORAK, COLEMAK, Terminal, and Compact English.", "New theme by Algimantas", "YABTU", "Localization update: too many to mention."));
        arrayList.add(new C1413g(1, 8, "r10", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r10"), "Some bug fixes.", "In tweaks: You can now force a locale inside AnySoftKeyboard.", "YABTU", "Localization update: BE, DE, CA, EU, FR."));
        arrayList.add(new C1413g(1, 8, "r9", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r9"), "New Initial Setup Wizard. For clearer activation.", "Seems like we did not include words with accents in suggestions. We do now!", "Better Emoji-Search experience. Type a : to start searching.", "Yet more bugs squashed.", "Localization update: BE, NL, FR, SL, DE, NO, EU."));
        arrayList.add(new C1413g(1, 8, "r8", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r8"), "Much improved English dictionary.", "More than a few bug fixes.", "Localization update: FR, SL, BE and all new EU (Basque)."));
        arrayList.add(new C1413g(1, 8, "r7.1", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestone/78"), "Bringing back missing Alphabet keys from some layouts.", "Getting the hint if you say no to contacts."));
        arrayList.add(new C1413g(1, 8, "r7", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r7"), "Language key will now show only if you actually have more than one layout enabled.", "For Android 7.1 - you now have Launcher shortcuts.", "A few changes to the dictionary loading mechanism.", "Some bug fixes.", "Emojis are no longer popups, but their own keyboard. Plus, long press to get various skin tones (if available).", "YABTU", "Localization update: BE, UK, FR, TR, and SL."));
        arrayList.add(new C1413g(1, 8, "r6", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r6"), "Quite a few bug fixes, some related to shift states.", "Some English dictionary tuning.", "Now showing Greek alphabets in long-press popups.", "Localization update: FR, BE."));
        arrayList.add(new C1413g(1, 8, "r5", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r5"), "Many bug fixes", "Now you can 🔍 for emojis! Just start your search with a colon, like this - ':magnifying", "Long-press an emoji to find out its assigned tags.", "A massive rewrite of long-press interactions. I hope I didn't break anything (major).", "When in a password field, numbers will show up at the top of the keyboard, because strong passwords and such.", "Also, pressing SHIFT, will switch the numbers-row to symbols, because strong passwords and such.", "YABTU.", "Localization update: KN, KU, PT-BR."));
        arrayList.add(new C1413g(1, 8, "r4", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r4"), "Updated Emoticon emoji listing - presentation is everything 😎!", "Also, flags 🏁 were also added to the emoji list.", "Merged People and Gestures, and added a bunch 🙋.", "Unfortunately - to make sure emojis are full supported - it is only available for Android 6.0 devices 😢."));
        arrayList.add(new C1413g(1, 8, "r3", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r3"), "New Dark-Gray theme.", "Bugs squashing, including an under-the-radar RTL issue.", "Localization update: SL."));
        arrayList.add(new C1413g(1, 8, "r2", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r2"), "Better keyboard preview when selecting addons (themes, language, etc.).", "Now tells you about clipboard copy.", "A few bug fixes here and there.", "YABTU.", "Localization update: FR, SL."));
        arrayList.add(new C1413g(1, 8, "r1", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8-r1"), "Improvements on the keyboard preview. Now demos typing.", "Several crash and bug fixes.", "Localization update: FR (100%)."));
        arrayList.add(new C1413g(1, 8, "", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.8"), "New keyboard preview - now showing EXACTLY how the keyboard should look.", "New launcher icon - first iteration. Ya ya, it's not perfect.", "Spellchecker fix, and other bug fixes.", "Build-tools update.", "Localization: DE (complete), SL (complete), MY."));
        arrayList.add(new C1413g(1, 7, "r7", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7-r7"), "A few more bug fixes.", "Localization: FR, NL, NO, RU, UK."));
        arrayList.add(new C1413g(1, 7, "r6", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7-r6"), "Status-bar icon fix. It is not a setting.", "Swipe from Backspace will delete a whole word for'ya.", "Update to the English auto-complete dictionary. Way overdue.."));
        arrayList.add(new C1413g(1, 7, "r5", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7-r5"), "Punctuation and space swapping magic.", "Bug fixes all around."));
        arrayList.add(new C1413g(1, 7, "r4", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7-r4"), "Fix for a weird bug with manually picked words, plus some crashers."));
        arrayList.add(new C1413g(1, 7, "r3", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7-r3"), "Even more bugs crashed!", "The utility box (swipe up from space-bar) now has SELECT-ALL key. Pro tip: long-press that key and then use left&right arrows to precisely select characters.", "Talking about space-bar. Try double-spacing.", "And, yes, YABTU.", "Localization update: LT (100% complete!), KU."));
        arrayList.add(new C1413g(1, 7, "r2", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7-r2"), "Bugs, bugs, bugs. Squashed.", "A better way to load auto-complete dictionary.", "Localization update: FR, LT, IT, KU."));
        arrayList.add(new C1413g(1, 7, "r1", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7-r1"), "Marshmallow Permissions support - now we can annoy you with even more dialogs!", "Bugs squashing all around. Thanks for the reports!", "Localization update: DE, SL, FR, PT. And awesome note: German, Slovenian and French have been completely translated!", "YABTU"));
        arrayList.add(new C1413g(1, 7, "", Uri.parse("https://github.com/AnySoftKeyboard/AnySoftKeyboard/milestones/1.7"), "Printing-out speed ups. This is very helpful to you 150-words-a-minute wizards.", "Physical-Keyboard interaction enhancements. This has Wife-Seal-of-Approval stamp on it.", "Automatically switch to previously used layout in an App. Probably good for multilingual users.", "And, fixed a few bugs (probably also introduced a few...)", "Localization update: PL, CA, MY, UK, DE, FR, SL.", "YABTU"));
        return arrayList;
    }

    /* renamed from: j */
    public static AbstractC1846d m1269j(int i) {
        if (i != 0) {
            if (i != 1) {
                return new C1853k();
            }
            return new C1847e();
        }
        return new C1853k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
        return r1;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Interpolator m1268k(Context context, XmlPullParser xmlPullParser) {
        Interpolator accelerateInterpolator;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            accelerateInterpolator = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            accelerateInterpolator = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            accelerateInterpolator = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            accelerateInterpolator = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            accelerateInterpolator = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            accelerateInterpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (!name.equals("pathInterpolator")) {
                            StringBuilder m1187i = AbstractC1124a.m1187i("Unknown interpolator name: ");
                            m1187i.append(xmlPullParser.getName());
                            throw new RuntimeException(m1187i.toString());
                        } else {
                            accelerateInterpolator = new animationInterpolatorC1094i(context, asAttributeSet, xmlPullParser);
                        }
                        interpolator = accelerateInterpolator;
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public static void m1267l(View view, InterfaceC1825u interfaceC1825u) {
        AbstractC0605j0.m2262U(view, new C1823s(interfaceC1825u, new C1826v(AbstractC0605j0.m2237u(view), view.getPaddingTop(), AbstractC0605j0.m2238t(view), view.getPaddingBottom())));
        if (AbstractC0605j0.m2233y(view)) {
            AbstractC0605j0.m2271L(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1824t());
        }
    }

    /* renamed from: m */
    public static InterfaceC2112c m1266m() {
        return new C2114e(AbstractC2146l.f7037b);
    }

    /* renamed from: n */
    public static boolean m1265n(Context context, int i, int i2) {
        return ((Boolean) ((C1785g) AnyApplication.m182t(context).m1172a(i, i2)).m809b()).booleanValue();
    }

    /* renamed from: o */
    public static int m1264o(Context context, int i, int i2) {
        TypedValue m1285S = m1285S(context, i);
        return m1285S != null ? m1285S.data : i2;
    }

    /* renamed from: p */
    public static int m1263p(View view, int i) {
        return m1283U(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: q */
    public static ColorStateList m1262q(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList m3001a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m3001a = AbstractC0142b.m3001a(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) ? typedArray.getColorStateList(i) : ColorStateList.valueOf(color) : m3001a;
    }

    /* renamed from: r */
    public static ColorStateList m1261r(Context context, C0302q3 c0302q3, int i) {
        int color;
        int resourceId;
        ColorStateList m3001a;
        return (!c0302q3.f1740b.hasValue(i) || (resourceId = c0302q3.f1740b.getResourceId(i, 0)) == 0 || (m3001a = AbstractC0142b.m3001a(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = c0302q3.f1740b.getColor(i, -1)) == -1) ? c0302q3.m2755c(i) : ColorStateList.valueOf(color) : m3001a;
    }

    /* renamed from: s */
    public static Drawable m1260s(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m3000b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m3000b = AbstractC0142b.m3000b(context, resourceId)) == null) ? typedArray.getDrawable(i) : m3000b;
    }

    /* renamed from: t */
    public static Locale m1259t(String str) {
        Locale[] availableLocales;
        Locale locale;
        if ("System".equals(str) || TextUtils.isEmpty(str)) {
            return Locale.getDefault();
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                locale = Locale.forLanguageTag(str);
            } else {
                for (Locale locale2 : Locale.getAvailableLocales()) {
                    if (str.equals(locale2.getLanguage())) {
                        return locale2;
                    }
                }
                locale = new Locale(str);
            }
            return TextUtils.isEmpty(locale.getLanguage()) ? Locale.getDefault() : locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }

    /* renamed from: u */
    public static int m1258u(long j, int i) {
        if (i == 1 || i == 2 || i == 4) {
            if (((i << 8) & j) != 0) {
                return 2;
            }
            return (j & ((long) i)) != 0 ? 1 : 0;
        }
        return 0;
    }

    /* renamed from: v */
    public static String[] m1257v(int i) {
        return i == 892344 ? new String[]{"android.permission.READ_CONTACTS"} : Build.VERSION.SDK_INT >= 16 ? new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: w */
    public static int m1256w(int i) {
        switch (i) {
            case 892342:
            case 892343:
                return R.string.storage_permission_rationale;
            case 892344:
                return R.string.contacts_permissions_dialog_message;
            default:
                throw new IllegalArgumentException(AbstractC1124a.m1193c("Unknown request code ", i));
        }
    }

    /* renamed from: x */
    public static boolean m1255x(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C1671g0) it.next()).f5159n;
            if (!TextUtils.isEmpty(str) && Locale.getDefault().getLanguage().equals(new Locale(str).getLanguage())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m1254y(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context != null) {
            for (String str : strArr) {
                if (AbstractC0472e.m2432a(context, str) != 0) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Can't check permissions for null context");
    }

    /* renamed from: z */
    public static boolean m1253z(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}