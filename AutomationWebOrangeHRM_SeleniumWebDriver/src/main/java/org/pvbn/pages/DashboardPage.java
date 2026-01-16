package org.pvbn.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DashboardPage extends BasePage{

    //Locator
    private By headerDashboard = By.xpath("//h6[text()='Dashboard']");

    //Constructor
    public DashboardPage(WebDriver driverSelenium){
       super(driverSelenium);
    }

    //Metodos
    public String capturaElemento(){
        return visibleElement(headerDashboard);
    }
}
