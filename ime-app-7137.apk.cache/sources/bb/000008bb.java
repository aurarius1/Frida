package com.anysoftkeyboard.ime;

import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.menny.android.anysoftkeyboard.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p010b.p046j.p058l.p060e1.AbstractC0589a;
import p010b.p046j.p058l.p060e1.C0595g;
import p093c.p097b.p104e0.C1212g;
import p093c.p097b.p104e0.EnumC1208c;
import p093c.p097b.p128x.C1627s2;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardMediaInsertion extends AnySoftKeyboardHardware {

    /* renamed from: k1 */
    public final Set f6348k1;

    /* renamed from: l1 */
    public final Set f6349l1;

    /* renamed from: m1 */
    public C1627s2 f6350m1;

    /* renamed from: n1 */
    public C1212g f6351n1;

    /* renamed from: o1 */
    public int f6352o1;

    /* renamed from: p1 */
    public C0595g f6353p1;

    public AnySoftKeyboardMediaInsertion() {
        HashSet hashSet = new HashSet();
        this.f6348k1 = hashSet;
        this.f6349l1 = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: r0 */
    public static void m476r0(AnySoftKeyboardMediaInsertion anySoftKeyboardMediaInsertion, int i, C0595g c0595g) {
        boolean z;
        char c;
        boolean z2;
        InputConnection currentInputConnection = anySoftKeyboardMediaInsertion.getCurrentInputConnection();
        EditorInfo currentInputEditorInfo = anySoftKeyboardMediaInsertion.getCurrentInputEditorInfo();
        if (c0595g != null) {
            c0595g.m2290a();
            if (i == m475s0(currentInputEditorInfo) && currentInputConnection != null) {
                int i2 = Build.VERSION.SDK_INT >= 25 ? 1 : 0;
                anySoftKeyboardMediaInsertion.grantUriPermission(currentInputEditorInfo.packageName, c0595g.m2290a(), 1);
                ClipDescription m2289b = c0595g.m2289b();
                String[] m2298a = AbstractC0589a.m2298a(currentInputEditorInfo);
                int length = m2298a.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    } else if (m2289b.hasMimeType(m2298a[i3])) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 25) {
                        currentInputConnection.commitContent((InputContentInfo) c0595g.f2716a.mo2292d(), i2, null);
                    } else {
                        if (i4 >= 25) {
                            c = 1;
                        } else {
                            Bundle bundle = currentInputEditorInfo.extras;
                            if (bundle != null) {
                                boolean containsKey = bundle.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                boolean containsKey2 = currentInputEditorInfo.extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                if (containsKey && containsKey2) {
                                    c = 4;
                                } else if (containsKey) {
                                    c = 3;
                                } else if (containsKey2) {
                                    c = 2;
                                }
                            }
                            c = 0;
                        }
                        if (c != 2) {
                            z2 = (c == 3 || c == 4) ? false : true;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", c0595g.m2290a());
                        bundle2.putParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", c0595g.m2289b());
                        bundle2.putParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", c0595g.f2716a.mo2294b());
                        bundle2.putInt(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i2);
                        bundle2.putParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", null);
                        currentInputConnection.performPrivateCommand(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT" : "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle2);
                    }
                }
            } else if (anySoftKeyboardMediaInsertion.f6353p1 == null) {
                anySoftKeyboardMediaInsertion.f6352o1 = i;
                anySoftKeyboardMediaInsertion.f6353p1 = c0595g;
                anySoftKeyboardMediaInsertion.m483F(R.string.media_insertion_pending_message, false);
                return;
            }
        }
        anySoftKeyboardMediaInsertion.f6352o1 = 0;
        anySoftKeyboardMediaInsertion.f6353p1 = null;
    }

    /* renamed from: s0 */
    public static int m475s0(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return 0;
        }
        return Arrays.hashCode(new int[]{editorInfo.fieldId, editorInfo.packageName.hashCode()});
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6351n1 = new C1212g(this);
        this.f6350m1 = new C1627s2(this, null);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C1212g c1212g = this.f6351n1;
        c1212g.f4385d.mo35e();
        c1212g.f4382a.unregisterReceiver(c1212g.f4383b);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardInlineSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        super.onFinishInputView(z);
        this.f6348k1.clear();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        String[] m2298a;
        super.onStartInputView(editorInfo, z);
        this.f6348k1.clear();
        for (String str : AbstractC0589a.m2298a(editorInfo)) {
            if (ClipDescription.compareMimeTypes(str, "image/*")) {
                this.f6348k1.add(EnumC1208c.Image);
            }
            if (ClipDescription.compareMimeTypes(str, "image/gif")) {
                this.f6348k1.add(EnumC1208c.Gif);
            }
        }
        if (this.f6353p1 == null || this.f6352o1 != m475s0(editorInfo)) {
            return;
        }
        m476r0(this.f6350m1.f5059a, this.f6352o1, this.f6353p1);
    }
}