package singletonenum;

/**
 * @author cvoinea
 *
 * singleton implementation using enum
 */
public enum AppConfig {

    INSTANCE;

    private AppMode mode;
    private String versiune;
    private boolean enableLogging;

//    AppConfig(AppMode mode, String versiune, boolean enableLogging) {
//        this.mode = mode;
//        this.versiune = versiune;
//        this.enableLogging = enableLogging;
//    }


    public AppMode getMode() {
        return mode;
    }

    public void setMode(AppMode mode) {
        this.mode = mode;
    }

    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public boolean isEnableLogging() {
        return enableLogging;
    }

    public void setEnableLogging(boolean enableLogging) {
        this.enableLogging = enableLogging;
    }
}
