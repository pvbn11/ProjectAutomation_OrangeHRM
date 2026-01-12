package base;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {
    protected WebDriver ChromeDriveSelenium;

    @BeforeEach
    public void setup(){
        ChromeDriveSelenium = new ChromeDriver();
        ChromeDriveSelenium.manage().window().maximize();
        ChromeDriveSelenium.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterEach
    public void tearDown(){
        if(ChromeDriveSelenium != null){
            ChromeDriveSelenium.quit();
        }
    }

    public void takeScreenshot(String nombreCaptura) {
        // Formato de fecha para que los nombres de archivo sean únicos
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Convertir el driver a TakesScreenshot
        TakesScreenshot srcShot = (TakesScreenshot) ChromeDriveSelenium;

        // Crear el archivo temporal
        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);

        // Definir la ruta de destino (puedes crear una carpeta 'screenshots' en tu proyecto)
        File destFile = new File("target/screenshots/" + nombreCaptura + "_" + timestamp + ".png");

        try {
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Captura guardada en: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scrollFullPage() {
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) ChromeDriveSelenium;
        // Hace scroll hasta el final de la página
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
