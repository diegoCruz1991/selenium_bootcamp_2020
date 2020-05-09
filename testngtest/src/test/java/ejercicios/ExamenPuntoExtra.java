package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;

public class ExamenPuntoExtra {


    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://es.wikipedia.org/wiki/Star_Wars");
        Thread.sleep(10000);
        System.out.println(myDriver.getCurrentUrl());
        Integer anim=0;
        Integer película;
        Integer George;
        Integer Jedi;
        Integer Luke;


        /*List<WebElement> animacion =  myDriver.findElements(By.("animación"));
        for (int i = 0; i < animacion.size(); i++) {
            anim=anim+1;
        }
        System.out.println("La palabra animacion se repite: "+anim);*/
        Thread.sleep(10000  );

        myDriver.close();
    }
}
