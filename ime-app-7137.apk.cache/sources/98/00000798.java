package p093c.p145g.p146a.p147a.p149b0;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;

/* renamed from: c.g.a.a.b0.h */
/* loaded from: classes.dex */
public class C1812h extends C0568b {

    /* renamed from: d */
    public final /* synthetic */ NavigationMenuItemView f5545d;

    public C1812h(NavigationMenuItemView navigationMenuItemView) {
        this.f5545d = navigationMenuItemView;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        c0580e.f2703b.setCheckable(this.f5545d.f6831z);
    }
}