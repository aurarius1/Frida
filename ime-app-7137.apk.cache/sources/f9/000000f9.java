package p010b.p016c.p017k;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0084j;

/* renamed from: b.c.k.o */
/* loaded from: classes.dex */
public class C0117o {

    /* renamed from: A */
    public NestedScrollView f981A;

    /* renamed from: C */
    public Drawable f983C;

    /* renamed from: D */
    public ImageView f984D;

    /* renamed from: E */
    public TextView f985E;

    /* renamed from: F */
    public TextView f986F;

    /* renamed from: G */
    public View f987G;

    /* renamed from: H */
    public ListAdapter f988H;

    /* renamed from: J */
    public int f990J;

    /* renamed from: K */
    public int f991K;

    /* renamed from: L */
    public int f992L;

    /* renamed from: M */
    public int f993M;

    /* renamed from: N */
    public int f994N;

    /* renamed from: O */
    public int f995O;

    /* renamed from: P */
    public boolean f996P;

    /* renamed from: Q */
    public Handler f997Q;

    /* renamed from: a */
    public final Context f999a;

    /* renamed from: b */
    public final DialogC0124r0 f1000b;

    /* renamed from: c */
    public final Window f1001c;

    /* renamed from: d */
    public final int f1002d;

    /* renamed from: e */
    public CharSequence f1003e;

    /* renamed from: f */
    public CharSequence f1004f;

    /* renamed from: g */
    public ListView f1005g;

    /* renamed from: h */
    public View f1006h;

    /* renamed from: i */
    public int f1007i;

    /* renamed from: j */
    public int f1008j;

    /* renamed from: k */
    public int f1009k;

    /* renamed from: l */
    public int f1010l;

    /* renamed from: m */
    public int f1011m;

    /* renamed from: o */
    public Button f1013o;

    /* renamed from: p */
    public CharSequence f1014p;

    /* renamed from: q */
    public Message f1015q;

    /* renamed from: r */
    public Drawable f1016r;

    /* renamed from: s */
    public Button f1017s;

    /* renamed from: t */
    public CharSequence f1018t;

    /* renamed from: u */
    public Message f1019u;

    /* renamed from: v */
    public Drawable f1020v;

    /* renamed from: w */
    public Button f1021w;

    /* renamed from: x */
    public CharSequence f1022x;

    /* renamed from: y */
    public Message f1023y;

    /* renamed from: z */
    public Drawable f1024z;

    /* renamed from: n */
    public boolean f1012n = false;

    /* renamed from: B */
    public int f982B = 0;

    /* renamed from: I */
    public int f989I = -1;

    /* renamed from: R */
    public final View.OnClickListener f998R = new View$OnClickListenerC0094d(this);

    public C0117o(Context context, DialogC0124r0 dialogC0124r0, Window window) {
        this.f999a = context;
        this.f1000b = dialogC0124r0;
        this.f1001c = window;
        this.f997Q = new HandlerC0113m(dialogC0124r0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0084j.AlertDialog, AbstractC0075a.alertDialogStyle, 0);
        this.f990J = obtainStyledAttributes.getResourceId(AbstractC0084j.AlertDialog_android_layout, 0);
        this.f991K = obtainStyledAttributes.getResourceId(AbstractC0084j.AlertDialog_buttonPanelSideLayout, 0);
        this.f992L = obtainStyledAttributes.getResourceId(AbstractC0084j.AlertDialog_listLayout, 0);
        this.f993M = obtainStyledAttributes.getResourceId(AbstractC0084j.AlertDialog_multiChoiceItemLayout, 0);
        this.f994N = obtainStyledAttributes.getResourceId(AbstractC0084j.AlertDialog_singleChoiceItemLayout, 0);
        this.f995O = obtainStyledAttributes.getResourceId(AbstractC0084j.AlertDialog_listItemLayout, 0);
        this.f996P = obtainStyledAttributes.getBoolean(AbstractC0084j.AlertDialog_showTitle, true);
        this.f1002d = obtainStyledAttributes.getDimensionPixelSize(AbstractC0084j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0124r0.m3029a().mo3008k(1);
    }

    /* renamed from: a */
    public static boolean m3069a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m3069a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public static void m3067c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: b */
    public final void m3068b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final ViewGroup m3066d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: e */
    public void m3065e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.f997Q.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f1022x = charSequence;
            this.f1023y = obtainMessage;
            this.f1024z = null;
        } else if (i == -2) {
            this.f1018t = charSequence;
            this.f1019u = obtainMessage;
            this.f1020v = null;
        } else if (i != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f1014p = charSequence;
            this.f1015q = obtainMessage;
            this.f1016r = null;
        }
    }

    /* renamed from: f */
    public void m3064f(int i) {
        this.f983C = null;
        this.f982B = i;
        ImageView imageView = this.f984D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f984D.setImageResource(this.f982B);
        }
    }
}