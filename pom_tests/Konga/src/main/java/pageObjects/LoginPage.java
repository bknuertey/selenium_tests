package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage
{

    public LoginPage(WebDriver driver) {this.driver = driver;}

    private WebDriver driver;

    public void enterUsername(String email)
    {
        //wait for 20 seconds
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //enter username
        driver.findElement(By.id("username")).sendKeys(email);
    }

    public void enterPassword(String pwd)
    {
        //enter password
        driver.findElement(By.id("password")).sendKeys(pwd);
    }

    public HomePage clickLoginBtn()
    {
        //click on login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/div/div/div[1]/form/div[3]/button")).click();

        //go to homepage
        return new HomePage(driver);
    }
}
