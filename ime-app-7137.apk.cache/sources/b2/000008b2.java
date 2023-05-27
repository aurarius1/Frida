package com.anysoftkeyboard.ime;

import android.inputmethodservice.InputMethodService;
import android.os.Debug;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.anysoftkeyboard.keyboards.views.KeyboardViewContainerView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.List;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p108i0.p109o.AbstractC1260g;
import p093c.p097b.p115j0.C1415a;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.p132r0.InterfaceC1748t0;
import p183e.p184a.p187m.C2111b;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardBase extends InputMethodService implements InterfaceC1748t0 {

    /* renamed from: b */
    public static final ExtractedTextRequest f6306b = new ExtractedTextRequest();

    /* renamed from: c */
    public KeyboardViewContainerView f6307c;

    /* renamed from: d */
    public InterfaceC1566d3 f6308d;

    /* renamed from: e */
    public InputMethodManager f6309e;

    /* renamed from: f */
    public int f6310f = 0;

    /* renamed from: g */
    public int f6311g = 0;

    /* renamed from: h */
    public final C1415a f6312h = new C1415a(true);

    /* renamed from: i */
    public final C1415a f6313i = new C1415a(false);

    /* renamed from: j */
    public final C2111b f6314j = new C2111b();

    /* renamed from: A */
    public abstract boolean mo468A();

    /* renamed from: B */
    public void mo434B() {
        hideWindow();
    }

    /* renamed from: C */
    public final void m495C() {
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 != null) {
            interfaceC1566d3.setWatermark(mo426v());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: android.widget.LinearLayout$LayoutParams */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public final void m494D() {
        FrameLayout.LayoutParams layoutParams;
        Window window = getWindow().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null && attributes.height != -1) {
            attributes.height = -1;
            window.setAttributes(attributes);
        }
        if (this.f6307c != null) {
            View findViewById = window.findViewById(16908318);
            View view = (View) findViewById.getParent();
            int i = isFullscreenMode() ? -1 : -2;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != i) {
                layoutParams2.height = i;
                view.setLayoutParams(layoutParams2);
            }
            View view2 = (View) findViewById.getParent();
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                if (layoutParams4.gravity == 80) {
                    return;
                }
                layoutParams4.gravity = 80;
                layoutParams = layoutParams4;
            } else if (!(layoutParams3 instanceof FrameLayout.LayoutParams)) {
                StringBuilder m1187i = AbstractC1124a.m1187i("Layout parameter doesn't have gravity: ");
                m1187i.append(layoutParams3.getClass().getName());
                throw new IllegalArgumentException(m1187i.toString());
            } else {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams3;
                if (layoutParams5.gravity == 80) {
                    return;
                }
                layoutParams5.gravity = 80;
                layoutParams = layoutParams5;
            }
            view2.setLayoutParams(layoutParams);
        }
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: a */
    public void mo493a() {
    }

    @Override // android.inputmethodservice.InputMethodService
    public void hideWindow() {
        do {
        } while (mo419z());
        super.hideWindow();
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onComputeInsets(InputMethodService.Insets insets) {
        super.onComputeInsets(insets);
        if (isFullscreenMode()) {
            return;
        }
        insets.contentTopInsets = insets.visibleTopInsets;
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (AbstractC1260g.m1138d(getApplicationContext())) {
            try {
                Debug.startMethodTracing(AbstractC1260g.m1139c().getAbsolutePath());
                AbstractC1260g.f4452b = true;
                Toast.makeText(getApplicationContext(), (int) R.string.debug_tracing_starting, 0).show();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), (int) R.string.debug_tracing_starting_failed, 1).show();
            }
        }
        this.f6309e = (InputMethodManager) getSystemService("input_method");
    }

    @Override // android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 != null) {
            interfaceC1566d3.mo411b();
        }
        this.f6308d = null;
        int i = 5;
        while (true) {
            try {
                KeyboardViewContainerView keyboardViewContainerView = (KeyboardViewContainerView) getLayoutInflater().inflate(R.layout.main_keyboard_layout, (ViewGroup) null);
                this.f6307c = keyboardViewContainerView;
                keyboardViewContainerView.setBackgroundResource(R.drawable.ask_wallpaper);
                this.f6308d = this.f6307c.getStandardKeyboardView();
                this.f6307c.setOnKeyboardActionListener(this);
                m495C();
                return this.f6307c;
            } catch (OutOfMemoryError e) {
                if (i == 0) {
                    throw e;
                }
                i--;
                System.gc();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        this.f6314j.mo35e();
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 != null) {
            interfaceC1566d3.mo411b();
        }
        this.f6308d = null;
        super.onDestroy();
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onFinishInput() {
        super.onFinishInput();
        this.f6314j.m132d();
        this.f6310f = 0;
        this.f6311g = 0;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f6310f = i4;
        this.f6311g = i3;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void setInputView(View view) {
        super.setInputView(view);
        m494D();
    }

    /* renamed from: u */
    public abstract void mo492u(int i);

    @Override // android.inputmethodservice.InputMethodService
    public void updateFullscreenMode() {
        super.updateFullscreenMode();
        m494D();
    }

    /* renamed from: v */
    public List mo426v() {
        ((AnyApplication) getApplication()).getClass();
        return new ArrayList();
    }

    /* renamed from: w */
    public int m491w() {
        if (mo468A()) {
            ExtractedText m490x = m490x();
            if (m490x == null) {
                return 0;
            }
            int i = m490x.startOffset;
            this.f6310f = m490x.selectionEnd + i;
            this.f6311g = i + m490x.selectionStart;
        }
        return this.f6310f;
    }

    /* renamed from: x */
    public ExtractedText m490x() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection == null) {
            return null;
        }
        return currentInputConnection.getExtractedText(f6306b, 0);
    }

    /* renamed from: y */
    public abstract String mo179y();

    /* renamed from: z */
    public boolean mo419z() {
        return false;
    }
}