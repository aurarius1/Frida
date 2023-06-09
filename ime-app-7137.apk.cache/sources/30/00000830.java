package p093c.p145g.p146a.p147a.p165q;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* renamed from: c.g.a.a.q.a */
/* loaded from: classes.dex */
public class View$OnLayoutChangeListenerC1964a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar$Behavior f5948a;

    public View$OnLayoutChangeListenerC1964a(BottomAppBar$Behavior bottomAppBar$Behavior) {
        this.f5948a = bottomAppBar$Behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractC1965b abstractC1965b = (AbstractC1965b) this.f5948a.f6676e.get();
        view.removeOnLayoutChangeListener(this);
    }
}