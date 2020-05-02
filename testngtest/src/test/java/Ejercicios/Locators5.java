package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Locators5 {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("C:\\Users\\josec\\Desktop\\bootCampGit\\selenium_bootcamp_2020-master\\selenium_bootcamp_2020-master\\testngtest\\src\\test\\resources\\drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.amazon.com.mx/");
        System.out.println(myDriver.getCurrentUrl());

        WebElement dropDown = myDriver.findElement(By.id("searchDropdownBox"));
        Select dropDownSelect = new Select(dropDown);
        for(WebElement options:dropDownSelect.getOptions()){
            System.out.println(options.getText());
        }
        System.out.println("Es Multiple   " + dropDownSelect.isMultiple());
        System.out.println("Primer Valor " + dropDownSelect.getFirstSelectedOption().getText());
        dropDownSelect.selectByIndex(0);
        dropDownSelect.selectByValue("search-alias=automotive");










        myDriver.close();


    }
}
