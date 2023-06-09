package p010b.p067m.p068d;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import java.util.ArrayList;
import java.util.Map;
import p010b.p011a.p013l.InterfaceC0064b;

/* renamed from: b.m.d.s0 */
/* loaded from: classes.dex */
public class C0741s0 implements InterfaceC0064b {

    /* renamed from: a */
    public final /* synthetic */ C0690f1 f3118a;

    public C0741s0(C0690f1 c0690f1) {
        this.f3118a = c0690f1;
    }

    @Override // p010b.p011a.p013l.InterfaceC0064b
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: a */
    public void mo1841a(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) this.f3118a.f2992z.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo == null) {
            String str = "No permissions were requested for " + this;
            return;
        }
        String str2 = fragmentManager$LaunchedFragmentInfo.f527b;
        int i2 = fragmentManager$LaunchedFragmentInfo.f528c;
        AbstractComponentCallbacksC0763z m1984e = this.f3118a.f2969c.m1984e(str2);
        if (m1984e == null) {
            return;
        }
        m1984e.mo1101l0(i2, strArr, iArr);
    }
}