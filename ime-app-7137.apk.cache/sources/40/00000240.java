package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p037h.p038a.p039a.AbstractC0392a;
import p010b.p037h.p040b.AbstractC0403k;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.c.n */
/* loaded from: classes.dex */
public class C0444n {

    /* renamed from: a */
    public static final int[] f2402a = {0, 4, 8};

    /* renamed from: b */
    public static SparseIntArray f2403b;

    /* renamed from: c */
    public HashMap f2404c = new HashMap();

    /* renamed from: d */
    public boolean f2405d = true;

    /* renamed from: e */
    public HashMap f2406e = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2403b = sparseIntArray;
        sparseIntArray.append(AbstractC0447q.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintLeft_toRightOf, 26);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintRight_toLeftOf, 29);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintRight_toRightOf, 30);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintTop_toTopOf, 36);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintTop_toBottomOf, 35);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintBottom_toTopOf, 4);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2403b.append(AbstractC0447q.Constraint_layout_editor_absoluteX, 6);
        f2403b.append(AbstractC0447q.Constraint_layout_editor_absoluteY, 7);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintGuide_begin, 17);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintGuide_end, 18);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintGuide_percent, 19);
        f2403b.append(AbstractC0447q.Constraint_android_orientation, 27);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintStart_toEndOf, 32);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintStart_toStartOf, 33);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintEnd_toStartOf, 10);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintEnd_toEndOf, 9);
        f2403b.append(AbstractC0447q.Constraint_layout_goneMarginLeft, 13);
        f2403b.append(AbstractC0447q.Constraint_layout_goneMarginTop, 16);
        f2403b.append(AbstractC0447q.Constraint_layout_goneMarginRight, 14);
        f2403b.append(AbstractC0447q.Constraint_layout_goneMarginBottom, 11);
        f2403b.append(AbstractC0447q.Constraint_layout_goneMarginStart, 15);
        f2403b.append(AbstractC0447q.Constraint_layout_goneMarginEnd, 12);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintVertical_weight, 40);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintHorizontal_weight, 39);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintVertical_chainStyle, 42);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintHorizontal_bias, 20);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintVertical_bias, 37);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintDimensionRatio, 5);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintLeft_creator, 82);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintTop_creator, 82);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintRight_creator, 82);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintBottom_creator, 82);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintBaseline_creator, 82);
        f2403b.append(AbstractC0447q.Constraint_android_layout_marginLeft, 24);
        f2403b.append(AbstractC0447q.Constraint_android_layout_marginRight, 28);
        f2403b.append(AbstractC0447q.Constraint_android_layout_marginStart, 31);
        f2403b.append(AbstractC0447q.Constraint_android_layout_marginEnd, 8);
        f2403b.append(AbstractC0447q.Constraint_android_layout_marginTop, 34);
        f2403b.append(AbstractC0447q.Constraint_android_layout_marginBottom, 2);
        f2403b.append(AbstractC0447q.Constraint_android_layout_width, 23);
        f2403b.append(AbstractC0447q.Constraint_android_layout_height, 21);
        f2403b.append(AbstractC0447q.Constraint_android_visibility, 22);
        f2403b.append(AbstractC0447q.Constraint_android_alpha, 43);
        f2403b.append(AbstractC0447q.Constraint_android_elevation, 44);
        f2403b.append(AbstractC0447q.Constraint_android_rotationX, 45);
        f2403b.append(AbstractC0447q.Constraint_android_rotationY, 46);
        f2403b.append(AbstractC0447q.Constraint_android_rotation, 60);
        f2403b.append(AbstractC0447q.Constraint_android_scaleX, 47);
        f2403b.append(AbstractC0447q.Constraint_android_scaleY, 48);
        f2403b.append(AbstractC0447q.Constraint_android_transformPivotX, 49);
        f2403b.append(AbstractC0447q.Constraint_android_transformPivotY, 50);
        f2403b.append(AbstractC0447q.Constraint_android_translationX, 51);
        f2403b.append(AbstractC0447q.Constraint_android_translationY, 52);
        f2403b.append(AbstractC0447q.Constraint_android_translationZ, 53);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintWidth_default, 54);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintHeight_default, 55);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintWidth_max, 56);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintHeight_max, 57);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintWidth_min, 58);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintHeight_min, 59);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintCircle, 61);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintCircleRadius, 62);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintCircleAngle, 63);
        f2403b.append(AbstractC0447q.Constraint_animate_relativeTo, 64);
        f2403b.append(AbstractC0447q.Constraint_transitionEasing, 65);
        f2403b.append(AbstractC0447q.Constraint_drawPath, 66);
        f2403b.append(AbstractC0447q.Constraint_transitionPathRotate, 67);
        f2403b.append(AbstractC0447q.Constraint_motionStagger, 79);
        f2403b.append(AbstractC0447q.Constraint_android_id, 38);
        f2403b.append(AbstractC0447q.Constraint_motionProgress, 68);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintWidth_percent, 69);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintHeight_percent, 70);
        f2403b.append(AbstractC0447q.Constraint_chainUseRtl, 71);
        f2403b.append(AbstractC0447q.Constraint_barrierDirection, 72);
        f2403b.append(AbstractC0447q.Constraint_barrierMargin, 73);
        f2403b.append(AbstractC0447q.Constraint_constraint_referenced_ids, 74);
        f2403b.append(AbstractC0447q.Constraint_barrierAllowsGoneWidgets, 75);
        f2403b.append(AbstractC0447q.Constraint_pathMotionArc, 76);
        f2403b.append(AbstractC0447q.Constraint_layout_constraintTag, 77);
        f2403b.append(AbstractC0447q.Constraint_visibilityMode, 78);
        f2403b.append(AbstractC0447q.Constraint_layout_constrainedWidth, 80);
        f2403b.append(AbstractC0447q.Constraint_layout_constrainedHeight, 81);
    }

    /* renamed from: a */
    public void m2453a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2406e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2406e.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else if (this.f2405d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1 && this.f2406e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0439i c0439i = (C0439i) this.f2406e.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        c0439i.f2309d.f2347e0 = 1;
                    }
                    int i2 = c0439i.f2309d.f2347e0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(c0439i.f2309d.f2343c0);
                        barrier.setMargin(c0439i.f2309d.f2345d0);
                        barrier.setAllowsGoneWidget(c0439i.f2309d.f2359k0);
                        C0440j c0440j = c0439i.f2309d;
                        int[] iArr = c0440j.f2349f0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = c0440j.f2351g0;
                            if (str != null) {
                                c0440j.f2349f0 = m2451c(barrier, str);
                                barrier.setReferencedIds(c0439i.f2309d.f2349f0);
                            }
                        }
                    }
                    C0434d c0434d = (C0434d) childAt.getLayoutParams();
                    c0434d.m2461a();
                    c0439i.m2458a(c0434d);
                    if (z) {
                        HashMap hashMap = c0439i.f2311f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : hashMap.keySet()) {
                            C0431a c0431a = (C0431a) hashMap.get(str2);
                            String m1190f = AbstractC1124a.m1190f("set", str2);
                            try {
                                switch (AbstractC0403k.m2567a(c0431a.f2211b)) {
                                    case 0:
                                        cls.getMethod(m1190f, Integer.TYPE).invoke(childAt, Integer.valueOf(c0431a.f2212c));
                                        break;
                                    case 1:
                                        cls.getMethod(m1190f, Float.TYPE).invoke(childAt, Float.valueOf(c0431a.f2213d));
                                        break;
                                    case 2:
                                        cls.getMethod(m1190f, Integer.TYPE).invoke(childAt, Integer.valueOf(c0431a.f2216g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(m1190f, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c0431a.f2216g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(m1190f, CharSequence.class).invoke(childAt, c0431a.f2214e);
                                        break;
                                    case 5:
                                        cls.getMethod(m1190f, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0431a.f2215f));
                                        break;
                                    case 6:
                                        cls.getMethod(m1190f, Float.TYPE).invoke(childAt, Float.valueOf(c0431a.f2213d));
                                        break;
                                }
                            } catch (IllegalAccessException e) {
                                cls.getName();
                                e.printStackTrace();
                            } catch (NoSuchMethodException e2) {
                                e2.getMessage();
                                cls.getName();
                            } catch (InvocationTargetException e3) {
                                cls.getName();
                                e3.printStackTrace();
                            }
                        }
                    }
                    childAt.setLayoutParams(c0434d);
                    C0442l c0442l = c0439i.f2307b;
                    if (c0442l.f2385c == 0) {
                        childAt.setVisibility(c0442l.f2384b);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 17) {
                        childAt.setAlpha(c0439i.f2307b.f2386d);
                        childAt.setRotation(c0439i.f2310e.f2390c);
                        childAt.setRotationX(c0439i.f2310e.f2391d);
                        childAt.setRotationY(c0439i.f2310e.f2392e);
                        childAt.setScaleX(c0439i.f2310e.f2393f);
                        childAt.setScaleY(c0439i.f2310e.f2394g);
                        if (!Float.isNaN(c0439i.f2310e.f2395h)) {
                            childAt.setPivotX(c0439i.f2310e.f2395h);
                        }
                        if (!Float.isNaN(c0439i.f2310e.f2396i)) {
                            childAt.setPivotY(c0439i.f2310e.f2396i);
                        }
                        childAt.setTranslationX(c0439i.f2310e.f2397j);
                        childAt.setTranslationY(c0439i.f2310e.f2398k);
                        if (i3 >= 21) {
                            childAt.setTranslationZ(c0439i.f2310e.f2399l);
                            C0443m c0443m = c0439i.f2310e;
                            if (c0443m.f2400m) {
                                childAt.setElevation(c0443m.f2401n);
                            }
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0439i c0439i2 = (C0439i) this.f2406e.get(num);
            int i4 = c0439i2.f2309d.f2347e0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0440j c0440j2 = c0439i2.f2309d;
                int[] iArr2 = c0440j2.f2349f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = c0440j2.f2351g0;
                    if (str3 != null) {
                        c0440j2.f2349f0 = m2451c(barrier2, str3);
                        barrier2.setReferencedIds(c0439i2.f2309d.f2349f0);
                    }
                }
                barrier2.setType(c0439i2.f2309d.f2343c0);
                barrier2.setMargin(c0439i2.f2309d.f2345d0);
                C0434d generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m2462h();
                c0439i2.m2458a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (c0439i2.f2309d.f2340b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0434d generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c0439i2.m2458a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: b */
    public void m2452b(ConstraintLayout constraintLayout) {
        C0431a c0431a;
        C0444n c0444n = this;
        int childCount = constraintLayout.getChildCount();
        c0444n.f2406e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0434d c0434d = (C0434d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0444n.f2405d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c0444n.f2406e.containsKey(Integer.valueOf(id))) {
                c0444n.f2406e.put(Integer.valueOf(id), new C0439i());
            }
            C0439i c0439i = (C0439i) c0444n.f2406e.get(Integer.valueOf(id));
            HashMap hashMap = c0444n.f2404c;
            HashMap hashMap2 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap.keySet()) {
                C0431a c0431a2 = (C0431a) hashMap.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        c0431a = new C0431a(c0431a2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                    } else {
                        try {
                            c0431a = new C0431a(c0431a2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        } catch (IllegalAccessException e) {
                            e = e;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e = e3;
                            e.printStackTrace();
                        }
                    }
                    hashMap2.put(str, c0431a);
                } catch (IllegalAccessException e4) {
                    e = e4;
                } catch (NoSuchMethodException e5) {
                    e = e5;
                } catch (InvocationTargetException e6) {
                    e = e6;
                }
            }
            c0439i.f2311f = hashMap2;
            c0439i.f2306a = id;
            C0440j c0440j = c0439i.f2309d;
            c0440j.f2354i = c0434d.f2256d;
            c0440j.f2356j = c0434d.f2258e;
            c0440j.f2358k = c0434d.f2260f;
            c0440j.f2360l = c0434d.f2262g;
            c0440j.f2361m = c0434d.f2264h;
            c0440j.f2362n = c0434d.f2266i;
            c0440j.f2363o = c0434d.f2268j;
            c0440j.f2364p = c0434d.f2270k;
            c0440j.f2365q = c0434d.f2272l;
            c0440j.f2366r = c0434d.f2276p;
            c0440j.f2367s = c0434d.f2277q;
            c0440j.f2368t = c0434d.f2278r;
            c0440j.f2369u = c0434d.f2279s;
            c0440j.f2370v = c0434d.f2286z;
            c0440j.f2371w = c0434d.f2224A;
            c0440j.f2372x = c0434d.f2225B;
            c0440j.f2373y = c0434d.f2273m;
            c0440j.f2374z = c0434d.f2274n;
            c0440j.f2313A = c0434d.f2275o;
            c0440j.f2314B = c0434d.f2239P;
            c0440j.f2315C = c0434d.f2240Q;
            c0440j.f2316D = c0434d.f2241R;
            c0440j.f2352h = c0434d.f2254c;
            c0440j.f2348f = c0434d.f2250a;
            c0440j.f2350g = c0434d.f2252b;
            C0440j c0440j2 = c0439i.f2309d;
            c0440j2.f2344d = ((ViewGroup.MarginLayoutParams) c0434d).width;
            c0440j2.f2346e = ((ViewGroup.MarginLayoutParams) c0434d).height;
            c0440j2.f2317E = ((ViewGroup.MarginLayoutParams) c0434d).leftMargin;
            c0440j2.f2318F = ((ViewGroup.MarginLayoutParams) c0434d).rightMargin;
            c0440j2.f2319G = ((ViewGroup.MarginLayoutParams) c0434d).topMargin;
            c0440j2.f2320H = ((ViewGroup.MarginLayoutParams) c0434d).bottomMargin;
            c0440j2.f2329Q = c0434d.f2228E;
            c0440j2.f2330R = c0434d.f2227D;
            c0440j2.f2332T = c0434d.f2230G;
            c0440j2.f2331S = c0434d.f2229F;
            c0440j2.f2355i0 = c0434d.f2242S;
            c0440j2.f2357j0 = c0434d.f2243T;
            c0440j2.f2333U = c0434d.f2231H;
            c0440j2.f2334V = c0434d.f2232I;
            c0440j2.f2335W = c0434d.f2235L;
            c0440j2.f2336X = c0434d.f2236M;
            c0440j2.f2337Y = c0434d.f2233J;
            c0440j2.f2338Z = c0434d.f2234K;
            c0440j2.f2339a0 = c0434d.f2237N;
            c0440j2.f2341b0 = c0434d.f2238O;
            c0440j2.f2353h0 = c0434d.f2244U;
            c0440j2.f2324L = c0434d.f2281u;
            c0440j2.f2326N = c0434d.f2283w;
            c0440j2.f2323K = c0434d.f2280t;
            c0440j2.f2325M = c0434d.f2282v;
            C0440j c0440j3 = c0439i.f2309d;
            c0440j3.f2328P = c0434d.f2284x;
            c0440j3.f2327O = c0434d.f2285y;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 17) {
                c0440j3.f2321I = c0434d.getMarginEnd();
                c0439i.f2309d.f2322J = c0434d.getMarginStart();
            }
            c0439i.f2307b.f2384b = childAt.getVisibility();
            if (i2 >= 17) {
                c0439i.f2307b.f2386d = childAt.getAlpha();
                c0439i.f2310e.f2390c = childAt.getRotation();
                c0439i.f2310e.f2391d = childAt.getRotationX();
                c0439i.f2310e.f2392e = childAt.getRotationY();
                c0439i.f2310e.f2393f = childAt.getScaleX();
                c0439i.f2310e.f2394g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0443m c0443m = c0439i.f2310e;
                    c0443m.f2395h = pivotX;
                    c0443m.f2396i = pivotY;
                }
                c0439i.f2310e.f2397j = childAt.getTranslationX();
                c0439i.f2310e.f2398k = childAt.getTranslationY();
                if (i2 >= 21) {
                    c0439i.f2310e.f2399l = childAt.getTranslationZ();
                    C0443m c0443m2 = c0439i.f2310e;
                    if (c0443m2.f2400m) {
                        c0443m2.f2401n = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                C0440j c0440j4 = c0439i.f2309d;
                c0440j4.f2359k0 = barrier.f410j.f2031h0;
                c0440j4.f2349f0 = barrier.getReferencedIds();
                c0439i.f2309d.f2343c0 = barrier.getType();
                c0439i.f2309d.f2345d0 = barrier.getMargin();
            }
            i++;
            c0444n = this;
        }
    }

    /* renamed from: c */
    public final int[] m2451c(View view, String str) {
        int i;
        Object m3368b;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = AbstractC0446p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m3368b = ((ConstraintLayout) view.getParent()).m3368b(0, trim)) != null && (m3368b instanceof Integer)) {
                i = ((Integer) m3368b).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: d */
    public final C0439i m2450d(Context context, AttributeSet attributeSet) {
        C0441k c0441k;
        String str;
        C0439i c0439i = new C0439i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0447q.Constraint);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index != AbstractC0447q.Constraint_android_id && AbstractC0447q.Constraint_android_layout_marginStart != index && AbstractC0447q.Constraint_android_layout_marginEnd != index) {
                c0439i.f2308c.f2376b = true;
                c0439i.f2309d.f2342c = true;
                c0439i.f2307b.f2383a = true;
                c0439i.f2310e.f2389b = true;
            }
            switch (f2403b.get(index)) {
                case 1:
                    C0440j c0440j = c0439i.f2309d;
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0440j.f2365q);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j.f2365q = resourceId;
                    break;
                case 2:
                    C0440j c0440j2 = c0439i.f2309d;
                    c0440j2.f2320H = obtainStyledAttributes.getDimensionPixelSize(index, c0440j2.f2320H);
                    break;
                case 3:
                    C0440j c0440j3 = c0439i.f2309d;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0440j3.f2364p);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j3.f2364p = resourceId2;
                    break;
                case 4:
                    C0440j c0440j4 = c0439i.f2309d;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0440j4.f2363o);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j4.f2363o = resourceId3;
                    break;
                case 5:
                    c0439i.f2309d.f2372x = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    C0440j c0440j5 = c0439i.f2309d;
                    c0440j5.f2314B = obtainStyledAttributes.getDimensionPixelOffset(index, c0440j5.f2314B);
                    break;
                case 7:
                    C0440j c0440j6 = c0439i.f2309d;
                    c0440j6.f2315C = obtainStyledAttributes.getDimensionPixelOffset(index, c0440j6.f2315C);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0440j c0440j7 = c0439i.f2309d;
                        c0440j7.f2321I = obtainStyledAttributes.getDimensionPixelSize(index, c0440j7.f2321I);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    C0440j c0440j8 = c0439i.f2309d;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0440j8.f2369u);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j8.f2369u = resourceId4;
                    break;
                case 10:
                    C0440j c0440j9 = c0439i.f2309d;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0440j9.f2368t);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j9.f2368t = resourceId5;
                    break;
                case 11:
                    C0440j c0440j10 = c0439i.f2309d;
                    c0440j10.f2326N = obtainStyledAttributes.getDimensionPixelSize(index, c0440j10.f2326N);
                    break;
                case 12:
                    C0440j c0440j11 = c0439i.f2309d;
                    c0440j11.f2327O = obtainStyledAttributes.getDimensionPixelSize(index, c0440j11.f2327O);
                    break;
                case 13:
                    C0440j c0440j12 = c0439i.f2309d;
                    c0440j12.f2323K = obtainStyledAttributes.getDimensionPixelSize(index, c0440j12.f2323K);
                    break;
                case 14:
                    C0440j c0440j13 = c0439i.f2309d;
                    c0440j13.f2325M = obtainStyledAttributes.getDimensionPixelSize(index, c0440j13.f2325M);
                    break;
                case 15:
                    C0440j c0440j14 = c0439i.f2309d;
                    c0440j14.f2328P = obtainStyledAttributes.getDimensionPixelSize(index, c0440j14.f2328P);
                    break;
                case 16:
                    C0440j c0440j15 = c0439i.f2309d;
                    c0440j15.f2324L = obtainStyledAttributes.getDimensionPixelSize(index, c0440j15.f2324L);
                    break;
                case 17:
                    C0440j c0440j16 = c0439i.f2309d;
                    c0440j16.f2348f = obtainStyledAttributes.getDimensionPixelOffset(index, c0440j16.f2348f);
                    break;
                case 18:
                    C0440j c0440j17 = c0439i.f2309d;
                    c0440j17.f2350g = obtainStyledAttributes.getDimensionPixelOffset(index, c0440j17.f2350g);
                    break;
                case 19:
                    C0440j c0440j18 = c0439i.f2309d;
                    c0440j18.f2352h = obtainStyledAttributes.getFloat(index, c0440j18.f2352h);
                    break;
                case 20:
                    C0440j c0440j19 = c0439i.f2309d;
                    c0440j19.f2370v = obtainStyledAttributes.getFloat(index, c0440j19.f2370v);
                    break;
                case 21:
                    C0440j c0440j20 = c0439i.f2309d;
                    c0440j20.f2346e = obtainStyledAttributes.getLayoutDimension(index, c0440j20.f2346e);
                    break;
                case 22:
                    C0442l c0442l = c0439i.f2307b;
                    c0442l.f2384b = obtainStyledAttributes.getInt(index, c0442l.f2384b);
                    C0442l c0442l2 = c0439i.f2307b;
                    c0442l2.f2384b = f2402a[c0442l2.f2384b];
                    break;
                case 23:
                    C0440j c0440j21 = c0439i.f2309d;
                    c0440j21.f2344d = obtainStyledAttributes.getLayoutDimension(index, c0440j21.f2344d);
                    break;
                case 24:
                    C0440j c0440j22 = c0439i.f2309d;
                    c0440j22.f2317E = obtainStyledAttributes.getDimensionPixelSize(index, c0440j22.f2317E);
                    break;
                case 25:
                    C0440j c0440j23 = c0439i.f2309d;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0440j23.f2354i);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j23.f2354i = resourceId6;
                    break;
                case 26:
                    C0440j c0440j24 = c0439i.f2309d;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0440j24.f2356j);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j24.f2356j = resourceId7;
                    break;
                case 27:
                    C0440j c0440j25 = c0439i.f2309d;
                    c0440j25.f2316D = obtainStyledAttributes.getInt(index, c0440j25.f2316D);
                    break;
                case 28:
                    C0440j c0440j26 = c0439i.f2309d;
                    c0440j26.f2318F = obtainStyledAttributes.getDimensionPixelSize(index, c0440j26.f2318F);
                    break;
                case 29:
                    C0440j c0440j27 = c0439i.f2309d;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0440j27.f2358k);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j27.f2358k = resourceId8;
                    break;
                case 30:
                    C0440j c0440j28 = c0439i.f2309d;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0440j28.f2360l);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j28.f2360l = resourceId9;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0440j c0440j29 = c0439i.f2309d;
                        c0440j29.f2322J = obtainStyledAttributes.getDimensionPixelSize(index, c0440j29.f2322J);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    C0440j c0440j30 = c0439i.f2309d;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0440j30.f2366r);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j30.f2366r = resourceId10;
                    break;
                case 33:
                    C0440j c0440j31 = c0439i.f2309d;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0440j31.f2367s);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j31.f2367s = resourceId11;
                    break;
                case 34:
                    C0440j c0440j32 = c0439i.f2309d;
                    c0440j32.f2319G = obtainStyledAttributes.getDimensionPixelSize(index, c0440j32.f2319G);
                    break;
                case 35:
                    C0440j c0440j33 = c0439i.f2309d;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0440j33.f2362n);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j33.f2362n = resourceId12;
                    break;
                case 36:
                    C0440j c0440j34 = c0439i.f2309d;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0440j34.f2361m);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j34.f2361m = resourceId13;
                    break;
                case 37:
                    C0440j c0440j35 = c0439i.f2309d;
                    c0440j35.f2371w = obtainStyledAttributes.getFloat(index, c0440j35.f2371w);
                    break;
                case 38:
                    c0439i.f2306a = obtainStyledAttributes.getResourceId(index, c0439i.f2306a);
                    break;
                case 39:
                    C0440j c0440j36 = c0439i.f2309d;
                    c0440j36.f2330R = obtainStyledAttributes.getFloat(index, c0440j36.f2330R);
                    break;
                case 40:
                    C0440j c0440j37 = c0439i.f2309d;
                    c0440j37.f2329Q = obtainStyledAttributes.getFloat(index, c0440j37.f2329Q);
                    break;
                case 41:
                    C0440j c0440j38 = c0439i.f2309d;
                    c0440j38.f2331S = obtainStyledAttributes.getInt(index, c0440j38.f2331S);
                    break;
                case 42:
                    C0440j c0440j39 = c0439i.f2309d;
                    c0440j39.f2332T = obtainStyledAttributes.getInt(index, c0440j39.f2332T);
                    break;
                case 43:
                    C0442l c0442l3 = c0439i.f2307b;
                    c0442l3.f2386d = obtainStyledAttributes.getFloat(index, c0442l3.f2386d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0443m c0443m = c0439i.f2310e;
                        c0443m.f2400m = true;
                        c0443m.f2401n = obtainStyledAttributes.getDimension(index, c0443m.f2401n);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    C0443m c0443m2 = c0439i.f2310e;
                    c0443m2.f2391d = obtainStyledAttributes.getFloat(index, c0443m2.f2391d);
                    break;
                case 46:
                    C0443m c0443m3 = c0439i.f2310e;
                    c0443m3.f2392e = obtainStyledAttributes.getFloat(index, c0443m3.f2392e);
                    break;
                case 47:
                    C0443m c0443m4 = c0439i.f2310e;
                    c0443m4.f2393f = obtainStyledAttributes.getFloat(index, c0443m4.f2393f);
                    break;
                case 48:
                    C0443m c0443m5 = c0439i.f2310e;
                    c0443m5.f2394g = obtainStyledAttributes.getFloat(index, c0443m5.f2394g);
                    break;
                case 49:
                    C0443m c0443m6 = c0439i.f2310e;
                    c0443m6.f2395h = obtainStyledAttributes.getDimension(index, c0443m6.f2395h);
                    break;
                case 50:
                    C0443m c0443m7 = c0439i.f2310e;
                    c0443m7.f2396i = obtainStyledAttributes.getDimension(index, c0443m7.f2396i);
                    break;
                case 51:
                    C0443m c0443m8 = c0439i.f2310e;
                    c0443m8.f2397j = obtainStyledAttributes.getDimension(index, c0443m8.f2397j);
                    break;
                case 52:
                    C0443m c0443m9 = c0439i.f2310e;
                    c0443m9.f2398k = obtainStyledAttributes.getDimension(index, c0443m9.f2398k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0443m c0443m10 = c0439i.f2310e;
                        c0443m10.f2399l = obtainStyledAttributes.getDimension(index, c0443m10.f2399l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    C0440j c0440j40 = c0439i.f2309d;
                    c0440j40.f2333U = obtainStyledAttributes.getInt(index, c0440j40.f2333U);
                    break;
                case 55:
                    C0440j c0440j41 = c0439i.f2309d;
                    c0440j41.f2334V = obtainStyledAttributes.getInt(index, c0440j41.f2334V);
                    break;
                case 56:
                    C0440j c0440j42 = c0439i.f2309d;
                    c0440j42.f2335W = obtainStyledAttributes.getDimensionPixelSize(index, c0440j42.f2335W);
                    break;
                case 57:
                    C0440j c0440j43 = c0439i.f2309d;
                    c0440j43.f2336X = obtainStyledAttributes.getDimensionPixelSize(index, c0440j43.f2336X);
                    break;
                case 58:
                    C0440j c0440j44 = c0439i.f2309d;
                    c0440j44.f2337Y = obtainStyledAttributes.getDimensionPixelSize(index, c0440j44.f2337Y);
                    break;
                case 59:
                    C0440j c0440j45 = c0439i.f2309d;
                    c0440j45.f2338Z = obtainStyledAttributes.getDimensionPixelSize(index, c0440j45.f2338Z);
                    break;
                case 60:
                    C0443m c0443m11 = c0439i.f2310e;
                    c0443m11.f2390c = obtainStyledAttributes.getFloat(index, c0443m11.f2390c);
                    break;
                case 61:
                    C0440j c0440j46 = c0439i.f2309d;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0440j46.f2373y);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0440j46.f2373y = resourceId14;
                    break;
                case 62:
                    C0440j c0440j47 = c0439i.f2309d;
                    c0440j47.f2374z = obtainStyledAttributes.getDimensionPixelSize(index, c0440j47.f2374z);
                    break;
                case 63:
                    C0440j c0440j48 = c0439i.f2309d;
                    c0440j48.f2313A = obtainStyledAttributes.getFloat(index, c0440j48.f2313A);
                    break;
                case 64:
                    C0441k c0441k2 = c0439i.f2308c;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, c0441k2.f2377c);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0441k2.f2377c = resourceId15;
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        c0441k = c0439i.f2308c;
                        str = obtainStyledAttributes.getString(index);
                    } else {
                        c0441k = c0439i.f2308c;
                        str = AbstractC0392a.f1948a[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    c0441k.f2378d = str;
                    break;
                case 66:
                    c0439i.f2308c.f2380f = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    C0441k c0441k3 = c0439i.f2308c;
                    c0441k3.f2382h = obtainStyledAttributes.getFloat(index, c0441k3.f2382h);
                    break;
                case 68:
                    C0442l c0442l4 = c0439i.f2307b;
                    c0442l4.f2387e = obtainStyledAttributes.getFloat(index, c0442l4.f2387e);
                    break;
                case 69:
                    c0439i.f2309d.f2339a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0439i.f2309d.f2341b0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    C0440j c0440j49 = c0439i.f2309d;
                    c0440j49.f2343c0 = obtainStyledAttributes.getInt(index, c0440j49.f2343c0);
                    break;
                case 73:
                    C0440j c0440j50 = c0439i.f2309d;
                    c0440j50.f2345d0 = obtainStyledAttributes.getDimensionPixelSize(index, c0440j50.f2345d0);
                    break;
                case 74:
                    c0439i.f2309d.f2351g0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    C0440j c0440j51 = c0439i.f2309d;
                    c0440j51.f2359k0 = obtainStyledAttributes.getBoolean(index, c0440j51.f2359k0);
                    break;
                case 76:
                    C0441k c0441k4 = c0439i.f2308c;
                    c0441k4.f2379e = obtainStyledAttributes.getInt(index, c0441k4.f2379e);
                    break;
                case 77:
                    c0439i.f2309d.f2353h0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    C0442l c0442l5 = c0439i.f2307b;
                    c0442l5.f2385c = obtainStyledAttributes.getInt(index, c0442l5.f2385c);
                    break;
                case 79:
                    C0441k c0441k5 = c0439i.f2308c;
                    c0441k5.f2381g = obtainStyledAttributes.getFloat(index, c0441k5.f2381g);
                    break;
                case 80:
                    C0440j c0440j52 = c0439i.f2309d;
                    c0440j52.f2355i0 = obtainStyledAttributes.getBoolean(index, c0440j52.f2355i0);
                    break;
                case 81:
                    C0440j c0440j53 = c0439i.f2309d;
                    c0440j53.f2357j0 = obtainStyledAttributes.getBoolean(index, c0440j53.f2357j0);
                    break;
                default:
                    Integer.toHexString(index);
                    f2403b.get(index);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return c0439i;
    }

    /* renamed from: e */
    public void m2449e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0439i m2450d = m2450d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m2450d.f2309d.f2340b = true;
                    }
                    this.f2406e.put(Integer.valueOf(m2450d.f2306a), m2450d);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}