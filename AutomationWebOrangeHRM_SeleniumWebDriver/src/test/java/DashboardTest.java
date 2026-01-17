import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pvbn.pages.DashboardPage;
import org.pvbn.pages.LoginPage;

public class DashboardTest extends BaseTest {
    @Test
    public void validateDashboard() throws InterruptedException {
        LoginPage loginPage = new LoginPage(ChromeDriveSelenium);
        loginPage.loginSteps("Admin","admin123");
        DashboardPage dashboardPage = new DashboardPage(ChromeDriveSelenium);
        String nameHeaderExpected = "Dashboard";
        String nameCardHeader = "Time at Work";
        String nameHeaderReal = dashboardPage.capturaElemento();
        String nameCardHeaderReal = dashboardPage.validateHeader();
        Assertions.assertEquals(nameCardHeader,nameCardHeaderReal, "El header no coincide con el valor esperado");
        Assertions.assertEquals(nameHeaderExpected,nameHeaderReal, "El header no coincide con el valor esperado");
        System.out.println("El valor de nombre de la cabecera del primer card es: " +nameCardHeaderReal);
        System.out.println("El valor de la cabecera de la pagina del dashboard es: " +nameHeaderReal);
    }


}
