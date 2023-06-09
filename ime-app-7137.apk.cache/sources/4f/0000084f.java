package p093c.p145g.p146a.p147a.p170v;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p093c.p145g.p146a.p147a.p151d0.AbstractC1834e;

/* renamed from: c.g.a.a.v.a */
/* loaded from: classes.dex */
public class C1995a extends AbstractC1834e {

    /* renamed from: a */
    public final /* synthetic */ Chip f6047a;

    public C1995a(Chip chip) {
        this.f6047a = chip;
    }

    @Override // p093c.p145g.p146a.p147a.p151d0.AbstractC1834e
    /* renamed from: a */
    public void mo619a(int i) {
    }

    @Override // p093c.p145g.p146a.p147a.p151d0.AbstractC1834e
    /* renamed from: b */
    public void mo618b(Typeface typeface, boolean z) {
        CharSequence text;
        Chip chip = this.f6047a;
        C1999e c1999e = chip.f6770i;
        if (c1999e.f6066H0) {
            text = c1999e.f6067I;
        } else {
            text = chip.getText();
        }
        chip.setText(text);
        this.f6047a.requestLayout();
        this.f6047a.invalidate();
    }
}