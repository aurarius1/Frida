package p010b.p046j.p050f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p048e.p049b.C0498d;
import p010b.p046j.p055i.C0544n;

/* renamed from: b.j.f.k */
/* loaded from: classes.dex */
public class C0516k extends C0520o {
    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: a */
    public Typeface mo2362a(Context context, C0497c c0497c, Resources resources, int i) {
        try {
            C0498d[] c0498dArr = c0497c.f2520a;
            int length = c0498dArr.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                C0498d c0498d = c0498dArr[i2];
                try {
                    Font.Builder weight = new Font.Builder(resources, c0498d.f2526f).setWeight(c0498d.f2522b);
                    if (!c0498d.f2523c) {
                        i3 = 0;
                    }
                    Font build = weight.setSlant(i3).setTtcIndex(c0498d.f2525e).setFontVariationSettings(c0498d.f2524d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i2++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: b */
    public Typeface mo2361b(Context context, CancellationSignal cancellationSignal, C0544n[] c0544nArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0544nArr.length;
            FontFamily.Builder builder = null;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
                }
                C0544n c0544n = c0544nArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0544n.f2614a, "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c0544n.f2616c);
                        if (!c0544n.f2617d) {
                            i3 = 0;
                        }
                        Font build = weight.setSlant(i3).setTtcIndex(c0544n.f2615b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable unused2) {
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: c */
    public Typeface mo2360c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: d */
    public Typeface mo2359d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: f */
    public C0544n mo2357f(C0544n[] c0544nArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}