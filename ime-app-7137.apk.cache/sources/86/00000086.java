package androidx.media;

import p010b.p090y.AbstractC1107b;
import p010b.p090y.InterfaceC1109d;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1107b abstractC1107b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC1109d interfaceC1109d = audioAttributesCompat.f560b;
        if (abstractC1107b.mo1221h(1)) {
            interfaceC1109d = abstractC1107b.m1227k();
        }
        audioAttributesCompat.f560b = (AudioAttributesImpl) interfaceC1109d;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1107b abstractC1107b) {
        abstractC1107b.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f560b;
        abstractC1107b.mo1220l(1);
        abstractC1107b.m1224o(audioAttributesImpl);
    }
}