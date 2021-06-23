package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {this.driver = driver;}

    private WebDriver driver;

    private By welcome = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button");
    private By logOut = By.linkText("Log Out");

    public void clickwelcome() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(welcome).click();
    }

    public LoginPage clicklogOut() throws InterruptedException{

        Thread.sleep(5000);
        driver.findElement(logOut).click();
        return new LoginPage(driver);
    }
}
