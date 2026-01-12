package org.pvbn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginPage {
    private WebDriver chromeDriveSelenium;
    private WebDriverWait waitDrive;

    //Locators
    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//button[text()=' Login ']");

    //Constructor: recibe el driver desde el test

    public LoginPage(WebDriver ChromeDriveSelenium) {
        this.chromeDriveSelenium = ChromeDriveSelenium;
        this.waitDrive = new WebDriverWait(ChromeDriveSelenium, Duration.ofSeconds(10));
    }

    //Acciones

    public void enterUser (String user) {
        waitDrive.until(ExpectedConditions.visibilityOfElementLocated(usernameInput)).sendKeys(user);
    }

    public void enterPassword (String password){
        waitDrive.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(password);
    }

    public void loginUser (){
        waitDrive.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    //Metodos

    public void loginSteps (String user, String password){
        enterUser(user);
        enterPassword(password);
        loginUser();

    }
}
