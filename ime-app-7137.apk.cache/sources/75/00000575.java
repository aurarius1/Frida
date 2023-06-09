package p093c.p097b.p108i0.p110p.p111a2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;

/* renamed from: c.b.i0.p.a2.a */
/* loaded from: classes.dex */
public class View$OnClickListenerC1265a extends FrameLayout implements View.OnClickListener {

    /* renamed from: b */
    public View f4462b;

    public View$OnClickListenerC1265a(Context context, AttributeSet attributeSet) {
        super(context, null);
        FrameLayout.inflate(context, R.layout.addon_store_search_view, this);
        setOnClickListener(this);
        View findViewById = findViewById(R.id.no_store_found_error);
        this.f4462b = findViewById;
        findViewById.setVisibility(8);
    }

    /* renamed from: a */
    public static boolean m1137a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://search?q=AnySoftKeyboard " + str));
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m1137a(getContext(), (String) getTag())) {
            return;
        }
        this.f4462b.setVisibility(0);
    }

    public void setTitle(CharSequence charSequence) {
        ((TextView) findViewById(R.id.cta_title)).setText(charSequence);
    }
}