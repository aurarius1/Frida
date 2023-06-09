package p093c.p097b.p099b0;

import android.content.ComponentName;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.b.b0.c */
/* loaded from: classes.dex */
public class C1140c implements InterfaceC1141d {

    /* renamed from: a */
    public final InterfaceC1141d f4256a;

    /* renamed from: b */
    public final Map f4257b;

    public C1140c(InterfaceC1141d interfaceC1141d, Map map) {
        this.f4256a = interfaceC1141d;
        this.f4257b = new HashMap(map);
    }

    @Override // p093c.p097b.p099b0.InterfaceC1141d
    /* renamed from: a */
    public C1138a mo937a(ComponentName componentName) {
        return this.f4257b.containsKey(componentName.getPackageName()) ? (C1138a) this.f4257b.get(componentName.getPackageName()) : this.f4256a.mo937a(componentName);
    }
}