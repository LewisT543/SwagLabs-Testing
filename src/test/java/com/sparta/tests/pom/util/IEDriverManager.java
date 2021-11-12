package com.sparta.tests.pom.util;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.io.File;
import java.io.IOException;

public class IEDriverManager extends DriverManager{

    private InternetExplorerDriverService service;
    private InternetExplorerOptions options;

    public IEDriverManager(String path) {
        options = new InternetExplorerOptions();
        service = new InternetExplorerDriverService.Builder()
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
        driver = new InternetExplorerDriver(service, options);
    }

}
