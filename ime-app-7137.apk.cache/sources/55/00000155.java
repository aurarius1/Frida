package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: b.c.p.m.z */
/* loaded from: classes.dex */
public abstract class AbstractC0209z implements InterfaceC0187h0, InterfaceC0179d0, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f1441b;

    /* renamed from: p */
    public static int m2893p(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C0196m c0196m = (C0196m) listAdapter;
        int count = c0196m.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c0196m.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0196m.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: x */
    public static boolean m2885x(C0199p c0199p) {
        int size = c0199p.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0199p.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: c */
    public int mo648c() {
        return 0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: g */
    public void mo645g(Context context, C0199p c0199p) {
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: i */
    public boolean mo643i(C0199p c0199p, C0202s c0202s) {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: j */
    public boolean mo642j(C0199p c0199p, C0202s c0202s) {
        return false;
    }

    /* renamed from: o */
    public abstract void mo2894o(C0199p c0199p);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0196m) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0196m) listAdapter).f1365b.m2920s((MenuItem) listAdapter.getItem(i), this, (this instanceof View$OnKeyListenerC0190j) ^ true ? 0 : 4);
    }

    /* renamed from: q */
    public abstract void mo2892q(View view);

    /* renamed from: r */
    public abstract void mo2891r(boolean z);

    /* renamed from: s */
    public abstract void mo2890s(int i);

    /* renamed from: t */
    public abstract void mo2889t(int i);

    /* renamed from: u */
    public abstract void mo2888u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo2887v(boolean z);

    /* renamed from: w */
    public abstract void mo2886w(int i);
}