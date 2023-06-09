package p010b.p067m.p068d;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: b.m.d.k2 */
/* loaded from: classes.dex */
public class C0711k2 extends AbstractComponentCallbacksC0763z {

    /* renamed from: W */
    public final Handler f3037W = new Handler();

    /* renamed from: X */
    public final Runnable f3038X = new RunnableC0703i2(this);

    /* renamed from: Y */
    public final AdapterView.OnItemClickListener f3039Y = new C0707j2(this);

    /* renamed from: Z */
    public ListAdapter f3040Z;

    /* renamed from: a0 */
    public ListView f3041a0;

    /* renamed from: b0 */
    public View f3042b0;

    /* renamed from: c0 */
    public TextView f3043c0;

    /* renamed from: d0 */
    public View f3044d0;

    /* renamed from: e0 */
    public View f3045e0;

    /* renamed from: f0 */
    public boolean f3046f0;

    /* renamed from: Q0 */
    public final void m2015Q0() {
        if (this.f3041a0 != null) {
            return;
        }
        View view = this.f3216I;
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f3041a0 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.f3043c0 = textView;
            if (textView == null) {
                this.f3042b0 = view.findViewById(16908292);
            } else {
                textView.setVisibility(8);
            }
            this.f3044d0 = view.findViewById(16711682);
            this.f3045e0 = view.findViewById(16711683);
            View findViewById = view.findViewById(16908298);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f3041a0 = listView;
            View view2 = this.f3042b0;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f3046f0 = true;
        this.f3041a0.setOnItemClickListener(this.f3039Y);
        ListAdapter listAdapter = this.f3040Z;
        if (listAdapter != null) {
            this.f3040Z = null;
            m2013S0(listAdapter);
        } else if (this.f3044d0 != null) {
            m2012T0(false, false);
        }
        this.f3037W.post(this.f3038X);
    }

    /* renamed from: R0 */
    public void m2014R0() {
    }

    /* renamed from: S0 */
    public void m2013S0(ListAdapter listAdapter) {
        boolean z = this.f3040Z != null;
        this.f3040Z = listAdapter;
        ListView listView = this.f3041a0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f3046f0 || z) {
                return;
            }
            m2012T0(true, m1909C0().getWindowToken() != null);
        }
    }

    /* renamed from: T0 */
    public final void m2012T0(boolean z, boolean z2) {
        m2015Q0();
        View view = this.f3044d0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f3046f0 == z) {
            return;
        }
        this.f3046f0 = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(m1866k(), 17432577));
                this.f3045e0.startAnimation(AnimationUtils.loadAnimation(m1866k(), 17432576));
            } else {
                view.clearAnimation();
                this.f3045e0.clearAnimation();
            }
            this.f3044d0.setVisibility(8);
            this.f3045e0.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(m1866k(), 17432576));
            this.f3045e0.startAnimation(AnimationUtils.loadAnimation(m1866k(), 17432577));
        } else {
            view.clearAnimation();
            this.f3045e0.clearAnimation();
        }
        this.f3044d0.setVisibility(0);
        this.f3045e0.setVisibility(8);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context m1911B0 = m1911B0();
        FrameLayout frameLayout = new FrameLayout(m1911B0);
        LinearLayout linearLayout = new LinearLayout(m1911B0);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(m1911B0, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(m1911B0);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(m1911B0);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(m1911B0);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Z */
    public void mo1096Z() {
        this.f3037W.removeCallbacks(this.f3038X);
        this.f3041a0 = null;
        this.f3046f0 = false;
        this.f3045e0 = null;
        this.f3044d0 = null;
        this.f3042b0 = null;
        this.f3043c0 = null;
        this.f3214G = true;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        m2015Q0();
    }
}