package p093c.p145g.p146a.p175b;

import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.inputmethod.ExtractedText;
import com.google.android.voiceime.ServiceHelper;
import java.util.HashSet;
import java.util.Set;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.g.a.b.g */
/* loaded from: classes.dex */
public class C2053g implements InterfaceC2059m {

    /* renamed from: a */
    public final InputMethodService f6230a;

    /* renamed from: b */
    public final C2057k f6231b = new C2057k(new C2051e(this));

    /* renamed from: c */
    public String f6232c;

    /* renamed from: d */
    public Set f6233d;

    /* renamed from: e */
    public final Handler f6234e;

    /* renamed from: f */
    public IBinder f6235f;

    public C2053g(InputMethodService inputMethodService) {
        this.f6230a = inputMethodService;
        HashSet hashSet = new HashSet();
        this.f6233d = hashSet;
        hashSet.add('.');
        this.f6233d.add('!');
        this.f6233d.add('?');
        this.f6233d.add('\n');
        this.f6234e = new Handler(Looper.getMainLooper());
    }

    @Override // p093c.p145g.p146a.p175b.InterfaceC2059m
    /* renamed from: a */
    public void mo517a(String str) {
        this.f6235f = this.f6230a.getWindow().getWindow().getAttributes().token;
        C2057k c2057k = this.f6231b;
        InputMethodService inputMethodService = this.f6230a;
        c2057k.getClass();
        ServiceConnectionC2055i serviceConnectionC2055i = new ServiceConnectionC2055i(str, null);
        serviceConnectionC2055i.f6240b = new C2054h(c2057k, inputMethodService, serviceConnectionC2055i);
        inputMethodService.bindService(new Intent(inputMethodService, ServiceHelper.class), serviceConnectionC2055i, 1);
    }

    @Override // p093c.p145g.p146a.p175b.InterfaceC2059m
    /* renamed from: b */
    public void mo516b() {
        if (this.f6232c != null) {
            this.f6234e.post(new RunnableC2052f(this));
        }
    }

    /* renamed from: c */
    public final String m518c(ExtractedText extractedText, String str) {
        int i = extractedText.selectionStart - 1;
        while (i > 0 && Character.isWhitespace(extractedText.text.charAt(i))) {
            i--;
        }
        if (i == -1 || this.f6233d.contains(Character.valueOf(extractedText.text.charAt(i)))) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        int i2 = extractedText.selectionStart;
        if (i2 - 1 > 0 && !Character.isWhitespace(extractedText.text.charAt(i2 - 1))) {
            str = AbstractC1124a.m1190f(" ", str);
        }
        return (extractedText.selectionEnd >= extractedText.text.length() || Character.isWhitespace(extractedText.text.charAt(extractedText.selectionEnd))) ? str : AbstractC1124a.m1190f(str, " ");
    }
}