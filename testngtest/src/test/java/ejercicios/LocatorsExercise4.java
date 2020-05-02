package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {

    public static void main(String[] args) throws InterruptedException {
        File chromeFilePath = new File("src/test/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Other way to execute the driver
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver myDriver = new ChromeDriver();

        myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        myDriver.get("https://es.wikipedia.org/wiki/Portada");

        List<WebElement> portada = myDriver.findElements(By.linkText("Portada"));
        System.out.println("Se encontraron " + portada.size() + " resultados");
        for (WebElement port : portada) {
            String text = port.getText();
            System.out.println(port.getText() + ": " + port.getAttribute("href"));
        }

        List<WebElement> pagina = myDriver.findElements(By.partialLinkText("Página"));
        System.out.println("Se encontraron: " + pagina.size() + " resultados");
        for (WebElement page : pagina) {
            String text = page.getText();
            System.out.println(text);
        }

        List<WebElement> buttons = myDriver.findElements(By.tagName("button"));
        System.out.println("Se encontraron: " + buttons.size() + " resultados");
        for (WebElement button : buttons) {
            String text = button.getText();
            System.out.println(text);
        }

        myDriver.close();

    }
}