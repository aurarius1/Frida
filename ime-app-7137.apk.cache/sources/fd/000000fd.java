package p010b.p016c.p017k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.p026q.C0335x1;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.k.q */
/* loaded from: classes.dex */
public class DialogInterfaceC0121q extends DialogC0124r0 implements DialogInterface {

    /* renamed from: d */
    public final C0117o f1084d;

    public DialogInterfaceC0121q(Context context, int i) {
        super(context, m3030c(context, i));
        this.f1084d = new C0117o(getContext(), this, getWindow());
    }

    /* renamed from: c */
    public static int m3030c(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC0075a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02da, code lost:
        if (r3 != null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e3, code lost:
        if (r3 != null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e5, code lost:
        r3.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0346, code lost:
        if (r7 != null) goto L117;
     */
    @Override // p010b.p016c.p017k.DialogC0124r0, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        View findViewById;
        ListAdapter listAdapter;
        View view2;
        View findViewById2;
        Button button;
        super.onCreate(bundle);
        C0117o c0117o = this.f1084d;
        int i = c0117o.f991K;
        c0117o.f1000b.setContentView(c0117o.f990J);
        View findViewById3 = c0117o.f1001c.findViewById(AbstractC0080f.parentPanel);
        int i2 = AbstractC0080f.topPanel;
        View findViewById4 = findViewById3.findViewById(i2);
        int i3 = AbstractC0080f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i3);
        int i4 = AbstractC0080f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(AbstractC0080f.customPanel);
        View view3 = c0117o.f1006h;
        if (view3 == null) {
            view3 = c0117o.f1007i != 0 ? LayoutInflater.from(c0117o.f999a).inflate(c0117o.f1007i, viewGroup, false) : null;
        }
        boolean z2 = view3 != null;
        if (!z2 || !C0117o.m3069a(view3)) {
            c0117o.f1001c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) c0117o.f1001c.findViewById(AbstractC0080f.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (c0117o.f1012n) {
                frameLayout.setPadding(c0117o.f1008j, c0117o.f1009k, c0117o.f1010l, c0117o.f1011m);
            }
            if (c0117o.f1005g != null) {
                ((LinearLayout.LayoutParams) ((C0335x1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(i2);
        View findViewById8 = viewGroup.findViewById(i3);
        View findViewById9 = viewGroup.findViewById(i4);
        ViewGroup m3066d = c0117o.m3066d(findViewById7, findViewById4);
        ViewGroup m3066d2 = c0117o.m3066d(findViewById8, findViewById5);
        ViewGroup m3066d3 = c0117o.m3066d(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) c0117o.f1001c.findViewById(AbstractC0080f.scrollView);
        c0117o.f981A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0117o.f981A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) m3066d2.findViewById(16908299);
        c0117o.f986F = textView;
        if (textView != null) {
            CharSequence charSequence = c0117o.f1004f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0117o.f981A.removeView(c0117o.f986F);
                if (c0117o.f1005g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0117o.f981A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c0117o.f981A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c0117o.f1005g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    m3066d2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) m3066d3.findViewById(16908313);
        c0117o.f1013o = button2;
        button2.setOnClickListener(c0117o.f998R);
        if (TextUtils.isEmpty(c0117o.f1014p) && c0117o.f1016r == null) {
            c0117o.f1013o.setVisibility(8);
            z = false;
        } else {
            c0117o.f1013o.setText(c0117o.f1014p);
            Drawable drawable = c0117o.f1016r;
            if (drawable != null) {
                int i5 = c0117o.f1002d;
                drawable.setBounds(0, 0, i5, i5);
                c0117o.f1013o.setCompoundDrawables(c0117o.f1016r, null, null, null);
            }
            c0117o.f1013o.setVisibility(0);
            z = true;
        }
        Button button3 = (Button) m3066d3.findViewById(16908314);
        c0117o.f1017s = button3;
        button3.setOnClickListener(c0117o.f998R);
        if (TextUtils.isEmpty(c0117o.f1018t) && c0117o.f1020v == null) {
            c0117o.f1017s.setVisibility(8);
        } else {
            c0117o.f1017s.setText(c0117o.f1018t);
            Drawable drawable2 = c0117o.f1020v;
            if (drawable2 != null) {
                int i6 = c0117o.f1002d;
                drawable2.setBounds(0, 0, i6, i6);
                c0117o.f1017s.setCompoundDrawables(c0117o.f1020v, null, null, null);
            }
            c0117o.f1017s.setVisibility(0);
            z |= true;
        }
        Button button4 = (Button) m3066d3.findViewById(16908315);
        c0117o.f1021w = button4;
        button4.setOnClickListener(c0117o.f998R);
        if (TextUtils.isEmpty(c0117o.f1022x) && c0117o.f1024z == null) {
            c0117o.f1021w.setVisibility(8);
            view = null;
        } else {
            c0117o.f1021w.setText(c0117o.f1022x);
            Drawable drawable3 = c0117o.f1024z;
            if (drawable3 != null) {
                int i7 = c0117o.f1002d;
                drawable3.setBounds(0, 0, i7, i7);
                view = null;
                c0117o.f1021w.setCompoundDrawables(c0117o.f1024z, null, null, null);
            } else {
                view = null;
            }
            c0117o.f1021w.setVisibility(0);
            z |= true;
        }
        Context context = c0117o.f999a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC0075a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                button = c0117o.f1013o;
            } else if (z) {
                button = c0117o.f1017s;
            } else if (z) {
                button = c0117o.f1021w;
            }
            c0117o.m3068b(button);
        }
        if (!(z)) {
            m3066d3.setVisibility(8);
        }
        if (c0117o.f987G != null) {
            m3066d.addView(c0117o.f987G, 0, new ViewGroup.LayoutParams(-1, -2));
            c0117o.f1001c.findViewById(AbstractC0080f.title_template).setVisibility(8);
        } else {
            c0117o.f984D = (ImageView) c0117o.f1001c.findViewById(16908294);
            if ((!TextUtils.isEmpty(c0117o.f1003e)) && c0117o.f996P) {
                TextView textView2 = (TextView) c0117o.f1001c.findViewById(AbstractC0080f.alertTitle);
                c0117o.f985E = textView2;
                textView2.setText(c0117o.f1003e);
                int i8 = c0117o.f982B;
                if (i8 != 0) {
                    c0117o.f984D.setImageResource(i8);
                } else {
                    Drawable drawable4 = c0117o.f983C;
                    if (drawable4 != null) {
                        c0117o.f984D.setImageDrawable(drawable4);
                    } else {
                        c0117o.f985E.setPadding(c0117o.f984D.getPaddingLeft(), c0117o.f984D.getPaddingTop(), c0117o.f984D.getPaddingRight(), c0117o.f984D.getPaddingBottom());
                        c0117o.f984D.setVisibility(8);
                    }
                }
            } else {
                c0117o.f1001c.findViewById(AbstractC0080f.title_template).setVisibility(8);
                c0117o.f984D.setVisibility(8);
                m3066d.setVisibility(8);
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i9 = (m3066d == null || m3066d.getVisibility() == 8) ? 0 : 1;
        boolean z4 = m3066d3.getVisibility() != 8;
        if (!z4 && (findViewById2 = m3066d2.findViewById(AbstractC0080f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i9 != 0) {
            NestedScrollView nestedScrollView2 = c0117o.f981A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            findViewById = (c0117o.f1004f == null && c0117o.f1005g == null) ? view : m3066d.findViewById(AbstractC0080f.titleDividerNoCustom);
        } else {
            findViewById = m3066d2.findViewById(AbstractC0080f.textSpacerNoTitle);
        }
        ListView listView = c0117o.f1005g;
        if (listView instanceof AlertController$RecycleListView) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) listView;
            alertController$RecycleListView.getClass();
            if (!z4 || i9 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i9 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f135b, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f136c);
            }
        }
        if (!z3) {
            View view4 = c0117o.f1005g;
            if (view4 == null) {
                view4 = c0117o.f981A;
            }
            if (view4 != null) {
                int i10 = i9 | (z4 ? 2 : 0);
                View findViewById10 = c0117o.f1001c.findViewById(AbstractC0080f.scrollIndicatorUp);
                View findViewById11 = c0117o.f1001c.findViewById(AbstractC0080f.scrollIndicatorDown);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                    if (i11 >= 23) {
                        view4.setScrollIndicators(i10, 3);
                    }
                    if (findViewById10 != null) {
                        m3066d2.removeView(findViewById10);
                    }
                } else {
                    if (findViewById10 != null && (i10 & 1) == 0) {
                        m3066d2.removeView(findViewById10);
                        findViewById10 = view;
                    }
                    if (findViewById11 == null || (i10 & 2) != 0) {
                        view2 = findViewById11;
                    } else {
                        m3066d2.removeView(findViewById11);
                        view2 = view;
                    }
                    if (findViewById10 != null || view2 != null) {
                        if (c0117o.f1004f != null) {
                            c0117o.f981A.setOnScrollChangeListener(new C0097e(c0117o, findViewById10, view2));
                            c0117o.f981A.post(new RunnableC0099f(c0117o, findViewById10, view2));
                        } else {
                            ListView listView2 = c0117o.f1005g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new C0101g(c0117o, findViewById10, view2));
                                c0117o.f1005g.post(new RunnableC0103h(c0117o, findViewById10, view2));
                            } else {
                                if (findViewById10 != null) {
                                    m3066d2.removeView(findViewById10);
                                }
                                if (view2 != null) {
                                    findViewById11 = view2;
                                    m3066d2.removeView(findViewById11);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = c0117o.f1005g;
        if (listView3 == null || (listAdapter = c0117o.f988H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i12 = c0117o.f989I;
        if (i12 > -1) {
            listView3.setItemChecked(i12, true);
            listView3.setSelection(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1084d.f981A;
        if (nestedScrollView != null && nestedScrollView.m3322o(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1084d.f981A;
        if (nestedScrollView != null && nestedScrollView.m3322o(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p010b.p016c.p017k.DialogC0124r0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0117o c0117o = this.f1084d;
        c0117o.f1003e = charSequence;
        TextView textView = c0117o.f985E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}