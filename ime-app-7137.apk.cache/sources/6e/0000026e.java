package p010b.p046j.p047d;

import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: b.j.d.w */
/* loaded from: classes.dex */
public abstract class AbstractC0490w {

    /* renamed from: a */
    public static final Object f2505a = new Object();

    /* renamed from: b */
    public static Field f2506b;

    /* renamed from: c */
    public static boolean f2507c;

    /* renamed from: a */
    public static SparseArray m2414a(List list) {
        int size = list.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }
}