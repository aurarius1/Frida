package p093c.p145g.p146a.p147a.p169u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p026q.C0343z;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;

/* renamed from: c.g.a.a.u.a */
/* loaded from: classes.dex */
public class C1994a extends C0343z {

    /* renamed from: e */
    public static final int f6043e = AbstractC1926k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: f */
    public static final int[][] f6044f = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: g */
    public ColorStateList f6045g;

    /* renamed from: h */
    public boolean f6046h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1994a(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = AbstractC1804b.checkboxStyle;
        int i2 = f6043e;
        Context context2 = getContext();
        TypedArray m764d = AbstractC1822r.m764d(context2, attributeSet, AbstractC1940l.MaterialCheckBox, i, i2, new int[0]);
        int i3 = AbstractC1940l.MaterialCheckBox_buttonTint;
        if (m764d.hasValue(i3)) {
            AbstractC0022t.m3508Z(this, AbstractC1077v0.m1262q(context2, m764d, i3));
        }
        this.f6046h = m764d.getBoolean(AbstractC1940l.MaterialCheckBox_useMaterialThemeColors, false);
        m764d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6045g == null) {
            int[][] iArr = f6044f;
            int[] iArr2 = new int[iArr.length];
            int m1263p = AbstractC1077v0.m1263p(this, AbstractC1804b.colorControlActivated);
            int m1263p2 = AbstractC1077v0.m1263p(this, AbstractC1804b.colorSurface);
            int m1263p3 = AbstractC1077v0.m1263p(this, AbstractC1804b.colorOnSurface);
            iArr2[0] = AbstractC1077v0.m1297G(m1263p2, m1263p, 1.0f);
            iArr2[1] = AbstractC1077v0.m1297G(m1263p2, m1263p3, 0.54f);
            iArr2[2] = AbstractC1077v0.m1297G(m1263p2, m1263p3, 0.38f);
            iArr2[3] = AbstractC1077v0.m1297G(m1263p2, m1263p3, 0.38f);
            this.f6045g = new ColorStateList(iArr, iArr2);
        }
        return this.f6045g;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6046h && AbstractC0022t.m3532B(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6046h = z;
        AbstractC0022t.m3508Z(this, z ? getMaterialThemeColorsTintList() : null);
    }
}