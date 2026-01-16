import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pvbn.pages.DashboardPage;
import org.pvbn.pages.LoginPage;

public class DashboardTest extends BaseTest {
    @Test
    public void loginSuccessful() throws InterruptedException {
        LoginPage loginPage = new LoginPage(ChromeDriveSelenium);
        loginPage.loginSteps("Admin","admin123");
        DashboardPage dashboardPage = new DashboardPage(ChromeDriveSelenium);
        String nameHeaderExpected = "Dashboard";
        String nameHeaderReal = dashboardPage.capturaElemento();
        Assertions.assertEquals(nameHeaderExpected,nameHeaderReal, "El header no coincide con el valor esperado");
    }


}
