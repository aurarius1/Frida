package com.anysoftkeyboard.quicktextkeys.p179ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anysoftkeyboard.p180ui.ViewPagerWithDisable;
import com.astuetz.PagerSlidingTabStrip;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import p093c.p097b.p102d0.C1185b;
import p093c.p097b.p102d0.C1187d;
import p093c.p097b.p102d0.p103k.C1196c;
import p093c.p097b.p102d0.p103k.C1197d;
import p093c.p097b.p102d0.p103k.C1200g;
import p093c.p097b.p102d0.p103k.C1202i;
import p093c.p097b.p102d0.p103k.C1203j;
import p093c.p097b.p102d0.p103k.C1204k;
import p093c.p097b.p102d0.p103k.View$OnClickListenerC1198e;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p128x.InterfaceC1561c3;
import p093c.p097b.p130z.p132r0.InterfaceC1748t0;

/* renamed from: com.anysoftkeyboard.quicktextkeys.ui.QuickTextPagerView */
/* loaded from: classes.dex */
public class QuickTextPagerView extends LinearLayout implements InterfaceC1561c3 {

    /* renamed from: b */
    public C1237f f6570b;

    /* renamed from: c */
    public float f6571c;

    /* renamed from: d */
    public ColorStateList f6572d;

    /* renamed from: e */
    public Drawable f6573e;

    /* renamed from: f */
    public Drawable f6574f;

    /* renamed from: g */
    public Drawable f6575g;

    /* renamed from: h */
    public Drawable f6576h;

    /* renamed from: i */
    public Drawable f6577i;

    /* renamed from: j */
    public int f6578j;

    /* renamed from: k */
    public C1187d f6579k;

    /* renamed from: l */
    public C1197d f6580l;

    /* renamed from: m */
    public C1196c f6581m;

    public QuickTextPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p093c.p097b.p128x.InterfaceC1561c3
    public void setOnKeyboardActionListener(InterfaceC1748t0 interfaceC1748t0) {
        View$OnClickListenerC1198e view$OnClickListenerC1198e = new View$OnClickListenerC1198e(interfaceC1748t0);
        findViewById(R.id.quick_keys_popup_close).setOnClickListener(view$OnClickListenerC1198e);
        findViewById(R.id.quick_keys_popup_backspace).setOnClickListener(view$OnClickListenerC1198e);
        findViewById(R.id.quick_keys_popup_quick_keys_settings).setOnClickListener(view$OnClickListenerC1198e);
        findViewById(R.id.quick_keys_popup_quick_keys_insert_media).setOnClickListener(view$OnClickListenerC1198e);
        findViewById(R.id.quick_keys_popup_delete_recently_used_smileys).setOnClickListener(view$OnClickListenerC1198e);
        Context context = getContext();
        ArrayList arrayList = new ArrayList();
        C1185b c1185b = new C1185b(context, this.f6579k);
        arrayList.add(c1185b);
        C1450g c1450g = AnyApplication.f6979b;
        arrayList.addAll(((AnyApplication) context.getApplicationContext()).f6988k.m1057g());
        C1203j c1203j = new C1203j(context);
        ViewPagerWithDisable viewPagerWithDisable = (ViewPagerWithDisable) findViewById(R.id.quick_text_keyboards_pager);
        C1200g c1200g = new C1200g(context, viewPagerWithDisable, arrayList, new C1204k(c1185b, interfaceC1748t0), this.f6580l, this.f6581m, this.f6570b, this.f6578j);
        ImageView imageView = (ImageView) findViewById(R.id.quick_keys_popup_delete_recently_used_smileys);
        C1202i c1202i = new C1202i(this, arrayList, c1203j, imageView);
        int m1146a = c1203j.m1146a(arrayList, c1203j.f4366a.getString(c1203j.f4367b, c1203j.f4368c));
        float f = this.f6571c;
        ColorStateList colorStateList = this.f6572d;
        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.pager_tabs);
        pagerSlidingTabStrip.setTextSize((int) f);
        pagerSlidingTabStrip.setTextColor(colorStateList.getDefaultColor());
        pagerSlidingTabStrip.setIndicatorColor(colorStateList.getDefaultColor());
        viewPagerWithDisable.setAdapter(c1200g);
        viewPagerWithDisable.setCurrentItem(m1146a);
        pagerSlidingTabStrip.setViewPager(viewPagerWithDisable);
        pagerSlidingTabStrip.setOnPageChangeListener(c1202i);
        ((ImageView) findViewById(R.id.quick_keys_popup_close)).setImageDrawable(this.f6573e);
        ((ImageView) findViewById(R.id.quick_keys_popup_backspace)).setImageDrawable(this.f6574f);
        ((ImageView) findViewById(R.id.quick_keys_popup_quick_keys_insert_media)).setImageDrawable(this.f6576h);
        imageView.setImageDrawable(this.f6577i);
        ((ImageView) findViewById(R.id.quick_keys_popup_quick_keys_settings)).setImageDrawable(this.f6575g);
        View findViewById = findViewById(R.id.quick_text_actions_layout);
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom() + this.f6578j);
    }

    public void setQuickKeyHistoryRecords(C1187d c1187d) {
        this.f6579k = c1187d;
    }
}