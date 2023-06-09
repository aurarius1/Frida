package p093c.p097b.p108i0.p110p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p010b.p046j.p058l.C0604j;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p083u.AbstractC0911b;
import p010b.p083u.p084e.C0927d0;
import p010b.p083u.p084e.C0947i0;
import p010b.p083u.p084e.C0959l0;
import p010b.p083u.p084e.InterfaceC0992t1;
import p093c.p097b.p108i0.p110p.p111a2.View$OnClickListenerC1265a;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1430h;
import p093c.p097b.p116p.AbstractC1431i;
import p093c.p097b.p116p.AbstractC1432j;

/* renamed from: c.b.i0.p.b1 */
/* loaded from: classes.dex */
public abstract class AbstractC1268b1 extends AbstractComponentCallbacksC0763z {

    /* renamed from: X */
    public final String f4466X;

    /* renamed from: Y */
    public final int f4467Y;

    /* renamed from: Z */
    public final boolean f4468Z;

    /* renamed from: a0 */
    public final boolean f4469a0;

    /* renamed from: b0 */
    public final boolean f4470b0;

    /* renamed from: c0 */
    public AbstractC1432j f4471c0;

    /* renamed from: e0 */
    public final C0959l0 f4473e0;

    /* renamed from: f0 */
    public RecyclerView f4474f0;

    /* renamed from: g0 */
    public DemoAnyKeyboardView f4475g0;

    /* renamed from: W */
    public final Set f4465W = new HashSet();

    /* renamed from: d0 */
    public final List f4472d0 = new ArrayList();

    /* renamed from: h0 */
    public int f4476h0 = 2;

    public AbstractC1268b1(String str, int i, boolean z, boolean z2, boolean z3, int i2) {
        if (z && i2 != 0) {
            throw new IllegalStateException("Does not support drag operations (and order) with a single selection list");
        }
        boolean z4 = false;
        this.f4473e0 = new C0959l0(new C1379w0(this, i2, 0));
        this.f4466X = str;
        this.f4468Z = z;
        this.f4469a0 = z2;
        this.f4470b0 = z3;
        if (z2 && !z) {
            throw new IllegalStateException("only supporting simulated-typing in single-selection setup!");
        }
        this.f4467Y = i;
        m1897I0((z3 || mo1118T0() != 0) ? true : true);
    }

    /* renamed from: Q0 */
    public abstract void mo1121Q0(AbstractC1427e abstractC1427e, DemoAnyKeyboardView demoAnyKeyboardView);

    /* renamed from: R0 */
    public abstract AbstractC1432j mo1120R0();

