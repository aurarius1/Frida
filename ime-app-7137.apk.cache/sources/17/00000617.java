package p093c.p097b.p116p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: c.b.p.e */
/* loaded from: classes.dex */
public abstract class AbstractC1427e {

    /* renamed from: a */
    public final String f4705a;

    /* renamed from: b */
    public final String f4706b;

    /* renamed from: c */
    public final CharSequence f4707c;

    /* renamed from: d */
    public final String f4708d;

    /* renamed from: e */
    public final Context f4709e;

    /* renamed from: f */
    public WeakReference f4710f;

    /* renamed from: g */
    public final int f4711g;

    /* renamed from: h */
    public final InterfaceC1423a f4712h;

    /* renamed from: i */
    public final boolean f4713i;

    /* renamed from: j */
    public final int f4714j;

    public AbstractC1427e(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i2) {
        this.f4705a = charSequence.toString();
        this.f4709e = context;
        this.f4714j = i;
        this.f4706b = charSequence2.toString();
        this.f4707c = charSequence3;
        this.f4708d = context2.getPackageName();
        this.f4710f = new WeakReference(context2);
        this.f4711g = i2;
        this.f4712h = context.getPackageName().equals(context2.getPackageName()) ? new C1426d(i, null) : new C1425c(this, null);
        this.f4713i = z;
    }

    /* renamed from: a */
    public final Context m1062a() {
        Context context = (Context) this.f4710f.get();
        if (context == null) {
            try {
                context = this.f4709e.createPackageContext(this.f4708d, 2);
                this.f4710f = new WeakReference(context);
                return context;
            } catch (PackageManager.NameNotFoundException unused) {
                return context;
            }
        }
        return context;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC1427e) {
            AbstractC1427e abstractC1427e = (AbstractC1427e) obj;
            if (TextUtils.equals(abstractC1427e.f4705a, this.f4705a) && abstractC1427e.f4714j == this.f4714j) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f4705a.hashCode();
    }

    public String toString() {
        return String.format(Locale.US, "%s '%s' from %s (id %s), API-%d", getClass().getName(), this.f4706b, this.f4708d, this.f4705a, Integer.valueOf(this.f4714j));
    }
}