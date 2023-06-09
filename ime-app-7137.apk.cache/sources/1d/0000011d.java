package p010b.p016c.p020m.p021a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p000a.p001a.p002a.p004b.AbstractC0022t;

/* renamed from: b.c.m.a.k */
/* loaded from: classes.dex */
public abstract class AbstractC0153k extends Drawable.ConstantState {

    /* renamed from: A */
    public int f1140A;

    /* renamed from: B */
    public int f1141B;

    /* renamed from: C */
    public boolean f1142C;

    /* renamed from: D */
    public ColorFilter f1143D;

    /* renamed from: E */
    public boolean f1144E;

    /* renamed from: F */
    public ColorStateList f1145F;

    /* renamed from: G */
    public PorterDuff.Mode f1146G;

    /* renamed from: H */
    public boolean f1147H;

    /* renamed from: I */
    public boolean f1148I;

    /* renamed from: a */
    public final AbstractC0154l f1149a;

    /* renamed from: b */
    public Resources f1150b;

    /* renamed from: c */
    public int f1151c;

    /* renamed from: d */
    public int f1152d;

    /* renamed from: e */
    public int f1153e;

    /* renamed from: f */
    public SparseArray f1154f;

    /* renamed from: g */
    public Drawable[] f1155g;

    /* renamed from: h */
    public int f1156h;

    /* renamed from: i */
    public boolean f1157i;

    /* renamed from: j */
    public boolean f1158j;

    /* renamed from: k */
    public Rect f1159k;

    /* renamed from: l */
    public boolean f1160l;

    /* renamed from: m */
    public boolean f1161m;

    /* renamed from: n */
    public int f1162n;

    /* renamed from: o */
    public int f1163o;

    /* renamed from: p */
    public int f1164p;

    /* renamed from: q */
    public int f1165q;

    /* renamed from: r */
    public boolean f1166r;

    /* renamed from: s */
    public int f1167s;

    /* renamed from: t */
    public boolean f1168t;

    /* renamed from: u */
    public boolean f1169u;

    /* renamed from: v */
    public boolean f1170v;

    /* renamed from: w */
    public boolean f1171w;

    /* renamed from: x */
    public boolean f1172x;

    /* renamed from: y */
    public boolean f1173y;

    /* renamed from: z */
    public int f1174z;

