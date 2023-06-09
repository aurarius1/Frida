package com.anysoftkeyboard.p180ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p010b.p091z.p092a.AbstractC1123n;

/* renamed from: com.anysoftkeyboard.ui.ViewPagerWithDisable */
/* loaded from: classes.dex */
public class ViewPagerWithDisable extends AbstractC1123n {
    public ViewPagerWithDisable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p010b.p091z.p092a.AbstractC1123n, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // p010b.p091z.p092a.AbstractC1123n, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}