package L;

public enum e {
    ;

    public static e a(String str) {
        for (e eVar : values()) {
            eVar.getClass();
            if ("text/plain".equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
    }
}
