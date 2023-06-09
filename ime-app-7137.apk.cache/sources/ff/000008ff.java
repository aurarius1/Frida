package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0183f0;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0183f0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0183f0
    /* renamed from: b */
    public void mo274b(C0199p c0199p) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}