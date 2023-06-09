package p010b.p067m.p068d;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: b.m.d.b2 */
/* loaded from: classes.dex */
public class C0675b2 extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ Rect f2919a;

    public C0675b2(C0679c2 c0679c2, Rect rect) {
        this.f2919a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f2919a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f2919a;
    }
}