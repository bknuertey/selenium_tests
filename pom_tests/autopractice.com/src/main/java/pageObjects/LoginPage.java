package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public LoginPage(WebDriver driver) {this.driver = driver;}

    private WebDriver driver;

    public void enterUsername (String uName) {

        driver.findElement(By.id("email")).sendKeys(uName);
    }

    public void enterPassword (String pwd) {

        driver.findElement(By.id("passwd")).sendKeys(pwd);
    }

    public DashboardPage clickLoginBtn() {

        driver.findElement(By.id("SubmitLogin")).click();
        return new DashboardPage(driver);
    }
}
