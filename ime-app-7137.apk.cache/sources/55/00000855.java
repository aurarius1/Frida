package p093c.p145g.p146a.p147a.p170v;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* renamed from: c.g.a.a.v.g */
/* loaded from: classes.dex */
public class C2001g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ChipGroup f6113a;

    public C2001g(ChipGroup chipGroup, AbstractC2000f abstractC2000f) {
        this.f6113a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ChipGroup chipGroup = this.f6113a;
        if (chipGroup.f6795o) {
            return;
        }
        if (chipGroup.getCheckedChipIds().isEmpty()) {
            ChipGroup chipGroup2 = this.f6113a;
            if (chipGroup2.f6790j) {
                chipGroup2.m294c(compoundButton.getId(), true);
                ChipGroup chipGroup3 = this.f6113a;
                chipGroup3.f6794n = compoundButton.getId();
                InterfaceC2003i interfaceC2003i = chipGroup3.f6791k;
                return;
            }
        }
        int id = compoundButton.getId();
        if (z) {
            ChipGroup chipGroup4 = this.f6113a;
            int i = chipGroup4.f6794n;
            if (i != -1 && i != id && chipGroup4.f6789i) {
                chipGroup4.m294c(i, false);
            }
            this.f6113a.setCheckedId(id);
            return;
        }
        ChipGroup chipGroup5 = this.f6113a;
        if (chipGroup5.f6794n == id) {
            chipGroup5.setCheckedId(-1);
        }
    }
}