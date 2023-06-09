package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import p010b.p016c.AbstractC0078d;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.p026q.C0261i2;
import p010b.p016c.p026q.C0305r1;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.p.m.k0 */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0193k0 extends AbstractC0209z implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0179d0, View.OnKeyListener {

    /* renamed from: c */
    public static final int f1335c = AbstractC0081g.abc_popup_menu_item_layout;

    /* renamed from: d */
    public final Context f1336d;

    /* renamed from: e */
    public final C0199p f1337e;

    /* renamed from: f */
    public final C0196m f1338f;

    /* renamed from: g */
    public final boolean f1339g;

    /* renamed from: h */
    public final int f1340h;

    /* renamed from: i */
    public final int f1341i;

    /* renamed from: j */
    public final int f1342j;

    /* renamed from: k */
    public final C0261i2 f1343k;

    /* renamed from: n */
    public PopupWindow.OnDismissListener f1346n;

    /* renamed from: o */
    public View f1347o;

    /* renamed from: p */
    public View f1348p;

    /* renamed from: q */
    public InterfaceC0177c0 f1349q;

    /* renamed from: r */
    public ViewTreeObserver f1350r;

    /* renamed from: s */
    public boolean f1351s;

    /* renamed from: t */
    public boolean f1352t;

    /* renamed from: u */
    public int f1353u;

    /* renamed from: w */
    public boolean f1355w;

    /* renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener f1344l = new ViewTreeObserver$OnGlobalLayoutListenerC0189i0(this);

    /* renamed from: m */
    public final View.OnAttachStateChangeListener f1345m = new View$OnAttachStateChangeListenerC0191j0(this);

    /* renamed from: v */
    public int f1354v = 0;

    public View$OnKeyListenerC0193k0(Context context, C0199p c0199p, View view, int i, int i2, boolean z) {
        this.f1336d = context;
        this.f1337e = c0199p;
        this.f1339g = z;
        this.f1338f = new C0196m(c0199p, LayoutInflater.from(context), z, f1335c);
        this.f1341i = i;
        this.f1342j = i2;
        Resources resources = context.getResources();
        this.f1340h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC0078d.abc_config_prefDialogWidth));
        this.f1347o = view;
        this.f1343k = new C0261i2(context, null, i, i2);
        c0199p.m2937b(this, context);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: a */
    public void mo649a(C0199p c0199p, boolean z) {
        if (c0199p != this.f1337e) {
            return;
        }
        dismiss();
        InterfaceC0177c0 interfaceC0177c0 = this.f1349q;
        if (interfaceC0177c0 != null) {
            interfaceC0177c0.mo2734a(c0199p, z);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: b */
    public boolean mo2835b() {
        return !this.f1351s && this.f1343k.mo2835b();
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: d */
    public boolean mo647d() {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    public void dismiss() {
        if (mo2835b()) {
            this.f1343k.dismiss();
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: e */
    public Parcelable mo646e() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2833f() {
        View view;
        boolean z = false;
        if (!mo2835b()) {
            if (!this.f1351s && (view = this.f1347o) != null) {
                this.f1348p = view;
                this.f1343k.f1558D.setOnDismissListener(this);
                C0261i2 c0261i2 = this.f1343k;
                c0261i2.f1575u = this;
                c0261i2.m2826s(true);
                View view2 = this.f1348p;
                boolean z2 = this.f1350r == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f1350r = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1344l);
                }
                view2.addOnAttachStateChangeListener(this.f1345m);
                C0261i2 c0261i22 = this.f1343k;
                c0261i22.f1574t = view2;
                c0261i22.f1570p = this.f1354v;
                if (!this.f1352t) {
                    this.f1353u = AbstractC0209z.m2893p(this.f1338f, null, this.f1336d, this.f1340h);
                    this.f1352t = true;
                }
                this.f1343k.m2827r(this.f1353u);
                this.f1343k.f1558D.setInputMethodMode(2);
                C0261i2 c0261i23 = this.f1343k;
                Rect rect = this.f1441b;
                c0261i23.getClass();
                c0261i23.f1556B = rect != null ? new Rect(rect) : null;
                this.f1343k.mo2833f();
                C0305r1 c0305r1 = this.f1343k.f1561g;
                c0305r1.setOnKeyListener(this);
                if (this.f1355w && this.f1337e.f1384n != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1336d).inflate(AbstractC0081g.abc_popup_menu_header_item_layout, (ViewGroup) c0305r1, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f1337e.f1384n);
                    }
                    frameLayout.setEnabled(false);
                    c0305r1.addHeaderView(frameLayout, null, false);
                }
                this.f1343k.mo2697o(this.f1338f);
                this.f1343k.mo2833f();
            }
            if (z) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            return;
        }
        z = true;
        if (z) {
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: h */
    public void mo644h(Parcelable parcelable) {
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: k */
    public ListView mo2830k() {
        return this.f1343k.f1561g;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: l */
    public void mo2762l(InterfaceC0177c0 interfaceC0177c0) {
        this.f1349q = interfaceC0177c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo641m(SubMenuC0195l0 subMenuC0195l0) {
        boolean z;
        if (subMenuC0195l0.hasVisibleItems()) {
            C0175b0 c0175b0 = new C0175b0(this.f1336d, subMenuC0195l0, this.f1348p, this.f1339g, this.f1341i, this.f1342j);
            c0175b0.m2949d(this.f1349q);
            boolean m2885x = AbstractC0209z.m2885x(subMenuC0195l0);
            c0175b0.f1286h = m2885x;
            AbstractC0209z abstractC0209z = c0175b0.f1288j;
            if (abstractC0209z != null) {
                abstractC0209z.mo2891r(m2885x);
            }
            c0175b0.f1289k = this.f1346n;
            this.f1346n = null;
            this.f1337e.m2936c(false);
            C0261i2 c0261i2 = this.f1343k;
            int i = c0261i2.f1564j;
            int i2 = !c0261i2.f1567m ? 0 : c0261i2.f1565k;
            if ((Gravity.getAbsoluteGravity(this.f1354v, AbstractC0605j0.m2241q(this.f1347o)) & 7) == 5) {
                i += this.f1347o.getWidth();
            }
            if (!c0175b0.m2950b()) {
                if (c0175b0.f1284f == null) {
                    z = false;
                    if (z) {
                        InterfaceC0177c0 interfaceC0177c0 = this.f1349q;
                        if (interfaceC0177c0 != null) {
                            interfaceC0177c0.mo2733b(subMenuC0195l0);
                        }
                        return true;
                    }
                } else {
                    c0175b0.m2948e(i, i2, true, true);
                }
            }
            z = true;
            if (z) {
            }
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: n */
    public void mo640n(boolean z) {
        this.f1352t = false;
        C0196m c0196m = this.f1338f;
        if (c0196m != null) {
            c0196m.notifyDataSetChanged();
        }
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: o */
    public void mo2894o(C0199p c0199p) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1351s = true;
        this.f1337e.m2936c(true);
        ViewTreeObserver viewTreeObserver = this.f1350r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1350r = this.f1348p.getViewTreeObserver();
            }
            this.f1350r.removeGlobalOnLayoutListener(this.f1344l);
            this.f1350r = null;
        }
        this.f1348p.removeOnAttachStateChangeListener(this.f1345m);
        PopupWindow.OnDismissListener onDismissListener = this.f1346n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: q */
    public void mo2892q(View view) {
        this.f1347o = view;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: r */
    public void mo2891r(boolean z) {
        this.f1338f.f1367d = z;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: s */
    public void mo2890s(int i) {
        this.f1354v = i;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: t */
    public void mo2889t(int i) {
        this.f1343k.f1564j = i;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: u */
    public void mo2888u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1346n = onDismissListener;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: v */
    public void mo2887v(boolean z) {
        this.f1355w = z;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: w */
    public void mo2886w(int i) {
        C0261i2 c0261i2 = this.f1343k;
        c0261i2.f1565k = i;
        c0261i2.f1567m = true;
    }
}