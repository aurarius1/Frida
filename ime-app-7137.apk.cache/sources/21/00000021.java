package p000a.p001a.p002a.p004b.p005x;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.p007v4.media.session.MediaSessionCompat$Token;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000a.p001a.p002a.p004b.p005x.AbstractBinderC0027b;
import p000a.p001a.p002a.p004b.p005x.AbstractC0030e;
import p000a.p001a.p002a.p004b.p005x.BinderC0032g;
import p000a.p001a.p002a.p004b.p005x.C0033h;
import p010b.p046j.p047d.AbstractC0478k;

/* renamed from: a.a.a.b.x.h */
/* loaded from: classes.dex */
public class C0033h implements InterfaceC0031f {

    /* renamed from: a */
    public final Object f66a;

    /* renamed from: b */
    public final Object f67b = new Object();

    /* renamed from: c */
    public final List f68c = new ArrayList();

    /* renamed from: d */
    public HashMap f69d = new HashMap();

    /* renamed from: e */
    public final MediaSessionCompat$Token f70e;

    public C0033h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f70e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f94b);
        this.f66a = mediaController;
        if (mediaSessionCompat$Token.f95c == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver

                /* renamed from: b */
                public WeakReference f90b;

                {
                    super(null);
                    this.f90b = new WeakReference(this);
                }

                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i, Bundle bundle) {
                    C0033h c0033h = (C0033h) this.f90b.get();
                    if (c0033h == null || bundle == null) {
                        return;
                    }
                    synchronized (c0033h.f67b) {
                        c0033h.f70e.f95c = AbstractBinderC0027b.m3458c(AbstractC0478k.m2425a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        MediaSessionCompat$Token mediaSessionCompat$Token2 = c0033h.f70e;
                        bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                        mediaSessionCompat$Token2.getClass();
                        if (c0033h.f70e.f95c != null) {
                            Iterator it = c0033h.f68c.iterator();
                            if (it.hasNext()) {
                                BinderC0032g binderC0032g = new BinderC0032g();
                                c0033h.f69d.put((AbstractC0030e) it.next(), binderC0032g);
                                throw null;
                            }
                            c0033h.f68c.clear();
                        }
                    }
                }
            });
        }
    }

    @Override // p000a.p001a.p002a.p004b.p005x.InterfaceC0031f
    /* renamed from: a */
    public boolean mo3457a(KeyEvent keyEvent) {
        return ((MediaController) this.f66a).dispatchMediaButtonEvent(keyEvent);
    }
}