package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.p159k0.C1928b;

/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b */
    public final Chip f6929b;

    /* renamed from: c */
    public final TextInputLayout f6930c;

    /* renamed from: d */
    public final EditText f6931d;

    /* renamed from: e */
    public TextWatcher f6932e;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(AbstractC1868h.material_time_chip, (ViewGroup) this, false);
        this.f6929b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(AbstractC1868h.material_time_input, (ViewGroup) this, false);
        this.f6930c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f6931d = editText;
        editText.setVisibility(4);
        C1928b c1928b = new C1928b(this, null);
        this.f6932e = c1928b;
        editText.addTextChangedListener(c1928b);
        m229b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(AbstractC1840f.material_label);
        editText.setSaveEnabled(false);
    }

    /* renamed from: a */
    public static String m230a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: b */
    public final void m229b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f6931d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f6929b.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m229b();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f6929b.setChecked(z);
        this.f6931d.setVisibility(z ? 0 : 4);
        this.f6929b.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f6931d.requestFocus();
            if (TextUtils.isEmpty(this.f6931d.getText())) {
                return;
            }
            EditText editText = this.f6931d;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6929b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f6929b.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f6929b.toggle();
    }
}