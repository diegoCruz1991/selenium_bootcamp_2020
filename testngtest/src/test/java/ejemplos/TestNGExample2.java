package ejemplos;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGExample2 {

    @BeforeMethod
    public void test1() {
        System.out.println("Test 1");
        Assert.assertEquals("something", "something", "error");
    }

    @BeforeClass
    public void test2() {
        System.out.println("Test 2");
        Assert.assertEquals("something", "something", "error");
    }

    @Test(description = "Test 3", enabled = true,
            alwaysRun = true,
            groups = {"Example 3"})
    public void test3() {
        System.out.println("Test 3");
        Assert.assertEquals("something", "something", "error");
    }
}
