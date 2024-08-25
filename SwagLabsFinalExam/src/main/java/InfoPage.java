import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfoPage extends BasePage{


    private static final String inputFirstNameCSSLocator = "[data-test='firstName']";
    private static final String inputLastNameCSSLocator = "[data-test='lastName']";
    private static final String inputPostalCodeCSSLocator = "[data-test='postalCode']";
    private static final String inputContinueButtonCSSLocator = "[data-test='continue']";


    @FindBy(css = inputFirstNameCSSLocator)
    private WebElement inputFirstName;

    public void enterFirstName(String name){
       enterText(inputFirstName,name);
    }

    @FindBy(css = inputLastNameCSSLocator)
    private WebElement inputLastName;

    public void enterLastName(String lastname){
        enterText(inputLastName,lastname);
    }

    @FindBy(css = inputPostalCodeCSSLocator)
    private WebElement inputPostalCode;

    public void enterPostalCode(String zip){
        enterText(inputPostalCode,zip);
    }

    @FindBy(css = inputContinueButtonCSSLocator)
    private WebElement continueButton;

    public void clickOnContinueButton(){
        continueButton.click();
    }

    public InfoPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
