package Ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumExcersice2 {
    public static void main(String[] args) throws InterruptedException {
        File firefoxFilePath = new File("src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        WebDriver myDriver = new FirefoxDriver();

        myDriver.navigate().to("http://www.google.com");
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(3000);

        myDriver.navigate().to("https://www.amazon.com.mx/?&tag=hydramzkw0mx-20&ref=pd_sl_7l5x99tvs0_e&adgrpid=58066742059&hvpone=&hvptwo=&hvadid=286731194113&hvpos=&hvnetw=g&hvrand=175180202345616389&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1010041&hvtargid=kwd-10573980&hydadcr=13958_10154615&gclid=EAIaIQobChMIp9_Wqv6J6QIVdT6tBh2-CwUqEAAYASAAEgJtrfD_BwE");
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(3000);

        myDriver.navigate().to("https://twitter.com/?lang=es");
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(3000);

        myDriver.navigate().back();
        Thread.sleep(2000);
        myDriver.navigate().back();
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(3000);

        myDriver.navigate().forward();
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(3000);

        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());
        Thread.sleep(3000);

        myDriver.close();
    }

    }
