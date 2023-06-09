package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;

/* renamed from: b.c.q.j0 */
/* loaded from: classes.dex */
public class C0264j0 extends PopupWindow {

    /* renamed from: a */
    public static final boolean f1609a;

    /* renamed from: b */
    public boolean f1610b;

    static {
        f1609a = Build.VERSION.SDK_INT < 21;
    }

    public C0264j0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.PopupWindow, i, i2);
        int i3 = AbstractC0084j.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i3)) {
            boolean z = obtainStyledAttributes.getBoolean(i3, false);
            if (f1609a) {
                this.f1610b = z;
            } else {
                AbstractC0022t.m3486k0(this, z);
            }
        }
        int i4 = AbstractC0084j.PopupWindow_android_popupBackground;
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) ? obtainStyledAttributes.getDrawable(i4) : AbstractC0142b.m3000b(context, resourceId));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1609a && this.f1610b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1609a && this.f1610b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1609a && this.f1610b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}