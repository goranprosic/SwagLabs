import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    public WebDriver driver;

    @BeforeAll
    public  static void beforeAllTestsSetup(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeEachTestsSetup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void loginTestsTearDown() {
//        driver.quit();
    }

}