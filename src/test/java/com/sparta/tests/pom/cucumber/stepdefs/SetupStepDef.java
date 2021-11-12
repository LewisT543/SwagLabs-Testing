package com.sparta.tests.pom.cucumber.stepdefs;

import com.sparta.tests.pom.util.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class SetupStepDef {

    @Before(order = 0)
    public void init() {
        WebDriver webDriver = DriverFactory.createDriver(DriverFactory.Browsers.CHROME)
                .useChromeOptions()
                .setHeadless()
                .setSilentOutput()
                .getDriver();
        webDriver.manage().deleteAllCookies();
    }

    @After
    public void teardown() {
        DriverFactory.stopDriver();
    }
}
