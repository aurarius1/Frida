package p093c.p145g.p146a.p147a.p171w;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0941g2;
import p010b.p083u.p084e.C0984r1;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;

/* renamed from: c.g.a.a.w.e0 */
/* loaded from: classes.dex */
public class C2014e0 extends AbstractC0932e1 {

    /* renamed from: d */
    public final Context f6146d;

    /* renamed from: e */
    public final CalendarConstraints f6147e;

    /* renamed from: f */
    public final DateSelector f6148f;

    /* renamed from: g */
    public final C2023j f6149g;

    /* renamed from: h */
    public final int f6150h;

    public C2014e0(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, C2023j c2023j) {
        Month month = calendarConstraints.f6796b;
        Month month2 = calendarConstraints.f6797c;
        Month month3 = calendarConstraints.f6799e;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = C2008b0.f6122b;
        int i2 = C2034q.f6178X;
        Resources resources = context.getResources();
        int i3 = AbstractC1829d.mtrl_calendar_day_height;
        int dimensionPixelSize = i * resources.getDimensionPixelSize(i3);
        int dimensionPixelSize2 = C2040w.m532V0(context) ? context.getResources().getDimensionPixelSize(i3) : 0;
        this.f6146d = context;
        this.f6150h = dimensionPixelSize + dimensionPixelSize2;
        this.f6147e = calendarConstraints;
        this.f6148f = dateSelector;
        this.f6149g = c2023j;
        m1682g(true);
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: a */
    public int mo543a() {
        return this.f6147e.f6801g;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: b */
    public long mo558b(int i) {
        return this.f6147e.f6796b.m279p(i).f6805b.getTimeInMillis();
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: e */
    public void mo542e(AbstractC0941g2 abstractC0941g2, int i) {
        C2012d0 c2012d0 = (C2012d0) abstractC0941g2;
        Month m279p = this.f6147e.f6796b.m279p(i);
        c2012d0.f6144v.setText(m279p.m280o(c2012d0.f3605c.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c2012d0.f6145w.findViewById(AbstractC1840f.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && m279p.equals(materialCalendarGridView.getAdapter2().f6123c)) {
            materialCalendarGridView.invalidate();
            C2008b0 adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l : adapter2.f6125e) {
                adapter2.m561f(materialCalendarGridView, l.longValue());
            }
            DateSelector dateSelector = adapter2.f6124d;
            if (dateSelector != null) {
                for (Long l2 : dateSelector.m286j()) {
                    adapter2.m561f(materialCalendarGridView, l2.longValue());
                }
                adapter2.f6125e = adapter2.f6124d.m286j();
            }
        } else {
            C2008b0 c2008b0 = new C2008b0(m279p, this.f6148f, this.f6147e);
            materialCalendarGridView.setNumColumns(m279p.f6808e);
            materialCalendarGridView.setAdapter((ListAdapter) c2008b0);
        }
        materialCalendarGridView.setOnItemClickListener(new C2010c0(this, materialCalendarGridView));
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: f */
    public AbstractC0941g2 mo541f(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC1868h.mtrl_calendar_month_labeled, viewGroup, false);
        if (C2040w.m532V0(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new C0984r1(-1, this.f6150h));
            return new C2012d0(linearLayout, true);
        }
        return new C2012d0(linearLayout, false);
    }

    /* renamed from: h */
    public Month m557h(int i) {
        return this.f6147e.f6796b.m279p(i);
    }

    /* renamed from: i */
    public int m556i(Month month) {
        return this.f6147e.f6796b.m278q(month);
    }
}