package p010b.p067m.p068d;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import p010b.p011a.p013l.InterfaceC0064b;

/* renamed from: b.m.d.z0 */
/* loaded from: classes.dex */
public class C0764z0 implements InterfaceC0064b {

    /* renamed from: a */
    public final /* synthetic */ C0690f1 f3254a;

    public C0764z0(C0690f1 c0690f1) {
        this.f3254a = c0690f1;
    }

    @Override // p010b.p011a.p013l.InterfaceC0064b
    /* renamed from: a */
    public void mo1841a(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) this.f3254a.f2992z.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo == null) {
            String str = "No Activities were started for result for " + this;
            return;
        }
        String str2 = fragmentManager$LaunchedFragmentInfo.f527b;
        int i = fragmentManager$LaunchedFragmentInfo.f528c;
        AbstractComponentCallbacksC0763z m1984e = this.f3254a.f2969c.m1984e(str2);
        if (m1984e == null) {
            return;
        }
        m1984e.mo1116O(i, activityResult.f129b, activityResult.f130c);
    }
}