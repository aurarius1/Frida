package androidx.media;

import p010b.p090y.AbstractC1107b;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1107b abstractC1107b) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f563a = abstractC1107b.m1229i(audioAttributesImplBase.f563a, 1);
        audioAttributesImplBase.f564b = abstractC1107b.m1229i(audioAttributesImplBase.f564b, 2);
        audioAttributesImplBase.f565c = abstractC1107b.m1229i(audioAttributesImplBase.f565c, 3);
        audioAttributesImplBase.f566d = abstractC1107b.m1229i(audioAttributesImplBase.f566d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1107b abstractC1107b) {
        abstractC1107b.getClass();
        abstractC1107b.m1226m(audioAttributesImplBase.f563a, 1);
        abstractC1107b.m1226m(audioAttributesImplBase.f564b, 2);
        abstractC1107b.m1226m(audioAttributesImplBase.f565c, 3);
        abstractC1107b.m1226m(audioAttributesImplBase.f566d, 4);
    }
}