package p010b.p016c.p026q;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p010b.p016c.p024p.p025m.C0199p;

/* renamed from: b.c.q.i2 */
/* loaded from: classes.dex */
public class C0261i2 extends C0243f2 implements InterfaceC0249g2 {

    /* renamed from: E */
    public static Method f1600E;

    /* renamed from: F */
    public InterfaceC0249g2 f1601F;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1600E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public C0261i2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // p010b.p016c.p026q.InterfaceC0249g2
    /* renamed from: e */
    public void mo2814e(C0199p c0199p, MenuItem menuItem) {
        InterfaceC0249g2 interfaceC0249g2 = this.f1601F;
        if (interfaceC0249g2 != null) {
            interfaceC0249g2.mo2814e(c0199p, menuItem);
        }
    }

    @Override // p010b.p016c.p026q.InterfaceC0249g2
    /* renamed from: h */
    public void mo2813h(C0199p c0199p, MenuItem menuItem) {
        InterfaceC0249g2 interfaceC0249g2 = this.f1601F;
        if (interfaceC0249g2 != null) {
            interfaceC0249g2.mo2813h(c0199p, menuItem);
        }
    }

    @Override // p010b.p016c.p026q.C0243f2
    /* renamed from: q */
    public C0305r1 mo2812q(Context context, boolean z) {
        C0255h2 c0255h2 = new C0255h2(context, z);
        c0255h2.setHoverListener(this);
        return c0255h2;
    }
}