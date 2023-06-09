package p010b.p082t;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

/* renamed from: b.t.r */
/* loaded from: classes.dex */
public class View$OnCreateContextMenuListenerC0892r implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: b */
    public final Preference f3497b;

    public View$OnCreateContextMenuListenerC0892r(Preference preference) {
        this.f3497b = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence mo3279j = this.f3497b.mo3279j();
        if (!this.f3497b.f598E || TextUtils.isEmpty(mo3279j)) {
            return;
        }
        contextMenu.setHeaderTitle(mo3279j);
        contextMenu.add(0, 0, 0, AbstractC0893r0.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence mo3279j = this.f3497b.mo3279j();
        ((ClipboardManager) this.f3497b.f609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", mo3279j));
        Context context = this.f3497b.f609b;
        Toast.makeText(context, context.getString(AbstractC0893r0.preference_copied, mo3279j), 0).show();
        return true;
    }
}