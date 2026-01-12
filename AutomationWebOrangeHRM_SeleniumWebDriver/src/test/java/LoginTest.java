import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pvbn.pages.DashboardPage;
import org.pvbn.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginSuccessful() throws InterruptedException {
        LoginPage loginPage = new LoginPage(ChromeDriveSelenium);
        loginPage.loginSteps("Admin","admin123");
        DashboardPage dasbhboardPage = new DashboardPage(ChromeDriveSelenium);
        String headerTitle = dasbhboardPage.getHeaderText();
        Thread.sleep(5000); // Pausa de 3 segundos para que carguen los widgets
        takeScreenshot("CP_loginSuccessful"); // Evidencia final
        Assertions.assertEquals("Dashboard",headerTitle);
        scrollFullPage(); // Baja hasta el final
        takeScreenshot("Dashboard_Con_Scroll");
        //try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
