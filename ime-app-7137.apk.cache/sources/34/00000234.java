package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.InterfaceC0413h;

/* renamed from: b.h.c.b */
/* loaded from: classes.dex */
public abstract class AbstractC0432b extends View {

    /* renamed from: b */
    public int[] f2217b;

    /* renamed from: c */
    public int f2218c;

    /* renamed from: d */
    public Context f2219d;

    /* renamed from: e */
    public InterfaceC0413h f2220e;

    /* renamed from: f */
    public String f2221f;

    /* renamed from: g */
    public HashMap f2222g;

    public AbstractC0432b(Context context) {
        super(context);
        this.f2217b = new int[32];
        this.f2222g = new HashMap();
        this.f2219d = context;
        mo2466d(null);
    }

    public AbstractC0432b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2217b = new int[32];
        this.f2222g = new HashMap();
        this.f2219d = context;
        mo2466d(attributeSet);
    }

    /* renamed from: a */
    public final void m2469a(String str) {
        if (str == null || str.length() == 0 || this.f2219d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout2 != null) {
            Object m3368b = constraintLayout2.m3368b(0, trim);
            if (m3368b instanceof Integer) {
                i = ((Integer) m3368b).intValue();
            }
        }
        if (i == 0 && constraintLayout2 != null) {
            i = m2467c(constraintLayout2, trim);
        }
        if (i == 0) {
            try {
                i = AbstractC0446p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            i = this.f2219d.getResources().getIdentifier(trim, "id", this.f2219d.getPackageName());
        }
        if (i != 0) {
            this.f2222g.put(Integer.valueOf(i), trim);
            m2468b(i);
        }
    }

    /* renamed from: b */
    public final void m2468b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f2218c + 1;
        int[] iArr = this.f2217b;
        if (i2 > iArr.length) {
            this.f2217b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2217b;
        int i3 = this.f2218c;
        iArr2[i3] = i;
        this.f2218c = i3 + 1;
    }

    /* renamed from: c */
    public final int m2467c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f2219d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public abstract void mo2466d(AttributeSet attributeSet);

    /* renamed from: e */
    public void m2465e() {
    }

    /* renamed from: f */
    public void m2464f() {
    }

    /* renamed from: g */
    public void m2463g() {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2217b, this.f2218c);
    }

    /* renamed from: h */
    public void m2462h() {
        if (this.f2220e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0434d) {
            ((C0434d) layoutParams).f2271k0 = (C0410e) this.f2220e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2221f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2221f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2218c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m2469a(str.substring(i));
                return;
            } else {
                m2469a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2221f = null;
        this.f2218c = 0;
        for (int i : iArr) {
            m2468b(i);
        }
    }
}