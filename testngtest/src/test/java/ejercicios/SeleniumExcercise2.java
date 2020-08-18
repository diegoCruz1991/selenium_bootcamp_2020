package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class SeleniumExcercise2 {

    public static void main(String... args) throws InterruptedException {
        //Inicializar el driver de chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(1000);

        driver.navigate().to("https://store.steampowered.com/?l=spanish");

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.navigate().to("https://www.espn.com.mx");

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.navigate().back();

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.navigate().back();

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.navigate().forward();

        assert driver.getCurrentUrl().equals("https://store.steampowered.com/?l=spanish"): "La pagina no es de Steam";

        Thread.sleep(2000);

        driver.navigate().refresh();

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(1000);

        //Abrir google

        //Imprimir el titulo de la  pagina

        //Imprimir el source code de la pagina

        //assert driver.getCurrentUrl().equals("https//www.google.com/"): "La pagina mostrada no es la esperada"

        driver.close();

        driver.quit();
    }
}
