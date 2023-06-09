package p093c.p097b.p128x;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.anysoftkeyboard.keyboards.views.CandidateView;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p130z.p132r0.InterfaceC1742q0;

/* renamed from: c.b.x.x2 */
/* loaded from: classes.dex */
public class C1647x2 implements InterfaceC1742q0 {

    /* renamed from: a */
    public final Runnable f5079a;

    /* renamed from: b */
    public Animation f5080b;

    /* renamed from: c */
    public Animation f5081c;

    /* renamed from: d */
    public Animation f5082d;

    /* renamed from: e */
    public Animation f5083e;

    /* renamed from: f */
    public View f5084f;

    /* renamed from: g */
    public View f5085g;

    /* renamed from: h */
    public CandidateView f5086h;

    /* renamed from: i */
    public final Runnable f5087i = new Runnable() { // from class: c.b.x.u0
        @Override // java.lang.Runnable
        public final void run() {
            C1647x2 c1647x2 = C1647x2.this;
            c1647x2.f5082d.reset();
            c1647x2.f5085g.startAnimation(c1647x2.f5082d);
        }
    };

    public C1647x2(Runnable runnable) {
        this.f5079a = runnable;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1742q0
    /* renamed from: a */
    public void mo859a() {
        this.f5084f.removeCallbacks(this.f5087i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1742q0
    /* renamed from: b */
    public View mo858b(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.suggestions_cancel_to_gone);
        this.f5080b = loadAnimation;
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC1639v2(this));
        this.f5081c = AnimationUtils.loadAnimation(context, R.anim.suggestions_cancel_to_visible);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.suggestions_double_cancel_to_gone);
        this.f5082d = loadAnimation2;
        loadAnimation2.setAnimationListener(new animationAnimation$AnimationListenerC1643w2(this));
        this.f5083e = AnimationUtils.loadAnimation(context, R.anim.suggestions_double_cancel_to_visible);
        View inflate = LayoutInflater.from(context).inflate(R.layout.cancel_suggestions_action, viewGroup, false);
        this.f5084f = inflate;
        this.f5085g = inflate.findViewById(R.id.close_suggestions_strip_text);
        ImageView imageView = (ImageView) this.f5084f.findViewById(R.id.close_suggestions_strip_icon);
        CandidateView candidateView = this.f5086h;
        if (candidateView != null) {
            imageView.setImageDrawable(candidateView.getCloseIcon());
        }
        this.f5084f.setOnClickListener(new View.OnClickListener() { // from class: c.b.x.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1647x2 c1647x2 = C1647x2.this;
                c1647x2.f5084f.removeCallbacks(c1647x2.f5087i);
                if (c1647x2.f5085g.getVisibility() == 0) {
                    c1647x2.f5079a.run();
                    return;
                }
                c1647x2.f5085g.setVisibility(0);
                c1647x2.f5083e.reset();
                c1647x2.f5085g.startAnimation(c1647x2.f5083e);
                c1647x2.f5084f.postDelayed(c1647x2.f5087i, 1950L);
            }
        });
        return this.f5084f;
    }
}