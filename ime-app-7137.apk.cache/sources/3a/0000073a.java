package p093c.p097b.p130z.p132r0;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p093c.p097b.p100c0.EnumC1178v;
import p093c.p097b.p130z.p132r0.p133a1.InterfaceC1695a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.z.r0.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC1718e0 extends AbstractC1722g0 {

    /* renamed from: A0 */
    public final List f5304A0;

    /* renamed from: B0 */
    public EnumC1178v f5305B0;

    public AbstractC1718e0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5304A0 = new ArrayList();
        this.f6522t.mo117c(this.f6515p0.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.r
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AbstractC1718e0.this.f5305B0 = (EnumC1178v) obj;
            }
        }, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d));
    }

    /* renamed from: J */
    public void m873J(InterfaceC1695a interfaceC1695a) {
        if (this.f6505k0 && this.f5305B0 != EnumC1178v.None) {
            this.f5304A0.add(interfaceC1695a);
            postInvalidate();
        }
    }

    @Override // p093c.p097b.p130z.p132r0.AbstractC1722g0, com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5304A0.isEmpty()) {
            return;
        }
        Iterator it = this.f5304A0.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1695a) it.next()).mo887a(canvas, this.f6492e, this)) {
                it.remove();
            }
        }
        if (this.f5304A0.isEmpty()) {
            return;
        }
        postInvalidateDelayed(16L);
    }
}