package p010b.p016c.p026q;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: b.c.q.b1 */
/* loaded from: classes.dex */
public final class C0218b1 {

    /* renamed from: a */
    public TextView f1481a;

    /* renamed from: b */
    public TextClassifier f1482b;

    public C0218b1(TextView textView) {
        this.f1481a = textView;
    }

    /* renamed from: a */
    public TextClassifier m2872a() {
        TextClassifier textClassifier = this.f1482b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1481a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}