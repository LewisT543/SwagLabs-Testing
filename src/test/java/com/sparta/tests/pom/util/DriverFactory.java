package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static String path = "src/test/resources/chromedriver.exe";
    public enum Browsers {CHROME, FIREFOX, SAFARI, OPERA, EDGE, INTERNET_EXPLORER}

    static DriverManager driverManager;

    public static DriverManager createDriver(Browsers type) {
        switch(type) {
            case CHROME -> driverManager = new ChromeDriverManager(path);
            default -> driverManager = new ChromeDriverManager(path);
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