    /* renamed from: S0 */
    public abstract String mo1119S0();

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        AbstractC1432j mo1120R0 = mo1120R0();
        this.f4471c0 = mo1120R0;
        boolean z = this.f4468Z;
        if (z && !(mo1120R0 instanceof AbstractC1431i)) {
            throw new IllegalStateException("In single-selection state, factor must be SingleAddOnsFactory!");
        }
        if (!z && !(mo1120R0 instanceof AbstractC1430h)) {
            throw new IllegalStateException("In multi-selection state, factor must be MultipleAddOnsFactory!");
        }
        this.f4476h0 = m1843z().getInteger(R.integer.add_on_items_columns);
    }

    /* renamed from: T0 */
    public abstract int mo1118T0();

    /* renamed from: U0 */
    public void mo1117U0() {
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: W */
    public void mo1110W(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.add_on_selector_menu, menu);
        menu.findItem(R.id.add_on_market_search_menu_option).setVisible(mo1118T0() != 0);
        menu.findItem(R.id.tweaks_menu_option).setVisible(this.f4470b0);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.f4468Z ? R.layout.add_on_browser_single_selection_layout : R.layout.add_on_browser_multiple_selection_layout, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: g0 */
    public boolean mo1109g0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.add_on_market_search_menu_option) {
            View$OnClickListenerC1265a.m1137a(m1866k(), mo1119S0());
            return true;
        } else if (itemId != R.id.tweaks_menu_option) {
            return false;
        } else {
            mo1117U0();
            return true;
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        this.f4472d0.clear();
        this.f4472d0.addAll(this.f4471c0.m1059e());
        this.f4465W.clear();
        this.f4465W.addAll(this.f4471c0.m1056h());
        if (this.f4475g0 != null) {
            mo1121Q0(this.f4471c0.m1058f(), this.f4475g0);
        }
        this.f4472d0.size();
        this.f4465W.size();
        this.f4474f0.getAdapter().f3589a.m1680b();
        this.f4474f0.getAdapter().f3589a.m1680b();
        MainSettingsActivity.m369y(this, m1908D(this.f4467Y));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        Context applicationContext = m1872h().getApplicationContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f4474f0 = recyclerView;
        recyclerView.setHasFixedSize(false);
        RecyclerView recyclerView2 = this.f4474f0;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(applicationContext, this.f4476h0, 1, false);
        gridLayoutManager.f679M = new C1382x0(this);
        recyclerView2.setLayoutManager(gridLayoutManager);
        this.f4474f0.setAdapter(new C1388z0(this));
        C0959l0 c0959l0 = this.f4473e0;
        RecyclerView recyclerView3 = this.f4474f0;
        RecyclerView recyclerView4 = c0959l0.f3690r;
        if (recyclerView4 != recyclerView3) {
            if (recyclerView4 != null) {
                recyclerView4.m3163f0(c0959l0);
                RecyclerView recyclerView5 = c0959l0.f3690r;
                InterfaceC0992t1 interfaceC0992t1 = c0959l0.f3670B;
                recyclerView5.f708A.remove(interfaceC0992t1);
                if (recyclerView5.f710B == interfaceC0992t1) {
                    recyclerView5.f710B = null;
                }
                List list = c0959l0.f3690r.f733N;
                if (list != null) {
                    list.remove(c0959l0);
                }
                for (int size = c0959l0.f3688p.size() - 1; size >= 0; size--) {
                    C0927d0 c0927d0 = (C0927d0) c0959l0.f3688p.get(0);
                    c0927d0.f3559g.cancel();
                    c0959l0.f3685m.m1640a(c0959l0.f3690r, c0927d0.f3557e);
                }
                c0959l0.f3688p.clear();
                c0959l0.f3696x = null;
                c0959l0.f3697y = -1;
                VelocityTracker velocityTracker = c0959l0.f3692t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    c0959l0.f3692t = null;
                }
                C0947i0 c0947i0 = c0959l0.f3669A;
                if (c0947i0 != null) {
                    c0947i0.f3634a = false;
                    c0959l0.f3669A = null;
                }
                if (c0959l0.f3698z != null) {
                    c0959l0.f3698z = null;
                }
            }
            c0959l0.f3690r = recyclerView3;
            if (recyclerView3 != null) {
                Resources resources = recyclerView3.getResources();
                c0959l0.f3678f = resources.getDimension(AbstractC0911b.item_touch_helper_swipe_escape_velocity);
                c0959l0.f3679g = resources.getDimension(AbstractC0911b.item_touch_helper_swipe_escape_max_velocity);
                c0959l0.f3689q = ViewConfiguration.get(c0959l0.f3690r.getContext()).getScaledTouchSlop();
                c0959l0.f3690r.m3162g(c0959l0);
                c0959l0.f3690r.f708A.add(c0959l0.f3670B);
                RecyclerView recyclerView6 = c0959l0.f3690r;
                if (recyclerView6.f733N == null) {
                    recyclerView6.f733N = new ArrayList();
                }
                recyclerView6.f733N.add(c0959l0);
                c0959l0.f3669A = new C0947i0(c0959l0);
                c0959l0.f3698z = new C0604j(c0959l0.f3690r.getContext(), c0959l0.f3669A);
            }
        }
        if (this.f4468Z) {
            DemoAnyKeyboardView demoAnyKeyboardView = (DemoAnyKeyboardView) view.findViewById(R.id.demo_keyboard_view);
            this.f4475g0 = demoAnyKeyboardView;
            if (this.f4469a0) {
                demoAnyKeyboardView.setSimulatedTypingText("welcome to anysoftkeyboard");
            }
        }
    }
}