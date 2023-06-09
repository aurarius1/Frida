package com.anysoftkeyboard.ime;

import android.os.Bundle;
import android.util.Size;
import android.util.TypedValue;
import android.view.inputmethod.InlineSuggestion;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.view.inputmethod.InlineSuggestionsResponse;
import android.widget.LinearLayout;
import android.widget.inline.InlineContentView;
import android.widget.inline.InlinePresentationSpec;
import com.anysoftkeyboard.ime.AnySoftKeyboardInlineSuggestions;
import com.anysoftkeyboard.keyboards.views.KeyboardViewContainerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import p010b.p031e.p032a.AbstractC0360a;
import p010b.p031e.p032a.p033b.C0361a;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardInlineSuggestions extends AnySoftKeyboardSuggestions {

    /* renamed from: g0 */
    public static final /* synthetic */ int f6336g0 = 0;

    @Override // android.inputmethodservice.InputMethodService
    public InlineSuggestionsRequest onCreateInlineSuggestionsRequest(Bundle bundle) {
        Size size = new Size(0, 0);
        Size size2 = new Size(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Set set = AbstractC0360a.f1859a;
        ArrayList<C0361a> arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("style_v1", true);
        C0361a c0361a = new C0361a(bundle2);
        if (AbstractC0360a.f1859a.contains("androidx.autofill.inline.ui.version:v1")) {
            arrayList.add(c0361a);
            if (!arrayList.isEmpty()) {
                Bundle bundle3 = new Bundle();
                ArrayList<String> arrayList2 = new ArrayList<>();
                for (C0361a c0361a2 : arrayList) {
                    c0361a2.getClass();
                    arrayList2.add("androidx.autofill.inline.ui.version:v1");
                    bundle3.putBundle("androidx.autofill.inline.ui.version:v1", c0361a2.f1860a);
                }
                bundle3.putStringArrayList("androidx.autofill.inline.ui.version:key", arrayList2);
                InlinePresentationSpec build = new InlinePresentationSpec.Builder(size, size2).setStyle(bundle3).build();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(build);
                return new InlineSuggestionsRequest.Builder(arrayList3).setMaxSuggestionCount(Integer.MAX_VALUE).build();
            }
            throw new IllegalStateException("Please put at least one style in the builder");
        }
        throw new IllegalArgumentException(AbstractC1124a.m1190f("Unsupported style version: ", "androidx.autofill.inline.ui.version:v1"));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        super.onFinishInputView(z);
        KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        if (keyboardViewContainerView != null) {
            keyboardViewContainerView.getInlineAutofillView().removeAllViews();
            keyboardViewContainerView.getInlineScrollView().setVisibility(8);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public boolean onInlineSuggestionsResponse(InlineSuggestionsResponse inlineSuggestionsResponse) {
        List<InlineSuggestion> inlineSuggestions = inlineSuggestionsResponse.getInlineSuggestions();
        final KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        if (keyboardViewContainerView != null) {
            final LinearLayout inlineAutofillView = keyboardViewContainerView.getInlineAutofillView();
            Size size = new Size(-2, (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
            inlineAutofillView.removeAllViews();
            for (InlineSuggestion inlineSuggestion : inlineSuggestions) {
                try {
                    inlineSuggestion.inflate(this, size, getMainExecutor(), new Consumer() { // from class: c.b.x.m
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            KeyboardViewContainerView keyboardViewContainerView2 = KeyboardViewContainerView.this;
                            int i = AnySoftKeyboardInlineSuggestions.f6336g0;
                            keyboardViewContainerView2.getInlineScrollView().setVisibility(0);
                            inlineAutofillView.addView((InlineContentView) obj);
                        }
                    });
                } catch (Exception e) {
                    e.toString();
                }
            }
        }
        return true;
    }
}