package p010b.p046j.p058l.p059d1;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: b.j.l.d1.a */
/* loaded from: classes.dex */
public final class C0576a extends ClickableSpan {

    /* renamed from: b */
    public final int f2685b;

    /* renamed from: c */
    public final C0580e f2686c;

    /* renamed from: d */
    public final int f2687d;

    public C0576a(int i, C0580e c0580e, int i2) {
        this.f2685b = i;
        this.f2686c = c0580e;
        this.f2687d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2685b);
        C0580e c0580e = this.f2686c;
        int i = this.f2687d;
        c0580e.getClass();
        if (Build.VERSION.SDK_INT >= 16) {
            c0580e.f2703b.performAction(i, bundle);
        }
    }
}