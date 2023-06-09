package p093c.p145g.p146a.p147a.p171w;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0941g2;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.AbstractC1924j;

/* renamed from: c.g.a.a.w.m0 */
/* loaded from: classes.dex */
public class C2030m0 extends AbstractC0932e1 {

    /* renamed from: d */
    public final C2034q f6172d;

    public C2030m0(C2034q c2034q) {
        this.f6172d = c2034q;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: a */
    public int mo543a() {
        return this.f6172d.f6181a0.f6800f;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: e */
    public void mo542e(AbstractC0941g2 abstractC0941g2, int i) {
        C2028l0 c2028l0 = (C2028l0) abstractC0941g2;
        int i2 = this.f6172d.f6181a0.f6796b.f6807d + i;
        String string = c2028l0.f6168v.getContext().getString(AbstractC1924j.mtrl_picker_navigate_to_year_description);
        c2028l0.f6168v.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        c2028l0.f6168v.setContentDescription(String.format(string, Integer.valueOf(i2)));
        C2011d c2011d = this.f6172d.f6184d0;
        Calendar m549d = AbstractC2024j0.m549d();
        C2009c c2009c = m549d.get(1) == i2 ? c2011d.f6141f : c2011d.f6139d;
        for (Long l : this.f6172d.f6180Z.m286j()) {
            m549d.setTimeInMillis(l.longValue());
            if (m549d.get(1) == i2) {
                c2009c = c2011d.f6140e;
            }
        }
        c2009c.m559b(c2028l0.f6168v);
        c2028l0.f6168v.setOnClickListener(new View$OnClickListenerC2026k0(this, i2));
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: f */
    public AbstractC0941g2 mo541f(ViewGroup viewGroup, int i) {
        return new C2028l0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC1868h.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: h */
    public int m540h(int i) {
        return i - this.f6172d.f6181a0.f6796b.f6807d;
    }
}