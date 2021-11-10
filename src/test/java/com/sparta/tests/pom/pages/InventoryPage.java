package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryPage {
    private final WebDriver webDriver;
    // Add item to cart
    By addBackpackToCartButton = new By.ById("add-to-cart-sauce-labs-backpack");
    By addBikeLightToCartButton = new By.ById("add-to-cart-sauce-labs-bike-light");
    By addBoltTShirtToCartButton = new By.ById("add-to-cart-sauce-labs-bolt-t-shirt");
    By addFleeceJacketToCartButton = new By.ById("add-to-cart-sauce-labs-fleece-jacket");
    By addOnesieToCartButton = new By.ById("add-to-cart-sauce-labs-onesie");
    By addRedTShirtToCartButton = new By.ById("add-to-cart-test.allthethings()-t-shirt-(red)");

    // Remove item from cart
    By removeBackpackToCartButton = new By.ById("remove-to-cart-sauce-labs-backpack");
    By removeBikeLightToCartButton = new By.ById("remove-to-cart-sauce-labs-bike-light");
    By removeBoltTShirtToCartButton = new By.ById("remove-to-cart-sauce-labs-bolt-t-shirt");
    By removeFleeceJacketToCartButton = new By.ById("remove-to-cart-sauce-labs-fleece-jacket");
    By removeOnesieToCartButton = new By.ById("remove-to-cart-sauce-labs-onesie");
    By removeRedTShirtToCartButton = new By.ById("remove-to-cart-test.allthethings()-t-shirt-(red)");

    // Item images
    By backPackImage = new By.ById("item_4_img_link");
    By bikeLightImage = new By.ById("item_0_img_link");
    By boltTShirtImage = new By.ById("item_1_img_link");
    By fleeceJacketImage = new By.ById("item_5_img_link");
    By onesieImage = new By.ById("item_2_img_link");
    By redTShirtImage = new By.ById("item_3_img_link");

    // Item name links
    By backPackNameLink = new By.ById("item_4_title_link");
    By bikeLightNameLink = new By.ById("item_0_title_link");
    By boltTShirtNameLink = new By.ById("item_1_title_link");
    By fleeceJacketNameLink = new By.ById("item_5_title_link");
    By onesieNameLink = new By.ById("item_2_title_link");
    By redTShirtNameLink = new By.ById("item_3_title_link");

    // Burger menu buttons
    By menuButton = new By.ById("react-burger-menu-btn");
    By inventorySidebarButton = new By.ById("inventory_sidebar_link");
    By aboutSidebarButton = new By.ById("about_sidebar_link");
    By logoutSidebarButton = new By.ById("logout_sidebar_link");
    By closeMenuButton = new By.ById("react-burger-cross-btn");

    // Cart button
    By cartButton = new By.ById("shopping_cart_container");

    // Socials buttons
    By twitterButton = new By.ByClassName("social_twitter");
    By facebookButton = new By.ByClassName("social_facebook");
    By linkedinButton = new By.ByClassName("social_linkedin");

    // Filter buttons
    By productSortButton = new By.ByClassName("product_sort_container");
    By productSortNameAZ = new By.ByCssSelector("[value=\"az\"]");
    By productSortNameZA = new By.ByCssSelector("[value=\"za\"]");
    By productSortPriceLH = new By.ByCssSelector("[value=\"lohi\"]");
    By productSortPriceHL = new By.ByCssSelector("[value=\"hilo\"]");

    // All inventory item titles
    By inventoryItems = new By.ByClassName("inventory_item_name");

    // All inventory item prices
    By inventoryPrices = new By.ByClassName("inventory_item_price");

    public InventoryPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // Add items to cart clicks
    public void clickAddBackpackToCart() {
        webDriver.findElement(addBackpackToCartButton).click();
    }

    public void clickAddBikeLightToCartButton() {
        webDriver.findElement(addBikeLightToCartButton).click();
    }

    public void clickAddBoltTShirtToCartButton() {
        webDriver.findElement(addBoltTShirtToCartButton).click();
    }

    public void clickAddFleeceJacketToCartButton() {
        webDriver.findElement(addFleeceJacketToCartButton).click();
    }

    public void clickAddOnesieToCartButton() {
        webDriver.findElement(addOnesieToCartButton).click();
    }

    public void clickAddRedTShirtToCartButton() {
        webDriver.findElement(addRedTShirtToCartButton).click();
    }

    // Remove items from cart clicks
    public void clickRemoveBackpackToCart() {
        webDriver.findElement(removeBackpackToCartButton).click();
    }

    public void clickRemoveBikeLightToCartButton() {
        webDriver.findElement(removeBikeLightToCartButton).click();
    }

    public void clickRemoveBoltTShirtToCartButton() {
        webDriver.findElement(removeBoltTShirtToCartButton).click();
    }

    public void clickRemoveFleeceJacketToCartButton() {
        webDriver.findElement(removeFleeceJacketToCartButton).click();
    }

    public void clickRemoveOnesieToCartButton() {
        webDriver.findElement(removeOnesieToCartButton).click();
    }

    public void clickRemoveRedTShirtToCartButton() {
        webDriver.findElement(removeRedTShirtToCartButton).click();
    }

    // Item images
    public void clickBackPackImage() {
        webDriver.findElement(backPackImage).click();
    }

    public void clickBikeLightImage() {
        webDriver.findElement(bikeLightImage).click();
    }

    public void clickBoltTShirtImage() {
        webDriver.findElement(boltTShirtImage).click();
    }

    public void clickFleeceJacketImage() {
        webDriver.findElement(fleeceJacketImage).click();
    }

    public void clickOnesieImage() {
        webDriver.findElement(onesieImage).click();
    }

    public void clickRedTShirtImage() {
        webDriver.findElement(redTShirtImage).click();
    }

    // Item nameLinks
    public void clickBackPackNameLink() {
        webDriver.findElement(backPackNameLink).click();
    }

    public void clickBikeLightNameLink() {
        webDriver.findElement(bikeLightNameLink).click();
    }

    public void clickBoltTShirtNameLink() {
        webDriver.findElement(boltTShirtNameLink).click();
    }

    public void clickFleeceJacketNameLink() {
        webDriver.findElement(fleeceJacketNameLink).click();
    }

    public void clickOnesieNameLink() {
        webDriver.findElement(onesieNameLink).click();
    }

    public void clickRedTShirtNameLink() {
        webDriver.findElement(redTShirtNameLink).click();
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

    // Cart button click
    public void clickCartButton() {
        webDriver.findElement(cartButton).click();
    }

    // Socials buttons clicks
    public void clickTwitterButton() {
        webDriver.findElement(twitterButton).click();
    }

    public void clickFacebookButton() {
        webDriver.findElement(facebookButton).click();
    }

    public void clickLinkedInButton() {
        webDriver.findElement(linkedinButton).click();
    }

    // Filter buttons clicks
    public void clickProductSortButton() {
        webDriver.findElement(productSortButton).click();
    }

    public void clickProductSortNameAZ() {
        webDriver.findElement(productSortNameAZ).click();
    }

    public void clickProductSortNameZA() {
        webDriver.findElement(productSortNameZA).click();
    }

    public void clickProductSortPriceLH() {
        webDriver.findElement(productSortPriceLH).click();
    }

    public void clickProductSortPriceHL() {
        webDriver.findElement(productSortPriceHL).click();
    }

    // isSorted
    public boolean itemsAreSortedNameAZ() {
        List<String> itemNames = webDriver.findElements(inventoryItems)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return itemNames.equals(itemNames.stream().sorted().collect(Collectors.toList()));
    }

    public boolean itemsAreSortedNameZA() {
        List<String> itemNames = webDriver.findElements(inventoryItems)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return itemNames.equals(itemNames.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }

    public boolean itemsAreSortedPriceLoHi() {
        List<String> itemPrices = webDriver.findElements(inventoryPrices)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return itemPrices.equals(itemPrices.stream().sorted().collect(Collectors.toList()));
    }

    public boolean itemsAreSortedPriceHiLo() {
        List<String> itemPrices = webDriver.findElements(inventoryPrices)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return itemPrices.equals(itemPrices.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }

    // Add to cart button is present
    public boolean addBackpackToCartButtonIsPresent() {
        return webDriver.findElements(addBackpackToCartButton).size() != 0;
    }

    public boolean addBikeLightToCartButtonIsPresent() {
        return webDriver.findElements(addBikeLightToCartButton).size() != 0;
    }

    public boolean addBoltTShirtToCartButtonIsPresent() {
        return webDriver.findElements(addBoltTShirtToCartButton).size() != 0;
    }

    public boolean addFleeceJacketToCartButtonIsPresent() {
        return webDriver.findElements(addFleeceJacketToCartButton).size() != 0;
    }

    public boolean addOnesieToCartButtonIsPresent() {
        return webDriver.findElements(addOnesieToCartButton).size() != 0;
    }

    public boolean addRedTShirtToCartButtonIsPresent() {
        return webDriver.findElements(addRedTShirtToCartButton).size() != 0;
    }

    // Remove from cart button is present
    public boolean removeBackpackToCartButtonIsPresent() {
        return webDriver.findElements(removeBackpackToCartButton).size() != 0;
    }

    public boolean removeBikeLightToCartButtonIsPresent() {
        return webDriver.findElements(removeBikeLightToCartButton).size() != 0;
    }

    public boolean removeBoltTShirtToCartButtonIsPresent() {
        return webDriver.findElements(removeBoltTShirtToCartButton).size() != 0;
    }

    public boolean removeFleeceJacketToCartButtonIsPresent() {
        return webDriver.findElements(removeFleeceJacketToCartButton).size() != 0;
    }

    public boolean removeOnesieToCartButtonIsPresent() {
        return webDriver.findElements(removeOnesieToCartButton).size() != 0;
    }

    public boolean removeRedTShirtToCartButtonIsPresent() {
        return webDriver.findElements(removeRedTShirtToCartButton).size() != 0;
    }
}