    public AbstractC0153k(AbstractC0153k abstractC0153k, AbstractC0154l abstractC0154l, Resources resources) {
        this.f1157i = false;
        this.f1160l = false;
        this.f1172x = true;
        this.f1140A = 0;
        this.f1141B = 0;
        this.f1149a = abstractC0154l;
        this.f1150b = resources != null ? resources : abstractC0153k != null ? abstractC0153k.f1150b : null;
        int i = abstractC0153k != null ? abstractC0153k.f1151c : 0;
        int i2 = AbstractC0154l.f1175b;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f1151c = i;
        if (abstractC0153k == null) {
            this.f1155g = new Drawable[10];
            this.f1156h = 0;
            return;
        }
        this.f1152d = abstractC0153k.f1152d;
        this.f1153e = abstractC0153k.f1153e;
        this.f1170v = true;
        this.f1171w = true;
        this.f1157i = abstractC0153k.f1157i;
        this.f1160l = abstractC0153k.f1160l;
        this.f1172x = abstractC0153k.f1172x;
        this.f1173y = abstractC0153k.f1173y;
        this.f1174z = abstractC0153k.f1174z;
        this.f1140A = abstractC0153k.f1140A;
        this.f1141B = abstractC0153k.f1141B;
        this.f1142C = abstractC0153k.f1142C;
        this.f1143D = abstractC0153k.f1143D;
        this.f1144E = abstractC0153k.f1144E;
        this.f1145F = abstractC0153k.f1145F;
        this.f1146G = abstractC0153k.f1146G;
        this.f1147H = abstractC0153k.f1147H;
        this.f1148I = abstractC0153k.f1148I;
        if (abstractC0153k.f1151c == i) {
            if (abstractC0153k.f1158j) {
                this.f1159k = abstractC0153k.f1159k != null ? new Rect(abstractC0153k.f1159k) : null;
                this.f1158j = true;
            }
            if (abstractC0153k.f1161m) {
                this.f1162n = abstractC0153k.f1162n;
                this.f1163o = abstractC0153k.f1163o;
                this.f1164p = abstractC0153k.f1164p;
                this.f1165q = abstractC0153k.f1165q;
                this.f1161m = true;
            }
        }
        if (abstractC0153k.f1166r) {
            this.f1167s = abstractC0153k.f1167s;
            this.f1166r = true;
        }
        if (abstractC0153k.f1168t) {
            this.f1169u = abstractC0153k.f1169u;
            this.f1168t = true;
        }
        Drawable[] drawableArr = abstractC0153k.f1155g;
        this.f1155g = new Drawable[drawableArr.length];
        this.f1156h = abstractC0153k.f1156h;
        SparseArray sparseArray = abstractC0153k.f1154f;
        this.f1154f = sparseArray != null ? sparseArray.clone() : new SparseArray(this.f1156h);
        int i3 = this.f1156h;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                if (constantState != null) {
                    this.f1154f.put(i4, constantState);
                } else {
                    this.f1155g[i4] = drawableArr[i4];
                }
            }
        }
    }

    /* renamed from: a */
    public final int m2992a(Drawable drawable) {
        int i = this.f1156h;
        if (i >= this.f1155g.length) {
            int i2 = i + 10;
            AbstractC0155m abstractC0155m = (AbstractC0155m) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = abstractC0155m.f1155g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            abstractC0155m.f1155g = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(abstractC0155m.f1188J, 0, iArr, 0, i);
            abstractC0155m.f1188J = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f1149a);
        this.f1155g[i] = drawable;
        this.f1156h++;
        this.f1153e = drawable.getChangingConfigurations() | this.f1153e;
        this.f1166r = false;
        this.f1168t = false;
        this.f1159k = null;
        this.f1158j = false;
        this.f1161m = false;
        this.f1170v = false;
        return i;
    }

    /* renamed from: b */
    public void m2991b() {
        this.f1161m = true;
        m2990c();
        int i = this.f1156h;
        Drawable[] drawableArr = this.f1155g;
        this.f1163o = -1;
        this.f1162n = -1;
        this.f1165q = 0;
        this.f1164p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f1162n) {
                this.f1162n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f1163o) {
                this.f1163o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f1164p) {
                this.f1164p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f1165q) {
                this.f1165q = minimumHeight;
            }
        }
    }

    /* renamed from: c */
    public final void m2990c() {
        SparseArray sparseArray = this.f1154f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f1154f.keyAt(i);
                Drawable[] drawableArr = this.f1155g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f1154f.valueAt(i)).newDrawable(this.f1150b);
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC0022t.m3494g0(newDrawable, this.f1174z);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f1149a);
                drawableArr[keyAt] = mutate;
            }
            this.f1154f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        int i = this.f1156h;
        Drawable[] drawableArr = this.f1155g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1154f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (AbstractC0022t.m3499e(drawable)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2989d(int i) {
        int indexOfKey;
        Drawable drawable = this.f1155g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f1154f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f1154f.valueAt(indexOfKey)).newDrawable(this.f1150b);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0022t.m3494g0(newDrawable, this.f1174z);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f1149a);
        this.f1155g[i] = mutate;
        this.f1154f.removeAt(indexOfKey);
        if (this.f1154f.size() == 0) {
            this.f1154f = null;
        }
        return mutate;
    }

    /* renamed from: e */
    public abstract void mo2988e();

    /* renamed from: f */
    public final void m2987f(Resources resources) {
        if (resources != null) {
            this.f1150b = resources;
            int i = AbstractC0154l.f1175b;
            int i2 = resources.getDisplayMetrics().densityDpi;
            if (i2 == 0) {
                i2 = 160;
            }
            int i3 = this.f1151c;
            this.f1151c = i2;
            if (i3 != i2) {
                this.f1161m = false;
                this.f1158j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1152d | this.f1153e;
    }
}