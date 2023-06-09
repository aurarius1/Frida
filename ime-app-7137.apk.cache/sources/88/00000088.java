package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import p093c.p094a.p095a.p096a.AbstractC1124a;

@TargetApi(21)
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f561a;

    /* renamed from: b */
    public int f562b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f561a.equals(((AudioAttributesImplApi21) obj).f561a);
        }
        return false;
    }

    public int hashCode() {
        return this.f561a.hashCode();
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("AudioAttributesCompat: audioattributes=");
        m1187i.append(this.f561a);
        return m1187i.toString();
    }
}