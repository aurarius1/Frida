package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0078d;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.AbstractC0082h;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p024p.InterfaceC0162c;
import p010b.p016c.p026q.AbstractC0340y1;
import p010b.p016c.p026q.C0214a3;
import p010b.p016c.p026q.C0220b3;
import p010b.p016c.p026q.C0244f3;
import p010b.p016c.p026q.C0250g3;
import p010b.p016c.p026q.C0262i3;
import p010b.p016c.p026q.C0302q3;
import p010b.p016c.p026q.C0311s2;
import p010b.p016c.p026q.C0328w;
import p010b.p016c.p026q.C0346z2;
import p010b.p016c.p026q.InterfaceC0226c3;
import p010b.p016c.p026q.InterfaceC0232d3;
import p010b.p016c.p026q.InterfaceC0238e3;
import p010b.p016c.p026q.RunnableC0256h3;
import p010b.p016c.p026q.RunnableC0316t2;
import p010b.p016c.p026q.RunnableC0321u2;
import p010b.p016c.p026q.View$OnClickListenerC0272k3;
import p010b.p016c.p026q.View$OnClickListenerC0336x2;
import p010b.p016c.p026q.View$OnFocusChangeListenerC0326v2;
import p010b.p016c.p026q.View$OnKeyListenerC0341y2;
import p010b.p016c.p026q.View$OnLayoutChangeListenerC0331w2;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p062k.p063a.AbstractC0652c;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0340y1 implements InterfaceC0162c {

    /* renamed from: q */
    public static final C0244f3 f256q;

    /* renamed from: A */
    public C0262i3 f257A;

    /* renamed from: B */
    public Rect f258B;

    /* renamed from: C */
    public Rect f259C;

    /* renamed from: D */
    public int[] f260D;

    /* renamed from: E */
    public int[] f261E;

    /* renamed from: F */
    public final ImageView f262F;

    /* renamed from: G */
    public final Drawable f263G;

    /* renamed from: H */
    public final int f264H;

    /* renamed from: I */
    public final int f265I;

    /* renamed from: J */
    public final Intent f266J;

    /* renamed from: K */
    public final Intent f267K;

    /* renamed from: L */
    public final CharSequence f268L;

    /* renamed from: M */
    public InterfaceC0232d3 f269M;

    /* renamed from: N */
    public InterfaceC0226c3 f270N;

    /* renamed from: O */
    public View.OnFocusChangeListener f271O;

    /* renamed from: P */
    public InterfaceC0238e3 f272P;

    /* renamed from: Q */
    public View.OnClickListener f273Q;

    /* renamed from: R */
    public boolean f274R;

    /* renamed from: S */
    public boolean f275S;

    /* renamed from: T */
    public AbstractC0652c f276T;

    /* renamed from: U */
    public boolean f277U;

    /* renamed from: V */
    public CharSequence f278V;

    /* renamed from: W */
    public boolean f279W;

    /* renamed from: a0 */
    public boolean f280a0;

    /* renamed from: b0 */
    public int f281b0;

    /* renamed from: c0 */
    public boolean f282c0;

    /* renamed from: d0 */
    public CharSequence f283d0;

    /* renamed from: e0 */
    public CharSequence f284e0;

    /* renamed from: f0 */
    public boolean f285f0;

    /* renamed from: g0 */
    public int f286g0;

    /* renamed from: h0 */
    public SearchableInfo f287h0;

    /* renamed from: i0 */
    public Bundle f288i0;

    /* renamed from: j0 */
    public final Runnable f289j0;

    /* renamed from: k0 */
    public Runnable f290k0;

    /* renamed from: l0 */
    public final WeakHashMap f291l0;

    /* renamed from: m0 */
    public final View.OnClickListener f292m0;

    /* renamed from: n0 */
    public View.OnKeyListener f293n0;

    /* renamed from: o0 */
    public final TextView.OnEditorActionListener f294o0;

    /* renamed from: p0 */
    public final AdapterView.OnItemClickListener f295p0;

    /* renamed from: q0 */
    public final AdapterView.OnItemSelectedListener f296q0;

    /* renamed from: r */
    public final SearchAutoComplete f297r;

    /* renamed from: r0 */
    public TextWatcher f298r0;

    /* renamed from: s */
    public final View f299s;

    /* renamed from: t */
    public final View f300t;

    /* renamed from: u */
    public final View f301u;

    /* renamed from: v */
    public final ImageView f302v;

    /* renamed from: w */
    public final ImageView f303w;

    /* renamed from: x */
    public final ImageView f304x;

    /* renamed from: y */
    public final ImageView f305y;

    /* renamed from: z */
    public final View f306z;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0250g3();

        /* renamed from: d */
        public boolean f307d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f307d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m1187i = AbstractC1124a.m1187i("SearchView.SavedState{");
            m1187i.append(Integer.toHexString(System.identityHashCode(this)));
            m1187i.append(" isIconified=");
            m1187i.append(this.f307d);
            m1187i.append("}");
            return m1187i.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeValue(Boolean.valueOf(this.f307d));
        }
    }

    /* loaded from: classes.dex */
    public class SearchAutoComplete extends C0328w {

        /* renamed from: e */
        public int f308e;

        /* renamed from: f */
        public SearchView f309f;

        /* renamed from: g */
        public boolean f310g;

        /* renamed from: h */
        public final Runnable f311h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, AbstractC0075a.autoCompleteTextViewStyle);
            this.f311h = new RunnableC0256h3(this);
            this.f308e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* renamed from: a */
        public void m3400a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0244f3 c0244f3 = SearchView.f256q;
            c0244f3.getClass();
            C0244f3.m2825a();
            Method method = c0244f3.f1583c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f308e <= 0 || super.enoughToFilter();
        }

        @Override // p010b.p016c.p026q.C0328w, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f310g) {
                removeCallbacks(this.f311h);
                post(this.f311h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f309f;
            searchView.m3412G(searchView.f275S);
            searchView.post(searchView.f289j0);
            if (searchView.f297r.hasFocus()) {
                searchView.m3408s();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f309f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f309f.hasFocus() && getVisibility() == 0) {
                this.f310g = true;
                Context context = getContext();
                C0244f3 c0244f3 = SearchView.f256q;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m3400a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f310g = false;
                removeCallbacks(this.f311h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f310g = true;
            } else {
                this.f310g = false;
                removeCallbacks(this.f311h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f309f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f308e = i;
        }
    }

    static {
        f256q = Build.VERSION.SDK_INT < 29 ? new C0244f3() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0075a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f258B = new Rect();
        this.f259C = new Rect();
        this.f260D = new int[2];
        this.f261E = new int[2];
        this.f289j0 = new RunnableC0316t2(this);
        this.f290k0 = new RunnableC0321u2(this);
        this.f291l0 = new WeakHashMap();
        View$OnClickListenerC0336x2 view$OnClickListenerC0336x2 = new View$OnClickListenerC0336x2(this);
        this.f292m0 = view$OnClickListenerC0336x2;
        this.f293n0 = new View$OnKeyListenerC0341y2(this);
        C0346z2 c0346z2 = new C0346z2(this);
        this.f294o0 = c0346z2;
        C0214a3 c0214a3 = new C0214a3(this);
        this.f295p0 = c0214a3;
        C0220b3 c0220b3 = new C0220b3(this);
        this.f296q0 = c0220b3;
        this.f298r0 = new C0311s2(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.SearchView, i, 0);
        C0302q3 c0302q3 = new C0302q3(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(c0302q3.m2745m(AbstractC0084j.SearchView_layout, AbstractC0081g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC0080f.search_src_text);
        this.f297r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f299s = findViewById(AbstractC0080f.search_edit_frame);
        View findViewById = findViewById(AbstractC0080f.search_plate);
        this.f300t = findViewById;
        View findViewById2 = findViewById(AbstractC0080f.submit_area);
        this.f301u = findViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC0080f.search_button);
        this.f302v = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC0080f.search_go_btn);
        this.f303w = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC0080f.search_close_btn);
        this.f304x = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC0080f.search_voice_btn);
        this.f305y = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC0080f.search_mag_icon);
        this.f262F = imageView5;
        AbstractC0605j0.m2267P(findViewById, c0302q3.m2751g(AbstractC0084j.SearchView_queryBackground));
        AbstractC0605j0.m2267P(findViewById2, c0302q3.m2751g(AbstractC0084j.SearchView_submitBackground));
        int i2 = AbstractC0084j.SearchView_searchIcon;
        imageView.setImageDrawable(c0302q3.m2751g(i2));
        imageView2.setImageDrawable(c0302q3.m2751g(AbstractC0084j.SearchView_goIcon));
        imageView3.setImageDrawable(c0302q3.m2751g(AbstractC0084j.SearchView_closeIcon));
        imageView4.setImageDrawable(c0302q3.m2751g(AbstractC0084j.SearchView_voiceIcon));
        imageView5.setImageDrawable(c0302q3.m2751g(i2));
        this.f263G = c0302q3.m2751g(AbstractC0084j.SearchView_searchHintIcon);
        AbstractC0022t.m3476p0(imageView, getResources().getString(AbstractC0082h.abc_searchview_description_search));
        this.f264H = c0302q3.m2745m(AbstractC0084j.SearchView_suggestionRowLayout, AbstractC0081g.abc_search_dropdown_item_icons_2line);
        this.f265I = c0302q3.m2745m(AbstractC0084j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(view$OnClickListenerC0336x2);
        imageView3.setOnClickListener(view$OnClickListenerC0336x2);
        imageView2.setOnClickListener(view$OnClickListenerC0336x2);
        imageView4.setOnClickListener(view$OnClickListenerC0336x2);
        searchAutoComplete.setOnClickListener(view$OnClickListenerC0336x2);
        searchAutoComplete.addTextChangedListener(this.f298r0);
        searchAutoComplete.setOnEditorActionListener(c0346z2);
        searchAutoComplete.setOnItemClickListener(c0214a3);
        searchAutoComplete.setOnItemSelectedListener(c0220b3);
        searchAutoComplete.setOnKeyListener(this.f293n0);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC0326v2(this));
        setIconifiedByDefault(c0302q3.m2757a(AbstractC0084j.SearchView_iconifiedByDefault, true));
        int m2752f = c0302q3.m2752f(AbstractC0084j.SearchView_android_maxWidth, -1);
        if (m2752f != -1) {
            setMaxWidth(m2752f);
        }
        this.f268L = c0302q3.m2743o(AbstractC0084j.SearchView_defaultQueryHint);
        this.f278V = c0302q3.m2743o(AbstractC0084j.SearchView_queryHint);
        int m2748j = c0302q3.m2748j(AbstractC0084j.SearchView_android_imeOptions, -1);
        if (m2748j != -1) {
            setImeOptions(m2748j);
        }
        int m2748j2 = c0302q3.m2748j(AbstractC0084j.SearchView_android_inputType, -1);
        if (m2748j2 != -1) {
            setInputType(m2748j2);
        }
        setFocusable(c0302q3.m2757a(AbstractC0084j.SearchView_android_focusable, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f266J = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f267K = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f306z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0331w2(this));
        }
        m3412G(this.f274R);
        m3415D();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC0078d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC0078d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f297r.setText(charSequence);
        this.f297r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public boolean m3418A(int i, KeyEvent keyEvent) {
        if (this.f287h0 != null && this.f276T != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m3405v(this.f297r.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f297r.setSelection(i == 21 ? 0 : this.f297r.length());
                this.f297r.setListSelection(0);
                this.f297r.clearListSelection();
                this.f297r.m3400a();
                return true;
            } else if (i != 19 || this.f297r.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m3417B() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f297r.getText());
        if (!z2 && (!this.f274R || this.f285f0)) {
            z = false;
        }
        this.f304x.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f304x.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: C */
    public void m3416C() {
        int[] iArr = this.f297r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f300t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f301u.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: D */
    public final void m3415D() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f297r;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f274R && this.f263G != null) {
            double textSize = searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.f263G.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f263G), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: E */
    public final void m3414E() {
        int i = 0;
        if (!((this.f277U || this.f282c0) && !this.f275S) || (this.f303w.getVisibility() != 0 && this.f305y.getVisibility() != 0)) {
            i = 8;
        }
        this.f301u.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.f282c0 == false) goto L13;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3413F(boolean z) {
        boolean z2 = this.f277U;
        int i = 0;
        if (z2) {
            if ((z2 || this.f282c0) && !this.f275S) {
                if (hasFocus()) {
                    if (!z) {
                    }
                    this.f303w.setVisibility(i);
                }
            }
        }
        i = 8;
        this.f303w.setVisibility(i);
    }

    /* renamed from: G */
    public final void m3412G(boolean z) {
        this.f275S = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f297r.getText());
        this.f302v.setVisibility(i2);
        m3413F(z2);
        this.f299s.setVisibility(z ? 8 : 0);
        this.f262F.setVisibility((this.f262F.getDrawable() == null || this.f274R) ? 8 : 8);
        m3417B();
        m3411H(!z2);
        m3414E();
    }

    /* renamed from: H */
    public final void m3411H(boolean z) {
        int i = 8;
        if (this.f282c0 && !this.f275S && z) {
            this.f303w.setVisibility(8);
            i = 0;
        }
        this.f305y.setVisibility(i);
    }

    @Override // p010b.p016c.p024p.InterfaceC0162c
    /* renamed from: c */
    public void mo2896c() {
        if (this.f285f0) {
            return;
        }
        this.f285f0 = true;
        int imeOptions = this.f297r.getImeOptions();
        this.f286g0 = imeOptions;
        this.f297r.setImeOptions(imeOptions | 33554432);
        this.f297r.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f280a0 = true;
        super.clearFocus();
        this.f297r.clearFocus();
        this.f297r.setImeVisibility(false);
        this.f280a0 = false;
    }

    @Override // p010b.p016c.p024p.InterfaceC0162c
    /* renamed from: e */
    public void mo2895e() {
        this.f297r.setText("");
        SearchAutoComplete searchAutoComplete = this.f297r;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f284e0 = "";
        clearFocus();
        m3412G(true);
        this.f297r.setImeOptions(this.f286g0);
        this.f285f0 = false;
    }

    public int getImeOptions() {
        return this.f297r.getImeOptions();
    }

    public int getInputType() {
        return this.f297r.getInputType();
    }

    public int getMaxWidth() {
        return this.f281b0;
    }

    public CharSequence getQuery() {
        return this.f297r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f278V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f287h0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f268L : getContext().getText(this.f287h0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f265I;
    }

    public int getSuggestionRowLayout() {
        return this.f264H;
    }

    public AbstractC0652c getSuggestionsAdapter() {
        return this.f276T;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f289j0);
        post(this.f290k0);
        super.onDetachedFromWindow();
    }

    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f297r;
            Rect rect = this.f258B;
            searchAutoComplete.getLocationInWindow(this.f260D);
            getLocationInWindow(this.f261E);
            int[] iArr = this.f260D;
            int i5 = iArr[1];
            int[] iArr2 = this.f261E;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f259C;
            Rect rect3 = this.f258B;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0262i3 c0262i3 = this.f257A;
            if (c0262i3 != null) {
                c0262i3.m2811a(this.f259C, this.f258B);
                return;
            }
            C0262i3 c0262i32 = new C0262i3(this.f259C, this.f258B, this.f297r);
            this.f257A = c0262i32;
            setTouchDelegate(c0262i32);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode;
        if (this.f275S) {
            super.onMeasure(i, i2);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size = this.f281b0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            } else if (mode2 == 1073741824) {
                i3 = this.f281b0;
            }
            mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                size2 = Math.min(getPreferredHeight(), size2);
            } else if (mode == 0) {
                size2 = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        i3 = this.f281b0;
        if (i3 <= 0) {
            i3 = getPreferredWidth();
        }
        size = Math.min(i3, size);
        mode = View.MeasureSpec.getMode(i2);
        int size22 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size22, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f511c);
        m3412G(savedState.f307d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f307d = this.f275S;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f289j0);
    }

    /* renamed from: q */
    public final Intent m3410q(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f284e0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f288i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f287h0.getSearchActivity());
        return intent;
    }

    /* renamed from: r */
    public final Intent m3409r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f288i0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f280a0 && isFocusable()) {
            if (this.f275S) {
                return super.requestFocus(i, rect);
            }
            boolean requestFocus = this.f297r.requestFocus(i, rect);
            if (requestFocus) {
                m3412G(false);
            }
            return requestFocus;
        }
        return false;
    }

    /* renamed from: s */
    public void m3408s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f297r.refreshAutoCompleteResults();
            return;
        }
        C0244f3 c0244f3 = f256q;
        SearchAutoComplete searchAutoComplete = this.f297r;
        c0244f3.getClass();
        C0244f3.m2825a();
        Method method = c0244f3.f1581a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0244f3 c0244f32 = f256q;
        SearchAutoComplete searchAutoComplete2 = this.f297r;
        c0244f32.getClass();
        C0244f3.m2825a();
        Method method2 = c0244f32.f1582b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f288i0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m3406u();
        } else {
            m3402y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f274R == z) {
            return;
        }
        this.f274R = z;
        m3412G(z);
        m3415D();
    }

    public void setImeOptions(int i) {
        this.f297r.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f297r.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f281b0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0226c3 interfaceC0226c3) {
        this.f270N = interfaceC0226c3;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f271O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0232d3 interfaceC0232d3) {
        this.f269M = interfaceC0232d3;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f273Q = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0238e3 interfaceC0238e3) {
        this.f272P = interfaceC0238e3;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f278V = charSequence;
        m3415D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f279W = z;
        AbstractC0652c abstractC0652c = this.f276T;
        if (abstractC0652c instanceof View$OnClickListenerC0272k3) {
            ((View$OnClickListenerC0272k3) abstractC0652c).f1646s = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f287h0 = searchableInfo;
        boolean z = true;
        Intent intent = null;
        if (searchableInfo != null) {
            this.f297r.setThreshold(searchableInfo.getSuggestThreshold());
            this.f297r.setImeOptions(this.f287h0.getImeOptions());
            int inputType = this.f287h0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f287h0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f297r.setInputType(inputType);
            AbstractC0652c abstractC0652c = this.f276T;
            if (abstractC0652c != null) {
                abstractC0652c.mo2159b(null);
            }
            if (this.f287h0.getSuggestAuthority() != null) {
                View$OnClickListenerC0272k3 view$OnClickListenerC0272k3 = new View$OnClickListenerC0272k3(getContext(), this, this.f287h0, this.f291l0);
                this.f276T = view$OnClickListenerC0272k3;
                this.f297r.setAdapter(view$OnClickListenerC0272k3);
                ((View$OnClickListenerC0272k3) this.f276T).f1646s = this.f279W ? 2 : 1;
            }
            m3415D();
        }
        SearchableInfo searchableInfo2 = this.f287h0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f287h0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f266J;
            } else if (this.f287h0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f267K;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.f282c0 = z;
        if (z) {
            this.f297r.setPrivateImeOptions("nm");
        }
        m3412G(this.f275S);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f277U = z;
        m3412G(this.f275S);
    }

    public void setSuggestionsAdapter(AbstractC0652c abstractC0652c) {
        this.f276T = abstractC0652c;
        this.f297r.setAdapter(abstractC0652c);
    }

    /* renamed from: t */
    public void m3407t(int i, String str, String str2) {
        getContext().startActivity(m3410q("android.intent.action.SEARCH", null, null, str2, i, null));
    }

    /* renamed from: u */
    public void m3406u() {
        if (!TextUtils.isEmpty(this.f297r.getText())) {
            this.f297r.setText("");
            this.f297r.requestFocus();
            this.f297r.setImeVisibility(true);
        } else if (this.f274R) {
            InterfaceC0226c3 interfaceC0226c3 = this.f270N;
            if (interfaceC0226c3 == null || !interfaceC0226c3.m2866a()) {
                clearFocus();
                m3412G(true);
            }
        }
    }

    /* renamed from: v */
    public boolean m3405v(int i) {
        String m2795h;
        InterfaceC0238e3 interfaceC0238e3 = this.f272P;
        if (interfaceC0238e3 == null || !interfaceC0238e3.m2839b(i)) {
            Cursor cursor = this.f276T.f2849d;
            if (cursor != null && cursor.moveToPosition(i)) {
                Intent intent = null;
                try {
                    try {
                        int i2 = View$OnClickListenerC0272k3.f1637j;
                        String m2795h2 = View$OnClickListenerC0272k3.m2795h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                        if (m2795h2 == null) {
                            m2795h2 = this.f287h0.getSuggestIntentAction();
                        }
                        if (m2795h2 == null) {
                            m2795h2 = "android.intent.action.SEARCH";
                        }
                        String str = m2795h2;
                        String m2795h3 = View$OnClickListenerC0272k3.m2795h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                        if (m2795h3 == null) {
                            m2795h3 = this.f287h0.getSuggestIntentData();
                        }
                        if (m2795h3 != null && (m2795h = View$OnClickListenerC0272k3.m2795h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                            m2795h3 = m2795h3 + "/" + Uri.encode(m2795h);
                        }
                        intent = m3410q(str, m2795h3 == null ? null : Uri.parse(m2795h3), View$OnClickListenerC0272k3.m2795h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), View$OnClickListenerC0272k3.m2795h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                    } catch (RuntimeException unused) {
                        cursor.getPosition();
                    }
                } catch (RuntimeException unused2) {
                }
                if (intent != null) {
                    try {
                        getContext().startActivity(intent);
                    } catch (RuntimeException unused3) {
                        String str2 = "Failed launch activity: " + intent;
                    }
                }
            }
            this.f297r.setImeVisibility(false);
            this.f297r.dismissDropDown();
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public boolean m3404w(int i) {
        CharSequence mo2158c;
        InterfaceC0238e3 interfaceC0238e3 = this.f272P;
        if (interfaceC0238e3 == null || !interfaceC0238e3.m2840a(i)) {
            Editable text = this.f297r.getText();
            Cursor cursor = this.f276T.f2849d;
            if (cursor == null) {
                return true;
            }
            if (!cursor.moveToPosition(i) || (mo2158c = this.f276T.mo2158c(cursor)) == null) {
                setQuery(text);
                return true;
            }
            setQuery(mo2158c);
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void m3403x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: y */
    public void m3402y() {
        m3412G(false);
        this.f297r.requestFocus();
        this.f297r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f273Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: z */
    public void m3401z() {
        Editable text = this.f297r.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0232d3 interfaceC0232d3 = this.f269M;
        if (interfaceC0232d3 == null || !interfaceC0232d3.m2858b(text.toString())) {
            if (this.f287h0 != null) {
                m3407t(0, null, text.toString());
            }
            this.f297r.setImeVisibility(false);
            this.f297r.dismissDropDown();
        }
    }
}