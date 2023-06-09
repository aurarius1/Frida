package p010b.p091z.p092a;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;

/* renamed from: b.z.a.i */
/* loaded from: classes.dex */
public class C1118i extends C0568b {

    /* renamed from: d */
    public final /* synthetic */ AbstractC1123n f4174d;

    public C1118i(AbstractC1123n abstractC1123n) {
        this.f4174d = abstractC1123n;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: c */
    public void mo794c(View view, AccessibilityEvent accessibilityEvent) {
        AbstractC1110a abstractC1110a;
        this.f2662b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC1123n.class.getName());
        AbstractC1110a abstractC1110a2 = this.f4174d.f4209j;
        boolean z = true;
        accessibilityEvent.setScrollable((abstractC1110a2 == null || abstractC1110a2.mo1093c() <= 1) ? false : false);
        if (accessibilityEvent.getEventType() != 4096 || (abstractC1110a = this.f4174d.f4209j) == null) {
            return;
        }
        accessibilityEvent.setItemCount(abstractC1110a.mo1093c());
        accessibilityEvent.setFromIndex(this.f4174d.f4210k);
        accessibilityEvent.setToIndex(this.f4174d.f4210k);
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        c0580e.f2703b.setClassName(AbstractC1123n.class.getName());
        AbstractC1110a abstractC1110a = this.f4174d.f4209j;
        c0580e.f2703b.setScrollable(abstractC1110a != null && abstractC1110a.mo1093c() > 1);
        if (this.f4174d.canScrollHorizontally(1)) {
            c0580e.f2703b.addAction(4096);
        }
        if (this.f4174d.canScrollHorizontally(-1)) {
            c0580e.f2703b.addAction(8192);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: g */
    public boolean mo1219g(View view, int i, Bundle bundle) {
        AbstractC1123n abstractC1123n;
        int i2;
        if (super.mo1219g(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.f4174d.canScrollHorizontally(-1)) {
                return false;
            }
            abstractC1123n = this.f4174d;
            i2 = abstractC1123n.f4210k - 1;
        } else if (!this.f4174d.canScrollHorizontally(1)) {
            return false;
        } else {
            abstractC1123n = this.f4174d;
            i2 = abstractC1123n.f4210k + 1;
        }
        abstractC1123n.setCurrentItem(i2);
        return true;
    }
}