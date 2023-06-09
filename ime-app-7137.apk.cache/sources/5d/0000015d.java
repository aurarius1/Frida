package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p061m.InterfaceC0647j;

/* renamed from: b.c.q.b0 */
/* loaded from: classes.dex */
public class C0217b0 {

    /* renamed from: a */
    public final CompoundButton f1475a;

    /* renamed from: b */
    public ColorStateList f1476b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1477c = null;

    /* renamed from: d */
    public boolean f1478d = false;

    /* renamed from: e */
    public boolean f1479e = false;

    /* renamed from: f */
    public boolean f1480f;

    public C0217b0(CompoundButton compoundButton) {
        this.f1475a = compoundButton;
    }

    /* renamed from: a */
    public void m2875a() {
        Drawable m3533A = AbstractC0022t.m3533A(this.f1475a);
        if (m3533A != null) {
            if (this.f1478d || this.f1479e) {
                Drawable mutate = AbstractC0022t.m3466u0(m3533A).mutate();
                if (this.f1478d) {
                    AbstractC0022t.m3480n0(mutate, this.f1476b);
                }
                if (this.f1479e) {
                    AbstractC0022t.m3478o0(mutate, this.f1477c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1475a.getDrawableState());
                }
                this.f1475a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m2874b(int i) {
        Drawable m3533A;
        return (Build.VERSION.SDK_INT >= 17 || (m3533A = AbstractC0022t.m3533A(this.f1475a)) == null) ? i : i + m3533A.getIntrinsicWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x0029, B:11:0x003b, B:13:0x0043, B:15:0x0049, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:23:0x0081, B:24:0x0085, B:26:0x0089), top: B:37:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x0029, B:11:0x003b, B:13:0x0043, B:15:0x0049, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:23:0x0081, B:24:0x0085, B:26:0x0089), top: B:37:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x0029, B:11:0x003b, B:13:0x0043, B:15:0x0049, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:23:0x0081, B:24:0x0085, B:26:0x0089), top: B:37:0x001b }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2873c(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int m2745m;
        int m2745m2;
        Context context = this.f1475a.getContext();
        int[] iArr = AbstractC0084j.CompoundButton;
        C0302q3 m2740r = C0302q3.m2740r(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.f1475a;
        AbstractC0605j0.m2270M(compoundButton, compoundButton.getContext(), iArr, attributeSet, m2740r.f1740b, i, 0);
        try {
            int i4 = AbstractC0084j.CompoundButton_buttonCompat;
            if (m2740r.m2742p(i4) && (m2745m2 = m2740r.m2745m(i4, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f1475a;
                    compoundButton2.setButtonDrawable(AbstractC0142b.m3000b(compoundButton2.getContext(), m2745m2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i5 = AbstractC0084j.CompoundButton_android_button;
                    if (m2740r.m2742p(i5) && (m2745m = m2740r.m2745m(i5, 0)) != 0) {
                        CompoundButton compoundButton3 = this.f1475a;
                        compoundButton3.setButtonDrawable(AbstractC0142b.m3000b(compoundButton3.getContext(), m2745m));
                    }
                }
                i2 = AbstractC0084j.CompoundButton_buttonTint;
                if (m2740r.m2742p(i2)) {
                    AbstractC0022t.m3508Z(this.f1475a, m2740r.m2755c(i2));
                }
                i3 = AbstractC0084j.CompoundButton_buttonTintMode;
                if (m2740r.m2742p(i3)) {
                    CompoundButton compoundButton4 = this.f1475a;
                    PorterDuff.Mode m2783d = AbstractC0290o1.m2783d(m2740r.m2748j(i3, -1), null);
                    if (Build.VERSION.SDK_INT >= 21) {
                        compoundButton4.setButtonTintMode(m2783d);
                    } else if (compoundButton4 instanceof InterfaceC0647j) {
                        ((InterfaceC0647j) compoundButton4).setSupportButtonTintMode(m2783d);
                    }
                }
            }
            z = false;
            if (!z) {
            }
            i2 = AbstractC0084j.CompoundButton_buttonTint;
            if (m2740r.m2742p(i2)) {
            }
            i3 = AbstractC0084j.CompoundButton_buttonTintMode;
            if (m2740r.m2742p(i3)) {
            }
        } finally {
            m2740r.f1740b.recycle();
        }
    }
}