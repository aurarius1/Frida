package p093c.p097b.p128x;

import android.content.ComponentName;
import com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay;
import java.util.Collections;
import p000a.p001a.p002a.p004b.C0021s;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.C1139b;
import p093c.p097b.p099b0.C1140c;
import p093c.p097b.p099b0.C1144g;
import p093c.p097b.p099b0.InterfaceC1141d;

/* renamed from: c.b.x.y2 */
/* loaded from: classes.dex */
public class C1651y2 implements InterfaceC1141d {

    /* renamed from: a */
    public final InterfaceC1141d f5091a;

    /* renamed from: b */
    public final /* synthetic */ AnySoftKeyboardThemeOverlay f5092b;

    public C1651y2(AnySoftKeyboardThemeOverlay anySoftKeyboardThemeOverlay) {
        this.f5092b = anySoftKeyboardThemeOverlay;
        C1139b c1139b = new C1139b(new C1144g(anySoftKeyboardThemeOverlay), 96, true);
        C1138a c1138a = AnySoftKeyboardThemeOverlay.f6424l0;
        this.f5091a = new C1140c(c1139b, Collections.emptyMap());
    }

    @Override // p093c.p097b.p099b0.InterfaceC1141d
    /* renamed from: a */
    public C1138a mo937a(ComponentName componentName) {
        if (this.f5092b.f6428p0) {
            if (C0021s.m3534a(componentName.getPackageName(), this.f5092b.f6426n0)) {
                return this.f5092b.f6429q0;
            }
            this.f5092b.f6426n0 = componentName.getPackageName();
            return this.f5091a.mo937a(componentName);
        }
        return AnySoftKeyboardThemeOverlay.f6424l0;
    }
}