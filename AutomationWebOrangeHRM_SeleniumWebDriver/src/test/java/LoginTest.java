import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.pvbn.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginSuccessful() throws InterruptedException {

        LoginPage loginPage = new LoginPage(ChromeDriveSelenium);
        //DashboardPage dasbhboardPage = new DashboardPage(ChromeDriveSelenium);

        loginPage.loginSteps("Admin","admin123");

        Thread.sleep(5000); // Pausa de 3 segundos para que carguen los widgets
        takeScreenshot("CP01_loginSuccessful1"); // Evidencia final

        scrollFullPage();
        takeScreenshot("CP01_loginSuccessful2"); // Evidencia final despues de scrollear
    }
}
