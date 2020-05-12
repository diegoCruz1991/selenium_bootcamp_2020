package amazon;

import amazon.pages.AmazonMainPage;
import ejemplos.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProducts extends BaseTest {

    @Test(description = "Buscar un producto en amazon")
    public void searchProduct() {
        AmazonMainPage mainPage = new AmazonMainPage(this.myDriver);

        mainPage.open();

        Assert.assertTrue(mainPage.isLoaded(), "La pagina de Amazon no funciona");

        mainPage.searchProductsBySection("Animal Crossing", "Videojuegos");
    }
}
