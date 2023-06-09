package p093c.p097b.p108i0;

import android.os.Parcel;
import android.os.Parcelable;
import com.anysoftkeyboard.p180ui.SendBugReportUiActivity;

/* renamed from: c.b.i0.n */
/* loaded from: classes.dex */
public class C1253n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new SendBugReportUiActivity.BugReportDetails(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new SendBugReportUiActivity.BugReportDetails[i];
    }
}