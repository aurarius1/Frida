package p093c.p097b.p104e0;

import android.content.BroadcastReceiver;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p010b.p046j.p058l.p060e1.C0595g;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p128x.C1627s2;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p195e.p197b.C2225a;
import p183e.p184a.p190p.p195e.p197b.C2227c;
import p183e.p184a.p190p.p195e.p197b.C2229e;
import p183e.p184a.p190p.p195e.p197b.C2233i;

/* renamed from: c.b.e0.f */
/* loaded from: classes.dex */
public class C1211f extends BroadcastReceiver {

    /* renamed from: a */
    public final C1212g f4381a;

    public C1211f(C1212g c1212g) {
        this.f4381a = c1212g;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        final C1212g c1212g = this.f4381a;
        final int intExtra = intent.getIntExtra("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_REQUEST_ID_KEY", 0);
        Uri uri = (Uri) intent.getParcelableExtra("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_MEDIA_URI_KEY");
        final String[] stringArrayExtra = intent.getStringArrayExtra("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_MEDIA_MIMES_KEY");
        c1212g.f4385d.mo35e();
        Integer num = c1212g.f4386e;
        if (num == null) {
            return;
        }
        if (num.intValue() == intExtra) {
            if (uri == null) {
                C1627s2 c1627s2 = c1212g.f4387f;
                c1212g.f4386e.intValue();
                AnySoftKeyboardMediaInsertion.m476r0(c1627s2.f5059a, 0, null);
            } else {
                InterfaceC1210e interfaceC1210e = c1212g.f4384c;
                final Context context2 = c1212g.f4382a;
                ((C1207b) interfaceC1210e).getClass();
                C2225a c2225a = new C2225a(uri);
                AbstractC2101i abstractC2101i = AbstractC1216c.f4391a;
                if (abstractC2101i != null) {
                    C2233i c2233i = new C2233i(c2225a, abstractC2101i);
                    AbstractC2101i abstractC2101i2 = AbstractC1216c.f4392b;
                    if (abstractC2101i2 != null) {
                        c1212g.f4385d = new C2227c(new C2229e(c2233i, abstractC2101i2), new InterfaceC2127i() { // from class: c.b.v.a
                            @Override // p183e.p184a.p189o.InterfaceC2127i
                            /* renamed from: a */
                            public final Object mo24a(Object obj) {
                                Context context3 = context2;
                                Uri uri2 = (Uri) obj;
                                InputStream openInputStream = context3.getContentResolver().openInputStream(uri2);
                                try {
                                    File file = new File(context3.getFilesDir(), "media");
                                    if (!file.isDirectory() && !file.mkdirs()) {
                                        if (openInputStream != null) {
                                            openInputStream.close();
                                        }
                                        return uri2;
                                    }
                                    File file2 = new File(file, uri2.getLastPathSegment());
                                    byte[] bArr = new byte[4096];
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                                    while (true) {
                                        int read = openInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        bufferedOutputStream.write(bArr, 0, read);
                                    }
                                    bufferedOutputStream.close();
                                    file2.length();
                                    uri2 = FileProvider.m3337b(context3, context3.getPackageName(), file2);
                                    openInputStream.close();
                                    return uri2;
                                } catch (Throwable th) {
                                    if (openInputStream != null) {
                                        try {
                                            openInputStream.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }).m134c(new InterfaceC2123e() { // from class: c.b.e0.a
                            @Override // p183e.p184a.p189o.InterfaceC2123e
                            public final void accept(Object obj) {
                                C1212g c1212g2 = C1212g.this;
                                int i = intExtra;
                                String[] strArr = stringArrayExtra;
                                C1627s2 c1627s22 = c1212g2.f4387f;
                                AnySoftKeyboardMediaInsertion.m476r0(c1627s22.f5059a, i, new C0595g((Uri) obj, new ClipDescription("media", strArr), null));
                            }
                        }, new C1215b("mCurrentCallback.onMediaRequestDone"));
                    } else {
                        throw new NullPointerException("scheduler is null");
                    }
                } else {
                    throw new NullPointerException("scheduler is null");
                }
            }
        }
        c1212g.f4386e = null;
    }
}