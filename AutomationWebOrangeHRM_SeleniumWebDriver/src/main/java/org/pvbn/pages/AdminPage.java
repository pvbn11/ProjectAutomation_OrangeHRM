package org.pvbn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    private WebDriver chromeDriveSelenium;
    private WebDriverWait waitDrive;

    //Locators
    private By comboboxUserRole = By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']");


    public AdminPage(WebDriver ChromeDriveSelenium) {
        this.chromeDriveSelenium = ChromeDriveSelenium;
        this.waitDrive = new WebDriverWait(ChromeDriveSelenium, Duration.ofSeconds(10));
    }
    //Acciones
    public void openComboBox(){
        chromeDriveSelenium.findElement(comboboxUserRole).click();
    }

}
