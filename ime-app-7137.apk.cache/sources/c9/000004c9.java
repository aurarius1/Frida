package p010b.p087x.p088a.p089a;

import android.animation.TypeEvaluator;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.x.a.a.h */
/* loaded from: classes.dex */
public class C1093h implements TypeEvaluator {

    /* renamed from: a */
    public static final C1093h f4075a = new C1093h();

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float m1195a = AbstractC1124a.m1195a(((intValue2 >> 24) & 255) / 255.0f, f2, f, f2);
        float m1195a2 = AbstractC1124a.m1195a(pow4, pow, f, pow);
        float m1195a3 = AbstractC1124a.m1195a((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2);
        float m1195a4 = AbstractC1124a.m1195a((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow(m1195a2, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(m1195a4, 0.45454545454545453d)) * 255.0f) | round | (Math.round(m1195a * 255.0f) << 24) | (Math.round(((float) Math.pow(m1195a3, 0.45454545454545453d)) * 255.0f) << 8));
    }
}