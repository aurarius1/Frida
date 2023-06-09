package p010b.p016c.p017k;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: b.c.k.g */
/* loaded from: classes.dex */
public class C0101g implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ View f915a;

    /* renamed from: b */
    public final /* synthetic */ View f916b;

    public C0101g(C0117o c0117o, View view, View view2) {
        this.f915a = view;
        this.f916b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0117o.m3067c(absListView, this.f915a, this.f916b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}