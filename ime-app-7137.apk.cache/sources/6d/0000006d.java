package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    public static final PorterDuff.Mode f470a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public Object f472c;

    /* renamed from: k */
    public String f480k;

    /* renamed from: b */
    public int f471b = -1;

    /* renamed from: d */
    public byte[] f473d = null;

    /* renamed from: e */
    public Parcelable f474e = null;

    /* renamed from: f */
    public int f475f = 0;

    /* renamed from: g */
    public int f476g = 0;

    /* renamed from: h */
    public ColorStateList f477h = null;

    /* renamed from: i */
    public PorterDuff.Mode f478i = f470a;

    /* renamed from: j */
    public String f479j = null;

    /* renamed from: a */
    public int m3335a() {
        int i;
        int i2 = this.f471b;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f472c;
            if (i >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } else if (i2 == 2) {
            return this.f475f;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public String toString() {
        String str;
        int height;
        if (this.f471b == -1) {
            return String.valueOf(this.f472c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f471b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f471b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f472c).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f472c).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f480k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m3335a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f475f);
                if (this.f476g != 0) {
                    sb.append(" off=");
                    height = this.f476g;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f472c);
                break;
        }
        if (this.f477h != null) {
            sb.append(" tint=");
            sb.append(this.f477h);
        }
        if (this.f478i != f470a) {
            sb.append(" mode=");
            sb.append(this.f478i);
        }
        sb.append(")");
        return sb.toString();
    }
}