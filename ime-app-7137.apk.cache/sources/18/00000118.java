package p010b.p016c.p020m.p021a;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: b.c.m.a.f */
/* loaded from: classes.dex */
public class C0148f implements TimeInterpolator {

    /* renamed from: a */
    public int[] f1130a;

    /* renamed from: b */
    public int f1131b;

    /* renamed from: c */
    public int f1132c;

    public C0148f(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f1131b = numberOfFrames;
        int[] iArr = this.f1130a;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f1130a = new int[numberOfFrames];
        }
        int[] iArr2 = this.f1130a;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.f1132c = i;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int i = (int) ((f * this.f1132c) + 0.5f);
        int i2 = this.f1131b;
        int[] iArr = this.f1130a;
        int i3 = 0;
        while (i3 < i2 && i >= iArr[i3]) {
            i -= iArr[i3];
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.f1132c : 0.0f);
    }
}