package p010b.p016c.p026q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b.c.q.j1 */
/* loaded from: classes.dex */
public class C0265j1 {

    /* renamed from: a */
    public static final RectF f1611a = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: b */
    public static ConcurrentHashMap f1612b = new ConcurrentHashMap();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c */
    public static ConcurrentHashMap f1613c = new ConcurrentHashMap();

    /* renamed from: d */
    public int f1614d = 0;

    /* renamed from: e */
    public boolean f1615e = false;

    /* renamed from: f */
    public float f1616f = -1.0f;

    /* renamed from: g */
    public float f1617g = -1.0f;

    /* renamed from: h */
    public float f1618h = -1.0f;

    /* renamed from: i */
    public int[] f1619i = new int[0];

    /* renamed from: j */
    public boolean f1620j = false;

    /* renamed from: k */
    public TextPaint f1621k;

    /* renamed from: l */
    public final TextView f1622l;

    /* renamed from: m */
    public final Context f1623m;

    /* renamed from: n */
    public final C0260i1 f1624n;

    public C0265j1(TextView textView) {
        this.f1622l = textView;
        this.f1623m = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f1624n = i >= 29 ? new C0254h1() : i >= 23 ? new C0248g1() : new C0260i1();
    }

    /* renamed from: a */
    public static Object m2810a(Object obj, String str, Object obj2) {
        Field field;
        try {
            try {
                field = (Field) f1613c.get(str);
                if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                    field.setAccessible(true);
                    f1613c.put(str, field);
                }
            } catch (NoSuchFieldException unused) {
                field = null;
            }
            return field == null ? obj2 : field.get(obj);
        } catch (IllegalAccessException unused2) {
            return obj2;
        }
    }

    /* renamed from: e */
    public static Method m2806e(String str) {
        try {
            Method method = (Method) f1612b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1612b.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Object m2805f(Object obj, String str, Object obj2) {
        try {
            return m2806e(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* renamed from: b */
    public void m2809b() {
        if (m2801j() && this.f1614d != 0) {
            if (this.f1615e) {
                if (this.f1622l.getMeasuredHeight() <= 0 || this.f1622l.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1624n.mo2815b(this.f1622l) ? 1048576 : (this.f1622l.getMeasuredWidth() - this.f1622l.getTotalPaddingLeft()) - this.f1622l.getTotalPaddingRight();
                int height = (this.f1622l.getHeight() - this.f1622l.getCompoundPaddingBottom()) - this.f1622l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1611a;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m2807d = m2807d(rectF);
                    if (m2807d != this.f1622l.getTextSize()) {
                        m2804g(0, m2807d);
                    }
                }
            }
            this.f1615e = true;
        }
    }

    /* renamed from: c */
    public final int[] m2808c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2807d(RectF rectF) {
        int i;
        int i2;
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f1619i.length;
        if (length != 0) {
            int i3 = length - 1;
            int i4 = 0;
            int i5 = 1;
            int i6 = 0;
            while (i5 <= i3) {
                int i7 = (i5 + i3) / 2;
                int i8 = this.f1619i[i7];
                CharSequence text = this.f1622l.getText();
                TransformationMethod transformationMethod = this.f1622l.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1622l)) != null) {
                    text = transformation;
                }
                int i9 = Build.VERSION.SDK_INT;
                int maxLines = i9 >= 16 ? this.f1622l.getMaxLines() : -1;
                TextPaint textPaint = this.f1621k;
                if (textPaint == null) {
                    this.f1621k = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f1621k.set(this.f1622l.getPaint());
                this.f1621k.setTextSize(i8);
                Layout.Alignment alignment = (Layout.Alignment) m2805f(this.f1622l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i9 >= 23) {
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, i4, text.length(), this.f1621k, round);
                    obtain.setAlignment(alignment).setLineSpacing(this.f1622l.getLineSpacingExtra(), this.f1622l.getLineSpacingMultiplier()).setIncludePad(this.f1622l.getIncludeFontPadding()).setBreakStrategy(this.f1622l.getBreakStrategy()).setHyphenationFrequency(this.f1622l.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                    try {
                        this.f1624n.mo2816a(obtain, this.f1622l);
                    } catch (ClassCastException unused) {
                    }
                    staticLayout = obtain.build();
                    i = maxLines;
                } else if (i9 >= 16) {
                    i = maxLines;
                    staticLayout = new StaticLayout(text, this.f1621k, round, alignment, this.f1622l.getLineSpacingMultiplier(), this.f1622l.getLineSpacingExtra(), this.f1622l.getIncludeFontPadding());
                } else {
                    i = maxLines;
                    i2 = -1;
                    staticLayout = new StaticLayout(text, this.f1621k, round, alignment, ((Float) m2810a(this.f1622l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m2810a(this.f1622l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m2810a(this.f1622l, "mIncludePad", Boolean.TRUE)).booleanValue());
                    if ((i != i2 || (staticLayout.getLineCount() <= i && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom) {
                        i6 = i7 - 1;
                        i3 = i6;
                        i4 = 0;
                    } else {
                        int i10 = i7 + 1;
                        i4 = 0;
                        i6 = i5;
                        i5 = i10;
                    }
                }
                i2 = -1;
                if ((i != i2 || (staticLayout.getLineCount() <= i && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom) {
                }
            }
            return this.f1619i[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: g */
    public void m2804g(int i, float f) {
        Context context = this.f1623m;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f1622l.getPaint().getTextSize()) {
            this.f1622l.getPaint().setTextSize(applyDimension);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1622l.isInLayout() : false;
            if (this.f1622l.getLayout() != null) {
                this.f1615e = false;
                try {
                    Method m2806e = m2806e("nullLayouts");
                    if (m2806e != null) {
                        m2806e.invoke(this.f1622l, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (isInLayout) {
                    this.f1622l.forceLayout();
                } else {
                    this.f1622l.requestLayout();
                }
                this.f1622l.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean m2803h() {
        if (m2801j() && this.f1614d == 1) {
            if (!this.f1620j || this.f1619i.length == 0) {
                int floor = ((int) Math.floor((this.f1618h - this.f1617g) / this.f1616f)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f1616f) + this.f1617g);
                }
                this.f1619i = m2808c(iArr);
            }
            this.f1615e = true;
        } else {
            this.f1615e = false;
        }
        return this.f1615e;
    }

    /* renamed from: i */
    public final boolean m2802i() {
        int[] iArr = this.f1619i;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1620j = z;
        if (z) {
            this.f1614d = 1;
            this.f1617g = iArr[0];
            this.f1618h = iArr[length - 1];
            this.f1616f = -1.0f;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m2801j() {
        return !(this.f1622l instanceof C0235e0);
    }

    /* renamed from: k */
    public final void m2800k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f1614d = 1;
            this.f1617g = f;
            this.f1618h = f2;
            this.f1616f = f3;
            this.f1620j = false;
        }
    }
}