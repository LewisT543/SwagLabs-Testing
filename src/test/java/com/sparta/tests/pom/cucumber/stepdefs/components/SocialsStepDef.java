package com.sparta.tests.pom.cucumber.stepdefs.components;

import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.pages.components.SocialButtonsComponent;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SocialsStepDef {

    private WebDriver webDriver;
    private SocialButtonsComponent socialButtonsComponent;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        socialButtonsComponent = new SocialButtonsComponent(webDriver);
    }

    @When("I go to the bottom of the page")
    public void iGoToTheBottomOfThePage() {
        ((JavascriptExecutor) webDriver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Then("I should see a twitter social button")
    public void iShouldSeeATwitterSocialButton() {
        Assertions.assertTrue(socialButtonsComponent.twitterButtonIsPresent());
    }

    @Then("I should see a facebook social button")
    public void iShouldSeeAFacebookSocialButton() {
        Assertions.assertTrue(socialButtonsComponent.facebookButtonIsPresent());
    }

    @Then("I should see a linkedin social button")
    public void iShouldSeeALinkedinSocialButton() {
        Assertions.assertTrue(socialButtonsComponent.linkedinButtonIsPresent());
    }

    @When("I click on the twitter social button")
    public void iClickOnTheTwitterSocialButton() {
        socialButtonsComponent.clickTwitterButton();
    }

    @Then("I should be taken to twitter")
    public void iShouldBeTakenToTwitter() {
        ArrayList<String> tabs2 = new ArrayList<> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(1));
        Assertions.assertEquals("https://twitter.com/saucelabs", webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.switchTo().window(tabs2.get(0));
    }

    @When("I click on the facebook social button")
    public void iClickOnTheFacebookSocialButton() {
        socialButtonsComponent.clickFacebookButton();
    }

    @Then("I should be taken to facebook")
    public void iShouldBeTakenToFacebook() {
        ArrayList<String> tabs2 = new ArrayList<> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(1));
        Assertions.assertEquals("https://www.facebook.com/saucelabs", webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.switchTo().window(tabs2.get(0));
    }

    @When("I click on the linkedin social button")
    public void iClickOnTheLinkedinSocialButton() {
        socialButtonsComponent.clickLinkedinButton();
    }

    @Then("I should be taken to linkedin")
    public void iShouldBeTakenToLinkedin() {
        ArrayList<String> tabs2 = new ArrayList<> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(1));
        Assertions.assertEquals("https://www.linkedin.com/company/sauce-labs/", webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.switchTo().window(tabs2.get(0));
    }
}
