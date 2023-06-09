package p093c.p145g.p146a.p147a.p156i0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p093c.p145g.p146a.p147a.AbstractC1835e;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.p161m.AbstractC1946a;

/* renamed from: c.g.a.a.i0.k */
/* loaded from: classes.dex */
public class C1898k extends AbstractC1879a0 {

    /* renamed from: d */
    public final TextWatcher f5803d;

    /* renamed from: e */
    public final View.OnFocusChangeListener f5804e;

    /* renamed from: f */
    public final InterfaceC1913r0 f5805f;

    /* renamed from: g */
    public final InterfaceC1915s0 f5806g;

    /* renamed from: h */
    public AnimatorSet f5807h;

    /* renamed from: i */
    public ValueAnimator f5808i;

    public C1898k(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5803d = new C1878a(this);
        this.f5804e = new View$OnFocusChangeListenerC1880b(this);
        this.f5805f = new C1882c(this);
        this.f5806g = new C1886e(this);
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.AbstractC1879a0
    /* renamed from: a */
    public void mo684a() {
        this.f5755a.setEndIconDrawable(AbstractC0142b.m3000b(this.f5756b, AbstractC1835e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f5755a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(AbstractC1924j.clear_text_end_icon_content_description));
        this.f5755a.setEndIconOnClickListener(new View$OnClickListenerC1888f(this));
        this.f5755a.m263a(this.f5805f);
        this.f5755a.f6887h0.add(this.f5806g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(AbstractC1946a.f5897d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C1896j(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = AbstractC1946a.f5894a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new C1894i(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5807h = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f5807h.addListener(new C1890g(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new C1894i(this));
        this.f5808i = ofFloat3;
        ofFloat3.addListener(new C1892h(this));
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.AbstractC1879a0
    /* renamed from: c */
    public void mo691c(boolean z) {
        if (this.f5755a.getSuffixText() == null) {
            return;
        }
        m690d(z);
    }

    /* renamed from: d */
    public final void m690d(boolean z) {
        boolean z2 = this.f5755a.m253k() == z;
        if (z && !this.f5807h.isRunning()) {
            this.f5808i.cancel();
            this.f5807h.start();
            if (z2) {
                this.f5807h.end();
            }
        } else if (z) {
        } else {
            this.f5807h.cancel();
            this.f5808i.start();
            if (z2) {
                this.f5808i.end();
            }
        }
    }
}