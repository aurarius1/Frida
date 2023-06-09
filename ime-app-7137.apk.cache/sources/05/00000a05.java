package net.evendanan.pixel;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import java.util.Locale;
import p010b.p082t.C0881l0;
import p204f.p205a.p209b.AbstractC2298i;
import p204f.p205a.p209b.AbstractC2299j;
import p204f.p205a.p209b.AbstractC2301l;

/* loaded from: classes.dex */
public class SlidePreference extends Preference implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: P */
    public TextView f7482P;

    /* renamed from: Q */
    public TextView f7483Q;

    /* renamed from: R */
    public TextView f7484R;

    /* renamed from: S */
    public String f7485S;

    /* renamed from: T */
    public String f7486T;

    /* renamed from: U */
    public final int f7487U;

    /* renamed from: V */
    public final int f7488V;

    /* renamed from: W */
    public final int f7489W;

    /* renamed from: X */
    public int f7490X;

    public SlidePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f600G = AbstractC2299j.slide_pref;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2301l.SlidePreferenceAttributes);
        this.f7487U = obtainStyledAttributes.getInteger(AbstractC2301l.SlidePreferenceAttributes_android_defaultValue, 0);
        this.f7488V = obtainStyledAttributes.getInteger(AbstractC2301l.SlidePreferenceAttributes_slideMaximum, 100);
        this.f7489W = obtainStyledAttributes.getInteger(AbstractC2301l.SlidePreferenceAttributes_slideMinimum, 0);
        String string = obtainStyledAttributes.getString(AbstractC2301l.SlidePreferenceAttributes_valueStringTemplate);
        this.f7486T = string;
        if (TextUtils.isEmpty(string)) {
            this.f7486T = "%d";
        }
        int i = AbstractC2301l.SlidePreferenceAttributes_android_title;
        int resourceId = obtainStyledAttributes.getResourceId(i, 0);
        this.f7485S = resourceId == 0 ? obtainStyledAttributes.getString(i) : context.getString(resourceId);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: B */
    public void mo1B(boolean z, Object obj) {
        this.f7490X = z ? m3287K() ? m3283f(this.f7487U) : this.f7489W : ((Integer) obj).intValue();
        int i = this.f7490X;
        int i2 = this.f7488V;
        if (i > i2) {
            this.f7490X = i2;
        }
        int i3 = this.f7490X;
        int i4 = this.f7489W;
        if (i3 < i4) {
            this.f7490X = i4;
        }
        TextView textView = this.f7483Q;
        if (textView != null) {
            textView.setText(String.format(Locale.ROOT, this.f7486T, Integer.valueOf(this.f7490X)));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.f7489W;
        int i3 = i + i2;
        this.f7490X = i3;
        int i4 = this.f7488V;
        if (i3 > i4) {
            this.f7490X = i4;
        }
        if (this.f7490X < i2) {
            this.f7490X = i2;
        }
        if (m3287K()) {
            m3293D(this.f7490X);
        }
        m3285a(Integer.valueOf(this.f7490X));
        TextView textView = this.f7483Q;
        if (textView != null) {
            textView.setText(String.format(Locale.ROOT, this.f7486T, Integer.valueOf(this.f7490X)));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        super.mo0r(c0881l0);
        if (m3287K()) {
            this.f7490X = m3283f(this.f7487U);
        }
        this.f7483Q = (TextView) c0881l0.m1743x(AbstractC2298i.pref_current_value);
        this.f7482P = (TextView) c0881l0.m1743x(AbstractC2298i.pref_max_value);
        this.f7484R = (TextView) c0881l0.m1743x(AbstractC2298i.pref_min_value);
        TextView textView = this.f7483Q;
        Locale locale = Locale.ROOT;
        textView.setText(String.format(locale, this.f7486T, Integer.valueOf(this.f7490X)));
        ((TextView) c0881l0.m1743x(AbstractC2298i.pref_title)).setText(this.f7485S);
        this.f7482P.setText(Integer.toString(this.f7488V));
        this.f7484R.setText(Integer.toString(this.f7489W));
        int i = this.f7490X;
        int i2 = this.f7488V;
        if (i > i2) {
            this.f7490X = i2;
        }
        int i3 = this.f7490X;
        int i4 = this.f7489W;
        if (i3 < i4) {
            this.f7490X = i4;
        }
        TextView textView2 = this.f7483Q;
        if (textView2 != null) {
            textView2.setText(String.format(locale, this.f7486T, Integer.valueOf(this.f7490X)));
        }
        SeekBar seekBar = (SeekBar) c0881l0.m1743x(AbstractC2298i.pref_seekbar);
        seekBar.setMax(this.f7488V - this.f7489W);
        seekBar.setProgress(this.f7490X - this.f7489W);
        seekBar.setOnSeekBarChangeListener(this);
    }
}