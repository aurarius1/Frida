package p010b.p067m.p068d;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: b.m.d.z1 */
/* loaded from: classes.dex */
public class C0765z1 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Object f3255a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3256b;

    /* renamed from: c */
    public final /* synthetic */ Object f3257c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f3258d;

    /* renamed from: e */
    public final /* synthetic */ Object f3259e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f3260f;

    /* renamed from: g */
    public final /* synthetic */ C0679c2 f3261g;

    public C0765z1(C0679c2 c0679c2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f3261g = c0679c2;
        this.f3255a = obj;
        this.f3256b = arrayList;
        this.f3257c = obj2;
        this.f3258d = arrayList2;
        this.f3259e = obj3;
        this.f3260f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        Object obj = this.f3255a;
        if (obj != null) {
            this.f3261g.mo1314p(obj, this.f3256b, null);
        }
        Object obj2 = this.f3257c;
        if (obj2 != null) {
            this.f3261g.mo1314p(obj2, this.f3258d, null);
        }
        Object obj3 = this.f3259e;
        if (obj3 != null) {
            this.f3261g.mo1314p(obj3, this.f3260f, null);
        }
    }
}