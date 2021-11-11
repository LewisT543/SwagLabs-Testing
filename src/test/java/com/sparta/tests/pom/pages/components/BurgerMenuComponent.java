package com.sparta.tests.pom.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BurgerMenuComponent {
    private final WebDriver webDriver;
    public BurgerMenuComponent(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // Burger menu buttons
    By menuButton = new By.ById("react-burger-menu-btn");
    By inventorySidebarButton = new By.ById("inventory_sidebar_link");
    By aboutSidebarButton = new By.ById("about_sidebar_link");
    By logoutSidebarButton = new By.ById("logout_sidebar_link");
    By closeMenuButton = new By.ById("react-burger-cross-btn");

    // Burger menu is present
    public boolean burgerMenuIsPresent() {
        return webDriver.findElements(menuButton).size() != 0;
    }

    // Burger menu clicks
    public void clickMenuButton() {
        webDriver.findElement(menuButton).click();
    }

    public void clickInventorySidebarButton() {
        webDriver.findElement(inventorySidebarButton).click();
    }

    public void clickAboutSidebarButton() {
        webDriver.findElement(aboutSidebarButton).click();
    }

    public void clickLogoutSidebarButton() {
        webDriver.findElement(logoutSidebarButton).click();
    }

    public void clickCloseMenuButton() {
        webDriver.findElement(closeMenuButton).click();
    }
}
