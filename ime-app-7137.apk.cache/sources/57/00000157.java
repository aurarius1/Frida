package p010b.p016c.p026q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p018l.p019a.AbstractC0142b;

/* renamed from: b.c.q.a0 */
/* loaded from: classes.dex */
public class C0211a0 extends CheckedTextView {

    /* renamed from: b */
    public static final int[] f1445b = {16843016};

    /* renamed from: c */
    public final C0236e1 f1446c;

    public C0211a0(Context context, AttributeSet attributeSet) {
        super(C0287n3.m2787a(context), attributeSet, 16843720);
        AbstractC0282m3.m2793a(this, getContext());
        C0236e1 c0236e1 = new C0236e1(this);
        this.f1446c = c0236e1;
        c0236e1.m2849e(attributeSet, 16843720);
        c0236e1.m2852b();
        C0302q3 m2740r = C0302q3.m2740r(getContext(), attributeSet, f1445b, 16843720, 0);
        setCheckMarkDrawable(m2740r.m2751g(0));
        m2740r.f1740b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0236e1 c0236e1 = this.f1446c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0022t.m3513U(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0142b.m3000b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0022t.m3464v0(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0236e1 c0236e1 = this.f1446c;
        if (c0236e1 != null) {
            c0236e1.m2848f(context, i);
        }
    }
}