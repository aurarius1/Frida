package p000a.p001a.p002a.p004b;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p016c.p026q.View$OnLongClickListenerC0233d4;
import p010b.p037h.p040b.C0395c;
import p010b.p037h.p040b.C0398f;
import p010b.p037h.p040b.C0404l;
import p010b.p037h.p040b.InterfaceC0394b;
import p010b.p037h.p040b.p041n.C0407b;
import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.C0411f;
import p010b.p046j.AbstractC0461a;
import p010b.p046j.AbstractC0463c;
import p010b.p046j.p047d.AbstractC0490w;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p048e.p049b.C0498d;
import p010b.p046j.p048e.p049b.C0499e;
import p010b.p046j.p048e.p049b.InterfaceC0496b;
import p010b.p046j.p050f.C0509d;
import p010b.p046j.p050f.p051p.C0523c;
import p010b.p046j.p050f.p051p.C0524d;
import p010b.p046j.p050f.p051p.InterfaceC0521a;
import p010b.p046j.p050f.p051p.InterfaceC0522b;
import p010b.p046j.p055i.C0536f;
import p010b.p046j.p056j.C0552d;
import p010b.p046j.p061m.ActionMode$CallbackC0645h;
import p010b.p046j.p061m.InterfaceC0647j;
import p010b.p067m.AbstractC0665a;
import p010b.p067m.AbstractC0666b;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0701i0;
import p010b.p067m.p068d.C0757x;
import p010b.p083u.p084e.AbstractC0980q1;
import p010b.p083u.p084e.AbstractC0999v0;
import p010b.p083u.p084e.C0929d2;
import p010b.p086w.C1074u;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: a.a.a.b.t */
/* loaded from: classes.dex */
public abstract class AbstractC0022t {

    /* renamed from: a */
    public static Field f38a;

    /* renamed from: b */
    public static boolean f39b;

    /* renamed from: c */
    public static Class f40c;

    /* renamed from: d */
    public static boolean f41d;

    /* renamed from: e */
    public static Field f42e;

    /* renamed from: f */
    public static boolean f43f;

    /* renamed from: g */
    public static Field f44g;

    /* renamed from: h */
    public static boolean f45h;

    /* renamed from: i */
    public static Method f46i;

    /* renamed from: j */
    public static boolean f47j;

    /* renamed from: k */
    public static Method f48k;

    /* renamed from: l */
    public static boolean f49l;

    /* renamed from: m */
    public static Method f50m;

    /* renamed from: n */
    public static boolean f51n;

    /* renamed from: o */
    public static Method f52o;

    /* renamed from: p */
    public static boolean f53p;

    /* renamed from: q */
    public static Field f54q;

    /* renamed from: r */
    public static boolean f55r;

    /* renamed from: s */
    public static Field f56s;

    /* renamed from: t */
    public static boolean f57t;

    /* renamed from: u */
    public static Method f58u;

    /* renamed from: v */
    public static boolean f59v;

    /* renamed from: w */
    public static Field f60w;

    /* renamed from: x */
    public static boolean f61x;

    /* renamed from: y */
    public static long f62y;

    /* renamed from: z */
    public static Method f63z;

