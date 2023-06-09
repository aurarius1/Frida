package p093c.p097b.p102d0.p103k;

import com.menny.android.anysoftkeyboard.R;
import java.util.Random;
import p093c.p097b.p100c0.C1151a0;
import p093c.p137d.p138a.p139a.C1785g;
import p181d.p182a.EnumC2091b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.d0.k.d */
/* loaded from: classes.dex */
public class C1197d implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2112c f4343b;

    /* renamed from: c */
    public EnumC2091b f4344c = null;

    /* renamed from: d */
    public boolean f4345d = false;

    public C1197d(C1151a0 c1151a0) {
        this.f4343b = ((C1785g) c1151a0.m1170c(R.string.settings_key_default_emoji_skin_tone, R.string.settings_default_emoji_skin_tone)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.d0.k.b
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
                if (r10.equals("random") == false) goto L36;
             */
            @Override // p183e.p184a.p189o.InterfaceC2123e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void accept(Object obj) {
                EnumC2091b enumC2091b;
                C1197d c1197d = C1197d.this;
                String str = (String) obj;
                char c = 0;
                c1197d.f4345d = false;
                c1197d.f4344c = null;
                str.hashCode();
                int hashCode = str.hashCode();
                if (hashCode != -938285885) {
                    switch (hashCode) {
                        case -858803091:
                            if (str.equals("type_2")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -858803090:
                            if (str.equals("type_3")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -858803089:
                            if (str.equals("type_4")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -858803088:
                            if (str.equals("type_5")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -858803087:
                            if (str.equals("type_6")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                }
                if (c == 0) {
                    c1197d.f4345d = true;
                    return;
                }
                if (c == 1) {
                    enumC2091b = EnumC2091b.Fitzpatrick_2;
                } else if (c == 2) {
                    enumC2091b = EnumC2091b.Fitzpatrick_3;
                } else if (c == 3) {
                    enumC2091b = EnumC2091b.Fitzpatrick_4;
                } else if (c == 4) {
                    enumC2091b = EnumC2091b.Fitzpatrick_5;
                } else if (c != 5) {
                    return;
                } else {
                    enumC2091b = EnumC2091b.Fitzpatrick_6;
                }
                c1197d.f4344c = enumC2091b;
            }
        }, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
    }

    /* renamed from: a */
    public EnumC2091b m1148a() {
        if (this.f4345d) {
            Random random = new Random();
            EnumC2091b.values();
            int nextInt = random.nextInt(5);
            return nextInt != 0 ? nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? EnumC2091b.Fitzpatrick_6 : EnumC2091b.Fitzpatrick_5 : EnumC2091b.Fitzpatrick_4 : EnumC2091b.Fitzpatrick_3 : EnumC2091b.Fitzpatrick_2;
        }
        return this.f4344c;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f4343b.mo35e();
    }
}