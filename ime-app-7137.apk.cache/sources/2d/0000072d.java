package p093c.p097b.p130z.p132r0.p134b1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p119s.p120b.AbstractC1441a;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.b1.d */
/* loaded from: classes.dex */
public class C1705d implements InterfaceC1704c {

    /* renamed from: a */
    public static final int[] f5268a = {16843324};

    /* renamed from: b */
    public static final int[] f5269b = new int[0];

    /* renamed from: c */
    public int f5270c = -1;

    /* renamed from: d */
    public int f5271d = -1;

    /* renamed from: e */
    public final ViewGroup f5272e;

    /* renamed from: f */
    public final TextView f5273f;

    /* renamed from: g */
    public final ImageView f5274g;

    /* renamed from: h */
    public final View f5275h;

    /* renamed from: i */
    public final PopupWindow f5276i;

    /* renamed from: j */
    public final C1712k f5277j;

    /* renamed from: k */
    public final boolean f5278k;

    @SuppressLint({"InflateParams"})
    public C1705d(Context context, View view, C1712k c1712k) {
        this.f5275h = view;
        this.f5277j = c1712k;
        PopupWindow popupWindow = new PopupWindow(context);
        this.f5276i = popupWindow;
        AbstractC1441a.m1036b(popupWindow);
        popupWindow.setClippingEnabled(false);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.key_preview, (ViewGroup) null);
        this.f5272e = viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(R.id.key_preview_text);
        this.f5273f = textView;
        textView.setTextColor(c1712k.f5293d);
        textView.setTypeface(c1712k.f5294e);
        this.f5274g = (ImageView) viewGroup.findViewById(R.id.key_preview_icon);
        popupWindow.setBackgroundDrawable(c1712k.f5292c.getConstantState().newDrawable(context.getResources()));
        popupWindow.setContentView(viewGroup);
        this.f5278k = c1712k.f5296g == 1;
        popupWindow.setTouchable(false);
        int i = c1712k.f5296g;
        popupWindow.setAnimationStyle(i != 0 ? i != 2 ? R.style.KeyPreviewAnimationExtend : R.style.KeyPreviewAnimationAppear : 0);
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1704c
    /* renamed from: a */
    public void mo883a(Key key, CharSequence charSequence, Point point) {
        TextView textView;
        float f;
        this.f5274g.setVisibility(8);
        this.f5273f.setVisibility(0);
        this.f5274g.setImageDrawable(null);
        this.f5273f.setTextColor(this.f5277j.f5293d);
        this.f5273f.setText(charSequence);
        if (charSequence.length() > 1 && key.f5218a.length < 2) {
            textView = this.f5273f;
            C1712k c1712k = this.f5277j;
            int i = c1712k.f5291b;
            if (i < 0) {
                i = c1712k.f5290a;
            }
            f = i;
        } else {
            textView = this.f5273f;
            f = this.f5277j.f5290a;
        }
        textView.setTextSize(0, f);
        this.f5273f.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        m884c(key, this.f5273f.getMeasuredWidth(), this.f5273f.getMeasuredHeight(), point);
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1704c
    /* renamed from: b */
    public void mo882b(Key key, Drawable drawable, Point point) {
        this.f5274g.setVisibility(0);
        this.f5273f.setVisibility(8);
        this.f5274g.setImageState(drawable.getState(), false);
        this.f5274g.setImageDrawable(drawable);
        this.f5274g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f5273f.setText((CharSequence) null);
        m884c(key, this.f5274g.getMeasuredWidth(), this.f5274g.getMeasuredHeight(), point);
    }

    /* renamed from: c */
    public final void m884c(Key key, int i, int i2, Point point) {
        int max = Math.max(i, key.width);
        if (this.f5278k) {
            i2 += key.height;
        }
        int max2 = Math.max(i2, key.height);
        this.f5272e.setPadding(0, 0, 0, this.f5278k ? key.height : 0);
        Drawable drawable = this.f5277j.f5292c;
        if (this.f5271d < 0) {
            this.f5270c = 0;
            this.f5271d = 0;
            if (drawable != null) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.f5270c = rect.left + rect.right + this.f5270c;
                this.f5271d = rect.top + rect.bottom + this.f5271d;
            }
        }
        int i3 = max + this.f5270c;
        int i4 = max2 + this.f5271d;
        if (drawable != null) {
            i3 = Math.max(drawable.getMinimumWidth(), i3);
            i4 = Math.max(drawable.getMinimumHeight(), i4);
        }
        int i5 = point.x - (i3 / 2);
        int i6 = point.y - i4;
        if (this.f5276i.isShowing()) {
            this.f5276i.update(i5, i6, i3, i4);
        } else {
            this.f5276i.setWidth(i3);
            this.f5276i.setHeight(i4);
            try {
                this.f5276i.showAtLocation(this.f5275h, 0, i5, i6);
            } catch (RuntimeException unused) {
            }
        }
        this.f5272e.setVisibility(0);
        if (drawable != null) {
            drawable.setState(key.f5239v != 0 ? f5268a : f5269b);
        }
        this.f5272e.requestLayout();
        this.f5272e.invalidate();
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1704c
    public void dismiss() {
        this.f5276i.dismiss();
    }
}