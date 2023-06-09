package p093c.p145g.p146a.p147a.p166r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import java.lang.ref.WeakReference;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0179d0;
import p010b.p016c.p024p.p025m.SubMenuC0195l0;
import p010b.p086w.AbstractC1046i0;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p163o.AbstractC1959d;
import p093c.p145g.p146a.p147a.p163o.C1958c;

/* renamed from: c.g.a.a.r.g */
/* loaded from: classes.dex */
public class C1972g implements InterfaceC0179d0 {

    /* renamed from: b */
    public C0199p f5997b;

    /* renamed from: c */
    public C1970e f5998c;

    /* renamed from: d */
    public boolean f5999d = false;

    /* renamed from: e */
    public int f6000e;

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: a */
    public void mo649a(C0199p c0199p, boolean z) {
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: c */
    public int mo648c() {
        return this.f6000e;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: d */
    public boolean mo647d() {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: e */
    public Parcelable mo646e() {
        BottomNavigationPresenter$SavedState bottomNavigationPresenter$SavedState = new BottomNavigationPresenter$SavedState();
        bottomNavigationPresenter$SavedState.f6678b = this.f5998c.getSelectedItemId();
        SparseArray badgeDrawables = this.f5998c.getBadgeDrawables();
        boolean z = AbstractC1959d.f5939a;
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            C1958c c1958c = (C1958c) badgeDrawables.valueAt(i);
            if (c1958c == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, c1958c.f5930i);
        }
        bottomNavigationPresenter$SavedState.f6679c = parcelableSparseArray;
        return bottomNavigationPresenter$SavedState;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: g */
    public void mo645g(Context context, C0199p c0199p) {
        this.f5997b = c0199p;
        this.f5998c.f5973C = c0199p;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: h */
    public void mo644h(Parcelable parcelable) {
        if (parcelable instanceof BottomNavigationPresenter$SavedState) {
            C1970e c1970e = this.f5998c;
            BottomNavigationPresenter$SavedState bottomNavigationPresenter$SavedState = (BottomNavigationPresenter$SavedState) parcelable;
            int i = bottomNavigationPresenter$SavedState.f6678b;
            int size = c1970e.f5973C.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = c1970e.f5973C.getItem(i2);
                if (i == item.getItemId()) {
                    c1970e.f5986p = i;
                    c1970e.f5987q = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f5998c.getContext();
            ParcelableSparseArray parcelableSparseArray = bottomNavigationPresenter$SavedState.f6679c;
            boolean z = AbstractC1959d.f5939a;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int keyAt = parcelableSparseArray.keyAt(i3);
                BadgeDrawable$SavedState badgeDrawable$SavedState = (BadgeDrawable$SavedState) parcelableSparseArray.valueAt(i3);
                if (badgeDrawable$SavedState == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                C1958c c1958c = new C1958c(context);
                int i4 = badgeDrawable$SavedState.f6657f;
                BadgeDrawable$SavedState badgeDrawable$SavedState2 = c1958c.f5930i;
                if (badgeDrawable$SavedState2.f6657f != i4) {
                    badgeDrawable$SavedState2.f6657f = i4;
                    double d = i4;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    c1958c.f5933l = ((int) Math.pow(10.0d, d - 1.0d)) - 1;
                    c1958c.f5925d.f5562d = true;
                    c1958c.m661g();
                    c1958c.invalidateSelf();
                }
                int i5 = badgeDrawable$SavedState.f6656e;
                if (i5 != -1) {
                    int max = Math.max(0, i5);
                    BadgeDrawable$SavedState badgeDrawable$SavedState3 = c1958c.f5930i;
                    if (badgeDrawable$SavedState3.f6656e != max) {
                        badgeDrawable$SavedState3.f6656e = max;
                        c1958c.f5925d.f5562d = true;
                        c1958c.m661g();
                        c1958c.invalidateSelf();
                    }
                }
                int i6 = badgeDrawable$SavedState.f6653b;
                c1958c.f5930i.f6653b = i6;
                ColorStateList valueOf = ColorStateList.valueOf(i6);
                C1851i c1851i = c1958c.f5924c;
                if (c1851i.f5657d.f5636d != valueOf) {
                    c1851i.m737p(valueOf);
                    c1958c.invalidateSelf();
                }
                int i7 = badgeDrawable$SavedState.f6654c;
                c1958c.f5930i.f6654c = i7;
                if (c1958c.f5925d.f5559a.getColor() != i7) {
                    c1958c.f5925d.f5559a.setColor(i7);
                    c1958c.invalidateSelf();
                }
                int i8 = badgeDrawable$SavedState.f6661j;
                BadgeDrawable$SavedState badgeDrawable$SavedState4 = c1958c.f5930i;
                if (badgeDrawable$SavedState4.f6661j != i8) {
                    badgeDrawable$SavedState4.f6661j = i8;
                    WeakReference weakReference = c1958c.f5937p;
                    if (weakReference != null && weakReference.get() != null) {
                        View view = (View) c1958c.f5937p.get();
                        WeakReference weakReference2 = c1958c.f5938q;
                        c1958c.m662f(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
                    }
                }
                c1958c.f5930i.f6663l = badgeDrawable$SavedState.f6663l;
                c1958c.m661g();
                c1958c.f5930i.f6664m = badgeDrawable$SavedState.f6664m;
                c1958c.m661g();
                boolean z2 = badgeDrawable$SavedState.f6662k;
                c1958c.setVisible(z2, false);
                c1958c.f5930i.f6662k = z2;
                if (AbstractC1959d.f5939a && c1958c.m665c() != null && !z2) {
                    ((ViewGroup) c1958c.m665c().getParent()).invalidate();
                }
                sparseArray.put(keyAt, c1958c);
            }
            this.f5998c.setBadgeDrawables(sparseArray);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: i */
    public boolean mo643i(C0199p c0199p, C0202s c0202s) {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: j */
    public boolean mo642j(C0199p c0199p, C0202s c0202s) {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: m */
    public boolean mo641m(SubMenuC0195l0 subMenuC0195l0) {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: n */
    public void mo640n(boolean z) {
        if (this.f5999d) {
            return;
        }
        if (z) {
            this.f5998c.m652a();
            return;
        }
        C1970e c1970e = this.f5998c;
        C0199p c0199p = c1970e.f5973C;
        if (c0199p == null || c1970e.f5985o == null) {
            return;
        }
        int size = c0199p.size();
        if (size != c1970e.f5985o.length) {
            c1970e.m652a();
            return;
        }
        int i = c1970e.f5986p;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c1970e.f5973C.getItem(i2);
            if (item.isChecked()) {
                c1970e.f5986p = item.getItemId();
                c1970e.f5987q = i2;
            }
        }
        if (i != c1970e.f5986p) {
            AbstractC1046i0.m1362a(c1970e, c1970e.f5974d);
        }
        boolean m650d = c1970e.m650d(c1970e.f5984n, c1970e.f5973C.m2927l().size());
        for (int i3 = 0; i3 < size; i3++) {
            c1970e.f5972B.f5999d = true;
            c1970e.f5985o[i3].setLabelVisibilityMode(c1970e.f5984n);
            c1970e.f5985o[i3].setShifting(m650d);
            c1970e.f5985o[i3].mo275d((C0202s) c1970e.f5973C.getItem(i3), 0);
            c1970e.f5972B.f5999d = false;
        }
    }
}