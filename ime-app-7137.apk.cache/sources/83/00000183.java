package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p010b.p016c.p024p.p025m.C0196m;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;

/* renamed from: b.c.q.h2 */
/* loaded from: classes.dex */
public class C0255h2 extends C0305r1 {

    /* renamed from: o */
    public final int f1590o;

    /* renamed from: p */
    public final int f1591p;

    /* renamed from: q */
    public InterfaceC0249g2 f1592q;

    /* renamed from: r */
    public MenuItem f1593r;

    public C0255h2(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.f1590o = 22;
            this.f1591p = 21;
            return;
        }
        this.f1590o = 21;
        this.f1591p = 22;
    }

    @Override // p010b.p016c.p026q.C0305r1, android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        int pointToPosition;
        int i2;
        if (this.f1592q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                adapter = headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
            }
            C0196m c0196m = (C0196m) adapter;
            C0202s c0202s = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0196m.getCount()) {
                c0202s = c0196m.getItem(i2);
            }
            MenuItem menuItem = this.f1593r;
            if (menuItem != c0202s) {
                C0199p c0199p = c0196m.f1365b;
                if (menuItem != null) {
                    this.f1592q.mo2813h(c0199p, menuItem);
                }
                this.f1593r = c0202s;
                if (c0202s != null) {
                    this.f1592q.mo2814e(c0199p, c0202s);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f1590o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f1591p) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0196m) adapter).f1365b.m2936c(false);
            return true;
        }
    }

    public void setHoverListener(InterfaceC0249g2 interfaceC0249g2) {
        this.f1592q = interfaceC0249g2;
    }

    @Override // p010b.p016c.p026q.C0305r1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}