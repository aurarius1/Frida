package p010b.p016c.p017k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: b.c.k.p */
/* loaded from: classes.dex */
public class C0119p {

    /* renamed from: a */
    public final C0111l f1026a;

    /* renamed from: b */
    public final int f1027b;

    public C0119p(Context context) {
        this(context, DialogInterfaceC0121q.m3030c(context, 0));
    }

    public C0119p(Context context, int i) {
        this.f1026a = new C0111l(new ContextThemeWrapper(context, DialogInterfaceC0121q.m3030c(context, i)));
        this.f1027b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0121q m3063a() {
        ListAdapter listAdapter;
        AdapterView.OnItemClickListener c0109k;
        int i;
        DialogInterfaceC0121q dialogInterfaceC0121q = new DialogInterfaceC0121q(this.f1026a.f936a, this.f1027b);
        C0111l c0111l = this.f1026a;
        C0117o c0117o = dialogInterfaceC0121q.f1084d;
        View view = c0111l.f941f;
        if (view != null) {
            c0117o.f987G = view;
        } else {
            CharSequence charSequence = c0111l.f940e;
            if (charSequence != null) {
                c0117o.f1003e = charSequence;
                TextView textView = c0117o.f985E;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0111l.f939d;
            if (drawable != null) {
                c0117o.f983C = drawable;
                c0117o.f982B = 0;
                ImageView imageView = c0117o.f984D;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0117o.f984D.setImageDrawable(drawable);
                }
            }
            int i2 = c0111l.f938c;
            if (i2 != 0) {
                c0117o.m3064f(i2);
            }
        }
        CharSequence charSequence2 = c0111l.f942g;
        if (charSequence2 != null) {
            c0117o.f1004f = charSequence2;
            TextView textView2 = c0117o.f986F;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0111l.f943h;
        if (charSequence3 != null) {
            c0117o.m3065e(-1, charSequence3, c0111l.f944i, null, null);
        }
        CharSequence charSequence4 = c0111l.f945j;
        if (charSequence4 != null) {
            c0117o.m3065e(-2, charSequence4, c0111l.f946k, null, null);
        }
        CharSequence charSequence5 = c0111l.f947l;
        if (charSequence5 != null) {
            c0117o.m3065e(-3, charSequence5, c0111l.f948m, null, null);
        }
        if (c0111l.f951p != null || c0111l.f952q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0111l.f937b.inflate(c0117o.f992L, (ViewGroup) null);
            if (c0111l.f956u) {
                listAdapter = new C0105i(c0111l, c0111l.f936a, c0117o.f993M, 16908308, c0111l.f951p, alertController$RecycleListView);
            } else {
                int i3 = c0111l.f957v ? c0117o.f994N : c0117o.f995O;
                listAdapter = c0111l.f952q;
                if (listAdapter == null) {
                    listAdapter = new C0115n(c0111l.f936a, i3, 16908308, c0111l.f951p);
                }
            }
            c0117o.f988H = listAdapter;
            c0117o.f989I = c0111l.f958w;
            if (c0111l.f953r != null) {
                c0109k = new C0107j(c0111l, c0117o);
            } else {
                if (c0111l.f959x != null) {
                    c0109k = new C0109k(c0111l, alertController$RecycleListView, c0117o);
                }
                if (c0111l.f957v) {
                    i = c0111l.f956u ? 2 : 2;
                    c0117o.f1005g = alertController$RecycleListView;
                } else {
                    i = 1;
                }
                alertController$RecycleListView.setChoiceMode(i);
                c0117o.f1005g = alertController$RecycleListView;
            }
            alertController$RecycleListView.setOnItemClickListener(c0109k);
            if (c0111l.f957v) {
            }
            alertController$RecycleListView.setChoiceMode(i);
            c0117o.f1005g = alertController$RecycleListView;
        }
        View view2 = c0111l.f954s;
        if (view2 != null) {
            c0117o.f1006h = view2;
            c0117o.f1007i = 0;
            c0117o.f1012n = false;
        }
        dialogInterfaceC0121q.setCancelable(this.f1026a.f949n);
        if (this.f1026a.f949n) {
            dialogInterfaceC0121q.setCanceledOnTouchOutside(true);
        }
        this.f1026a.getClass();
        dialogInterfaceC0121q.setOnCancelListener(null);
        this.f1026a.getClass();
        dialogInterfaceC0121q.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = this.f1026a.f950o;
        if (onKeyListener != null) {
            dialogInterfaceC0121q.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC0121q;
    }

    /* renamed from: b */
    public C0119p m3062b(int i) {
        C0111l c0111l = this.f1026a;
        c0111l.f942g = c0111l.f936a.getText(i);
        return this;
    }

    /* renamed from: c */
    public C0119p m3061c(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C0111l c0111l = this.f1026a;
        c0111l.f951p = charSequenceArr;
        c0111l.f959x = onMultiChoiceClickListener;
        c0111l.f955t = zArr;
        c0111l.f956u = true;
        return this;
    }

    /* renamed from: d */
    public C0119p m3060d(int i, DialogInterface.OnClickListener onClickListener) {
        C0111l c0111l = this.f1026a;
        c0111l.f945j = c0111l.f936a.getText(i);
        this.f1026a.f946k = onClickListener;
        return this;
    }

    /* renamed from: e */
    public C0119p m3059e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0111l c0111l = this.f1026a;
        c0111l.f945j = charSequence;
        c0111l.f946k = onClickListener;
        return this;
    }

    /* renamed from: f */
    public C0119p m3058f(int i, DialogInterface.OnClickListener onClickListener) {
        C0111l c0111l = this.f1026a;
        c0111l.f943h = c0111l.f936a.getText(i);
        this.f1026a.f944i = onClickListener;
        return this;
    }

    /* renamed from: g */
    public C0119p m3057g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0111l c0111l = this.f1026a;
        c0111l.f943h = charSequence;
        c0111l.f944i = onClickListener;
        return this;
    }

    /* renamed from: h */
    public C0119p m3056h(int i) {
        C0111l c0111l = this.f1026a;
        c0111l.f940e = c0111l.f936a.getText(i);
        return this;
    }

    /* renamed from: i */
    public DialogInterfaceC0121q m3055i() {
        DialogInterfaceC0121q m3063a = m3063a();
        m3063a.show();
        return m3063a;
    }
}