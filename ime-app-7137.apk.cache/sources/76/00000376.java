package p010b.p067m.p068d;

import android.view.View;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.w */
/* loaded from: classes.dex */
public class C0754w extends AbstractC0709k0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3182a;

    public C0754w(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        this.f3182a = abstractComponentCallbacksC0763z;
    }

    @Override // p010b.p067m.p068d.AbstractC0709k0
    /* renamed from: c */
    public View mo1933c(int i) {
        View view = this.f3182a.f3216I;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Fragment ");
        m1187i.append(this.f3182a);
        m1187i.append(" does not have a view");
        throw new IllegalStateException(m1187i.toString());
    }

    @Override // p010b.p067m.p068d.AbstractC0709k0
    /* renamed from: d */
    public boolean mo1932d() {
        return this.f3182a.f3216I != null;
    }
}