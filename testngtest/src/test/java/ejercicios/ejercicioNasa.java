package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;

public class ejercicioNasa {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.nasa.gov/");
        System.out.println("Missions: "+driver.findElement(By.partialLinkText("Missions")).getAttribute("href"));
        System.out.println("Missions: "+driver.findElement(By.partialLinkText("Missions")).getAttribute("href"));
        System.out.println("Missions: "+driver.findElement(By.partialLinkText("Missions")).getAttribute("href"));
        System.out.println("Missions: "+driver.findElement(By.partialLinkText("Missions")).getAttribute("href"));
    }
}
