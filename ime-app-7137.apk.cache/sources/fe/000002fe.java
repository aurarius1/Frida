package p010b.p046j.p058l;

import android.view.View;

/* renamed from: b.j.l.y */
/* loaded from: classes.dex */
public class C0634y extends AbstractC0572c0 {
    public C0634y(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // p010b.p046j.p058l.AbstractC0572c0
    /* renamed from: b */
    public Object mo2177b(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }

    @Override // p010b.p046j.p058l.AbstractC0572c0
    /* renamed from: c */
    public void mo2176c(View view, Object obj) {
        view.setScreenReaderFocusable(((Boolean) obj).booleanValue());
    }

    @Override // p010b.p046j.p058l.AbstractC0572c0
    /* renamed from: f */
    public boolean mo2175f(Object obj, Object obj2) {
        return !m2329a((Boolean) obj, (Boolean) obj2);
    }
}