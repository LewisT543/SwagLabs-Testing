package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
    public abstract void startService();
    public abstract void stopService();
    public abstract void createDriver();

    public void closeDriver() {
        if (null != driver) {
            driver.close();
            driver = null;
        }

    }

    public WebDriver getDriver() {
        if (null == driver) {
            startService();
            createDriver();
        }
        return driver;
    }


    public ChromeDriverManager useChromeOptions() {
        return (ChromeDriverManager) this;
    }

    public FirefoxDriverManager useFirefoxOptions() {
        return (FirefoxDriverManager) this;
    }

}