    /* renamed from: A */
    public static Drawable m3533A(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f57t) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f56s = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f57t = true;
        }
        Field field = f56s;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f56s = null;
            }
        }
        return null;
    }

    /* renamed from: B */
    public static ColorStateList m3532B(CompoundButton compoundButton) {
        return Build.VERSION.SDK_INT >= 21 ? compoundButton.getButtonTintList() : ((InterfaceC0647j) compoundButton).getSupportButtonTintList();
    }

    /* renamed from: C */
    public static Drawable[] m3531C(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i >= 17) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }

    /* renamed from: D */
    public static Bundle m3530D(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        Bundle bundle = null;
        if (i >= 16) {
            synchronized (AbstractC0490w.f2505a) {
                if (!AbstractC0490w.f2507c) {
                    try {
                        if (AbstractC0490w.f2506b == null) {
                            Field declaredField = Notification.class.getDeclaredField("extras");
                            if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                                declaredField.setAccessible(true);
                                AbstractC0490w.f2506b = declaredField;
                            } else {
                                AbstractC0490w.f2507c = true;
                            }
                        }
                        Bundle bundle2 = (Bundle) AbstractC0490w.f2506b.get(notification);
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                            AbstractC0490w.f2506b.set(notification, bundle2);
                        }
                        bundle = bundle2;
                    } catch (IllegalAccessException | NoSuchFieldException unused) {
                        AbstractC0490w.f2507c = true;
                    }
                }
            }
            return bundle;
        }
        return null;
    }

    /* renamed from: E */
    public static int m3529E(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f53p) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f52o = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f53p = true;
            }
            Method method = f52o;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    f52o = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: F */
    public static int m3528F(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    /* renamed from: G */
    public static Intent m3527G(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT < 16 || (parentActivityIntent = activity.getParentActivityIntent()) == null) {
            try {
                String m3525I = m3525I(activity, activity.getComponentName());
                if (m3525I == null) {
                    return null;
                }
                ComponentName componentName = new ComponentName(activity, m3525I);
                try {
                    return m3525I(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return parentActivityIntent;
    }

    /* renamed from: H */
    public static Intent m3526H(Context context, ComponentName componentName) {
        String m3525I = m3525I(context, componentName);
        if (m3525I == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m3525I);
        return m3525I(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: I */
    public static String m3525I(Context context, ComponentName componentName) {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        if (i < 16 || (str = activityInfo.parentActivityName) == null) {
            Bundle bundle = activityInfo.metaData;
            if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
            return string;
        }
        return str;
    }

    /* renamed from: J */
    public static File m3524J(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i(".font");
        m1187i.append(Process.myPid());
        m1187i.append("-");
        m1187i.append(Process.myTid());
        m1187i.append("-");
        String sb = m1187i.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, AbstractC1124a.m1193c(sb, i));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r10 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r4 != false) goto L33;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0552d m3523K(TextView textView) {
        int i;
        int i2;
        TextDirectionHeuristic textDirectionHeuristic;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new C0552d(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            i = 1;
            i2 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = i4 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
        if (i3 >= 23) {
            i = textView.getBreakStrategy();
            i2 = textView.getHyphenationFrequency();
        }
        if (i3 >= 18) {
            if (!(textView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                if (i3 < 28 || (textView.getInputType() & 15) != 3) {
                    boolean z = textView.getLayoutDirection() == 1;
                    switch (textView.getTextDirection()) {
                        case 2:
                            textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            break;
                        case 4:
                            textDirectionHeuristic = TextDirectionHeuristics.RTL;
                            break;
                        case 5:
                            textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            break;
                        case 6:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        case 7:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                    }
                } else {
                    byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                    if (directionality != 1) {
                    }
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
                textDirectionHeuristic2 = textDirectionHeuristic;
            }
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
            textDirectionHeuristic2 = textDirectionHeuristic;
        }
        return new C0552d(textPaint, textDirectionHeuristic2, i, i2);
    }

    /* renamed from: L */
    public static int m3522L(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: M */
    public static boolean m3521M(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m3520N(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: O */
    public static boolean m3519O() {
        try {
            if (f63z == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f63z == null) {
                    f62y = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f63z = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f63z.invoke(null, Long.valueOf(f62y))).booleanValue();
            } catch (Exception e) {
                if (e instanceof InvocationTargetException) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: P */
    public static C0701i0 m3518P(Context context, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, boolean z, boolean z2) {
        int m1864l;
        int i;
        C0757x c0757x = abstractComponentCallbacksC0763z.f3219L;
        boolean z3 = false;
        int i2 = c0757x == null ? 0 : c0757x.f3193h;
        if (z2) {
            m1864l = z ? abstractComponentCallbacksC0763z.m1849w() : abstractComponentCallbacksC0763z.m1847x();
        } else {
            m1864l = z ? abstractComponentCallbacksC0763z.m1864l() : abstractComponentCallbacksC0763z.m1861o();
        }
        abstractComponentCallbacksC0763z.m1905E0(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0763z.f3215H;
        if (viewGroup != null) {
            int i3 = AbstractC0666b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i3) != null) {
                abstractComponentCallbacksC0763z.f3215H.setTag(i3, null);
            }
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0763z.f3215H;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation m1882U = abstractComponentCallbacksC0763z.m1882U();
            if (m1882U != null) {
                return new C0701i0(m1882U);
            }
            Animator m1881V = abstractComponentCallbacksC0763z.m1881V();
            if (m1881V != null) {
                return new C0701i0(m1881V);
            }
            if (m1864l == 0 && i2 != 0) {
                if (i2 == 4097) {
                    i = z ? AbstractC0665a.fragment_open_enter : AbstractC0665a.fragment_open_exit;
                } else if (i2 == 4099) {
                    i = z ? AbstractC0665a.fragment_fade_enter : AbstractC0665a.fragment_fade_exit;
                } else if (i2 != 8194) {
                    m1864l = -1;
                } else {
                    i = z ? AbstractC0665a.fragment_close_enter : AbstractC0665a.fragment_close_exit;
                }
                m1864l = i;
            }
            if (m1864l != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(m1864l));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, m1864l);
                        if (loadAnimation != null) {
                            return new C0701i0(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, m1864l);
                        if (loadAnimator != null) {
                            return new C0701i0(loadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m1864l);
                        if (loadAnimation2 != null) {
                            return new C0701i0(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: Q */
    public static int m3517Q(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* renamed from: R */
    public static int m3516R(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i2));
        }
        height = (rect.height() / 2) + rect.top;
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i2));
    }

    /* renamed from: S */
    public static ByteBuffer m3515S(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: T */
    public static ObjectAnimator m3514T(Object obj, Property property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(obj, new C1074u(property, path), 0.0f, 1.0f);
    }

    /* renamed from: U */
    public static InputConnection m3513U(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnection;
    }

    /* renamed from: V */
    public static void m3512V(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: W */
    public static InterfaceC0496b m3511W(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0463c.FontFamily);
                String string = obtainAttributes.getString(AbstractC0463c.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(AbstractC0463c.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(AbstractC0463c.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(AbstractC0463c.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(AbstractC0463c.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(AbstractC0463c.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(AbstractC0463c.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        m3472r0(xmlPullParser);
                    }
                    return new C0499e(new C0536f(string, string2, string3, m3510X(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (xmlPullParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0463c.FontFamilyFont);
                            int i = AbstractC0463c.FontFamilyFont_fontWeight;
                            if (!obtainAttributes2.hasValue(i)) {
                                i = AbstractC0463c.FontFamilyFont_android_fontWeight;
                            }
                            int i2 = obtainAttributes2.getInt(i, 400);
                            int i3 = AbstractC0463c.FontFamilyFont_fontStyle;
                            if (!obtainAttributes2.hasValue(i3)) {
                                i3 = AbstractC0463c.FontFamilyFont_android_fontStyle;
                            }
                            boolean z = 1 == obtainAttributes2.getInt(i3, 0);
                            int i4 = AbstractC0463c.FontFamilyFont_ttcIndex;
                            if (!obtainAttributes2.hasValue(i4)) {
                                i4 = AbstractC0463c.FontFamilyFont_android_ttcIndex;
                            }
                            int i5 = AbstractC0463c.FontFamilyFont_fontVariationSettings;
                            if (!obtainAttributes2.hasValue(i5)) {
                                i5 = AbstractC0463c.FontFamilyFont_android_fontVariationSettings;
                            }
                            String string5 = obtainAttributes2.getString(i5);
                            int i6 = obtainAttributes2.getInt(i4, 0);
                            int i7 = AbstractC0463c.FontFamilyFont_font;
                            if (!obtainAttributes2.hasValue(i7)) {
                                i7 = AbstractC0463c.FontFamilyFont_android_font;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                            String string6 = obtainAttributes2.getString(i7);
                            obtainAttributes2.recycle();
                            while (xmlPullParser.next() != 3) {
                                m3472r0(xmlPullParser);
                            }
                            arrayList.add(new C0498d(string6, i2, z, string5, i6, resourceId2));
                        } else {
                            m3472r0(xmlPullParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C0497c((C0498d[]) arrayList.toArray(new C0498d[arrayList.size()]));
            }
            m3472r0(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: X */
    public static List m3510X(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3470s0(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3470s0(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: Y */
    public static void m3509Y(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: Z */
    public static void m3508Z(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof InterfaceC0647j) {
            ((InterfaceC0647j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ba, code lost:
        if (r3 == r6) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d0, code lost:
        if (r3 == r6) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d2, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d4, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0299, code lost:
        if (r4[r15].f2066d.f2064b == r6) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
        if (r5[r2].f2066d.f2064b == r6) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0715 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0735 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3507a(C0411f c0411f, C0398f c0398f, int i) {
        int i2;
        C0407b[] c0407bArr;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        C0407b c0407b;
        C0410e c0410e;
        C0410e c0410e2;
        C0410e c0410e3;
        C0410e c0410e4;
        int i5;
        C0410e c0410e5;
        C0409d c0409d;
        C0409d c0409d2;
        C0409d c0409d3;
        C0398f c0398f2;
        C0398f c0398f3;
        C0410e c0410e6;
        C0409d c0409d4;
        C0404l c0404l;
        C0409d c0409d5;
        C0404l c0404l2;
        C0410e c0410e7;
        C0409d c0409d6;
        int m2545b;
        C0409d c0409d7;
        C0404l c0404l3;
        C0409d c0409d8;
        C0404l c0404l4;
        int i6;
        C0410e c0410e8;
        C0410e c0410e9;
        C0410e c0410e10;
        C0409d c0409d9;
        int i7;
        C0409d c0409d10;
        C0404l c0404l5;
        C0404l c0404l6;
        C0410e c0410e11;
        int size;
        int i8;
        int i9;
        C0407b c0407b2;
        ArrayList arrayList2;
        C0410e c0410e12;
        C0410e c0410e13;
        float f;
        InterfaceC0394b interfaceC0394b;
        C0404l c0404l7;
        C0404l c0404l8;
        int i10;
        int i11;
        C0407b[] c0407bArr2;
        C0410e c0410e14;
        C0410e c0410e15;
        int i12;
        int i13;
        C0410e c0410e16;
        int m2535h;
        C0411f c0411f2 = c0411f;
        C0398f c0398f4 = c0398f;
        int i14 = 2;
        if (i == 0) {
            i2 = c0411f2.f2134m0;
            c0407bArr = c0411f2.f2137p0;
            i3 = 0;
        } else {
            i2 = c0411f2.f2135n0;
            c0407bArr = c0411f2.f2136o0;
            i3 = 2;
        }
        int i15 = 0;
        while (i15 < i2) {
            C0407b c0407b3 = c0407bArr[i15];
            int i16 = 8;
            int i17 = 1;
            if (!c0407b3.f2052t) {
                int i18 = c0407b3.f2047o * 2;
                C0410e c0410e17 = c0407b3.f2033a;
                C0410e c0410e18 = c0410e17;
                boolean z4 = false;
                while (!z4) {
                    c0407b3.f2041i += i17;
                    C0410e[] c0410eArr = c0410e17.f2103d0;
                    int i19 = c0407b3.f2047o;
                    c0410eArr[i19] = null;
                    c0410e17.f2101c0[i19] = null;
                    if (c0410e17.f2093X != i16) {
                        c0407b3.f2044l += i17;
                        if (c0410e17.m2536g(i19) != 3) {
                            int i20 = c0407b3.f2045m;
                            int i21 = c0407b3.f2047o;
                            if (i21 == 0) {
                                m2535h = c0410e17.m2529n();
                            } else {
                                m2535h = i21 == i17 ? c0410e17.m2535h() : 0;
                            }
                            c0407b3.f2045m = i20 + m2535h;
                        }
                        int m2545b2 = c0410e17.f2076G[i18].m2545b() + c0407b3.f2045m;
                        c0407b3.f2045m = m2545b2;
                        int i22 = i18 + 1;
                        c0407b3.f2045m = c0410e17.f2076G[i22].m2545b() + m2545b2;
                        int m2545b3 = c0410e17.f2076G[i18].m2545b() + c0407b3.f2046n;
                        c0407b3.f2046n = m2545b3;
                        c0407b3.f2046n = c0410e17.f2076G[i22].m2545b() + m2545b3;
                        if (c0407b3.f2034b == null) {
                            c0407b3.f2034b = c0410e17;
                        }
                        c0407b3.f2036d = c0410e17;
                        int[] iArr = c0410e17.f2079J;
                        int i23 = c0407b3.f2047o;
                        if (iArr[i23] == 3) {
                            int[] iArr2 = c0410e17.f2111l;
                            if (iArr2[i23] == 0 || iArr2[i23] == 3 || iArr2[i23] == i14) {
                                c0407b3.f2042j++;
                                float[] fArr = c0410e17.f2099b0;
                                float f2 = fArr[i23];
                                if (f2 > 0.0f) {
                                    c0407b3.f2043k += fArr[i23];
                                }
                                if (c0410e17.f2093X != 8 && iArr[i23] == 3 && (iArr2[i23] == 0 || iArr2[i23] == 3)) {
                                    if (f2 < 0.0f) {
                                        c0407b3.f2049q = true;
                                    } else {
                                        c0407b3.f2050r = true;
                                    }
                                    if (c0407b3.f2040h == null) {
                                        c0407b3.f2040h = new ArrayList();
                                    }
                                    c0407b3.f2040h.add(c0410e17);
                                }
                                if (c0407b3.f2038f == null) {
                                    c0407b3.f2038f = c0410e17;
                                }
                                C0410e c0410e19 = c0407b3.f2039g;
                                if (c0410e19 != null) {
                                    c0410e19.f2101c0[c0407b3.f2047o] = c0410e17;
                                }
                                c0407b3.f2039g = c0410e17;
                            }
                            int i24 = c0407b3.f2047o;
                        }
                    }
                    if (c0410e18 != c0410e17) {
                        c0410e18.f2103d0[c0407b3.f2047o] = c0410e17;
                    }
                    C0409d c0409d11 = c0410e17.f2076G[i18 + 1].f2066d;
                    if (c0409d11 != null) {
                        c0410e16 = c0409d11.f2064b;
                        C0409d[] c0409dArr = c0410e16.f2076G;
                        if (c0409dArr[i18].f2066d != null) {
                        }
                    }
                    c0410e16 = null;
                    if (c0410e16 == null) {
                        c0410e16 = c0410e17;
                        z4 = true;
                    }
                    c0410e18 = c0410e17;
                    i17 = 1;
                    i16 = 8;
                    i14 = 2;
                    c0410e17 = c0410e16;
                }
                C0410e c0410e20 = c0407b3.f2034b;
                if (c0410e20 != null) {
                    c0407b3.f2045m -= c0410e20.f2076G[i18].m2545b();
                }
                C0410e c0410e21 = c0407b3.f2036d;
                if (c0410e21 != null) {
                    c0407b3.f2045m -= c0410e21.f2076G[i18 + 1].m2545b();
                }
                c0407b3.f2035c = c0410e17;
                if (c0407b3.f2047o == 0 && c0407b3.f2048p) {
                    c0407b3.f2037e = c0410e17;
                } else {
                    c0407b3.f2037e = c0407b3.f2033a;
                }
                c0407b3.f2051s = c0407b3.f2050r && c0407b3.f2049q;
            }
            c0407b3.f2052t = true;
            C0410e c0410e22 = c0407b3.f2033a;
            C0410e c0410e23 = c0407b3.f2035c;
            C0410e c0410e24 = c0407b3.f2034b;
            C0410e c0410e25 = c0407b3.f2036d;
            C0410e c0410e26 = c0407b3.f2037e;
            float f3 = c0407b3.f2043k;
            boolean z5 = c0411f2.f2079J[i] == 2;
            if (i == 0) {
                int i25 = c0410e26.f2095Z;
                boolean z6 = i25 == 0;
                if (i25 == 1) {
                    i13 = 2;
                    z2 = true;
                } else {
                    i13 = 2;
                    z2 = false;
                }
                z = z6;
            } else {
                int i26 = c0410e26.f2097a0;
                z = i26 == 0;
                if (i26 == 1) {
                    i4 = 2;
                    z2 = true;
                } else {
                    i4 = 2;
                    z2 = false;
                }
            }
            C0410e c0410e27 = c0410e22;
            boolean z7 = false;
            while (!z7) {
                C0409d c0409d12 = c0410e27.f2076G[i3];
                int i27 = z3 ? 1 : 4;
                int m2545b4 = c0409d12.m2545b();
                int i28 = i15;
                int i29 = i2;
                boolean z8 = c0410e27.f2079J[i] == 3 && c0410e27.f2111l[i] == 0;
                C0409d c0409d13 = c0409d12.f2066d;
                if (c0409d13 != null && c0410e27 != c0410e22) {
                    m2545b4 = c0409d13.m2545b() + m2545b4;
                }
                int i30 = m2545b4;
                if (!z3 || c0410e27 == c0410e22 || c0410e27 == c0410e24) {
                    c0407bArr2 = c0407bArr;
                } else {
                    c0407bArr2 = c0407bArr;
                    i27 = 5;
                }
                C0409d c0409d14 = c0409d12.f2066d;
                C0410e c0410e28 = c0410e26;
                if (c0409d14 != null) {
                    if (c0410e27 == c0410e24) {
                        c0410e14 = c0410e22;
                        c0398f4.m2590f(c0409d12.f2069g, c0409d14.f2069g, i30, 6);
                    } else {
                        c0410e14 = c0410e22;
                        c0398f4.m2590f(c0409d12.f2069g, c0409d14.f2069g, i30, 8);
                    }
                    c0398f4.m2592d(c0409d12.f2069g, c0409d12.f2066d.f2069g, i30, (!z8 || z3) ? i27 : 5);
                } else {
                    c0410e14 = c0410e22;
                }
                if (z5) {
                    if (c0410e27.f2093X == 8 || c0410e27.f2079J[i] != 3) {
                        i12 = 0;
                    } else {
                        C0409d[] c0409dArr2 = c0410e27.f2076G;
                        i12 = 0;
                        c0398f4.m2590f(c0409dArr2[i3 + 1].f2069g, c0409dArr2[i3].f2069g, 0, 5);
                    }
                    c0398f4.m2590f(c0410e27.f2076G[i3].f2069g, c0411f2.f2076G[i3].f2069g, i12, 8);
                }
                C0409d c0409d15 = c0410e27.f2076G[i3 + 1].f2066d;
                if (c0409d15 != null) {
                    c0410e15 = c0409d15.f2064b;
                    C0409d[] c0409dArr3 = c0410e15.f2076G;
                    if (c0409dArr3[i3].f2066d != null) {
                    }
                }
                c0410e15 = null;
                if (c0410e15 != null) {
                    c0410e27 = c0410e15;
                } else {
                    z7 = true;
                }
                c0407bArr = c0407bArr2;
                i15 = i28;
                i2 = i29;
                c0410e26 = c0410e28;
                c0410e22 = c0410e14;
            }
            C0410e c0410e29 = c0410e26;
            int i31 = i15;
            C0410e c0410e30 = c0410e22;
            int i32 = i2;
            C0407b[] c0407bArr3 = c0407bArr;
            if (c0410e25 != null) {
                int i33 = i3 + 1;
                if (c0410e23.f2076G[i33].f2066d != null) {
                    C0409d c0409d16 = c0410e25.f2076G[i33];
                    if ((c0410e25.f2079J[i] == 3 && c0410e25.f2111l[i] == 0) && !z3) {
                        C0409d c0409d17 = c0409d16.f2066d;
                        if (c0409d17.f2064b == c0411f2) {
                            c0398f4.m2592d(c0409d16.f2069g, c0409d17.f2069g, -c0409d16.m2545b(), 5);
                            c0398f4.m2589g(c0409d16.f2069g, c0410e23.f2076G[i33].f2066d.f2069g, -c0409d16.m2545b(), 6);
                            if (z5) {
                                int i34 = i3 + 1;
                                C0404l c0404l9 = c0411f2.f2076G[i34].f2069g;
                                C0409d[] c0409dArr4 = c0410e23.f2076G;
                                c0398f4.m2590f(c0404l9, c0409dArr4[i34].f2069g, c0409dArr4[i34].m2545b(), 8);
                            }
                            arrayList = c0407b3.f2040h;
                            if (arrayList != null && (size = arrayList.size()) > 1) {
                                float f4 = (c0407b3.f2049q || c0407b3.f2051s) ? f3 : c0407b3.f2042j;
                                C0410e c0410e31 = null;
                                float f5 = 0.0f;
                                i8 = 0;
                                while (i8 < size) {
                                    C0410e c0410e32 = (C0410e) arrayList.get(i8);
                                    float f6 = c0410e32.f2099b0[i];
                                    if (f6 < 0.0f) {
                                        if (c0407b3.f2051s) {
                                            C0409d[] c0409dArr5 = c0410e32.f2076G;
                                            C0404l c0404l10 = c0409dArr5[i3 + 1].f2069g;
                                            c0404l7 = c0409dArr5[i3].f2069g;
                                            i9 = size;
                                            c0404l8 = c0404l10;
                                            i10 = 0;
                                            i11 = 4;
                                            c0398f4.m2592d(c0404l8, c0404l7, i10, i11);
                                            c0407b2 = c0407b3;
                                            arrayList2 = arrayList;
                                            c0410e12 = c0410e23;
                                            i8++;
                                            size = i9;
                                            c0410e23 = c0410e12;
                                            arrayList = arrayList2;
                                            c0407b3 = c0407b2;
                                        } else {
                                            f6 = 1.0f;
                                        }
                                    }
                                    if (f6 == 0.0f) {
                                        C0409d[] c0409dArr6 = c0410e32.f2076G;
                                        C0404l c0404l11 = c0409dArr6[i3 + 1].f2069g;
                                        c0404l7 = c0409dArr6[i3].f2069g;
                                        i9 = size;
                                        c0404l8 = c0404l11;
                                        i10 = 0;
                                        i11 = 8;
                                        c0398f4.m2592d(c0404l8, c0404l7, i10, i11);
                                        c0407b2 = c0407b3;
                                        arrayList2 = arrayList;
                                        c0410e12 = c0410e23;
                                        i8++;
                                        size = i9;
                                        c0410e23 = c0410e12;
                                        arrayList = arrayList2;
                                        c0407b3 = c0407b2;
                                    } else {
                                        i9 = size;
                                        if (c0410e31 != null) {
                                            C0409d[] c0409dArr7 = c0410e31.f2076G;
                                            C0404l c0404l12 = c0409dArr7[i3].f2069g;
                                            int i35 = i3 + 1;
                                            C0404l c0404l13 = c0409dArr7[i35].f2069g;
                                            C0409d[] c0409dArr8 = c0410e32.f2076G;
                                            arrayList2 = arrayList;
                                            C0404l c0404l14 = c0409dArr8[i3].f2069g;
                                            C0404l c0404l15 = c0409dArr8[i35].f2069g;
                                            c0410e13 = c0410e32;
                                            C0395c m2583m = c0398f.m2583m();
                                            c0407b2 = c0407b3;
                                            m2583m.f1960b = 0.0f;
                                            c0410e12 = c0410e23;
                                            if (f4 == 0.0f || f5 == f6) {
                                                f = -1.0f;
                                                m2583m.f1962d.mo2558c(c0404l12, 1.0f);
                                                m2583m.f1962d.mo2558c(c0404l13, -1.0f);
                                                m2583m.f1962d.mo2558c(c0404l15, 1.0f);
                                                interfaceC0394b = m2583m.f1962d;
                                            } else {
                                                if (f5 == 0.0f) {
                                                    m2583m.f1962d.mo2558c(c0404l12, 1.0f);
                                                    m2583m.f1962d.mo2558c(c0404l13, -1.0f);
                                                } else if (f6 == 0.0f) {
                                                    m2583m.f1962d.mo2558c(c0404l14, 1.0f);
                                                    m2583m.f1962d.mo2558c(c0404l15, -1.0f);
                                                } else {
                                                    float f7 = (f5 / f4) / (f6 / f4);
                                                    m2583m.f1962d.mo2558c(c0404l12, 1.0f);
                                                    m2583m.f1962d.mo2558c(c0404l13, -1.0f);
                                                    m2583m.f1962d.mo2558c(c0404l15, f7);
                                                    interfaceC0394b = m2583m.f1962d;
                                                    f = -f7;
                                                }
                                                c0398f4.m2593c(m2583m);
                                            }
                                            interfaceC0394b.mo2558c(c0404l14, f);
                                            c0398f4.m2593c(m2583m);
                                        } else {
                                            c0407b2 = c0407b3;
                                            arrayList2 = arrayList;
                                            c0410e12 = c0410e23;
                                            c0410e13 = c0410e32;
                                        }
                                        f5 = f6;
                                        c0410e31 = c0410e13;
                                        i8++;
                                        size = i9;
                                        c0410e23 = c0410e12;
                                        arrayList = arrayList2;
                                        c0407b3 = c0407b2;
                                    }
                                }
                            }
                            c0407b = c0407b3;
                            c0410e = c0410e23;
                            if (c0410e24 == null && (c0410e24 == c0410e25 || z3)) {
                                C0409d c0409d18 = c0410e30.f2076G[i3];
                                c0410e4 = c0410e;
                                int i36 = i3 + 1;
                                C0409d c0409d19 = c0410e4.f2076G[i36];
                                C0409d c0409d20 = c0409d18.f2066d;
                                C0404l c0404l16 = c0409d20 != null ? c0409d20.f2069g : null;
                                C0409d c0409d21 = c0409d19.f2066d;
                                C0404l c0404l17 = c0409d21 != null ? c0409d21.f2069g : null;
                                C0409d c0409d22 = c0410e24.f2076G[i3];
                                C0409d c0409d23 = c0410e25.f2076G[i36];
                                if (c0404l16 == null || c0404l17 == null) {
                                    c0410e2 = c0410e25;
                                    c0410e11 = c0410e24;
                                    i5 = i31;
                                } else {
                                    float f8 = i == 0 ? c0410e29.f2090U : c0410e29.f2091V;
                                    int m2545b5 = c0409d22.m2545b();
                                    c0410e2 = c0410e25;
                                    c0410e11 = c0410e24;
                                    i5 = i31;
                                    c0398f.m2594b(c0409d22.f2069g, c0404l16, m2545b5, f8, c0404l17, c0409d23.f2069g, c0409d23.m2545b(), 7);
                                }
                                c0410e3 = c0410e11;
                            } else {
                                c0410e2 = c0410e25;
                                c0410e3 = c0410e24;
                                c0410e4 = c0410e;
                                i5 = i31;
                                if (!z && c0410e3 != null) {
                                    int i37 = c0407b.f2042j;
                                    boolean z9 = i37 > 0 && c0407b.f2041i == i37;
                                    C0410e c0410e33 = c0410e3;
                                    for (C0410e c0410e34 = c0410e33; c0410e34 != null; c0410e34 = c0410e8) {
                                        C0410e c0410e35 = c0410e34.f2103d0[i];
                                        while (c0410e35 != null && c0410e35.f2093X == 8) {
                                            c0410e35 = c0410e35.f2103d0[i];
                                        }
                                        if (c0410e35 != null || c0410e34 == c0410e2) {
                                            C0409d c0409d24 = c0410e34.f2076G[i3];
                                            C0404l c0404l18 = c0409d24.f2069g;
                                            C0409d c0409d25 = c0409d24.f2066d;
                                            C0404l c0404l19 = c0409d25 != null ? c0409d25.f2069g : null;
                                            if (c0410e33 != c0410e34) {
                                                c0409d6 = c0410e33.f2076G[i3 + 1];
                                            } else {
                                                if (c0410e34 == c0410e3 && c0410e33 == c0410e34) {
                                                    C0409d[] c0409dArr9 = c0410e30.f2076G;
                                                    if (c0409dArr9[i3].f2066d != null) {
                                                        c0409d6 = c0409dArr9[i3].f2066d;
                                                    } else {
                                                        c0404l19 = null;
                                                    }
                                                }
                                                m2545b = c0409d24.m2545b();
                                                int i38 = i3 + 1;
                                                int m2545b6 = c0410e34.f2076G[i38].m2545b();
                                                if (c0410e35 == null) {
                                                    C0409d c0409d26 = c0410e35.f2076G[i3];
                                                    c0404l3 = c0409d26.f2069g;
                                                    c0409d7 = c0409d26;
                                                    c0409d8 = c0410e34.f2076G[i38];
                                                } else {
                                                    C0409d c0409d27 = c0410e4.f2076G[i38].f2066d;
                                                    if (c0409d27 != null) {
                                                        c0404l3 = c0409d27.f2069g;
                                                        c0409d7 = c0409d27;
                                                    } else {
                                                        c0409d7 = c0409d27;
                                                        c0404l3 = null;
                                                    }
                                                    c0409d8 = c0410e34.f2076G[i38];
                                                }
                                                c0404l4 = c0409d8.f2069g;
                                                if (c0409d7 != null) {
                                                    m2545b6 += c0409d7.m2545b();
                                                }
                                                i6 = m2545b6;
                                                if (c0410e33 != null) {
                                                    m2545b += c0410e33.f2076G[i38].m2545b();
                                                }
                                                if (c0404l18 != null && c0404l19 != null && c0404l3 != null && c0404l4 != null) {
                                                    if (c0410e34 == c0410e3) {
                                                        m2545b = c0410e3.f2076G[i3].m2545b();
                                                    }
                                                    int i39 = m2545b;
                                                    if (c0410e34 == c0410e2) {
                                                        i6 = c0410e2.f2076G[i38].m2545b();
                                                    }
                                                    C0404l c0404l20 = c0404l3;
                                                    c0410e8 = c0410e35;
                                                    c0410e9 = c0410e33;
                                                    c0410e10 = c0410e34;
                                                    c0398f.m2594b(c0404l18, c0404l19, i39, 0.5f, c0404l20, c0404l4, i6, !z9 ? 8 : 5);
                                                    c0410e33 = c0410e10.f2093X != 8 ? c0410e10 : c0410e9;
                                                }
                                            }
                                            c0404l19 = c0409d6.f2069g;
                                            m2545b = c0409d24.m2545b();
                                            int i382 = i3 + 1;
                                            int m2545b62 = c0410e34.f2076G[i382].m2545b();
                                            if (c0410e35 == null) {
                                            }
                                            c0404l4 = c0409d8.f2069g;
                                            if (c0409d7 != null) {
                                            }
                                            i6 = m2545b62;
                                            if (c0410e33 != null) {
                                            }
                                            if (c0404l18 != null) {
                                                if (c0410e34 == c0410e3) {
                                                }
                                                int i392 = m2545b;
                                                if (c0410e34 == c0410e2) {
                                                }
                                                C0404l c0404l202 = c0404l3;
                                                c0410e8 = c0410e35;
                                                c0410e9 = c0410e33;
                                                c0410e10 = c0410e34;
                                                c0398f.m2594b(c0404l18, c0404l19, i392, 0.5f, c0404l202, c0404l4, i6, !z9 ? 8 : 5);
                                                if (c0410e10.f2093X != 8) {
                                                }
                                            }
                                        }
                                        c0410e8 = c0410e35;
                                        c0410e9 = c0410e33;
                                        c0410e10 = c0410e34;
                                        if (c0410e10.f2093X != 8) {
                                        }
                                    }
                                } else if (z2 && c0410e3 != null) {
                                    int i40 = c0407b.f2042j;
                                    boolean z10 = i40 <= 0 && c0407b.f2041i == i40;
                                    c0410e5 = c0410e3;
                                    C0410e c0410e36 = c0410e5;
                                    while (c0410e5 != null) {
                                        C0410e c0410e37 = c0410e5.f2103d0[i];
                                        while (c0410e37 != null && c0410e37.f2093X == 8) {
                                            c0410e37 = c0410e37.f2103d0[i];
                                        }
                                        if (c0410e5 == c0410e3 || c0410e5 == c0410e2 || c0410e37 == null) {
                                            c0410e6 = c0410e37;
                                        } else {
                                            C0410e c0410e38 = c0410e37 == c0410e2 ? null : c0410e37;
                                            C0409d c0409d28 = c0410e5.f2076G[i3];
                                            C0404l c0404l21 = c0409d28.f2069g;
                                            int i41 = i3 + 1;
                                            C0404l c0404l22 = c0410e36.f2076G[i41].f2069g;
                                            int m2545b7 = c0409d28.m2545b();
                                            int m2545b8 = c0410e5.f2076G[i41].m2545b();
                                            if (c0410e38 != null) {
                                                c0409d4 = c0410e38.f2076G[i3];
                                                c0404l = c0409d4.f2069g;
                                                c0409d5 = c0409d4.f2066d;
                                                if (c0409d5 == null) {
                                                    c0404l2 = null;
                                                    int m2545b9 = c0409d4 == null ? c0409d4.m2545b() + m2545b8 : m2545b8;
                                                    int m2545b10 = c0410e36.f2076G[i41].m2545b() + m2545b7;
                                                    int i42 = !z10 ? 8 : 4;
                                                    if (c0404l21 != null || c0404l22 == null || c0404l == null || c0404l2 == null) {
                                                        c0410e7 = c0410e38;
                                                    } else {
                                                        C0404l c0404l23 = c0404l;
                                                        C0404l c0404l24 = c0404l2;
                                                        int i43 = m2545b9;
                                                        c0410e7 = c0410e38;
                                                        c0398f.m2594b(c0404l21, c0404l22, m2545b10, 0.5f, c0404l23, c0404l24, i43, i42);
                                                    }
                                                    c0410e6 = c0410e7;
                                                }
                                            } else {
                                                c0409d4 = c0410e2.f2076G[i3];
                                                c0404l = c0409d4 != null ? c0409d4.f2069g : null;
                                                c0409d5 = c0410e5.f2076G[i41];
                                            }
                                            c0404l2 = c0409d5.f2069g;
                                            if (c0409d4 == null) {
                                            }
                                            int m2545b102 = c0410e36.f2076G[i41].m2545b() + m2545b7;
                                            if (!z10) {
                                            }
                                            if (c0404l21 != null) {
                                            }
                                            c0410e7 = c0410e38;
                                            c0410e6 = c0410e7;
                                        }
                                        if (c0410e5.f2093X != 8) {
                                            c0410e36 = c0410e5;
                                        }
                                        c0410e5 = c0410e6;
                                    }
                                    C0409d c0409d29 = c0410e3.f2076G[i3];
                                    c0409d = c0410e30.f2076G[i3].f2066d;
                                    int i44 = i3 + 1;
                                    c0409d2 = c0410e2.f2076G[i44];
                                    c0409d3 = c0410e4.f2076G[i44].f2066d;
                                    if (c0409d == null) {
                                        if (c0410e3 != c0410e2) {
                                            c0398f3 = c0398f;
                                            c0398f3.m2592d(c0409d29.f2069g, c0409d.f2069g, c0409d29.m2545b(), 5);
                                        } else {
                                            c0398f3 = c0398f;
                                            if (c0409d3 != null) {
                                                c0398f2 = c0398f3;
                                                c0398f.m2594b(c0409d29.f2069g, c0409d.f2069g, c0409d29.m2545b(), 0.5f, c0409d2.f2069g, c0409d3.f2069g, c0409d2.m2545b(), 5);
                                            }
                                        }
                                        c0398f2 = c0398f3;
                                    } else {
                                        c0398f2 = c0398f;
                                    }
                                    if (c0409d3 != null && c0410e3 != c0410e2) {
                                        c0398f2.m2592d(c0409d2.f2069g, c0409d3.f2069g, -c0409d2.m2545b(), 5);
                                    }
                                    if ((!z || z2) && c0410e3 != null && c0410e3 != c0410e2) {
                                        C0409d[] c0409dArr10 = c0410e3.f2076G;
                                        c0409d9 = c0409dArr10[i3];
                                        i7 = i3 + 1;
                                        c0409d10 = c0410e2.f2076G[i7];
                                        C0409d c0409d30 = c0409d9.f2066d;
                                        c0404l5 = c0409d30 == null ? c0409d30.f2069g : null;
                                        C0409d c0409d31 = c0409d10.f2066d;
                                        c0404l6 = c0409d31 == null ? c0409d31.f2069g : null;
                                        if (c0410e4 != c0410e2) {
                                            C0409d c0409d32 = c0410e4.f2076G[i7].f2066d;
                                            c0404l6 = c0409d32 != null ? c0409d32.f2069g : null;
                                        }
                                        if (c0410e3 == c0410e2) {
                                            c0409d9 = c0409dArr10[i3];
                                            c0409d10 = c0409dArr10[i7];
                                        }
                                        if (c0404l5 != null && c0404l6 != null) {
                                            c0398f.m2594b(c0409d9.f2069g, c0404l5, c0409d9.m2545b(), 0.5f, c0404l6, c0409d10.f2069g, c0410e2.f2076G[i7].m2545b(), 5);
                                        }
                                    }
                                    i15 = i5 + 1;
                                    c0398f4 = c0398f2;
                                    c0407bArr = c0407bArr3;
                                    i2 = i32;
                                    i14 = 2;
                                    c0411f2 = c0411f;
                                }
                            }
                            c0398f2 = c0398f;
                            if (!z) {
                            }
                            C0409d[] c0409dArr102 = c0410e3.f2076G;
                            c0409d9 = c0409dArr102[i3];
                            i7 = i3 + 1;
                            c0409d10 = c0410e2.f2076G[i7];
                            C0409d c0409d302 = c0409d9.f2066d;
                            if (c0409d302 == null) {
                            }
                            C0409d c0409d312 = c0409d10.f2066d;
                            if (c0409d312 == null) {
                            }
                            if (c0410e4 != c0410e2) {
                            }
                            if (c0410e3 == c0410e2) {
                            }
                            if (c0404l5 != null) {
                                c0398f.m2594b(c0409d9.f2069g, c0404l5, c0409d9.m2545b(), 0.5f, c0404l6, c0409d10.f2069g, c0410e2.f2076G[i7].m2545b(), 5);
                            }
                            i15 = i5 + 1;
                            c0398f4 = c0398f2;
                            c0407bArr = c0407bArr3;
                            i2 = i32;
                            i14 = 2;
                            c0411f2 = c0411f;
                        }
                    }
                    if (z3) {
                        C0409d c0409d33 = c0409d16.f2066d;
                        if (c0409d33.f2064b == c0411f2) {
                            c0398f4.m2592d(c0409d16.f2069g, c0409d33.f2069g, -c0409d16.m2545b(), 4);
                            c0398f4.m2589g(c0409d16.f2069g, c0410e23.f2076G[i33].f2066d.f2069g, -c0409d16.m2545b(), 6);
                            if (z5) {
                            }
                            arrayList = c0407b3.f2040h;
                            if (arrayList != null) {
                                if (c0407b3.f2049q) {
                                }
                                C0410e c0410e312 = null;
                                float f52 = 0.0f;
                                i8 = 0;
                                while (i8 < size) {
                                }
                            }
                            c0407b = c0407b3;
                            c0410e = c0410e23;
                            if (c0410e24 == null) {
                            }
                            c0410e2 = c0410e25;
                            c0410e3 = c0410e24;
                            c0410e4 = c0410e;
                            i5 = i31;
                            if (!z) {
                            }
                            if (z2) {
                                int i402 = c0407b.f2042j;
                                if (i402 <= 0) {
                                }
                                c0410e5 = c0410e3;
                                C0410e c0410e362 = c0410e5;
                                while (c0410e5 != null) {
                                }
                                C0409d c0409d292 = c0410e3.f2076G[i3];
                                c0409d = c0410e30.f2076G[i3].f2066d;
                                int i442 = i3 + 1;
                                c0409d2 = c0410e2.f2076G[i442];
                                c0409d3 = c0410e4.f2076G[i442].f2066d;
                                if (c0409d == null) {
                                }
                                if (c0409d3 != null) {
                                    c0398f2.m2592d(c0409d2.f2069g, c0409d3.f2069g, -c0409d2.m2545b(), 5);
                                }
                                if (!z) {
                                }
                                C0409d[] c0409dArr1022 = c0410e3.f2076G;
                                c0409d9 = c0409dArr1022[i3];
                                i7 = i3 + 1;
                                c0409d10 = c0410e2.f2076G[i7];
                                C0409d c0409d3022 = c0409d9.f2066d;
                                if (c0409d3022 == null) {
                                }
                                C0409d c0409d3122 = c0409d10.f2066d;
                                if (c0409d3122 == null) {
                                }
                                if (c0410e4 != c0410e2) {
                                }
                                if (c0410e3 == c0410e2) {
                                }
                                if (c0404l5 != null) {
                                }
                                i15 = i5 + 1;
                                c0398f4 = c0398f2;
                                c0407bArr = c0407bArr3;
                                i2 = i32;
                                i14 = 2;
                                c0411f2 = c0411f;
                            }
                            c0398f2 = c0398f;
                            if (!z) {
                            }
                            C0409d[] c0409dArr10222 = c0410e3.f2076G;
                            c0409d9 = c0409dArr10222[i3];
                            i7 = i3 + 1;
                            c0409d10 = c0410e2.f2076G[i7];
                            C0409d c0409d30222 = c0409d9.f2066d;
                            if (c0409d30222 == null) {
                            }
                            C0409d c0409d31222 = c0409d10.f2066d;
                            if (c0409d31222 == null) {
                            }
                            if (c0410e4 != c0410e2) {
                            }
                            if (c0410e3 == c0410e2) {
                            }
                            if (c0404l5 != null) {
                            }
                            i15 = i5 + 1;
                            c0398f4 = c0398f2;
                            c0407bArr = c0407bArr3;
                            i2 = i32;
                            i14 = 2;
                            c0411f2 = c0411f;
                        }
                    }
                    c0398f4.m2589g(c0409d16.f2069g, c0410e23.f2076G[i33].f2066d.f2069g, -c0409d16.m2545b(), 6);
                    if (z5) {
                    }
                    arrayList = c0407b3.f2040h;
                    if (arrayList != null) {
                    }
                    c0407b = c0407b3;
                    c0410e = c0410e23;
                    if (c0410e24 == null) {
                    }
                    c0410e2 = c0410e25;
                    c0410e3 = c0410e24;
                    c0410e4 = c0410e;
                    i5 = i31;
                    if (!z) {
                    }
                    if (z2) {
                    }
                    c0398f2 = c0398f;
                    if (!z) {
                    }
                    C0409d[] c0409dArr102222 = c0410e3.f2076G;
                    c0409d9 = c0409dArr102222[i3];
                    i7 = i3 + 1;
                    c0409d10 = c0410e2.f2076G[i7];
                    C0409d c0409d302222 = c0409d9.f2066d;
                    if (c0409d302222 == null) {
                    }
                    C0409d c0409d312222 = c0409d10.f2066d;
                    if (c0409d312222 == null) {
                    }
                    if (c0410e4 != c0410e2) {
                    }
                    if (c0410e3 == c0410e2) {
                    }
                    if (c0404l5 != null) {
                    }
                    i15 = i5 + 1;
                    c0398f4 = c0398f2;
                    c0407bArr = c0407bArr3;
                    i2 = i32;
                    i14 = 2;
                    c0411f2 = c0411f;
                }
            }
            if (z5) {
            }
            arrayList = c0407b3.f2040h;
            if (arrayList != null) {
            }
            c0407b = c0407b3;
            c0410e = c0410e23;
            if (c0410e24 == null) {
            }
            c0410e2 = c0410e25;
            c0410e3 = c0410e24;
            c0410e4 = c0410e;
            i5 = i31;
            if (!z) {
            }
            if (z2) {
            }
            c0398f2 = c0398f;
            if (!z) {
            }
            C0409d[] c0409dArr1022222 = c0410e3.f2076G;
            c0409d9 = c0409dArr1022222[i3];
            i7 = i3 + 1;
            c0409d10 = c0410e2.f2076G[i7];
            C0409d c0409d3022222 = c0409d9.f2066d;
            if (c0409d3022222 == null) {
            }
            C0409d c0409d3122222 = c0409d10.f2066d;
            if (c0409d3122222 == null) {
            }
            if (c0410e4 != c0410e2) {
            }
            if (c0410e3 == c0410e2) {
            }
            if (c0404l5 != null) {
            }
            i15 = i5 + 1;
            c0398f4 = c0398f2;
            c0407bArr = c0407bArr3;
            i2 = i32;
            i14 = 2;
            c0411f2 = c0411f;
        }
    }

    /* renamed from: a0 */
    public static void m3506a0(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i < 17) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }
    }

    /* renamed from: b */
    public static void m3505b(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: b0 */
    public static void m3504b0(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m3461y(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m3461y(layoutInflater, factory2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = false;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m3503c(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z;
        int i2;
        int i3;
        boolean m3501d = m3501d(i, rect, rect2);
        if (m3501d(i, rect, rect3) || !m3501d) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        if (!z || i == 17 || i == 66) {
            return true;
        }
        int m3517Q = m3517Q(i, rect, rect2);
        if (i == 17) {
            i2 = rect.left;
            i3 = rect3.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect3.top;
        } else if (i == 66) {
            i2 = rect3.right;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect3.bottom;
            i3 = rect.bottom;
        }
        return m3517Q < Math.max(1, i2 - i3);
    }

    /* renamed from: c0 */
    public static void m3502c0(TextView textView, int i) {
        m3495g(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = (i2 < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: d */
    public static boolean m3501d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: d0 */
    public static void m3500d0(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: e */
    public static boolean m3499e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: e0 */
    public static void m3498e0(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: f */
    public static boolean m3497f(C0509d[] c0509dArr, C0509d[] c0509dArr2) {
        if (c0509dArr == null || c0509dArr2 == null || c0509dArr.length != c0509dArr2.length) {
            return false;
        }
        for (int i = 0; i < c0509dArr.length; i++) {
            if (c0509dArr[i].f2547a != c0509dArr2[i].f2547a || c0509dArr[i].f2548b.length != c0509dArr2[i].f2548b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f0 */
    public static void m3496f0(TextView textView, int i) {
        m3495g(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: g */
    public static int m3495g(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g0 */
    public static boolean m3494g0(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f51n) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f50m = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f51n = true;
            }
            Method method = f50m;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception unused2) {
                    f50m = null;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static Object m3493h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: h0 */
    public static void m3492h0(TextView textView, int i) {
        m3495g(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* renamed from: i */
    public static int m3491i(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i = Build.VERSION.SDK_INT;
            String permissionToOp = i >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            return (i >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) : 1) != 0 ? -2 : 0;
        }
        return -1;
    }

    /* renamed from: i0 */
    public static void m3490i0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    /* renamed from: j */
    public static int m3489j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: j0 */
    public static void m3488j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    /* renamed from: k */
    public static void m3487k(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable drawable2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 || i < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            drawable2 = ((InsetDrawable) drawable).getDrawable();
        } else if (drawable instanceof InterfaceC0522b) {
            drawable2 = ((C0523c) ((InterfaceC0522b) drawable)).f2575h;
        } else if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        } else {
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable child = drawableContainerState.getChild(i2);
                if (child != null) {
                    m3487k(child);
                }
            }
            return;
        }
        m3487k(drawable2);
    }

    /* renamed from: k0 */
    public static void m3486k0(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!f61x) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f60w = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f61x = true;
            }
            Field field = f60w;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: l */
    public static int m3485l(C0929d2 c0929d2, AbstractC0999v0 abstractC0999v0, View view, View view2, AbstractC0980q1 abstractC0980q1, boolean z) {
        if (abstractC0980q1.m1492z() == 0 || c0929d2.m1684b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(abstractC0999v0.mo1435l(), abstractC0999v0.mo1445b(view2) - abstractC0999v0.mo1442e(view));
        }
        return Math.abs(abstractC0980q1.m1556S(view) - abstractC0980q1.m1556S(view2)) + 1;
    }

    /* renamed from: l0 */
    public static void m3484l0(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: m */
    public static int m3483m(C0929d2 c0929d2, AbstractC0999v0 abstractC0999v0, View view, View view2, AbstractC0980q1 abstractC0980q1, boolean z, boolean z2) {
        if (abstractC0980q1.m1492z() == 0 || c0929d2.m1684b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0929d2.m1684b() - Math.max(abstractC0980q1.m1556S(view), abstractC0980q1.m1556S(view2))) - 1) : Math.max(0, Math.min(abstractC0980q1.m1556S(view), abstractC0980q1.m1556S(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC0999v0.mo1445b(view2) - abstractC0999v0.mo1442e(view)) / (Math.abs(abstractC0980q1.m1556S(view) - abstractC0980q1.m1556S(view2)) + 1))) + (abstractC0999v0.mo1436k() - abstractC0999v0.mo1442e(view)));
        }
        return max;
    }

    /* renamed from: m0 */
    public static void m3482m0(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC0521a) {
            ((InterfaceC0521a) drawable).setTint(i);
        }
    }

    /* renamed from: n */
    public static int m3481n(C0929d2 c0929d2, AbstractC0999v0 abstractC0999v0, View view, View view2, AbstractC0980q1 abstractC0980q1, boolean z) {
        if (abstractC0980q1.m1492z() == 0 || c0929d2.m1684b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((abstractC0999v0.mo1445b(view2) - abstractC0999v0.mo1442e(view)) / (Math.abs(abstractC0980q1.m1556S(view) - abstractC0980q1.m1556S(view2)) + 1)) * c0929d2.m1684b());
        }
        return c0929d2.m1684b();
    }

    /* renamed from: n0 */
    public static void m3480n0(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC0521a) {
            ((InterfaceC0521a) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: o */
    public static float[] m3479o(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o0 */
    public static void m3478o0(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC0521a) {
            ((InterfaceC0521a) drawable).setTintMode(mode);
        }
    }

    /* renamed from: p */
    public static boolean m3477p(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean m3475q = m3475q(file, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m3475q;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: p0 */
    public static void m3476p0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        View$OnLongClickListenerC0233d4 view$OnLongClickListenerC0233d4 = View$OnLongClickListenerC0233d4.f1507b;
        if (view$OnLongClickListenerC0233d4 != null && view$OnLongClickListenerC0233d4.f1509d == view) {
            View$OnLongClickListenerC0233d4.m2855c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new View$OnLongClickListenerC0233d4(view, charSequence);
            return;
        }
        View$OnLongClickListenerC0233d4 view$OnLongClickListenerC0233d42 = View$OnLongClickListenerC0233d4.f1508c;
        if (view$OnLongClickListenerC0233d42 != null && view$OnLongClickListenerC0233d42.f1509d == view) {
            view$OnLongClickListenerC0233d42.m2856b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: q */
    public static boolean m3475q(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: q0 */
    public static void m3474q0(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f59v) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f58u = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f59v = true;
        }
        Method method = f58u;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: r */
    public static ColorStateList m3473r(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m3471s(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: r0 */
    public static void m3472r0(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r8.hasValue(r12) != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m3471s(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            int i = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr = new int[20];
            int[] iArr2 = new int[20];
            int i2 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    int[] iArr3 = AbstractC0463c.ColorStateListItem;
                    TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                    int color = obtainAttributes.getColor(AbstractC0463c.ColorStateListItem_android_color, -65281);
                    float f = 1.0f;
                    int i3 = AbstractC0463c.ColorStateListItem_android_alpha;
                    if (!obtainAttributes.hasValue(i3)) {
                        i3 = AbstractC0463c.ColorStateListItem_alpha;
                    }
                    f = obtainAttributes.getFloat(i3, 1.0f);
                    obtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i4 = 0;
                    for (int i5 = 0; i5 < attributeCount; i5++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC0461a.alpha) {
                            int i6 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i4] = attributeNameResource;
                            i4 = i6;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr4, i4);
                    int round = (Math.round(Color.alpha(color) * f) << 24) | (color & 16777215);
                    int i7 = i2 + 1;
                    if (i7 > iArr2.length) {
                        int[] iArr5 = new int[i2 <= 4 ? 8 : i2 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i2);
                        iArr2 = iArr5;
                    }
                    iArr2[i2] = round;
                    if (i7 > iArr.length) {
                        ?? r8 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                        System.arraycopy(iArr, 0, r8, 0, i2);
                        iArr = r8;
                    }
                    iArr[i2] = trimStateSet;
                    iArr = iArr;
                    i2 = i7;
                }
                i = 1;
            }
            int[] iArr6 = new int[i2];
            int[][] iArr7 = new int[i2];
            System.arraycopy(iArr2, 0, iArr6, 0, i2);
            System.arraycopy(iArr, 0, iArr7, 0, i2);
            return new ColorStateList(iArr7, iArr6);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: s0 */
    public static List m3470s0(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00ba, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0097 A[SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0509d[] m3469t(String str) {
        String trim;
        float[] fArr;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i2++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i2).trim();
                    if (trim.length() > 0) {
                        if (trim.charAt(i) == 'z' || trim.charAt(i) == 'Z') {
                            fArr = new float[i];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i4 = 1;
                                int i5 = 0;
                                while (i4 < length) {
                                    boolean z = false;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    int i6 = i4;
                                    while (i6 < trim.length()) {
                                        char charAt2 = trim.charAt(i6);
                                        if (charAt2 != ' ') {
                                            if (charAt2 == 'E' || charAt2 == 'e') {
                                                z4 = true;
                                                if (z) {
                                                    if (i4 < i6) {
                                                        fArr2[i5] = Float.parseFloat(trim.substring(i4, i6));
                                                        i5++;
                                                    }
                                                    if (z2) {
                                                        i6++;
                                                    }
                                                    i4 = i6;
                                                    i = 0;
                                                } else {
                                                    i6++;
                                                }
                                            } else {
                                                switch (charAt2) {
                                                    case '-':
                                                        if (i6 != i4) {
                                                        }
                                                        break;
                                                    case '.':
                                                        if (!z3) {
                                                            z3 = true;
                                                            break;
                                                        }
                                                        z2 = true;
                                                        break;
                                                }
                                                z4 = false;
                                                if (z) {
                                                }
                                            }
                                        }
                                        z = true;
                                        z4 = false;
                                        if (z) {
                                        }
                                    }
                                    if (i4 < i6) {
                                    }
                                    if (z2) {
                                    }
                                    i4 = i6;
                                    i = 0;
                                }
                                fArr = m3479o(fArr2, i, i5);
                                i = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(AbstractC1124a.m1189g("error in parsing \"", trim, "\""), e);
                            }
                        }
                        arrayList.add(new C0509d(trim.charAt(i), fArr));
                    }
                    i3 = i2;
                    i2++;
                    i = 0;
                }
                i2++;
            }
            trim = str.substring(i3, i2).trim();
            if (trim.length() > 0) {
            }
            i3 = i2;
            i2++;
            i = 0;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            arrayList.add(new C0509d(str.charAt(i3), new float[0]));
        }
        return (C0509d[]) arrayList.toArray(new C0509d[arrayList.size()]);
    }

    /* renamed from: t0 */
    public static Drawable m3468t0(Drawable drawable) {
        return drawable instanceof InterfaceC0522b ? ((C0523c) ((InterfaceC0522b) drawable)).f2575h : drawable;
    }

    /* renamed from: u */
    public static Path m3467u(String str) {
        Path path = new Path();
        C0509d[] m3469t = m3469t(str);
        if (m3469t != null) {
            try {
                C0509d.m2382b(m3469t, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException(AbstractC1124a.m1190f("Error in parsing ", str), e);
            }
        }
        return null;
    }

    /* renamed from: u0 */
    public static Drawable m3466u0(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof InterfaceC0521a) ? new C0524d(drawable) : drawable : !(drawable instanceof InterfaceC0521a) ? new C0523c(drawable) : drawable;
    }

    /* renamed from: v */
    public static C0509d[] m3465v(C0509d[] c0509dArr) {
        if (c0509dArr == null) {
            return null;
        }
        C0509d[] c0509dArr2 = new C0509d[c0509dArr.length];
        for (int i = 0; i < c0509dArr.length; i++) {
            c0509dArr2[i] = new C0509d(c0509dArr[i]);
        }
        return c0509dArr2;
    }

    /* renamed from: v0 */
    public static ActionMode.Callback m3464v0(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC0645h)) ? callback : new ActionMode$CallbackC0645h(callback, textView);
    }

    /* renamed from: w */
    public static boolean m3463w(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? C0021s.m3534a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: x */
    public static void m3462x(Object obj) {
        if (!f41d) {
            try {
                f40c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f41d = true;
        }
        Class cls = f40c;
        if (cls == null) {
            return;
        }
        if (!f43f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f42e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f43f = true;
        }
        Field field = f42e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: y */
    public static void m3461y(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f55r) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f54q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f55r = true;
        }
        Field field = f54q;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                String str = "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.";
            }
        }
    }

    /* renamed from: z */
    public static int m3460z(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }
}