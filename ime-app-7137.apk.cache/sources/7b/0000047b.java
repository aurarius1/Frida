package p010b.p085v;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b.v.b */
/* loaded from: classes.dex */
public final class C1015b implements InterfaceC1017d {

    /* renamed from: a */
    public final Set f3905a = new HashSet();

    public C1015b(C1018e c1018e) {
        c1018e.m1389b("androidx.savedstate.Restarter", this);
    }

    @Override // p010b.p085v.InterfaceC1017d
    /* renamed from: a */
    public Bundle mo1391a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3905a));
        return bundle;
    }
}