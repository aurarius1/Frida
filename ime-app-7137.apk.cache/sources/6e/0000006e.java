package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p010b.p090y.AbstractC1107b;
import p010b.p090y.C1108c;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1107b abstractC1107b) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f471b = abstractC1107b.m1229i(iconCompat.f471b, 1);
        byte[] bArr = iconCompat.f473d;
        if (abstractC1107b.mo1221h(2)) {
            C1108c c1108c = (C1108c) abstractC1107b;
            int readInt = c1108c.f4151e.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                c1108c.f4151e.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f473d = bArr;
        iconCompat.f474e = abstractC1107b.m1228j(iconCompat.f474e, 3);
        iconCompat.f475f = abstractC1107b.m1229i(iconCompat.f475f, 4);
        iconCompat.f476g = abstractC1107b.m1229i(iconCompat.f476g, 5);
        iconCompat.f477h = (ColorStateList) abstractC1107b.m1228j(iconCompat.f477h, 6);
        String str = iconCompat.f479j;
        if (abstractC1107b.mo1221h(7)) {
            str = ((C1108c) abstractC1107b).f4151e.readString();
        }
        iconCompat.f479j = str;
        String str2 = iconCompat.f480k;
        if (abstractC1107b.mo1221h(8)) {
            str2 = ((C1108c) abstractC1107b).f4151e.readString();
        }
        iconCompat.f480k = str2;
        iconCompat.f478i = PorterDuff.Mode.valueOf(iconCompat.f479j);
        switch (iconCompat.f471b) {
            case -1:
                parcelable = iconCompat.f474e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f472c = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f474e;
                if (parcelable == null) {
                    byte[] bArr3 = iconCompat.f473d;
                    iconCompat.f472c = bArr3;
                    iconCompat.f471b = 3;
                    iconCompat.f475f = 0;
                    iconCompat.f476g = bArr3.length;
                    break;
                }
                iconCompat.f472c = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f473d, Charset.forName("UTF-16"));
                iconCompat.f472c = str3;
                if (iconCompat.f471b == 2 && iconCompat.f480k == null) {
                    iconCompat.f480k = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f472c = iconCompat.f473d;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1107b abstractC1107b) {
        abstractC1107b.getClass();
        iconCompat.f479j = iconCompat.f478i.name();
        switch (iconCompat.f471b) {
            case -1:
            case 1:
            case 5:
                iconCompat.f474e = (Parcelable) iconCompat.f472c;
                break;
            case 2:
                iconCompat.f473d = ((String) iconCompat.f472c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f473d = (byte[]) iconCompat.f472c;
                break;
            case 4:
            case 6:
                iconCompat.f473d = iconCompat.f472c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f471b;
        if (-1 != i) {
            abstractC1107b.m1226m(i, 1);
        }
        byte[] bArr = iconCompat.f473d;
        if (bArr != null) {
            abstractC1107b.mo1220l(2);
            C1108c c1108c = (C1108c) abstractC1107b;
            c1108c.f4151e.writeInt(bArr.length);
            c1108c.f4151e.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f474e;
        if (parcelable != null) {
            abstractC1107b.mo1220l(3);
            ((C1108c) abstractC1107b).f4151e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f475f;
        if (i2 != 0) {
            abstractC1107b.m1226m(i2, 4);
        }
        int i3 = iconCompat.f476g;
        if (i3 != 0) {
            abstractC1107b.m1226m(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f477h;
        if (colorStateList != null) {
            abstractC1107b.mo1220l(6);
            ((C1108c) abstractC1107b).f4151e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f479j;
        if (str != null) {
            abstractC1107b.mo1220l(7);
            ((C1108c) abstractC1107b).f4151e.writeString(str);
        }
        String str2 = iconCompat.f480k;
        if (str2 != null) {
            abstractC1107b.mo1220l(8);
            ((C1108c) abstractC1107b).f4151e.writeString(str2);
        }
    }
}