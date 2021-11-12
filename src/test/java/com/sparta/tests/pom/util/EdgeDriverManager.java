package com.sparta.tests.pom.util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.io.IOException;

public class EdgeDriverManager extends DriverManager{

    private EdgeDriverService service;
    private EdgeOptions options;

    public EdgeDriverManager(String path) {
        options = new EdgeOptions();
        service = new EdgeDriverService.Builder()
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
        driver = new EdgeDriver(service, options);
    }

}
