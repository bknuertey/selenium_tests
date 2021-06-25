package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class SetupTests {

    private WebDriver driver;

    protected LoginPage loginPage;

    protected DashboardPage dashboardPage;

    @BeforeTest
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        loginPage = new LoginPage(driver);
    }

    @AfterTest
    public void exitBrowser() {
        driver.quit();
    }
}
