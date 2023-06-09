package p010b.p016c.p026q;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import p010b.p016c.AbstractC0078d;

/* renamed from: b.c.q.w2 */
/* loaded from: classes.dex */
public class View$OnLayoutChangeListenerC0331w2 implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f1798a;

    public View$OnLayoutChangeListenerC0331w2(SearchView searchView) {
        this.f1798a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SearchView searchView = this.f1798a;
        if (searchView.f306z.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f300t.getPaddingLeft();
            Rect rect = new Rect();
            boolean m2817a = AbstractC0257h4.m2817a(searchView);
            int dimensionPixelSize = searchView.f274R ? resources.getDimensionPixelSize(AbstractC0078d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(AbstractC0078d.abc_dropdownitem_icon_width) : 0;
            searchView.f297r.getDropDownBackground().getPadding(rect);
            searchView.f297r.setDropDownHorizontalOffset(m2817a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchView.f297r.setDropDownWidth((((searchView.f306z.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}