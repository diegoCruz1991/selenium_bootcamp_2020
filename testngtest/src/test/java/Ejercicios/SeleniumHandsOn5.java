package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn5 {
    public static void main(String[] args) throws InterruptedException {
        //Create new Instance of Chrome By WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Set PageLoadTime
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //***** TEST PROPERTIES *****
        // Target Page
        driver.get("https://facebook.com");
        //Print Current URL
        System.out.println(driver.getCurrentUrl());
        //Check if the page is correct
        assert driver.getCurrentUrl().equals("https://facebook.com") : "correct page";

        // ***** WEB ELEMENTS *****

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login_button = driver.findElement(By.id("loginbutton"));


        //Test Steps
        email.sendKeys("corre_falso@hotmail.com");
        password.sendKeys("NoTeVoyADarMiContraseña");
        login_button.click();

        Thread.sleep(6000);

        //Try to find the Element. If User and Password are invalid throws the exception
        try {
            WebElement search_bar = driver.findElement(By.name("q"));
            search_bar.sendKeys("QA Minds");
            search_bar.submit();
        }
        catch(Exception e) {
            System.out.println("El elemento no está disponible");
        }

        //Set a Wait time
        Thread.sleep(5000);

        //Close current Window
        driver.close();
    }
}
