package p093c.p097b.p108i0.p114q;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: c.b.i0.q.g */
/* loaded from: classes.dex */
public class C1413g {

    /* renamed from: a */
    public final String f4660a;

    /* renamed from: b */
    public final String[] f4661b;

    /* renamed from: c */
    public final Uri f4662c;

    public C1413g(int i, int i2, String str, Uri uri, String... strArr) {
        this.f4660a = TextUtils.isEmpty(str) ? String.format(Locale.US, "%d.%d", Integer.valueOf(i), Integer.valueOf(i2)) : String.format(Locale.US, "%d.%d-%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f4661b = strArr;
        this.f4662c = uri;
    }
}