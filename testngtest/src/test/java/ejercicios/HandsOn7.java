package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;

public class HandsOn7 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://es.wikipedia.org/wiki/Portada");
        WebElement portada = myDriver.findElement(By.linkText("Portada"));
        System.out.println(portada.getAttribute("href"));
        List<WebElement> paginas = myDriver.findElements(By.partialLinkText("Página"));
        System.out.println(paginas);
        for (int i = 0; i <paginas.size() ; i++) {
            System.out.println(paginas.get(i).getText());
            System.out.println(paginas.get(i).getAttribute("href"));
        }
        List<WebElement> botones = myDriver.findElements(By.tagName("button"));
        for (int i = 0; i <botones.size() ; i++) {
            System.out.println(botones.get(i).getText());
        }

        myDriver.close();
    }
}

