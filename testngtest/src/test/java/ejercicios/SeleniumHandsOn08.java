package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn08 {
    public static  void main (String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.inaturalist.org");

        driver.findElement(By.xpath("//*[@id='mainnav']/li[3]/div")).click();
        Thread.sleep(3000);
        List<WebElement> dropList = driver.findElements(By.xpath("//*[@id='mainnav']/li[3]/div/ul/li[3]/a"));
            for (WebElement webElement:dropList){
                if(webElement.getText().trim().equals("Lugares")){
                    webElement.click();
                    break;
                }

            }
            //Pagina Places
            WebElement searchPlace = driver.findElement(By.xpath("//*[@id='q']"));
            searchPlace.sendKeys("Colomos, Guadalajara");
            searchPlace.click();
            driver.findElement(By.name("commit")).submit();


            //Pagina de la Fauna Seleccionar a los Animalitos de la Creacion e Imprimirlo

        List<WebElement> allCat = driver.findElements(By.xpath("//*[@id='browsingtaxa']/ul/li/a"));

        for (WebElement a : allCat) {
            a.click();
            System.out.println("Categorias de Animales: " + a.getText());


            try {
                WebElement categoryElement = driver.findElement(By.xpath("//*[contains(@class,'name comname')]"));
                System.out.println("Animal: " + categoryElement.getText() + " ");
            } catch (Exception e) {
                System.out.println("No hay Animales que mostrar");

            }

        }

    driver.quit();

    }


}
