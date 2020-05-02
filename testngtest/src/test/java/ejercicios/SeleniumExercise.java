package ejercicios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExercise {

    public static void main(String[] args) throws InterruptedException {

        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");

        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        WebDriver fireFox = new FirefoxDriver();

        fireFox.get("https://www.google.com.mx");

        System.out.println(fireFox.getTitle());
        System.out.println(fireFox.getCurrentUrl());
        System.out.println(fireFox.getPageSource());

        Thread.sleep(2000);

        fireFox.close();
    }
}
