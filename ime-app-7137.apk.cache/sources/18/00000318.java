package p010b.p064l.p066b;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: b.l.b.e */
/* loaded from: classes.dex */
public class C0660e implements Comparator {

    /* renamed from: b */
    public final Rect f2870b = new Rect();

    /* renamed from: c */
    public final Rect f2871c = new Rect();

    /* renamed from: d */
    public final boolean f2872d;

    /* renamed from: e */
    public final C0656a f2873e;

    public C0660e(boolean z, C0656a c0656a) {
        this.f2872d = z;
        this.f2873e = c0656a;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Rect rect = this.f2870b;
        Rect rect2 = this.f2871c;
        this.f2873e.m2156a(obj, rect);
        this.f2873e.m2156a(obj2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f2872d ? 1 : -1;
        } else if (i3 > i4) {
            return this.f2872d ? -1 : 1;
        } else {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f2872d ? 1 : -1;
            } else if (i7 > i8) {
                return this.f2872d ? -1 : 1;
            } else {
                return 0;
            }
        }
    }
}