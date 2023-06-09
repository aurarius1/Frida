package p010b.p046j.p058l;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b.j.l.n */
/* loaded from: classes.dex */
public class C0612n {

    /* renamed from: a */
    public ViewParent f2769a;

    /* renamed from: b */
    public ViewParent f2770b;

    /* renamed from: c */
    public final View f2771c;

    /* renamed from: d */
    public boolean f2772d;

    /* renamed from: e */
    public int[] f2773e;

    public C0612n(View view) {
        this.f2771c = view;
    }

    /* renamed from: a */
    public boolean m2227a(float f, float f2, boolean z) {
        ViewParent m2221g;
        if (!this.f2772d || (m2221g = m2221g(0)) == null) {
            return false;
        }
        View view = this.f2771c;
        if (Build.VERSION.SDK_INT < 21) {
            if (m2221g instanceof InterfaceC0618q) {
                return ((InterfaceC0618q) m2221g).onNestedFling(view, f, f2, z);
            }
            return false;
        }
        try {
            return m2221g.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + m2221g + " does not implement interface method onNestedFling";
            return false;
        }
    }

    /* renamed from: b */
    public boolean m2226b(float f, float f2) {
        ViewParent m2221g;
        if (!this.f2772d || (m2221g = m2221g(0)) == null) {
            return false;
        }
        View view = this.f2771c;
        if (Build.VERSION.SDK_INT < 21) {
            if (m2221g instanceof InterfaceC0618q) {
                return ((InterfaceC0618q) m2221g).onNestedPreFling(view, f, f2);
            }
            return false;
        }
        try {
            return m2221g.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + m2221g + " does not implement interface method onNestedPreFling";
            return false;
        }
    }

    /* renamed from: c */
    public boolean m2225c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m2221g;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f2772d || (m2221g = m2221g(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f2771c.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f2773e == null) {
                    this.f2773e = new int[2];
                }
                iArr3 = this.f2773e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f2771c;
            if (m2221g instanceof InterfaceC0614o) {
                ((InterfaceC0614o) m2221g).mo2214c(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        m2221g.onNestedPreScroll(view, i, i2, iArr3);
                    } catch (AbstractMethodError unused) {
                        String str = "ViewParent " + m2221g + " does not implement interface method onNestedPreScroll";
                    }
                } else if (m2221g instanceof InterfaceC0618q) {
                    ((InterfaceC0618q) m2221g).onNestedPreScroll(view, i, i2, iArr3);
                }
            }
            if (iArr2 != null) {
                this.f2771c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }

    /* renamed from: d */
    public void m2224d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m2222f(i, i2, i3, i4, null, i5, iArr2);
    }

    /* renamed from: e */
    public boolean m2223e(int i, int i2, int i3, int i4, int[] iArr) {
        return m2222f(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: f */
    public final boolean m2222f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m2221g;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f2772d || (m2221g = m2221g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2771c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f2773e == null) {
                this.f2773e = new int[2];
            }
            int[] iArr4 = this.f2773e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f2771c;
        if (m2221g instanceof InterfaceC0616p) {
            ((InterfaceC0616p) m2221g).mo2204d(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (m2221g instanceof InterfaceC0614o) {
                ((InterfaceC0614o) m2221g).mo2213e(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        m2221g.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError unused) {
                        String str = "ViewParent " + m2221g + " does not implement interface method onNestedScroll";
                    }
                } else if (m2221g instanceof InterfaceC0618q) {
                    ((InterfaceC0618q) m2221g).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr != null) {
            this.f2771c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: g */
    public final ViewParent m2221g(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f2770b;
        }
        return this.f2769a;
    }

    /* renamed from: h */
    public boolean m2220h(int i) {
        return m2221g(i) != null;
    }

    /* renamed from: i */
    public void m2219i(boolean z) {
        if (this.f2772d) {
            View view = this.f2771c;
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof InterfaceC0610m) {
                ((InterfaceC0610m) view).stopNestedScroll();
            }
        }
        this.f2772d = z;
    }

    /* renamed from: j */
    public boolean m2218j(int i, int i2) {
        boolean z;
        if (m2221g(i2) != null) {
            return true;
        }
        if (this.f2772d) {
            View view = this.f2771c;
            for (ViewParent parent = this.f2771c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f2771c;
                boolean z2 = parent instanceof InterfaceC0614o;
                if (z2) {
                    z = ((InterfaceC0614o) parent).mo2212f(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z = parent.onStartNestedScroll(view, view2, i);
                            } catch (AbstractMethodError unused) {
                                String str = "ViewParent " + parent + " does not implement interface method onStartNestedScroll";
                            }
                        } else if (parent instanceof InterfaceC0618q) {
                            z = ((InterfaceC0618q) parent).onStartNestedScroll(view, view2, i);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f2769a = parent;
                    } else if (i2 == 1) {
                        this.f2770b = parent;
                    }
                    View view3 = this.f2771c;
                    if (z2) {
                        ((InterfaceC0614o) parent).mo2216a(view, view3, i, i2);
                    } else if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i);
                            } catch (AbstractMethodError unused2) {
                                String str2 = "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted";
                            }
                        } else if (parent instanceof InterfaceC0618q) {
                            ((InterfaceC0618q) parent).onNestedScrollAccepted(view, view3, i);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m2217k(int i) {
        ViewParent m2221g = m2221g(i);
        if (m2221g != null) {
            View view = this.f2771c;
            if (m2221g instanceof InterfaceC0614o) {
                ((InterfaceC0614o) m2221g).mo2215b(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        m2221g.onStopNestedScroll(view);
                    } catch (AbstractMethodError unused) {
                        String str = "ViewParent " + m2221g + " does not implement interface method onStopNestedScroll";
                    }
                } else if (m2221g instanceof InterfaceC0618q) {
                    ((InterfaceC0618q) m2221g).onStopNestedScroll(view);
                }
            }
            if (i == 0) {
                this.f2769a = null;
            } else if (i != 1) {
            } else {
                this.f2770b = null;
            }
        }
    }
}