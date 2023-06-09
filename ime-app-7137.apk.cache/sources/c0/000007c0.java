package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.g.a.a.g0.j */
/* loaded from: classes.dex */
public final class C1852j implements InterfaceC1845c {

    /* renamed from: a */
    public final float f5679a;

    public C1852j(float f) {
        this.f5679a = f;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.InterfaceC1845c
    /* renamed from: a */
    public float mo729a(RectF rectF) {
        return rectF.height() * this.f5679a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1852j) && this.f5679a == ((C1852j) obj).f5679a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5679a)});
    }
}