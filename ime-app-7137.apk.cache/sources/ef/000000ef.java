package p010b.p016c.p017k;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: b.c.k.j */
/* loaded from: classes.dex */
public class C0107j implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0117o f928b;

    /* renamed from: c */
    public final /* synthetic */ C0111l f929c;

    public C0107j(C0111l c0111l, C0117o c0117o) {
        this.f929c = c0111l;
        this.f928b = c0117o;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f929c.f953r.onClick(this.f928b.f1000b, i);
        if (this.f929c.f957v) {
            return;
        }
        this.f928b.f1000b.dismiss();
    }
}