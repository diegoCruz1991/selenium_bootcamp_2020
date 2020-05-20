package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn3 {


    public static void main (String[] args) throws  InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("Chrome");
        myDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Entra a amazon
        myDriver.navigate().to("https://www.inaturalist.org");

        //Entrar a  Lugares
        WebElement menu=myDriver.findElement(By.xpath("//div[@id='header-more-dropdown-toggle']"));
        menu.click();
        List<WebElement> opciones=myDriver.findElements(By.cssSelector("li[class='navtab moretab menutab'] li a"));
        myDriver.navigate().to(opciones.get(2).getAttribute("href"));

        //Teclear Colomos, Guadalajara
        WebElement search=myDriver.findElement(By.cssSelector("div[id='searchform'] input[id='q']"));
        search.sendKeys("Colomos, Guadalajara");

        //Buscar
        WebElement buttonSearch=myDriver.findElement(By.cssSelector("div[id='searchform'] input[class='last default button']"));
        buttonSearch.click();

        // Busca todas las ligas
        List<WebElement> menuAnimales=myDriver.findElements(By.cssSelector("ul[class='taxon_links']  li a"));

        String link;
        List<String> repetidos = new ArrayList<String>();

        for (WebElement x:menuAnimales) {

            link=x.getAttribute("href");
            System.out.println("Opción: "+x.getText()+" Página: "+link);
            myDriver.navigate().to(link);

            List<WebElement> seresVivos=myDriver.findElements(By.cssSelector("div[class='info'] span[class='sciname']"));

            //System.out.println(seresVivos.get(0).getText());
            int i=0;
            if(repetidos.isEmpty()){
                repetidos.add(seresVivos.get(i).getText());
                System.out.println(seresVivos.get(i).getText());
            } else {
                for (int j = 0; j < repetidos.size() ; j++) {
                    if(repetidos.get(j).equals(seresVivos.get(i).getText())){
                        i++;
                    }
                }
                repetidos.add(seresVivos.get(i).getText());
                System.out.println(seresVivos.get(i).getText());
                // Falta ver cuando no hay elementos a comparar
                // Cuando ya todos están en repetidos
            }
        }

        //System.out.println(repetidos);

        //Espera 10 segundos
        Thread.sleep(1000);

        myDriver.close();
    }
}
