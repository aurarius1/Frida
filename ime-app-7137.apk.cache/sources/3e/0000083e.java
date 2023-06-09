package p093c.p145g.p146a.p147a.p167s;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: c.g.a.a.s.a */
/* loaded from: classes.dex */
public class RunnableC1978a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f6002b;

    /* renamed from: c */
    public final /* synthetic */ int f6003c;

    /* renamed from: d */
    public final /* synthetic */ BottomSheetBehavior f6004d;

    public RunnableC1978a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f6004d = bottomSheetBehavior;
        this.f6002b = view;
        this.f6003c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6004d.m338L(this.f6002b, this.f6003c);
    }
}