package amazon;

import ejemplos.BaseTest;
import amazon.pages.AmazonMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProducts extends BaseTest {

    @Test(description = "Buscar un producto en amazon")
    public void searchProduct() {
        AmazonMainPage.open(this.myDriver);

        AmazonMainPage mainPage = new AmazonMainPage(this.myDriver);

        Assert.assertTrue(mainPage.isLoaded(), "La pagina de Amazon no funciona");

        mainPage.searchProductsBySection("Animal Crossing", "Videojuegos");
    }
}
