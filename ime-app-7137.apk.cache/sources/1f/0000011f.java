package p010b.p016c.p020m.p021a;

import android.content.res.Resources;
import android.util.StateSet;

/* renamed from: b.c.m.a.m */
/* loaded from: classes.dex */
public abstract class AbstractC0155m extends AbstractC0153k {

    /* renamed from: J */
    public int[][] f1188J;

    public AbstractC0155m(AbstractC0155m abstractC0155m, AbstractC0156n abstractC0156n, Resources resources) {
        super(abstractC0155m, abstractC0156n, resources);
        if (abstractC0155m != null) {
            this.f1188J = abstractC0155m.f1188J;
        } else {
            this.f1188J = new int[this.f1155g.length];
        }
    }

    /* renamed from: g */
    public int m2982g(int[] iArr) {
        int[][] iArr2 = this.f1188J;
        int i = this.f1156h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }
}