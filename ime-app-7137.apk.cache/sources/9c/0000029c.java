package p010b.p046j.p055i;

import android.util.Base64;
import java.util.List;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.i.f */
/* loaded from: classes.dex */
public final class C0536f {

    /* renamed from: a */
    public final String f2591a;

    /* renamed from: b */
    public final String f2592b;

    /* renamed from: c */
    public final String f2593c;

    /* renamed from: d */
    public final List f2594d;

    /* renamed from: e */
    public final String f2595e;

    public C0536f(String str, String str2, String str3, List list) {
        this.f2591a = str;
        this.f2592b = str2;
        this.f2593c = str3;
        list.getClass();
        this.f2594d = list;
        this.f2595e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder m1187i = AbstractC1124a.m1187i("FontRequest {mProviderAuthority: ");
        m1187i.append(this.f2591a);
        m1187i.append(", mProviderPackage: ");
        m1187i.append(this.f2592b);
        m1187i.append(", mQuery: ");
        m1187i.append(this.f2593c);
        m1187i.append(", mCertificates:");
        sb.append(m1187i.toString());
        for (int i = 0; i < this.f2594d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f2594d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}