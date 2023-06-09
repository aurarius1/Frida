package p093c.p145g.p146a.p147a.p171w;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.AbstractC0462b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0569b0;
import p010b.p083u.p084e.AbstractC0941g2;
import p093c.p145g.p146a.p147a.AbstractC1840f;

/* renamed from: c.g.a.a.w.d0 */
/* loaded from: classes.dex */
public class C2012d0 extends AbstractC0941g2 {

    /* renamed from: v */
    public final TextView f6144v;

    /* renamed from: w */
    public final MaterialCalendarGridView f6145w;

    public C2012d0(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(AbstractC1840f.month_title);
        this.f6144v = textView;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        new C0569b0(AbstractC0462b.tag_accessibility_heading, Boolean.class, 28).m2327e(textView, Boolean.TRUE);
        this.f6145w = (MaterialCalendarGridView) linearLayout.findViewById(AbstractC1840f.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}