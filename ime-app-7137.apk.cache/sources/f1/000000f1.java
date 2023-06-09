package p010b.p016c.p017k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: b.c.k.k */
/* loaded from: classes.dex */
public class C0109k implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController$RecycleListView f931b;

    /* renamed from: c */
    public final /* synthetic */ C0117o f932c;

    /* renamed from: d */
    public final /* synthetic */ C0111l f933d;

    public C0109k(C0111l c0111l, AlertController$RecycleListView alertController$RecycleListView, C0117o c0117o) {
        this.f933d = c0111l;
        this.f931b = alertController$RecycleListView;
        this.f932c = c0117o;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.f933d.f955t;
        if (zArr != null) {
            zArr[i] = this.f931b.isItemChecked(i);
        }
        this.f933d.f959x.onClick(this.f932c.f1000b, i, this.f931b.isItemChecked(i));
    }
}