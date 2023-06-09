package p010b.p044i.p045d;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: b.i.d.d */
/* loaded from: classes.dex */
public class ViewGroup$OnHierarchyChangeListenerC0454d implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f2410a;

    public ViewGroup$OnHierarchyChangeListenerC0454d(CoordinatorLayout coordinatorLayout) {
        this.f2410a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2410a.f450x;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        this.f2410a.m3353p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2410a.f450x;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}