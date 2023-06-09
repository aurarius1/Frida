package p010b.p083u.p084e;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p054h.AbstractC0530c;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0568b;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.u.e.x1 */
/* loaded from: classes.dex */
public final class C1007x1 {

    /* renamed from: a */
    public final ArrayList f3892a;

    /* renamed from: b */
    public ArrayList f3893b;

    /* renamed from: c */
    public final ArrayList f3894c;

    /* renamed from: d */
    public final List f3895d;

    /* renamed from: e */
    public int f3896e;

    /* renamed from: f */
    public int f3897f;

    /* renamed from: g */
    public C1004w1 f3898g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3899h;

    public C1007x1(RecyclerView recyclerView) {
        this.f3899h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3892a = arrayList;
        this.f3893b = null;
        this.f3894c = new ArrayList();
        this.f3895d = Collections.unmodifiableList(arrayList);
        this.f3896e = 2;
        this.f3897f = 2;
    }

    /* renamed from: a */
    public void m1407a(AbstractC0941g2 abstractC0941g2, boolean z) {
        RecyclerView.m3154k(abstractC0941g2);
        View view = abstractC0941g2.f3605c;
        C0949i2 c0949i2 = this.f3899h.f784z0;
        if (c0949i2 != null) {
            C0568b mo1642j = c0949i2.mo1642j();
            AbstractC0605j0.m2269N(view, mo1642j instanceof C0945h2 ? (C0568b) ((C0945h2) mo1642j).f3629e.remove(view) : null);
        }
        if (z) {
            InterfaceC1010y1 interfaceC1010y1 = this.f3899h.f779x;
            if (interfaceC1010y1 != null) {
                interfaceC1010y1.m1393a(abstractC0941g2);
            }
            int size = this.f3899h.f781y.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC1010y1) this.f3899h.f781y.get(i)).m1393a(abstractC0941g2);
            }
            RecyclerView recyclerView = this.f3899h;
            AbstractC0932e1 abstractC0932e1 = recyclerView.f775v;
            if (recyclerView.f770s0 != null) {
                recyclerView.f763p.m1424g(abstractC0941g2);
            }
        }
        abstractC0941g2.f3623u = null;
        abstractC0941g2.f3622t = null;
        C1004w1 m1404d = m1404d();
        m1404d.getClass();
        int i2 = abstractC0941g2.f3610h;
        ArrayList arrayList = m1404d.m1421a(i2).f3868a;
        if (((C1000v1) m1404d.f3880a.get(i2)).f3869b <= arrayList.size()) {
            return;
        }
        abstractC0941g2.m1654s();
        arrayList.add(abstractC0941g2);
    }

    /* renamed from: b */
    public void m1406b() {
        this.f3892a.clear();
        m1402f();
    }

    /* renamed from: c */
    public int m1405c(int i) {
        if (i >= 0 && i < this.f3899h.f770s0.m1684b()) {
            RecyclerView recyclerView = this.f3899h;
            return !recyclerView.f770s0.f3576g ? i : recyclerView.f759n.m1726f(i, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        sb.append(this.f3899h.f770s0.m1684b());
        throw new IndexOutOfBoundsException(AbstractC1124a.m1194b(this.f3899h, sb));
    }

    /* renamed from: d */
    public C1004w1 m1404d() {
        if (this.f3898g == null) {
            this.f3898g = new C1004w1();
        }
        return this.f3898g;
    }

    /* renamed from: e */
    public final void m1403e(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m1403e((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    /* renamed from: f */
    public void m1402f() {
        for (int size = this.f3894c.size() - 1; size >= 0; size--) {
            m1401g(size);
        }
        this.f3894c.clear();
        if (RecyclerView.f703f) {
            C0998v c0998v = this.f3899h.f768r0;
            int[] iArr = c0998v.f3863c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0998v.f3864d = 0;
        }
    }

    /* renamed from: g */
    public void m1401g(int i) {
        m1407a((AbstractC0941g2) this.f3894c.get(i), true);
        this.f3894c.remove(i);
    }

    /* renamed from: h */
    public void m1400h(View view) {
        AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
        if (m3189K.m1657p()) {
            this.f3899h.removeDetachedView(view, false);
        }
        if (m3189K.m1658o()) {
            m3189K.f3618p.m1396l(m3189K);
        } else if (m3189K.m1650w()) {
            m3189K.m1669d();
        }
        m1399i(m3189K);
        if (this.f3899h.f743a0 == null || m3189K.m1660m()) {
            return;
        }
        this.f3899h.f743a0.mo1610e(m3189K);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1399i(AbstractC0941g2 abstractC0941g2) {
        boolean z;
        boolean z2;
        if (abstractC0941g2.m1658o() || abstractC0941g2.f3605c.getParent() != null) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Scrapped or attached views may not be recycled. isScrap:");
            m1187i.append(abstractC0941g2.m1658o());
            m1187i.append(" isAttached:");
            m1187i.append(abstractC0941g2.f3605c.getParent() != null);
            throw new IllegalArgumentException(AbstractC1124a.m1194b(this.f3899h, m1187i));
        } else if (abstractC0941g2.m1657p()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb.append(abstractC0941g2);
            throw new IllegalArgumentException(AbstractC1124a.m1194b(this.f3899h, sb));
        } else if (abstractC0941g2.m1651v()) {
            throw new IllegalArgumentException(AbstractC1124a.m1194b(this.f3899h, AbstractC1124a.m1187i("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        } else {
            if ((abstractC0941g2.f3614l & 16) == 0) {
                View view = abstractC0941g2.f3605c;
                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                if (Build.VERSION.SDK_INT >= 16 ? view.hasTransientState() : false) {
                    z = true;
                    AbstractC0932e1 abstractC0932e1 = this.f3899h.f775v;
                    if (abstractC0941g2.m1660m()) {
                        z2 = false;
                    } else {
                        if (this.f3897f <= 0 || abstractC0941g2.m1664i(526)) {
                            z2 = false;
                        } else {
                            int size = this.f3894c.size();
                            if (size >= this.f3897f && size > 0) {
                                m1401g(0);
                                size--;
                            }
                            if (RecyclerView.f703f && size > 0 && !this.f3899h.f768r0.m1447c(abstractC0941g2.f3607e)) {
                                do {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                } while (this.f3899h.f768r0.m1447c(((AbstractC0941g2) this.f3894c.get(size)).f3607e));
                                size++;
                            }
                            this.f3894c.add(size, abstractC0941g2);
                            z2 = true;
                        }
                        if (!z2) {
                            m1407a(abstractC0941g2, true);
                            this.f3899h.f763p.m1424g(abstractC0941g2);
                            if (z2 || r1 || !z) {
                                return;
                            }
                            abstractC0941g2.f3623u = null;
                            abstractC0941g2.f3622t = null;
                            return;
                        }
                    }
                    r1 = false;
                    this.f3899h.f763p.m1424g(abstractC0941g2);
                    if (z2) {
                        return;
                    }
                    return;
                }
            }
            z = false;
            AbstractC0932e1 abstractC0932e12 = this.f3899h.f775v;
            if (abstractC0941g2.m1660m()) {
            }
            r1 = false;
            this.f3899h.f763p.m1424g(abstractC0941g2);
            if (z2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1398j(View view) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
        if (!m3189K.m1664i(12) && m3189K.m1656q()) {
            AbstractC0956k1 abstractC0956k1 = this.f3899h.f743a0;
            if (abstractC0956k1 != null) {
                C0970o c0970o = (C0970o) abstractC0956k1;
                if (m3189K.m1665h().isEmpty()) {
                    if (!(!c0970o.f3735h || m3189K.m1661l())) {
                        z2 = false;
                        if (!z2) {
                            z = false;
                            if (!z) {
                                if (this.f3893b == null) {
                                    this.f3893b = new ArrayList();
                                }
                                m3189K.f3618p = this;
                                m3189K.f3619q = true;
                                arrayList = this.f3893b;
                                arrayList.add(m3189K);
                            }
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
            z = true;
            if (!z) {
            }
        }
        if (m3189K.m1661l() && !m3189K.m1659n() && !this.f3899h.f775v.f3590b) {
            throw new IllegalArgumentException(AbstractC1124a.m1194b(this.f3899h, AbstractC1124a.m1187i("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        m3189K.f3618p = this;
        m3189K.f3619q = false;
        arrayList = this.f3892a;
        arrayList.add(m3189K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02fb, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0453, code lost:
        if (r7.m1661l() == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0489, code lost:
        if ((r10 == 0 || r10 + r8 < r20) == false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x056d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0941g2 m1397k(int i, boolean z, long j) {
        AbstractC0941g2 abstractC0941g2;
        boolean z2;
        boolean z3;
        AccessibilityManager accessibilityManager;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        C0984r1 c0984r1;
        ViewGroup.LayoutParams generateLayoutParams;
        RecyclerView m3194F;
        AbstractC0941g2 abstractC0941g22;
        AbstractC0941g2 abstractC0941g23;
        View view;
        boolean z5;
        int size;
        int m1726f;
        if (i < 0 || i >= this.f3899h.f770s0.m1684b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid item position ");
            sb.append(i);
            sb.append("(");
            sb.append(i);
            sb.append("). Item count:");
            sb.append(this.f3899h.f770s0.m1684b());
            throw new IndexOutOfBoundsException(AbstractC1124a.m1194b(this.f3899h, sb));
        }
        boolean z6 = false;
        if (this.f3899h.f770s0.f3576g) {
            ArrayList arrayList = this.f3893b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        RecyclerView recyclerView = this.f3899h;
                        if (recyclerView.f775v.f3590b && (m1726f = recyclerView.f759n.m1726f(i, 0)) > 0 && m1726f < this.f3899h.f775v.mo543a()) {
                            long mo558b = this.f3899h.f775v.mo558b(m1726f);
                            for (int i3 = 0; i3 < size; i3++) {
                                AbstractC0941g2 abstractC0941g24 = (AbstractC0941g2) this.f3893b.get(i3);
                                if (!abstractC0941g24.m1650w() && abstractC0941g24.f3609g == mo558b) {
                                    abstractC0941g24.m1671b(32);
                                    abstractC0941g2 = abstractC0941g24;
                                    break;
                                }
                            }
                        }
                    } else {
                        abstractC0941g2 = (AbstractC0941g2) this.f3893b.get(i2);
                        if (!abstractC0941g2.m1650w() && abstractC0941g2.m1666g() == i) {
                            abstractC0941g2.m1671b(32);
                            break;
                        }
                        i2++;
                    }
                }
                if (abstractC0941g2 != null) {
                    z2 = true;
                    if (abstractC0941g2 == null) {
                        int size2 = this.f3892a.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            abstractC0941g23 = (AbstractC0941g2) this.f3892a.get(i4);
                            if (!abstractC0941g23.m1650w() && abstractC0941g23.m1666g() == i && !abstractC0941g23.m1661l() && (this.f3899h.f770s0.f3576g || !abstractC0941g23.m1659n())) {
                                abstractC0941g23.m1671b(32);
                                break;
                            }
                        }
                        if (!z) {
                            C0926d c0926d = this.f3899h.f761o;
                            int size3 = c0926d.f3552c.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    view = null;
                                    break;
                                }
                                view = (View) c0926d.f3552c.get(i5);
                                c0926d.f3550a.getClass();
                                AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
                                if (m3189K.m1666g() == i && !m3189K.m1661l() && !m3189K.m1659n()) {
                                    break;
                                }
                                i5++;
                            }
                            if (view != null) {
                                abstractC0941g2 = RecyclerView.m3189K(view);
                                C0926d c0926d2 = this.f3899h.f761o;
                                int indexOfChild = c0926d2.f3550a.f3549a.indexOfChild(view);
                                if (indexOfChild < 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                                } else if (c0926d2.f3551b.m1711d(indexOfChild)) {
                                    c0926d2.f3551b.m1714a(indexOfChild);
                                    c0926d2.m1691l(view);
                                    int m1693j = this.f3899h.f761o.m1693j(view);
                                    if (m1693j == -1) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("layout index should not be -1 after unhiding a view:");
                                        sb2.append(abstractC0941g2);
                                        throw new IllegalStateException(AbstractC1124a.m1194b(this.f3899h, sb2));
                                    }
                                    this.f3899h.f761o.m1700c(m1693j);
                                    m1398j(view);
                                    abstractC0941g2.m1671b(8224);
                                    if (abstractC0941g2 != null) {
                                        if (abstractC0941g2.m1659n()) {
                                            z5 = this.f3899h.f770s0.f3576g;
                                        } else {
                                            int i6 = abstractC0941g2.f3607e;
                                            if (i6 >= 0 && i6 < this.f3899h.f775v.mo543a()) {
                                                RecyclerView recyclerView2 = this.f3899h;
                                                if (recyclerView2.f770s0.f3576g || recyclerView2.f775v.mo1106c(abstractC0941g2.f3607e) == abstractC0941g2.f3610h) {
                                                    AbstractC0932e1 abstractC0932e1 = this.f3899h.f775v;
                                                    if (!abstractC0932e1.f3590b || abstractC0941g2.f3609g == abstractC0932e1.mo558b(abstractC0941g2.f3607e)) {
                                                        z5 = true;
                                                    }
                                                }
                                                z5 = false;
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("Inconsistency detected. Invalid view holder adapter position");
                                                sb3.append(abstractC0941g2);
                                                throw new IndexOutOfBoundsException(AbstractC1124a.m1194b(this.f3899h, sb3));
                                            }
                                        }
                                        if (z5) {
                                            z2 = true;
                                        } else {
                                            if (!z) {
                                                abstractC0941g2.m1671b(4);
                                                if (abstractC0941g2.m1658o()) {
                                                    this.f3899h.removeDetachedView(abstractC0941g2.f3605c, false);
                                                    abstractC0941g2.f3618p.m1396l(abstractC0941g2);
                                                } else if (abstractC0941g2.m1650w()) {
                                                    abstractC0941g2.m1669d();
                                                }
                                                m1399i(abstractC0941g2);
                                            }
                                            abstractC0941g2 = null;
                                        }
                                    }
                                } else {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                }
                            }
                        }
                        int size4 = this.f3894c.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            abstractC0941g23 = (AbstractC0941g2) this.f3894c.get(i7);
                            if (!abstractC0941g23.m1661l() && abstractC0941g23.m1666g() == i && !abstractC0941g23.m1663j()) {
                                if (!z) {
                                    this.f3894c.remove(i7);
                                }
                                abstractC0941g2 = abstractC0941g23;
                                if (abstractC0941g2 != null) {
                                }
                            }
                        }
                        abstractC0941g2 = null;
                        if (abstractC0941g2 != null) {
                        }
                    }
                    if (abstractC0941g2 == null) {
                        int m1726f2 = this.f3899h.f759n.m1726f(i, 0);
                        if (m1726f2 >= 0 && m1726f2 < this.f3899h.f775v.mo543a()) {
                            int mo1106c = this.f3899h.f775v.mo1106c(m1726f2);
                            AbstractC0932e1 abstractC0932e12 = this.f3899h.f775v;
                            if (abstractC0932e12.f3590b) {
                                long mo558b2 = abstractC0932e12.mo558b(m1726f2);
                                int size5 = this.f3892a.size() - 1;
                                while (true) {
                                    if (size5 >= 0) {
                                        AbstractC0941g2 abstractC0941g25 = (AbstractC0941g2) this.f3892a.get(size5);
                                        if (abstractC0941g25.f3609g == mo558b2 && !abstractC0941g25.m1650w()) {
                                            if (mo1106c == abstractC0941g25.f3610h) {
                                                abstractC0941g25.m1671b(32);
                                                if (abstractC0941g25.m1659n() && !this.f3899h.f770s0.f3576g) {
                                                    abstractC0941g25.m1653t(2, 14);
                                                }
                                                abstractC0941g2 = abstractC0941g25;
                                            } else if (!z) {
                                                this.f3892a.remove(size5);
                                                this.f3899h.removeDetachedView(abstractC0941g25.f3605c, false);
                                                AbstractC0941g2 m3189K2 = RecyclerView.m3189K(abstractC0941g25.f3605c);
                                                m3189K2.f3618p = null;
                                                m3189K2.f3619q = false;
                                                m3189K2.m1669d();
                                                m1399i(m3189K2);
                                            }
                                        }
                                        size5--;
                                    } else {
                                        int size6 = this.f3894c.size() - 1;
                                        while (true) {
                                            if (size6 < 0) {
                                                break;
                                            }
                                            abstractC0941g2 = (AbstractC0941g2) this.f3894c.get(size6);
                                            if (abstractC0941g2.f3609g == mo558b2 && !abstractC0941g2.m1663j()) {
                                                if (mo1106c == abstractC0941g2.f3610h) {
                                                    if (!z) {
                                                        this.f3894c.remove(size6);
                                                    }
                                                } else if (!z) {
                                                    m1401g(size6);
                                                    break;
                                                }
                                            }
                                            size6--;
                                        }
                                    }
                                }
                                if (abstractC0941g2 != null) {
                                    abstractC0941g2.f3607e = m1726f2;
                                    z2 = true;
                                }
                            }
                            if (abstractC0941g2 == null) {
                                C1000v1 c1000v1 = (C1000v1) m1404d().f3880a.get(mo1106c);
                                if (c1000v1 != null && !c1000v1.f3868a.isEmpty()) {
                                    ArrayList arrayList2 = c1000v1.f3868a;
                                    for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                                        if (!((AbstractC0941g2) arrayList2.get(size7)).m1663j()) {
                                            abstractC0941g22 = (AbstractC0941g2) arrayList2.remove(size7);
                                            break;
                                        }
                                    }
                                }
                                abstractC0941g22 = null;
                                if (abstractC0941g22 != null) {
                                    abstractC0941g22.m1654s();
                                    if (RecyclerView.f700c) {
                                        View view2 = abstractC0941g22.f3605c;
                                        if (view2 instanceof ViewGroup) {
                                            m1403e((ViewGroup) view2, false);
                                        }
                                    }
                                }
                                abstractC0941g2 = abstractC0941g22;
                            }
                            if (abstractC0941g2 == null) {
                                long nanoTime = this.f3899h.getNanoTime();
                                if (j != Long.MAX_VALUE) {
                                    long j2 = this.f3898g.m1421a(mo1106c).f3870c;
                                    if (!(j2 == 0 || j2 + nanoTime < j)) {
                                        return null;
                                    }
                                }
                                RecyclerView recyclerView3 = this.f3899h;
                                AbstractC0932e1 abstractC0932e13 = recyclerView3.f775v;
                                abstractC0932e13.getClass();
                                try {
                                    AbstractC0530c.m2348a("RV CreateView");
                                    AbstractC0941g2 mo541f = abstractC0932e13.mo541f(recyclerView3, mo1106c);
                                    if (mo541f.f3605c.getParent() == null) {
                                        mo541f.f3610h = mo1106c;
                                        AbstractC0530c.m2347b();
                                        if (RecyclerView.f703f && (m3194F = RecyclerView.m3194F(mo541f.f3605c)) != null) {
                                            mo541f.f3606d = new WeakReference(m3194F);
                                        }
                                        long nanoTime2 = this.f3899h.getNanoTime();
                                        C1004w1 c1004w1 = this.f3898g;
                                        long j3 = nanoTime2 - nanoTime;
                                        C1000v1 m1421a = c1004w1.m1421a(mo1106c);
                                        m1421a.f3870c = c1004w1.m1420b(m1421a.f3870c, j3);
                                        abstractC0941g2 = mo541f;
                                    } else {
                                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                    }
                                } finally {
                                    AbstractC0530c.m2347b();
                                }
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Inconsistency detected. Invalid item position ");
                            sb4.append(i);
                            sb4.append("(offset:");
                            sb4.append(m1726f2);
                            sb4.append(").state:");
                            sb4.append(this.f3899h.f770s0.m1684b());
                            throw new IndexOutOfBoundsException(AbstractC1124a.m1194b(this.f3899h, sb4));
                        }
                    }
                    if (z2 && !this.f3899h.f770s0.f3576g && abstractC0941g2.m1664i(8192)) {
                        abstractC0941g2.m1653t(0, 8192);
                        if (this.f3899h.f770s0.f3579j) {
                            AbstractC0956k1.m1632b(abstractC0941g2);
                            AbstractC0956k1 abstractC0956k1 = this.f3899h.f743a0;
                            abstractC0941g2.m1665h();
                            this.f3899h.m3167d0(abstractC0941g2, abstractC0956k1.m1629h(abstractC0941g2));
                        }
                    }
                    if (this.f3899h.f770s0.f3576g || !abstractC0941g2.m1662k()) {
                        if (abstractC0941g2.m1662k()) {
                            if (!((abstractC0941g2.f3614l & 2) != 0)) {
                            }
                        }
                        int m1726f3 = this.f3899h.f759n.m1726f(i, 0);
                        abstractC0941g2.f3623u = null;
                        RecyclerView recyclerView4 = this.f3899h;
                        abstractC0941g2.f3622t = recyclerView4;
                        int i8 = abstractC0941g2.f3610h;
                        long nanoTime3 = recyclerView4.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j4 = this.f3898g.m1421a(i8).f3871d;
                        }
                        AbstractC0932e1 abstractC0932e14 = this.f3899h.f775v;
                        abstractC0932e14.getClass();
                        z3 = abstractC0941g2.f3623u != null;
                        if (z3) {
                            abstractC0941g2.f3607e = m1726f3;
                            if (abstractC0932e14.f3590b) {
                                abstractC0941g2.f3609g = abstractC0932e14.mo558b(m1726f3);
                            }
                            abstractC0941g2.m1653t(1, 519);
                            AbstractC0530c.m2348a("RV OnBindView");
                        }
                        abstractC0941g2.f3623u = abstractC0932e14;
                        abstractC0941g2.m1665h();
                        abstractC0932e14.mo542e(abstractC0941g2, m1726f3);
                        if (z3) {
                            List list = abstractC0941g2.f3615m;
                            if (list != null) {
                                list.clear();
                            }
                            abstractC0941g2.f3614l &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = abstractC0941g2.f3605c.getLayoutParams();
                            if (layoutParams2 instanceof C0984r1) {
                                ((C0984r1) layoutParams2).f3815c = true;
                            }
                        }
                        long nanoTime4 = this.f3899h.getNanoTime();
                        C1004w1 c1004w12 = this.f3898g;
                        long j5 = nanoTime4 - nanoTime3;
                        C1000v1 m1421a2 = c1004w12.m1421a(abstractC0941g2.f3610h);
                        m1421a2.f3871d = c1004w12.m1420b(m1421a2.f3871d, j5);
                        accessibilityManager = this.f3899h.f732M;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            View view3 = abstractC0941g2.f3605c;
                            if (AbstractC0605j0.m2242p(view3) == 0) {
                                AbstractC0605j0.m2263T(view3, 1);
                            }
                            C0949i2 c0949i2 = this.f3899h.f784z0;
                            if (c0949i2 != null) {
                                C0568b mo1642j = c0949i2.mo1642j();
                                if (mo1642j instanceof C0945h2) {
                                    C0945h2 c0945h2 = (C0945h2) mo1642j;
                                    c0945h2.getClass();
                                    C0568b m2250h = AbstractC0605j0.m2250h(view3);
                                    if (m2250h != null && m2250h != c0945h2) {
                                        c0945h2.f3629e.put(view3, m2250h);
                                    }
                                }
                                AbstractC0605j0.m2269N(view3, mo1642j);
                            }
                        }
                        if (this.f3899h.f770s0.f3576g) {
                            abstractC0941g2.f3611i = i;
                        }
                        z4 = true;
                        layoutParams = abstractC0941g2.f3605c.getLayoutParams();
                        if (layoutParams == null) {
                            generateLayoutParams = this.f3899h.generateDefaultLayoutParams();
                        } else if (this.f3899h.checkLayoutParams(layoutParams)) {
                            c0984r1 = (C0984r1) layoutParams;
                            c0984r1.f3813a = abstractC0941g2;
                            if (z2 && z4) {
                                z6 = true;
                            }
                            c0984r1.f3816d = z6;
                            return abstractC0941g2;
                        } else {
                            generateLayoutParams = this.f3899h.generateLayoutParams(layoutParams);
                        }
                        c0984r1 = (C0984r1) generateLayoutParams;
                        abstractC0941g2.f3605c.setLayoutParams(c0984r1);
                        c0984r1.f3813a = abstractC0941g2;
                        if (z2) {
                            z6 = true;
                        }
                        c0984r1.f3816d = z6;
                        return abstractC0941g2;
                    }
                    abstractC0941g2.f3611i = i;
                    z4 = false;
                    layoutParams = abstractC0941g2.f3605c.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    c0984r1 = (C0984r1) generateLayoutParams;
                    abstractC0941g2.f3605c.setLayoutParams(c0984r1);
                    c0984r1.f3813a = abstractC0941g2;
                    if (z2) {
                    }
                    c0984r1.f3816d = z6;
                    return abstractC0941g2;
                }
            }
            abstractC0941g2 = null;
            if (abstractC0941g2 != null) {
            }
        } else {
            abstractC0941g2 = null;
        }
        z2 = false;
        if (abstractC0941g2 == null) {
        }
        if (abstractC0941g2 == null) {
        }
        if (z2) {
            abstractC0941g2.m1653t(0, 8192);
            if (this.f3899h.f770s0.f3579j) {
            }
        }
        if (this.f3899h.f770s0.f3576g) {
        }
        if (abstractC0941g2.m1662k()) {
        }
        int m1726f32 = this.f3899h.f759n.m1726f(i, 0);
        abstractC0941g2.f3623u = null;
        RecyclerView recyclerView42 = this.f3899h;
        abstractC0941g2.f3622t = recyclerView42;
        int i82 = abstractC0941g2.f3610h;
        long nanoTime32 = recyclerView42.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        AbstractC0932e1 abstractC0932e142 = this.f3899h.f775v;
        abstractC0932e142.getClass();
        if (abstractC0941g2.f3623u != null) {
        }
        if (z3) {
        }
        abstractC0941g2.f3623u = abstractC0932e142;
        abstractC0941g2.m1665h();
        abstractC0932e142.mo542e(abstractC0941g2, m1726f32);
        if (z3) {
        }
        long nanoTime42 = this.f3899h.getNanoTime();
        C1004w1 c1004w122 = this.f3898g;
        long j52 = nanoTime42 - nanoTime32;
        C1000v1 m1421a22 = c1004w122.m1421a(abstractC0941g2.f3610h);
        m1421a22.f3871d = c1004w122.m1420b(m1421a22.f3871d, j52);
        accessibilityManager = this.f3899h.f732M;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (this.f3899h.f770s0.f3576g) {
        }
        z4 = true;
        layoutParams = abstractC0941g2.f3605c.getLayoutParams();
        if (layoutParams == null) {
        }
        c0984r1 = (C0984r1) generateLayoutParams;
        abstractC0941g2.f3605c.setLayoutParams(c0984r1);
        c0984r1.f3813a = abstractC0941g2;
        if (z2) {
        }
        c0984r1.f3816d = z6;
        return abstractC0941g2;
    }

    /* renamed from: l */
    public void m1396l(AbstractC0941g2 abstractC0941g2) {
        (abstractC0941g2.f3619q ? this.f3893b : this.f3892a).remove(abstractC0941g2);
        abstractC0941g2.f3618p = null;
        abstractC0941g2.f3619q = false;
        abstractC0941g2.m1669d();
    }

    /* renamed from: m */
    public void m1395m() {
        AbstractC0980q1 abstractC0980q1 = this.f3899h.f777w;
        this.f3897f = this.f3896e + (abstractC0980q1 != null ? abstractC0980q1.f3783l : 0);
        for (int size = this.f3894c.size() - 1; size >= 0 && this.f3894c.size() > this.f3897f; size--) {
            m1401g(size);
        }
    }
}