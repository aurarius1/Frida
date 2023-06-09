package p093c.p097b.p102d0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.Arrays;
import java.util.List;
import p093c.p097b.p116p.AbstractC1427e;

/* renamed from: c.b.d0.e */
/* loaded from: classes.dex */
public class C1188e extends AbstractC1427e {

    /* renamed from: k */
    public int f4322k;

    /* renamed from: l */
    public String[] f4323l;

    /* renamed from: m */
    public String[] f4324m;

    /* renamed from: n */
    public int[] f4325n;

    /* renamed from: o */
    public CharSequence f4326o;

    public C1188e(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence3, CharSequence charSequence4, int i7, boolean z, CharSequence charSequence5, int i8) {
        super(context, context2, i, charSequence, charSequence2, charSequence5, z, i8);
        Resources resources = context2.getResources();
        this.f4322k = i2;
        if (i2 == 0) {
            this.f4323l = mo1153d(i3, resources);
            this.f4324m = mo1152e(i4, resources);
            if (i5 != 0) {
                TypedArray obtainTypedArray = resources.obtainTypedArray(i5);
                this.f4325n = new int[obtainTypedArray.length()];
                int i9 = 0;
                while (true) {
                    int[] iArr = this.f4325n;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    iArr[i9] = obtainTypedArray.getResourceId(i9, 0);
                    i9++;
                }
                obtainTypedArray.recycle();
            }
        }
        this.f4326o = charSequence4;
    }

    /* renamed from: b */
    public List mo1155b() {
        return Arrays.asList(this.f4323l);
    }

    /* renamed from: c */
    public List mo1154c() {
        return Arrays.asList(this.f4324m);
    }

    /* renamed from: d */
    public String[] mo1153d(int i, Resources resources) {
        return resources.getStringArray(i);
    }

    /* renamed from: e */
    public String[] mo1152e(int i, Resources resources) {
        return resources.getStringArray(i);
    }

    /* renamed from: f */
    public boolean m1151f() {
        return this.f4322k != 0;
    }
}