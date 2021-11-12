package com.sparta.tests.pom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        webDriver = new ChromeDriver(service,chromeOptions);
        webDriver
                .manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return webDriver;
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }
}
