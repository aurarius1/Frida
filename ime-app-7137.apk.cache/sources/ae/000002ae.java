package p010b.p046j.p056j;

/* renamed from: b.j.j.f */
/* loaded from: classes.dex */
public class C0554f implements InterfaceC0555g {

    /* renamed from: a */
    public static final C0554f f2646a = new C0554f();

    @Override // p010b.p046j.p056j.InterfaceC0555g
    /* renamed from: a */
    public int mo2336a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        int i4 = 2;
        while (i < i3 && i4 == 2) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i));
            AbstractC0556h abstractC0556h = AbstractC0558j.f2649a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i4 = 2;
                            break;
                    }
                    i++;
                }
                i4 = 0;
                i++;
            }
            i4 = 1;
            i++;
        }
        return i4;
    }
}