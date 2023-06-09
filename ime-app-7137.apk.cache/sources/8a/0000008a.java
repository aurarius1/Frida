package androidx.media;

import android.util.SparseIntArray;
import java.util.Arrays;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f563a = 0;

    /* renamed from: b */
    public int f564b = 0;

    /* renamed from: c */
    public int f565c = 0;

    /* renamed from: d */
    public int f566d = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            if (this.f564b == audioAttributesImplBase.f564b) {
                int i = this.f565c;
                int i2 = audioAttributesImplBase.f565c;
                int i3 = audioAttributesImplBase.f566d;
                int i4 = 4;
                if (i3 == -1) {
                    int i5 = audioAttributesImplBase.f563a;
                    SparseIntArray sparseIntArray = AudioAttributesCompat.f559a;
                    if ((i2 & 1) != 1) {
                        if ((i2 & 4) != 4) {
                            switch (i5) {
                                case 2:
                                    i4 = 0;
                                    break;
                                case 3:
                                    i4 = 8;
                                    break;
                                case 4:
                                    break;
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                    i4 = 5;
                                    break;
                                case 6:
                                    i4 = 2;
                                    break;
                                case 11:
                                    i4 = 10;
                                    break;
                                case 12:
                                default:
                                    i4 = 3;
                                    break;
                                case 13:
                                    i4 = 1;
                                    break;
                            }
                        } else {
                            i4 = 6;
                        }
                    } else {
                        i4 = 7;
                    }
                } else {
                    i4 = i3;
                }
                if (i4 == 6) {
                    i2 |= 4;
                } else if (i4 == 7) {
                    i2 |= 1;
                }
                return i == (i2 & 273) && this.f563a == audioAttributesImplBase.f563a && this.f566d == i3;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f564b), Integer.valueOf(this.f565c), Integer.valueOf(this.f563a), Integer.valueOf(this.f566d)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f566d != -1) {
            sb.append(" stream=");
            sb.append(this.f566d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f563a;
        SparseIntArray sparseIntArray = AudioAttributesCompat.f559a;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = AbstractC1124a.m1193c("unknown usage ", i);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f564b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f565c).toUpperCase());
        return sb.toString();
    }
}