package p093c.p145g.p146a.p147a.p150c0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p026q.C0274l0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;

/* renamed from: c.g.a.a.c0.a */
/* loaded from: classes.dex */
public class C1828a extends C0274l0 {

    /* renamed from: e */
    public static final int f5574e = AbstractC1926k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: f */
    public static final int[][] f5575f = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: g */
    public ColorStateList f5576g;

    /* renamed from: h */
    public boolean f5577h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1828a(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = AbstractC1804b.radioButtonStyle;
        int i2 = f5574e;
        Context context2 = getContext();
        TypedArray m764d = AbstractC1822r.m764d(context2, attributeSet, AbstractC1940l.MaterialRadioButton, i, i2, new int[0]);
        int i3 = AbstractC1940l.MaterialRadioButton_buttonTint;
        if (m764d.hasValue(i3)) {
            AbstractC0022t.m3508Z(this, AbstractC1077v0.m1262q(context2, m764d, i3));
        }
        this.f5577h = m764d.getBoolean(AbstractC1940l.MaterialRadioButton_useMaterialThemeColors, false);
        m764d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5576g == null) {
            int m1263p = AbstractC1077v0.m1263p(this, AbstractC1804b.colorControlActivated);
            int m1263p2 = AbstractC1077v0.m1263p(this, AbstractC1804b.colorOnSurface);
            int m1263p3 = AbstractC1077v0.m1263p(this, AbstractC1804b.colorSurface);
            int[][] iArr = f5575f;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC1077v0.m1297G(m1263p3, m1263p, 1.0f);
            iArr2[1] = AbstractC1077v0.m1297G(m1263p3, m1263p2, 0.54f);
            iArr2[2] = AbstractC1077v0.m1297G(m1263p3, m1263p2, 0.38f);
            iArr2[3] = AbstractC1077v0.m1297G(m1263p3, m1263p2, 0.38f);
            this.f5576g = new ColorStateList(iArr, iArr2);
        }
        return this.f5576g;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5577h && AbstractC0022t.m3532B(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f5577h = z;
        AbstractC0022t.m3508Z(this, z ? getMaterialThemeColorsTintList() : null);
    }
}