package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p093c.p145g.p146a.p147a.p171w.AbstractC2024j0;
import p093c.p145g.p146a.p147a.p171w.C2006a0;

/* loaded from: classes.dex */
public final class Month implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C2006a0();

    /* renamed from: b */
    public final Calendar f6805b;

    /* renamed from: c */
    public final int f6806c;

    /* renamed from: d */
    public final int f6807d;

    /* renamed from: e */
    public final int f6808e;

    /* renamed from: f */
    public final int f6809f;

    /* renamed from: g */
    public final long f6810g;

    /* renamed from: h */
    public String f6811h;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m551b = AbstractC2024j0.m551b(calendar);
        this.f6805b = m551b;
        this.f6806c = m551b.get(2);
        this.f6807d = m551b.get(1);
        this.f6808e = m551b.getMaximum(7);
        this.f6809f = m551b.getActualMaximum(5);
        this.f6810g = m551b.getTimeInMillis();
    }

    /* renamed from: l */
    public static Month m283l(int i, int i2) {
        Calendar m548e = AbstractC2024j0.m548e();
        m548e.set(1, i);
        m548e.set(2, i2);
        return new Month(m548e);
    }

    /* renamed from: m */
    public static Month m282m(long j) {
        Calendar m548e = AbstractC2024j0.m548e();
        m548e.setTimeInMillis(j);
        return new Month(m548e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.f6806c == month.f6806c && this.f6807d == month.f6807d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6806c), Integer.valueOf(this.f6807d)});
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // java.lang.Comparable
    /* renamed from: k */
    public int compareTo(Month month) {
        return this.f6805b.compareTo(month.f6805b);
    }

    /* renamed from: n */
    public int m281n() {
        int firstDayOfWeek = this.f6805b.get(7) - this.f6805b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f6808e : firstDayOfWeek;
    }

    /* renamed from: o */
    public String m280o(Context context) {
        if (this.f6811h == null) {
            long timeInMillis = this.f6805b.getTimeInMillis();
            this.f6811h = DateUtils.formatDateTime(context, timeInMillis - TimeZone.getDefault().getOffset(timeInMillis), 36);
        }
        return this.f6811h;
    }

    /* renamed from: p */
    public Month m279p(int i) {
        Calendar m551b = AbstractC2024j0.m551b(this.f6805b);
        m551b.add(2, i);
        return new Month(m551b);
    }

    /* renamed from: q */
    public int m278q(Month month) {
        if (this.f6805b instanceof GregorianCalendar) {
            return (month.f6806c - this.f6806c) + ((month.f6807d - this.f6807d) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6807d);
        parcel.writeInt(this.f6806c);
    }
}