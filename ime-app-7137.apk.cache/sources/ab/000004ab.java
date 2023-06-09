package p010b.p086w;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.w.o0 */
/* loaded from: classes.dex */
public class C1063o0 {

    /* renamed from: b */
    public View f4014b;

    /* renamed from: a */
    public final Map f4013a = new HashMap();

    /* renamed from: c */
    public final ArrayList f4015c = new ArrayList();

    public C1063o0(View view) {
        this.f4014b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1063o0) {
            C1063o0 c1063o0 = (C1063o0) obj;
            return this.f4014b == c1063o0.f4014b && this.f4013a.equals(c1063o0.f4013a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4013a.hashCode() + (this.f4014b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("TransitionValues@");
        m1187i.append(Integer.toHexString(hashCode()));
        m1187i.append(":\n");
        String m1190f = AbstractC1124a.m1190f(m1187i.toString() + "    view = " + this.f4014b + "\n", "    values:");
        for (String str : this.f4013a.keySet()) {
            m1190f = m1190f + "    " + str + ": " + this.f4013a.get(str) + "\n";
        }
        return m1190f;
    }
}