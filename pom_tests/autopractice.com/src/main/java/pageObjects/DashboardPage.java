package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {this.driver = driver;}

    private WebDriver driver;

    private By Logout = By.linkText("Sign Out");

    public LoginPage clickLogout() throws InterruptedException{

        Thread.sleep(20000);
        driver.findElement(Logout).click();
        return new LoginPage(driver);
    }
}
