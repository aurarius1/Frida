package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p010b.p016c.p017k.C0130u0;
import p010b.p016c.p026q.C0242f1;
import p010b.p016c.p026q.C0274l0;
import p010b.p016c.p026q.C0328w;
import p010b.p016c.p026q.C0338y;
import p010b.p016c.p026q.C0343z;
import p093c.p145g.p146a.p147a.p150c0.C1828a;
import p093c.p145g.p146a.p147a.p156i0.C1887e0;
import p093c.p145g.p146a.p147a.p169u.C1994a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0130u0 {
    @Override // p010b.p016c.p017k.C0130u0
    /* renamed from: a */
    public C0328w mo235a(Context context, AttributeSet attributeSet) {
        return new C1887e0(context, attributeSet);
    }

    @Override // p010b.p016c.p017k.C0130u0
    /* renamed from: b */
    public C0338y mo234b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p010b.p016c.p017k.C0130u0
    /* renamed from: c */
    public C0343z mo233c(Context context, AttributeSet attributeSet) {
        return new C1994a(context, attributeSet);
    }

    @Override // p010b.p016c.p017k.C0130u0
    /* renamed from: d */
    public C0274l0 mo232d(Context context, AttributeSet attributeSet) {
        return new C1828a(context, attributeSet);
    }

    @Override // p010b.p016c.p017k.C0130u0
    /* renamed from: e */
    public C0242f1 mo231e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}