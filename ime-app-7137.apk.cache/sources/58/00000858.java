package p093c.p145g.p146a.p147a.p170v;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: c.g.a.a.v.j */
/* loaded from: classes.dex */
public class ViewGroup$OnHierarchyChangeListenerC2004j implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public ViewGroup.OnHierarchyChangeListener f6114a;

    /* renamed from: b */
    public final /* synthetic */ ChipGroup f6115b;

    public ViewGroup$OnHierarchyChangeListenerC2004j(ChipGroup chipGroup, AbstractC2000f abstractC2000f) {
        this.f6115b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        if (view == this.f6115b && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(AbstractC0605j0.m2251g());
            }
            Chip chip = (Chip) view2;
            if (chip.isChecked()) {
                ((ChipGroup) view).m295b(chip.getId());
            }
            chip.setOnCheckedChangeListenerInternal(this.f6115b.f6792l);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6114a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        if (view == this.f6115b && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6114a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}