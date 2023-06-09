package p093c.p145g.p146a.p147a.p171w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.AbstractC1924j;

/* renamed from: c.g.a.a.w.f */
/* loaded from: classes.dex */
public class C2015f extends BaseAdapter {

    /* renamed from: b */
    public static final int f6151b;

    /* renamed from: c */
    public final Calendar f6152c;

    /* renamed from: d */
    public final int f6153d;

    /* renamed from: e */
    public final int f6154e;

    static {
        f6151b = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C2015f() {
        Calendar m548e = AbstractC2024j0.m548e();
        this.f6152c = m548e;
        this.f6153d = m548e.getMaximum(7);
        this.f6154e = m548e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6153d;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.f6153d;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f6154e;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC1868h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f6152c;
        int i2 = i + this.f6154e;
        int i3 = this.f6153d;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f6152c.getDisplayName(7, f6151b, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(AbstractC1924j.mtrl_picker_day_of_week_column_header), this.f6152c.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}