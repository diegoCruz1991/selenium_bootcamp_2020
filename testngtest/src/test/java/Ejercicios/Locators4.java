package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class Locators4 {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://es.wikipedia.org/wiki/Portada");
        System.out.println(myDriver.getCurrentUrl());

        WebElement search = myDriver.findElement(By.linkText("Portada"));
        String href = search.getAttribute("href");
        System.out.println("Portada " + href);

        List<WebElement> links = myDriver.findElements(By.partialLinkText("Página"));
        for(int i=0;i<links.size();i++){
            String hr = links.get(i).getAttribute("href");
            System.out.println("href de Paginas  " + hr);
        }

        List<WebElement> search4 = myDriver.findElements(By.tagName("button"));
        for(int i=0;i<search4.size();i++){
            String hr1 = search4.get(i).getText();
            System.out.println("Button " + hr1);
        }


        myDriver.close();


    }
}
