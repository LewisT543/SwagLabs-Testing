package com.sparta.tests.pom.util;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;
import org.openqa.selenium.safari.SafariOptions;

import java.io.File;
import java.io.IOException;

public class SafariDriverManager extends DriverManager{

    private SafariDriverService service;
    private SafariOptions options;

    public SafariDriverManager(String path) {
        options = new SafariOptions();
        service = new SafariDriverService.Builder()
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
        driver = new SafariDriver(service, options);
    }
}