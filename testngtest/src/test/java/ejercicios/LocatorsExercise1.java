package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise1 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("https://www.mercadolibre.com.mx/");
        System.out.println("This is the Current URL of the page:" + " " + myDriver.getCurrentUrl());

        assert myDriver.getCurrentUrl().equals("https://www.mercadolibre.com.mx/"): "No es la página de Mercadolibre";

        WebElement searchBox = myDriver.findElement(By.name("as_word"));
        searchBox.sendKeys("Selenium");

        WebElement loginBtn = myDriver.findElement(By.className("nav-search-btn"));
        loginBtn.click();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        List<WebElement> findFrstProd = myDriver.findElements(By.className("main-title"));
        findFrstProd.get(0).click();

        System.out.println(findFrstProd.size());


        //WebElement findFirstProd = myDriver.findElement(By.className("lazy-load"));
        //findFirstProd.click();

        Thread.sleep(5000);

        myDriver.close();

    }
}
