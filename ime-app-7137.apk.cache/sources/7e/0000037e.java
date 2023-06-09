package p010b.p067m.p068d;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: b.m.d.y1 */
/* loaded from: classes.dex */
public class C0762y1 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ View f3205a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3206b;

    public C0762y1(C0679c2 c0679c2, View view, ArrayList arrayList) {
        this.f3205a = view;
        this.f3206b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f3205a.setVisibility(8);
        int size = this.f3206b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f3206b.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}