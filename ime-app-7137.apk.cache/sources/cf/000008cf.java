package com.anysoftkeyboard.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.anysoftkeyboard.AnySoftKeyboard;
import com.menny.android.anysoftkeyboard.AnyApplication;

/* loaded from: classes.dex */
public class PackagesChangedReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final AnySoftKeyboard f6582a;

    public PackagesChangedReceiver(AnySoftKeyboard anySoftKeyboard) {
        this.f6582a = anySoftKeyboard;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getData() != null && context != null) {
            try {
                ((AnyApplication) this.f6582a.getApplicationContext()).m183s(intent, this.f6582a);
            } catch (Exception unused) {
            }
        }
    }
}