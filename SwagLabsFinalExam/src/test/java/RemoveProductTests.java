import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveProductTests extends BaseTests {


    @Test
        public void successfulRemoveProduct() {
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
            myCartPage.clickOnRemoveProduct();



            Assertions.assertFalse(driver.getPageSource().contains("Sauce Labs Bike Light"));
        }
    }
