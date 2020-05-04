package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn5 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://www.facebook.com");
        WebElement emailbox = driver.findElement(By.id("email"));
        WebElement passfield = driver.findElement(By.id("pass"));
        WebElement loginbu = driver.findElement(By.id("loginbutton"));
        emailbox.sendKeys("hitomi_fanel06@hotmail.com");
        passfield.sendKeys("Rez");
        loginbu.click();
        Thread.sleep(1000);

        //Buscar QA Minds
        WebElement searchElem = driver.findElement(By.xpath("//*[@id=\"u_r_2\"]/input[2]"));
        searchElem.sendKeys("QA Minds");
        searchElem.submit();
        loginbu.submit();
        Thread.sleep(1000);
        driver.close();




    }
}
