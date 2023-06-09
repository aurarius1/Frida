package p093c.p145g.p146a.p175b;

import android.inputmethodservice.InputMethodService;
import android.os.IBinder;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.List;

/* renamed from: c.g.a.b.d */
/* loaded from: classes.dex */
public class C2050d implements InterfaceC2059m {

    /* renamed from: a */
    public final InputMethodService f6227a;

    public C2050d(InputMethodService inputMethodService) {
        this.f6227a = inputMethodService;
    }

    /* renamed from: c */
    public static InputMethodInfo m519c(InputMethodManager inputMethodManager) {
        for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
            for (int i = 0; i < inputMethodInfo.getSubtypeCount(); i++) {
                if ("voice".equals(inputMethodInfo.getSubtypeAt(i).getMode()) && inputMethodInfo.getComponent().getPackageName().startsWith("com.google.android")) {
                    return inputMethodInfo;
                }
            }
        }
        return null;
    }

    @Override // p093c.p145g.p146a.p175b.InterfaceC2059m
    /* renamed from: a */
    public void mo517a(String str) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f6227a.getSystemService("input_method");
        InputMethodInfo m519c = m519c(inputMethodManager);
        if (m519c == null) {
            return;
        }
        IBinder iBinder = this.f6227a.getWindow().getWindow().getAttributes().token;
        String id = m519c.getId();
        List<InputMethodSubtype> list = inputMethodManager.getShortcutInputMethodsAndSubtypes().get(m519c);
        inputMethodManager.setInputMethodAndSubtype(iBinder, id, (list == null || list.size() <= 0) ? null : list.get(0));
    }

    @Override // p093c.p145g.p146a.p175b.InterfaceC2059m
    /* renamed from: b */
    public void mo516b() {
    }
}