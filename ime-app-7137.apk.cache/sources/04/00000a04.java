package net.evendanan.pixel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p204f.p205a.p209b.AbstractC2297h;
import p204f.p205a.p209b.AbstractC2298i;
import p204f.p205a.p209b.AbstractC2299j;
import p204f.p205a.p209b.AbstractC2301l;

/* loaded from: classes.dex */
public class SettingsTileView extends LinearLayout {

    /* renamed from: b */
    public TextView f7478b;

    /* renamed from: c */
    public ImageView f7479c;

    /* renamed from: d */
    public Drawable f7480d;

    /* renamed from: e */
    public CharSequence f7481e;

    public SettingsTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2a();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2301l.SettingsTileView);
        this.f7480d = obtainStyledAttributes.getDrawable(AbstractC2301l.SettingsTileView_tileImage);
        this.f7481e = obtainStyledAttributes.getText(AbstractC2301l.SettingsTileView_tileLabel);
        obtainStyledAttributes.recycle();
        LinearLayout.inflate(getContext(), AbstractC2299j.settings_tile_view, this);
    }

    /* renamed from: a */
    public final void m2a() {
        LinearLayout.LayoutParams layoutParams;
        setBackgroundResource(AbstractC2297h.transparent_click_feedback_background);
        if (getResources().getConfiguration().orientation == 2) {
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
    }

    public Drawable getImage() {
        return this.f7479c.getDrawable();
    }

    public CharSequence getLabel() {
        return this.f7478b.getText();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(AbstractC2298i.tile_image);
        this.f7479c = imageView;
        imageView.setImageDrawable(this.f7480d);
        TextView textView = (TextView) findViewById(AbstractC2298i.tile_label);
        this.f7478b = textView;
        textView.setText(this.f7481e);
        m2a();
    }

    public void setImage(int i) {
        this.f7479c.setImageResource(i);
    }

    public void setLabel(CharSequence charSequence) {
        this.f7478b.setText(charSequence);
    }
}