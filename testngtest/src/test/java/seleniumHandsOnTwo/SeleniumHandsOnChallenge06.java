package seleniumHandsOnTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOnChallenge06 {

    @Test(description = "test1", enabled = true, groups = {"test1"})
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.inaturalist.org");

        WebElement menu = driver.findElement(By.xpath("//div[@id = 'header-more-dropdown-toggle']"));
        menu.click();
        menu.click();
        WebElement places = driver.findElement(By.xpath("//div[@id = 'header-more-dropdown-toggle']//following-sibling::ul//descendant::li[3]"));
        places.click();

        WebElement searchBox = driver.findElement(By.xpath("//div[@id = 'searchform']//child::form//descendant::input[@id = 'q']"));
        searchBox.sendKeys("Colomos");
        searchBox.submit();

        WebElement colomos = driver.findElement(By.xpath("//a[contains (text (), 'Colomos')]"));
        colomos.click();

        List<WebElement> lifeTable = driver.findElements(By.xpath("//div[@id = 'browsingtaxa']/child::ul/child::li/child::ul//descendant::a"));

        for (WebElement i : lifeTable) {
            System.out.println( i.getText());
            i.click();


            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            Thread.sleep(5000);

            String entries = driver.findElement(By.xpath("//div[@class = 'guide_taxa']")).getAttribute("data-total-entries");

            if (entries.equals("0")) {
                System.out.println("Nada");
            } else {
                List<WebElement> numberOfCreatures = driver.findElements(By.xpath("//div[@class = 'guide_taxa']//child::div[@class= 'listed_taxon inlineblock ajaxified']"));
                int totalCreatures = numberOfCreatures.size();

                int randomNum = ThreadLocalRandom.current().nextInt(1, totalCreatures + 1);

                try {
                    WebElement creatureSelected = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][" + randomNum + "]//descendant::span[@class= 'comname ']"));
                    System.out.println("        Match " + creatureSelected.getText() + creatureSelected.getAttribute("href") + randomNum);
                } catch (Exception e){
                }

                try {
                    WebElement creatureSelected2 = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][" + randomNum + "]//descendant::span[@class='sciname'])"));
                    System.out.println("     Match" + creatureSelected2.getText() + creatureSelected2.getAttribute("href") + randomNum);
                } catch (Exception e){
                }

            }
        }

        driver.close();
    }

}
