import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{


    private static final String usernameInputCSSLocator = "[data-test='username']";
    private static final String passwordInputCSSLocator = "[data-test='password']";
    private static final String loginButtonInputCSSLocator = "[data-test='login-button']";
    private static final String errorMessageCSSLocator = "[data-test='error']";


    @FindBy(css = usernameInputCSSLocator)
    private WebElement usernameInput;

    @FindBy(css = passwordInputCSSLocator)
    private WebElement passwordInput;

    @FindBy(css = loginButtonInputCSSLocator)
    private WebElement loginButton;

    @FindBy(css = errorMessageCSSLocator)
    private WebElement errorMessageLabel;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

        public void enterUsername(String username) {
        enterText(usernameInput, username);}

        public void enterPassword(String pass) {
        enterText(passwordInput, pass);}

        public void clickOnLoginButton() {
        click(loginButton);}

        public void waitForErrorMessageToContain(String errorMessage) {
        wait.until(ExpectedConditions.textToBePresentInElement(errorMessageLabel, errorMessage));
        }


        public String getErrorMessage() { return errorMessageLabel.getText();}




    }

