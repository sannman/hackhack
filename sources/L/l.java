package L;

import C.b;
import D.u;
import M.n;
import java.util.HashMap;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f290a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f291b;

    /* renamed from: c  reason: collision with root package name */
    public final b f292c;

    /* renamed from: d  reason: collision with root package name */
    public k f293d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f294e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f295f = false;

    public l(F.b bVar, boolean z2) {
        b bVar2 = new b(bVar, "flutter/restoration", n.f331a);
        u uVar = new u(17, (Object) this);
        this.f292c = bVar2;
        this.f290a = z2;
        bVar2.h(uVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
