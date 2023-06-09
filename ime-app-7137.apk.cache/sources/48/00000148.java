package p010b.p016c.p024p.p025m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: b.c.p.m.m */
/* loaded from: classes.dex */
public class C0196m extends BaseAdapter {

    /* renamed from: b */
    public C0199p f1365b;

    /* renamed from: c */
    public int f1366c = -1;

    /* renamed from: d */
    public boolean f1367d;

    /* renamed from: e */
    public final boolean f1368e;

    /* renamed from: f */
    public final LayoutInflater f1369f;

    /* renamed from: g */
    public final int f1370g;

    public C0196m(C0199p c0199p, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1368e = z;
        this.f1369f = layoutInflater;
        this.f1365b = c0199p;
        this.f1370g = i;
        m2941a();
    }

    /* renamed from: a */
    public void m2941a() {
        C0199p c0199p = this.f1365b;
        C0202s c0202s = c0199p.f1393w;
        if (c0202s != null) {
            c0199p.m2930i();
            ArrayList arrayList = c0199p.f1381k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0202s) arrayList.get(i)) == c0202s) {
                    this.f1366c = i;
                    return;
                }
            }
        }
        this.f1366c = -1;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.widget.Adapter
    /* renamed from: b */
    public C0202s getItem(int i) {
        ArrayList m2927l;
        if (this.f1368e) {
            C0199p c0199p = this.f1365b;
            c0199p.m2930i();
            m2927l = c0199p.f1381k;
        } else {
            m2927l = this.f1365b.m2927l();
        }
        int i2 = this.f1366c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0202s) m2927l.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList m2927l;
        if (this.f1368e) {
            C0199p c0199p = this.f1365b;
            c0199p.m2930i();
            m2927l = c0199p.f1381k;
        } else {
            m2927l = this.f1365b.m2927l();
        }
        int i = this.f1366c;
        int size = m2927l.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1369f.inflate(this.f1370g, viewGroup, false);
        }
        int i2 = getItem(i).f1405b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1365b.mo2926m() && i2 != (i3 >= 0 ? getItem(i3).f1405b : i2));
        InterfaceC0181e0 interfaceC0181e0 = (InterfaceC0181e0) view;
        if (this.f1367d) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0181e0.mo275d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m2941a();
        super.notifyDataSetChanged();
    }
}