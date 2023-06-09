package androidx.media;

import android.media.AudioAttributes;
import p010b.p090y.AbstractC1107b;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1107b abstractC1107b) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f561a = (AudioAttributes) abstractC1107b.m1228j(audioAttributesImplApi21.f561a, 1);
        audioAttributesImplApi21.f562b = abstractC1107b.m1229i(audioAttributesImplApi21.f562b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1107b abstractC1107b) {
        abstractC1107b.getClass();
        abstractC1107b.m1225n(audioAttributesImplApi21.f561a, 1);
        abstractC1107b.m1226m(audioAttributesImplApi21.f562b, 2);
    }
}