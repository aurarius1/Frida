package androidx.media;

import android.util.SparseIntArray;
import p010b.p090y.InterfaceC1109d;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC1109d {

    /* renamed from: a */
    public static final SparseIntArray f559a;

    /* renamed from: b */
    public AudioAttributesImpl f560b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f559a = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesImpl audioAttributesImpl = this.f560b;
            AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f560b;
            return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
        }
        return false;
    }

    public int hashCode() {
        return this.f560b.hashCode();
    }

    public String toString() {
        return this.f560b.toString();
    }
}