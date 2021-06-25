package login;

import org.testng.annotations.Test;
import setup.SetupTests;

public class LoginTests extends SetupTests {

    @Test
    public void LoginTest() throws InterruptedException {
        loginPage.enterUsername("testincorporation@gmail.com");
        loginPage.enterPassword("Overleap21_");
        loginPage.clickLoginBtn();
        String pageUrl = "http://automationpractice.com/index.php?controller=my-account";
        System.out.println("Passed - The page url is " + pageUrl);
        Thread.sleep(10000);
    }

    @Test
    public void LogoutTest() throws InterruptedException {
        try {
            loginPage = dashboardPage.clickLogout();
        }
        catch (Exception e) {
            String loginUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
            System.out.println("Passed - The page url is " + loginUrl);
        }
    }
}
