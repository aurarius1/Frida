package p093c.p145g.p146a.p147a.p170v;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.chip.Chip;
import java.util.List;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p064l.p066b.AbstractC0659d;
import p093c.p145g.p146a.p147a.AbstractC1924j;

/* renamed from: c.g.a.a.v.c */
/* loaded from: classes.dex */
public class C1997c extends AbstractC0659d {

    /* renamed from: q */
    public final /* synthetic */ Chip f6049q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1997c(Chip chip, Chip chip2) {
        super(chip2);
        this.f6049q = chip;
    }

    @Override // p010b.p064l.p066b.AbstractC0659d
    /* renamed from: m */
    public void mo617m(List list) {
        boolean z = false;
        list.add(0);
        Chip chip = this.f6049q;
        int i = Chip.f6766e;
        if (chip.m304d()) {
            Chip chip2 = this.f6049q;
            C1999e c1999e = chip2.f6770i;
            if (c1999e != null && c1999e.f6075O) {
                z = true;
            }
            if (!z || chip2.f6773l == null) {
                return;
            }
            list.add(1);
        }
    }

    @Override // p010b.p064l.p066b.AbstractC0659d
    /* renamed from: p */
    public boolean mo616p(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            if (i == 0) {
                return this.f6049q.performClick();
            }
            if (i == 1) {
                Chip chip = this.f6049q;
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f6773l;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                chip.f6782u.m2146s(1, 1);
            }
        }
        return z;
    }

    @Override // p010b.p064l.p066b.AbstractC0659d
    /* renamed from: q */
    public void mo615q(int i, C0580e c0580e) {
        Rect closeIconTouchBoundsInt;
        if (i == 1) {
            CharSequence closeIconContentDescription = this.f6049q.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = this.f6049q.getText();
                Context context = this.f6049q.getContext();
                int i2 = AbstractC1924j.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(i2, objArr).trim();
            }
            c0580e.f2703b.setContentDescription(closeIconContentDescription);
            closeIconTouchBoundsInt = this.f6049q.getCloseIconTouchBoundsInt();
            c0580e.f2703b.setBoundsInParent(closeIconTouchBoundsInt);
            c0580e.m2313a(C0577b.f2688a);
            c0580e.f2703b.setEnabled(this.f6049q.isEnabled());
            return;
        }
        c0580e.f2703b.setContentDescription("");
        c0580e.f2703b.setBoundsInParent(Chip.f6767f);
    }
}