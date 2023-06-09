package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0078d;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.p.m.b0 */
/* loaded from: classes.dex */
public class C0175b0 {

    /* renamed from: a */
    public final Context f1279a;

    /* renamed from: b */
    public final C0199p f1280b;

    /* renamed from: c */
    public final boolean f1281c;

    /* renamed from: d */
    public final int f1282d;

    /* renamed from: e */
    public final int f1283e;

    /* renamed from: f */
    public View f1284f;

    /* renamed from: h */
    public boolean f1286h;

    /* renamed from: i */
    public InterfaceC0177c0 f1287i;

    /* renamed from: j */
    public AbstractC0209z f1288j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f1289k;

    /* renamed from: g */
    public int f1285g = 8388611;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f1290l = new C0173a0(this);

    public C0175b0(Context context, C0199p c0199p, View view, boolean z, int i, int i2) {
        this.f1279a = context;
        this.f1280b = c0199p;
        this.f1284f = view;
        this.f1281c = z;
        this.f1282d = i;
        this.f1283e = i2;
    }

    /* renamed from: a */
    public AbstractC0209z m2951a() {
        if (this.f1288j == null) {
            Display defaultDisplay = ((WindowManager) this.f1279a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            AbstractC0209z view$OnKeyListenerC0190j = Math.min(point.x, point.y) >= this.f1279a.getResources().getDimensionPixelSize(AbstractC0078d.abc_cascading_menus_min_smallest_width) ? new View$OnKeyListenerC0190j(this.f1279a, this.f1284f, this.f1282d, this.f1283e, this.f1281c) : new View$OnKeyListenerC0193k0(this.f1279a, this.f1280b, this.f1284f, this.f1282d, this.f1283e, this.f1281c);
            view$OnKeyListenerC0190j.mo2894o(this.f1280b);
            view$OnKeyListenerC0190j.mo2888u(this.f1290l);
            view$OnKeyListenerC0190j.mo2892q(this.f1284f);
            view$OnKeyListenerC0190j.mo2762l(this.f1287i);
            view$OnKeyListenerC0190j.mo2891r(this.f1286h);
            view$OnKeyListenerC0190j.mo2890s(this.f1285g);
            this.f1288j = view$OnKeyListenerC0190j;
        }
        return this.f1288j;
    }

    /* renamed from: b */
    public boolean m2950b() {
        AbstractC0209z abstractC0209z = this.f1288j;
        return abstractC0209z != null && abstractC0209z.mo2835b();
    }

    /* renamed from: c */
    public void mo2789c() {
        this.f1288j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1289k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public void m2949d(InterfaceC0177c0 interfaceC0177c0) {
        this.f1287i = interfaceC0177c0;
        AbstractC0209z abstractC0209z = this.f1288j;
        if (abstractC0209z != null) {
            abstractC0209z.mo2762l(interfaceC0177c0);
        }
    }

    /* renamed from: e */
    public final void m2948e(int i, int i2, boolean z, boolean z2) {
        AbstractC0209z m2951a = m2951a();
        m2951a.mo2887v(z2);
        if (z) {
            if ((AbstractC0022t.m3460z(this.f1285g, AbstractC0605j0.m2241q(this.f1284f)) & 7) == 5) {
                i -= this.f1284f.getWidth();
            }
            m2951a.mo2889t(i);
            m2951a.mo2886w(i2);
            int i3 = (int) ((this.f1279a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m2951a.f1441b = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        m2951a.mo2833f();
    }

    /* renamed from: f */
    public boolean m2947f() {
        if (m2950b()) {
            return true;
        }
        if (this.f1284f == null) {
            return false;
        }
        m2948e(0, 0, false, false);
        return true;
    }
}