package p093c.p097b.p130z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.StringTokenizer;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p130z.C1684n;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.z.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC1681l0 {

    /* renamed from: a */
    public static final TypedValue f5179a = new TypedValue();

    /* renamed from: a */
    public static int[] m916a(TypedArray typedArray, int i) {
        int i2;
        int i3;
        TypedValue typedValue = f5179a;
        typedArray.getValue(i, typedValue);
        int i4 = typedValue.type;
        if (i4 == 16 || i4 == 17) {
            return new int[]{typedValue.data};
        }
        if (i4 == 3) {
            String charSequence = typedValue.coerceToString().toString();
            if (charSequence.length() > 0) {
                int i5 = 0;
                i2 = 1;
                while (true) {
                    i5 = charSequence.indexOf(",", i5 + 1);
                    if (i5 <= 0) {
                        break;
                    }
                    i2++;
                }
            } else {
                i2 = 0;
            }
            int[] iArr = new int[i2];
            StringTokenizer stringTokenizer = new StringTokenizer(charSequence, ",");
            int i6 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                try {
                    if (nextToken.length() != 1) {
                        i3 = i6 + 1;
                        try {
                            iArr[i6] = Integer.parseInt(nextToken);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        i3 = i6 + 1;
                        iArr[i6] = nextToken.charAt(0);
                    }
                    i6 = i3;
                } catch (NumberFormatException unused2) {
                }
            }
            return iArr;
        }
        return new int[0];
    }

    /* renamed from: b */
    public static int m915b(InterfaceC1677j0 interfaceC1677j0, int i, float f) {
        return (int) ((i != -3 ? i != -2 ? i != 0 ? interfaceC1677j0.mo860g() : 0 : interfaceC1677j0.mo861f() : interfaceC1677j0.mo865b()) * f);
    }

    /* renamed from: c */
    public static AbstractC2094b m914c(Context context) {
        boolean z = context.getResources().getConfiguration().orientation == 2;
        C1151a0 m182t = AnyApplication.m182t(context);
        int i = z ? R.string.settings_key_landscape_keyboard_height_factor : R.string.settings_key_portrait_keyboard_height_factor;
        int i2 = z ? R.string.settings_default_landscape_keyboard_height_factor : R.string.settings_default_portrait_keyboard_height_factor;
        final C1684n c1684n = C1684n.f5183a;
        String string = m182t.f4273a.getString(i2);
        AbstractC2094b m172F = ((C1785g) m182t.f4274b.m807a(m182t.f4273a.getString(i), string)).f5459e.m172F(new InterfaceC2127i() { // from class: c.b.c0.q
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                ((C1684n) InterfaceC1182z.this).getClass();
                return Float.valueOf(Float.parseFloat((String) obj));
            }
        });
        Float valueOf = Float.valueOf(Float.parseFloat(string));
        if (valueOf != null) {
            return m172F.m169I(AbstractC2146l.m115b(valueOf)).m172F(new InterfaceC2127i() { // from class: c.b.z.d
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    float floatValue = ((Float) obj).floatValue();
                    TypedValue typedValue = AbstractC1681l0.f5179a;
                    if (floatValue > 2.0f) {
                        floatValue = 2.0f;
                    } else if (floatValue < 0.2f) {
                        floatValue = 0.2f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
        throw new NullPointerException("item is null");
    }
}