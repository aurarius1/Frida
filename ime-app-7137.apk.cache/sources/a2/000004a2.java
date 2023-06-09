package p010b.p086w;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.w.l */
/* loaded from: classes.dex */
public class C1054l extends AbstractC1034e0 {

    /* renamed from: G */
    public int[] f3997G = new int[2];

    /* renamed from: y */
    public static final String[] f3995y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z */
    public static final Property f3996z = new C1027c(PointF.class, "boundsOrigin");

    /* renamed from: A */
    public static final Property f3989A = new C1030d(PointF.class, "topLeft");

    /* renamed from: B */
    public static final Property f3990B = new C1033e(PointF.class, "bottomRight");

    /* renamed from: C */
    public static final Property f3991C = new C1036f(PointF.class, "bottomRight");

    /* renamed from: D */
    public static final Property f3992D = new C1039g(PointF.class, "topLeft");

    /* renamed from: E */
    public static final Property f3993E = new C1042h(PointF.class, "position");

    /* renamed from: F */
    public static C1078w f3994F = new C1078w();

    /* renamed from: H */
    public final void m1358H(C1063o0 c1063o0) {
        View view = c1063o0.f4014b;
        if (!AbstractC0605j0.m2232z(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c1063o0.f4013a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c1063o0.f4013a.put("android:changeBounds:parent", c1063o0.f4014b.getParent());
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: d */
    public void mo770d(C1063o0 c1063o0) {
        m1358H(c1063o0);
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: g */
    public void mo769g(C1063o0 c1063o0) {
        m1358H(c1063o0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v11, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator mo768k(ViewGroup viewGroup, C1063o0 c1063o0, C1063o0 c1063o02) {
        int i;
        C1054l c1054l;
        Path m1250a;
        Property property;
        ObjectAnimator objectAnimator;
        if (c1063o0 == null || c1063o02 == null) {
            return null;
        }
        Map map = c1063o0.f4013a;
        Map map2 = c1063o02.f4013a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c1063o02.f4014b;
        Rect rect = (Rect) c1063o0.f4013a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) c1063o02.f4013a.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) c1063o0.f4013a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) c1063o02.f4013a.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 > 0) {
            AbstractC1023a1.m1382c(view, i2, i4, i6, i8);
            if (i14 != 2) {
                c1054l = this;
                if (i2 == i3 && i4 == i5) {
                    m1250a = c1054l.f3948x.m1250a(i6, i8, i7, i9);
                    property = f3991C;
                } else {
                    m1250a = c1054l.f3948x.m1250a(i2, i4, i3, i5);
                    property = f3992D;
                }
            } else if (i10 == i12 && i11 == i13) {
                c1054l = this;
                m1250a = c1054l.f3948x.m1250a(i2, i4, i3, i5);
                property = f3993E;
            } else {
                c1054l = this;
                C1051k c1051k = new C1051k(view);
                ObjectAnimator m3514T = AbstractC0022t.m3514T(c1051k, f3989A, c1054l.f3948x.m1250a(i2, i4, i3, i5));
                ObjectAnimator m3514T2 = AbstractC0022t.m3514T(c1051k, f3990B, c1054l.f3948x.m1250a(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(m3514T, m3514T2);
                animatorSet.addListener(new C1045i(c1054l, c1051k));
                objectAnimator = animatorSet;
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    AbstractC1073t0.m1304b(viewGroup4, true);
                    c1054l.mo1346a(new C1048j(c1054l, viewGroup4));
                }
                return objectAnimator;
            }
            objectAnimator = AbstractC0022t.m3514T(view, property, m1250a);
            if (view.getParent() instanceof ViewGroup) {
            }
            return objectAnimator;
        }
        return null;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: p */
    public String[] mo1331p() {
        return f3995y;
    }
}