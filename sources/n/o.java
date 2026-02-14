package n;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f1023a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1024b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1025c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1026d;

    public o(int i2, int i3, long j2, long j3) {
        this.f1023a = i2;
        this.f1024b = i3;
        this.f1025c = j2;
        this.f1026d = j3;
    }

    public static o a(File file) {
        Throwable th;
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            o oVar = new o(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return oVar;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1023a);
            dataOutputStream.writeInt(this.f1024b);
            dataOutputStream.writeLong(this.f1025c);
            dataOutputStream.writeLong(this.f1026d);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof o)) {
            o oVar = (o) obj;
            if (this.f1024b == oVar.f1024b && this.f1025c == oVar.f1025c && this.f1023a == oVar.f1023a && this.f1026d == oVar.f1026d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f1024b), Long.valueOf(this.f1025c), Integer.valueOf(this.f1023a), Long.valueOf(this.f1026d)});
    }
}
