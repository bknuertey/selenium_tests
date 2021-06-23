package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public LoginPage(WebDriver driver) {this.driver = driver;}

    private WebDriver driver;

    public void enterUsername (String uName) {

        driver.findElement(By.id("username")).sendKeys(uName);
    }

    public void enterUserPassword (String pwd) {

        driver.findElement(By.id("password")).sendKeys(pwd);
    }

    public DashboardPage clickLoginBtn() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        return new DashboardPage (driver);
    }
}
