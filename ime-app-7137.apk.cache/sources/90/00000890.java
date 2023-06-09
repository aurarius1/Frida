package p093c.p145g.p146a.p175b;

import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;

/* renamed from: c.g.a.b.n */
/* loaded from: classes.dex */
public class C2060n {

    /* renamed from: a */
    public final InputMethodService f6245a;

    /* renamed from: b */
    public InterfaceC2059m f6246b = m515a();

    /* renamed from: c */
    public C2050d f6247c;

    /* renamed from: d */
    public C2053g f6248d;

    public C2060n(InputMethodService inputMethodService) {
        this.f6245a = inputMethodService;
    }

    /* renamed from: a */
    public final InterfaceC2059m m515a() {
        InputMethodInfo m519c = C2050d.m519c((InputMethodManager) this.f6245a.getSystemService("input_method"));
        if (m519c != null && m519c.getSubtypeCount() > 0) {
            if (this.f6247c == null) {
                this.f6247c = new C2050d(this.f6245a);
            }
            return this.f6247c;
        }
        if (this.f6245a.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() > 0) {
            if (this.f6248d == null) {
                this.f6248d = new C2053g(this.f6245a);
            }
            return this.f6248d;
        }
        return null;
    }
}