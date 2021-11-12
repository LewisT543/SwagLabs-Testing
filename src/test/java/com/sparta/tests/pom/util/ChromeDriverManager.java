package com.sparta.tests.pom.util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class ChromeDriverManager extends DriverManager{

    private ChromeDriverService service;
    private ChromeOptions options;

    public ChromeDriverManager(String path) {
        options = new ChromeOptions();
        service = new ChromeDriverService.Builder()
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
        driver = new ChromeDriver(service, options);
        driver.manage().deleteAllCookies();
    }

    public ChromeDriverManager setHeadless() {
        options.addArguments("headless");
        return this;
    }

    public ChromeDriverManager silentOutput() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        return this;
    }
}
