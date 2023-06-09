package p093c.p145g.p146a.p147a.p171w;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;

/* renamed from: c.g.a.a.w.k0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC2026k0 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f6165b;

    /* renamed from: c */
    public final /* synthetic */ C2030m0 f6166c;

    public View$OnClickListenerC2026k0(C2030m0 c2030m0, int i) {
        this.f6166c = c2030m0;
        this.f6165b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Month m283l = Month.m283l(this.f6165b, this.f6166c.f6172d.f6182b0.f6806c);
        CalendarConstraints calendarConstraints = this.f6166c.f6172d.f6181a0;
        if (m283l.compareTo(calendarConstraints.f6796b) < 0) {
            m283l = calendarConstraints.f6796b;
        } else if (m283l.compareTo(calendarConstraints.f6797c) > 0) {
            m283l = calendarConstraints.f6797c;
        }
        this.f6166c.f6172d.m536T0(m283l);
        this.f6166c.f6172d.m535U0(1);
    }
}