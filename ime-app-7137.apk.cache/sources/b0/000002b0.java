package p010b.p046j.p056j;

/* renamed from: b.j.j.h */
/* loaded from: classes.dex */
public abstract class AbstractC0556h {

    /* renamed from: a */
    public final InterfaceC0555g f2647a;

    public AbstractC0556h(InterfaceC0555g interfaceC0555g) {
        this.f2647a = interfaceC0555g;
    }

    /* renamed from: a */
    public abstract boolean mo2334a();

    /* renamed from: b */
    public boolean m2335b(CharSequence charSequence, int i, int i2) {
        if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
            throw new IllegalArgumentException();
        }
        InterfaceC0555g interfaceC0555g = this.f2647a;
        if (interfaceC0555g == null) {
            return mo2334a();
        }
        int mo2336a = interfaceC0555g.mo2336a(charSequence, i, i2);
        if (mo2336a != 0) {
            if (mo2336a != 1) {
                return mo2334a();
            }
            return false;
        }
        return true;
    }
}