package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.g.a.a.g0.b */
/* loaded from: classes.dex */
public final class C1844b implements InterfaceC1845c {

    /* renamed from: a */
    public final InterfaceC1845c f5630a;

    /* renamed from: b */
    public final float f5631b;

    public C1844b(float f, InterfaceC1845c interfaceC1845c) {
        while (interfaceC1845c instanceof C1844b) {
            interfaceC1845c = ((C1844b) interfaceC1845c).f5630a;
            f += ((C1844b) interfaceC1845c).f5631b;
        }
        this.f5630a = interfaceC1845c;
        this.f5631b = f;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.InterfaceC1845c
    /* renamed from: a */
    public float mo729a(RectF rectF) {
        return Math.max(0.0f, this.f5630a.mo729a(rectF) + this.f5631b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1844b) {
            C1844b c1844b = (C1844b) obj;
            return this.f5630a.equals(c1844b.f5630a) && this.f5631b == c1844b.f5631b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5630a, Float.valueOf(this.f5631b)});
    }
}