package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0183f0;
import p010b.p016c.p024p.p025m.InterfaceC0198o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0198o, InterfaceC0183f0, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static final int[] f148b = {16842964, 16843049};

    /* renamed from: c */
    public C0199p f149c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f148b, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0142b.m3000b(context, resourceId2));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider((!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) ? obtainStyledAttributes.getDrawable(1) : AbstractC0142b.m3000b(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0198o
    /* renamed from: a */
    public boolean mo2939a(C0202s c0202s) {
        return this.f149c.m2920s(c0202s, null, 0);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0183f0
    /* renamed from: b */
    public void mo274b(C0199p c0199p) {
        this.f149c = c0199p;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2939a((C0202s) getAdapter().getItem(i));
    }
}