package p093c.p097b.p108i0.p114q;

import android.text.style.ClickableSpan;
import android.view.View;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.q.d */
/* loaded from: classes.dex */
public class C1410d extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C1411e f4657b;

    public C1410d(C1411e c1411e) {
        this.f4657b = c1411e;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        BasicAnyActivity basicAnyActivity = (BasicAnyActivity) this.f4657b.m1872h();
        if (basicAnyActivity == null) {
            return;
        }
        basicAnyActivity.m374t(new C1409c(), AbstractC2289b.f7441b);
    }
}