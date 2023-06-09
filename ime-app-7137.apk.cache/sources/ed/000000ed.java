package p010b.p016c.p017k;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: b.c.k.i */
/* loaded from: classes.dex */
public class C0105i extends ArrayAdapter {

    /* renamed from: b */
    public final /* synthetic */ AlertController$RecycleListView f924b;

    /* renamed from: c */
    public final /* synthetic */ C0111l f925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105i(C0111l c0111l, Context context, int i, int i2, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, i2, charSequenceArr);
        this.f925c = c0111l;
        this.f924b = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f925c.f955t;
        if (zArr != null && zArr[i]) {
            this.f924b.setItemChecked(i, true);
        }
        return view2;
    }
}