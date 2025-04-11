package singletonenum;

/**
 * @author cvoinea
 */
public enum AppMode {

    DEV("Development"),
    TEST("Test"),
    PROD("Productie");

    private final String numeMod;

    AppMode(String numeMod) {
        this.numeMod = numeMod;
    }
}
