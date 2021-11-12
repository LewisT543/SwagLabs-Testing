package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

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

    public SafariDriverManager useSafariOptions() {
        return (SafariDriverManager) this;
    }

    public OperaDriverManager useOperaOptions() {
        return (OperaDriverManager) this;
    }

    public EdgeDriverManager useEdgeOptions() {
        return (EdgeDriverManager) this;
    }

    public IEDriverManager useIEOptions() {
        return (IEDriverManager) this;
    }

}
