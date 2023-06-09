package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p010b.p037h.p043c.C0439i;
import p010b.p037h.p043c.C0440j;
import p010b.p037h.p043c.C0444n;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.p159k0.C1937k;
import p093c.p145g.p146a.p147a.p159k0.C1938l;
import p093c.p145g.p146a.p147a.p159k0.View$OnClickListenerC1936j;
import p093c.p145g.p146a.p147a.p159k0.View$OnTouchListenerC1939m;

/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: s */
    public static final /* synthetic */ int f6960s = 0;

    /* renamed from: t */
    public final Chip f6961t;

    /* renamed from: u */
    public final Chip f6962u;

    /* renamed from: v */
    public final MaterialButtonToggleGroup f6963v;

    /* renamed from: w */
    public final View.OnClickListener f6964w;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View$OnClickListenerC1936j view$OnClickListenerC1936j = new View$OnClickListenerC1936j(this);
        this.f6964w = view$OnClickListenerC1936j;
        LayoutInflater.from(context).inflate(AbstractC1868h.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(AbstractC1840f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(AbstractC1840f.material_clock_period_toggle);
        this.f6963v = materialButtonToggleGroup;
        materialButtonToggleGroup.f6759g.add(new C1937k(this));
        Chip chip = (Chip) findViewById(AbstractC1840f.material_minute_tv);
        this.f6961t = chip;
        Chip chip2 = (Chip) findViewById(AbstractC1840f.material_hour_tv);
        this.f6962u = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(AbstractC1840f.material_clock_hand);
        View$OnTouchListenerC1939m view$OnTouchListenerC1939m = new View$OnTouchListenerC1939m(this, new GestureDetector(getContext(), new C1938l(this)));
        chip.setOnTouchListener(view$OnTouchListenerC1939m);
        chip2.setOnTouchListener(view$OnTouchListenerC1939m);
        int i = AbstractC1840f.selection_type;
        chip.setTag(i, 12);
        chip2.setTag(i, 10);
        chip.setOnClickListener(view$OnClickListenerC1936j);
        chip2.setOnClickListener(view$OnClickListenerC1936j);
    }

    /* renamed from: h */
    public final void m224h() {
        if (this.f6963v.getVisibility() == 0) {
            C0444n c0444n = new C0444n();
            c0444n.m2452b(this);
            char c = AbstractC0605j0.m2241q(this) == 0 ? (char) 2 : (char) 1;
            int i = AbstractC1840f.material_clock_display;
            if (c0444n.f2406e.containsKey(Integer.valueOf(i))) {
                C0439i c0439i = (C0439i) c0444n.f2406e.get(Integer.valueOf(i));
                switch (c) {
                    case 1:
                        C0440j c0440j = c0439i.f2309d;
                        c0440j.f2356j = -1;
                        c0440j.f2354i = -1;
                        c0440j.f2317E = -1;
                        c0440j.f2323K = -1;
                        break;
                    case 2:
                        C0440j c0440j2 = c0439i.f2309d;
                        c0440j2.f2360l = -1;
                        c0440j2.f2358k = -1;
                        c0440j2.f2318F = -1;
                        c0440j2.f2325M = -1;
                        break;
                    case 3:
                        C0440j c0440j3 = c0439i.f2309d;
                        c0440j3.f2362n = -1;
                        c0440j3.f2361m = -1;
                        c0440j3.f2319G = -1;
                        c0440j3.f2324L = -1;
                        break;
                    case 4:
                        C0440j c0440j4 = c0439i.f2309d;
                        c0440j4.f2363o = -1;
                        c0440j4.f2364p = -1;
                        c0440j4.f2320H = -1;
                        c0440j4.f2326N = -1;
                        break;
                    case 5:
                        c0439i.f2309d.f2365q = -1;
                        break;
                    case 6:
                        C0440j c0440j5 = c0439i.f2309d;
                        c0440j5.f2366r = -1;
                        c0440j5.f2367s = -1;
                        c0440j5.f2322J = -1;
                        c0440j5.f2328P = -1;
                        break;
                    case 7:
                        C0440j c0440j6 = c0439i.f2309d;
                        c0440j6.f2368t = -1;
                        c0440j6.f2369u = -1;
                        c0440j6.f2321I = -1;
                        c0440j6.f2327O = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            c0444n.m2453a(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m224h();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m224h();
        }
    }
}