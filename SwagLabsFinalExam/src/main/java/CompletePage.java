import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage extends BasePage{

    private static final String completedPurchaseMessageCSSLocator = "[data-test='complete-text']";

    @FindBy(css = completedPurchaseMessageCSSLocator)
    private WebElement completedPurchaseMessage;

    public String readCompletePurchaseMessage(){
       return completedPurchaseMessage.getText();


    }

    public CompletePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


}
