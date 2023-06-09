package p093c.p145g.p146a.p147a.p149b0;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p093c.p145g.p146a.p147a.p151d0.AbstractC1834e;
import p093c.p145g.p146a.p147a.p151d0.C1832c;
import p093c.p145g.p146a.p147a.p151d0.C1833d;

/* renamed from: c.g.a.a.b0.n */
/* loaded from: classes.dex */
public class C1818n {

    /* renamed from: c */
    public float f5561c;

    /* renamed from: e */
    public WeakReference f5563e;

    /* renamed from: f */
    public C1833d f5564f;

    /* renamed from: a */
    public final TextPaint f5559a = new TextPaint(1);

    /* renamed from: b */
    public final AbstractC1834e f5560b = new C1816l(this);

    /* renamed from: d */
    public boolean f5562d = true;

    public C1818n(InterfaceC1817m interfaceC1817m) {
        this.f5563e = new WeakReference(null);
        this.f5563e = new WeakReference(interfaceC1817m);
    }

    /* renamed from: a */
    public float m773a(String str) {
        if (this.f5562d) {
            float measureText = str == null ? 0.0f : this.f5559a.measureText((CharSequence) str, 0, str.length());
            this.f5561c = measureText;
            this.f5562d = false;
            return measureText;
        }
        return this.f5561c;
    }

    /* renamed from: b */
    public void m772b(C1833d c1833d, Context context) {
        if (this.f5564f != c1833d) {
            this.f5564f = c1833d;
            if (c1833d != null) {
                TextPaint textPaint = this.f5559a;
                AbstractC1834e abstractC1834e = this.f5560b;
                c1833d.m759a();
                c1833d.m756d(textPaint, c1833d.f5599n);
                c1833d.m758b(context, new C1832c(c1833d, textPaint, abstractC1834e));
                InterfaceC1817m interfaceC1817m = (InterfaceC1817m) this.f5563e.get();
                if (interfaceC1817m != null) {
                    this.f5559a.drawableState = interfaceC1817m.getState();
                }
                c1833d.m757c(context, this.f5559a, this.f5560b);
                this.f5562d = true;
            }
            InterfaceC1817m interfaceC1817m2 = (InterfaceC1817m) this.f5563e.get();
            if (interfaceC1817m2 != null) {
                interfaceC1817m2.mo588a();
                interfaceC1817m2.onStateChange(interfaceC1817m2.getState());
            }
        }
    }
}