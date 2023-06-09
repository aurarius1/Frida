package p010b.p067m.p068d;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: b.m.d.x1 */
/* loaded from: classes.dex */
public class C0759x1 extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ Rect f3203a;

    public C0759x1(C0679c2 c0679c2, Rect rect) {
        this.f3203a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        return this.f3203a;
    }
}