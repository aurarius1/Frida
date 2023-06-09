package com.google.android.voiceime;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p093c.p145g.p146a.p175b.BinderC2058l;
import p093c.p145g.p146a.p175b.C2054h;

/* loaded from: classes.dex */
public class ServiceHelper extends Service {

    /* renamed from: b */
    public final IBinder f6977b = new BinderC2058l(this);

    /* renamed from: c */
    public C2054h f6978c;

    /* renamed from: a */
    public void m202a(C2054h c2054h) {
        this.f6978c = c2054h;
        Intent intent = new Intent(this, ActivityHelper.class);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6977b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}