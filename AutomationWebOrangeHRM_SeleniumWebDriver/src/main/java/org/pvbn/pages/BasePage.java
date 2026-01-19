package org.pvbn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected WebDriver driverSelenium;
    protected WebDriverWait waitSelenium;

    public BasePage(WebDriver driverSelenium){
        this.driverSelenium = driverSelenium;
        this.waitSelenium = new WebDriverWait(driverSelenium, Duration.ofSeconds(10));
    }

    protected String visibleElement (By locator) {
        return waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    protected void sendKeysElement (By locator, String text) {
        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);

    }

    protected void clickElement (By locator) {
        waitSelenium.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

}
