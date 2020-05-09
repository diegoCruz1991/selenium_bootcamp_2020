package ejercicios;

import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class animalesCategorias {

    public static void main (String[] args){
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.inaturalist.org/places");

        //Seleccionar Animales de las Categorias
    



    }


}
