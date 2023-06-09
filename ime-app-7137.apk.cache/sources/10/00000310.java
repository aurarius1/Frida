package p010b.p062k.p063a;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p010b.p016c.p026q.View$OnClickListenerC0272k3;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.k.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0652c extends BaseAdapter implements Filterable, InterfaceC0653d {

    /* renamed from: b */
    public boolean f2847b;

    /* renamed from: c */
    public boolean f2848c;

    /* renamed from: d */
    public Cursor f2849d;

    /* renamed from: e */
    public Context f2850e;

    /* renamed from: f */
    public int f2851f;

    /* renamed from: g */
    public C0650a f2852g;

    /* renamed from: h */
    public DataSetObserver f2853h;

    /* renamed from: i */
    public C0654e f2854i;

    public AbstractC0652c(Context context, Cursor cursor, boolean z) {
        C0651b c0651b;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f2848c = true;
        } else {
            this.f2848c = false;
        }
        boolean z2 = cursor != null;
        this.f2849d = cursor;
        this.f2847b = z2;
        this.f2850e = context;
        this.f2851f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f2852g = new C0650a(this);
            c0651b = new C0651b(this);
        } else {
            c0651b = null;
            this.f2852g = null;
        }
        this.f2853h = c0651b;
        if (z2) {
            C0650a c0650a = this.f2852g;
            if (c0650a != null) {
                cursor.registerContentObserver(c0650a);
            }
            DataSetObserver dataSetObserver = this.f2853h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2160a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public void mo2159b(Cursor cursor) {
        Cursor cursor2 = this.f2849d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0650a c0650a = this.f2852g;
                if (c0650a != null) {
                    cursor2.unregisterContentObserver(c0650a);
                }
                DataSetObserver dataSetObserver = this.f2853h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2849d = cursor;
            if (cursor != null) {
                C0650a c0650a2 = this.f2852g;
                if (c0650a2 != null) {
                    cursor.registerContentObserver(c0650a2);
                }
                DataSetObserver dataSetObserver2 = this.f2853h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2851f = cursor.getColumnIndexOrThrow("_id");
                this.f2847b = true;
                notifyDataSetChanged();
            } else {
                this.f2851f = -1;
                this.f2847b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract CharSequence mo2158c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo2157d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2847b || (cursor = this.f2849d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f2847b) {
            this.f2849d.moveToPosition(i);
            if (view == null) {
                View$OnClickListenerC0272k3 view$OnClickListenerC0272k3 = (View$OnClickListenerC0272k3) this;
                view = view$OnClickListenerC0272k3.f1640m.inflate(view$OnClickListenerC0272k3.f1639l, viewGroup, false);
            }
            mo2160a(view, this.f2850e, this.f2849d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2854i == null) {
            this.f2854i = new C0654e(this);
        }
        return this.f2854i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f2847b || (cursor = this.f2849d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f2849d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f2847b && (cursor = this.f2849d) != null && cursor.moveToPosition(i)) {
            return this.f2849d.getLong(this.f2851f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f2847b) {
            if (this.f2849d.moveToPosition(i)) {
                if (view == null) {
                    view = mo2157d(this.f2850e, this.f2849d, viewGroup);
                }
                mo2160a(view, this.f2850e, this.f2849d);
                return view;
            }
            throw new IllegalStateException(AbstractC1124a.m1193c("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}