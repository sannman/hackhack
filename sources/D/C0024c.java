package d;

import androidx.lifecycle.m;
import io.flutter.embedding.engine.renderer.b;
import java.util.Map;

/* renamed from: d.c  reason: case insensitive filesystem */
public final class C0024c implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final b f458a;

    /* renamed from: b  reason: collision with root package name */
    public final m f459b;

    /* renamed from: c  reason: collision with root package name */
    public C0024c f460c;

    /* renamed from: d  reason: collision with root package name */
    public C0024c f461d;

    public C0024c(b bVar, m mVar) {
        this.f458a = bVar;
        this.f459b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0024c)) {
            return false;
        }
        C0024c cVar = (C0024c) obj;
        if (!this.f458a.equals(cVar.f458a) || !this.f459b.equals(cVar.f459b)) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.f458a;
    }

    public final Object getValue() {
        return this.f459b;
    }

    public final int hashCode() {
        return this.f458a.hashCode() ^ this.f459b.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f458a + "=" + this.f459b;
    }
}
