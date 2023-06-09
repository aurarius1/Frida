package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.customview.view.AbsSavedState;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p026q.C0241f0;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.p149b0.C1805a;
import p093c.p145g.p146a.p147a.p149b0.C1806b;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0241f0 implements Checkable {

    /* renamed from: d */
    public static final int[] f6816d = {16842912};

    /* renamed from: e */
    public boolean f6817e;

    /* renamed from: f */
    public boolean f6818f;

    /* renamed from: g */
    public boolean f6819g;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1806b();

        /* renamed from: d */
        public boolean f6820d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6820d = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeInt(this.f6820d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0075a.imageButtonStyle);
        this.f6818f = true;
        this.f6819g = true;
        AbstractC0605j0.m2269N(this, new C1805a(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f6817e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f6817e) {
            int[] iArr = f6816d;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f511c);
        setChecked(savedState.f6820d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6820d = this.f6817e;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f6818f != z) {
            this.f6818f = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f6818f || this.f6817e == z) {
            return;
        }
        this.f6817e = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f6819g = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f6819g) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f6817e);
    }
}