package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static String path = "src/test/resources/";
    public enum Browsers {CHROME, FIREFOX}

    static DriverManager driverManager;

    public static DriverManager createDriver(Browsers type) {
        switch(type) {
            case CHROME -> driverManager = new ChromeDriverManager(path + "chromedriver.exe");
            case FIREFOX -> driverManager = new FirefoxDriverManager(path + "geckodriver.exe");
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
