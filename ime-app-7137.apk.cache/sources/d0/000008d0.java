package com.anysoftkeyboard.remote;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import java.util.Random;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p093c.p097b.p104e0.AbstractC1209d;

/* loaded from: classes.dex */
public class RemoteInsertionActivity extends AbstractActivityC0681d0 {

    /* renamed from: n */
    public int f6583n;

    /* renamed from: o */
    public int f6584o;

    /* renamed from: p */
    public String[] f6585p;

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Intent intent2 = new Intent("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_AVAILABLE_ACTION");
        intent2.putExtra("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_REQUEST_ID_KEY", this.f6584o);
        intent2.putExtra("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_MEDIA_MIMES_KEY", this.f6585p);
        if (i == this.f6583n && i2 == -1) {
            intent2.putExtra("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_MEDIA_URI_KEY", intent.getData());
        }
        sendBroadcast(intent2);
        finish();
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6584o = bundle.getInt("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_REQUEST_ID_KEY");
            this.f6585p = bundle.getStringArray("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_MIMES_KEY");
            this.f6583n = bundle.getInt("EXTERNAL_REQUEST_ID_EXTRA_KEY");
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f6584o = extras.getInt("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_REQUEST_ID_KEY");
            this.f6585p = extras.getStringArray("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_MIMES_KEY");
            this.f6583n = new Random().nextInt(10240) + 1024;
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(MediaStore.Images.Media.INTERNAL_CONTENT_URI, "image/*");
            intent.addFlags(1);
            startActivityForResult(Intent.createChooser(intent, getText(AbstractC1209d.media_pick_chooser_title)), this.f6583n);
            return;
        }
        throw new IllegalArgumentException("RemoteInsertionActivity was started without any extras!");
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("EXTERNAL_REQUEST_ID_EXTRA_KEY", this.f6583n);
        bundle.putInt("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_REQUEST_ID_KEY", this.f6584o);
        bundle.putStringArray("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_MIMES_KEY", this.f6585p);
    }
}