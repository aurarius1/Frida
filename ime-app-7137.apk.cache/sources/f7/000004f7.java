package p093c.p097b.p099b0;

import android.content.ComponentName;
import android.graphics.Color;

/* renamed from: c.b.b0.b */
/* loaded from: classes.dex */
public class C1139b implements InterfaceC1141d {

    /* renamed from: a */
    public static final int f4254a = m1176b(-7829368);

    /* renamed from: b */
    public final InterfaceC1141d f4255b;

    public C1139b(InterfaceC1141d interfaceC1141d, int i, boolean z) {
        this.f4255b = interfaceC1141d;
    }

    /* renamed from: b */
    public static int m1176b(int i) {
        double red = Color.red(i);
        Double.isNaN(red);
        double green = Color.green(i);
        Double.isNaN(green);
        double blue = Color.blue(i);
        Double.isNaN(blue);
        return (int) Math.ceil((red * 0.2126d) + (green * 0.7152d) + (blue * 0.0722d));
    }

    @Override // p093c.p097b.p099b0.InterfaceC1141d
    /* renamed from: a */
    public C1138a mo937a(ComponentName componentName) {
        int i;
        C1138a mo937a = this.f4255b.mo937a(componentName);
        mo937a.mo936a();
        int m1176b = m1176b(mo937a.f4250a);
        if (96 > Math.abs(m1176b - m1176b(mo937a.f4252c))) {
            if (m1176b > f4254a) {
                mo937a.f4252c = -16777216;
                i = -12303292;
            } else {
                mo937a.f4252c = -1;
                i = -3355444;
            }
            mo937a.f4253d = i;
        }
        return mo937a;
    }
}