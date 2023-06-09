package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0078d;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.p026q.C0261i2;
import p010b.p016c.p026q.C0305r1;
import p010b.p016c.p026q.InterfaceC0249g2;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.p.m.j */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0190j extends AbstractC0209z implements InterfaceC0179d0, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: c */
    public static final int f1305c = AbstractC0081g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public ViewTreeObserver f1306A;

    /* renamed from: B */
    public PopupWindow.OnDismissListener f1307B;

    /* renamed from: C */
    public boolean f1308C;

    /* renamed from: d */
    public final Context f1309d;

    /* renamed from: e */
    public final int f1310e;

    /* renamed from: f */
    public final int f1311f;

    /* renamed from: g */
    public final int f1312g;

    /* renamed from: h */
    public final boolean f1313h;

    /* renamed from: i */
    public final Handler f1314i;

    /* renamed from: q */
    public View f1322q;

    /* renamed from: r */
    public View f1323r;

    /* renamed from: s */
    public int f1324s;

    /* renamed from: t */
    public boolean f1325t;

    /* renamed from: u */
    public boolean f1326u;

    /* renamed from: v */
    public int f1327v;

    /* renamed from: w */
    public int f1328w;

    /* renamed from: y */
    public boolean f1330y;

    /* renamed from: z */
    public InterfaceC0177c0 f1331z;

    /* renamed from: j */
    public final List f1315j = new ArrayList();

    /* renamed from: k */
    public final List f1316k = new ArrayList();

    /* renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener f1317l = new ViewTreeObserver$OnGlobalLayoutListenerC0180e(this);

    /* renamed from: m */
    public final View.OnAttachStateChangeListener f1318m = new View$OnAttachStateChangeListenerC0182f(this);

    /* renamed from: n */
    public final InterfaceC0249g2 f1319n = new C0186h(this);

    /* renamed from: o */
    public int f1320o = 0;

    /* renamed from: p */
    public int f1321p = 0;

    /* renamed from: x */
    public boolean f1329x = false;

    public View$OnKeyListenerC0190j(Context context, View view, int i, int i2, boolean z) {
        this.f1309d = context;
        this.f1322q = view;
        this.f1311f = i;
        this.f1312g = i2;
        this.f1313h = z;
        this.f1324s = AbstractC0605j0.m2241q(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1310e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC0078d.abc_config_prefDialogWidth));
        this.f1314i = new Handler();
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: a */
    public void mo649a(C0199p c0199p, boolean z) {
        int i;
        int size = this.f1316k.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (c0199p == ((C0188i) this.f1316k.get(i2)).f1302b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.f1316k.size()) {
            ((C0188i) this.f1316k.get(i3)).f1302b.m2936c(false);
        }
        C0188i c0188i = (C0188i) this.f1316k.remove(i2);
        c0188i.f1302b.m2918u(this);
        if (this.f1308C) {
            C0261i2 c0261i2 = c0188i.f1301a;
            c0261i2.getClass();
            if (Build.VERSION.SDK_INT >= 23) {
                c0261i2.f1558D.setExitTransition(null);
            }
            c0188i.f1301a.f1558D.setAnimationStyle(0);
        }
        c0188i.f1301a.dismiss();
        int size2 = this.f1316k.size();
        if (size2 > 0) {
            i = ((C0188i) this.f1316k.get(size2 - 1)).f1303c;
        } else {
            i = AbstractC0605j0.m2241q(this.f1322q) == 1 ? 0 : 1;
        }
        this.f1324s = i;
        if (size2 != 0) {
            if (z) {
                ((C0188i) this.f1316k.get(0)).f1302b.m2936c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0177c0 interfaceC0177c0 = this.f1331z;
        if (interfaceC0177c0 != null) {
            interfaceC0177c0.mo2734a(c0199p, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1306A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1306A.removeGlobalOnLayoutListener(this.f1317l);
            }
            this.f1306A = null;
        }
        this.f1323r.removeOnAttachStateChangeListener(this.f1318m);
        this.f1307B.onDismiss();
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: b */
    public boolean mo2835b() {
        return this.f1316k.size() > 0 && ((C0188i) this.f1316k.get(0)).f1301a.mo2835b();
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: d */
    public boolean mo647d() {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    public void dismiss() {
        int size = this.f1316k.size();
        if (size > 0) {
            C0188i[] c0188iArr = (C0188i[]) this.f1316k.toArray(new C0188i[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0188i c0188i = c0188iArr[i];
                if (c0188i.f1301a.mo2835b()) {
                    c0188i.f1301a.dismiss();
                }
            }
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: e */
    public Parcelable mo646e() {
        return null;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: f */
    public void mo2833f() {
        if (mo2835b()) {
            return;
        }
        for (C0199p c0199p : this.f1315j) {
            m2945y(c0199p);
        }
        this.f1315j.clear();
        View view = this.f1322q;
        this.f1323r = view;
        if (view != null) {
            boolean z = this.f1306A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1306A = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1317l);
            }
            this.f1323r.addOnAttachStateChangeListener(this.f1318m);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: h */
    public void mo644h(Parcelable parcelable) {
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: k */
    public ListView mo2830k() {
        if (this.f1316k.isEmpty()) {
            return null;
        }
        List list = this.f1316k;
        return ((C0188i) list.get(list.size() - 1)).f1301a.f1561g;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: l */
    public void mo2762l(InterfaceC0177c0 interfaceC0177c0) {
        this.f1331z = interfaceC0177c0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: m */
    public boolean mo641m(SubMenuC0195l0 subMenuC0195l0) {
        for (C0188i c0188i : this.f1316k) {
            if (subMenuC0195l0 == c0188i.f1302b) {
                c0188i.f1301a.f1561g.requestFocus();
                return true;
            }
        }
        if (subMenuC0195l0.hasVisibleItems()) {
            subMenuC0195l0.m2937b(this, this.f1309d);
            if (mo2835b()) {
                m2945y(subMenuC0195l0);
            } else {
                this.f1315j.add(subMenuC0195l0);
            }
            InterfaceC0177c0 interfaceC0177c0 = this.f1331z;
            if (interfaceC0177c0 != null) {
                interfaceC0177c0.mo2733b(subMenuC0195l0);
            }
            return true;
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: n */
    public void mo640n(boolean z) {
        for (C0188i c0188i : this.f1316k) {
            ListAdapter adapter = c0188i.f1301a.f1561g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0196m) adapter).notifyDataSetChanged();
        }
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: o */
    public void mo2894o(C0199p c0199p) {
        c0199p.m2937b(this, this.f1309d);
        if (mo2835b()) {
            m2945y(c0199p);
        } else {
            this.f1315j.add(c0199p);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0188i c0188i;
        int size = this.f1316k.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0188i = null;
                break;
            }
            c0188i = (C0188i) this.f1316k.get(i);
            if (!c0188i.f1301a.mo2835b()) {
                break;
            }
            i++;
        }
        if (c0188i != null) {
            c0188i.f1302b.m2936c(false);
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
        if (this.f1322q != view) {
            this.f1322q = view;
            this.f1321p = AbstractC0022t.m3460z(this.f1320o, AbstractC0605j0.m2241q(view));
        }
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: r */
    public void mo2891r(boolean z) {
        this.f1329x = z;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: s */
    public void mo2890s(int i) {
        if (this.f1320o != i) {
            this.f1320o = i;
            this.f1321p = AbstractC0022t.m3460z(i, AbstractC0605j0.m2241q(this.f1322q));
        }
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: t */
    public void mo2889t(int i) {
        this.f1325t = true;
        this.f1327v = i;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: u */
    public void mo2888u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1307B = onDismissListener;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: v */
    public void mo2887v(boolean z) {
        this.f1330y = z;
    }

    @Override // p010b.p016c.p024p.p025m.AbstractC0209z
    /* renamed from: w */
    public void mo2886w(int i) {
        this.f1326u = true;
        this.f1328w = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2945y(C0199p c0199p) {
        C0188i c0188i;
        int i;
        int i2;
        int i3;
        MenuItem menuItem;
        C0196m c0196m;
        int i4;
        int firstVisiblePosition;
        LayoutInflater from = LayoutInflater.from(this.f1309d);
        C0196m c0196m2 = new C0196m(c0199p, from, this.f1313h, f1305c);
        if (!mo2835b() && this.f1329x) {
            c0196m2.f1367d = true;
        } else if (mo2835b()) {
            c0196m2.f1367d = AbstractC0209z.m2885x(c0199p);
        }
        View view = null;
        int m2893p = AbstractC0209z.m2893p(c0196m2, null, this.f1309d, this.f1310e);
        C0261i2 c0261i2 = new C0261i2(this.f1309d, null, this.f1311f, this.f1312g);
        c0261i2.f1601F = this.f1319n;
        c0261i2.f1575u = this;
        c0261i2.f1558D.setOnDismissListener(this);
        c0261i2.f1574t = this.f1322q;
        c0261i2.f1570p = this.f1321p;
        c0261i2.m2826s(true);
        c0261i2.f1558D.setInputMethodMode(2);
        c0261i2.mo2697o(c0196m2);
        c0261i2.m2827r(m2893p);
        c0261i2.f1570p = this.f1321p;
        if (this.f1316k.size() > 0) {
            List list = this.f1316k;
            c0188i = (C0188i) list.get(list.size() - 1);
            C0199p c0199p2 = c0188i.f1302b;
            int size = c0199p2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = c0199p2.getItem(i5);
                if (menuItem.hasSubMenu() && c0199p == menuItem.getSubMenu()) {
                    break;
                }
                i5++;
            }
            if (menuItem != null) {
                C0305r1 c0305r1 = c0188i.f1301a.f1561g;
                ListAdapter adapter = c0305r1.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    c0196m = (C0196m) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0196m = (C0196m) adapter;
                    i4 = 0;
                }
                int count = c0196m.getCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (menuItem == c0196m.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 != -1 && (firstVisiblePosition = (i6 + i4) - c0305r1.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0305r1.getChildCount()) {
                    view = c0305r1.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    Method method = C0261i2.f1600E;
                    if (method != null) {
                        try {
                            method.invoke(c0261i2.f1558D, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    c0261i2.f1558D.setTouchModal(false);
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 23) {
                    c0261i2.f1558D.setEnterTransition(null);
                }
                List list2 = this.f1316k;
                C0305r1 c0305r12 = ((C0188i) list2.get(list2.size() - 1)).f1301a.f1561g;
                int[] iArr = new int[2];
                c0305r12.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f1323r.getWindowVisibleDisplayFrame(rect);
                int i8 = (this.f1324s != 1 ? iArr[0] - m2893p >= 0 : (c0305r12.getWidth() + iArr[0]) + m2893p > rect.right) ? 0 : 1;
                boolean z = i8 == 1;
                this.f1324s = i8;
                if (i7 >= 26) {
                    c0261i2.f1574t = view;
                    i2 = 0;
                    i = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f1322q.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f1321p & 7) == 5) {
                        iArr2[0] = this.f1322q.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i = iArr3[0] - iArr2[0];
                    i2 = iArr3[1] - iArr2[1];
                }
                if ((this.f1321p & 5) == 5) {
                    if (!z) {
                        m2893p = view.getWidth();
                        i3 = i - m2893p;
                    }
                    i3 = i + m2893p;
                } else {
                    if (z) {
                        m2893p = view.getWidth();
                        i3 = i + m2893p;
                    }
                    i3 = i - m2893p;
                }
                c0261i2.f1564j = i3;
                c0261i2.f1569o = true;
                c0261i2.f1568n = true;
                c0261i2.m2828n(i2);
            } else {
                if (this.f1325t) {
                    c0261i2.f1564j = this.f1327v;
                }
                if (this.f1326u) {
                    c0261i2.m2828n(this.f1328w);
                }
                Rect rect2 = this.f1441b;
                c0261i2.f1556B = rect2 != null ? new Rect(rect2) : null;
            }
            this.f1316k.add(new C0188i(c0261i2, c0199p, this.f1324s));
            c0261i2.mo2833f();
            C0305r1 c0305r13 = c0261i2.f1561g;
            c0305r13.setOnKeyListener(this);
            if (c0188i == null || !this.f1330y || c0199p.f1384n == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(AbstractC0081g.abc_popup_menu_header_item_layout, (ViewGroup) c0305r13, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c0199p.f1384n);
            c0305r13.addHeaderView(frameLayout, null, false);
            c0261i2.mo2833f();
            return;
        }
        c0188i = null;
        view = null;
        if (view == null) {
        }
        this.f1316k.add(new C0188i(c0261i2, c0199p, this.f1324s));
        c0261i2.mo2833f();
        C0305r1 c0305r132 = c0261i2.f1561g;
        c0305r132.setOnKeyListener(this);
        if (c0188i == null) {
        }
    }
}