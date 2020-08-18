package ejercicios;

import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class MyFirstSeleniumApproach {

    public static void main(String... args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("firefox");

        //abrir pagina de steam https://store.steampowered.com/

        driver.get("https://store.steampowered.com/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        Thread.sleep(2000);

        driver.close();//Cerrar navegador

        driver.quit();//Cerrar sesion de selenium webdriver

    }
}
