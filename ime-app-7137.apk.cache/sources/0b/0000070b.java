package p093c.p097b.p130z;

import android.content.Context;
import com.menny.android.anysoftkeyboard.AnyApplication;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p129y.C1656a;

/* renamed from: c.b.z.g0 */
/* loaded from: classes.dex */
public class C1671g0 extends AbstractC1427e {

    /* renamed from: k */
    public final int f5156k;

    /* renamed from: l */
    public final int f5157l;

    /* renamed from: m */
    public final int f5158m;

    /* renamed from: n */
    public final String f5159n;

    /* renamed from: o */
    public final int f5160o;

    /* renamed from: p */
    public final String f5161p;

    /* renamed from: q */
    public final String f5162q;

    /* renamed from: r */
    public final boolean f5163r;

    /* renamed from: s */
    public final Context f5164s;

    public C1671g0(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, int i2, int i3, String str, int i4, int i5, String str2, String str3, CharSequence charSequence3, boolean z, int i6, boolean z2) {
        super(context, context2, i, charSequence, charSequence2, charSequence3, z, i6);
        this.f5156k = i2;
        if (i3 == 0) {
            this.f5157l = i2;
        } else {
            this.f5157l = i3;
        }
        this.f5159n = str;
        this.f5158m = i4;
        this.f5161p = str2;
        this.f5162q = str3;
        this.f5160o = i5;
        this.f5163r = z2;
        this.f5164s = context;
    }

    /* renamed from: b */
    public AbstractC1762t m922b(int i) {
        if (m1062a() == null) {
            return null;
        }
        Context context = this.f5164s;
        int i2 = this.f5156k;
        int i3 = this.f5157l;
        String str = this.f4706b;
        int i4 = this.f5158m;
        int i5 = this.f5160o;
        String str2 = this.f5159n;
        String str3 = this.f5161p;
        String str4 = this.f5162q;
        C1450g c1450g = AnyApplication.f6979b;
        return new C1765w(this, context, i2, i3, str, i4, i5, str2, str3, str4, i, (C1656a) ((AnyApplication) context.getApplicationContext()).f6986i.m1058f());
    }
}