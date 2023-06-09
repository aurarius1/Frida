package p181d.p182a;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: d.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC2092c {

    /* renamed from: a */
    public static final /* synthetic */ int f7003a = 0;

    static {
        HashMap hashMap = new HashMap();
        EnumC2091b[] values = EnumC2091b.values();
        for (int i = 0; i < 5; i++) {
            EnumC2091b enumC2091b = values[i];
            hashMap.put(Character.valueOf(enumC2091b.f7002h), enumC2091b);
        }
        Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        EnumC2090a[] values2 = EnumC2090a.values();
        for (int i2 = 0; i2 < 2; i2++) {
            EnumC2090a enumC2090a = values2[i2];
            hashMap2.put(Character.valueOf(enumC2090a.f6995e), enumC2090a);
        }
        Collections.unmodifiableMap(hashMap2);
    }
}