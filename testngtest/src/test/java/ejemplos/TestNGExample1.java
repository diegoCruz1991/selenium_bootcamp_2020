package ejemplos;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExample1 {

    @Test(description = "Este test case verifica si Test es igual a Test", expectedExceptions = {java.lang.Exception.class})
    public static void passTC() throws Exception {
        Assert.assertEquals("Test", "Test", "No son iguales");
        throw new Exception("Falle :("); //Lanzo la excepcion porque este test case esta esperando una excepcion de tipo Exception
    }

    @Test(groups = {"regression", "login"}, enabled = false, invocationCount = 1)
    public static void failTC() {
        Assert.assertEquals("Test", "Fail", "No son iguales");
    }

    @Test(groups = {"regression"})
    public static void thirdTC() {

    }
}
