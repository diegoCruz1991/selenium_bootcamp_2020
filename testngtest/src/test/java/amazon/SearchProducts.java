package amazon;

import amazon.pages.AmazonMainPage;
import amazon.pages.AmazonResultsPage;
import ejemplos.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProducts extends BaseTest {

    @Test(description = "Buscar un producto en amazon")
    public void searchProduct() {
        AmazonMainPage.open(this.myDriver);

        AmazonMainPage mainPage = new AmazonMainPage(this.myDriver);

        Assert.assertTrue(mainPage.isLoaded(), "La pagina de Amazon no funciona");

        AmazonResultsPage amazonResultsPage = mainPage.searchProductsBySection("Animal Crossing", "Videojuegos");

        amazonResultsPage.orderResultsBySortType("Precio: de más bajo a más alto");

        System.out.println(amazonResultsPage.obtainResultsInformation());
    }
}
