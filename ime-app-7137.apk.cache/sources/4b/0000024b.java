package p010b.p044i.p045d;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p010b.p044i.AbstractC0450c;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.i.d.e */
/* loaded from: classes.dex */
public class C0455e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0452b f2411a;

    /* renamed from: b */
    public boolean f2412b;

    /* renamed from: c */
    public int f2413c;

    /* renamed from: d */
    public int f2414d;

    /* renamed from: e */
    public int f2415e;

    /* renamed from: f */
    public int f2416f;

    /* renamed from: g */
    public int f2417g;

    /* renamed from: h */
    public int f2418h;

    /* renamed from: i */
    public int f2419i;

    /* renamed from: j */
    public int f2420j;

    /* renamed from: k */
    public View f2421k;

    /* renamed from: l */
    public View f2422l;

    /* renamed from: m */
    public boolean f2423m;

    /* renamed from: n */
    public boolean f2424n;

    /* renamed from: o */
    public boolean f2425o;

    /* renamed from: p */
    public boolean f2426p;

    /* renamed from: q */
    public final Rect f2427q;

    public C0455e(int i, int i2) {
        super(i, i2);
        this.f2412b = false;
        this.f2413c = 0;
        this.f2414d = 0;
        this.f2415e = -1;
        this.f2416f = -1;
        this.f2417g = 0;
        this.f2418h = 0;
        this.f2427q = new Rect();
    }

    public C0455e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0452b abstractC0452b;
        this.f2412b = false;
        this.f2413c = 0;
        this.f2414d = 0;
        this.f2415e = -1;
        this.f2416f = -1;
        this.f2417g = 0;
        this.f2418h = 0;
        this.f2427q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0450c.CoordinatorLayout_Layout);
        this.f2413c = obtainStyledAttributes.getInteger(AbstractC0450c.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f2416f = obtainStyledAttributes.getResourceId(AbstractC0450c.CoordinatorLayout_Layout_layout_anchor, -1);
        this.f2414d = obtainStyledAttributes.getInteger(AbstractC0450c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.f2415e = obtainStyledAttributes.getInteger(AbstractC0450c.CoordinatorLayout_Layout_layout_keyline, -1);
        this.f2417g = obtainStyledAttributes.getInt(AbstractC0450c.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.f2418h = obtainStyledAttributes.getInt(AbstractC0450c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        int i = AbstractC0450c.CoordinatorLayout_Layout_layout_behavior;
        boolean hasValue = obtainStyledAttributes.hasValue(i);
        this.f2412b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(i);
            String str = CoordinatorLayout.f428b;
            if (TextUtils.isEmpty(string)) {
                abstractC0452b = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f428b;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f430d;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f429c);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0452b = (AbstractC0452b) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC1124a.m1190f("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f2411a = abstractC0452b;
        }
        obtainStyledAttributes.recycle();
        AbstractC0452b abstractC0452b2 = this.f2411a;
        if (abstractC0452b2 != null) {
            abstractC0452b2.mo209f(this);
        }
    }

    public C0455e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2412b = false;
        this.f2413c = 0;
        this.f2414d = 0;
        this.f2415e = -1;
        this.f2416f = -1;
        this.f2417g = 0;
        this.f2418h = 0;
        this.f2427q = new Rect();
    }

    public C0455e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2412b = false;
        this.f2413c = 0;
        this.f2414d = 0;
        this.f2415e = -1;
        this.f2416f = -1;
        this.f2417g = 0;
        this.f2418h = 0;
        this.f2427q = new Rect();
    }

    public C0455e(C0455e c0455e) {
        super((ViewGroup.MarginLayoutParams) c0455e);
        this.f2412b = false;
        this.f2413c = 0;
        this.f2414d = 0;
        this.f2415e = -1;
        this.f2416f = -1;
        this.f2417g = 0;
        this.f2418h = 0;
        this.f2427q = new Rect();
    }

    /* renamed from: a */
    public boolean m2439a(int i) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return this.f2425o;
        }
        return this.f2424n;
    }

    /* renamed from: b */
    public void m2438b(int i, boolean z) {
        if (i == 0) {
            this.f2424n = z;
        } else if (i != 1) {
        } else {
            this.f2425o = z;
        }
    }
}