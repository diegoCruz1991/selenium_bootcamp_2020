package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.mercadolibre.com.mx/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchBoxElement = driver.findElement(By.name("as_word"));

        searchBoxElement.sendKeys("PS4");

        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.and(ExpectedConditions.presenceOfElementLocated(By.className("nav-search-btn")),
                ExpectedConditions.elementToBeClickable(By.className("nav-search-btn"))));

        WebElement searchBtnElement = driver.findElement(By.className("nav-search-btn"));

        searchBtnElement.click();

        //Protip: Usar siempre findElements para buscar un elemento en la pagina.
        List<WebElement> firstProductElementList = driver.findElements(By.className("main-title"));

        if (firstProductElementList.isEmpty()) {
            //TODO: Decidir flujo si no encontro el elemento
        }




        driver.close();

        driver.quit();
    }
}
