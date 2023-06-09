package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.g.a.a.g0.a */
/* loaded from: classes.dex */
public final class C1843a implements InterfaceC1845c {

    /* renamed from: a */
    public final float f5629a;

    public C1843a(float f) {
        this.f5629a = f;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.InterfaceC1845c
    /* renamed from: a */
    public float mo729a(RectF rectF) {
        return this.f5629a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1843a) && this.f5629a == ((C1843a) obj).f5629a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5629a)});
    }
}