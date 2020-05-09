package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class animalesCategorias {

    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.inaturalist.org/places/colomos#/places/colomos=");

        //Seleccionar Animales de las Categorias

        List<WebElement> allCat = driver.findElements(By.xpath("//*[@id='browsingtaxa']"));

        for (WebElement a : allCat) {
            a.click();
            System.out.println("Categorias de Animales: " + a.getText());


            try {
                WebElement categoryElement = driver.findElement(By.xpath("//a[@class='name comname']"));
                System.out.println("Animal: " + categoryElement.getText() + "\n");
            }

            catch (Exception e) {
                System.out.println("No hay Animales que mostrar\n");
                break;
            }
        }



    }


}
