package p093c.p145g.p146a.p147a.p171w;

import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p010b.p083u.p084e.AbstractC0996u1;

/* renamed from: c.g.a.a.w.m */
/* loaded from: classes.dex */
public class C2029m extends AbstractC0996u1 {

    /* renamed from: a */
    public final /* synthetic */ C2014e0 f6169a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f6170b;

    /* renamed from: c */
    public final /* synthetic */ C2034q f6171c;

    public C2029m(C2034q c2034q, C2014e0 c2014e0, MaterialButton materialButton) {
        this.f6171c = c2034q;
        this.f6169a = c2014e0;
        this.f6170b = materialButton;
    }

    @Override // p010b.p083u.p084e.AbstractC0996u1
    /* renamed from: a */
    public void mo545a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            CharSequence text = this.f6170b.getText();
            if (Build.VERSION.SDK_INT >= 16) {
                recyclerView.announceForAccessibility(text);
            } else {
                recyclerView.sendAccessibilityEvent(2048);
            }
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0996u1
    /* renamed from: b */
    public void mo544b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager m538R0 = this.f6171c.m538R0();
        int m3216k1 = i < 0 ? m538R0.m3216k1() : m538R0.m3215l1();
        this.f6171c.f6182b0 = this.f6169a.m557h(m3216k1);
        MaterialButton materialButton = this.f6170b;
        C2014e0 c2014e0 = this.f6169a;
        materialButton.setText(c2014e0.f6147e.f6796b.m279p(m3216k1).m280o(c2014e0.f6146d));
    }
}