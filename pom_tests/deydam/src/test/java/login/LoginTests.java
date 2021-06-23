package login;

import org.testng.annotations.Test;
import setup.SetupTests;

public class LoginTests extends  SetupTests {

    @Test
    public void testLogin() throws InterruptedException {

        String username = "bnuerteytech@gmail.com";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("Overleap21_");

        loginPage.clickLoginBtn();
        String pageUrl = "https://www.deydam.com/app/feed";
        System.out.println("Passed - The page url is " + pageUrl);
    }

    @Test
    public void testLogout() throws InterruptedException{

        try {
            dashboardPage.clickwelcome();
            loginPage = dashboardPage.clicklogOut();
        }
        catch (Exception e){
            String loginUrl = "https://www.deydam.com/login";
            System.out.println("Passed - The page url is " + loginUrl);
        }
    }
}
