package p010b.p083u.p084e;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.u.e.g2 */
/* loaded from: classes.dex */
public abstract class AbstractC0941g2 {

    /* renamed from: b */
    public static final List f3604b = Collections.emptyList();

    /* renamed from: c */
    public final View f3605c;

    /* renamed from: d */
    public WeakReference f3606d;

    /* renamed from: l */
    public int f3614l;

    /* renamed from: t */
    public RecyclerView f3622t;

    /* renamed from: u */
    public AbstractC0932e1 f3623u;

    /* renamed from: e */
    public int f3607e = -1;

    /* renamed from: f */
    public int f3608f = -1;

    /* renamed from: g */
    public long f3609g = -1;

    /* renamed from: h */
    public int f3610h = -1;

    /* renamed from: i */
    public int f3611i = -1;

    /* renamed from: j */
    public AbstractC0941g2 f3612j = null;

    /* renamed from: k */
    public AbstractC0941g2 f3613k = null;

    /* renamed from: m */
    public List f3615m = null;

    /* renamed from: n */
    public List f3616n = null;

    /* renamed from: o */
    public int f3617o = 0;

    /* renamed from: p */
    public C1007x1 f3618p = null;

    /* renamed from: q */
    public boolean f3619q = false;

    /* renamed from: r */
    public int f3620r = 0;

    /* renamed from: s */
    public int f3621s = -1;

    public AbstractC0941g2(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3605c = view;
    }

    /* renamed from: a */
    public void m1672a(Object obj) {
        if (obj == null) {
            m1671b(1024);
        } else if ((1024 & this.f3614l) == 0) {
            if (this.f3615m == null) {
                ArrayList arrayList = new ArrayList();
                this.f3615m = arrayList;
                this.f3616n = Collections.unmodifiableList(arrayList);
            }
            this.f3615m.add(obj);
        }
    }

    /* renamed from: b */
    public void m1671b(int i) {
        this.f3614l = i | this.f3614l;
    }

    /* renamed from: c */
    public void m1670c() {
        this.f3608f = -1;
        this.f3611i = -1;
    }

    /* renamed from: d */
    public void m1669d() {
        this.f3614l &= -33;
    }

    /* renamed from: e */
    public final int m1668e() {
        RecyclerView recyclerView = this.f3622t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m3192H(this);
    }

    @Deprecated
    /* renamed from: f */
    public final int m1667f() {
        RecyclerView recyclerView;
        AbstractC0932e1 adapter;
        int m3192H;
        if (this.f3623u == null || (recyclerView = this.f3622t) == null || (adapter = recyclerView.getAdapter()) == null || (m3192H = this.f3622t.m3192H(this)) == -1 || this.f3623u != adapter) {
            return -1;
        }
        return m3192H;
    }

    /* renamed from: g */
    public final int m1666g() {
        int i = this.f3611i;
        return i == -1 ? this.f3607e : i;
    }

    /* renamed from: h */
    public List m1665h() {
        if ((this.f3614l & 1024) == 0) {
            List list = this.f3615m;
            return (list == null || list.size() == 0) ? f3604b : this.f3616n;
        }
        return f3604b;
    }

    /* renamed from: i */
    public boolean m1664i(int i) {
        return (i & this.f3614l) != 0;
    }

    /* renamed from: j */
    public boolean m1663j() {
        return (this.f3605c.getParent() == null || this.f3605c.getParent() == this.f3622t) ? false : true;
    }

    /* renamed from: k */
    public boolean m1662k() {
        return (this.f3614l & 1) != 0;
    }

    /* renamed from: l */
    public boolean m1661l() {
        return (this.f3614l & 4) != 0;
    }

    /* renamed from: m */
    public final boolean m1660m() {
        if ((this.f3614l & 16) == 0) {
            View view = this.f3605c;
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            return !(Build.VERSION.SDK_INT >= 16 ? view.hasTransientState() : false);
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1659n() {
        return (this.f3614l & 8) != 0;
    }

    /* renamed from: o */
    public boolean m1658o() {
        return this.f3618p != null;
    }

    /* renamed from: p */
    public boolean m1657p() {
        return (this.f3614l & 256) != 0;
    }

    /* renamed from: q */
    public boolean m1656q() {
        return (this.f3614l & 2) != 0;
    }

    /* renamed from: r */
    public void m1655r(int i, boolean z) {
        if (this.f3608f == -1) {
            this.f3608f = this.f3607e;
        }
        if (this.f3611i == -1) {
            this.f3611i = this.f3607e;
        }
        if (z) {
            this.f3611i += i;
        }
        this.f3607e += i;
        if (this.f3605c.getLayoutParams() != null) {
            ((C0984r1) this.f3605c.getLayoutParams()).f3815c = true;
        }
    }

    /* renamed from: s */
    public void m1654s() {
        this.f3614l = 0;
        this.f3607e = -1;
        this.f3608f = -1;
        this.f3609g = -1L;
        this.f3611i = -1;
        this.f3617o = 0;
        this.f3612j = null;
        this.f3613k = null;
        List list = this.f3615m;
        if (list != null) {
            list.clear();
        }
        this.f3614l &= -1025;
        this.f3620r = 0;
        this.f3621s = -1;
        RecyclerView.m3154k(this);
    }

    /* renamed from: t */
    public void m1653t(int i, int i2) {
        this.f3614l = (i & i2) | (this.f3614l & (i2 ^ (-1)));
    }

    public String toString() {
        String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3607e + " id=" + this.f3609g + ", oldPos=" + this.f3608f + ", pLpos:" + this.f3611i);
        if (m1658o()) {
            sb.append(" scrap ");
            sb.append(this.f3619q ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m1661l()) {
            sb.append(" invalid");
        }
        if (!m1662k()) {
            sb.append(" unbound");
        }
        boolean z = false;
        if ((this.f3614l & 2) != 0) {
            sb.append(" update");
        }
        if (m1659n()) {
            sb.append(" removed");
        }
        if (m1651v()) {
            sb.append(" ignored");
        }
        if (m1657p()) {
            sb.append(" tmpDetached");
        }
        if (!m1660m()) {
            StringBuilder m1187i = AbstractC1124a.m1187i(" not recyclable(");
            m1187i.append(this.f3617o);
            m1187i.append(")");
            sb.append(m1187i.toString());
        }
        if (((this.f3614l & 512) != 0 || m1661l()) ? true : true) {
            sb.append(" undefined adapter position");
        }
        if (this.f3605c.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1652u(boolean z) {
        int i;
        int i2 = this.f3617o;
        int i3 = z ? i2 - 1 : i2 + 1;
        this.f3617o = i3;
        if (i3 < 0) {
            this.f3617o = 0;
            String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
            return;
        }
        if (!z && i3 == 1) {
            i = this.f3614l | 16;
        } else if (!z || i3 != 0) {
            return;
        } else {
            i = this.f3614l & (-17);
        }
        this.f3614l = i;
    }

    /* renamed from: v */
    public boolean m1651v() {
        return (this.f3614l & 128) != 0;
    }

    /* renamed from: w */
    public boolean m1650w() {
        return (this.f3614l & 32) != 0;
    }
}