package com.sparta.tests.pom.util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.io.IOException;

public class FirefoxDriverManager extends DriverManager{

    private GeckoDriverService service;
    private FirefoxOptions options;

    public FirefoxDriverManager(String path) {
        options = new FirefoxOptions();
            service = new GeckoDriverService.Builder()
                    .usingDriverExecutable(new File(path))
                    .usingAnyFreePort()
                    .build();
    }

    @Override
    public void startService() {
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stopService() {
            service.stop();
    }

    @Override
    public void createDriver() {
        driver = new FirefoxDriver(service, options);
    }

    public FirefoxDriverManager setHeadless() {
        options.addArguments("headless");
        return this;
    }

    public FirefoxDriverManager silentOutput() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        return this;
    }
}
