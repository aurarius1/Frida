package p093c.p145g.p146a.p147a.p149b0;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: c.g.a.a.b0.k */
/* loaded from: classes.dex */
public final class C1815k {

    /* renamed from: a */
    public static boolean f5546a;

    /* renamed from: b */
    public static Constructor f5547b;

    /* renamed from: c */
    public static Object f5548c;

    /* renamed from: d */
    public CharSequence f5549d;

    /* renamed from: e */
    public final TextPaint f5550e;

    /* renamed from: f */
    public final int f5551f;

    /* renamed from: g */
    public int f5552g;

    /* renamed from: k */
    public boolean f5556k;

    /* renamed from: h */
    public Layout.Alignment f5553h = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: i */
    public int f5554i = Integer.MAX_VALUE;

    /* renamed from: j */
    public boolean f5555j = true;

    /* renamed from: l */
    public TextUtils.TruncateAt f5557l = null;

    public C1815k(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f5549d = charSequence;
        this.f5550e = textPaint;
        this.f5551f = i;
        this.f5552g = charSequence.length();
    }

    /* renamed from: a */
    public StaticLayout m774a() {
        Class<?> cls;
        if (this.f5549d == null) {
            this.f5549d = "";
        }
        int max = Math.max(0, this.f5551f);
        CharSequence charSequence = this.f5549d;
        if (this.f5554i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f5550e, max, this.f5557l);
        }
        int min = Math.min(charSequence.length(), this.f5552g);
        this.f5552g = min;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.f5556k) {
                this.f5553h = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f5550e, max);
            obtain.setAlignment(this.f5553h);
            obtain.setIncludePad(this.f5555j);
            obtain.setTextDirection(this.f5556k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f5557l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f5554i);
            return obtain.build();
        }
        if (!f5546a) {
            try {
                boolean z = this.f5556k && i >= 23;
                if (i >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f5548c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C1815k.class.getClassLoader();
                    String str = this.f5556k ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f5548c = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
                f5547b = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f5546a = true;
            } catch (Exception e) {
                throw new C1814j(e);
            }
        }
        try {
            Constructor constructor = f5547b;
            constructor.getClass();
            Object obj = f5548c;
            obj.getClass();
            return (StaticLayout) constructor.newInstance(charSequence, 0, Integer.valueOf(this.f5552g), this.f5550e, Integer.valueOf(max), this.f5553h, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f5555j), null, Integer.valueOf(max), Integer.valueOf(this.f5554i));
        } catch (Exception e2) {
            throw new C1814j(e2);
        }
    }
}