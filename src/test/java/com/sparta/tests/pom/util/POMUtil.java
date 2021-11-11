package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class POMUtil {

    private static WebDriver webDriver;

    public static void setDriverLocation(String path) {
        System.setProperty("webdriver.chrome.driver", path);
    }

    public static ChromeDriverService getChromeDriverService(String path) {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        var service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(path))
                .usingAnyFreePort()
                .build();

        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return service;
    }

    public static WebDriver newChromeDriver() {
        webDriver = new ChromeDriver();
        return webDriver;
    }

    public static WebDriver newChromeDriver(ChromeDriverService service) {
        webDriver = new ChromeDriver(service);
        return webDriver;
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }
}
