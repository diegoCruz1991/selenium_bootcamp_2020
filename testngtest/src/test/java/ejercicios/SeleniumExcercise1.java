package ejercicios;

import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class SeleniumExcercise1 {

    public static void main(String... args) throws InterruptedException {
        //Inicializar el driver de chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        Thread.sleep(1000);

        driver.navigate().to("https://store.steampowered.com/?l=spanish");

        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        Thread.sleep(1000);

        //Abrir google

        //Imprimir el titulo de la  pagina

        //Imprimir el source code de la pagina

        //assert driver.getCurrentUrl().equals("https//www.google.com/"): "La pagina mostrada no es la esperada"

        driver.close();

        driver.quit();
    }
}
