package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;
import p093c.p145g.p146a.p147a.p171w.C2013e;

/* loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = new C2013e();

    /* renamed from: b */
    public final long f6802b;

    public DateValidatorPointForward(long j) {
        this.f6802b = j;
    }

    public DateValidatorPointForward(long j, C2013e c2013e) {
        this.f6802b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f6802b == ((DateValidatorPointForward) obj).f6802b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6802b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6802b);
    }
}