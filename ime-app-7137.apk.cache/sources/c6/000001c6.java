package p010b.p016c.p026q;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import p010b.p016c.p024p.InterfaceC0162c;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0179d0;
import p010b.p016c.p024p.p025m.SubMenuC0195l0;

/* renamed from: b.c.q.u3 */
/* loaded from: classes.dex */
public class C0322u3 implements InterfaceC0179d0 {

    /* renamed from: b */
    public C0199p f1777b;

    /* renamed from: c */
    public C0202s f1778c;

    /* renamed from: d */
    public final /* synthetic */ Toolbar f1779d;

    public C0322u3(Toolbar toolbar) {
        this.f1779d = toolbar;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: a */
    public void mo649a(C0199p c0199p, boolean z) {
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: c */
    public int mo648c() {
        return 0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: d */
    public boolean mo647d() {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: e */
    public Parcelable mo646e() {
        return null;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: g */
    public void mo645g(Context context, C0199p c0199p) {
        C0202s c0202s;
        C0199p c0199p2 = this.f1777b;
        if (c0199p2 != null && (c0202s = this.f1778c) != null) {
            c0199p2.mo2935d(c0202s);
        }
        this.f1777b = c0199p;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: h */
    public void mo644h(Parcelable parcelable) {
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: i */
    public boolean mo643i(C0199p c0199p, C0202s c0202s) {
        View view = this.f1779d.f375j;
        if (view instanceof InterfaceC0162c) {
            ((InterfaceC0162c) view).mo2895e();
        }
        Toolbar toolbar = this.f1779d;
        toolbar.removeView(toolbar.f375j);
        Toolbar toolbar2 = this.f1779d;
        toolbar2.removeView(toolbar2.f374i);
        Toolbar toolbar3 = this.f1779d;
        toolbar3.f375j = null;
        int size = toolbar3.f358F.size();
        while (true) {
            size--;
            if (size < 0) {
                toolbar3.f358F.clear();
                this.f1778c = null;
                this.f1779d.requestLayout();
                c0202s.f1402C = false;
                c0202s.f1417n.m2922q(false);
                return true;
            }
            toolbar3.addView((View) toolbar3.f358F.get(size));
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: j */
    public boolean mo642j(C0199p c0199p, C0202s c0202s) {
        this.f1779d.m3392c();
        ViewParent parent = this.f1779d.f374i.getParent();
        Toolbar toolbar = this.f1779d;
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f374i);
            }
            Toolbar toolbar2 = this.f1779d;
            toolbar2.addView(toolbar2.f374i);
        }
        this.f1779d.f375j = c0202s.getActionView();
        this.f1778c = c0202s;
        ViewParent parent2 = this.f1779d.f375j.getParent();
        Toolbar toolbar3 = this.f1779d;
        if (parent2 != toolbar3) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar3.f375j);
            }
            C0327v3 generateDefaultLayoutParams = this.f1779d.generateDefaultLayoutParams();
            Toolbar toolbar4 = this.f1779d;
            generateDefaultLayoutParams.f868a = 8388611 | (toolbar4.f380o & 112);
            generateDefaultLayoutParams.f1783b = 2;
            toolbar4.f375j.setLayoutParams(generateDefaultLayoutParams);
            Toolbar toolbar5 = this.f1779d;
            toolbar5.addView(toolbar5.f375j);
        }
        Toolbar toolbar6 = this.f1779d;
        int childCount = toolbar6.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar6.getChildAt(childCount);
            if (((C0327v3) childAt.getLayoutParams()).f1783b != 2 && childAt != toolbar6.f367b) {
                toolbar6.removeViewAt(childCount);
                toolbar6.f358F.add(childAt);
            }
        }
        this.f1779d.requestLayout();
        c0202s.f1402C = true;
        c0202s.f1417n.m2922q(false);
        View view = this.f1779d.f375j;
        if (view instanceof InterfaceC0162c) {
            ((InterfaceC0162c) view).mo2896c();
        }
        return true;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: m */
    public boolean mo641m(SubMenuC0195l0 subMenuC0195l0) {
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0179d0
    /* renamed from: n */
    public void mo640n(boolean z) {
        if (this.f1778c != null) {
            C0199p c0199p = this.f1777b;
            boolean z2 = false;
            if (c0199p != null) {
                int size = c0199p.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f1777b.getItem(i) == this.f1778c) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z2) {
                return;
            }
            mo643i(this.f1777b, this.f1778c);
        }
    }
}