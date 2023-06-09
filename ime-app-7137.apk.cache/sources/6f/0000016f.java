package p010b.p016c.p026q;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.AbstractC0462b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0571c;
import p010b.p046j.p058l.C0574d;
import p010b.p046j.p058l.InterfaceC0624t;
import p010b.p046j.p058l.InterfaceC0630w;
import p010b.p046j.p058l.p060e1.AbstractC0589a;
import p010b.p046j.p058l.p060e1.C0590b;
import p010b.p046j.p058l.p060e1.C0591c;
import p010b.p046j.p061m.C0646i;

/* renamed from: b.c.q.e0 */
/* loaded from: classes.dex */
public class C0235e0 extends EditText implements InterfaceC0630w, InterfaceC0624t {

    /* renamed from: b */
    public final C0333x f1519b;

    /* renamed from: c */
    public final C0236e1 f1520c;

    /* renamed from: d */
    public final C0218b1 f1521d;

    /* renamed from: e */
    public final C0646i f1522e;

    public C0235e0(Context context, AttributeSet attributeSet, int i) {
        super(C0287n3.m2787a(context), attributeSet, i);
        AbstractC0282m3.m2793a(this, getContext());
        C0333x c0333x = new C0333x(this);
        this.f1519b = c0333x;
        c0333x.m2725d(attributeSet, i);
        C0236e1 c0236e1 = new C0236e1(this);
        this.f1520c = c0236e1;
        c0236e1.m2849e(attributeSet, i);
        c0236e1.m2852b();
        this.f1521d = new C0218b1(this);
        this.f1522e = new C0646i();
    }

    @Override // p010b.p046j.p058l.InterfaceC0624t
    /* renamed from: a */
    public C0574d mo2184a(C0574d c0574d) {
        return this.f1522e.m2162b(this, c0574d);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1519b;
        if (c0333x != null) {
            c0333x.m2728a();
        }
        C0236e1 c0236e1 = this.f1520c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1519b;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1519b;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0218b1 c0218b1;
        return (Build.VERSION.SDK_INT >= 28 || (c0218b1 = this.f1521d) == null) ? super.getTextClassifier() : c0218b1.m2872a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection c0591c;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1520c.m2847g(this, onCreateInputConnection, editorInfo);
        AbstractC0022t.m3513U(onCreateInputConnection, editorInfo, this);
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        String[] strArr = (String[]) getTag(AbstractC0462b.tag_on_receive_content_mime_types);
        if (onCreateInputConnection == null || strArr == null) {
            return onCreateInputConnection;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            editorInfo.contentMimeTypes = strArr;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        }
        C0284n0 c0284n0 = new C0284n0(this);
        if (editorInfo != null) {
            if (i >= 25) {
                c0591c = new C0590b(onCreateInputConnection, false, c0284n0);
            } else if (AbstractC0589a.m2298a(editorInfo).length == 0) {
                return onCreateInputConnection;
            } else {
                c0591c = new C0591c(onCreateInputConnection, false, c0284n0);
            }
            return c0591c;
        }
        throw new IllegalArgumentException("editorInfo must be non-null");
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (((String[]) getTag(AbstractC0462b.tag_on_receive_content_mime_types)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity == null) {
                    String str = "Can't handle drop: no activity: view=" + this;
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) getText(), offsetForPosition);
                        AbstractC0605j0.m2278E(this, new C0574d(new C0571c(dragEvent.getClipData(), 3)));
                        endBatchEdit();
                        z = true;
                    } catch (Throwable th) {
                        endBatchEdit();
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322 || i == 16908337) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (((String[]) getTag(AbstractC0462b.tag_on_receive_content_mime_types)) != null) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    C0571c c0571c = new C0571c(primaryClip, 1);
                    c0571c.f2668c = i != 16908322 ? 1 : 0;
                    AbstractC0605j0.m2278E(this, new C0574d(c0571c));
                }
                r0 = 1;
            }
        }
        if (r0 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1519b;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1519b;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0022t.m3464v0(this, callback));
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1519b;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1519b;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0236e1 c0236e1 = this.f1520c;
        if (c0236e1 != null) {
            c0236e1.m2848f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0218b1 c0218b1;
        if (Build.VERSION.SDK_INT < 28 && (c0218b1 = this.f1521d) != null) {
            c0218b1.f1482b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}