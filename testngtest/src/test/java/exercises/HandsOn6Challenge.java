package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class HandsOn6Challenge {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.inaturalist.org";
        String menuPlacesPath = "//div[@id = 'header-more-dropdown-toggle']";
        String placesPath = "//div[@id = 'header-more-dropdown-toggle']//following-sibling::ul//descendant::li[3]";
        String searchBoxPath = "//div[@id = 'searchform']//child::form//descendant::input[@id = 'q']";
        String colomosPath = "//a[contains (text (), 'Colomos')]";

        WebElement menuPlaces;
        WebElement places;
        WebElement searchBox;
        WebElement colomos;
        WebElement lifeStructure;


        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to(url);

        menuPlaces = driver.findElement(By.xpath(menuPlacesPath));
        menuPlaces.click();
        menuPlaces.click();
        places = driver.findElement(By.xpath(placesPath));
        places.click();

        searchBox = driver.findElement(By.xpath(searchBoxPath));
        searchBox.sendKeys("Colomos");
        searchBox.submit();

        colomos = driver.findElement(By.xpath(colomosPath));
        colomos.click();

        List<WebElement> lifeTable = driver.findElements(By.xpath("//div[@id = 'browsingtaxa']/child::ul/child::li/child::ul//descendant::a"));
        System.out.println("Total de Subcategorias: " + lifeTable.size());

        /*
        Codigo para probar una subcategoria a la vez

        WebElement prueba = driver.findElement(By.xpath("//div[@id = 'browsingtaxa']/child::ul/child::li/child::ul//descendant::a[5]"));
        prueba.click();
        creatureSelection(driver);

         */

        for (WebElement i : lifeTable) {
            Thread.sleep(2000);
            i.click();
            creatureSelection(driver);
        }

        driver.close();
    }

    public static void creatureSelection(WebDriver driver) throws InterruptedException {
        WebElement creatureSelected = null;
        WebElement creatureSelected2 = null;
        List<WebElement> numberOfCreatures;

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Thread.sleep(10000);

        String entries = driver.findElement(By.xpath("//div[@class = 'guide_taxa']")).getAttribute("data-total-entries");

        if (entries.equals("0")) {
            System.out.println("No hay animales en la lista seleccionada");
        } else {
            numberOfCreatures = driver.findElements(By.xpath("//div[@class = 'guide_taxa']//child::div[@class= 'listed_taxon inlineblock ajaxified']"));
            int totalCreatures = numberOfCreatures.size();
            System.out.println("Total de Animales en subcategoria: " + totalCreatures);

            int randomNum = ThreadLocalRandom.current().nextInt(1, totalCreatures + 1);

            try {
                creatureSelected = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][" + randomNum + "]//descendant::span[@class= 'comname ']"));
                System.out.println("Creatura seleccionada: " + creatureSelected.getText() + creatureSelected.getAttribute("href") + " -Numero en la lista : " + randomNum);
            } catch (Exception e){
            }

            try {
                creatureSelected2 = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][" + randomNum + "]//descendant::span[@class='sciname'])"));
                System.out.println("Creatura seleccionada: " + creatureSelected2.getText() + creatureSelected2.getAttribute("href") + " -Numero en la lista : " + randomNum);
            } catch (Exception e){
            }

//            if (driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified']" + randomNum + "]//descendant::span[@class= 'comname ']")).isDisplayed() == true) {
//                WebElement ceatureSelected = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][" + randomNum + "]//descendant::span[@class= 'comname ']"));
////                creatureSelected = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][8]//descendant::span[@class= 'comname ']"));
//                System.out.println("Creatura seleccionada: " + creatureSelected.getText() + creatureSelected.getAttribute("href") + " -Numero en la lista : " + randomNum);
//            } else {
//                WebElement creatureSelected2 = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][" + randomNum + "]//descendant::span[@class='sciname'])"));
////                WebElement creatureSelected2 = driver.findElement(By.xpath("//div[@class = 'guide_taxa']//child::div[@class = 'listed_taxon inlineblock ajaxified'][8]//descendant::span[@class='sciname']"));
//                System.out.println("Creatura seleccionada: " + creatureSelected2.getText() + creatureSelected2.getAttribute("href") + " -Numero en la lista : " + randomNum);
//            }
        }
    }
}
