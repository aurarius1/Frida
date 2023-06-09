package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.AbstractC0082h;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0181e0;
import p010b.p016c.p026q.C0302q3;
import p010b.p046j.p058l.AbstractC0605j0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0181e0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C0202s f150b;

    /* renamed from: c */
    public ImageView f151c;

    /* renamed from: d */
    public RadioButton f152d;

    /* renamed from: e */
    public TextView f153e;

    /* renamed from: f */
    public CheckBox f154f;

    /* renamed from: g */
    public TextView f155g;

    /* renamed from: h */
    public ImageView f156h;

    /* renamed from: i */
    public ImageView f157i;

    /* renamed from: j */
    public LinearLayout f158j;

    /* renamed from: k */
    public Drawable f159k;

    /* renamed from: l */
    public int f160l;

    /* renamed from: m */
    public Context f161m;

    /* renamed from: n */
    public boolean f162n;

    /* renamed from: o */
    public Drawable f163o;

    /* renamed from: p */
    public boolean f164p;

    /* renamed from: q */
    public LayoutInflater f165q;

    /* renamed from: r */
    public boolean f166r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = AbstractC0075a.listMenuViewStyle;
        C0302q3 m2740r = C0302q3.m2740r(getContext(), attributeSet, AbstractC0084j.MenuView, i, 0);
        this.f159k = m2740r.m2751g(AbstractC0084j.MenuView_android_itemBackground);
        this.f160l = m2740r.m2745m(AbstractC0084j.MenuView_android_itemTextAppearance, -1);
        this.f162n = m2740r.m2757a(AbstractC0084j.MenuView_preserveIconSpacing, false);
        this.f161m = context;
        this.f163o = m2740r.m2751g(AbstractC0084j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, AbstractC0075a.dropDownListViewStyle, 0);
        this.f164p = obtainStyledAttributes.hasValue(0);
        m2740r.f1740b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f165q == null) {
            this.f165q = LayoutInflater.from(getContext());
        }
        return this.f165q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f156h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m3448a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC0081g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f154f = checkBox;
        LinearLayout linearLayout = this.f158j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f157i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f157i.getLayoutParams();
        rect.top = this.f157i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* renamed from: b */
    public final void m3447b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC0081g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f152d = radioButton;
        LinearLayout linearLayout = this.f158j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* renamed from: c */
    public void m3446c(boolean z) {
        int i;
        String sb;
        int i2 = (z && this.f150b.m2901n()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.f155g;
            C0202s c0202s = this.f150b;
            char m2910e = c0202s.m2910e();
            if (m2910e == 0) {
                sb = "";
            } else {
                Resources resources = c0202s.f1417n.f1372b.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(c0202s.f1417n.f1372b).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(AbstractC0082h.abc_prepend_shortcut_label));
                }
                int i3 = c0202s.f1417n.mo2925n() ? c0202s.f1414k : c0202s.f1412i;
                C0202s.m2912c(sb2, i3, 65536, resources.getString(AbstractC0082h.abc_menu_meta_shortcut_label));
                C0202s.m2912c(sb2, i3, 4096, resources.getString(AbstractC0082h.abc_menu_ctrl_shortcut_label));
                C0202s.m2912c(sb2, i3, 2, resources.getString(AbstractC0082h.abc_menu_alt_shortcut_label));
                C0202s.m2912c(sb2, i3, 1, resources.getString(AbstractC0082h.abc_menu_shift_shortcut_label));
                C0202s.m2912c(sb2, i3, 4, resources.getString(AbstractC0082h.abc_menu_sym_shortcut_label));
                C0202s.m2912c(sb2, i3, 8, resources.getString(AbstractC0082h.abc_menu_function_shortcut_label));
                if (m2910e == '\b') {
                    i = AbstractC0082h.abc_menu_delete_shortcut_label;
                } else if (m2910e == '\n') {
                    i = AbstractC0082h.abc_menu_enter_shortcut_label;
                } else if (m2910e != ' ') {
                    sb2.append(m2910e);
                    sb = sb2.toString();
                } else {
                    i = AbstractC0082h.abc_menu_space_shortcut_label;
                }
                sb2.append(resources.getString(i));
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f155g.getVisibility() != i2) {
            this.f155g.setVisibility(i2);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    /* renamed from: d */
    public void mo275d(C0202s c0202s, int i) {
        this.f150b = c0202s;
        setVisibility(c0202s.isVisible() ? 0 : 8);
        setTitle(c0202s.f1408e);
        setCheckable(c0202s.isCheckable());
        boolean m2901n = c0202s.m2901n();
        c0202s.m2910e();
        m3446c(m2901n);
        setIcon(c0202s.getIcon());
        setEnabled(c0202s.isEnabled());
        setSubMenuArrowVisible(c0202s.hasSubMenu());
        setContentDescription(c0202s.f1420q);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    public C0202s getItemData() {
        return this.f150b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f159k;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
        TextView textView = (TextView) findViewById(AbstractC0080f.title);
        this.f153e = textView;
        int i = this.f160l;
        if (i != -1) {
            textView.setTextAppearance(this.f161m, i);
        }
        this.f155g = (TextView) findViewById(AbstractC0080f.shortcut);
        ImageView imageView = (ImageView) findViewById(AbstractC0080f.submenuarrow);
        this.f156h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f163o);
        }
        this.f157i = (ImageView) findViewById(AbstractC0080f.group_divider);
        this.f158j = (LinearLayout) findViewById(AbstractC0080f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f151c != null && this.f162n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f151c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f152d == null && this.f154f == null) {
            return;
        }
        if (this.f150b.m2907h()) {
            if (this.f152d == null) {
                m3447b();
            }
            compoundButton = this.f152d;
            compoundButton2 = this.f154f;
        } else {
            if (this.f154f == null) {
                m3448a();
            }
            compoundButton = this.f154f;
            compoundButton2 = this.f152d;
        }
        if (z) {
            compoundButton.setChecked(this.f150b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f154f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f152d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f150b.m2907h()) {
            if (this.f152d == null) {
                m3447b();
            }
            compoundButton = this.f152d;
        } else {
            if (this.f154f == null) {
                m3448a();
            }
            compoundButton = this.f154f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f166r = z;
        this.f162n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f157i;
        if (imageView != null) {
            imageView.setVisibility((this.f164p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f150b.f1417n.getClass();
        boolean z = this.f166r;
        if (z || this.f162n) {
            ImageView imageView = this.f151c;
            if (imageView == null && drawable == null && !this.f162n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(AbstractC0081g.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f151c = imageView2;
                LinearLayout linearLayout = this.f158j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f162n) {
                this.f151c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f151c;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f151c.getVisibility() != 0) {
                this.f151c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f153e.setText(charSequence);
            if (this.f153e.getVisibility() == 0) {
                return;
            }
            textView = this.f153e;
            i = 0;
        } else {
            i = 8;
            if (this.f153e.getVisibility() == 8) {
                return;
            }
            textView = this.f153e;
        }
        textView.setVisibility(i);
    }
}