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
    protected void startService() {
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void stopService() {
            service.stop();
    }

    @Override
    protected void createDriver() {
        driver = new ChromeDriver(service, options);
    }

    @Override
    protected void setHeadless() {
        options.addArguments("headless");
    }

    @Override
    protected void silentOutput() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
    }
}
