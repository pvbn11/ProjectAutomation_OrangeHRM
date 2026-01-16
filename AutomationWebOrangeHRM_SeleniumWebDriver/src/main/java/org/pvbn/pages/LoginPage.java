package org.pvbn.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    //Locators
    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//button[text()=' Login ']");

    //Constructor
    public LoginPage(WebDriver driverSelenium) {
        super(driverSelenium);
    }

    //Metodos

    public void loginSteps (String user, String password){
        sendKeysElement(usernameInput, user);
        sendKeysElement(passwordInput, password);
        clickElement(loginButton);
    }
}
