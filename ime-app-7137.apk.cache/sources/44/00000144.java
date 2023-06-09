package p010b.p016c.p024p.p025m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: b.c.p.m.k */
/* loaded from: classes.dex */
public class C0192k extends BaseAdapter {

    /* renamed from: b */
    public int f1333b = -1;

    /* renamed from: c */
    public final /* synthetic */ C0194l f1334c;

    public C0192k(C0194l c0194l) {
        this.f1334c = c0194l;
        m2944a();
    }

    /* renamed from: a */
    public void m2944a() {
        C0199p c0199p = this.f1334c.f1358d;
        C0202s c0202s = c0199p.f1393w;
        if (c0202s != null) {
            c0199p.m2930i();
            ArrayList arrayList = c0199p.f1381k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0202s) arrayList.get(i)) == c0202s) {
                    this.f1333b = i;
                    return;
                }
            }
        }
        this.f1333b = -1;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.widget.Adapter
    /* renamed from: b */
    public C0202s getItem(int i) {
        C0199p c0199p = this.f1334c.f1358d;
        c0199p.m2930i();
        ArrayList arrayList = c0199p.f1381k;
        this.f1334c.getClass();
        int i2 = i + 0;
        int i3 = this.f1333b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0202s) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        C0199p c0199p = this.f1334c.f1358d;
        c0199p.m2930i();
        int size = c0199p.f1381k.size();
        this.f1334c.getClass();
        int i = size + 0;
        return this.f1333b < 0 ? i : i - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C0194l c0194l = this.f1334c;
            view = c0194l.f1357c.inflate(c0194l.f1360f, viewGroup, false);
        }
        ((InterfaceC0181e0) view).mo275d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m2944a();
        super.notifyDataSetChanged();
    }
}