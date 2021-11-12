package com.sparta.tests.pom.util;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaDriverService;
import org.openqa.selenium.opera.OperaOptions;

import java.io.File;
import java.io.IOException;

public class OperaDriverManager extends DriverManager{

    private OperaDriverService service;
    private OperaOptions options;

    public OperaDriverManager(String path) {
        options = new OperaOptions();
        service = new OperaDriverService.Builder()
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
        driver = new OperaDriver(service, options);
    }

    public OperaDriverManager setHeadless() {
        options.addArguments("headless");
        return this;
    }

    public OperaDriverManager silentOutput() {
        System.setProperty("webdriver.opera.silentOutput", "true");
        return this;
    }
}