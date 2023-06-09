package p010b.p046j.p056j;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: b.j.j.b */
/* loaded from: classes.dex */
public final class C0550b {

    /* renamed from: a */
    public static final AbstractC0556h f2632a;

    /* renamed from: b */
    public static final String f2633b;

    /* renamed from: c */
    public static final String f2634c;

    /* renamed from: d */
    public static final C0550b f2635d;

    /* renamed from: e */
    public static final C0550b f2636e;

    /* renamed from: f */
    public final boolean f2637f;

    /* renamed from: g */
    public final int f2638g;

    /* renamed from: h */
    public final AbstractC0556h f2639h;

    static {
        AbstractC0556h abstractC0556h = AbstractC0558j.f2651c;
        f2632a = abstractC0556h;
        f2633b = Character.toString((char) 8206);
        f2634c = Character.toString((char) 8207);
        f2635d = new C0550b(false, 2, abstractC0556h);
        f2636e = new C0550b(true, 2, abstractC0556h);
    }

    public C0550b(boolean z, int i, AbstractC0556h abstractC0556h) {
        this.f2637f = z;
        this.f2638g = i;
        this.f2639h = abstractC0556h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r3 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.f2630d <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.m2342a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2341a(CharSequence charSequence) {
        byte directionality;
        C0549a c0549a = new C0549a(charSequence, false);
        c0549a.f2630d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0549a.f2630d;
            if (i4 < c0549a.f2629c && i == 0) {
                char charAt = c0549a.f2628b.charAt(i4);
                c0549a.f2631e = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(c0549a.f2628b, c0549a.f2630d);
                    c0549a.f2630d = Character.charCount(codePointAt) + c0549a.f2630d;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    c0549a.f2630d++;
                    char c = c0549a.f2631e;
                    directionality = c < 1792 ? C0549a.f2627a[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m2340b(CharSequence charSequence) {
        C0549a c0549a = new C0549a(charSequence, false);
        c0549a.f2630d = c0549a.f2629c;
        int i = 0;
        int i2 = 0;
        while (c0549a.f2630d > 0) {
            byte m2342a = c0549a.m2342a();
            if (m2342a != 0) {
                if (m2342a == 1 || m2342a == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (m2342a != 9) {
                    switch (m2342a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i == 0) {
                return -1;
            } else {
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static C0550b m2339c() {
        boolean z = AbstractC0559k.m2333a(Locale.getDefault()) == 1;
        AbstractC0556h abstractC0556h = f2632a;
        if (abstractC0556h == f2632a) {
            return z ? f2636e : f2635d;
        }
        return new C0550b(z, 2, abstractC0556h);
    }

    /* renamed from: d */
    public CharSequence m2338d(CharSequence charSequence, AbstractC0556h abstractC0556h, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean m2335b = abstractC0556h.m2335b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f2638g & 2) != 0) && z) {
            boolean m2335b2 = (m2335b ? AbstractC0558j.f2650b : AbstractC0558j.f2649a).m2335b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f2637f || !(m2335b2 || m2341a(charSequence) == 1)) ? (!this.f2637f || (m2335b2 && m2341a(charSequence) != -1)) ? "" : f2634c : f2633b));
        }
        if (m2335b != this.f2637f) {
            spannableStringBuilder.append(m2335b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean m2335b3 = (m2335b ? AbstractC0558j.f2650b : AbstractC0558j.f2649a).m2335b(charSequence, 0, charSequence.length());
            if (!this.f2637f && (m2335b3 || m2340b(charSequence) == 1)) {
                str = f2633b;
            } else if (this.f2637f && (!m2335b3 || m2340b(charSequence) == -1)) {
                str = f2634c;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}