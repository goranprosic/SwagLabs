import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage{



    private static final String addToCartButtonCSSLocator = "#add-to-cart-sauce-labs-backpack";
    private static final String myCartCSSLocator = "[data-test=shopping-cart-link]";
    private static final String twitterLinkCSSLocator = "[data-test=social-twitter]";
    private static final String facebookLinkCSSLocator = "[data-test=social-facebook]";
    private static final String linkedInLinkCSSLocator = "[data-test='social-linkedin']";
    private static final String RemoveProductsCSSLocator = "[remove-sauce-labs-backpack]";


    @FindBy(css = addToCartButtonCSSLocator)
    private WebElement addToCartButton;

    @FindBy(css = myCartCSSLocator)
    private WebElement myCart;

    @FindBy(css = twitterLinkCSSLocator)
    private WebElement twitterButton;

    @FindBy(css = facebookLinkCSSLocator)
    private WebElement facebookButton;

    @FindBy(css = linkedInLinkCSSLocator)
    private WebElement linkedInButton;

    @FindBy(css = RemoveProductsCSSLocator)
    private WebElement RemoveProductButton;



    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddToCartButton() {
        click(addToCartButton);}

    public void clickOnMyCart() {
        click(myCart);}

    public void clickOnTwitterButton(){
        click(twitterButton);}

    public void clickOnFacebookButton(){
        click(facebookButton);}

    public void clickOnLinkedInButton(){
        click(linkedInButton);}

    public void clickOnRemoveProductButton(){
        click(RemoveProductButton);
    }



    }






