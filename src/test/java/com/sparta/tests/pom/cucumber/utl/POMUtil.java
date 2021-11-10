package com.sparta.tests.pom.cucumber.utl;

import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class POMUtil {

    public static void setDriverLocation(String path) {
        System.setProperty("webdriver.chrome.driver", path);
    }

    public static ChromeDriverService getChromeDriverService(String path) {
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
}
