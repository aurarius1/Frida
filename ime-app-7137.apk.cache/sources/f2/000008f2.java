package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p093c.p145g.p146a.p147a.p171w.C2005a;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2005a();

    /* renamed from: b */
    public final Month f6796b;

    /* renamed from: c */
    public final Month f6797c;

    /* renamed from: d */
    public final DateValidator f6798d;

    /* renamed from: e */
    public Month f6799e;

    /* renamed from: f */
    public final int f6800f;

    /* renamed from: g */
    public final int f6801g;

    /* loaded from: classes.dex */
    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C2005a c2005a) {
        this.f6796b = month;
        this.f6797c = month2;
        this.f6799e = month3;
        this.f6798d = dateValidator;
        if (month3 != null && month.f6805b.compareTo(month3.f6805b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f6805b.compareTo(month2.f6805b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f6801g = month.m278q(month2) + 1;
        this.f6800f = (month2.f6807d - month.f6807d) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.f6796b.equals(calendarConstraints.f6796b) && this.f6797c.equals(calendarConstraints.f6797c) && AbstractC0022t.m3463w(this.f6799e, calendarConstraints.f6799e) && this.f6798d.equals(calendarConstraints.f6798d);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6796b, this.f6797c, this.f6799e, this.f6798d});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6796b, 0);
        parcel.writeParcelable(this.f6797c, 0);
        parcel.writeParcelable(this.f6799e, 0);
        parcel.writeParcelable(this.f6798d, 0);
    }
}