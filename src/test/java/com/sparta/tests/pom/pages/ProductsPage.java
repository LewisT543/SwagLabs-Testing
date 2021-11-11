package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsPage {
    private final WebDriver webDriver;
    public ProductsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // Add item to cart
    By addBackpackToCartButton = new By.ById("add-to-cart-sauce-labs-backpack");
    By addBikeLightToCartButton = new By.ById("add-to-cart-sauce-labs-bike-light");
    By addBoltTShirtToCartButton = new By.ById("add-to-cart-sauce-labs-bolt-t-shirt");
    By addFleeceJacketToCartButton = new By.ById("add-to-cart-sauce-labs-fleece-jacket");
    By addOnesieToCartButton = new By.ById("add-to-cart-sauce-labs-onesie");
    By addRedTShirtToCartButton = new By.ById("add-to-cart-test.allthethings()-t-shirt-(red)");

    // Remove item from cart
    By removeBackpackFromCartButton = new By.ById("remove-sauce-labs-backpack");
    By removeBikeLightFromCartButton = new By.ById("remove-sauce-labs-bike-light");
    By removeBoltTShirtFromCartButton = new By.ById("remove-sauce-labs-bolt-t-shirt");
    By removeFleeceJacketFromCartButton = new By.ById("remove-sauce-labs-fleece-jacket");
    By removeOnesieFromCartButton = new By.ById("remove-sauce-labs-onesie");
    By removeRedTShirtFromCartButton = new By.ById("remove-test.allthethings()-t-shirt-(red)");

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

    // Cart button
    By cartButton = new By.ById("shopping_cart_container");
    By cartBadge = new By.ByClassName("shopping_cart_badge");

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
    public void clickRemoveBackpackFromCart() {
        webDriver.findElement(removeBackpackFromCartButton).click();
    }

    public void clickRemoveBikeLightFromCart() {
        webDriver.findElement(removeBikeLightFromCartButton).click();
    }

    public void clickRemoveBoltTShirtFromCart() {
        webDriver.findElement(removeBoltTShirtFromCartButton).click();
    }

    public void clickRemoveFleeceJacketFromCart() {
        webDriver.findElement(removeFleeceJacketFromCartButton).click();
    }

    public void clickRemoveOnesieFromCart() {
        webDriver.findElement(removeOnesieFromCartButton).click();
    }

    public void clickRemoveRedTShirtFromCart() {
        webDriver.findElement(removeRedTShirtFromCartButton).click();
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

    // Cart button click
    public void clickCartButton() {
        webDriver.findElement(cartButton).click();
    }

    // Get cart badge number
    public int getCartBadgeNumber() {
        WebElement badgeNumElement;
        try {
            badgeNumElement = webDriver.findElement(cartBadge);
        } catch (NoSuchElementException nsee) {
            return 0;
        }
        return Integer.parseInt(badgeNumElement.getText());
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

    public boolean itemsAreSortedPriceLH() {
        List<String> itemPrices = webDriver.findElements(inventoryPrices)
                .stream()
                .map(WebElement::getText)
                .map(e -> e.substring(1))
                .collect(Collectors.toList());
        return itemPrices.equals(itemPrices.stream().sorted().collect(Collectors.toList()));
    }

    public boolean itemsAreSortedPriceHL() {
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
    public boolean removeBackpackFromCartButtonIsPresent() {
        return webDriver.findElements(removeBackpackFromCartButton).size() != 0;
    }

    public boolean removeBikeLightFromCartButtonIsPresent() {
        return webDriver.findElements(removeBikeLightFromCartButton).size() != 0;
    }

    public boolean removeBoltTShirtFromCartButtonIsPresent() {
        return webDriver.findElements(removeBoltTShirtFromCartButton).size() != 0;
    }

    public boolean removeFleeceJacketFromCartButtonIsPresent() {
        return webDriver.findElements(removeFleeceJacketFromCartButton).size() != 0;
    }

    public boolean removeOnesieFromCartButtonIsPresent() {
        return webDriver.findElements(removeOnesieFromCartButton).size() != 0;
    }

    public boolean removeRedTShirtFromCartButtonIsPresent() {
        return webDriver.findElements(removeRedTShirtFromCartButton).size() != 0;
    }
}
