package B;

import java.io.File;
import java.io.FilenameFilter;

public final class d implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6a;

    public d(String str) {
        this.f6a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f6a);
    }
}
