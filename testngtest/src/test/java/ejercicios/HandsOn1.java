package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn1 {
    public static void main (String[] args) throws  InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Entra a amazon
        myDriver.navigate().to("https://www.amazon.com.mx/");

        //Hace la búsqueda de Nintendo Switch
        WebElement searchElement=myDriver.findElement(By.id("twotabsearchtextbox"));
        searchElement.sendKeys("Nintendo Switch");
        searchElement.submit();

        // CLick en Amazon prime
        WebElement amazonPrimeSelect=myDriver.findElement(By.xpath("//div[contains(@class, 'a-checkbox') and following-sibling::i]//i"));
        amazonPrimeSelect.click();

        WebElement estrellitas3=myDriver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-3']"));
        estrellitas3.click();

        WebElement estrellitas4=myDriver.findElement(By.cssSelector("i[class='a-icon a-icon-star-medium a-star-medium-4']"));
        estrellitas4.click();

        WebElement menu=myDriver.findElement(By.xpath("//*[@id='a-autoid-0-announce']"));
        menu.click();
        WebElement opcion=myDriver.findElement(By.xpath("//li[@class='a-dropdown-item']/a[@id='s-result-sort-select_1']"));
        opcion.click();

        List<WebElement> resultados = myDriver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
            //a-size-base-plus a-color-base a-text-normal
            //a-size-medium a-color-base a-text-normal
        if (resultados.size()>0) {
            System.out.println(resultados.get(0).getText());
        }else{
            System.out.println("No se trajo la lista de resultados");
        }

        //Espera 5 segundos
        Thread.sleep(500);

        myDriver.close();
    }
}
