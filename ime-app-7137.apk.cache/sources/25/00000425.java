package p010b.p083u.p084e;

import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.u.e.d2 */
/* loaded from: classes.dex */
public class C0929d2 {

    /* renamed from: a */
    public int f3570a = -1;

    /* renamed from: b */
    public int f3571b = 0;

    /* renamed from: c */
    public int f3572c = 0;

    /* renamed from: d */
    public int f3573d = 1;

    /* renamed from: e */
    public int f3574e = 0;

    /* renamed from: f */
    public boolean f3575f = false;

    /* renamed from: g */
    public boolean f3576g = false;

    /* renamed from: h */
    public boolean f3577h = false;

    /* renamed from: i */
    public boolean f3578i = false;

    /* renamed from: j */
    public boolean f3579j = false;

    /* renamed from: k */
    public boolean f3580k = false;

    /* renamed from: l */
    public int f3581l;

    /* renamed from: m */
    public long f3582m;

    /* renamed from: n */
    public int f3583n;

    /* renamed from: a */
    public void m1685a(int i) {
        if ((this.f3573d & i) != 0) {
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Layout state should be one of ");
        m1187i.append(Integer.toBinaryString(i));
        m1187i.append(" but it is ");
        m1187i.append(Integer.toBinaryString(this.f3573d));
        throw new IllegalStateException(m1187i.toString());
    }

    /* renamed from: b */
    public int m1684b() {
        return this.f3576g ? this.f3571b - this.f3572c : this.f3574e;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("State{mTargetPosition=");
        m1187i.append(this.f3570a);
        m1187i.append(", mData=");
        m1187i.append((Object) null);
        m1187i.append(", mItemCount=");
        m1187i.append(this.f3574e);
        m1187i.append(", mIsMeasuring=");
        m1187i.append(this.f3578i);
        m1187i.append(", mPreviousLayoutItemCount=");
        m1187i.append(this.f3571b);
        m1187i.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        m1187i.append(this.f3572c);
        m1187i.append(", mStructureChanged=");
        m1187i.append(this.f3575f);
        m1187i.append(", mInPreLayout=");
        m1187i.append(this.f3576g);
        m1187i.append(", mRunSimpleAnimations=");
        m1187i.append(this.f3579j);
        m1187i.append(", mRunPredictiveAnimations=");
        m1187i.append(this.f3580k);
        m1187i.append('}');
        return m1187i.toString();
    }
}