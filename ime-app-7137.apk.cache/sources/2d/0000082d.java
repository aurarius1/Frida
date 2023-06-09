package p093c.p145g.p146a.p147a.p164p;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p064l.p066b.AbstractC0663h;

/* renamed from: c.g.a.a.p.b */
/* loaded from: classes.dex */
public class C1961b extends AbstractC0663h {

    /* renamed from: a */
    public int f5941a;

    /* renamed from: b */
    public int f5942b = -1;

    /* renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f5943c;

    public C1961b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f5943c = swipeDismissBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5 = r2.f5941a;
        r3 = r3.getWidth() + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r5 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r5 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r5 = r2.f5941a - r3.getWidth();
        r3 = r2.f5941a;
     */
    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo635a(View view, int i, int i2) {
        int width;
        int width2;
        boolean z = AbstractC0605j0.m2241q(view) == 1;
        int i3 = this.f5943c.f6670c;
        if (i3 != 0) {
            if (i3 != 1) {
                width = this.f5941a - view.getWidth();
                width2 = view.getWidth() + this.f5941a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: b */
    public int mo634b(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: c */
    public int mo660c(View view) {
        return view.getWidth();
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: e */
    public void mo659e(View view, int i) {
        this.f5942b = i;
        this.f5941a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: f */
    public void mo632f(int i) {
        this.f5943c.getClass();
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: g */
    public void mo631g(View view, int i, int i2, int i3, int i4) {
        float width = (view.getWidth() * this.f5943c.f6672e) + this.f5941a;
        float width2 = (view.getWidth() * this.f5943c.f6673f) + this.f5941a;
        float f = i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m349C(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (java.lang.Math.abs(r7.getLeft() - r6.f5941a) >= java.lang.Math.round(r7.getWidth() * r6.f5943c.f6671d)) goto L37;
     */
    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo630h(View view, float f, float f2) {
        boolean z;
        int i;
        this.f5942b = -1;
        int width = view.getWidth();
        boolean z2 = false;
        if (f != 0.0f) {
            boolean z3 = AbstractC0605j0.m2241q(view) == 1;
            int i2 = this.f5943c.f6670c;
            if (i2 != 2) {
                z = i2 == 0 ? false : false;
            }
            z = true;
        }
        if (z) {
            int left = view.getLeft();
            int i3 = this.f5941a;
            i = left < i3 ? i3 - width : i3 + width;
            z2 = true;
        } else {
            i = this.f5941a;
        }
        if (this.f5943c.f6668a.m2125t(i, view.getTop())) {
            AbstractC0605j0.m2276G(view, new RunnableC1963d(this.f5943c, view, z2));
        } else if (z2) {
            this.f5943c.getClass();
        }
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: i */
    public boolean mo629i(View view, int i) {
        int i2 = this.f5942b;
        return (i2 == -1 || i2 == i) && this.f5943c.mo273B(view);
    }
}