package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1877i;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p163o.C1957b;

/* loaded from: classes.dex */
public final class BadgeDrawable$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1957b();

    /* renamed from: b */
    public int f6653b;

    /* renamed from: c */
    public int f6654c;

    /* renamed from: d */
    public int f6655d;

    /* renamed from: e */
    public int f6656e;

    /* renamed from: f */
    public int f6657f;

    /* renamed from: g */
    public CharSequence f6658g;

    /* renamed from: h */
    public int f6659h;

    /* renamed from: i */
    public int f6660i;

    /* renamed from: j */
    public int f6661j;

    /* renamed from: k */
    public boolean f6662k;

    /* renamed from: l */
    public int f6663l;

    /* renamed from: m */
    public int f6664m;

    public BadgeDrawable$SavedState(Context context) {
        this.f6655d = 255;
        this.f6656e = -1;
        int i = AbstractC1926k.TextAppearance_MaterialComponents_Badge;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1940l.TextAppearance);
        obtainStyledAttributes.getDimension(AbstractC1940l.TextAppearance_android_textSize, 0.0f);
        ColorStateList m1262q = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_textColor);
        AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_textColorHint);
        AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_textColorLink);
        obtainStyledAttributes.getInt(AbstractC1940l.TextAppearance_android_textStyle, 0);
        obtainStyledAttributes.getInt(AbstractC1940l.TextAppearance_android_typeface, 1);
        int i2 = AbstractC1940l.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : AbstractC1940l.TextAppearance_android_fontFamily;
        obtainStyledAttributes.getResourceId(i2, 0);
        obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(AbstractC1940l.TextAppearance_textAllCaps, false);
        AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.TextAppearance_android_shadowColor);
        obtainStyledAttributes.getFloat(AbstractC1940l.TextAppearance_android_shadowDx, 0.0f);
        obtainStyledAttributes.getFloat(AbstractC1940l.TextAppearance_android_shadowDy, 0.0f);
        obtainStyledAttributes.getFloat(AbstractC1940l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC1940l.MaterialTextAppearance);
            int i3 = AbstractC1940l.MaterialTextAppearance_android_letterSpacing;
            obtainStyledAttributes2.hasValue(i3);
            obtainStyledAttributes2.getFloat(i3, 0.0f);
            obtainStyledAttributes2.recycle();
        }
        this.f6654c = m1262q.getDefaultColor();
        this.f6658g = context.getString(AbstractC1924j.mtrl_badge_numberless_content_description);
        this.f6659h = AbstractC1877i.mtrl_badge_content_description;
        this.f6660i = AbstractC1924j.mtrl_exceed_max_badge_number_content_description;
        this.f6662k = true;
    }

    public BadgeDrawable$SavedState(Parcel parcel) {
        this.f6655d = 255;
        this.f6656e = -1;
        this.f6653b = parcel.readInt();
        this.f6654c = parcel.readInt();
        this.f6655d = parcel.readInt();
        this.f6656e = parcel.readInt();
        this.f6657f = parcel.readInt();
        this.f6658g = parcel.readString();
        this.f6659h = parcel.readInt();
        this.f6661j = parcel.readInt();
        this.f6663l = parcel.readInt();
        this.f6664m = parcel.readInt();
        this.f6662k = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6653b);
        parcel.writeInt(this.f6654c);
        parcel.writeInt(this.f6655d);
        parcel.writeInt(this.f6656e);
        parcel.writeInt(this.f6657f);
        parcel.writeString(this.f6658g.toString());
        parcel.writeInt(this.f6659h);
        parcel.writeInt(this.f6661j);
        parcel.writeInt(this.f6663l);
        parcel.writeInt(this.f6664m);
        parcel.writeInt(this.f6662k ? 1 : 0);
    }
}