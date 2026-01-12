import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    @Test
    public void navigateToGoogle() throws InterruptedException {
        WebDriver driverGoogleChrome = new ChromeDriver();

        driverGoogleChrome.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driverGoogleChrome.findElement(By.name("username")).sendKeys("Admin");
        driverGoogleChrome.findElement(By.name("password")).sendKeys("admin123");
        //driverGoogleChrome.findElement(By.cssSelector("button[type='submit']")).click();
        driverGoogleChrome.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(5000);
        driverGoogleChrome.quit();
    }
}
