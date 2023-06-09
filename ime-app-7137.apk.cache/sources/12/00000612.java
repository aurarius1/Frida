package p093c.p097b;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.anysoftkeyboard.ime.AnySoftKeyboardBase;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardView;
import p010b.p037h.p040b.AbstractC0403k;
import p093c.p097b.p100c0.EnumC1178v;

/* renamed from: c.b.o  reason: invalid class name */
/* loaded from: classes.dex */
public class animationAnimation$AnimationListenerC1422o implements Animation.AnimationListener {

    /* renamed from: a */
    public final AnySoftKeyboardBase f4690a;

    /* renamed from: b */
    public final Context f4691b;

    /* renamed from: c */
    public Animation f4692c = null;

    /* renamed from: d */
    public Animation f4693d = null;

    /* renamed from: e */
    public Animation f4694e = null;

    /* renamed from: f */
    public Animation f4695f = null;

    /* renamed from: g */
    public Animation f4696g = null;

    /* renamed from: h */
    public Animation f4697h = null;

    /* renamed from: i */
    public int f4698i = 1;

    /* renamed from: j */
    public int f4699j;

    public animationAnimation$AnimationListenerC1422o(AnySoftKeyboardBase anySoftKeyboardBase) {
        this.f4690a = anySoftKeyboardBase;
        this.f4691b = anySoftKeyboardBase.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1066a(int i, int i2) {
        boolean z;
        this.f4698i = i;
        this.f4699j = i2;
        AnySoftKeyboardBase anySoftKeyboardBase = this.f4690a;
        View view = (View) anySoftKeyboardBase.f6308d;
        if (this.f4692c != null && view != null) {
            if (i2 != -99 && i2 != -2) {
                switch (i2) {
                    case -97:
                    case -96:
                    case -95:
                    case -94:
                        break;
                    default:
                        z = false;
                        break;
                }
                if (z) {
                    int m2567a = AbstractC0403k.m2567a(i);
                    view.startAnimation(m2567a != 1 ? m2567a != 2 ? this.f4692c : this.f4696g : this.f4694e);
                    return;
                }
            }
            z = true;
            if (z) {
            }
        }
        anySoftKeyboardBase.mo379s(i2, null, -1, new int[]{i2}, false);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        AnyKeyboardView anyKeyboardView = (AnyKeyboardView) this.f4690a.f6308d;
        if (anyKeyboardView != null) {
            int m2567a = AbstractC0403k.m2567a(this.f4698i);
            Animation animation2 = m2567a != 1 ? m2567a != 2 ? this.f4693d : this.f4697h : this.f4695f;
            if (anyKeyboardView.f6441C0 == EnumC1178v.None) {
                animation2 = null;
            }
            anyKeyboardView.f6450L0 = animation2;
        }
        AnySoftKeyboardBase anySoftKeyboardBase = this.f4690a;
        int i = this.f4699j;
        anySoftKeyboardBase.mo379s(i, null, -1, new int[]{i}, false);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}