package p010b.p046j.p058l;

import android.text.TextUtils;
import android.view.View;

/* renamed from: b.j.l.z */
/* loaded from: classes.dex */
public class C0636z extends AbstractC0572c0 {
    public C0636z(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    @Override // p010b.p046j.p058l.AbstractC0572c0
    /* renamed from: b */
    public Object mo2177b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    @Override // p010b.p046j.p058l.AbstractC0572c0
    /* renamed from: c */
    public void mo2176c(View view, Object obj) {
        view.setAccessibilityPaneTitle((CharSequence) obj);
    }

    @Override // p010b.p046j.p058l.AbstractC0572c0
    /* renamed from: f */
    public boolean mo2175f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}