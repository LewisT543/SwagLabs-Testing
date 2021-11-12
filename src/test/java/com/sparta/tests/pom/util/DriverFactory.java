package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static String path = "src/test/resources/";
    public enum Browsers {CHROME, FIREFOX, SAFARI, OPERA, EDGE, INTERNET_EXPLORER}

    static DriverManager driverManager;

    public static DriverManager createDriver(Browsers type) {
        switch(type) {
            case CHROME -> driverManager = new ChromeDriverManager(path + "chromedriver.exe");
            case FIREFOX -> driverManager = new FirefoxDriverManager(path + "geckodriver.exe");
            case SAFARI -> driverManager = new SafariDriverManager(path + "safaridriver.exe");
            case OPERA -> driverManager = new OperaDriverManager(path + "operadriver.exe");
            case EDGE -> driverManager = new EdgeDriverManager(path + "edgedriver.exe");
            case INTERNET_EXPLORER -> driverManager = new IEDriverManager(path + "internetexplorerdriver.exe");
        }
        return driverManager;
    }

    public static WebDriver getDriver() {
        return driverManager.getDriver();
    }

    public static void stopDriver() {
        driverManager.closeDriver();
        driverManager.stopService();
    }
}
