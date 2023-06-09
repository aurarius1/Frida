package p010b.p062k.p063a;

import android.database.Cursor;
import android.widget.Filter;
import p010b.p016c.p026q.View$OnClickListenerC0272k3;

/* renamed from: b.k.a.e */
/* loaded from: classes.dex */
public class C0654e extends Filter {

    /* renamed from: a */
    public InterfaceC0653d f2855a;

    public C0654e(InterfaceC0653d interfaceC0653d) {
        this.f2855a = interfaceC0653d;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((View$OnClickListenerC0272k3) this.f2855a).mo2158c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        View$OnClickListenerC0272k3 view$OnClickListenerC0272k3 = (View$OnClickListenerC0272k3) this.f2855a;
        view$OnClickListenerC0272k3.getClass();
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (view$OnClickListenerC0272k3.f1641n.getVisibility() == 0 && view$OnClickListenerC0272k3.f1641n.getWindowVisibility() == 0) {
            try {
                cursor = view$OnClickListenerC0272k3.m2796g(view$OnClickListenerC0272k3.f1642o, charSequence2, 50);
            } catch (RuntimeException unused) {
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        InterfaceC0653d interfaceC0653d = this.f2855a;
        Cursor cursor = ((AbstractC0652c) interfaceC0653d).f2849d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((View$OnClickListenerC0272k3) interfaceC0653d).mo2159b((Cursor) obj);
    }
}