package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorExercise4 {
    public static void main(String[] args) throws InterruptedException {

        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // ***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://es.wikipedia.org/wiki/Portada");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Portada") : "correct page";

        // ***** WEB ELEMENTS *****
        WebElement link_portada;
        List<WebElement> links_pagina;
        List<WebElement> links_button;

        // ***** TEST STEPS *****

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        link_portada = driver.findElement(By.linkText("Portada"));
        System.out.println(link_portada.getAttribute("href"));

        links_pagina = driver.findElements(By.partialLinkText("Página"));
        System.out.println("Tamaño lista Links: "+links_pagina.size());

        for (WebElement elements:links_pagina){
            System.out.println(elements.getAttribute("href"));
        }

        links_button = driver.findElements(By.tagName("button"));
        System.out.println("Tamaño lista Botones: "+links_button.size());

        for (WebElement elements:links_button) {
            System.out.println(elements.getAttribute("title"));
        }


        //Set a Wait time
        Thread.sleep(5000);

        //Close current Window
        driver.close();
    }
}
