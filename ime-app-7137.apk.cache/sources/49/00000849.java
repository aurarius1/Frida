package p093c.p145g.p146a.p147a.p168t;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* renamed from: c.g.a.a.t.d */
/* loaded from: classes.dex */
public class C1989d implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ MaterialButtonToggleGroup f6034b;

    public C1989d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f6034b = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return compareTo2 != 0 ? compareTo2 : Integer.valueOf(this.f6034b.indexOfChild(materialButton)).compareTo(Integer.valueOf(this.f6034b.indexOfChild(materialButton2)));
    }
}