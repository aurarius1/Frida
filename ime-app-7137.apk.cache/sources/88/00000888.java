package p093c.p145g.p146a.p175b;

import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;

/* renamed from: c.g.a.b.f */
/* loaded from: classes.dex */
public class RunnableC2052f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C2053g f6229b;

    public RunnableC2052f(C2053g c2053g) {
        this.f6229b = c2053g;
    }

    @Override // java.lang.Runnable
    public void run() {
        InputConnection currentInputConnection;
        C2053g c2053g = this.f6229b;
        String str = c2053g.f6232c;
        if (str == null || (currentInputConnection = c2053g.f6230a.getCurrentInputConnection()) == null || !currentInputConnection.beginBatchEdit()) {
            return;
        }
        try {
            ExtractedTextRequest extractedTextRequest = new ExtractedTextRequest();
            extractedTextRequest.flags = 1;
            ExtractedText extractedText = currentInputConnection.getExtractedText(extractedTextRequest, 0);
            if (extractedText != null) {
                if (extractedText.text != null) {
                    int i = extractedText.selectionStart;
                    int i2 = extractedText.selectionEnd;
                    if (i != i2) {
                        currentInputConnection.deleteSurroundingText(i, i2);
                    }
                    str = c2053g.m518c(extractedText, str);
                }
                if (currentInputConnection.commitText(str, 0)) {
                    c2053g.f6232c = null;
                }
            }
        } finally {
            currentInputConnection.endBatchEdit();
        }
    }
}