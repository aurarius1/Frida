package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.p024p.p025m.AbstractC0209z;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.C0203t;
import p010b.p016c.p024p.p025m.InterfaceC0177c0;
import p010b.p016c.p024p.p025m.InterfaceC0179d0;
import p010b.p016c.p024p.p025m.InterfaceC0181e0;
import p010b.p016c.p024p.p025m.InterfaceC0183f0;
import p010b.p016c.p024p.p025m.SubMenuC0195l0;

/* renamed from: b.c.q.q */
/* loaded from: classes.dex */
public class C0298q implements InterfaceC0179d0 {

    /* renamed from: A */
    public int f1702A;

    /* renamed from: b */
    public Context f1703b;

    /* renamed from: c */
    public Context f1704c;

    /* renamed from: d */
    public C0199p f1705d;

    /* renamed from: e */
    public LayoutInflater f1706e;

    /* renamed from: f */
    public InterfaceC0177c0 f1707f;

    /* renamed from: g */
    public int f1708g;

    /* renamed from: h */
    public int f1709h;

    /* renamed from: i */
    public InterfaceC0183f0 f1710i;

    /* renamed from: j */
    public int f1711j;

    /* renamed from: k */
    public C0278m f1712k;

    /* renamed from: l */
    public Drawable f1713l;

    /* renamed from: m */
    public boolean f1714m;

    /* renamed from: n */
    public boolean f1715n;

    /* renamed from: o */
    public boolean f1716o;

    /* renamed from: p */
    public int f1717p;

    /* renamed from: q */
    public int f1718q;

    /* renamed from: r */
    public int f1719r;

    /* renamed from: s */
    public boolean f1720s;

    /* renamed from: t */
    public int f1721t;

    /* renamed from: u */
    public final SparseBooleanArray f1722u;

    /* renamed from: v */
    public C0283n f1723v;

    /* renamed from: w */
    public C0258i f1724w;

    /* renamed from: x */
    public RunnableC0268k f1725x;

    /* renamed from: y */
    public C0263j f1726y;

    /* renamed from: z */
    public final C0288o f1727z;

