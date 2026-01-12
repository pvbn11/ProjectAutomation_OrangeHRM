package org.pvbn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    private WebDriver chromeDriveSelenium;
    private WebDriverWait waitDrive;

    //Selector
    private By headerDashboard = By.xpath("//h6[text()='Dashboard']");

    //Constructor
    public DashboardPage(WebDriver ChromeDriveSelenium){
        this.chromeDriveSelenium = ChromeDriveSelenium;
        this.waitDrive =  new WebDriverWait(ChromeDriveSelenium, Duration.ofSeconds(10));
    }

    //Action
    public String getHeaderText(){
        return waitDrive.until(ExpectedConditions.visibilityOfElementLocated(headerDashboard)).getText();
    }
}
