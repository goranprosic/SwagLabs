import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class FooterTest extends BaseTests {


@Test
    public void twitterLinkTest() {
    LoginPage loginPage = new LoginPage(driver);
    ProductsPage productsPage = new ProductsPage(driver);


    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();

//    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-test=social-twitter]")));
//    Assertions.assertTrue(driver.getPageSource().contains("https://x.com/saucelabs"));

    productsPage.clickOnTwitterButton();

    String originalWindow = driver.getWindowHandle();

    Set<String> allWindows = driver.getWindowHandles();
    for (String windowHandle : allWindows) {
        if (!windowHandle.equals(originalWindow)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }
    String currentUrl = driver.getCurrentUrl();
    Assertions.assertTrue(currentUrl.contains("x.com/saucelabs"), "The URL contain 'x.com/saucelabs'");
    driver.switchTo().window(originalWindow);
}

@Test
    public void facebookLinkTest(){
    LoginPage loginPage = new LoginPage(driver);
    ProductsPage productsPage= new ProductsPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();

//    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-test=social-facebook]")));
//    productsPage.clickOnFacebookButton();

    productsPage.clickOnFacebookButton();

    String originalWindow = driver.getWindowHandle();

    Set<String> allWindows = driver.getWindowHandles();
    for (String windowHandle : allWindows) {
        if (!windowHandle.equals(originalWindow)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }
    String currentUrl = driver.getCurrentUrl();
    Assertions.assertTrue(currentUrl.contains("https://www.facebook.com/saucelabs"), "The URL contain 'https://www.facebook.com/saucelabs'");
    driver.switchTo().window(originalWindow);
    }

@Test
    public void linkedInLinkTest(){
    LoginPage loginPage = new LoginPage(driver);
    ProductsPage productsPage= new ProductsPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();

//    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-test='social-linkedin']")));
//    productsPage.clickOnLinkedInButton();

    productsPage.clickOnLinkedInButton();

    String originalWindow = driver.getWindowHandle();

    Set<String> allWindows = driver.getWindowHandles();
    for (String windowHandle : allWindows) {
        if (!windowHandle.equals(originalWindow)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }
    String currentUrl = driver.getCurrentUrl();
    Assertions.assertTrue(currentUrl.contains("https://www.linkedin.com/company/sauce-labs/"), "The URL contain 'https://www.linkedin.com/company/sauce-labs/'");
    driver.switchTo().window(originalWindow);

}

}
