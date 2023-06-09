package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p010b.p037h.p040b.C0398f;
import p010b.p037h.p040b.p041n.AbstractC0414i;
import p010b.p037h.p040b.p041n.AbstractC0415j;
import p010b.p037h.p040b.p041n.C0406a;
import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.C0411f;
import p010b.p037h.p040b.p041n.C0412g;
import p010b.p037h.p040b.p041n.EnumC0408c;
import p010b.p037h.p040b.p041n.InterfaceC0413h;
import p010b.p037h.p040b.p041n.p042k.AbstractC0430o;
import p010b.p037h.p040b.p041n.p042k.C0418c;
import p010b.p037h.p040b.p041n.p042k.C0419d;
import p010b.p037h.p040b.p041n.p042k.C0421f;
import p010b.p037h.p040b.p041n.p042k.C0425j;
import p010b.p037h.p040b.p041n.p042k.C0427l;
import p010b.p037h.p040b.p041n.p042k.C0429n;
import p010b.p037h.p043c.AbstractC0432b;
import p010b.p037h.p043c.AbstractC0445o;
import p010b.p037h.p043c.AbstractC0447q;
import p010b.p037h.p043c.C0434d;
import p010b.p037h.p043c.C0435e;
import p010b.p037h.p043c.C0438h;
import p010b.p037h.p043c.C0444n;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    public SparseArray f411b;

    /* renamed from: c */
    public ArrayList f412c;

    /* renamed from: d */
    public C0411f f413d;

    /* renamed from: e */
    public int f414e;

    /* renamed from: f */
    public int f415f;

    /* renamed from: g */
    public int f416g;

    /* renamed from: h */
    public int f417h;

    /* renamed from: i */
    public boolean f418i;

    /* renamed from: j */
    public int f419j;

    /* renamed from: k */
    public C0444n f420k;

    /* renamed from: l */
    public C0438h f421l;

    /* renamed from: m */
    public int f422m;

    /* renamed from: n */
    public HashMap f423n;

    /* renamed from: o */
    public int f424o;

    /* renamed from: p */
    public int f425p;

    /* renamed from: q */
    public SparseArray f426q;

    /* renamed from: r */
    public C0435e f427r;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f411b = new SparseArray();
        this.f412c = new ArrayList(4);
        this.f413d = new C0411f();
        this.f414e = 0;
        this.f415f = 0;
        this.f416g = Integer.MAX_VALUE;
        this.f417h = Integer.MAX_VALUE;
        this.f418i = true;
        this.f419j = 263;
        this.f420k = null;
        this.f421l = null;
        this.f422m = -1;
        this.f423n = new HashMap();
        this.f424o = -1;
        this.f425p = -1;
        this.f426q = new SparseArray();
        this.f427r = new C0435e(this, this);
        m3366d(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f411b = new SparseArray();
        this.f412c = new ArrayList(4);
        this.f413d = new C0411f();
        this.f414e = 0;
        this.f415f = 0;
        this.f416g = Integer.MAX_VALUE;
        this.f417h = Integer.MAX_VALUE;
        this.f418i = true;
        this.f419j = 263;
        this.f420k = null;
        this.f421l = null;
        this.f422m = -1;
        this.f423n = new HashMap();
        this.f424o = -1;
        this.f425p = -1;
        this.f426q = new SparseArray();
        this.f427r = new C0435e(this, this);
        m3366d(attributeSet, i, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0434d generateDefaultLayoutParams() {
        return new C0434d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public Object m3368b(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap hashMap = this.f423n;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f423n.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public final C0410e m3367c(View view) {
        if (view == this) {
            return this.f413d;
        }
        if (view == null) {
            return null;
        }
        return ((C0434d) view.getLayoutParams()).f2271k0;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0434d;
    }

    /* renamed from: d */
    public final void m3366d(AttributeSet attributeSet, int i, int i2) {
        C0411f c0411f = this.f413d;
        c0411f.f2092W = this;
        C0435e c0435e = this.f427r;
        c0411f.f2129h0 = c0435e;
        c0411f.f2128g0.f2169f = c0435e;
        this.f411b.put(getId(), this);
        this.f420k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0447q.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0447q.ConstraintLayout_Layout_android_minWidth) {
                    this.f414e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f414e);
                } else if (index == AbstractC0447q.ConstraintLayout_Layout_android_minHeight) {
                    this.f415f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f415f);
                } else if (index == AbstractC0447q.ConstraintLayout_Layout_android_maxWidth) {
                    this.f416g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f416g);
                } else if (index == AbstractC0447q.ConstraintLayout_Layout_android_maxHeight) {
                    this.f417h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f417h);
                } else if (index == AbstractC0447q.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f419j = obtainStyledAttributes.getInt(index, this.f419j);
                } else if (index == AbstractC0447q.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f421l = new C0438h(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f421l = null;
                        }
                    }
                } else if (index == AbstractC0447q.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0444n c0444n = new C0444n();
                        this.f420k = c0444n;
                        c0444n.m2449e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f420k = null;
                    }
                    this.f422m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f413d.m2512I(this.f419j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f412c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0432b) this.f412c.get(i)).m2463g();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public boolean m3365e() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    /* renamed from: f */
    public void m3364f(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f423n == null) {
                this.f423n = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f423n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f418i = true;
        this.f424o = -1;
        this.f425p = -1;
        super.forceLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0206, code lost:
        if (r4 == 6) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020f, code lost:
        if (r4 == 6) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0216, code lost:
        if (r4 == 6) goto L325;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0445  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3363g() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        boolean z3;
        C0410e c0410e;
        int i10;
        C0409d mo2505e;
        C0409d mo2505e2;
        C0410e c0410e2;
        int i11;
        C0409d mo2505e3;
        C0409d mo2505e4;
        int i12;
        C0410e c0410e3;
        int i13;
        int i14;
        C0409d mo2505e5;
        C0409d mo2505e6;
        int i15;
        C0410e c0410e4;
        int i16;
        int i17;
        C0409d mo2505e7;
        C0409d mo2505e8;
        int i18;
        float f2;
        int i19;
        int i20;
        float parseFloat;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        String str;
        int m2467c;
        String resourceName;
        int id;
        C0410e c0410e5;
        int childCount = getChildCount();
        int i26 = 0;
        while (true) {
            if (i26 >= childCount) {
                z = false;
                break;
            } else if (getChildAt(i26).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i26++;
            }
        }
        if (z) {
            boolean isInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i27 = 0; i27 < childCount2; i27++) {
                C0410e m3367c = m3367c(getChildAt(i27));
                if (m3367c != null) {
                    m3367c.mo2511t();
                }
            }
            Object obj = null;
            if (isInEditMode) {
                for (int i28 = 0; i28 < childCount2; i28++) {
                    View childAt = getChildAt(i28);
                    try {
                        resourceName = getResources().getResourceName(childAt.getId());
                        m3364f(0, resourceName, Integer.valueOf(childAt.getId()));
                        int indexOf = resourceName.indexOf(47);
                        if (indexOf != -1) {
                            resourceName = resourceName.substring(indexOf + 1);
                        }
                        id = childAt.getId();
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (id != 0) {
                        View view = (View) this.f411b.get(id);
                        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                            onViewAdded(view);
                        }
                        if (view != this) {
                            c0410e5 = view == null ? null : ((C0434d) view.getLayoutParams()).f2271k0;
                            c0410e5.f2094Y = resourceName;
                        }
                    }
                    c0410e5 = this.f413d;
                    c0410e5.f2094Y = resourceName;
                }
            }
            if (this.f422m != -1) {
                for (int i29 = 0; i29 < childCount2; i29++) {
                    getChildAt(i29).getId();
                }
            }
            C0444n c0444n = this.f420k;
            if (c0444n != null) {
                c0444n.m2453a(this, true);
            }
            this.f413d.f2126e0.clear();
            int size = this.f412c.size();
            if (size > 0) {
                int i30 = 0;
                while (i30 < size) {
                    AbstractC0432b abstractC0432b = (AbstractC0432b) this.f412c.get(i30);
                    if (abstractC0432b.isInEditMode()) {
                        abstractC0432b.setIds(abstractC0432b.f2221f);
                    }
                    InterfaceC0413h interfaceC0413h = abstractC0432b.f2220e;
                    if (interfaceC0413h != null) {
                        AbstractC0414i abstractC0414i = (AbstractC0414i) interfaceC0413h;
                        abstractC0414i.f2147f0 = 0;
                        Arrays.fill(abstractC0414i.f2146e0, obj);
                        for (int i31 = 0; i31 < abstractC0432b.f2218c; i31++) {
                            int i32 = abstractC0432b.f2217b[i31];
                            View view2 = (View) this.f411b.get(i32);
                            if (view2 == null && (m2467c = abstractC0432b.m2467c(this, (str = (String) abstractC0432b.f2222g.get(Integer.valueOf(i32))))) != 0) {
                                abstractC0432b.f2217b[i31] = m2467c;
                                abstractC0432b.f2222g.put(Integer.valueOf(m2467c), str);
                                view2 = (View) this.f411b.get(m2467c);
                            }
                            if (view2 != null) {
                                InterfaceC0413h interfaceC0413h2 = abstractC0432b.f2220e;
                                C0410e m3367c2 = m3367c(view2);
                                AbstractC0414i abstractC0414i2 = (AbstractC0414i) interfaceC0413h2;
                                abstractC0414i2.getClass();
                                if (m3367c2 != abstractC0414i2 && m3367c2 != null) {
                                    int i33 = abstractC0414i2.f2147f0 + 1;
                                    C0410e[] c0410eArr = abstractC0414i2.f2146e0;
                                    if (i33 > c0410eArr.length) {
                                        abstractC0414i2.f2146e0 = (C0410e[]) Arrays.copyOf(c0410eArr, c0410eArr.length * 2);
                                    }
                                    C0410e[] c0410eArr2 = abstractC0414i2.f2146e0;
                                    int i34 = abstractC0414i2.f2147f0;
                                    c0410eArr2[i34] = m3367c2;
                                    abstractC0414i2.f2147f0 = i34 + 1;
                                }
                            }
                        }
                        ((AbstractC0414i) abstractC0432b.f2220e).getClass();
                    }
                    i30++;
                    obj = null;
                }
            }
            for (int i35 = 0; i35 < childCount2; i35++) {
                getChildAt(i35);
            }
            this.f426q.clear();
            this.f426q.put(0, this.f413d);
            this.f426q.put(getId(), this.f413d);
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt2 = getChildAt(i36);
                this.f426q.put(childAt2.getId(), m3367c(childAt2));
            }
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt3 = getChildAt(i37);
                C0410e m3367c3 = m3367c(childAt3);
                if (m3367c3 == null) {
                    z2 = z;
                    i = childCount2;
                } else {
                    C0434d c0434d = (C0434d) childAt3.getLayoutParams();
                    C0411f c0411f = this.f413d;
                    c0411f.f2126e0.add(m3367c3);
                    C0410e c0410e6 = m3367c3.f2080K;
                    if (c0410e6 != null) {
                        ((C0411f) c0410e6).f2126e0.remove(m3367c3);
                        m3367c3.f2080K = null;
                    }
                    m3367c3.f2080K = c0411f;
                    SparseArray sparseArray = this.f426q;
                    EnumC0408c enumC0408c = EnumC0408c.RIGHT;
                    EnumC0408c enumC0408c2 = EnumC0408c.LEFT;
                    EnumC0408c enumC0408c3 = EnumC0408c.BOTTOM;
                    EnumC0408c enumC0408c4 = EnumC0408c.TOP;
                    c0434d.m2461a();
                    m3367c3.f2093X = childAt3.getVisibility();
                    m3367c3.f2092W = childAt3;
                    if (childAt3 instanceof AbstractC0432b) {
                        boolean z4 = this.f413d.f2130i0;
                        Barrier barrier = (Barrier) ((AbstractC0432b) childAt3);
                        int i38 = barrier.f408h;
                        barrier.f409i = i38;
                        i = childCount2;
                        z2 = z;
                        if (Build.VERSION.SDK_INT < 17) {
                            if (i38 != 5) {
                            }
                            i25 = 0;
                            barrier.f409i = i25;
                            if (m3367c3 instanceof C0406a) {
                                ((C0406a) m3367c3).f2030g0 = barrier.f409i;
                            }
                        } else if (z4) {
                            if (i38 != 5) {
                            }
                            i25 = 1;
                            barrier.f409i = i25;
                            if (m3367c3 instanceof C0406a) {
                            }
                        } else {
                            if (i38 != 5) {
                            }
                            i25 = 0;
                            barrier.f409i = i25;
                            if (m3367c3 instanceof C0406a) {
                            }
                        }
                    } else {
                        z2 = z;
                        i = childCount2;
                    }
                    if (c0434d.f2248Y) {
                        C0412g c0412g = (C0412g) m3367c3;
                        int i39 = c0434d.f2265h0;
                        int i40 = c0434d.f2267i0;
                        float f3 = c0434d.f2269j0;
                        if (Build.VERSION.SDK_INT < 17) {
                            i39 = c0434d.f2250a;
                            i40 = c0434d.f2252b;
                            f3 = c0434d.f2254c;
                        }
                        if (f3 != -1.0f) {
                            if (f3 > -1.0f) {
                                c0412g.f2141e0 = f3;
                                c0412g.f2142f0 = -1;
                                c0412g.f2143g0 = -1;
                            }
                        } else if (i39 != -1) {
                            if (i39 > -1) {
                                c0412g.f2141e0 = -1.0f;
                                c0412g.f2142f0 = i39;
                                c0412g.f2143g0 = -1;
                            }
                        } else if (i40 != -1 && i40 > -1) {
                            c0412g.f2141e0 = -1.0f;
                            c0412g.f2142f0 = -1;
                            c0412g.f2143g0 = i40;
                        }
                    } else {
                        int i41 = c0434d.f2251a0;
                        int i42 = c0434d.f2253b0;
                        int i43 = c0434d.f2255c0;
                        int i44 = c0434d.f2257d0;
                        int i45 = c0434d.f2259e0;
                        int i46 = c0434d.f2261f0;
                        float f4 = c0434d.f2263g0;
                        if (Build.VERSION.SDK_INT < 17) {
                            int i47 = c0434d.f2256d;
                            int i48 = c0434d.f2258e;
                            int i49 = c0434d.f2260f;
                            int i50 = c0434d.f2262g;
                            int i51 = c0434d.f2280t;
                            int i52 = c0434d.f2282v;
                            float f5 = c0434d.f2286z;
                            i2 = -1;
                            if (i47 == -1 && i48 == -1) {
                                i22 = i47;
                                i23 = c0434d.f2277q;
                                if (i23 == -1) {
                                    int i53 = c0434d.f2276p;
                                    if (i53 != -1) {
                                        i48 = i53;
                                    }
                                }
                                if (i49 == -1 || i50 != -1) {
                                    i24 = i23;
                                } else {
                                    i24 = i23;
                                    int i54 = c0434d.f2278r;
                                    if (i54 != -1) {
                                        i9 = i48;
                                        i5 = i52;
                                        i3 = i51;
                                        f = f5;
                                        i7 = i50;
                                        i4 = i37;
                                        i8 = i54;
                                        i6 = i24;
                                    } else {
                                        int i55 = c0434d.f2279s;
                                        if (i55 != -1) {
                                            i50 = i55;
                                        }
                                    }
                                }
                                i5 = i52;
                                i6 = i24;
                                i3 = i51;
                                i7 = i50;
                                i4 = i37;
                                i8 = i49;
                                i9 = i48;
                                f = f5;
                            } else {
                                i22 = i47;
                            }
                            i23 = i22;
                            if (i49 == -1) {
                            }
                            i24 = i23;
                            i5 = i52;
                            i6 = i24;
                            i3 = i51;
                            i7 = i50;
                            i4 = i37;
                            i8 = i49;
                            i9 = i48;
                            f = f5;
                        } else {
                            i2 = -1;
                            i3 = i45;
                            i4 = i37;
                            i5 = i46;
                            i6 = i41;
                            f = f4;
                            i7 = i44;
                            i8 = i43;
                            i9 = i42;
                        }
                        int i56 = c0434d.f2273m;
                        z3 = isInEditMode;
                        if (i56 != i2) {
                            C0410e c0410e7 = (C0410e) sparseArray.get(i56);
                            if (c0410e7 != null) {
                                float f6 = c0434d.f2275o;
                                int i57 = c0434d.f2274n;
                                EnumC0408c enumC0408c5 = EnumC0408c.CENTER;
                                m3367c3.mo2505e(enumC0408c5).m2546a(c0410e7.mo2505e(enumC0408c5), i57, 0, true);
                                m3367c3.f2121v = f6;
                            }
                        } else if (i6 != -1) {
                            C0410e c0410e8 = (C0410e) sparseArray.get(i6);
                            if (c0410e8 != null) {
                                i10 = ((ViewGroup.MarginLayoutParams) c0434d).leftMargin;
                                mo2505e = m3367c3.mo2505e(enumC0408c2);
                                mo2505e2 = c0410e8.mo2505e(enumC0408c2);
                                mo2505e.m2546a(mo2505e2, i10, i3, true);
                            }
                            if (i8 == -1) {
                                C0410e c0410e9 = (C0410e) sparseArray.get(i8);
                                if (c0410e9 != null) {
                                    i11 = ((ViewGroup.MarginLayoutParams) c0434d).rightMargin;
                                    mo2505e3 = m3367c3.mo2505e(enumC0408c);
                                    mo2505e4 = c0410e9.mo2505e(enumC0408c2);
                                    mo2505e3.m2546a(mo2505e4, i11, i5, true);
                                }
                                i12 = c0434d.f2264h;
                                if (i12 != -1) {
                                    int i58 = c0434d.f2266i;
                                    if (i58 != -1 && (c0410e3 = (C0410e) sparseArray.get(i58)) != null) {
                                        i13 = ((ViewGroup.MarginLayoutParams) c0434d).topMargin;
                                        i14 = c0434d.f2281u;
                                        mo2505e5 = m3367c3.mo2505e(enumC0408c4);
                                        mo2505e6 = c0410e3.mo2505e(enumC0408c3);
                                        mo2505e5.m2546a(mo2505e6, i13, i14, true);
                                    }
                                    i15 = c0434d.f2268j;
                                    if (i15 != -1) {
                                    }
                                } else {
                                    C0410e c0410e10 = (C0410e) sparseArray.get(i12);
                                    if (c0410e10 != null) {
                                        i13 = ((ViewGroup.MarginLayoutParams) c0434d).topMargin;
                                        i14 = c0434d.f2281u;
                                        mo2505e5 = m3367c3.mo2505e(enumC0408c4);
                                        mo2505e6 = c0410e10.mo2505e(enumC0408c4);
                                        mo2505e5.m2546a(mo2505e6, i13, i14, true);
                                    }
                                    i15 = c0434d.f2268j;
                                    if (i15 != -1) {
                                        int i59 = c0434d.f2270k;
                                        if (i59 != -1 && (c0410e4 = (C0410e) sparseArray.get(i59)) != null) {
                                            i16 = ((ViewGroup.MarginLayoutParams) c0434d).bottomMargin;
                                            i17 = c0434d.f2283w;
                                            mo2505e7 = m3367c3.mo2505e(enumC0408c3);
                                            mo2505e8 = c0410e4.mo2505e(enumC0408c3);
                                            mo2505e7.m2546a(mo2505e8, i16, i17, true);
                                        }
                                        i18 = c0434d.f2272l;
                                        if (i18 != -1) {
                                        }
                                        if (f >= 0.0f) {
                                        }
                                        f2 = c0434d.f2224A;
                                        if (f2 >= 0.0f) {
                                        }
                                    } else {
                                        C0410e c0410e11 = (C0410e) sparseArray.get(i15);
                                        if (c0410e11 != null) {
                                            i16 = ((ViewGroup.MarginLayoutParams) c0434d).bottomMargin;
                                            i17 = c0434d.f2283w;
                                            mo2505e7 = m3367c3.mo2505e(enumC0408c3);
                                            mo2505e8 = c0410e11.mo2505e(enumC0408c4);
                                            mo2505e7.m2546a(mo2505e8, i16, i17, true);
                                        }
                                        i18 = c0434d.f2272l;
                                        if (i18 != -1) {
                                            View view3 = (View) this.f411b.get(i18);
                                            C0410e c0410e12 = (C0410e) sparseArray.get(c0434d.f2272l);
                                            if (c0410e12 != null && view3 != null && (view3.getLayoutParams() instanceof C0434d)) {
                                                C0434d c0434d2 = (C0434d) view3.getLayoutParams();
                                                c0434d.f2247X = true;
                                                c0434d2.f2247X = true;
                                                EnumC0408c enumC0408c6 = EnumC0408c.BASELINE;
                                                m3367c3.mo2505e(enumC0408c6).m2546a(c0410e12.mo2505e(enumC0408c6), 0, -1, true);
                                                m3367c3.f2122w = true;
                                                c0434d2.f2271k0.f2122w = true;
                                                m3367c3.mo2505e(enumC0408c4).m2542e();
                                                m3367c3.mo2505e(enumC0408c3).m2542e();
                                            }
                                        }
                                        if (f >= 0.0f) {
                                            m3367c3.f2090U = f;
                                        }
                                        f2 = c0434d.f2224A;
                                        if (f2 >= 0.0f) {
                                            m3367c3.f2091V = f2;
                                        }
                                    }
                                }
                            } else {
                                if (i7 != -1 && (c0410e2 = (C0410e) sparseArray.get(i7)) != null) {
                                    i11 = ((ViewGroup.MarginLayoutParams) c0434d).rightMargin;
                                    mo2505e3 = m3367c3.mo2505e(enumC0408c);
                                    mo2505e4 = c0410e2.mo2505e(enumC0408c);
                                    mo2505e3.m2546a(mo2505e4, i11, i5, true);
                                }
                                i12 = c0434d.f2264h;
                                if (i12 != -1) {
                                }
                            }
                        } else {
                            if (i9 != -1 && (c0410e = (C0410e) sparseArray.get(i9)) != null) {
                                i10 = ((ViewGroup.MarginLayoutParams) c0434d).leftMargin;
                                mo2505e = m3367c3.mo2505e(enumC0408c2);
                                mo2505e2 = c0410e.mo2505e(enumC0408c);
                                mo2505e.m2546a(mo2505e2, i10, i3, true);
                            }
                            if (i8 == -1) {
                            }
                        }
                        if (z3 && ((i21 = c0434d.f2239P) != -1 || c0434d.f2240Q != -1)) {
                            int i60 = c0434d.f2240Q;
                            m3367c3.f2085P = i21;
                            m3367c3.f2086Q = i60;
                        }
                        if (c0434d.f2245V) {
                            m3367c3.f2079J[0] = 1;
                            m3367c3.m2540A(((ViewGroup.MarginLayoutParams) c0434d).width);
                            if (((ViewGroup.MarginLayoutParams) c0434d).width == -2) {
                                m3367c3.f2079J[0] = 2;
                            }
                        } else if (((ViewGroup.MarginLayoutParams) c0434d).width == -1) {
                            if (c0434d.f2242S) {
                                m3367c3.f2079J[0] = 3;
                            } else {
                                m3367c3.f2079J[0] = 4;
                            }
                            m3367c3.mo2505e(enumC0408c2).f2067e = ((ViewGroup.MarginLayoutParams) c0434d).leftMargin;
                            m3367c3.mo2505e(enumC0408c).f2067e = ((ViewGroup.MarginLayoutParams) c0434d).rightMargin;
                        } else {
                            m3367c3.f2079J[0] = 3;
                            m3367c3.m2540A(0);
                        }
                        if (c0434d.f2246W) {
                            m3367c3.f2079J[1] = 1;
                            m3367c3.m2523v(((ViewGroup.MarginLayoutParams) c0434d).height);
                            if (((ViewGroup.MarginLayoutParams) c0434d).height == -2) {
                                m3367c3.f2079J[1] = 2;
                            }
                        } else if (((ViewGroup.MarginLayoutParams) c0434d).height == -1) {
                            if (c0434d.f2243T) {
                                m3367c3.f2079J[1] = 3;
                            } else {
                                m3367c3.f2079J[1] = 4;
                            }
                            m3367c3.mo2505e(enumC0408c4).f2067e = ((ViewGroup.MarginLayoutParams) c0434d).topMargin;
                            m3367c3.mo2505e(enumC0408c3).f2067e = ((ViewGroup.MarginLayoutParams) c0434d).bottomMargin;
                        } else {
                            m3367c3.f2079J[1] = 3;
                            m3367c3.m2523v(0);
                        }
                        String str2 = c0434d.f2225B;
                        if (str2 == null || str2.length() == 0) {
                            m3367c3.f2083N = 0.0f;
                        } else {
                            int length = str2.length();
                            int indexOf2 = str2.indexOf(44);
                            if (indexOf2 <= 0 || indexOf2 >= length - 1) {
                                i19 = 0;
                                i20 = -1;
                            } else {
                                String substring = str2.substring(0, indexOf2);
                                i20 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                                i19 = indexOf2 + 1;
                            }
                            int indexOf3 = str2.indexOf(58);
                            if (indexOf3 < 0 || indexOf3 >= length - 1) {
                                String substring2 = str2.substring(i19);
                                if (substring2.length() > 0) {
                                    parseFloat = Float.parseFloat(substring2);
                                }
                                parseFloat = 0.0f;
                            } else {
                                String substring3 = str2.substring(i19, indexOf3);
                                String substring4 = str2.substring(indexOf3 + 1);
                                if (substring3.length() > 0 && substring4.length() > 0) {
                                    try {
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        float parseFloat3 = Float.parseFloat(substring4);
                                        if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                            parseFloat = i20 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                                parseFloat = 0.0f;
                            }
                            if (parseFloat > 0.0f) {
                                m3367c3.f2083N = parseFloat;
                                m3367c3.f2084O = i20;
                            }
                        }
                        float f7 = c0434d.f2227D;
                        float[] fArr = m3367c3.f2099b0;
                        fArr[0] = f7;
                        fArr[1] = c0434d.f2228E;
                        m3367c3.f2095Z = c0434d.f2229F;
                        m3367c3.f2097a0 = c0434d.f2230G;
                        int i61 = c0434d.f2231H;
                        int i62 = c0434d.f2233J;
                        int i63 = c0434d.f2235L;
                        float f8 = c0434d.f2237N;
                        m3367c3.f2109j = i61;
                        m3367c3.f2112m = i62;
                        if (i63 == Integer.MAX_VALUE) {
                            i63 = 0;
                        }
                        m3367c3.f2113n = i63;
                        m3367c3.f2114o = f8;
                        if (f8 > 0.0f && f8 < 1.0f && i61 == 0) {
                            m3367c3.f2109j = 2;
                        }
                        int i64 = c0434d.f2232I;
                        int i65 = c0434d.f2234K;
                        int i66 = c0434d.f2236M;
                        float f9 = c0434d.f2238O;
                        m3367c3.f2110k = i64;
                        m3367c3.f2115p = i65;
                        if (i66 == Integer.MAX_VALUE) {
                            i66 = 0;
                        }
                        m3367c3.f2116q = i66;
                        m3367c3.f2117r = f9;
                        if (f9 > 0.0f && f9 < 1.0f && i64 == 0) {
                            m3367c3.f2110k = 2;
                        }
                        i37 = i4 + 1;
                        childCount2 = i;
                        z = z2;
                        isInEditMode = z3;
                    }
                }
                z3 = isInEditMode;
                i4 = i37;
                i37 = i4 + 1;
                childCount2 = i;
                z = z2;
                isInEditMode = z3;
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0434d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0434d(layoutParams);
    }

    public int getMaxHeight() {
        return this.f417h;
    }

    public int getMaxWidth() {
        return this.f416g;
    }

    public int getMinHeight() {
        return this.f415f;
    }

    public int getMinWidth() {
        return this.f414e;
    }

    public int getOptimizationLevel() {
        return this.f413d.f2138q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0434d c0434d = (C0434d) childAt.getLayoutParams();
            C0410e c0410e = c0434d.f2271k0;
            if (childAt.getVisibility() != 8 || c0434d.f2248Y || c0434d.f2249Z || isInEditMode) {
                int m2528o = c0410e.m2528o();
                int m2527p = c0410e.m2527p();
                childAt.layout(m2528o, m2527p, c0410e.m2529n() + m2528o, c0410e.m2535h() + m2527p);
            }
        }
        int size = this.f412c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0432b) this.f412c.get(i6)).m2465e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int max;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C0418c c0418c;
        int size;
        boolean m2504a;
        boolean z;
        C0435e c0435e;
        int i12;
        int i13;
        boolean z2;
        int size2;
        int i14;
        boolean z3;
        int i15;
        int i16;
        int i17;
        boolean z4;
        boolean z5;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        boolean z7;
        boolean z8;
        int i22;
        this.f413d.f2130i0 = m3365e();
        if (this.f418i) {
            this.f418i = false;
            if (m3363g()) {
                C0411f c0411f = this.f413d;
                C0418c c0418c2 = c0411f.f2127f0;
                c0418c2.f2159a.clear();
                int size3 = c0411f.f2126e0.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    C0410e c0410e = (C0410e) c0411f.f2126e0.get(i23);
                    if (c0410e.m2534i() == 3 || c0410e.m2534i() == 4 || c0410e.m2530m() == 3 || c0410e.m2530m() == 4) {
                        c0418c2.f2159a.add(c0410e);
                    }
                }
                c0411f.m2514G();
            }
        }
        C0411f c0411f2 = this.f413d;
        int i24 = this.f419j;
        int mode = View.MeasureSpec.getMode(i);
        int size4 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size5 = View.MeasureSpec.getSize(i2);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i25 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        C0435e c0435e2 = this.f427r;
        c0435e2.f2288b = max2;
        c0435e2.f2289c = max3;
        c0435e2.f2290d = paddingWidth;
        c0435e2.f2291e = i25;
        c0435e2.f2292f = i;
        c0435e2.f2293g = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            max = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max > 0 || max4 > 0) {
                if (m3365e()) {
                    max = max4;
                }
                int i26 = size4 - paddingWidth;
                int i27 = size5 - i25;
                C0435e c0435e3 = this.f427r;
                int i28 = c0435e3.f2291e;
                int i29 = c0435e3.f2290d;
                int childCount = getChildCount();
                if (mode == Integer.MIN_VALUE) {
                    if (mode == 0) {
                        i7 = childCount != 0 ? 2 : 2;
                    } else if (mode == 1073741824) {
                        i3 = Math.min(this.f416g - i29, i26);
                        i4 = 1;
                        i5 = Integer.MIN_VALUE;
                        int i30 = i4;
                        i6 = i3;
                        i7 = i30;
                        if (mode2 != i5) {
                            if (mode2 == 0) {
                                i22 = childCount != 0 ? 2 : 2;
                            } else if (mode2 == 1073741824) {
                                i8 = Math.min(this.f417h - i28, i27);
                                i9 = 1;
                                if (i6 == c0411f2.m2529n() || i8 != c0411f2.m2535h()) {
                                    i10 = i27;
                                    c0411f2.f2128g0.f2166c = true;
                                    i11 = 0;
                                } else {
                                    i10 = i27;
                                    i11 = 0;
                                }
                                c0411f2.f2085P = i11;
                                c0411f2.f2086Q = i11;
                                int[] iArr = c0411f2.f2120u;
                                iArr[i11] = this.f416g - i29;
                                iArr[1] = this.f417h - i28;
                                c0411f2.m2520y(i11);
                                c0411f2.m2521x(i11);
                                c0411f2.f2079J[i11] = i7;
                                c0411f2.m2540A(i6);
                                c0411f2.f2079J[1] = i9;
                                c0411f2.m2523v(i8);
                                c0411f2.m2520y(this.f414e - i29);
                                c0411f2.m2521x(this.f415f - i28);
                                c0411f2.f2132k0 = max;
                                c0411f2.f2133l0 = max2;
                                c0418c = c0411f2.f2127f0;
                                c0418c.getClass();
                                C0435e c0435e4 = c0411f2.f2129h0;
                                size = c0411f2.f2126e0.size();
                                int m2529n = c0411f2.m2529n();
                                int m2535h = c0411f2.m2535h();
                                m2504a = AbstractC0415j.m2504a(i24, 128);
                                z = !m2504a || AbstractC0415j.m2504a(i24, 64);
                                if (z) {
                                    for (int i31 = 0; i31 < size; i31++) {
                                        C0410e c0410e2 = (C0410e) c0411f2.f2126e0.get(i31);
                                        boolean z9 = (c0410e2.m2534i() == 3) && (c0410e2.m2530m() == 3) && c0410e2.f2083N > 0.0f;
                                        if ((c0410e2.m2525r() && z9) || ((c0410e2.m2524s() && z9) || c0410e2.m2525r() || c0410e2.m2524s())) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                                if (z && ((mode != 1073741824 && mode2 == 1073741824) || m2504a)) {
                                    c0435e = c0435e4;
                                    i12 = m2529n;
                                    i13 = 0;
                                    z2 = false;
                                } else {
                                    int min = Math.min(c0411f2.f2120u[0], i26);
                                    int min2 = Math.min(c0411f2.f2120u[1], i10);
                                    if (mode == 1073741824 && c0411f2.m2529n() != min) {
                                        c0411f2.m2540A(min);
                                        c0411f2.m2514G();
                                    }
                                    if (mode2 == 1073741824 && c0411f2.m2535h() != min2) {
                                        c0411f2.m2523v(min2);
                                        c0411f2.m2514G();
                                    }
                                    if (mode == 1073741824 && mode2 == 1073741824) {
                                        C0421f c0421f = c0411f2.f2128g0;
                                        boolean z10 = m2504a & true;
                                        if (c0421f.f2165b || c0421f.f2166c) {
                                            Iterator it = c0421f.f2164a.f2126e0.iterator();
                                            while (it.hasNext()) {
                                                C0410e c0410e3 = (C0410e) it.next();
                                                c0410e3.f2096a = false;
                                                c0410e3.f2102d.m2487n();
                                                c0410e3.f2104e.m2484m();
                                            }
                                            i21 = 0;
                                            C0411f c0411f3 = c0421f.f2164a;
                                            c0411f3.f2096a = false;
                                            c0411f3.f2102d.m2487n();
                                            c0421f.f2164a.f2104e.m2484m();
                                            c0421f.f2166c = false;
                                        } else {
                                            i21 = 0;
                                        }
                                        c0421f.m2498b(c0421f.f2167d);
                                        C0411f c0411f4 = c0421f.f2164a;
                                        c0411f4.f2085P = i21;
                                        c0411f4.f2086Q = i21;
                                        int m2536g = c0411f4.m2536g(i21);
                                        int m2536g2 = c0421f.f2164a.m2536g(1);
                                        if (c0421f.f2165b) {
                                            c0421f.m2497c();
                                        }
                                        int m2528o = c0421f.f2164a.m2528o();
                                        int m2527p = c0421f.f2164a.m2527p();
                                        c0421f.f2164a.f2102d.f2207h.mo2491c(m2528o);
                                        c0421f.f2164a.f2104e.f2207h.mo2491c(m2527p);
                                        c0421f.m2493g();
                                        if (m2536g == 2 || m2536g2 == 2) {
                                            if (z10) {
                                                Iterator it2 = c0421f.f2168e.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        if (!((AbstractC0430o) it2.next()).mo2473k()) {
                                                            z10 = false;
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                            if (z10 && m2536g == 2) {
                                                C0411f c0411f5 = c0421f.f2164a;
                                                c0435e = c0435e4;
                                                c0411f5.f2079J[0] = 1;
                                                c0411f5.m2540A(c0421f.m2496d(c0411f5, 0));
                                                C0411f c0411f6 = c0421f.f2164a;
                                                c0411f6.f2102d.f2204e.mo2491c(c0411f6.m2529n());
                                            } else {
                                                c0435e = c0435e4;
                                            }
                                            if (z10 && m2536g2 == 2) {
                                                C0411f c0411f7 = c0421f.f2164a;
                                                c0411f7.f2079J[1] = 1;
                                                c0411f7.m2523v(c0421f.m2496d(c0411f7, 1));
                                                C0411f c0411f8 = c0421f.f2164a;
                                                c0411f8.f2104e.f2204e.mo2491c(c0411f8.m2535h());
                                            }
                                        } else {
                                            c0435e = c0435e4;
                                        }
                                        C0411f c0411f9 = c0421f.f2164a;
                                        int[] iArr2 = c0411f9.f2079J;
                                        i12 = m2529n;
                                        if (iArr2[0] == 1 || iArr2[0] == 4) {
                                            int m2529n2 = c0411f9.m2529n() + m2528o;
                                            c0421f.f2164a.f2102d.f2208i.mo2491c(m2529n2);
                                            c0421f.f2164a.f2102d.f2204e.mo2491c(m2529n2 - m2528o);
                                            c0421f.m2493g();
                                            C0411f c0411f10 = c0421f.f2164a;
                                            int[] iArr3 = c0411f10.f2079J;
                                            if (iArr3[1] == 1 || iArr3[1] == 4) {
                                                int m2535h2 = c0411f10.m2535h() + m2527p;
                                                c0421f.f2164a.f2104e.f2208i.mo2491c(m2535h2);
                                                c0421f.f2164a.f2104e.f2204e.mo2491c(m2535h2 - m2527p);
                                            }
                                            c0421f.m2493g();
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        Iterator it3 = c0421f.f2168e.iterator();
                                        while (it3.hasNext()) {
                                            AbstractC0430o abstractC0430o = (AbstractC0430o) it3.next();
                                            if (abstractC0430o.f2201b != c0421f.f2164a || abstractC0430o.f2206g) {
                                                abstractC0430o.mo2479e();
                                            }
                                        }
                                        Iterator it4 = c0421f.f2168e.iterator();
                                        while (it4.hasNext()) {
                                            AbstractC0430o abstractC0430o2 = (AbstractC0430o) it4.next();
                                            if (z7 || abstractC0430o2.f2201b != c0421f.f2164a) {
                                                if (!abstractC0430o2.f2207h.f2190j || ((!abstractC0430o2.f2208i.f2190j && !(abstractC0430o2 instanceof C0425j)) || (!abstractC0430o2.f2204e.f2190j && !(abstractC0430o2 instanceof C0419d) && !(abstractC0430o2 instanceof C0425j)))) {
                                                    z8 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        z8 = true;
                                        c0421f.f2164a.m2522w(m2536g);
                                        c0421f.f2164a.m2519z(m2536g2);
                                        z2 = z8;
                                        i19 = 1073741824;
                                        i13 = 2;
                                    } else {
                                        c0435e = c0435e4;
                                        i12 = m2529n;
                                        C0421f c0421f2 = c0411f2.f2128g0;
                                        if (c0421f2.f2165b) {
                                            Iterator it5 = c0421f2.f2164a.f2126e0.iterator();
                                            while (it5.hasNext()) {
                                                C0410e c0410e4 = (C0410e) it5.next();
                                                c0410e4.f2096a = false;
                                                C0427l c0427l = c0410e4.f2102d;
                                                c0427l.f2204e.f2190j = false;
                                                c0427l.f2206g = false;
                                                c0427l.m2487n();
                                                C0429n c0429n = c0410e4.f2104e;
                                                c0429n.f2204e.f2190j = false;
                                                c0429n.f2206g = false;
                                                c0429n.m2484m();
                                            }
                                            i18 = 0;
                                            C0411f c0411f11 = c0421f2.f2164a;
                                            c0411f11.f2096a = false;
                                            C0427l c0427l2 = c0411f11.f2102d;
                                            c0427l2.f2204e.f2190j = false;
                                            c0427l2.f2206g = false;
                                            c0427l2.m2487n();
                                            C0429n c0429n2 = c0421f2.f2164a.f2104e;
                                            c0429n2.f2204e.f2190j = false;
                                            c0429n2.f2206g = false;
                                            c0429n2.m2484m();
                                            c0421f2.m2497c();
                                        } else {
                                            i18 = 0;
                                        }
                                        c0421f2.m2498b(c0421f2.f2167d);
                                        C0411f c0411f12 = c0421f2.f2164a;
                                        c0411f12.f2085P = i18;
                                        c0411f12.f2086Q = i18;
                                        c0411f12.f2102d.f2207h.mo2491c(i18);
                                        c0421f2.f2164a.f2104e.f2207h.mo2491c(i18);
                                        i19 = 1073741824;
                                        if (mode == 1073741824) {
                                            i20 = 1;
                                            z6 = c0411f2.m2515F(m2504a, i18) & true;
                                            i13 = 1;
                                        } else {
                                            i20 = 1;
                                            i13 = 0;
                                            z6 = true;
                                        }
                                        if (mode2 == 1073741824) {
                                            z2 = z6 & c0411f2.m2515F(m2504a, i20);
                                            i13++;
                                        } else {
                                            z2 = z6;
                                        }
                                    }
                                    if (z2) {
                                        c0411f2.mo2518B(mode == i19, mode2 == i19);
                                    }
                                }
                                if (z2 || i13 != 2) {
                                    if (size > 0) {
                                        int size6 = c0411f2.f2126e0.size();
                                        C0435e c0435e5 = c0411f2.f2129h0;
                                        for (int i32 = 0; i32 < size6; i32++) {
                                            C0410e c0410e5 = (C0410e) c0411f2.f2126e0.get(i32);
                                            if (!(c0410e5 instanceof C0412g) && (!c0410e5.f2102d.f2204e.f2190j || !c0410e5.f2104e.f2204e.f2190j)) {
                                                if (!(c0410e5.m2536g(0) == 3 && c0410e5.f2109j != 1 && c0410e5.m2536g(1) == 3 && c0410e5.f2110k != 1)) {
                                                    c0418c.m2503a(c0435e5, c0410e5, false);
                                                }
                                            }
                                        }
                                        int childCount2 = c0435e5.f2287a.getChildCount();
                                        for (int i33 = 0; i33 < childCount2; i33++) {
                                            c0435e5.f2287a.getChildAt(i33);
                                        }
                                        int size7 = c0435e5.f2287a.f412c.size();
                                        if (size7 > 0) {
                                            for (int i34 = 0; i34 < size7; i34++) {
                                                ((AbstractC0432b) c0435e5.f2287a.f412c.get(i34)).m2464f();
                                            }
                                        }
                                    }
                                    int i35 = c0411f2.f2138q0;
                                    size2 = c0418c.f2159a.size();
                                    if (size <= 0) {
                                        i14 = i12;
                                        c0418c.m2502b(c0411f2, i14, m2535h);
                                    } else {
                                        i14 = i12;
                                    }
                                    if (size2 > 0) {
                                        boolean z11 = c0411f2.m2534i() == 2;
                                        boolean z12 = c0411f2.m2530m() == 2;
                                        int max5 = Math.max(c0411f2.m2529n(), c0418c.f2161c.f2088S);
                                        int max6 = Math.max(c0411f2.m2535h(), c0418c.f2161c.f2089T);
                                        for (int i36 = 0; i36 < size2; i36++) {
                                            C0410e c0410e6 = (C0410e) c0418c.f2159a.get(i36);
                                        }
                                        int i37 = max5;
                                        int i38 = max6;
                                        int i39 = 0;
                                        boolean z13 = false;
                                        while (i39 < 2) {
                                            int i40 = i38;
                                            boolean z14 = z13;
                                            int i41 = 0;
                                            while (i41 < size2) {
                                                C0410e c0410e7 = (C0410e) c0418c.f2159a.get(i41);
                                                if ((c0410e7 instanceof InterfaceC0413h) || (c0410e7 instanceof C0412g) || c0410e7.f2093X == 8 || (c0410e7.f2102d.f2204e.f2190j && c0410e7.f2104e.f2204e.f2190j)) {
                                                    i15 = i35;
                                                    i16 = size2;
                                                    i17 = i39;
                                                } else {
                                                    int m2529n3 = c0410e7.m2529n();
                                                    int m2535h3 = c0410e7.m2535h();
                                                    i16 = size2;
                                                    int i42 = c0410e7.f2087R;
                                                    i15 = i35;
                                                    i17 = i39;
                                                    z14 |= c0418c.m2503a(c0435e, c0410e7, true);
                                                    int m2529n4 = c0410e7.m2529n();
                                                    int m2535h4 = c0410e7.m2535h();
                                                    if (m2529n4 != m2529n3) {
                                                        c0410e7.m2540A(m2529n4);
                                                        if (z11 && c0410e7.m2531l() > i37) {
                                                            i37 = Math.max(i37, c0410e7.mo2505e(EnumC0408c.RIGHT).m2545b() + c0410e7.m2531l());
                                                        }
                                                        z14 = true;
                                                    }
                                                    if (m2535h4 != m2535h3) {
                                                        c0410e7.m2523v(m2535h4);
                                                        if (z12 && c0410e7.m2537f() > i40) {
                                                            i40 = Math.max(i40, c0410e7.mo2505e(EnumC0408c.BOTTOM).m2545b() + c0410e7.m2537f());
                                                        }
                                                        z14 = true;
                                                    }
                                                    if (c0410e7.f2122w && i42 != c0410e7.f2087R) {
                                                        z14 = true;
                                                    }
                                                }
                                                i41++;
                                                size2 = i16;
                                                i35 = i15;
                                                i39 = i17;
                                            }
                                            int i43 = i35;
                                            int i44 = size2;
                                            int i45 = i39;
                                            if (z14) {
                                                c0418c.m2502b(c0411f2, i14, m2535h);
                                                z13 = false;
                                            } else {
                                                z13 = z14;
                                            }
                                            i39 = i45 + 1;
                                            i38 = i40;
                                            size2 = i44;
                                            i35 = i43;
                                        }
                                        int i46 = i35;
                                        if (z13) {
                                            c0418c.m2502b(c0411f2, i14, m2535h);
                                            if (c0411f2.m2529n() < i37) {
                                                c0411f2.m2540A(i37);
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (c0411f2.m2535h() < i38) {
                                                c0411f2.m2523v(i38);
                                                z3 = true;
                                            }
                                            if (z3) {
                                                c0418c.m2502b(c0411f2, i14, m2535h);
                                            }
                                        }
                                        i35 = i46;
                                    }
                                    c0411f2.m2512I(i35);
                                }
                                int m2529n5 = this.f413d.m2529n();
                                int m2535h5 = this.f413d.m2535h();
                                C0411f c0411f13 = this.f413d;
                                z4 = c0411f13.f2139r0;
                                z5 = c0411f13.f2140s0;
                                C0435e c0435e6 = this.f427r;
                                int i47 = c0435e6.f2291e;
                                int min3 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n5 + c0435e6.f2290d, i, 0) & 16777215);
                                int min4 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h5 + i47, i2, 0) & 16777215);
                                if (z4) {
                                    min3 |= 16777216;
                                }
                                if (z5) {
                                    min4 |= 16777216;
                                }
                                setMeasuredDimension(min3, min4);
                                this.f424o = min3;
                                this.f425p = min4;
                            } else {
                                i22 = 1;
                            }
                            i9 = i22;
                            i8 = 0;
                            if (i6 == c0411f2.m2529n()) {
                            }
                            i10 = i27;
                            c0411f2.f2128g0.f2166c = true;
                            i11 = 0;
                            c0411f2.f2085P = i11;
                            c0411f2.f2086Q = i11;
                            int[] iArr4 = c0411f2.f2120u;
                            iArr4[i11] = this.f416g - i29;
                            iArr4[1] = this.f417h - i28;
                            c0411f2.m2520y(i11);
                            c0411f2.m2521x(i11);
                            c0411f2.f2079J[i11] = i7;
                            c0411f2.m2540A(i6);
                            c0411f2.f2079J[1] = i9;
                            c0411f2.m2523v(i8);
                            c0411f2.m2520y(this.f414e - i29);
                            c0411f2.m2521x(this.f415f - i28);
                            c0411f2.f2132k0 = max;
                            c0411f2.f2133l0 = max2;
                            c0418c = c0411f2.f2127f0;
                            c0418c.getClass();
                            C0435e c0435e42 = c0411f2.f2129h0;
                            size = c0411f2.f2126e0.size();
                            int m2529n6 = c0411f2.m2529n();
                            int m2535h6 = c0411f2.m2535h();
                            m2504a = AbstractC0415j.m2504a(i24, 128);
                            if (m2504a) {
                            }
                            if (z) {
                            }
                            if (!(z & ((mode != 1073741824 && mode2 == 1073741824) || m2504a))) {
                            }
                            if (z2) {
                            }
                            if (size > 0) {
                            }
                            int i352 = c0411f2.f2138q0;
                            size2 = c0418c.f2159a.size();
                            if (size <= 0) {
                            }
                            if (size2 > 0) {
                            }
                            c0411f2.m2512I(i352);
                            int m2529n52 = this.f413d.m2529n();
                            int m2535h52 = this.f413d.m2535h();
                            C0411f c0411f132 = this.f413d;
                            z4 = c0411f132.f2139r0;
                            z5 = c0411f132.f2140s0;
                            C0435e c0435e62 = this.f427r;
                            int i472 = c0435e62.f2291e;
                            int min32 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n52 + c0435e62.f2290d, i, 0) & 16777215);
                            int min42 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h52 + i472, i2, 0) & 16777215);
                            if (z4) {
                            }
                            if (z5) {
                            }
                            setMeasuredDimension(min32, min42);
                            this.f424o = min32;
                            this.f425p = min42;
                        } else if (childCount != 0) {
                            i8 = i27;
                            i9 = 2;
                            if (i6 == c0411f2.m2529n()) {
                            }
                            i10 = i27;
                            c0411f2.f2128g0.f2166c = true;
                            i11 = 0;
                            c0411f2.f2085P = i11;
                            c0411f2.f2086Q = i11;
                            int[] iArr42 = c0411f2.f2120u;
                            iArr42[i11] = this.f416g - i29;
                            iArr42[1] = this.f417h - i28;
                            c0411f2.m2520y(i11);
                            c0411f2.m2521x(i11);
                            c0411f2.f2079J[i11] = i7;
                            c0411f2.m2540A(i6);
                            c0411f2.f2079J[1] = i9;
                            c0411f2.m2523v(i8);
                            c0411f2.m2520y(this.f414e - i29);
                            c0411f2.m2521x(this.f415f - i28);
                            c0411f2.f2132k0 = max;
                            c0411f2.f2133l0 = max2;
                            c0418c = c0411f2.f2127f0;
                            c0418c.getClass();
                            C0435e c0435e422 = c0411f2.f2129h0;
                            size = c0411f2.f2126e0.size();
                            int m2529n62 = c0411f2.m2529n();
                            int m2535h62 = c0411f2.m2535h();
                            m2504a = AbstractC0415j.m2504a(i24, 128);
                            if (m2504a) {
                            }
                            if (z) {
                            }
                            if (!(z & ((mode != 1073741824 && mode2 == 1073741824) || m2504a))) {
                            }
                            if (z2) {
                            }
                            if (size > 0) {
                            }
                            int i3522 = c0411f2.f2138q0;
                            size2 = c0418c.f2159a.size();
                            if (size <= 0) {
                            }
                            if (size2 > 0) {
                            }
                            c0411f2.m2512I(i3522);
                            int m2529n522 = this.f413d.m2529n();
                            int m2535h522 = this.f413d.m2535h();
                            C0411f c0411f1322 = this.f413d;
                            z4 = c0411f1322.f2139r0;
                            z5 = c0411f1322.f2140s0;
                            C0435e c0435e622 = this.f427r;
                            int i4722 = c0435e622.f2291e;
                            int min322 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n522 + c0435e622.f2290d, i, 0) & 16777215);
                            int min422 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h522 + i4722, i2, 0) & 16777215);
                            if (z4) {
                            }
                            if (z5) {
                            }
                            setMeasuredDimension(min322, min422);
                            this.f424o = min322;
                            this.f425p = min422;
                        }
                        i8 = Math.max(0, this.f415f);
                        i9 = 2;
                        if (i6 == c0411f2.m2529n()) {
                        }
                        i10 = i27;
                        c0411f2.f2128g0.f2166c = true;
                        i11 = 0;
                        c0411f2.f2085P = i11;
                        c0411f2.f2086Q = i11;
                        int[] iArr422 = c0411f2.f2120u;
                        iArr422[i11] = this.f416g - i29;
                        iArr422[1] = this.f417h - i28;
                        c0411f2.m2520y(i11);
                        c0411f2.m2521x(i11);
                        c0411f2.f2079J[i11] = i7;
                        c0411f2.m2540A(i6);
                        c0411f2.f2079J[1] = i9;
                        c0411f2.m2523v(i8);
                        c0411f2.m2520y(this.f414e - i29);
                        c0411f2.m2521x(this.f415f - i28);
                        c0411f2.f2132k0 = max;
                        c0411f2.f2133l0 = max2;
                        c0418c = c0411f2.f2127f0;
                        c0418c.getClass();
                        C0435e c0435e4222 = c0411f2.f2129h0;
                        size = c0411f2.f2126e0.size();
                        int m2529n622 = c0411f2.m2529n();
                        int m2535h622 = c0411f2.m2535h();
                        m2504a = AbstractC0415j.m2504a(i24, 128);
                        if (m2504a) {
                        }
                        if (z) {
                        }
                        if (!(z & ((mode != 1073741824 && mode2 == 1073741824) || m2504a))) {
                        }
                        if (z2) {
                        }
                        if (size > 0) {
                        }
                        int i35222 = c0411f2.f2138q0;
                        size2 = c0418c.f2159a.size();
                        if (size <= 0) {
                        }
                        if (size2 > 0) {
                        }
                        c0411f2.m2512I(i35222);
                        int m2529n5222 = this.f413d.m2529n();
                        int m2535h5222 = this.f413d.m2535h();
                        C0411f c0411f13222 = this.f413d;
                        z4 = c0411f13222.f2139r0;
                        z5 = c0411f13222.f2140s0;
                        C0435e c0435e6222 = this.f427r;
                        int i47222 = c0435e6222.f2291e;
                        int min3222 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n5222 + c0435e6222.f2290d, i, 0) & 16777215);
                        int min4222 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h5222 + i47222, i2, 0) & 16777215);
                        if (z4) {
                        }
                        if (z5) {
                        }
                        setMeasuredDimension(min3222, min4222);
                        this.f424o = min3222;
                        this.f425p = min4222;
                    } else {
                        i7 = 1;
                    }
                    i5 = Integer.MIN_VALUE;
                    i6 = 0;
                    if (mode2 != i5) {
                    }
                    i8 = Math.max(0, this.f415f);
                    i9 = 2;
                    if (i6 == c0411f2.m2529n()) {
                    }
                    i10 = i27;
                    c0411f2.f2128g0.f2166c = true;
                    i11 = 0;
                    c0411f2.f2085P = i11;
                    c0411f2.f2086Q = i11;
                    int[] iArr4222 = c0411f2.f2120u;
                    iArr4222[i11] = this.f416g - i29;
                    iArr4222[1] = this.f417h - i28;
                    c0411f2.m2520y(i11);
                    c0411f2.m2521x(i11);
                    c0411f2.f2079J[i11] = i7;
                    c0411f2.m2540A(i6);
                    c0411f2.f2079J[1] = i9;
                    c0411f2.m2523v(i8);
                    c0411f2.m2520y(this.f414e - i29);
                    c0411f2.m2521x(this.f415f - i28);
                    c0411f2.f2132k0 = max;
                    c0411f2.f2133l0 = max2;
                    c0418c = c0411f2.f2127f0;
                    c0418c.getClass();
                    C0435e c0435e42222 = c0411f2.f2129h0;
                    size = c0411f2.f2126e0.size();
                    int m2529n6222 = c0411f2.m2529n();
                    int m2535h6222 = c0411f2.m2535h();
                    m2504a = AbstractC0415j.m2504a(i24, 128);
                    if (m2504a) {
                    }
                    if (z) {
                    }
                    if (!(z & ((mode != 1073741824 && mode2 == 1073741824) || m2504a))) {
                    }
                    if (z2) {
                    }
                    if (size > 0) {
                    }
                    int i352222 = c0411f2.f2138q0;
                    size2 = c0418c.f2159a.size();
                    if (size <= 0) {
                    }
                    if (size2 > 0) {
                    }
                    c0411f2.m2512I(i352222);
                    int m2529n52222 = this.f413d.m2529n();
                    int m2535h52222 = this.f413d.m2535h();
                    C0411f c0411f132222 = this.f413d;
                    z4 = c0411f132222.f2139r0;
                    z5 = c0411f132222.f2140s0;
                    C0435e c0435e62222 = this.f427r;
                    int i472222 = c0435e62222.f2291e;
                    int min32222 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n52222 + c0435e62222.f2290d, i, 0) & 16777215);
                    int min42222 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h52222 + i472222, i2, 0) & 16777215);
                    if (z4) {
                    }
                    if (z5) {
                    }
                    setMeasuredDimension(min32222, min42222);
                    this.f424o = min32222;
                    this.f425p = min42222;
                } else if (childCount != 0) {
                    i3 = i26;
                    i4 = 2;
                    i5 = Integer.MIN_VALUE;
                    int i302 = i4;
                    i6 = i3;
                    i7 = i302;
                    if (mode2 != i5) {
                    }
                    i8 = Math.max(0, this.f415f);
                    i9 = 2;
                    if (i6 == c0411f2.m2529n()) {
                    }
                    i10 = i27;
                    c0411f2.f2128g0.f2166c = true;
                    i11 = 0;
                    c0411f2.f2085P = i11;
                    c0411f2.f2086Q = i11;
                    int[] iArr42222 = c0411f2.f2120u;
                    iArr42222[i11] = this.f416g - i29;
                    iArr42222[1] = this.f417h - i28;
                    c0411f2.m2520y(i11);
                    c0411f2.m2521x(i11);
                    c0411f2.f2079J[i11] = i7;
                    c0411f2.m2540A(i6);
                    c0411f2.f2079J[1] = i9;
                    c0411f2.m2523v(i8);
                    c0411f2.m2520y(this.f414e - i29);
                    c0411f2.m2521x(this.f415f - i28);
                    c0411f2.f2132k0 = max;
                    c0411f2.f2133l0 = max2;
                    c0418c = c0411f2.f2127f0;
                    c0418c.getClass();
                    C0435e c0435e422222 = c0411f2.f2129h0;
                    size = c0411f2.f2126e0.size();
                    int m2529n62222 = c0411f2.m2529n();
                    int m2535h62222 = c0411f2.m2535h();
                    m2504a = AbstractC0415j.m2504a(i24, 128);
                    if (m2504a) {
                    }
                    if (z) {
                    }
                    if (!(z & ((mode != 1073741824 && mode2 == 1073741824) || m2504a))) {
                    }
                    if (z2) {
                    }
                    if (size > 0) {
                    }
                    int i3522222 = c0411f2.f2138q0;
                    size2 = c0418c.f2159a.size();
                    if (size <= 0) {
                    }
                    if (size2 > 0) {
                    }
                    c0411f2.m2512I(i3522222);
                    int m2529n522222 = this.f413d.m2529n();
                    int m2535h522222 = this.f413d.m2535h();
                    C0411f c0411f1322222 = this.f413d;
                    z4 = c0411f1322222.f2139r0;
                    z5 = c0411f1322222.f2140s0;
                    C0435e c0435e622222 = this.f427r;
                    int i4722222 = c0435e622222.f2291e;
                    int min322222 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n522222 + c0435e622222.f2290d, i, 0) & 16777215);
                    int min422222 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h522222 + i4722222, i2, 0) & 16777215);
                    if (z4) {
                    }
                    if (z5) {
                    }
                    setMeasuredDimension(min322222, min422222);
                    this.f424o = min322222;
                    this.f425p = min422222;
                }
                i3 = Math.max(0, this.f414e);
                i4 = 2;
                i5 = Integer.MIN_VALUE;
                int i3022 = i4;
                i6 = i3;
                i7 = i3022;
                if (mode2 != i5) {
                }
                i8 = Math.max(0, this.f415f);
                i9 = 2;
                if (i6 == c0411f2.m2529n()) {
                }
                i10 = i27;
                c0411f2.f2128g0.f2166c = true;
                i11 = 0;
                c0411f2.f2085P = i11;
                c0411f2.f2086Q = i11;
                int[] iArr422222 = c0411f2.f2120u;
                iArr422222[i11] = this.f416g - i29;
                iArr422222[1] = this.f417h - i28;
                c0411f2.m2520y(i11);
                c0411f2.m2521x(i11);
                c0411f2.f2079J[i11] = i7;
                c0411f2.m2540A(i6);
                c0411f2.f2079J[1] = i9;
                c0411f2.m2523v(i8);
                c0411f2.m2520y(this.f414e - i29);
                c0411f2.m2521x(this.f415f - i28);
                c0411f2.f2132k0 = max;
                c0411f2.f2133l0 = max2;
                c0418c = c0411f2.f2127f0;
                c0418c.getClass();
                C0435e c0435e4222222 = c0411f2.f2129h0;
                size = c0411f2.f2126e0.size();
                int m2529n622222 = c0411f2.m2529n();
                int m2535h622222 = c0411f2.m2535h();
                m2504a = AbstractC0415j.m2504a(i24, 128);
                if (m2504a) {
                }
                if (z) {
                }
                if (!(z & ((mode != 1073741824 && mode2 == 1073741824) || m2504a))) {
                }
                if (z2) {
                }
                if (size > 0) {
                }
                int i35222222 = c0411f2.f2138q0;
                size2 = c0418c.f2159a.size();
                if (size <= 0) {
                }
                if (size2 > 0) {
                }
                c0411f2.m2512I(i35222222);
                int m2529n5222222 = this.f413d.m2529n();
                int m2535h5222222 = this.f413d.m2535h();
                C0411f c0411f13222222 = this.f413d;
                z4 = c0411f13222222.f2139r0;
                z5 = c0411f13222222.f2140s0;
                C0435e c0435e6222222 = this.f427r;
                int i47222222 = c0435e6222222.f2291e;
                int min3222222 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n5222222 + c0435e6222222.f2290d, i, 0) & 16777215);
                int min4222222 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h5222222 + i47222222, i2, 0) & 16777215);
                if (z4) {
                }
                if (z5) {
                }
                setMeasuredDimension(min3222222, min4222222);
                this.f424o = min3222222;
                this.f425p = min4222222;
            }
        }
        max = Math.max(0, getPaddingLeft());
        int i262 = size4 - paddingWidth;
        int i272 = size5 - i25;
        C0435e c0435e32 = this.f427r;
        int i282 = c0435e32.f2291e;
        int i292 = c0435e32.f2290d;
        int childCount3 = getChildCount();
        if (mode == Integer.MIN_VALUE) {
        }
        i3 = Math.max(0, this.f414e);
        i4 = 2;
        i5 = Integer.MIN_VALUE;
        int i30222 = i4;
        i6 = i3;
        i7 = i30222;
        if (mode2 != i5) {
        }
        i8 = Math.max(0, this.f415f);
        i9 = 2;
        if (i6 == c0411f2.m2529n()) {
        }
        i10 = i272;
        c0411f2.f2128g0.f2166c = true;
        i11 = 0;
        c0411f2.f2085P = i11;
        c0411f2.f2086Q = i11;
        int[] iArr4222222 = c0411f2.f2120u;
        iArr4222222[i11] = this.f416g - i292;
        iArr4222222[1] = this.f417h - i282;
        c0411f2.m2520y(i11);
        c0411f2.m2521x(i11);
        c0411f2.f2079J[i11] = i7;
        c0411f2.m2540A(i6);
        c0411f2.f2079J[1] = i9;
        c0411f2.m2523v(i8);
        c0411f2.m2520y(this.f414e - i292);
        c0411f2.m2521x(this.f415f - i282);
        c0411f2.f2132k0 = max;
        c0411f2.f2133l0 = max2;
        c0418c = c0411f2.f2127f0;
        c0418c.getClass();
        C0435e c0435e42222222 = c0411f2.f2129h0;
        size = c0411f2.f2126e0.size();
        int m2529n6222222 = c0411f2.m2529n();
        int m2535h6222222 = c0411f2.m2535h();
        m2504a = AbstractC0415j.m2504a(i24, 128);
        if (m2504a) {
        }
        if (z) {
        }
        if (!(z & ((mode != 1073741824 && mode2 == 1073741824) || m2504a))) {
        }
        if (z2) {
        }
        if (size > 0) {
        }
        int i352222222 = c0411f2.f2138q0;
        size2 = c0418c.f2159a.size();
        if (size <= 0) {
        }
        if (size2 > 0) {
        }
        c0411f2.m2512I(i352222222);
        int m2529n52222222 = this.f413d.m2529n();
        int m2535h52222222 = this.f413d.m2535h();
        C0411f c0411f132222222 = this.f413d;
        z4 = c0411f132222222.f2139r0;
        z5 = c0411f132222222.f2140s0;
        C0435e c0435e62222222 = this.f427r;
        int i472222222 = c0435e62222222.f2291e;
        int min32222222 = Math.min(this.f416g, ViewGroup.resolveSizeAndState(m2529n52222222 + c0435e62222222.f2290d, i, 0) & 16777215);
        int min42222222 = Math.min(this.f417h, ViewGroup.resolveSizeAndState(m2535h52222222 + i472222222, i2, 0) & 16777215);
        if (z4) {
        }
        if (z5) {
        }
        setMeasuredDimension(min32222222, min42222222);
        this.f424o = min32222222;
        this.f425p = min42222222;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C0410e m3367c = m3367c(view);
        if ((view instanceof Guideline) && !(m3367c instanceof C0412g)) {
            C0434d c0434d = (C0434d) view.getLayoutParams();
            C0412g c0412g = new C0412g();
            c0434d.f2271k0 = c0412g;
            c0434d.f2248Y = true;
            c0412g.m2508D(c0434d.f2241R);
        }
        if (view instanceof AbstractC0432b) {
            AbstractC0432b abstractC0432b = (AbstractC0432b) view;
            abstractC0432b.m2462h();
            ((C0434d) view.getLayoutParams()).f2249Z = true;
            if (!this.f412c.contains(abstractC0432b)) {
                this.f412c.add(abstractC0432b);
            }
        }
        this.f411b.put(view.getId(), view);
        this.f418i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f411b.remove(view.getId());
        C0410e m3367c = m3367c(view);
        this.f413d.f2126e0.remove(m3367c);
        m3367c.f2080K = null;
        this.f412c.remove(view);
        this.f418i = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f418i = true;
        this.f424o = -1;
        this.f425p = -1;
        super.requestLayout();
    }

    public void setConstraintSet(C0444n c0444n) {
        this.f420k = c0444n;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f411b.remove(getId());
        super.setId(i);
        this.f411b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f417h) {
            return;
        }
        this.f417h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f416g) {
            return;
        }
        this.f416g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f415f) {
            return;
        }
        this.f415f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f414e) {
            return;
        }
        this.f414e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0445o abstractC0445o) {
        C0438h c0438h = this.f421l;
        if (c0438h != null) {
            c0438h.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f419j = i;
        this.f413d.f2138q0 = i;
        C0398f.f1969b = AbstractC0415j.m2504a(i, 256);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}