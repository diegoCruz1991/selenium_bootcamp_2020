package Amazon;

import amazon.pages.AmazonMainPage;
import amazon.pages.AmazonResultsPage;
import ejemplos.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProducts extends BaseTest {

    @Test(description = "Search a product by Section")
    public void searchProductBySection() {

        AmazonMainPage.open(this.driver);
        AmazonMainPage mp = new AmazonMainPage(this.driver);
        Assert.assertTrue(mp.isLoaded(),"Amazon's Page never loaded");
        AmazonResultsPage amazonResultsPage = mp.searchProductsBySection("Videojuegos","Animal Crossing");
        amazonResultsPage.orderResultsBySortType("Precio: de más bajo a más alto");
        System.out.println(amazonResultsPage.getResultsInformation());
    }

}
