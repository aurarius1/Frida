package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p010b.p016c.AbstractC0084j;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: b */
    public final int f135b;

    /* renamed from: c */
    public final int f136c;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.RecycleListView);
        this.f136c = obtainStyledAttributes.getDimensionPixelOffset(AbstractC0084j.RecycleListView_paddingBottomNoButtons, -1);
        this.f135b = obtainStyledAttributes.getDimensionPixelOffset(AbstractC0084j.RecycleListView_paddingTopNoTitle, -1);
    }
}