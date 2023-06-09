package p093c.p145g.p146a.p147a.p171w;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;

/* renamed from: c.g.a.a.w.b */
/* loaded from: classes.dex */
public final class C2007b {

    /* renamed from: a */
    public static final long f6116a = AbstractC2024j0.m552a(Month.m283l(1900, 0).f6810g);

    /* renamed from: b */
    public static final long f6117b = AbstractC2024j0.m552a(Month.m283l(2100, 11).f6810g);

    /* renamed from: c */
    public long f6118c;

    /* renamed from: d */
    public long f6119d;

    /* renamed from: e */
    public Long f6120e;

    /* renamed from: f */
    public CalendarConstraints.DateValidator f6121f;

    public C2007b(CalendarConstraints calendarConstraints) {
        this.f6118c = f6116a;
        this.f6119d = f6117b;
        this.f6121f = new DateValidatorPointForward(Long.MIN_VALUE);
        this.f6118c = calendarConstraints.f6796b.f6810g;
        this.f6119d = calendarConstraints.f6797c.f6810g;
        this.f6120e = Long.valueOf(calendarConstraints.f6799e.f6810g);
        this.f6121f = calendarConstraints.f6798d;
    }
}