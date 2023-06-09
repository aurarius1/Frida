package p183e.p184a.p190p.p192b;

import android.content.Intent;
import com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p128x.C1548a0;
import p183e.p184a.p189o.InterfaceC2126h;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: e.a.p.b.d */
/* loaded from: classes.dex */
public final class C2138d implements InterfaceC2127i {

    /* renamed from: b */
    public final InterfaceC2126h f7032b;

    public C2138d(InterfaceC2126h interfaceC2126h) {
        this.f7032b = interfaceC2126h;
    }

    @Override // p183e.p184a.p189o.InterfaceC2127i
    /* renamed from: a */
    public Object mo24a(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 6) {
            InterfaceC2126h interfaceC2126h = this.f7032b;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            AnySoftKeyboardPressEffects anySoftKeyboardPressEffects = ((C1548a0) interfaceC2126h).f4964a;
            Boolean bool = (Boolean) obj3;
            Intent intent = (Intent) obj4;
            Boolean bool2 = (Boolean) obj5;
            Boolean bool3 = (Boolean) obj6;
            Integer num = (Integer) obj7;
            anySoftKeyboardPressEffects.getClass();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            Float valueOf = Float.valueOf(0.0f);
            if (!booleanValue && !bool.booleanValue() && anySoftKeyboardPressEffects.f6364W0.getRingerMode() == 2 && bool2.booleanValue()) {
                return Float.valueOf(bool3.booleanValue() ? num.intValue() / 100.0f : -1.0f);
            }
            return valueOf;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Array of size 6 expected but got ");
        m1187i.append(objArr.length);
        throw new IllegalArgumentException(m1187i.toString());
    }
}