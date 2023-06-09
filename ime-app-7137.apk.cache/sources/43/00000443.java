package p010b.p083u.p084e;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0604j;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p108i0.p110p.AbstractC1268b1;
import p093c.p097b.p108i0.p110p.C1379w0;
import p093c.p097b.p108i0.p110p.View$OnClickListenerC1264a1;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1430h;

/* renamed from: b.u.e.l0 */
/* loaded from: classes.dex */
public class C0959l0 extends AbstractC0964m1 {

    /* renamed from: A */
    public C0947i0 f3669A;

    /* renamed from: C */
    public Rect f3671C;

    /* renamed from: D */
    public long f3672D;

    /* renamed from: d */
    public float f3676d;

    /* renamed from: e */
    public float f3677e;

    /* renamed from: f */
    public float f3678f;

    /* renamed from: g */
    public float f3679g;

    /* renamed from: h */
    public float f3680h;

    /* renamed from: i */
    public float f3681i;

    /* renamed from: j */
    public float f3682j;

    /* renamed from: k */
    public float f3683k;

    /* renamed from: m */
    public AbstractC0955k0 f3685m;

    /* renamed from: o */
    public int f3687o;

    /* renamed from: q */
    public int f3689q;

    /* renamed from: r */
    public RecyclerView f3690r;

    /* renamed from: t */
    public VelocityTracker f3692t;

    /* renamed from: u */
    public List f3693u;

    /* renamed from: v */
    public List f3694v;

    /* renamed from: z */
    public C0604j f3698z;

    /* renamed from: a */
    public final List f3673a = new ArrayList();

    /* renamed from: b */
    public final float[] f3674b = new float[2];

    /* renamed from: c */
    public AbstractC0941g2 f3675c = null;

    /* renamed from: l */
    public int f3684l = -1;

    /* renamed from: n */
    public int f3686n = 0;

    /* renamed from: p */
    public List f3688p = new ArrayList();

    /* renamed from: s */
    public final Runnable f3691s = new RunnableC0919b0(this);

    /* renamed from: w */
    public InterfaceC0940g1 f3695w = null;

    /* renamed from: x */
    public View f3696x = null;

    /* renamed from: y */
    public int f3697y = -1;

    /* renamed from: B */
    public final InterfaceC0992t1 f3670B = new C0923c0(this);

    public C0959l0(AbstractC0955k0 abstractC0955k0) {
        this.f3685m = abstractC0955k0;
    }

