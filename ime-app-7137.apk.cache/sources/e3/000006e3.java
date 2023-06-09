package p093c.p097b.p128x;

import android.inputmethodservice.InputMethodService;
import android.os.IBinder;
import com.anysoftkeyboard.ime.AnySoftKeyboardService;

/* renamed from: c.b.x.t2 */
/* loaded from: classes.dex */
public class C1631t2 extends InputMethodService.InputMethodImpl {

    /* renamed from: a */
    public final /* synthetic */ AnySoftKeyboardService f5063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631t2(AnySoftKeyboardService anySoftKeyboardService) {
        super(anySoftKeyboardService);
        this.f5063a = anySoftKeyboardService;
    }

    @Override // android.inputmethodservice.InputMethodService.InputMethodImpl, android.view.inputmethod.InputMethod
    public void attachToken(IBinder iBinder) {
        super.attachToken(iBinder);
        this.f5063a.f6383k = iBinder;
    }
}