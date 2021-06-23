package OOP.Logger;

import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

enum DriverType {
    CHROME,
    FIREFOX
}


public class DriverManagerFactory {

    private static ChromeDriverManager chromeDriverManager;

    public static ChromeDriverManager getManager(DriverType type) {
        FirefoxDriverManager driverManager = null;
        switch (type) {
            case CHROME:
                chromeDriverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                //    driverManager = new FirefoxDriverManager.quite();
                break;

        }
        return chromeDriverManager;
    }

}