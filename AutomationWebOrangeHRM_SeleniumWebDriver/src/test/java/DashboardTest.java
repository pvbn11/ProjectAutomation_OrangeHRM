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

        //Lista de headers esperados
        String[] expectedHeaders = {
                "Time at Work",
                "My Actions",
                "Quick Launch",
                "Buzz Latest Posts",
                "Employees on Leave Today",
                "Employee Distribution by Sub Unit",
                "Employee Distribution by Location"
        };
        String titleDashboard = "Dashboard";
        String footerDashboard = "OrangeHRM OS 5.8";


        String titleDashboardReal = dashboardPage.capturaElemento();
        String footerDashboardReal = dashboardPage.capturaFooter();

        Assertions.assertEquals(titleDashboard,titleDashboardReal, "El header no coincide con el valor esperado");
        Assertions.assertEquals(footerDashboard,footerDashboardReal, "El footer no coincide con el valor esperado");
        System.out.println("El titulo de la página Dashboard es: " + titleDashboardReal);
        System.out.println("El footer de la página Dashboard es: " + footerDashboardReal);

        for (String cardName : expectedHeaders){
            String actualText = dashboardPage.getCardHeaderName(cardName);
            System.out.println("Validando card: " + actualText);
            Assertions.assertEquals(cardName, actualText, "El card " + cardName + " no se encontró");
        }

    }


}
