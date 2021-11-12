package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
    public abstract void startService();
    public abstract void stopService();
    public abstract void createDriver();
    public abstract DriverManager setHeadless();
    public abstract DriverManager silentOutput();

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
}
