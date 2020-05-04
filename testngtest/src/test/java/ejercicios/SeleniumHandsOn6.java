package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn6 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://mercadolibre.com.mx");
        assert driver.getCurrentUrl().equals("http://www.mercadolibre.com.mx"): "Pagina Correcta";

        // Llamando Elementos
        WebElement searchba = driver.findElement(By.name("as_word"));
        WebElement searchbutton = driver.findElement(By.className("nav-search-btn"));
       // WebElement searchcpbutton = driver.findElement(By.className("andes-button__content"));
        //WebElement searchtext = driver.findElement(By.partialLinkText("Ingresar"));
       // WebElement sarchsub = driver.findElement(By.className("andes-button__content"));
        List<WebElement> result_lista;
        WebElement primer_result;



        searchba.sendKeys("Selenium");
        searchbutton.click();
       // Thread.sleep(1000);
       // searchcpbutton.click();
        //searchtext.sendKeys("44230");
        //sarchsub.click();

        result_lista = driver.findElements(By.className("main-title"));
        primer_result = result_lista.get(0);
        primer_result.click();
        Thread.sleep(3000);
        driver.close();


    }


}
