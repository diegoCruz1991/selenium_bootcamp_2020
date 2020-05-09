package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn11 {

    public static void main(String[] arg) throws InterruptedException{
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        WebDriver myDriver = new FirefoxDriver();
        myDriver.navigate().to("https://www.inaturalist.org");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(myDriver.getCurrentUrl());
        WebElement more = myDriver.findElement(By.cssSelector("li[class='navtab moretab menutab']"));
        more.click();
        WebElement places = myDriver.findElement(By.cssSelector("div>ul>li>a[href='/places']"));
        places.click();
        WebElement search = myDriver.findElement(By.cssSelector("input[id='q']"));
        search.sendKeys("Colomos, Guadalajara");
        WebElement go = myDriver.findElement(By.cssSelector("input[name='commit']"));
        go.click();

        WebElement spider = myDriver.findElement(By.cssSelector("a[class~='taxon_Arachnida']"));
        spider.click();
        Thread.sleep(2000);
        List<WebElement> spiders = myDriver.findElements(By.cssSelector("div[class='guide_taxa']>div"));
        System.out.println(spiders.size());
        int sel = (int) Math.floor(Math.random()*spiders.size());
        System.out.println("Seleccion: "+ sel);
        System.out.println(spiders.get(sel).findElement(By.cssSelector("span[class='comname ']")).getText());
        Thread.sleep(2000);

        WebElement insect = myDriver.findElement(By.cssSelector("a[class~='taxon_Insecta']"));
        insect.click();
        List<WebElement> insects = myDriver.findElements(By.cssSelector("div[class='guide_taxa']>div"));
        System.out.println(insects.size());
        int selinsect = (int) Math.floor(Math.random()*insects.size());
        System.out.println("Seleccion: "+ selinsect);
        System.out.println(insects.get(selinsect).findElement(By.cssSelector("span[class='comname ']")).getText());
        Thread.sleep(2000);

        WebElement fish = myDriver.findElement(By.cssSelector("a[class~='taxon_Actinopterygii']"));
        fish.click();
        List<WebElement> fishes = myDriver.findElements(By.cssSelector("div[class='guide_taxa']>div"));
        System.out.println(fishes.size());
        int selfish = (int) Math.floor(Math.random()*fishes.size());
        System.out.println("Seleccion: "+ selfish);
        System.out.println(fishes.get(selfish).findElement(By.cssSelector("span[class='comname ']")).getText());
        Thread.sleep(2000);

        WebElement amphibian = myDriver.findElement(By.cssSelector("a[class~='taxon_Amphibia']"));
        amphibian.click();
        List<WebElement> amphibians = myDriver.findElements(By.cssSelector("div[class='guide_taxa']>div"));
        System.out.println(amphibians.size());
        int selamphibian = (int) Math.floor(Math.random()*amphibians.size());
        System.out.println("Seleccion: "+ selamphibian);
        System.out.println(amphibians.get(selamphibian).findElement(By.cssSelector("span[class='comname ']")).getText());
        Thread.sleep(2000);

        WebElement bird = myDriver.findElement(By.cssSelector("a[class~='taxon_Aves']"));
        bird.click();
        List<WebElement> birds = myDriver.findElements(By.cssSelector("div[class='guide_taxa']>div"));
        System.out.println(birds.size());
        int selbird = (int) Math.floor(Math.random()*birds.size());
        System.out.println("Seleccion: "+ selbird);
        System.out.println(birds.get(selbird).findElement(By.cssSelector("span[class='comname ']")).getText());
        Thread.sleep(2000);

        WebElement mammal = myDriver.findElement(By.cssSelector("a[class~='taxon_Mammalia']"));
        mammal.click();
        List<WebElement> mammals = myDriver.findElements(By.cssSelector("div[class='guide_taxa']>div"));
        System.out.println(mammals.size());
        int selmammal = (int) Math.floor(Math.random()*mammals.size());
        System.out.println("Seleccion: "+ selmammal);
        System.out.println(mammals.get(selmammal).findElement(By.cssSelector("span[class='comname ']")).getText());
        Thread.sleep(2000);

        WebElement reptile = myDriver.findElement(By.cssSelector("a[class~='taxon_Reptilia']"));
        reptile.click();
        List<WebElement> reptiles = myDriver.findElements(By.cssSelector("div[class='guide_taxa']>div"));
        System.out.println(reptiles.size());
        int selreptile = (int) Math.floor(Math.random()*reptiles.size());
        System.out.println("Seleccion: "+ selreptile);
        System.out.println(reptiles.get(selreptile).findElement(By.cssSelector("span[class='comname ']")).getText());
        Thread.sleep(2000);

        /*
        WebElement search = myDriver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        Thread.sleep(10000);

        search.sendKeys("Nintendo Switch");
        search.submit();
        Thread.sleep(1000  );
        WebElement prime = myDriver.findElement(By.cssSelector("div[class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']")
        );
        prime.click();
        WebElement tresEstrellas = myDriver.findElement(By.cssSelector("i.a-star-medium-3"));
        tresEstrellas.click();
        Thread.sleep(4000  );
        WebElement cuatroEstrellas = myDriver.findElement(By.cssSelector("i.a-star-medium-4"));
        cuatroEstrellas.click();
        Thread.sleep(4000  );
        WebElement  bara = myDriver.findElement(By.cssSelector("select#s-result-sort-select"));*/

        Thread.sleep(10000  );


        myDriver.close();
    }
}
