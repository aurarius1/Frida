package p093c.p097b.p128x;

import android.content.ComponentName;
import com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay;
import java.util.Locale;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.InterfaceC1141d;

/* renamed from: c.b.x.a3 */
/* loaded from: classes.dex */
public class C1551a3 implements InterfaceC1141d {

    /* renamed from: a */
    public final InterfaceC1141d f4967a;

    /* renamed from: b */
    public final C1138a f4968b;

    /* renamed from: c */
    public final String f4969c;

    /* renamed from: d */
    public final AnySoftKeyboardThemeOverlay f4970d;

    /* renamed from: e */
    public boolean f4971e;

    public C1551a3(InterfaceC1141d interfaceC1141d, AnySoftKeyboardThemeOverlay anySoftKeyboardThemeOverlay, C1138a c1138a, String str) {
        this.f4967a = interfaceC1141d;
        this.f4970d = anySoftKeyboardThemeOverlay;
        this.f4968b = c1138a;
        this.f4969c = str;
    }

    @Override // p093c.p097b.p099b0.InterfaceC1141d
    /* renamed from: a */
    public C1138a mo937a(ComponentName componentName) {
        return this.f4971e ? this.f4968b : this.f4967a.mo937a(componentName);
    }

    public String toString() {
        return String.format(Locale.ROOT, "ToggleOverlayCreator %s %s", this.f4969c, super.toString());
    }
}