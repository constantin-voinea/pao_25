package singletonenum;

/**
 * @author cvoinea
 */
public class Test {
    public static void main(String[] args) {

        AppConfig devConfig = AppConfig.INSTANCE;
        devConfig.setMode(AppMode.DEV);
        devConfig.setVersiune("0.1.0");
        devConfig.setEnableLogging(true);
        printAppConfig(devConfig);

        AppConfig.INSTANCE.setMode(AppMode.PROD);
        AppConfig.INSTANCE.setEnableLogging(false);
        printAppConfig(AppConfig.INSTANCE);
    }


    private static void printAppConfig(AppConfig appConfig) {
        System.out.println("App Config: " + appConfig.getMode()
                + "\n Versiune: " + appConfig.getVersiune()
                + "\n Logging enabled: " + appConfig.isEnableLogging());
    }
}
