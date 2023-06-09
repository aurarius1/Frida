package p093c.p145g.p146a.p147a.p167s;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p064l.p066b.AbstractC0663h;

/* renamed from: c.g.a.a.s.d */
/* loaded from: classes.dex */
public class C1981d extends AbstractC0663h {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f6007a;

    public C1981d(BottomSheetBehavior bottomSheetBehavior) {
        this.f6007a = bottomSheetBehavior;
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: a */
    public int mo635a(View view, int i, int i2) {
        return view.getLeft();
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: b */
    public int mo634b(View view, int i, int i2) {
        int m343G = this.f6007a.m343G();
        BottomSheetBehavior bottomSheetBehavior = this.f6007a;
        return AbstractC0022t.m3489j(i, m343G, bottomSheetBehavior.f6728w ? bottomSheetBehavior.f6696G : bottomSheetBehavior.f6726u);
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: d */
    public int mo633d(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f6007a;
        return bottomSheetBehavior.f6728w ? bottomSheetBehavior.f6696G : bottomSheetBehavior.f6726u;
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: f */
    public void mo632f(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f6007a;
            if (bottomSheetBehavior.f6730y) {
                bottomSheetBehavior.m339K(1);
            }
        }
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: g */
    public void mo631g(View view, int i, int i2, int i3, int i4) {
        this.f6007a.m345E(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (java.lang.Math.abs(r8.getTop() - r7.f6007a.f6722q) < java.lang.Math.abs(r8.getTop() - r7.f6007a.f6724s)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        r9 = r7.f6007a.f6722q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (java.lang.Math.abs(r9 - r7.f6007a.f6724s) < java.lang.Math.abs(r9 - r7.f6007a.f6726u)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (r9 < java.lang.Math.abs(r9 - r10.f6726u)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
        if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.f6007a.f6726u)) goto L33;
     */
    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo630h(View view, float f, float f2) {
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        int i;
        int i2 = 4;
        if (f2 < 0.0f) {
            bottomSheetBehavior = this.f6007a;
            if (!bottomSheetBehavior.f6708c) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = this.f6007a;
                int i3 = bottomSheetBehavior3.f6724s;
                if (top > i3) {
                    i = i3;
                    i2 = 6;
                } else {
                    i = bottomSheetBehavior3.f6722q;
                    i2 = 3;
                }
            }
            i = bottomSheetBehavior.f6723r;
            i2 = 3;
        } else {
            BottomSheetBehavior bottomSheetBehavior4 = this.f6007a;
            if (bottomSheetBehavior4.f6728w && bottomSheetBehavior4.m336N(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top2 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior5 = this.f6007a;
                    if (!(top2 > (bottomSheetBehavior5.m343G() + bottomSheetBehavior5.f6696G) / 2)) {
                        bottomSheetBehavior = this.f6007a;
                        if (!bottomSheetBehavior.f6708c) {
                        }
                        i = bottomSheetBehavior.f6723r;
                        i2 = 3;
                    }
                }
                i = this.f6007a.f6696G;
                i2 = 5;
            } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                bottomSheetBehavior2 = this.f6007a;
                if (!bottomSheetBehavior2.f6708c) {
                    int top3 = view.getTop();
                }
                i = bottomSheetBehavior2.f6726u;
            } else {
                int top4 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior6 = this.f6007a;
                if (!bottomSheetBehavior6.f6708c) {
                    int i4 = bottomSheetBehavior6.f6724s;
                    if (top4 < i4) {
                    }
                    i = this.f6007a.f6724s;
                    i2 = 6;
                } else if (Math.abs(top4 - bottomSheetBehavior6.f6723r) < Math.abs(top4 - this.f6007a.f6726u)) {
                    bottomSheetBehavior = this.f6007a;
                    i = bottomSheetBehavior.f6723r;
                    i2 = 3;
                }
                bottomSheetBehavior2 = this.f6007a;
                i = bottomSheetBehavior2.f6726u;
            }
        }
        this.f6007a.m335O(view, i2, i, true);
    }

    @Override // p010b.p064l.p066b.AbstractC0663h
    /* renamed from: i */
    public boolean mo629i(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f6007a;
        int i2 = bottomSheetBehavior.f6731z;
        if (i2 == 1 || bottomSheetBehavior.f6703N) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f6701L == i) {
            WeakReference weakReference = bottomSheetBehavior.f6698I;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = this.f6007a.f6697H;
        return weakReference2 != null && weakReference2.get() == view;
    }
}