    public C0298q(Context context) {
        int i = AbstractC0081g.abc_action_menu_layout;
        int i2 = AbstractC0081g.abc_action_menu_item_layout;
        this.f1703b = context;
        this.f1706e = LayoutInflater.from(context);
        this.f1708g = i;
        this.f1709h = i2;
        this.f1722u = new SparseBooleanArray();
        this.f1727z = new C0288o(this);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: a */
    public void mo649a(C0199p c0199p, boolean z) {
        m2765b();
        InterfaceC0177c0 interfaceC0177c0 = this.f1707f;
        if (interfaceC0177c0 != null) {
            interfaceC0177c0.mo2734a(c0199p, z);
        }
    }

    /* renamed from: b */
    public boolean m2765b() {
        return m2763k() | m2761o();
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: c */
    public int mo648c() {
        return this.f1711j;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: d */
    public boolean mo647d() {
        ArrayList arrayList;
        int i;
        int i2;
        boolean z;
        C0199p c0199p = this.f1705d;
        if (c0199p != null) {
            arrayList = c0199p.m2927l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.f1719r;
        int i4 = this.f1718q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1710i;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C0202s c0202s = (C0202s) arrayList.get(i5);
            int i8 = c0202s.f1428y;
            if ((i8 & 2) == 2) {
                i7++;
            } else if ((i8 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.f1720s && c0202s.f1402C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f1715n && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.f1722u;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0202s c0202s2 = (C0202s) arrayList.get(i10);
            int i12 = c0202s2.f1428y;
            if ((i12 & 2) == i2) {
                View m2764f = m2764f(c0202s2, null, viewGroup);
                m2764f.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m2764f.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = c0202s2.f1405b;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c0202s2.m2903l(z);
            } else if ((i12 & 1) == z) {
                int i14 = c0202s2.f1405b;
                boolean z3 = sparseBooleanArray.get(i14);
                boolean z4 = (i9 > 0 || z3) && i4 > 0;
                if (z4) {
                    View m2764f2 = m2764f(c0202s2, null, viewGroup);
                    m2764f2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = m2764f2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 &= i4 + i11 > 0;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z3) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i10; i15++) {
                        C0202s c0202s3 = (C0202s) arrayList.get(i15);
                        if (c0202s3.f1405b == i14) {
                            if (c0202s3.m2908g()) {
                                i9++;
                            }
                            c0202s3.m2903l(false);
                        }
                    }
                }
                if (z4) {
                    i9--;
                }
                c0202s2.m2903l(z4);
            } else {
                c0202s2.m2903l(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return true;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: e */
    public Parcelable mo646e() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f229b = this.f1702A;
        return actionMenuPresenter$SavedState;
    }

    /* renamed from: f */
    public View m2764f(C0202s c0202s, View view, ViewGroup viewGroup) {
        View actionView = c0202s.getActionView();
        if (actionView == null || c0202s.m2909f()) {
            InterfaceC0181e0 interfaceC0181e0 = view instanceof InterfaceC0181e0 ? (InterfaceC0181e0) view : (InterfaceC0181e0) this.f1706e.inflate(this.f1709h, viewGroup, false);
            interfaceC0181e0.mo275d(c0202s, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0181e0;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f1710i);
            if (this.f1726y == null) {
                this.f1726y = new C0263j(this);
            }
            actionMenuItemView.setPopupCallback(this.f1726y);
            actionView = (View) interfaceC0181e0;
        }
        actionView.setVisibility(c0202s.f1402C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo2714j(layoutParams));
        }
        return actionView;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: g */
    public void mo645g(Context context, C0199p c0199p) {
        this.f1704c = context;
        LayoutInflater.from(context);
        this.f1705d = c0199p;
        Resources resources = context.getResources();
        if (!this.f1716o) {
            this.f1715n = Build.VERSION.SDK_INT < 19 ? true ^ ViewConfiguration.get(context).hasPermanentMenuKey() : true;
        }
        int i = 2;
        this.f1717p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f1719r = i;
        int i4 = this.f1717p;
        if (this.f1715n) {
            if (this.f1712k == null) {
                C0278m c0278m = new C0278m(this, this.f1703b);
                this.f1712k = c0278m;
                if (this.f1714m) {
                    c0278m.setImageDrawable(this.f1713l);
                    this.f1713l = null;
                    this.f1714m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1712k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f1712k.getMeasuredWidth();
        } else {
            this.f1712k = null;
        }
        this.f1718q = i4;
        this.f1721t = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: h */
    public void mo644h(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i = ((ActionMenuPresenter$SavedState) parcelable).f229b) > 0 && (findItem = this.f1705d.findItem(i)) != null) {
            mo641m((SubMenuC0195l0) findItem.getSubMenu());
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo643i(C0199p c0199p, C0202s c0202s) {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo642j(C0199p c0199p, C0202s c0202s) {
        return false;
    }

    /* renamed from: k */
    public boolean m2763k() {
        InterfaceC0183f0 interfaceC0183f0;
        RunnableC0268k runnableC0268k = this.f1725x;
        if (runnableC0268k != null && (interfaceC0183f0 = this.f1710i) != null) {
            ((View) interfaceC0183f0).removeCallbacks(runnableC0268k);
            this.f1725x = null;
            return true;
        }
        C0283n c0283n = this.f1723v;
        if (c0283n != null) {
            if (c0283n.m2950b()) {
                c0283n.f1288j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: l */
    public void mo2762l(InterfaceC0177c0 interfaceC0177c0) {
        this.f1707f = interfaceC0177c0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: m */
    public boolean mo641m(SubMenuC0195l0 subMenuC0195l0) {
        boolean z = false;
        if (subMenuC0195l0.hasVisibleItems()) {
            SubMenuC0195l0 subMenuC0195l02 = subMenuC0195l0;
            while (true) {
                C0199p c0199p = subMenuC0195l02.f1364z;
                if (c0199p == this.f1705d) {
                    break;
                }
                subMenuC0195l02 = (SubMenuC0195l0) c0199p;
            }
            C0202s c0202s = subMenuC0195l02.f1363A;
            ViewGroup viewGroup = (ViewGroup) this.f1710i;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC0181e0) && ((InterfaceC0181e0) childAt).getItemData() == c0202s) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view == null) {
                return false;
            }
            this.f1702A = subMenuC0195l0.f1363A.f1404a;
            int size = subMenuC0195l0.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = subMenuC0195l0.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            C0258i c0258i = new C0258i(this, this.f1704c, subMenuC0195l0, view);
            this.f1724w = c0258i;
            c0258i.f1286h = z;
            AbstractC0209z abstractC0209z = c0258i.f1288j;
            if (abstractC0209z != null) {
                abstractC0209z.mo2891r(z);
            }
            if (this.f1724w.m2947f()) {
                InterfaceC0177c0 interfaceC0177c0 = this.f1707f;
                if (interfaceC0177c0 != null) {
                    interfaceC0177c0.mo2733b(subMenuC0195l0);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: n */
    public void mo640n(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f1710i;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C0199p c0199p = this.f1705d;
            if (c0199p != null) {
                c0199p.m2930i();
                ArrayList m2927l = this.f1705d.m2927l();
                int size = m2927l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0202s c0202s = (C0202s) m2927l.get(i2);
                    if (c0202s.m2908g()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0202s itemData = childAt instanceof InterfaceC0181e0 ? ((InterfaceC0181e0) childAt).getItemData() : null;
                        View m2764f = m2764f(c0202s, childAt, viewGroup);
                        if (c0202s != itemData) {
                            m2764f.setPressed(false);
                            m2764f.jumpDrawablesToCurrentState();
                        }
                        if (m2764f != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m2764f.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m2764f);
                            }
                            ((ViewGroup) this.f1710i).addView(m2764f, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1712k) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f1710i).requestLayout();
        C0199p c0199p2 = this.f1705d;
        if (c0199p2 != null) {
            c0199p2.m2930i();
            ArrayList arrayList2 = c0199p2.f1380j;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C0203t c0203t = ((C0202s) arrayList2.get(i3)).f1400A;
            }
        }
        C0199p c0199p3 = this.f1705d;
        if (c0199p3 != null) {
            c0199p3.m2930i();
            arrayList = c0199p3.f1381k;
        }
        if (this.f1715n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((C0202s) arrayList.get(0)).f1402C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        C0278m c0278m = this.f1712k;
        if (z3) {
            if (c0278m == null) {
                this.f1712k = new C0278m(this, this.f1703b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1712k.getParent();
            if (viewGroup3 != this.f1710i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1712k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1710i;
                C0278m c0278m2 = this.f1712k;
                C0313t mo2716h = actionMenuView.mo2716h();
                mo2716h.f1763a = true;
                actionMenuView.addView(c0278m2, mo2716h);
            }
        } else if (c0278m != null) {
            ViewParent parent = c0278m.getParent();
            InterfaceC0183f0 interfaceC0183f0 = this.f1710i;
            if (parent == interfaceC0183f0) {
                ((ViewGroup) interfaceC0183f0).removeView(this.f1712k);
            }
        }
        ((ActionMenuView) this.f1710i).setOverflowReserved(this.f1715n);
    }

    /* renamed from: o */
    public boolean m2761o() {
        C0258i c0258i = this.f1724w;
        if (c0258i != null) {
            if (c0258i.m2950b()) {
                c0258i.f1288j.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m2760p() {
        C0283n c0283n = this.f1723v;
        return c0283n != null && c0283n.m2950b();
    }

    /* renamed from: q */
    public boolean m2759q() {
        C0199p c0199p;
        if (!this.f1715n || m2760p() || (c0199p = this.f1705d) == null || this.f1710i == null || this.f1725x != null) {
            return false;
        }
        c0199p.m2930i();
        if (c0199p.f1381k.isEmpty()) {
            return false;
        }
        RunnableC0268k runnableC0268k = new RunnableC0268k(this, new C0283n(this, this.f1704c, this.f1705d, this.f1712k, true));
        this.f1725x = runnableC0268k;
        ((View) this.f1710i).post(runnableC0268k);
        return true;
    }
}