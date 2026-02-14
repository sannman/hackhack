package f0;

import d0.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends e0.a {
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
