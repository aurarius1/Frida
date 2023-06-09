package p010b.p046j.p058l;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.s0 */
/* loaded from: classes.dex */
public class C0623s0 extends C0629v0 {

    /* renamed from: b */
    public static Field f2784b = null;

    /* renamed from: c */
    public static boolean f2785c = false;

    /* renamed from: d */
    public static Constructor f2786d = null;

    /* renamed from: e */
    public static boolean f2787e = false;

    /* renamed from: f */
    public WindowInsets f2788f;

    /* renamed from: g */
    public C0507b f2789g;

    public C0623s0() {
        this.f2788f = m2199e();
    }

    public C0623s0(C0573c1 c0573c1) {
        this.f2788f = c0573c1.m2319h();
    }

    /* renamed from: e */
    public static WindowInsets m2199e() {
        if (!f2785c) {
            try {
                f2784b = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f2785c = true;
        }
        Field field = f2784b;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f2787e) {
            try {
                f2786d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f2787e = true;
        }
        Constructor constructor = f2786d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p010b.p046j.p058l.C0629v0
    /* renamed from: b */
    public C0573c1 mo2195b() {
        m2196a();
        C0573c1 m2318i = C0573c1.m2318i(this.f2788f);
        m2318i.f2676b.mo2189l(null);
        m2318i.f2676b.mo2172n(this.f2789g);
        return m2318i;
    }

    @Override // p010b.p046j.p058l.C0629v0
    /* renamed from: c */
    public void mo2194c(C0507b c0507b) {
        this.f2789g = c0507b;
    }

    @Override // p010b.p046j.p058l.C0629v0
    /* renamed from: d */
    public void mo2193d(C0507b c0507b) {
        WindowInsets windowInsets = this.f2788f;
        if (windowInsets != null) {
            this.f2788f = windowInsets.replaceSystemWindowInsets(c0507b.f2542b, c0507b.f2543c, c0507b.f2544d, c0507b.f2545e);
        }
    }
}