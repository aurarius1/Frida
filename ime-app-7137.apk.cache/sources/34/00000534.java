package p093c.p097b.p102d0.p103k;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anysoftkeyboard.keyboards.views.QuickKeysKeyboardView;
import com.anysoftkeyboard.p180ui.ScrollViewWithDisable;
import com.anysoftkeyboard.p180ui.ViewPagerWithDisable;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p010b.p091z.p092a.AbstractC1110a;
import p093c.p097b.p102d0.C1185b;
import p093c.p097b.p102d0.C1188e;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p116p.C1433k;
import p093c.p097b.p130z.C1689p0;
import p093c.p097b.p130z.C1763u;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.InterfaceC1748t0;

/* renamed from: c.b.d0.k.g */
/* loaded from: classes.dex */
public class C1200g extends AbstractC1110a {

    /* renamed from: c */
    public final Context f4349c;

    /* renamed from: d */
    public final InterfaceC1748t0 f4350d;

    /* renamed from: e */
    public final LayoutInflater f4351e;

    /* renamed from: f */
    public final C1763u[] f4352f;

    /* renamed from: g */
    public final boolean[] f4353g;

    /* renamed from: h */
    public final C1188e[] f4354h;

    /* renamed from: i */
    public final C1433k f4355i;

    /* renamed from: j */
    public final ViewPagerWithDisable f4356j;

    /* renamed from: k */
    public final C1197d f4357k;

    /* renamed from: l */
    public final C1196c f4358l;

    /* renamed from: m */
    public final C1237f f4359m;

    /* renamed from: n */
    public int f4360n;

    public C1200g(Context context, ViewPagerWithDisable viewPagerWithDisable, List list, InterfaceC1748t0 interfaceC1748t0, C1197d c1197d, C1196c c1196c, C1237f c1237f, int i) {
        this.f4356j = viewPagerWithDisable;
        this.f4355i = new C1433k(context, context);
        this.f4349c = context;
        this.f4350d = interfaceC1748t0;
        C1188e[] c1188eArr = (C1188e[]) list.toArray(new C1188e[0]);
        this.f4354h = c1188eArr;
        this.f4352f = new C1763u[c1188eArr.length];
        this.f4353g = new boolean[c1188eArr.length];
        this.f4351e = LayoutInflater.from(context);
        this.f4357k = c1197d;
        this.f4358l = c1196c;
        this.f4359m = c1237f;
        this.f4360n = i;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: a */
    public void mo1095a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: c */
    public int mo1093c() {
        return this.f4352f.length;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: e */
    public CharSequence mo1147e(int i) {
        C1188e c1188e = this.f4354h[i];
        return this.f4349c.getResources().getString(R.string.quick_text_tab_title_template, c1188e.f4326o, c1188e.f4706b);
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: f */
    public Object mo1091f(ViewGroup viewGroup, int i) {
        View inflate = this.f4351e.inflate(R.layout.quick_text_popup_autorowkeyboard_view, viewGroup, false);
        ScrollViewWithDisable scrollViewWithDisable = (ScrollViewWithDisable) inflate.findViewById(R.id.scroll_root_for_quick_test_keyboard);
        scrollViewWithDisable.setPadding(scrollViewWithDisable.getPaddingLeft(), scrollViewWithDisable.getPaddingTop(), scrollViewWithDisable.getPaddingRight(), scrollViewWithDisable.getPaddingBottom() + this.f4360n);
        viewGroup.addView(inflate);
        QuickKeysKeyboardView quickKeysKeyboardView = (QuickKeysKeyboardView) inflate.findViewById(R.id.keys_container);
        quickKeysKeyboardView.setKeyboardTheme(this.f4359m);
        quickKeysKeyboardView.setOnPopupShownListener(new C1199f(this.f4356j, scrollViewWithDisable));
        quickKeysKeyboardView.setOnKeyboardActionListener(this.f4350d);
        C1188e c1188e = this.f4354h[i];
        C1763u c1763u = this.f4352f[i];
        if (c1763u == null || i == 0) {
            if (c1188e.m1151f()) {
                c1763u = new C1763u(c1188e, this.f4349c, c1188e.f4322k, quickKeysKeyboardView.getThemedKeyboardDimens(), c1188e.f4706b, this.f4357k.m1148a(), this.f4358l.m1149a());
            } else {
                c1763u = new C1689p0(this.f4355i, this.f4349c, quickKeysKeyboardView.getThemedKeyboardDimens(), c1188e.mo1155b(), c1188e.mo1154c(), c1188e.f4706b);
            }
            this.f4352f[i] = c1763u;
            int mo862e = quickKeysKeyboardView.getThemedKeyboardDimens().mo862e();
            this.f4353g[i] = c1763u.mo831g() > mo862e || (c1188e instanceof C1185b);
            if (this.f4353g[i]) {
                int i2 = 0;
                int i3 = 0;
                for (Key key : c1763u.f5147q) {
                    key.y = i2;
                    int i4 = key.x - i3;
                    key.x = i4;
                    if (key.width + i4 > mo862e) {
                        i2 += key.height;
                        i3 += i4;
                        key.y = i2;
                        key.x = 0;
                    }
                }
                c1763u.m923k();
            }
        }
        quickKeysKeyboardView.setKeyboard(c1763u);
        return inflate;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: g */
    public boolean mo1090g(View view, Object obj) {
        return view == obj;
    }
}