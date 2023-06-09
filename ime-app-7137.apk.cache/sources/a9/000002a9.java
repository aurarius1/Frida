package p010b.p046j.p056j;

/* renamed from: b.j.j.a */
/* loaded from: classes.dex */
public class C0549a {

    /* renamed from: a */
    public static final byte[] f2627a = new byte[1792];

    /* renamed from: b */
    public final CharSequence f2628b;

    /* renamed from: c */
    public final int f2629c;

    /* renamed from: d */
    public int f2630d;

    /* renamed from: e */
    public char f2631e;

    static {
        for (int i = 0; i < 1792; i++) {
            f2627a[i] = Character.getDirectionality(i);
        }
    }

    public C0549a(CharSequence charSequence, boolean z) {
        this.f2628b = charSequence;
        this.f2629c = charSequence.length();
    }

    /* renamed from: a */
    public byte m2342a() {
        char charAt = this.f2628b.charAt(this.f2630d - 1);
        this.f2631e = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.f2628b, this.f2630d);
            this.f2630d -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f2630d--;
        char c = this.f2631e;
        return c < 1792 ? f2627a[c] : Character.getDirectionality(c);
    }
}