package ejemplos;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample2 {

    @Test(description = "Test 1", enabled = true, groups = {"Example 2"})
    @BeforeMethod
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(description = "Test 2", enabled = true, groups = {"brokerTests"})
    @BeforeTest
    public void test2() {
        System.out.println("Test 2");
        Assert.assertEquals("something", "otherthing", "error");
    }

    @Test(description = "Test 3", enabled = true,
            alwaysRun = true, dependsOnMethods = {"test2"},
            groups = {"Example 3"})
    public void test3() {
        System.out.println("Test 3");
    }
}
