import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCartPage extends BasePage{


    private static final String checkoutButtonCSSLocator = "[data-test=checkout]";
    public static final String removeProductCSSLocator = "[data-test='remove-sauce-labs-backpack']";

    @FindBy(css = checkoutButtonCSSLocator)
    private WebElement checkoutButton;

    public void clickOnCheckoutButton(){
        click(checkoutButton);
    }

    public MyCartPage(WebDriver driver){
        super(driver);

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = removeProductCSSLocator)
    private WebElement removeProductsButton;

    public void clickOnRemoveProduct(){
        click(removeProductsButton);
    }


}
