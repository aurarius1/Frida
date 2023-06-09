package p010b.p016c.p020m.p021a;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;

/* renamed from: b.c.m.a.e */
/* loaded from: classes.dex */
public class C0147e extends AbstractC0149g {

    /* renamed from: a */
    public final ObjectAnimator f1128a;

    /* renamed from: b */
    public final boolean f1129b;

    public C0147e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        super(null);
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C0148f c0148f = new C0148f(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        if (Build.VERSION.SDK_INT >= 18) {
            ofInt.setAutoCancel(true);
        }
        ofInt.setDuration(c0148f.f1132c);
        ofInt.setInterpolator(c0148f);
        this.f1129b = z2;
        this.f1128a = ofInt;
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0149g
    /* renamed from: a */
    public boolean mo2997a() {
        return this.f1129b;
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0149g
    /* renamed from: b */
    public void mo2996b() {
        this.f1128a.reverse();
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0149g
    /* renamed from: c */
    public void mo2995c() {
        this.f1128a.start();
    }

    @Override // p010b.p016c.p020m.p021a.AbstractC0149g
    /* renamed from: d */
    public void mo2994d() {
        this.f1128a.cancel();
    }
}