    /* renamed from: m */
    public static boolean m1622m(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: d */
    public void mo1129d(Rect rect, View view, RecyclerView recyclerView, C0929d2 c0929d2) {
        rect.setEmpty();
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: e */
    public void mo546e(Canvas canvas, RecyclerView recyclerView, C0929d2 c0929d2) {
        float f;
        float f2;
        this.f3697y = -1;
        if (this.f3675c != null) {
            m1623l(this.f3674b);
            float[] fArr = this.f3674b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC0955k0 abstractC0955k0 = this.f3685m;
        AbstractC0941g2 abstractC0941g2 = this.f3675c;
        List list = this.f3688p;
        int i = this.f3686n;
        abstractC0955k0.getClass();
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            C0927d0 c0927d0 = (C0927d0) list.get(i2);
            float f4 = c0927d0.f3553a;
            float f5 = c0927d0.f3555c;
            c0927d0.f3561i = f4 == f5 ? c0927d0.f3557e.f3605c.getTranslationX() : AbstractC1124a.m1195a(f5, f4, c0927d0.f3565m, f4);
            float f6 = c0927d0.f3554b;
            float f7 = c0927d0.f3556d;
            c0927d0.f3562j = f6 == f7 ? c0927d0.f3557e.f3605c.getTranslationY() : AbstractC1124a.m1195a(f7, f6, c0927d0.f3565m, f6);
            int save = canvas.save();
            abstractC0955k0.m1633h(canvas, recyclerView, c0927d0.f3557e, c0927d0.f3561i, c0927d0.f3562j, c0927d0.f3558f, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (abstractC0941g2 != null) {
            int save2 = canvas.save();
            abstractC0955k0.m1633h(canvas, recyclerView, abstractC0941g2, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: f */
    public void mo1463f(Canvas canvas, RecyclerView recyclerView, C0929d2 c0929d2) {
        boolean z = false;
        if (this.f3675c != null) {
            m1623l(this.f3674b);
            float[] fArr = this.f3674b;
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC0955k0 abstractC0955k0 = this.f3685m;
        AbstractC0941g2 abstractC0941g2 = this.f3675c;
        List list = this.f3688p;
        abstractC0955k0.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int save = canvas.save();
            View view = ((C0927d0) list.get(i)).f3557e.f3605c;
            canvas.restoreToCount(save);
        }
        if (abstractC0941g2 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C0927d0 c0927d0 = (C0927d0) list.get(i2);
            boolean z2 = c0927d0.f3564l;
            if (z2 && !c0927d0.f3560h) {
                list.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* renamed from: g */
    public final int m1628g(AbstractC0941g2 abstractC0941g2, int i) {
        if ((i & 12) != 0) {
            int i2 = this.f3680h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f3692t;
            if (velocityTracker != null && this.f3684l > -1) {
                AbstractC0955k0 abstractC0955k0 = this.f3685m;
                float f = this.f3679g;
                abstractC0955k0.getClass();
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.f3692t.getXVelocity(this.f3684l);
                float yVelocity = this.f3692t.getYVelocity(this.f3684l);
                int i3 = xVelocity > 0.0f ? 8 : 4;
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3) {
                    AbstractC0955k0 abstractC0955k02 = this.f3685m;
                    float f2 = this.f3678f;
                    abstractC0955k02.getClass();
                    if (abs >= f2 && abs > Math.abs(yVelocity)) {
                        return i3;
                    }
                }
            }
            this.f3685m.getClass();
            float width = this.f3690r.getWidth() * 0.5f;
            if ((i & i2) == 0 || Math.abs(this.f3680h) <= width) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: h */
    public void m1627h(int i, MotionEvent motionEvent, int i2) {
        int m1637d;
        View m1624k;
        if (this.f3675c == null && i == 2 && this.f3686n != 2) {
            this.f3685m.getClass();
            if (this.f3690r.getScrollState() == 1) {
                return;
            }
            AbstractC0980q1 layoutManager = this.f3690r.getLayoutManager();
            int i3 = this.f3684l;
            AbstractC0941g2 abstractC0941g2 = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f3676d);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f3677e);
                float f = this.f3689q;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.mo1532f()) && ((abs2 <= abs || !layoutManager.mo1530g()) && (m1624k = m1624k(motionEvent)) != null))) {
                    abstractC0941g2 = this.f3690r.m3190J(m1624k);
                }
            }
            if (abstractC0941g2 == null || (m1637d = (this.f3685m.m1637d(this.f3690r, abstractC0941g2) & 65280) >> 8) == 0) {
                return;
            }
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f2 = x - this.f3676d;
            float f3 = y - this.f3677e;
            float abs3 = Math.abs(f2);
            float abs4 = Math.abs(f3);
            float f4 = this.f3689q;
            if (abs3 >= f4 || abs4 >= f4) {
                if (abs3 > abs4) {
                    if (f2 < 0.0f && (m1637d & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (m1637d & 8) == 0) {
                        return;
                    }
                } else if (f3 < 0.0f && (m1637d & 1) == 0) {
                    return;
                } else {
                    if (f3 > 0.0f && (m1637d & 2) == 0) {
                        return;
                    }
                }
                this.f3681i = 0.0f;
                this.f3680h = 0.0f;
                this.f3684l = motionEvent.getPointerId(0);
                m1619p(abstractC0941g2, 1);
            }
        }
    }

    /* renamed from: i */
    public final int m1626i(AbstractC0941g2 abstractC0941g2, int i) {
        if ((i & 3) != 0) {
            int i2 = this.f3681i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f3692t;
            if (velocityTracker != null && this.f3684l > -1) {
                AbstractC0955k0 abstractC0955k0 = this.f3685m;
                float f = this.f3679g;
                abstractC0955k0.getClass();
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.f3692t.getXVelocity(this.f3684l);
                float yVelocity = this.f3692t.getYVelocity(this.f3684l);
                int i3 = yVelocity > 0.0f ? 2 : 1;
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2) {
                    AbstractC0955k0 abstractC0955k02 = this.f3685m;
                    float f2 = this.f3678f;
                    abstractC0955k02.getClass();
                    if (abs >= f2 && abs > Math.abs(xVelocity)) {
                        return i3;
                    }
                }
            }
            this.f3685m.getClass();
            float height = this.f3690r.getHeight() * 0.5f;
            if ((i & i2) == 0 || Math.abs(this.f3681i) <= height) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: j */
    public void m1625j(AbstractC0941g2 abstractC0941g2, boolean z) {
        C0927d0 c0927d0;
        int size = this.f3688p.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            c0927d0 = (C0927d0) this.f3688p.get(size);
        } while (c0927d0.f3557e != abstractC0941g2);
        c0927d0.f3563k |= z;
        if (!c0927d0.f3564l) {
            c0927d0.f3559g.cancel();
        }
        this.f3688p.remove(size);
    }

    /* renamed from: k */
    public View m1624k(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC0941g2 abstractC0941g2 = this.f3675c;
        if (abstractC0941g2 != null) {
            View view = abstractC0941g2.f3605c;
            if (m1622m(view, x, y, this.f3682j + this.f3680h, this.f3683k + this.f3681i)) {
                return view;
            }
        }
        for (int size = this.f3688p.size() - 1; size >= 0; size--) {
            C0927d0 c0927d0 = (C0927d0) this.f3688p.get(size);
            View view2 = c0927d0.f3557e.f3605c;
            if (m1622m(view2, x, y, c0927d0.f3561i, c0927d0.f3562j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f3690r;
        int m1698e = recyclerView.f761o.m1698e();
        while (true) {
            m1698e--;
            if (m1698e < 0) {
                return null;
            }
            View m1699d = recyclerView.f761o.m1699d(m1698e);
            float translationX = m1699d.getTranslationX();
            float translationY = m1699d.getTranslationY();
            if (x >= m1699d.getLeft() + translationX && x <= m1699d.getRight() + translationX && y >= m1699d.getTop() + translationY && y <= m1699d.getBottom() + translationY) {
                return m1699d;
            }
        }
    }

    /* renamed from: l */
    public final void m1623l(float[] fArr) {
        if ((this.f3687o & 12) != 0) {
            fArr[0] = (this.f3682j + this.f3680h) - this.f3675c.f3605c.getLeft();
        } else {
            fArr[0] = this.f3675c.f3605c.getTranslationX();
        }
        if ((this.f3687o & 3) != 0) {
            fArr[1] = (this.f3683k + this.f3681i) - this.f3675c.f3605c.getTop();
        } else {
            fArr[1] = this.f3675c.f3605c.getTranslationY();
        }
    }

    /* renamed from: n */
    public void m1621n(AbstractC0941g2 abstractC0941g2) {
        boolean z;
        List list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        if (!this.f3690r.isLayoutRequested() && this.f3686n == 2) {
            this.f3685m.getClass();
            int i3 = (int) (this.f3682j + this.f3680h);
            int i4 = (int) (this.f3683k + this.f3681i);
            if (Math.abs(i4 - abstractC0941g2.f3605c.getTop()) >= abstractC0941g2.f3605c.getHeight() * 0.5f || Math.abs(i3 - abstractC0941g2.f3605c.getLeft()) >= abstractC0941g2.f3605c.getWidth() * 0.5f) {
                List list2 = this.f3693u;
                if (list2 == null) {
                    this.f3693u = new ArrayList();
                    this.f3694v = new ArrayList();
                } else {
                    list2.clear();
                    this.f3694v.clear();
                }
                this.f3685m.getClass();
                int round = Math.round(this.f3682j + this.f3680h) - 0;
                int round2 = Math.round(this.f3683k + this.f3681i) - 0;
                int width = abstractC0941g2.f3605c.getWidth() + round + 0;
                int height = abstractC0941g2.f3605c.getHeight() + round2 + 0;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                AbstractC0980q1 layoutManager = this.f3690r.getLayoutManager();
                int m1492z = layoutManager.m1492z();
                int i7 = 0;
                while (i7 < m1492z) {
                    View m1494y = layoutManager.m1494y(i7);
                    if (m1494y != abstractC0941g2.f3605c && m1494y.getBottom() >= round2 && m1494y.getTop() <= height && m1494y.getRight() >= round && m1494y.getLeft() <= width) {
                        AbstractC0941g2 m3190J = this.f3690r.m3190J(m1494y);
                        this.f3685m.getClass();
                        int abs5 = Math.abs(i5 - ((m1494y.getRight() + m1494y.getLeft()) / 2));
                        int abs6 = Math.abs(i6 - ((m1494y.getBottom() + m1494y.getTop()) / 2));
                        int i8 = (abs6 * abs6) + (abs5 * abs5);
                        int size = this.f3693u.size();
                        i = round;
                        i2 = round2;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size) {
                            int i11 = size;
                            if (i8 <= ((Integer) this.f3694v.get(i9)).intValue()) {
                                break;
                            }
                            i10++;
                            i9++;
                            size = i11;
                        }
                        this.f3693u.add(i10, m3190J);
                        this.f3694v.add(i10, Integer.valueOf(i8));
                    } else {
                        i = round;
                        i2 = round2;
                    }
                    i7++;
                    round = i;
                    round2 = i2;
                }
                List list3 = this.f3693u;
                if (list3.size() == 0) {
                    return;
                }
                this.f3685m.getClass();
                int width2 = abstractC0941g2.f3605c.getWidth() + i3;
                int height2 = abstractC0941g2.f3605c.getHeight() + i4;
                int left2 = i3 - abstractC0941g2.f3605c.getLeft();
                int top2 = i4 - abstractC0941g2.f3605c.getTop();
                int size2 = list3.size();
                AbstractC0941g2 abstractC0941g22 = null;
                int i12 = -1;
                int i13 = 0;
                while (i13 < size2) {
                    AbstractC0941g2 abstractC0941g23 = (AbstractC0941g2) list3.get(i13);
                    if (left2 <= 0 || (right = abstractC0941g23.f3605c.getRight() - width2) >= 0) {
                        list = list3;
                    } else {
                        list = list3;
                        if (abstractC0941g23.f3605c.getRight() > abstractC0941g2.f3605c.getRight() && (abs4 = Math.abs(right)) > i12) {
                            i12 = abs4;
                            abstractC0941g22 = abstractC0941g23;
                        }
                    }
                    if (left2 < 0 && (left = abstractC0941g23.f3605c.getLeft() - i3) > 0 && abstractC0941g23.f3605c.getLeft() < abstractC0941g2.f3605c.getLeft() && (abs3 = Math.abs(left)) > i12) {
                        i12 = abs3;
                        abstractC0941g22 = abstractC0941g23;
                    }
                    if (top2 < 0 && (top = abstractC0941g23.f3605c.getTop() - i4) > 0 && abstractC0941g23.f3605c.getTop() < abstractC0941g2.f3605c.getTop() && (abs2 = Math.abs(top)) > i12) {
                        i12 = abs2;
                        abstractC0941g22 = abstractC0941g23;
                    }
                    if (top2 > 0 && (bottom = abstractC0941g23.f3605c.getBottom() - height2) < 0 && abstractC0941g23.f3605c.getBottom() > abstractC0941g2.f3605c.getBottom() && (abs = Math.abs(bottom)) > i12) {
                        i12 = abs;
                        abstractC0941g22 = abstractC0941g23;
                    }
                    i13++;
                    list3 = list;
                }
                if (abstractC0941g22 == null) {
                    this.f3693u.clear();
                    this.f3694v.clear();
                    return;
                }
                int m1668e = abstractC0941g22.m1668e();
                abstractC0941g2.m1668e();
                AbstractC0955k0 abstractC0955k0 = this.f3685m;
                RecyclerView recyclerView = this.f3690r;
                C1379w0 c1379w0 = (C1379w0) abstractC0955k0;
                c1379w0.getClass();
                int m1667f = abstractC0941g22.m1667f();
                if (m1667f >= c1379w0.f4610f.f4472d0.size()) {
                    z = false;
                } else {
                    int m1667f2 = abstractC0941g2.m1667f();
                    AbstractC1427e abstractC1427e = ((View$OnClickListenerC1264a1) abstractC0941g2).f4461z;
                    c1379w0.f4610f.f4465W.add(abstractC1427e.f4705a);
                    c1379w0.f4610f.f4471c0.mo1012r(abstractC1427e.f4705a, true);
                    Collections.swap(c1379w0.f4610f.f4472d0, m1667f2, m1667f);
                    recyclerView.getAdapter().f3589a.m1679c(m1667f2, m1667f);
                    recyclerView.m3153k0(m1667f);
                    AbstractC1268b1 abstractC1268b1 = c1379w0.f4610f;
                    if (!abstractC1268b1.f4468Z) {
                        AbstractC1430h abstractC1430h = (AbstractC1430h) abstractC1268b1.f4471c0;
                        List<AbstractC1427e> list4 = abstractC1268b1.f4472d0;
                        abstractC1430h.getClass();
                        ArrayList arrayList = new ArrayList(list4.size());
                        for (AbstractC1427e abstractC1427e2 : list4) {
                            arrayList.add(abstractC1427e2.f4705a);
                        }
                        HashSet hashSet = new HashSet();
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        int i14 = 0;
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!hashSet.contains(str)) {
                                hashSet.add(str);
                                if (abstractC1430h.f4721e.containsKey(str)) {
                                    AbstractC1427e abstractC1427e3 = (AbstractC1427e) abstractC1430h.f4721e.get(str);
                                    abstractC1430h.f4720d.remove(abstractC1427e3);
                                    abstractC1430h.f4720d.add(i14, abstractC1427e3);
                                    if (i14 > 0) {
                                        sb.append(",");
                                    }
                                    sb.append(str);
                                    i14++;
                                }
                            }
                        }
                        SharedPreferences.Editor edit = abstractC1430h.f4719c.edit();
                        edit.putString(abstractC1430h.f4716o, sb.toString());
                        edit.apply();
                    }
                    z = true;
                }
                if (z) {
                    AbstractC0955k0 abstractC0955k02 = this.f3685m;
                    RecyclerView recyclerView2 = this.f3690r;
                    abstractC0955k02.getClass();
                    AbstractC0980q1 layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) layoutManager2).m3204w1(abstractC0941g2.f3605c, abstractC0941g22.f3605c);
                        return;
                    }
                    if (layoutManager2.mo1532f()) {
                        if (layoutManager2.m1584E(abstractC0941g22.f3605c) <= recyclerView2.getPaddingLeft()) {
                            recyclerView2.m3153k0(m1668e);
                        }
                        if (layoutManager2.m1578H(abstractC0941g22.f3605c) >= recyclerView2.getWidth() - recyclerView2.getPaddingRight()) {
                            recyclerView2.m3153k0(m1668e);
                        }
                    }
                    if (layoutManager2.mo1530g()) {
                        if (layoutManager2.m1576I(abstractC0941g22.f3605c) <= recyclerView2.getPaddingTop()) {
                            recyclerView2.m3153k0(m1668e);
                        }
                        if (layoutManager2.m1588C(abstractC0941g22.f3605c) >= recyclerView2.getHeight() - recyclerView2.getPaddingBottom()) {
                            recyclerView2.m3153k0(m1668e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void m1620o(View view) {
        if (view == this.f3696x) {
            this.f3696x = null;
            if (this.f3695w != null) {
                this.f3690r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
        if ((r0 & r2) == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
        r2 = p010b.p083u.p084e.AbstractC0955k0.m1638c(r2, p010b.p046j.p058l.AbstractC0605j0.m2241q(r21.f3690r));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (r2 > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
        if ((r0 & r2) == 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cc  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1619p(AbstractC0941g2 abstractC0941g2, int i) {
        boolean z;
        boolean z2;
        ViewParent parent;
        AbstractC0941g2 abstractC0941g22;
        int i2;
        int i3;
        float signum;
        float f;
        long j;
        if (abstractC0941g2 == this.f3675c && i == this.f3686n) {
            return;
        }
        this.f3672D = Long.MIN_VALUE;
        int i4 = this.f3686n;
        m1625j(abstractC0941g2, true);
        this.f3686n = i;
        if (i == 2) {
            if (abstractC0941g2 != null) {
                this.f3696x = abstractC0941g2.f3605c;
                if (Build.VERSION.SDK_INT < 21) {
                    if (this.f3695w == null) {
                        this.f3695w = new C0935f0(this);
                    }
                    this.f3690r.setChildDrawingOrderCallback(this.f3695w);
                }
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i5 = (1 << ((i * 8) + 8)) - 1;
        AbstractC0941g2 abstractC0941g23 = this.f3675c;
        if (abstractC0941g23 != null) {
            if (abstractC0941g23.f3605c.getParent() != null) {
                if (i4 == 2) {
                    i3 = 0;
                } else {
                    if (this.f3686n != 2) {
                        int m1635f = this.f3685m.m1635f(this.f3690r, abstractC0941g23);
                        int m1639b = (this.f3685m.m1639b(m1635f, AbstractC0605j0.m2241q(this.f3690r)) & 65280) >> 8;
                        if (m1639b != 0) {
                            int i6 = (m1635f & 65280) >> 8;
                            if (Math.abs(this.f3680h) > Math.abs(this.f3681i)) {
                                i2 = m1628g(abstractC0941g23, m1639b);
                                if (i2 <= 0) {
                                    i2 = m1626i(abstractC0941g23, m1639b);
                                }
                                i3 = i2;
                            } else {
                                i2 = m1626i(abstractC0941g23, m1639b);
                                if (i2 <= 0) {
                                    i2 = m1628g(abstractC0941g23, m1639b);
                                    if (i2 > 0) {
                                    }
                                }
                                i3 = i2;
                            }
                        }
                    }
                    i2 = 0;
                    i3 = i2;
                }
                VelocityTracker velocityTracker = this.f3692t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f3692t = null;
                }
                if (i3 == 1 || i3 == 2) {
                    signum = Math.signum(this.f3681i) * this.f3690r.getHeight();
                    f = 0.0f;
                } else {
                    f = (i3 == 4 || i3 == 8 || i3 == 16 || i3 == 32) ? Math.signum(this.f3680h) * this.f3690r.getWidth() : 0.0f;
                    signum = 0.0f;
                }
                int i7 = i4 == 2 ? 8 : i3 > 0 ? 2 : 4;
                m1623l(this.f3674b);
                float[] fArr = this.f3674b;
                int i8 = i7;
                C0927d0 c0927d0 = new C0927d0(this, abstractC0941g23, i7, i4, fArr[0], fArr[1], f, signum, i3, abstractC0941g23);
                AbstractC0955k0 abstractC0955k0 = this.f3685m;
                RecyclerView recyclerView = this.f3690r;
                abstractC0955k0.getClass();
                AbstractC0956k1 itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = i8 == 8 ? 200L : 250L;
                } else if (i8 == 8) {
                    j = itemAnimator.f3662e;
                } else {
                    j = itemAnimator.f3661d;
                }
                c0927d0.f3559g.setDuration(j);
                this.f3688p.add(c0927d0);
                abstractC0941g23.m1652u(false);
                c0927d0.f3559g.start();
                abstractC0941g22 = null;
                z = true;
            } else {
                m1620o(abstractC0941g23.f3605c);
                this.f3685m.m1640a(this.f3690r, abstractC0941g23);
                abstractC0941g22 = null;
                z = false;
            }
            this.f3675c = abstractC0941g22;
        } else {
            z = false;
        }
        if (abstractC0941g2 != null) {
            this.f3687o = (this.f3685m.m1637d(this.f3690r, abstractC0941g2) & i5) >> (this.f3686n * 8);
            this.f3682j = abstractC0941g2.f3605c.getLeft();
            this.f3683k = abstractC0941g2.f3605c.getTop();
            this.f3675c = abstractC0941g2;
            if (i == 2) {
                z2 = false;
                abstractC0941g2.f3605c.performHapticFeedback(0);
                parent = this.f3690r.getParent();
                if (parent != null) {
                    if (this.f3675c != null) {
                        z2 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z2);
                }
                if (!z) {
                    this.f3690r.getLayoutManager().f3779h = true;
                }
                this.f3685m.getClass();
                this.f3690r.invalidate();
            }
        }
        z2 = false;
        parent = this.f3690r.getParent();
        if (parent != null) {
        }
        if (!z) {
        }
        this.f3685m.getClass();
        this.f3690r.invalidate();
    }

    /* renamed from: q */
    public void m1618q(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f3676d;
        this.f3680h = f;
        this.f3681i = y - this.f3677e;
        if ((i & 4) == 0) {
            this.f3680h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f3680h = Math.min(0.0f, this.f3680h);
        }
        if ((i & 1) == 0) {
            this.f3681i = Math.max(0.0f, this.f3681i);
        }
        if ((i & 2) == 0) {
            this.f3681i = Math.min(0.0f, this.f3681i);
        }
    }
}