package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;

/* renamed from: b.c.p.m.l */
/* loaded from: classes.dex */
public class C0194l implements InterfaceC0179d0, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f1356b;

    /* renamed from: c */
    public LayoutInflater f1357c;

    /* renamed from: d */
    public C0199p f1358d;

    /* renamed from: e */
    public ExpandedMenuView f1359e;

    /* renamed from: f */
    public int f1360f;

    /* renamed from: g */
    public InterfaceC0177c0 f1361g;

    /* renamed from: h */
    public C0192k f1362h;

    public C0194l(Context context, int i) {
        this.f1360f = i;
        this.f1356b = context;
        this.f1357c = LayoutInflater.from(context);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: a */
    public void mo649a(C0199p c0199p, boolean z) {
        InterfaceC0177c0 interfaceC0177c0 = this.f1361g;
        if (interfaceC0177c0 != null) {
            interfaceC0177c0.mo2734a(c0199p, z);
        }
    }

    /* renamed from: b */
    public ListAdapter m2942b() {
        if (this.f1362h == null) {
            this.f1362h = new C0192k(this);
        }
        return this.f1362h;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: c */
    public int mo648c() {
        return 0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: d */
    public boolean mo647d() {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: e */
    public Parcelable mo646e() {
        if (this.f1359e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1359e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: g */
    public void mo645g(Context context, C0199p c0199p) {
        if (this.f1356b != null) {
            this.f1356b = context;
            if (this.f1357c == null) {
                this.f1357c = LayoutInflater.from(context);
            }
        }
        this.f1358d = c0199p;
        C0192k c0192k = this.f1362h;
        if (c0192k != null) {
            c0192k.notifyDataSetChanged();
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: h */
    public void mo644h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1359e.restoreHierarchyState(sparseParcelableArray);
        }
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

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: l */
    public void mo2762l(InterfaceC0177c0 interfaceC0177c0) {
        this.f1361g = interfaceC0177c0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: m */
    public boolean mo641m(SubMenuC0195l0 subMenuC0195l0) {
        if (subMenuC0195l0.hasVisibleItems()) {
            DialogInterface$OnKeyListenerC0200q dialogInterface$OnKeyListenerC0200q = new DialogInterface$OnKeyListenerC0200q(subMenuC0195l0);
            C0119p c0119p = new C0119p(subMenuC0195l0.f1372b);
            C0194l c0194l = new C0194l(c0119p.f1026a.f936a, AbstractC0081g.abc_list_menu_item_layout);
            dialogInterface$OnKeyListenerC0200q.f1398d = c0194l;
            c0194l.f1361g = dialogInterface$OnKeyListenerC0200q;
            C0199p c0199p = dialogInterface$OnKeyListenerC0200q.f1396b;
            c0199p.m2937b(c0194l, c0199p.f1372b);
            ListAdapter m2942b = dialogInterface$OnKeyListenerC0200q.f1398d.m2942b();
            C0111l c0111l = c0119p.f1026a;
            c0111l.f952q = m2942b;
            c0111l.f953r = dialogInterface$OnKeyListenerC0200q;
            View view = subMenuC0195l0.f1386p;
            if (view != null) {
                c0111l.f941f = view;
            } else {
                c0111l.f939d = subMenuC0195l0.f1385o;
                c0111l.f940e = subMenuC0195l0.f1384n;
            }
            c0111l.f950o = dialogInterface$OnKeyListenerC0200q;
            DialogInterfaceC0121q m3063a = c0119p.m3063a();
            dialogInterface$OnKeyListenerC0200q.f1397c = m3063a;
            m3063a.setOnDismissListener(dialogInterface$OnKeyListenerC0200q);
            WindowManager.LayoutParams attributes = dialogInterface$OnKeyListenerC0200q.f1397c.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            dialogInterface$OnKeyListenerC0200q.f1397c.show();
            InterfaceC0177c0 interfaceC0177c0 = this.f1361g;
            if (interfaceC0177c0 != null) {
                interfaceC0177c0.mo2733b(subMenuC0195l0);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: n */
    public void mo640n(boolean z) {
        C0192k c0192k = this.f1362h;
        if (c0192k != null) {
            c0192k.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1358d.m2920s(this.f1362h.getItem(i), this, 0);
    }
}