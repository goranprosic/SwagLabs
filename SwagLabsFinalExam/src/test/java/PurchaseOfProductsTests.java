import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PurchaseOfProductsTests extends BaseTests{

    @Test
    public void successfulPurchaseOfProducts(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        MyCartPage myCartPage = new MyCartPage(driver);
        InfoPage infoPage = new InfoPage(driver);
        OverviewPage overviewPage = new OverviewPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productsPage.clickOnAddToCartButton();
        productsPage.clickOnMyCart();
        myCartPage.clickOnCheckoutButton();
        infoPage.enterFirstName("Goran");
        infoPage.enterLastName("Prosic");
        infoPage.enterPostalCode("123");
        infoPage.clickOnContinueButton();
        overviewPage.clickOnFinishButton();

        CompletePage completePage = new CompletePage(driver);
        Assertions.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!",completePage.readCompletePurchaseMessage() );



    }
}
