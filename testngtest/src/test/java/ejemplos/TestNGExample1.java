package ejemplos;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExample1 {

    @Test(priority = 1)
    public static void passTC() {

        Assert.assertEquals("Test", "Test");
    }

    @Test(priority = 0)
    public static void failTC() {
        Assert.assertEquals("Test", "Fail");
    }
}
