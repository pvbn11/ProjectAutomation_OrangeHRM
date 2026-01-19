package org.pvbn.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{

    //Locator
    private By headerDashboard = By.xpath("//h6[text()='Dashboard']");
    private By footerNameWeb = By.xpath("//p[text()='OrangeHRM OS 5.8']");

    //Constructor
    public DashboardPage(WebDriver driverSelenium){
       super(driverSelenium);
    }

    //Metodos
    public String capturaElemento(){
        return visibleElement(headerDashboard);
    }

    public String capturaFooter(){
        return visibleElement(footerNameWeb);
    }


    public String getCardHeaderName (String cardName){
        By dinamicCardLocatorDashboard = By.xpath("//p[text()='" + cardName + "']");
        return visibleElement(dinamicCardLocatorDashboard);
    }
}
