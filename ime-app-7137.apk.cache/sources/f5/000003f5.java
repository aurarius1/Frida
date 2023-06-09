package p010b.p082t;

import android.util.SparseArray;
import android.view.View;
import p010b.p083u.p084e.AbstractC0941g2;

/* renamed from: b.t.l0 */
/* loaded from: classes.dex */
public class C0881l0 extends AbstractC0941g2 {

    /* renamed from: v */
    public final SparseArray f3486v;

    /* renamed from: w */
    public boolean f3487w;

    /* renamed from: x */
    public boolean f3488x;

    public C0881l0(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f3486v = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        int i = AbstractC0889p0.icon_frame;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(16908350, view.findViewById(16908350));
    }

    /* renamed from: x */
    public View m1743x(int i) {
        View view = (View) this.f3486v.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f3605c.findViewById(i);
        if (findViewById != null) {
            this.f3486v.put(i, findViewById);
        }
        return findViewById;
    }
}