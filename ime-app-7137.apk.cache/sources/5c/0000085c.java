package p093c.p145g.p146a.p147a.p171w;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p145g.p146a.p147a.AbstractC1868h;

/* renamed from: c.g.a.a.w.b0 */
/* loaded from: classes.dex */
public class C2008b0 extends BaseAdapter {

    /* renamed from: b */
    public static final int f6122b = AbstractC2024j0.m548e().getMaximum(4);

    /* renamed from: c */
    public final Month f6123c;

    /* renamed from: d */
    public final DateSelector f6124d;

    /* renamed from: e */
    public Collection f6125e;

    /* renamed from: f */
    public C2011d f6126f;

    /* renamed from: g */
    public final CalendarConstraints f6127g;

    public C2008b0(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints) {
        this.f6123c = month;
        this.f6124d = dateSelector;
        this.f6127g = calendarConstraints;
        this.f6125e = dateSelector.m286j();
    }

    /* renamed from: a */
    public int m566a(int i) {
        return m565b() + (i - 1);
    }

    /* renamed from: b */
    public int m565b() {
        return this.f6123c.m281n();
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f6123c.m281n() || i > m563d()) {
            return null;
        }
        Month month = this.f6123c;
        Calendar m551b = AbstractC2024j0.m551b(month.f6805b);
        m551b.set(5, (i - month.m281n()) + 1);
        return Long.valueOf(m551b.getTimeInMillis());
    }

    /* renamed from: d */
    public int m563d() {
        return (this.f6123c.m281n() + this.f6123c.f6809f) - 1;
    }

    /* renamed from: e */
    public final void m562e(TextView textView, long j) {
        C2009c c2009c;
        if (textView == null) {
            return;
        }
        boolean z = true;
        if (j >= ((DateValidatorPointForward) this.f6127g.f6798d).f6802b) {
            textView.setEnabled(true);
            Iterator it = this.f6124d.m286j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else {
                    if (AbstractC2024j0.m552a(j) == AbstractC2024j0.m552a(((Long) it.next()).longValue())) {
                        break;
                    }
                }
            }
            if (z) {
                c2009c = this.f6126f.f6137b;
            } else {
                int i = (AbstractC2024j0.m549d().getTimeInMillis() > j ? 1 : (AbstractC2024j0.m549d().getTimeInMillis() == j ? 0 : -1));
                C2011d c2011d = this.f6126f;
                c2009c = i == 0 ? c2011d.f6138c : c2011d.f6136a;
            }
        } else {
            textView.setEnabled(false);
            c2009c = this.f6126f.f6142g;
        }
        c2009c.m559b(textView);
    }

    /* renamed from: f */
    public final void m561f(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m282m(j).equals(this.f6123c)) {
            Calendar m551b = AbstractC2024j0.m551b(this.f6123c.f6805b);
            m551b.setTimeInMillis(j);
            m562e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m566a(m551b.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return m565b() + this.f6123c.f6809f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f6123c.f6808e;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0115  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View getView(int i, View view, ViewGroup viewGroup) {
        Long item;
        CharSequence format;
        Context context = viewGroup.getContext();
        if (this.f6126f == null) {
            this.f6126f = new C2011d(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC1868h.mtrl_calendar_day, viewGroup, false);
        }
        int m565b = i - m565b();
        if (m565b >= 0) {
            Month month = this.f6123c;
            if (m565b < month.f6809f) {
                int i2 = m565b + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                Calendar m551b = AbstractC2024j0.m551b(this.f6123c.f6805b);
                m551b.set(5, i2);
                long timeInMillis = m551b.getTimeInMillis();
                int i3 = this.f6123c.f6807d;
                Calendar m549d = AbstractC2024j0.m549d();
                m549d.set(5, 1);
                Calendar m551b2 = AbstractC2024j0.m551b(m549d);
                m551b2.get(2);
                int i4 = m551b2.get(1);
                m551b2.getMaximum(7);
                m551b2.getActualMaximum(5);
                m551b2.getTimeInMillis();
                if (i3 == i4) {
                    Locale locale = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        AtomicReference atomicReference = AbstractC2024j0.f6161a;
                        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                        format = instanceForSkeleton.format(new Date(timeInMillis));
                    } else {
                        AtomicReference atomicReference2 = AbstractC2024j0.f6161a;
                        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                        dateInstance.setTimeZone(AbstractC2024j0.m550c());
                        format = dateInstance.format(new Date(timeInMillis));
                    }
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        AtomicReference atomicReference3 = AbstractC2024j0.f6161a;
                        DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                        instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                        format = instanceForSkeleton2.format(new Date(timeInMillis));
                    } else {
                        AtomicReference atomicReference4 = AbstractC2024j0.f6161a;
                        java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                        dateInstance2.setTimeZone(AbstractC2024j0.m550c());
                        format = dateInstance2.format(new Date(timeInMillis));
                    }
                }
                textView.setContentDescription(format);
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    m562e(textView, item.longValue());
                }
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i);
        if (item != null) {
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}