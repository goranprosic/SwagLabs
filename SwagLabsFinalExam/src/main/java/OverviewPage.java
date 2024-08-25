import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverviewPage extends BasePage{


    private static final String finishButtonCSSLocator = "[data-test='finish']";

    @FindBy(css = finishButtonCSSLocator)
    private WebElement finishButton;

    public void clickOnFinishButton(){
        finishButton.click();
    }

    public OverviewPage(WebDriver driver){
        super(driver);

        PageFactory.initElements(driver, this);
    }
}
