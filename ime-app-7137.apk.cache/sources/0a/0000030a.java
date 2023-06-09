package p010b.p046j.p061m;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p010b.p046j.p058l.C0574d;

/* renamed from: b.j.m.i */
/* loaded from: classes.dex */
public final class C0646i {
    /* renamed from: a */
    public static CharSequence m2163a(Context context, ClipData.Item item, int i) {
        if (Build.VERSION.SDK_INT < 16) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        } else if ((i & 1) != 0) {
            CharSequence coerceToText2 = item.coerceToText(context);
            return coerceToText2 instanceof Spanned ? coerceToText2.toString() : coerceToText2;
        } else {
            return item.coerceToStyledText(context);
        }
    }

    /* renamed from: c */
    public static void m2161c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* renamed from: b */
    public C0574d m2162b(View view, C0574d c0574d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            String str = "onReceive: " + c0574d;
        }
        int i = c0574d.f2678b;
        if (i == 2) {
            return c0574d;
        }
        int i2 = 0;
        if (i == 3) {
            TextView textView = (TextView) view;
            ClipData clipData = c0574d.f2677a;
            Context context = textView.getContext();
            int i3 = c0574d.f2679c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            while (i2 < clipData.getItemCount()) {
                CharSequence m2163a = m2163a(context, clipData.getItemAt(i2), i3);
                if (m2163a != null) {
                    spannableStringBuilder.append(m2163a);
                }
                i2++;
            }
            m2161c((Editable) textView.getText(), spannableStringBuilder);
            return null;
        }
        ClipData clipData2 = c0574d.f2677a;
        int i4 = c0574d.f2679c;
        TextView textView2 = (TextView) view;
        Editable editable = (Editable) textView2.getText();
        Context context2 = textView2.getContext();
        boolean z = false;
        while (i2 < clipData2.getItemCount()) {
            CharSequence m2163a2 = m2163a(context2, clipData2.getItemAt(i2), i4);
            if (m2163a2 != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m2163a2);
                } else {
                    m2161c(editable, m2163a2);
                    z = true;
                }
            }
            i2++;
        }
        return null;
    }
}