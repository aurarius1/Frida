package p010b.p016c.p026q;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0080f;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p062k.p063a.AbstractC0652c;

/* renamed from: b.c.q.k3 */
/* loaded from: classes.dex */
public class View$OnClickListenerC0272k3 extends AbstractC0652c implements View.OnClickListener {

    /* renamed from: j */
    public static final /* synthetic */ int f1637j = 0;

    /* renamed from: k */
    public int f1638k;

    /* renamed from: l */
    public int f1639l;

    /* renamed from: m */
    public LayoutInflater f1640m;

    /* renamed from: n */
    public final SearchView f1641n;

    /* renamed from: o */
    public final SearchableInfo f1642o;

    /* renamed from: p */
    public final Context f1643p;

    /* renamed from: q */
    public final WeakHashMap f1644q;

    /* renamed from: r */
    public final int f1645r;

    /* renamed from: s */
    public int f1646s;

    /* renamed from: t */
    public ColorStateList f1647t;

    /* renamed from: u */
    public int f1648u;

    /* renamed from: v */
    public int f1649v;

    /* renamed from: w */
    public int f1650w;

    /* renamed from: x */
    public int f1651x;

    /* renamed from: y */
    public int f1652y;

    /* renamed from: z */
    public int f1653z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC0272k3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, null, true);
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1639l = suggestionRowLayout;
        this.f1638k = suggestionRowLayout;
        this.f1640m = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f1646s = 1;
        this.f1648u = -1;
        this.f1649v = -1;
        this.f1650w = -1;
        this.f1651x = -1;
        this.f1652y = -1;
        this.f1653z = -1;
        this.f1641n = searchView;
        this.f1642o = searchableInfo;
        this.f1645r = searchView.getSuggestionCommitIconResId();
        this.f1643p = context;
        this.f1644q = weakHashMap;
    }

    /* renamed from: h */
    public static String m2795h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    @Override // p010b.p062k.p063a.AbstractC0652c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2160a(View view, Context context, Cursor cursor) {
        Drawable m2797f;
        Drawable drawable;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        C0267j3 c0267j3 = (C0267j3) view.getTag();
        int i = this.f1653z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c0267j3.f1625a != null) {
            String m2795h = m2795h(cursor, this.f1648u);
            TextView textView = c0267j3.f1625a;
            textView.setText(m2795h);
            textView.setVisibility(TextUtils.isEmpty(m2795h) ? 8 : 0);
        }
        if (c0267j3.f1626b != null) {
            String m2795h2 = m2795h(cursor, this.f1650w);
            if (m2795h2 != null) {
                if (this.f1647t == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f1643p.getTheme().resolveAttribute(AbstractC0075a.textColorSearchUrl, typedValue, true);
                    this.f1647t = this.f1643p.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(m2795h2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1647t, null), 0, m2795h2.length(), 33);
                str = spannableString;
            } else {
                str = m2795h(cursor, this.f1649v);
            }
            if (TextUtils.isEmpty(str)) {
                TextView textView2 = c0267j3.f1625a;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    c0267j3.f1625a.setMaxLines(2);
                }
            } else {
                TextView textView3 = c0267j3.f1625a;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    c0267j3.f1625a.setMaxLines(1);
                }
            }
            TextView textView4 = c0267j3.f1626b;
            textView4.setText(str);
            textView4.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        }
        ImageView imageView = c0267j3.f1627c;
        if (imageView != null) {
            int i3 = this.f1651x;
            if (i3 == -1) {
                m2797f = null;
            } else {
                m2797f = m2797f(cursor.getString(i3));
                if (m2797f == null) {
                    ComponentName searchActivity = this.f1642o.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.f1644q.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1644q.get(flattenToShortString);
                        m2797f = constantState == null ? null : constantState.newDrawable(this.f1643p.getResources());
                    } else {
                        PackageManager packageManager = this.f1643p.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            e.toString();
                        }
                        if (iconResource != 0) {
                            drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                searchActivity.flattenToShortString();
                            }
                            this.f1644q.put(flattenToShortString, drawable != null ? null : drawable.getConstantState());
                            m2797f = drawable;
                        }
                        drawable = null;
                        this.f1644q.put(flattenToShortString, drawable != null ? null : drawable.getConstantState());
                        m2797f = drawable;
                    }
                    if (m2797f == null) {
                        m2797f = this.f1643p.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(m2797f);
            if (m2797f == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                m2797f.setVisible(false, false);
                m2797f.setVisible(true, false);
            }
        }
        ImageView imageView2 = c0267j3.f1628d;
        if (imageView2 != null) {
            int i4 = this.f1652y;
            Drawable m2797f2 = i4 != -1 ? m2797f(cursor.getString(i4)) : null;
            imageView2.setImageDrawable(m2797f2);
            if (m2797f2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                m2797f2.setVisible(false, false);
                m2797f2.setVisible(true, false);
            }
        }
        int i5 = this.f1646s;
        if (i5 != 2 && (i5 != 1 || (i2 & 1) == 0)) {
            c0267j3.f1629e.setVisibility(8);
            return;
        }
        c0267j3.f1629e.setVisibility(0);
        c0267j3.f1629e.setTag(c0267j3.f1625a.getText());
        c0267j3.f1629e.setOnClickListener(this);
    }

    @Override // p010b.p062k.p063a.AbstractC0652c
    /* renamed from: b */
    public void mo2159b(Cursor cursor) {
        try {
            super.mo2159b(cursor);
            if (cursor != null) {
                this.f1648u = cursor.getColumnIndex("suggest_text_1");
                this.f1649v = cursor.getColumnIndex("suggest_text_2");
                this.f1650w = cursor.getColumnIndex("suggest_text_2_url");
                this.f1651x = cursor.getColumnIndex("suggest_icon_1");
                this.f1652y = cursor.getColumnIndex("suggest_icon_2");
                this.f1653z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p010b.p062k.p063a.AbstractC0652c
    /* renamed from: c */
    public CharSequence mo2158c(Cursor cursor) {
        String m2795h;
        String m2795h2;
        if (cursor == null) {
            return null;
        }
        String m2795h3 = m2795h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m2795h3 != null) {
            return m2795h3;
        }
        if (!this.f1642o.shouldRewriteQueryFromData() || (m2795h2 = m2795h(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
            if (!this.f1642o.shouldRewriteQueryFromText() || (m2795h = m2795h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                return null;
            }
            return m2795h;
        }
        return m2795h2;
    }

    @Override // p010b.p062k.p063a.AbstractC0652c
    /* renamed from: d */
    public View mo2157d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f1640m.inflate(this.f1638k, viewGroup, false);
        inflate.setTag(new C0267j3(inflate));
        ((ImageView) inflate.findViewById(AbstractC0080f.edit_query)).setImageResource(this.f1645r);
        return inflate;
    }

    /* renamed from: e */
    public Drawable m2798e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1643p.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m2797f(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f1643p.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1644q.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable m2430c = AbstractC0472e.m2430c(this.f1643p, parseInt);
                if (m2430c != null) {
                    this.f1644q.put(str2, m2430c.getConstantState());
                }
                return m2430c;
            } catch (Resources.NotFoundException unused) {
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f1644q.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e) {
                    String str3 = "Icon not found: " + parse + ", " + e.getMessage();
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = m2798e(parse);
                        if (drawable != null) {
                            this.f1644q.put(str, drawable.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = this.f1643p.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                    try {
                        openInputStream.close();
                    } catch (IOException unused4) {
                        String str4 = "Error closing icon stream for " + parse;
                    }
                    drawable = createFromStream;
                    if (drawable != null) {
                    }
                }
                String str32 = "Icon not found: " + parse + ", " + e.getMessage();
                if (drawable != null) {
                }
            }
        }
        return drawable;
    }

    /* renamed from: g */
    public Cursor m2796g(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1643p.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p010b.p062k.p063a.AbstractC0652c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.f1640m.inflate(this.f1639l, viewGroup, false);
            if (inflate != null) {
                ((C0267j3) inflate.getTag()).f1625a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // p010b.p062k.p063a.AbstractC0652c, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View mo2157d = mo2157d(this.f1643p, this.f2849d, viewGroup);
            ((C0267j3) mo2157d.getTag()).f1625a.setText(e.toString());
            return mo2157d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: i */
    public final void m2794i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2794i(this.f2849d);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2794i(this.f2849d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1641n.m3403x((CharSequence) tag);
        }
    }
}