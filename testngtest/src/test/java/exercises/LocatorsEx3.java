package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsEx3 {

    public static void main(String[] args) {

        String nasaURL = "https://www.nasa.gov/";

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(nasaURL);

        WebElement mission = driver.findElement(By.linkText("Missions"));
        String missionHref = mission.getAttribute("href");
        System.out.println("Atributo mission: " + missionHref);

        WebElement nasaTV = driver.findElement(By.linkText("NASA TV"));
        String nasaTVHref = nasaTV.getAttribute("href");
        System.out.println("Atributo nasa TV: " + nasaTVHref);

        WebElement mars = driver.findElement(By.partialLinkText("Mars"));
        String marsHref = nasaTV.getAttribute("href");
        System.out.println("Atributo nasa Mars: " + marsHref);

        List<WebElement> input = driver.findElements(By.tagName("input"));
        int size = input.size();
        System.out.println("Total size of input: " + size);
    }
}
