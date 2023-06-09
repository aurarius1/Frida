package p093c.p145g.p146a.p147a.p170v;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: c.g.a.a.v.b */
/* loaded from: classes.dex */
public class C1996b extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f6048a;

    public C1996b(Chip chip) {
        this.f6048a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        C1999e c1999e = this.f6048a.f6770i;
        if (c1999e != null) {
            c1999e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}