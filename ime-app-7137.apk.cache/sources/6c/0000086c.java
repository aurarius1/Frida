package p093c.p145g.p146a.p147a.p171w;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.g.a.a.w.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC2024j0 {

    /* renamed from: a */
    public static AtomicReference f6161a = new AtomicReference();

    /* renamed from: a */
    public static long m552a(long j) {
        Calendar m548e = m548e();
        m548e.setTimeInMillis(j);
        return m551b(m548e).getTimeInMillis();
    }

    /* renamed from: b */
    public static Calendar m551b(Calendar calendar) {
        Calendar m547f = m547f(calendar);
        Calendar m548e = m548e();
        m548e.set(m547f.get(1), m547f.get(2), m547f.get(5));
        return m548e;
    }

    /* renamed from: c */
    public static TimeZone m550c() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: d */
    public static Calendar m549d() {
        AbstractC2022i0 abstractC2022i0 = (AbstractC2022i0) f6161a.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(m550c());
        return calendar;
    }

    /* renamed from: e */
    public static Calendar m548e() {
        return m547f(null);
    }

    /* renamed from: f */
    public static Calendar m547f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m550c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}